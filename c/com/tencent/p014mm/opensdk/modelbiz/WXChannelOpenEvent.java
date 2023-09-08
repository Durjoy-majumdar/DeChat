package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent */
public class WXChannelOpenEvent {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent$Req */
    public static class Req extends BaseReq {
        private static final String Key_EventId = "_wxapi_finder_open_event_eventId";
        private static final String Key_ExtInfo = "_wxapi_finder_open_event_extInfo";
        private static final String Key_Username = "_wxapi_finder_open_event_username";
        private static final int LENGTH_LIMIT = 1024;
        private static final String TAG = "MicroMsg.SDK.WXChannelOpenEvent.Req";
        public String eventId;
        public String extInfo;
        public String username;

        public boolean checkArgs() {
            String str;
            if (C81058b.m99052b(this.username)) {
                str = "username is null";
            } else if (this.username.length() > 1024) {
                str = "username exceeds the limit";
            } else if (C81058b.m99052b(this.eventId)) {
                str = "eventId is null";
            } else if (this.eventId.length() <= 1024) {
                return true;
            } else {
                str = "eventId exceeds the limit";
            }
            Log.m99044e(TAG, str);
            return false;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.username = bundle.getString(Key_Username);
            this.eventId = bundle.getString(Key_EventId);
            this.extInfo = bundle.getString(Key_ExtInfo);
        }

        public int getType() {
            return 41;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(Key_Username, this.username);
            bundle.putString(Key_EventId, this.eventId);
            bundle.putString(Key_ExtInfo, this.extInfo);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent$Resp */
    public static class Resp extends BaseResp {
        private static final String Key_ExtMsg = "_wxapi_finder_open_event_extMsg";
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
            this.extMsg = bundle.getString(Key_ExtMsg);
        }

        public int getType() {
            return 41;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(Key_ExtMsg, this.extMsg);
        }
    }
}
