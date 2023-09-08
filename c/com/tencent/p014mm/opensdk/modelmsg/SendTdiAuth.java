package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;

/* renamed from: com.tencent.mm.opensdk.modelmsg.SendTdiAuth */
public class SendTdiAuth {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendTdiAuth$Resp */
    public static final class Resp extends SendAuth.Resp {
        private static final String KEY_AUTH_BUFFER = "_wxapi_sendauth_resp_tdi_buffer";
        private static final String TAG = "MicroMsg.SDK.SendTdiAuth.Resp";
        public byte[] tdiAuthBuffer;

        public Resp(Bundle bundle) {
            super(bundle);
        }

        public boolean checkArgs() {
            return true;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.tdiAuthBuffer = bundle.getByteArray(KEY_AUTH_BUFFER);
        }

        public int getType() {
            return 31;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putByteArray(KEY_AUTH_BUFFER, this.tdiAuthBuffer);
        }
    }

    private SendTdiAuth() {
    }
}
