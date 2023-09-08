package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXNontaxPay */
public class WXNontaxPay {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Req */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXNontaxPay.Req";
        private static final int URL_LENGTH_LIMIT = 10240;
        public String url;

        public boolean checkArgs() {
            if (C81058b.m99052b(this.url)) {
                Log.m99045i(TAG, "url should not be empty");
                return false;
            } else if (this.url.length() <= 10240) {
                return true;
            } else {
                Log.m99044e(TAG, "url must be in 10k");
                return false;
            }
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_nontax_pay_req_url");
        }

        public int getType() {
            return 21;
        }

        public void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_nontax_pay_req_url", this.url);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Resp */
    public static final class Resp extends BaseResp {
        public String wxOrderId;

        public boolean checkArgs() {
            return true;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.wxOrderId = bundle.getString("_wxapi_nontax_pay_order_id");
        }

        public int getType() {
            return 21;
        }

        public void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_nontax_pay_order_id", this.wxOrderId);
        }
    }
}
