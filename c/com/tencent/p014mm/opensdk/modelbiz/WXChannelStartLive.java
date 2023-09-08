package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelStartLive */
public class WXChannelStartLive {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelStartLive$Req */
    public static class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXChannelStartLive.Req";
        public String liveJsonInfo;

        public boolean checkArgs() {
            if (!C81058b.m99052b(this.liveJsonInfo)) {
                return true;
            }
            Log.m99044e(TAG, "liveInfoData is null");
            return false;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.liveJsonInfo = bundle.getString("_wxapi_finder_start_live_info_data");
        }

        public int getType() {
            return 39;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_start_live_info_data", this.liveJsonInfo);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelStartLive$Resp */
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
            return 39;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }
    }
}
