package ht1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import di3.C7335d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import java.io.Serializable;
import java.util.Map;
import rx3.C13598b0;
import te3.m74;

/* renamed from: ht1.w3 */
public interface C98522w3 extends C7335d {

    /* renamed from: ht1.w3$a */
    public enum C8810a {
        FINDER_POI_FROM_TYPE_SNS,
        FINDER_POI_FROM_TYPE_FINDER,
        FINDER_POI_FROM_TYPE_MAP
    }

    /* renamed from: ht1.w3$b */
    public enum C8811b {
        FINDER_POI_REDIRECT_TYPE_DEFAULT,
        FINDER_POI_REDIRECT_TYPE_MAP
    }

    /* renamed from: ht1.w3$d */
    public interface C8812d {
        /* renamed from: a */
        void mo9639a(C8811b bVar);
    }

    /* renamed from: ht1.w3$c */
    public interface C98523c {
        /* renamed from: a */
        void mo12764a(C32224a<Boolean> aVar);

        /* renamed from: b */
        boolean mo12765b();

        /* renamed from: c */
        void mo12766c(C32226l<? super Float, Boolean> lVar);

        /* renamed from: d */
        void mo12767d(C32227p<? super Float, ? super Float, C13598b0> pVar);

        /* renamed from: e */
        void mo12768e(C32227p<? super Float, ? super Float, Boolean> pVar);

        /* renamed from: f */
        void mo12769f(C32224a<Boolean> aVar);
    }

    /* renamed from: Ai */
    void mo3990Ai(View view, boolean z, boolean z2, String str, Map<String, Object> map);

    /* renamed from: CD */
    long mo3991CD();

    /* renamed from: QP */
    void mo3992QP(Activity activity, Map<String, ? extends Object> map);

    /* renamed from: YH */
    C98523c mo3993YH(FragmentActivity fragmentActivity, int i, m74 m74, boolean z, boolean z2, Serializable serializable, boolean z3, int i2);

    /* renamed from: aU */
    void mo3994aU(Context context, m74 m74, C8810a aVar, int i, String str, C8812d dVar);
}
