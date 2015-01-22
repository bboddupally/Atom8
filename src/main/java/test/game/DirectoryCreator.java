
package test.game;
import java.io.File;
import java.text.SimpleDateFormat;

import java.util.Date;

public class DirectoryCreator {
    public static String createDirectories(String directory, Date argDate) {
        String newDir = null;

        if (directory != null && argDate != null) {
            try {
                String format = "dd-MM-yyyy";
                String date = new SimpleDateFormat(format).format(argDate);
                
                if(!new File(directory).exists()){
                	new File(directory).mkdir();
                }
                File files[] = new File(directory).listFiles();
                String dir = null;
                int dirLength = directory.length();
                int checkingLength = dirLength + format.length() + 3;

                int temp = 0;

                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        dir = files[i].toString();
                        if (dir.length() == checkingLength) {
                            String existingdir = dir.substring(dirLength, dirLength + 10);

                            if (date.equalsIgnoreCase(existingdir)) {
                                int dirNum =Integer.parseInt(dir.substring(dirLength + 11, dirLength + 10 + 3));

                                if (dirNum > temp) {
                                    temp = dirNum;
                                }
                            }
                        }
                    }
                }

                String seqNum = "" + (temp + 1);
                if (seqNum.length() == 1) {
                    seqNum = "0" + seqNum;
                }

                newDir = directory + date + "-" + seqNum;
                new File(newDir).mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return newDir;
    }


   
}
