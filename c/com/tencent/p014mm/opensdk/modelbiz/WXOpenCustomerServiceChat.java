package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat */
public class WXOpenCustomerServiceChat {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Req */
    public static final class Req extends BaseReq {
        public String corpId = "";
        public String url = "";

        public boolean checkArgs() {
            return true;
        }

        public int getType() {
            return 37;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_open_customer_service_chat_corpId", this.corpId);
            bundle.putString("_open_customer_service_chat_url", this.url);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Resp */
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
            return 37;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }
}
