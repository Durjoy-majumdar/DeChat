package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive */
public class WXChannelOpenLive {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Req */
    public static class Req extends BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelOpenLive.Req";
        public String feedID;
        public String nonceID;

        public boolean checkArgs() {
            String str;
            if (C81058b.m99052b(this.feedID)) {
                str = "feedID is null";
            } else if (C81058b.m99052b(this.nonceID)) {
                str = "nonceID is null";
            } else if (this.feedID.length() > 1024) {
                str = "feedID.length too long!";
            } else if (this.nonceID.length() <= 1024) {
                return true;
            } else {
                str = "nonceID.length too long!";
            }
            Log.m99044e(TAG, str);
            return false;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.feedID = bundle.getString("_wxapi_finder_feedID");
            this.nonceID = bundle.getString("_wxapi_finder_nonceID");
        }

        public int getType() {
            return 35;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_feedID", this.feedID);
            bundle.putString("_wxapi_finder_nonceID", this.nonceID);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Resp */
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
            return 35;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }
    }
}
