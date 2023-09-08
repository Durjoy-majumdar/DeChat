package p004b0;

import java.util.List;

/* renamed from: b0.k0 */
public final class C103951k0 {

    /* renamed from: a */
    public static final float f307411a = ((float) 2500);

    /* renamed from: b */
    public static final float f307412b = ((float) 1500);

    /* renamed from: a */
    public static final C54380k m138678a(C103953l0 l0Var, int i) {
        C54380k kVar;
        List<C54380k> f = l0Var.mo145573g().mo55835f();
        int size = f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                kVar = null;
                break;
            }
            kVar = f.get(i2);
            if (kVar.getIndex() == i) {
                break;
            }
            i2++;
        }
        return kVar;
    }
}
