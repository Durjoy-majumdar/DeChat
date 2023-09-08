package com.tencent.xweb.util;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

public class ECCUtil {
    private static final String TAG = "ECCUtil";

    public static class ECCMatchInfo {
        public String strAlgorithm;
        public String strMsg;
        public String strPubKey;
        public String strSig;

        public ECCMatchInfo(String str, String str2, String str3, String str4) {
            this.strMsg = str;
            this.strSig = str2;
            this.strPubKey = str3;
            this.strAlgorithm = str4;
        }

        public boolean verify() {
            try {
                PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode(this.strPubKey, 0)));
                Signature instance = Signature.getInstance(this.strAlgorithm);
                instance.initVerify(generatePublic);
                byte[] decode = Base64.decode(this.strSig, 0);
                instance.update(this.strMsg.getBytes());
                return instance.verify(decode);
            } catch (Throwable th) {
                XWebLog.m21909e(ECCUtil.TAG, "verify failed " + th.getMessage());
                return false;
            }
        }
    }

    public static void test() {
    }

    public static boolean verifySHA1withECDSA(String str, String str2, String str3) {
        return new ECCMatchInfo(str, str2, str3, "SHA1withECDSA").verify();
    }
}
