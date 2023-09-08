package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.autogen.events.BizDeleteContactEvent;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44653b0;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import p248ug.C52558c;
import rb0.C47966e0;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.ui.tools.q */
public class C45080q implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ C52558c f122283d;

    /* renamed from: e */
    public final /* synthetic */ String f122284e;

    public C45080q(C52558c cVar, String str) {
        this.f122283d = cVar;
        this.f122284e = str;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return C45074p.f122265a;
    }

    /* renamed from: c */
    public void mo24604c() {
        Class cls = C75700k0.class;
        if (this.f122283d.mo73507y2()) {
            C44653b0 wp = ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72740wp();
            String str = this.f122284e;
            wp.getClass();
            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            C72976h2 h2Var = new C72976h2(str);
            h2Var.mo108807c3("officialaccounts");
            wp.mo69632a(h2Var, Ku);
            BizDeleteContactEvent bizDeleteContactEvent = new BizDeleteContactEvent();
            bizDeleteContactEvent.f107367d.f107368a = this.f122284e;
            bizDeleteContactEvent.publish();
        }
        C48009v0.Fx0().mo72764c(this.f122284e);
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c(this.f122284e);
    }
}
