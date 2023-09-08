package com.tencent.p014mm.plugin.multitask;

import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.multitask.r */
public final class C4897r {

    /* renamed from: a */
    public static final String f20014a;

    static {
        C4897r rVar = new C4897r();
        String str = rVar.mo5821a() + "coverimg/";
        f20014a = str;
        if (!C86013q1.m106450k(rVar.mo5821a())) {
            C86013q1.m106461v(rVar.mo5821a());
        }
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
    }

    /* renamed from: a */
    public final String mo5821a() {
        return C86709a0.m107535s().f251806d + "multitask/";
    }
}
