package il1;

import dj1.C58291w0;
import gy3.C87412m;
import kotlin.Result;
import o40.C61926c;
import qj1.C12360e8;
import wx3.C15601d;

/* renamed from: il1.x2 */
public final class C9165x2 implements C12360e8.C12371d {

    /* renamed from: a */
    public final /* synthetic */ C9184z2 f28860a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<Boolean> f28861b;

    public C9165x2(C9184z2 z2Var, C15601d<? super Boolean> dVar) {
        this.f28860a = z2Var;
        this.f28861b = dVar;
    }

    /* renamed from: a */
    public void mo9974a(boolean z, int i, C12360e8.C12371d.C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var) {
        C87412m.m108594g(bVar, "errType");
        if (z) {
            this.f28860a.f28910x = l != null ? l.longValue() : 0;
        } else {
            int ordinal = bVar.ordinal();
            if (ordinal == 1) {
                C9184z2 z2Var = this.f28860a;
                z2Var.getClass();
                C61926c.m72668M(new C9171y2(str3, z2Var));
            } else if (ordinal == 2) {
                if (i == 10003) {
                    C9184z2 z2Var2 = this.f28860a;
                    z2Var2.getClass();
                    C61926c.m72668M(new C8936b3(z2Var2));
                } else {
                    C9184z2 z2Var3 = this.f28860a;
                    z2Var3.getClass();
                    C61926c.m72668M(new C9171y2(str3, z2Var3));
                }
            }
        }
        this.f28861b.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
    }
}
