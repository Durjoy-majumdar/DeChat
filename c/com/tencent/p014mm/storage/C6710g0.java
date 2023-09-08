package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.storage.g0 */
public final class C6710g0 {

    /* renamed from: a */
    public static final C6710g0 f24120a = new C6710g0();

    /* renamed from: b */
    public static int f24121b = -1;

    /* renamed from: a */
    public final boolean mo7654a() {
        int i = f24121b;
        return i != -1 ? i == 1 : (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) && Log.getLogLevel() < 2;
    }

    /* renamed from: b */
    public final void mo7655b(String str) {
        Log.m105920e("MicroMsg.BizMsgResortTest", "onCheckFail " + str);
        if (BuildInfo.DEBUG || Log.getLogLevel() <= 1) {
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - singleMMKV.decodeLong("lastResortCrashTime", -1)) > 86400000) {
                singleMMKV.encode("lastResortCrashTime", currentTimeMillis);
                Assert.assertTrue("onCheckFail " + str, false);
            }
        }
    }
}
