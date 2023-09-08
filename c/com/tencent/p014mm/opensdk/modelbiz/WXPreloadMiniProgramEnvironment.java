package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment */
public class WXPreloadMiniProgramEnvironment {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Req */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXPreloadMiniProgramEnvironment.Req";
        public String extData = "";

        public boolean checkArgs() {
            return true;
        }

        public int getType() {
            return 32;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_preload_wxminiprogram_environment_extData", this.extData);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Resp */
    public static final class Resp extends BaseResp {
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
        }

        public int getType() {
            return 32;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }
}
