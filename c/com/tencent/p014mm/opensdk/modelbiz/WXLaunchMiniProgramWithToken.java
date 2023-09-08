package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken */
public class WXLaunchMiniProgramWithToken {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Req */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXLaunchMiniProgramWithToken.Req";
        public String token;

        public boolean checkArgs() {
            if (!C81058b.m99052b(this.token)) {
                return true;
            }
            Log.m99044e(TAG, "token is null");
            return false;
        }

        public int getType() {
            return 29;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_token", this.token);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Resp */
    public static final class Resp extends BaseResp {
        public static final int ERR_INVALID_TOKEN = -1000;
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
            return 29;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
        }
    }
}
