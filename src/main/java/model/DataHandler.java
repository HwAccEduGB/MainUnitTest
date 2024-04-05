package model;

public class DataHandler {
    private static String trouble;
    private static String[] baseArr;
    private static String[] resultArr;

    public static String[] getResultArr() {
        return resultArr;
    }

    public static String getTrouble() {
        return trouble;
    }

    public static boolean handlerString(String str){
        if (!str.isEmpty()){
            baseArr = str.split(" ");
        }else {
            trouble = "не введено никаких данных";
            return false;
        }
        return handlerArr(baseArr);
    }

    private static boolean handlerArr(String[] baseArr){
        resultArr = new String[baseArr.length];
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
