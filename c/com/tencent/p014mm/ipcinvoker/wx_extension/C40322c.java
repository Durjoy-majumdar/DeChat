package com.tencent.p014mm.ipcinvoker.wx_extension;

import a14.C53921m;
import di3.C86312j;
import gy3.C87412m;
import jp3.C46566c;
import ob0.C47350c;
import te3.C101820nt3;
import te3.C49335eu3;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.c */
public abstract class C40322c<REQUEST extends C101820nt3, RESPONSE extends C49335eu3> {

    /* renamed from: a */
    public final REQUEST f108398a;

    /* renamed from: b */
    public final RESPONSE f108399b;

    public C40322c(REQUEST request, RESPONSE response) {
        C87412m.m108594g(request, "request");
        C87412m.m108594g(response, "response");
        this.f108398a = request;
        this.f108399b = response;
    }

    /* renamed from: a */
    public abstract int mo63009a();

    /* renamed from: b */
    public abstract String mo63010b();

    /* renamed from: c */
    public abstract String mo63011c();

    /* renamed from: d */
    public Object mo63012d(C15601d<? super RESPONSE> dVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = mo63011c();
        bVar.f127069d = mo63009a();
        bVar.f127066a = this.f108398a;
        bVar.f127067b = this.f108399b;
        C47350c a = bVar.mo72403a();
        C46566c cVar = new C46566c();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63013cp(a, new C40320a(this, mVar, cVar), cVar);
        mVar.mo74599v(new C40321b(cVar));
        return mVar.mo74608o();
    }
}
