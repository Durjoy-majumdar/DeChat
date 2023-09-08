package com.tencent.kinda.framework.app;

import com.tencent.kinda.gen.KUtilityService;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.ndk.Encrypt;

public class KindaUtilityServiceImpl implements KUtilityService {
    public String get3DesEncryptResult(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        String desedeEncode = new Encrypt().desedeEncode(str);
        return Util.isNullOrNil(desedeEncode) ? "" : desedeEncode;
    }

    public String qmfCardStrLimitLen(String str, int i) {
        return i < 0 ? str : C75228t.m90267q0(str, i);
    }
}
