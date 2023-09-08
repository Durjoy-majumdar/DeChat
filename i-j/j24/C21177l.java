package j24;

import e24.C20508b;

/* renamed from: j24.l */
public class C21177l extends C20508b {

    /* renamed from: e */
    public final /* synthetic */ int f59906e;

    /* renamed from: f */
    public final /* synthetic */ C21164g f59907f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21177l(C21164g gVar, String str, Object[] objArr, int i, C21156b bVar) {
        super(str, objArr);
        this.f59907f = gVar;
        this.f59906e = i;
    }

    /* renamed from: a */
    public void mo31966a() {
        this.f59907f.f59864p.getClass();
        synchronized (this.f59907f) {
            this.f59907f.f59854C.remove(Integer.valueOf(this.f59906e));
        }
    }
}
