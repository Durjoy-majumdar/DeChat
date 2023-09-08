package rs1;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0316c;
import fy3.C32226l;
import gr1.C59670o2;
import mt1.C61580b;
import pl1.C62369u0;
import rx3.C13598b0;

/* renamed from: rs1.lb */
public interface C63566lb extends C0316c {

    /* renamed from: rs1.lb$a */
    public static final class C13324a {
        /* renamed from: a */
        public static /* synthetic */ void m12677a(C63566lb lbVar, boolean z, Context context, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    context = null;
                }
                lbVar.mo80070Y(z, context);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttachVideoMute");
        }
    }

    /* renamed from: B0 */
    void mo80066B0(C32226l<? super C59670o2, Boolean> lVar);

    /* renamed from: F2 */
    void mo80067F2(C61580b bVar);

    /* renamed from: N */
    void mo80068N(Context context);

    /* renamed from: R */
    void mo80069R(ViewGroup viewGroup, C62369u0 u0Var, C32226l<? super C59670o2, C13598b0> lVar);

    /* renamed from: Y */
    void mo80070Y(boolean z, Context context);

    /* renamed from: Z2 */
    void mo80071Z2();

    /* renamed from: a0 */
    void mo80072a0();

    /* renamed from: c1 */
    void mo80073c1(C59670o2 o2Var);

    /* renamed from: f1 */
    void mo80076f1(Context context);

    /* renamed from: j0 */
    void mo80080j0(AppCompatActivity appCompatActivity, boolean z);

    /* renamed from: j1 */
    void mo80081j1(C61580b bVar);

    /* renamed from: k0 */
    void mo80083k0(ViewGroup viewGroup, boolean z, boolean z2);

    /* renamed from: x */
    C59670o2 mo80085x(Context context);
}
