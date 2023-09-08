package wt1;

import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;
import vt1.C78474b;

/* renamed from: wt1.p */
public class C78700p implements C78474b {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthUI f230406d;

    public C78700p(FingerPrintAuthUI fingerPrintAuthUI) {
        this.f230406d = fingerPrintAuthUI;
    }

    /* renamed from: n */
    public void mo94918n(int i, String str) {
        if (i == 0) {
            FingerPrintAuthUI fingerPrintAuthUI = this.f230406d;
            fingerPrintAuthUI.f198204i.mo107888c(fingerPrintAuthUI, "0", 1);
        } else if (i == -1) {
            FingerPrintAuthUI fingerPrintAuthUI2 = this.f230406d;
            int i2 = FingerPrintAuthUI.f198198n;
            fingerPrintAuthUI2.getClass();
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (currentTimeMillis - fingerPrintAuthUI2.f198203h > 1) {
                fingerPrintAuthUI2.f198203h = currentTimeMillis;
                fingerPrintAuthUI2.f198199d.setText(C0966R.string.eu7);
                fingerPrintAuthUI2.f198199d.setTextColor(fingerPrintAuthUI2.getResources().getColor(C0966R.color.a_0));
                fingerPrintAuthUI2.f198199d.setVisibility(4);
                if (fingerPrintAuthUI2.f198202g == null) {
                    fingerPrintAuthUI2.f198202g = AnimationUtils.loadAnimation(fingerPrintAuthUI2.getContext(), C0966R.C0968anim.f2401c5);
                }
                fingerPrintAuthUI2.f198199d.startAnimation(fingerPrintAuthUI2.f198202g);
                MMHandlerThread.postToMainThreadDelayed(new C78702q(fingerPrintAuthUI2), fingerPrintAuthUI2.f198202g.getDuration());
            }
        } else if (i == -3) {
            FingerPrintAuthUI fingerPrintAuthUI3 = this.f230406d;
            fingerPrintAuthUI3.f198201f = false;
            if (Util.isNullOrNil(str)) {
                str = fingerPrintAuthUI3.getString(C0966R.string.eud);
            }
            C76879j.m92709C(fingerPrintAuthUI3, str, "", fingerPrintAuthUI3.getString(C0966R.string.l_w), fingerPrintAuthUI3.getString(C0966R.string.ktq), false, new C78703r(fingerPrintAuthUI3, i), new C78704s(fingerPrintAuthUI3, i));
        } else {
            FingerPrintAuthUI fingerPrintAuthUI4 = this.f230406d;
            int i3 = FingerPrintAuthUI.f198198n;
            fingerPrintAuthUI4.mo94928H7(str, i);
        }
    }
}
