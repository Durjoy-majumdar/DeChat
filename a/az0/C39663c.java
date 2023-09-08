package az0;

import a14.C53921m;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import jp3.C46566c;
import ob0.C47350c;
import te3.C101820nt3;
import te3.C49335eu3;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: az0.c */
public abstract class C39663c<REQUEST extends C101820nt3, RESPONSE extends C49335eu3> {

    /* renamed from: a */
    public final REQUEST f106428a;

    /* renamed from: b */
    public final RESPONSE f106429b;

    public C39663c(REQUEST request, RESPONSE response) {
        C87412m.m108594g(request, "request");
        C87412m.m108594g(response, "response");
        this.f106428a = request;
        this.f106429b = response;
    }

    /* renamed from: a */
    public abstract int mo62231a();

    /* renamed from: b */
    public abstract String mo62232b();

    /* renamed from: c */
    public abstract String mo62233c();

    /* renamed from: d */
    public final void mo62234d(String str) {
        C87412m.m108594g(str, "msg");
        Log.m105924i(mo62232b() + "[CarLicensePlateCgiBase][" + hashCode() + ']', str);
    }

    /* renamed from: e */
    public Object mo62235e(C15601d<? super RESPONSE> dVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = mo62233c();
        bVar.f127069d = mo62231a();
        bVar.f127066a = this.f106428a;
        bVar.f127067b = this.f106429b;
        C47350c a = bVar.mo72403a();
        C46566c cVar = new C46566c();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63013cp(a, new C39661a(this, mVar, cVar), cVar);
        mVar.mo74599v(new C39662b(cVar));
        return mVar.mo74608o();
    }
}
