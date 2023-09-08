package com.tencent.midas.data;

public class APDataId {
    private static APDataId gInstance;
    private static int paydataCount;
    private final String DATA_DISCOUNT_INIT = "initdataCount";
    private final String DATA_DISCOUNT_PAY = "dataCount";
    private final String TENCENTUNIPAY_DATAID_FLAG = APPluginDataInterface.SHARE_PREFERENCE_NAME;

    private APDataId() {
    }

    public static int getDataId() {
        int i = paydataCount;
        paydataCount = i + 1;
        return i;
    }

    public static void initDataId() {
        paydataCount = 0;
    }
}
