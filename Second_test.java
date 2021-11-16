public class Second_test
{
    public static void main(String[] args)
    {
        String str;
        str= "人易科技:上 機 測 驗 - 演算法";
        //System.out.printf("outStr:%s\n",str);
        String outStr = "";
        char[] chars = str.toCharArray();

        int tranTemp = 0;

        for(int i = 0; i < chars.length; i++){

            tranTemp = (int)chars[i];

            if(tranTemp == 58) //ASCII碼:45 是減號 -

                tranTemp += 65248; //此數字是 Unicode編碼轉為十進位 和 ASCII碼的 差

            outStr += (char)tranTemp;

        }

        System.out.println("改成全形:" + outStr);
        String result = str.replace(" ","");
        String result2 = result.replace("-", " - ");
        System.out.println("去掉空白(保留-前後空白):" + result2);
        int first=result2.indexOf(':');
        int end=result2.indexOf('-');
        System.out.println("印出:到-之間的字元:"+result2.substring(first+1,end));

    }
}
