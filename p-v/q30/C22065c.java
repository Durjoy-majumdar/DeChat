package q30;

import di3.C86312j;
import ht1.C60200t1;
import k30.C99096a;
import ky2.C10432i;

/* renamed from: q30.c */
public class C22065c implements C99096a.C99098b {

    /* renamed from: a */
    public final /* synthetic */ C22073k f62447a;

    public C22065c(C22073k kVar) {
        this.f62447a = kVar;
    }

    public Object getData() {
        Class cls = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        boolean z = true;
        boolean z2 = !C22073k.m25483b(this.f62447a, 34359738368L);
        boolean z3 = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        if (!sF || !z2 || z3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
