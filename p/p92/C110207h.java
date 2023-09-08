package p92;

import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: p92.h */
public final class C110207h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110208i f329694d;

    public C110207h(C110208i iVar) {
        this.f329694d = iVar;
    }

    public final void run() {
        C110208i iVar = this.f329694d;
        if (iVar.f329695d != null) {
            iVar.getClass();
            C110204d dVar = this.f329694d.f329695d;
            if (dVar != null) {
                MultiTaskFloatBallView multiTaskFloatBallView = dVar.f329685a;
                if (multiTaskFloatBallView != null && multiTaskFloatBallView.getVisibility() == 0) {
                    MultiTaskFloatBallView multiTaskFloatBallView2 = dVar.f329685a;
                    if (multiTaskFloatBallView2 != null && multiTaskFloatBallView2.getVisibility() == 0) {
                        MultiTaskFloatBallView multiTaskFloatBallView3 = dVar.f329685a;
                        Boolean valueOf = multiTaskFloatBallView3 != null ? Boolean.valueOf(multiTaskFloatBallView3.f315153u) : null;
                        Log.m105925i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", valueOf);
                        if (C87412m.m108589b(valueOf, Boolean.TRUE)) {
                            MultiTaskFloatBallView multiTaskFloatBallView4 = dVar.f329685a;
                            if (multiTaskFloatBallView4 != null) {
                                multiTaskFloatBallView4.mo151063f(new C110202b(dVar));
                            }
                        } else {
                            MultiTaskFloatBallView multiTaskFloatBallView5 = dVar.f329685a;
                            if (multiTaskFloatBallView5 != null) {
                                multiTaskFloatBallView5.mo151062e(false, false, (AnimatorListenerAdapter) null);
                            }
                            dVar.mo161609a();
                        }
                    }
                } else {
                    dVar.mo161609a();
                }
            }
            this.f329694d.f329695d = null;
        }
    }
}
