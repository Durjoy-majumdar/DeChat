package com.tencent.p014mm.plugin.expt.pageflow;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86718e;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.b */
public class C2262b {

    /* renamed from: b */
    public static C2262b f12346b;

    /* renamed from: a */
    public String f12347a = null;

    /* renamed from: a */
    public static C2262b m2058a() {
        if (f12346b == null) {
            f12346b = new C2262b();
        }
        return f12346b;
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo2157b() {
        int h = C86718e.m107549h();
        if (h == 0) {
            return null;
        }
        String str = h + "_" + "WxPageFlow";
        if (!Util.isEqual(this.f12347a, str)) {
            Log.m105925i("MicroMsg.MMPageFlowMMKV", "get mmkv change uin old[%s] new[%s]", this.f12347a, str);
            this.f12347a = str;
        }
        return MultiProcessMMKV.getMMKV(this.f12347a);
    }
}
