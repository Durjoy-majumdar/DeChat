package a14;

/* renamed from: a14.c2 */
public class C53867c2 extends C53884f2 implements C0002w {

    /* renamed from: e */
    public final boolean f151110e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53867c2(C53973z1 z1Var) {
        super(true);
        boolean z = true;
        mo74534h0(z1Var);
        C53941r a0 = mo74527a0();
        C53945s sVar = a0 instanceof C53945s ? (C53945s) a0 : null;
        if (sVar != null) {
            C53884f2 u = sVar.mo74505u();
            while (true) {
                if (!u.mo74495T()) {
                    C53941r a05 = u.mo74527a0();
                    C53945s sVar2 = a05 instanceof C53945s ? (C53945s) a05 : null;
                    if (sVar2 == null) {
                        break;
                    }
                    u = sVar2.mo74505u();
                } else {
                    break;
                }
            }
            this.f151110e = z;
        }
        z = false;
        this.f151110e = z;
    }

    /* renamed from: T */
    public boolean mo74495T() {
        return this.f151110e;
    }

    /* renamed from: W */
    public boolean mo74496W() {
        return true;
    }
}
