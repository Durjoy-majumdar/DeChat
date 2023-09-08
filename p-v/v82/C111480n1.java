package v82;

import android.view.View;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.ScreenCastBigView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: v82.n1 */
public final class C111480n1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScreenCastBigView f333770d;

    /* renamed from: e */
    public final /* synthetic */ View f333771e;

    public C111480n1(ScreenCastBigView screenCastBigView, View view) {
        this.f333770d = screenCastBigView;
        this.f333771e = view;
    }

    public final void run() {
        Log.m105924i("MicroMsg.MT.ScreenCastBigView", "dismiss ori dialog");
        if (C87412m.m108589b(this.f333770d.f315012h, this.f333771e)) {
            this.f333770d.removeView(this.f333771e);
            ScreenCastBigView screenCastBigView = this.f333770d;
            screenCastBigView.f315012h = null;
            screenCastBigView.f315009e = 0;
        }
    }
}
