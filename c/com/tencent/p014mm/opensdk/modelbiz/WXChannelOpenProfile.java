package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile */
public class WXChannelOpenProfile {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Req */
    public static class Req extends BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelOpenProfile.Req";
        public String userName;

        public boolean checkArgs() {
            String str;
            if (C81058b.m99052b(this.userName)) {
                str = "userName is null";
            } else if (this.userName.length() <= 1024) {
                return true;
            } else {
                str = "userName.length too long";
            }
            Log.m99044e(TAG, str);
            return false;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.userName = bundle.getString("_wxapi_finder_userName");
        }

        public int getType() {
            return 34;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_userName", this.userName);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Resp */
    public static class Resp extends BaseResp {
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
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        public int getType() {
            return 34;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }
    }
}
