package com.tenpay.tsm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TSMException extends Exception {
    public static final int ERR_ARG_IN = -10012;
    public static final int ERR_ILLEGAL_ARGUMENT = -10001;
    public static final int ERR_INVALID_PARAMS = -6001;
    public static final int ERR_JNIV2_BEGIN = -6000;
    public static final int ERR_JNIV2_C_END = -6499;
    public static final int ERR_JNIV2_END = -6999;
    public static final int ERR_JNIV2_JAVA_CERT_CTX_INIT = -6505;
    public static final int ERR_JNIV2_JAVA_SM2_CTX_INIT = -6501;
    public static final int ERR_JNIV2_JAVA_SM3_CTX_INIT = -6502;
    public static final int ERR_JNIV2_JAVA_SM3_HMAC_CTX_INIT = -6503;
    public static final int ERR_JNIV2_JAVA_SM4_CTX_INIT = -6504;
    public static final int ERR_KV_FILE_NOT_FOUND = -60012;
    public static final int ERR_MALLOC_FAIL = -6002;
    public static final int ERR_MODULE_STATUSNG = -10900;
    public static final int ERR_SM4_GCM_ILLEGAL_TAGLEN = -40005;
    public static final int ERR_SM4_GCM_TAG_VERIFY_FAILED = -40002;
    public static final int ERR_SM4_ILLEGAL_MSGLEN = -40007;
    public static final int SM2_VERIFY_FAIL = -51003;
    private static final Map<Integer, String> errMap;
    public int errCode;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(ERR_JNIV2_JAVA_SM2_CTX_INIT), "please call SM2Algo init method first to initialize context");
        hashMap.put(Integer.valueOf(ERR_JNIV2_JAVA_SM3_CTX_INIT), "please call SM3Algo hashInit method first to initialize sm3 hash context");
        hashMap.put(Integer.valueOf(ERR_JNIV2_JAVA_SM3_HMAC_CTX_INIT), "please call SM3Algo hmacInit method first to initialize sm3 hmac context");
        hashMap.put(Integer.valueOf(ERR_JNIV2_JAVA_SM4_CTX_INIT), "please call SM4Algo stepInit method first to initialize sm4 context");
        hashMap.put(Integer.valueOf(ERR_JNIV2_JAVA_CERT_CTX_INIT), "please call SMCert init method first to initialize cert context");
        errMap = Collections.unmodifiableMap(hashMap);
    }

    public TSMException(int i) {
        super("" + i + ": " + getErrMsg(i));
        this.errCode = i;
    }

    public static String getErrMsg(int i) {
        Map<Integer, String> map = errMap;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "Please refer to Tencent SM official document";
    }

    public int getErrCode() {
        return this.errCode;
    }

    public TSMException(int i, String str) {
        super("" + i + ": " + str);
        this.errCode = i;
    }
}
