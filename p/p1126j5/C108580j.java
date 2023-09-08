package p1126j5;

import android.net.Uri;
import d24.C106982e;
import d24.C20421s;
import gy3.C87412m;

/* renamed from: j5.j */
public final class C108580j extends C108578i<Uri> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108580j(C106982e.C106983a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "callFactory");
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        return C87412m.m108589b(uri.getScheme(), "http") || C87412m.m108589b(uri.getScheme(), C113600ck.f339986i);
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        String uri2 = uri.toString();
        C87412m.m108593f(uri2, "data.toString()");
        return uri2;
    }

    /* renamed from: e */
    public C20421s mo159574e(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "<this>");
        String uri2 = uri.toString();
        C20421s.C20422a aVar = new C20421s.C20422a();
        aVar.mo31950b((C20421s) null, uri2);
        return aVar.mo31949a();
    }
}
