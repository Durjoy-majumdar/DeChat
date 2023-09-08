package com.tencent.p014mm.plugin.wallet_core.id_verify;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.C49729hn3;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.b */
public class C72140b implements C87581a<Object, C89132b.C89134c<C49729hn3>> {

    /* renamed from: a */
    public final /* synthetic */ RealNameVerifyProcess$$h f209271a;

    public C72140b(RealNameVerifyProcess$$h realNameVerifyProcess$$h) {
        this.f209271a = realNameVerifyProcess$$h;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (this.f209271a.f221418a.isFinishing() || this.f209271a.f221418a.isDestroyed() || cVar.f256793a != 0 || cVar.f256794b != 0) {
            return null;
        }
        C49729hn3 hn32 = (C49729hn3) cVar.f256796d;
        if (hn32.f134749d == 0 || Util.isNullOrNil(hn32.f134750e)) {
            return null;
        }
        C75228t.m90210C(((C49729hn3) cVar.f256796d).f134750e);
        return null;
    }
}
