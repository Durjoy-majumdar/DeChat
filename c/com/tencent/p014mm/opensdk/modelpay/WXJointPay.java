package com.tencent.p014mm.opensdk.modelpay;

import android.os.Bundle;

/* renamed from: com.tencent.mm.opensdk.modelpay.WXJointPay */
public class WXJointPay {

    /* renamed from: com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayReq */
    public static class JointPayReq extends PayReq {
        public boolean checkArgs() {
            return super.checkArgs();
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        public int getType() {
            return 27;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayResp */
    public static class JointPayResp extends PayResp {
        public JointPayResp() {
        }

        public JointPayResp(Bundle bundle) {
            fromBundle(bundle);
        }

        public boolean checkArgs() {
            return super.checkArgs();
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        public int getType() {
            return 27;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }
}
