package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jj2.C98944a;
import p004b0.C54372f0;
import p415q0.C110261c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.f */
public final class C57228f extends C87413o implements C32226l<C54372f0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerBackupDemoUI f163959d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57228f(RepairerBackupDemoUI repairerBackupDemoUI) {
        super(1);
        this.f163959d = repairerBackupDemoUI;
    }

    public Object invoke(Object obj) {
        C54372f0 f0Var = (C54372f0) obj;
        C87412m.m108594g(f0Var, "$this$LazyColumn");
        ArrayList<C98944a> arrayList = this.f163959d.f315716f;
        C87412m.m108591d(arrayList);
        C54372f0.C54373a.m61063b(f0Var, arrayList.size(), (C32226l) null, (C32226l) null, C110261c.m149879c(1270664304, true, new C106058e(this.f163959d)), 6, (Object) null);
        return C13598b0.f38549a;
    }
}
