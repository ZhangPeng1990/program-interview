package top.content.string;

import java.io.*;

/**
 * 字符串
 * 写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数
 */
public class CountStrInFile {

    public static int counntStrInFile(File file, String targetStr) {
        int counter = 0;
        FileReader reader = null;
        BufferedReader br = null;
        String line = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            while (br != null && (line = br.readLine()) != null) {
                int index = -1;
                while (line.length() >= targetStr.length() && (index = line.indexOf(targetStr)) >= 0) {
                    counter ++;
                    line = line.substring(index + targetStr.length());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return 0;
    }
}
