package com.tencent.youtu.ytagreflectlivecheck.requester;

import android.os.Build;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;

public interface LiveStyleRequester {

    public static class LiveStyleAndroidData {
        public String android_apilevel = ("" + Build.VERSION.SDK_INT);
        public String android_version = Build.VERSION.RELEASE;
        public String build_brand = Build.BRAND;
        public String build_device = Build.DEVICE;
        public String build_display = Build.DISPLAY;
        public String build_hardware = Build.HARDWARE;
        public String build_model = Build.MODEL;
        public String build_product = Build.PRODUCT;
        public float lux = 0.0f;
    }

    public static class SeleceData {
        public LiveStyleAndroidData android_data;
        public int change_point_num = 2;
        public int platform = 2;
        public int protocal = 1;
        public String reflect_param = " version 2 ";
        public String version = YTAGReflectLiveCheckInterface.VERSION;

        public SeleceData(float f) {
            LiveStyleAndroidData liveStyleAndroidData = new LiveStyleAndroidData();
            this.android_data = liveStyleAndroidData;
            liveStyleAndroidData.lux = f;
        }
    }

    public static class YTLiveStyleReq {
        public String app_id;
        public SeleceData select_data;

        public YTLiveStyleReq(float f, String str) {
            this.select_data = new SeleceData(f);
            this.app_id = str;
        }
    }
}
