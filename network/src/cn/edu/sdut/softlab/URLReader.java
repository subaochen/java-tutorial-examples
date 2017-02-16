package cn.edu.sdut.softlab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by subaochen on 17-2-16.
 */
public class URLReader {
    public static void main(String[] args) throws Exception {

        URL baidu = new URL("http://www.baidu.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(baidu.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
