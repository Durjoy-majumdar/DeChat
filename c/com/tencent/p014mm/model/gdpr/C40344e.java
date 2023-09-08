package com.tencent.p014mm.model.gdpr;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import di3.C86312j;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C47350c;
import te3.C48793b12;
import te3.C48939c12;

/* renamed from: com.tencent.mm.model.gdpr.e */
public class C40344e implements C87581a<Boolean, Void> {

    /* renamed from: a */
    public final /* synthetic */ C1289a f108430a;

    /* renamed from: b */
    public final /* synthetic */ String f108431b;

    /* renamed from: c */
    public final /* synthetic */ C1290b f108432c;

    public C40344e(C1289a aVar, String str, C1290b bVar) {
        this.f108430a = aVar;
        this.f108431b = str;
        this.f108432c = bVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        if (this.f108430a.f10392e == 0) {
            return Boolean.TRUE;
        }
        C46888b c = C88643g.m110545c();
        C48793b12 b122 = new C48793b12();
        b122.f130888d = this.f108431b;
        b122.f130889e = this.f108430a.f10392e;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2575;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getgdrpauth";
        bVar.f127066a = b122;
        bVar.f127067b = new C48939c12();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C40343d(this, c));
        return null;
    }
}
