package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXQRCodePay */
public class WXQRCodePay {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Req */
    public static class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXQRCodePayReq.Req";
        public String codeContent;
        public String extraMsg;

        public boolean checkArgs() {
            return !TextUtils.isEmpty(this.codeContent);
        }

        public int getType() {
            return 38;
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Resp */
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
            return 38;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }
}
