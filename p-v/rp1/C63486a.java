package rp1;

import android.content.Context;
import fj1.C45795b;
import te3.C51059r51;
import te3.C64699s51;

/* renamed from: rp1.a */
public interface C63486a {

    /* renamed from: rp1.a$a */
    public static final class C63487a {
        /* renamed from: a */
        public static /* synthetic */ void m74824a(C63486a aVar, C64699s51 s512, Boolean bool, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bool = Boolean.FALSE;
                }
                aVar.mo87860k1(s512, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPromoInfo");
        }
    }

    /* renamed from: S2 */
    C45795b mo87856S2();

    /* renamed from: U */
    void mo87857U(Context context, C51059r51 r512);

    /* renamed from: g */
    void mo10792g(int i);

    /* renamed from: k1 */
    void mo87860k1(C64699s51 s512, Boolean bool);

    /* renamed from: t2 */
    void mo87861t2(C51059r51 r512);
}
