package com.tencent.kinda.framework.module.impl;

import android.util.Base64;
import com.tencent.kinda.gen.RsaCryptUtil;
import com.tencent.kinda.gen.RsaEncryptResult;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

public class RsaCryptUtilImpl implements RsaCryptUtil {
    private static final String TAG = "MicroMsg.RsaCryptUtilImpl";

    public RsaEncryptResult rsaPublicEncryptPemkey(String str, String str2) {
        RsaEncryptResult rsaEncryptResult = new RsaEncryptResult();
        if (Util.isNullOrNil(str, str2)) {
            Log.m105928w(TAG, "input is null");
            rsaEncryptResult.mRet = 0;
            return rsaEncryptResult;
        }
        PByteArray pByteArray = new PByteArray();
        boolean rsaPublicEncryptPemkey = MMProtocalJni.rsaPublicEncryptPemkey(str.getBytes(), pByteArray, str2.getBytes());
        if (rsaPublicEncryptPemkey && !Util.isNullOrNil(pByteArray.value)) {
            rsaEncryptResult.mBase64Str = Base64.encodeToString(pByteArray.value, 2);
        }
        rsaEncryptResult.mRet = rsaPublicEncryptPemkey ^ true ? 1 : 0;
        Log.m105919d(TAG, "encrypt ret: %s", rsaEncryptResult);
        return rsaEncryptResult;
    }
}
