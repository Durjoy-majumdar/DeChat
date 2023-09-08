package com.tencent.p014mm.pluginsdk.model.app;

import cc3.C26835d;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import gy3.C87412m;
import te3.C101819mz3;
import te3.C101848u5;

/* renamed from: com.tencent.mm.pluginsdk.model.app.a0 */
public final class C96762a0 {
    /* renamed from: a */
    public static final C101819mz3 m124215a(C72963f4 f4Var, C26835d dVar) {
        C87412m.m108594g(f4Var, "msgInfo");
        C87412m.m108594g(dVar, "baseAppMsg");
        C101848u5 u5Var = new C101848u5();
        u5Var.f299573e = dVar.mo53865B();
        u5Var.f299574f = dVar.mo53868E();
        u5Var.f299579n = f4Var.mo108768t() + f4Var.getMsgId() + 'T' + f4Var.getCreateTime();
        String content = f4Var.getContent();
        u5Var.f299577i = content != null ? CommonKt.extractSubXmlTag(content, "appmsg") : null;
        u5Var.f299578j = (int) Util.nowSecond();
        u5Var.f299575g = f4Var.mo108768t();
        u5Var.f299572d = C75592q0.m90789s();
        u5Var.f299576h = dVar.mo53871H();
        C101819mz3 mz32 = new C101819mz3();
        mz32.f298885d = u5Var;
        if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(f4Var.mo108768t())) {
            mz32.f298896r = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69662L3(f4Var.mo108768t());
        }
        return mz32;
    }
}
