package model;

import java.util.Arrays;

public class DataHandler {
    private static String trouble;
    private static String[] resultArr;

    public static String[] getResultArr() {
        return resultArr;
    }

    public static String getTrouble() {
        return trouble;
    }

    public static boolean handlerString(String str){
        String[] baseArr;
        if (!str.isEmpty()){
            String resultString = str.replaceAll("\\s+", " ");
            baseArr = resultString.split(" ");
        }else {
            trouble = "не введено никаких данных";
            return false;
        }
        return handlerArr(baseArr);

    }

    private static boolean handlerArr(String[] baseArr){
        int resultArrLength = 0;
        for (int i = 0; i < baseArr.length; i++) {
            if (baseArr[i].length() <= 3) {
                resultArrLength++;
            }
        }
        resultArr = new String[resultArrLength];
        int j = 0;
        for (int i = 0; i < baseArr.length; i++) {
            if (baseArr[i].length() <= 3){
                resultArr[j] = baseArr[i];
                j++;
            }
        }
        return true;
     }
}
