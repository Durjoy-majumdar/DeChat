package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram */
public class WXPreloadMiniProgram {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Req */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXPreloadMiniProgram.Req";
        public String extData = "";
        public int miniprogramType = 0;
        public String path = "";
        public String userName;

        public boolean checkArgs() {
            String str;
            if (C81058b.m99052b(this.userName)) {
                str = "userName is null";
            } else {
                int i = this.miniprogramType;
                if (i >= 0 && i <= 2) {
                    return true;
                }
                str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
            }
            Log.m99044e(TAG, str);
            return false;
        }

        public int getType() {
            return 28;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.userName);
            bundle.putString("_launch_wxminiprogram_path", this.path);
            bundle.putString("_launch_wxminiprogram_extData", this.extData);
            bundle.putInt("_launch_wxminiprogram_type", this.miniprogramType);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Resp */
    public static final class Resp extends BaseResp {
        public String extMsg;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        public boolean checkArgs() {
            return true;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        public int getType() {
            return 28;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
        }
    }
}
