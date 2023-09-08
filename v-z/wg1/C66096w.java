package wg1;

import android.view.View;
import cj1.C54768h6;
import fo1.C8178c;
import java.util.List;

/* renamed from: wg1.w */
public interface C66096w extends C8178c<C66089v> {

    /* renamed from: wg1.w$a */
    public static final class C66097a {
        /* renamed from: a */
        public static /* synthetic */ void m77894a(C66096w wVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                wVar.mo90107u0(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideVolumeView");
        }
    }

    /* renamed from: B */
    void mo90095B(View view, int i, C54768h6 h6Var, int i2, int i3);

    /* renamed from: J */
    void mo90096J(int i);

    /* renamed from: a */
    void mo90097a();

    /* renamed from: f */
    void mo90098f(List<C54768h6> list);

    /* renamed from: h */
    void mo90099h(boolean z);

    /* renamed from: l */
    void mo90100l();

    /* renamed from: m */
    int[] mo90101m();

    /* renamed from: o */
    void mo90102o();

    /* renamed from: u0 */
    void mo90107u0(boolean z);
}
