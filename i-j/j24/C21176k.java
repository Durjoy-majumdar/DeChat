package j24;

import e24.C20508b;
import j24.C21191t;
import java.io.IOException;
import o24.C21766h;

/* renamed from: j24.k */
public class C21176k extends C20508b {

    /* renamed from: e */
    public final /* synthetic */ int f59902e;

    /* renamed from: f */
    public final /* synthetic */ C21766h f59903f;

    /* renamed from: g */
    public final /* synthetic */ int f59904g;

    /* renamed from: h */
    public final /* synthetic */ C21164g f59905h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21176k(C21164g gVar, String str, Object[] objArr, int i, C21766h hVar, int i2, boolean z) {
        super(str, objArr);
        this.f59905h = gVar;
        this.f59902e = i;
        this.f59903f = hVar;
        this.f59904g = i2;
    }

    /* renamed from: a */
    public void mo31966a() {
        try {
            C21191t tVar = this.f59905h.f59864p;
            C21766h hVar = this.f59903f;
            int i = this.f59904g;
            ((C21191t.C21192a) tVar).getClass();
            hVar.skip((long) i);
            this.f59905h.f59852A.mo33160i(this.f59902e, C21156b.CANCEL);
            synchronized (this.f59905h) {
                this.f59905h.f59854C.remove(Integer.valueOf(this.f59902e));
            }
        } catch (IOException unused) {
        }
    }
}
