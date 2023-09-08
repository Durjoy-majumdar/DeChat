package j24;

import e24.C20508b;
import java.io.IOException;
import java.util.List;

/* renamed from: j24.i */
public class C21174i extends C20508b {

    /* renamed from: e */
    public final /* synthetic */ int f59896e;

    /* renamed from: f */
    public final /* synthetic */ List f59897f;

    /* renamed from: g */
    public final /* synthetic */ C21164g f59898g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21174i(C21164g gVar, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f59898g = gVar;
        this.f59896e = i;
        this.f59897f = list;
    }

    /* renamed from: a */
    public void mo31966a() {
        this.f59898g.f59864p.getClass();
        try {
            this.f59898g.f59852A.mo33160i(this.f59896e, C21156b.CANCEL);
            synchronized (this.f59898g) {
                this.f59898g.f59854C.remove(Integer.valueOf(this.f59896e));
            }
        } catch (IOException unused) {
        }
    }
}
