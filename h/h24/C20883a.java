package h24;

import d24.C116553k;
import d24.C20387b0;
import d24.C20409l;
import d24.C20419r;
import d24.C20423t;
import d24.C20431y;
import e24.C20509c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o24.C21774o;
import o24.C21777r;

/* renamed from: h24.a */
public final class C20883a implements C20423t {

    /* renamed from: a */
    public final C20409l f59013a;

    public C20883a(C20409l lVar) {
        this.f59013a = lVar;
    }

    /* renamed from: a */
    public C20387b0 mo31952a(C20423t.C20424a aVar) {
        boolean z;
        C20889g gVar = (C20889g) aVar;
        C20431y yVar = gVar.f59021f;
        yVar.getClass();
        C20431y.C20432a aVar2 = new C20431y.C20432a(yVar);
        yVar.getClass();
        if (yVar.mo31967a("Host") == null) {
            aVar2.f57347c.mo31938e("Host", C20509c.m22205k(yVar.f57340a, false));
        }
        if (yVar.mo31967a("Connection") == null) {
            aVar2.f57347c.mo31938e("Connection", "Keep-Alive");
        }
        if (yVar.mo31967a("Accept-Encoding") == null && yVar.mo31967a("Range") == null) {
            aVar2.f57347c.mo31938e("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        ((C20409l.C20410a) this.f59013a).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C116553k kVar = (C116553k) emptyList.get(i);
                sb.append(kVar.f349558a);
                sb.append('=');
                sb.append(kVar.f349559b);
            }
            aVar2.f57347c.mo31938e("Cookie", sb.toString());
        }
        if (yVar.mo31967a("User-Agent") == null) {
            aVar2.f57347c.mo31938e("User-Agent", "okhttp/3.12.13");
        }
        C20387b0 a = gVar.mo32602a(aVar2.mo31969a(), gVar.f59017b, gVar.f59018c, gVar.f59019d);
        C20887e.m22968d(this.f59013a, yVar.f57340a, a.f57130i);
        C20387b0.C20388a aVar3 = new C20387b0.C20388a(a);
        aVar3.f57138a = yVar;
        if (z && "gzip".equalsIgnoreCase(a.mo31886b("Content-Encoding")) && C20887e.m22966b(a)) {
            C21774o oVar = new C21774o(a.f57131j.mo31898c());
            C20419r.C20420a e = a.f57130i.mo31928e();
            e.mo31937d("Content-Encoding");
            e.mo31937d("Content-Length");
            ArrayList arrayList = (ArrayList) e.f57263a;
            C20419r.C20420a aVar4 = new C20419r.C20420a();
            Collections.addAll(aVar4.f57263a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar3.f57143f = aVar4;
            aVar3.f57144g = new C20890h(a.mo31886b("Content-Type"), -1, C21777r.m24935b(oVar));
        }
        return aVar3.mo31889a();
    }
}
