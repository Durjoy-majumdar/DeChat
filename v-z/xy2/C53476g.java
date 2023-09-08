package xy2;

import f40.C86709a0;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qy2.C47902u;
import sy2.C48507a;
import uz2.C52682g;
import uz2.C52684h;

/* renamed from: xy2.g */
public final class C53476g implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C48507a f150388d;

    /* renamed from: e */
    public final /* synthetic */ C47902u.C36207b f150389e;

    public C53476g(C48507a aVar, C47902u.C36207b bVar) {
        this.f150388d = aVar;
        this.f150389e = bVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C47902u.C36207b bVar;
        C89137b0 d = C86709a0.m107524d();
        this.f150388d.getClass();
        d.mo123469o(5829, this);
        C89137b0 d2 = C86709a0.m107524d();
        this.f150388d.getClass();
        d2.mo123470p(5829, this);
        if (i == 0 && i2 == 0) {
            C52682g gVar = this.f150388d.f129736i;
            if (gVar != null && (bVar = this.f150389e) != null) {
                bVar.mo60567a(true, gVar.f147109d);
                return;
            }
            return;
        }
        C47902u.C36207b bVar2 = this.f150389e;
        if (bVar2 != null) {
            bVar2.mo60567a(false, (List<C52684h>) null);
        }
    }
}
