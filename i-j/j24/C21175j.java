package j24;

import e24.C20508b;
import java.io.IOException;
import java.util.List;

/* renamed from: j24.j */
public class C21175j extends C20508b {

    /* renamed from: e */
    public final /* synthetic */ int f59899e;

    /* renamed from: f */
    public final /* synthetic */ List f59900f;

    /* renamed from: g */
    public final /* synthetic */ C21164g f59901g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21175j(C21164g gVar, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f59901g = gVar;
        this.f59899e = i;
        this.f59900f = list;
    }

    /* renamed from: a */
    public void mo31966a() {
        this.f59901g.f59864p.getClass();
        try {
            this.f59901g.f59852A.mo33160i(this.f59899e, C21156b.CANCEL);
            synchronized (this.f59901g) {
                this.f59901g.f59854C.remove(Integer.valueOf(this.f59899e));
            }
        } catch (IOException unused) {
        }
    }
}
