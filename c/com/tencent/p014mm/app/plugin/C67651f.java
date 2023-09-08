package com.tencent.p014mm.app.plugin;

import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ke3.C88144b;
import lc3.C10485b;

/* renamed from: com.tencent.mm.app.plugin.f */
public class C67651f {
    /* renamed from: a */
    public static boolean m79887a() {
        C88144b.m109788f("translate");
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("TranslateMsgOff");
        return Util.isNullOrNil(c) || Util.safeParseInt(c) == 0;
    }
}
