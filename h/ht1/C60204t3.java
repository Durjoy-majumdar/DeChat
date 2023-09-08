package ht1;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C7335d;
import java.util.Set;

/* renamed from: ht1.t3 */
public interface C60204t3 extends C7335d {

    /* renamed from: ht1.t3$a */
    public static final class C8805a {
        /* renamed from: a */
        public static /* synthetic */ void m8622a(C60204t3 t3Var, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                t3Var.mo78748Pm(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearAllFinderTaskActivity");
        }
    }

    /* renamed from: AG */
    void mo78740AG(MMActivity mMActivity);

    void B50(AppCompatActivity appCompatActivity);

    /* renamed from: GN */
    Activity mo78742GN();

    boolean Gs0();

    /* renamed from: H5 */
    void mo78744H5();

    boolean Kv0(Context context);

    /* renamed from: N */
    boolean mo78746N();

    /* renamed from: PV */
    void mo78747PV(MMActivity mMActivity);

    /* renamed from: Pm */
    void mo78748Pm(boolean z);

    /* renamed from: b2 */
    boolean mo78749b2(Activity activity);

    /* renamed from: c5 */
    Set<Activity> mo78750c5();

    /* renamed from: dB */
    void mo78751dB(AppCompatActivity appCompatActivity);

    boolean fe0();

    boolean iu0(Activity activity);

    /* renamed from: kf */
    void mo78754kf(Context context, int i);

    /* renamed from: lM */
    void mo78755lM();

    void s20();

    Activity ub0();

    /* renamed from: w2 */
    void mo78759w2();
}
