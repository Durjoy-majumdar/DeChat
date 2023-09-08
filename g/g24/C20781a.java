package g24;

import d24.C20387b0;
import d24.C20423t;
import d24.C20425v;
import d24.C20431y;
import h24.C20886c;
import h24.C20889g;
import java.io.IOException;

/* renamed from: g24.a */
public final class C20781a implements C20423t {

    /* renamed from: a */
    public final C20425v f58690a;

    public C20781a(C20425v vVar) {
        this.f58690a = vVar;
    }

    /* renamed from: a */
    public C20387b0 mo31952a(C20423t.C20424a aVar) {
        C20889g gVar = (C20889g) aVar;
        C20431y yVar = gVar.f59021f;
        C20788g gVar2 = gVar.f59017b;
        boolean z = !yVar.f57341b.equals("GET");
        C20425v vVar = this.f58690a;
        gVar2.getClass();
        C20889g gVar3 = (C20889g) aVar;
        int i = gVar3.f59024i;
        int i2 = gVar3.f59025j;
        int i3 = gVar3.f59026k;
        vVar.getClass();
        try {
            C20886c h = gVar2.mo32484e(i, i2, i3, 0, vVar.f57284A, z).mo32474h(vVar, aVar, gVar2);
            synchronized (gVar2.f58725d) {
                gVar2.f58735n = h;
            }
            return gVar.mo32602a(yVar, gVar2, h, gVar2.mo32481b());
        } catch (IOException e) {
            throw new C20785e(e);
        }
    }
}
