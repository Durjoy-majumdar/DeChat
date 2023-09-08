package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.file.XVFSFile;
import eb0.C116734h6;
import java.util.Arrays;

/* renamed from: com.tencent.mm.console.Shell$$t0 */
public class Shell$$t0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        String[] allKeys;
        String[] allKeys2;
        String[] allKeys3;
        String[] allKeys4;
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            Log.m105924i("MicroMsg.Shell", "#BRANDS_DUMP");
            Log.m105924i("MicroMsg.XAgreementSettings", ">>>>>>>>>> WeChat Brands Test Configs <<<<<<<<<<");
            Log.m105924i("MicroMsg.XAgreementSettings", ">> test XagreementId = " + C116734h6.C31472g.f84195a);
            Log.m105924i("MicroMsg.XAgreementSettings", ">> test BinEntry Dict:");
            MultiProcessMMKV s = C116734h6.m164663s("xagreement_test_configs");
            if (!(s == null || (allKeys4 = s.allKeys()) == null)) {
                for (String str : allKeys4) {
                    Log.m105924i("MicroMsg.XAgreementSettings", str + " = " + s.getInt(str, -1));
                }
            }
            Log.m105924i("MicroMsg.XAgreementSettings", "\n");
            for (Integer intValue : Arrays.asList(new Integer[]{0, 1, 2, 3})) {
                int intValue2 = intValue.intValue();
                Log.m105924i("MicroMsg.XAgreementSettings", ">> cgi Wording Dict for xid " + intValue2 + XVFSFile.PATH_SEPARATOR);
                MultiProcessMMKV g = C116734h6.m164651g(intValue2);
                if (!(g == null || (allKeys3 = g.allKeys()) == null)) {
                    for (String str2 : allKeys3) {
                        Log.m105924i("MicroMsg.XAgreementSettings", str2 + " = " + g.getString(str2, (String) null));
                    }
                }
                Log.m105924i("MicroMsg.XAgreementSettings", ">> cgi Domain Dict for xid " + intValue2 + XVFSFile.PATH_SEPARATOR);
                MultiProcessMMKV f = C116734h6.m164650f(WeChatBrands.UserInfo.xagreementId);
                if (!(f == null || (allKeys2 = f.allKeys()) == null)) {
                    for (String str3 : allKeys2) {
                        Log.m105924i("MicroMsg.XAgreementSettings", str3 + " = " + f.getString(str3, (String) null));
                    }
                }
                Log.m105924i("MicroMsg.XAgreementSettings", ">> cgi Business Dict for xid " + intValue2 + XVFSFile.PATH_SEPARATOR);
                MultiProcessMMKV e = C116734h6.m164649e(WeChatBrands.UserInfo.xagreementId);
                if (!(e == null || (allKeys = e.allKeys()) == null)) {
                    for (String str4 : allKeys) {
                        Log.m105924i("MicroMsg.XAgreementSettings", str4 + " = " + e.getInt(str4, -1));
                    }
                }
                Log.m105924i("MicroMsg.XAgreementSettings", "\n");
            }
            Log.m105924i("MicroMsg.XAgreementSettings", ">>>>>>>>>> WECHAT BRANDS TEST CONFIGS <<<<<<<<<<");
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
