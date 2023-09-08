package com.tencent.p014mm.app;

import com.tencent.mars.Mars;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.CommLibFileName;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p206nj.C88957l;
import p581jx.C88036b;
import p977hj.C87528c;
import qe3.C89625d;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.app.SandBoxProfile */
public final class SandBoxProfile extends C87528c {

    /* renamed from: b */
    public static final String f235717b = (MMApplicationContext.getPackageName() + ":sandbox");

    /* renamed from: a */
    public void mo112236a() {
        Class<SandBoxProfile> cls = SandBoxProfile.class;
        C80814d b = C80814d.m98665b(MMApplicationContext.getContext());
        C88957l.m111079o("MMProtocalJni", cls.getClassLoader());
        C88957l.m111079o(Mars.libMarsBase, cls.getClassLoader());
        C88957l.m111079o(CommLibFileName.quic, cls.getClassLoader());
        C88957l.m111079o(Mars.libMarsMM, cls.getClassLoader());
        try {
            MMProtocalJni.setClientPackVersion(C89625d.f257841g);
        } catch (Throwable unused) {
            MMProtocalJni.setClientPackVersion(C89625d.f257841g);
        }
        try {
            b.mo112570e("SANDBOX");
            C90188n0.f258941i = Util.nullAs(b.mo112567a(".com.tencent.mm.debug.test.network.simulate_down_fault"), false);
            Log.m105924i("MicroMsg.SandboxDebugger", "Test.simulateDownFault = " + C90188n0.f258941i);
        } catch (Error unused2) {
        }
        ((C88036b) C86312j.m106911c(C88036b.class)).init();
    }

    public String toString() {
        return f235717b;
    }
}
