package com.tencent.youtu.ytagreflectlivecheck.requester;

import android.os.Build;

public interface RGBConfigRequester {

    public interface RGBConfigRequestCallBack {
        void onFailed(int i);

        void onSuccess(String str, int i);
    }

    public static class RGBConfigRequestCallBackType {
        public static int RGB_FullResponse = 0;
        public static int RGB_OnlyRgbConfig = 1;
    }

    public static class YTColorSeqReq {
        public String android_apilevel = ("" + Build.VERSION.SDK_INT);
        public String android_version = Build.VERSION.RELEASE;
        public String app_id;
        public String build_brand = Build.BRAND;
        public String build_device = Build.DEVICE;
        public String build_display = Build.DISPLAY;
        public String build_hardware = Build.HARDWARE;
        public String build_id = Build.ID;
        public String build_model = Build.MODEL;
        public String build_product = Build.PRODUCT;
        public String build_serial = Build.SERIAL;
        public String build_test = null;
        public String business_name;
        public String person_id;
        public int platform;

        public YTColorSeqReq(String str, String str2, String str3) {
            this.app_id = str;
            this.business_name = str2;
            this.person_id = str3;
            this.platform = 2;
        }
    }

    void request(RGBConfigRequestCallBack rGBConfigRequestCallBack);
}
