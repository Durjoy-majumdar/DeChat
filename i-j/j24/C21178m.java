package j24;

import e24.C20508b;
import j24.C21164g;
import java.io.IOException;
import l24.C117443g;

/* renamed from: j24.m */
public class C21178m extends C20508b {

    /* renamed from: e */
    public final /* synthetic */ C21184q f59908e;

    /* renamed from: f */
    public final /* synthetic */ C21164g.C21172g f59909f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21178m(C21164g.C21172g gVar, String str, Object[] objArr, C21184q qVar) {
        super(str, objArr);
        this.f59909f = gVar;
        this.f59908e = qVar;
    }

    /* renamed from: a */
    public void mo31966a() {
        try {
            C21164g.this.f59856e.mo32468b(this.f59908e);
        } catch (IOException e) {
            C117443g gVar = C117443g.f351507a;
            gVar.mo182134l(4, "Http2Connection.Listener failure for " + C21164g.this.f59858g, e);
            try {
                this.f59908e.mo33145c(C21156b.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
