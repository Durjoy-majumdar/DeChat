package vi1;

import android.view.animation.AccelerateInterpolator;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import wi1.C66119d;
import wi1.C66124f;

/* renamed from: vi1.d */
public final class C65754d<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C65750a f189159d;

    public C65754d(C65750a aVar) {
        this.f189159d = aVar;
    }

    public void onChanged(Object obj) {
        Integer num = (Integer) obj;
        C66119d c1 = this.f189159d.mo89761c1();
        C87412m.m108593f(num, LocaleUtil.ITALIAN);
        boolean z = true;
        float intValue = (((float) 1) - (((float) num.intValue()) / 100.0f)) * ((float) c1.f190046n);
        float translationY = c1.f190043h.f175463d.getTranslationY();
        Log.m105924i("LiveMicIntercomWindow", "onVolumeChange voiceOriginHeight: " + c1.f190046n + " volume: dvolume targetY: " + intValue + " currentY: " + translationY + " isVolumeChangeFinish: " + c1.f190048p + " isPanelOpen: " + c1.f190049q);
        if (c1.f190048p) {
            if (translationY != intValue) {
                z = false;
            }
            if (!z && c1.f190049q) {
                c1.f190048p = false;
                c1.f190043h.f175463d.animate().translationY(intValue).setDuration(500).setInterpolator(new AccelerateInterpolator()).setListener(new C66124f(c1)).start();
            }
        }
    }
}
