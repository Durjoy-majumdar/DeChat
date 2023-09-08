package fg2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import gy3.C87412m;

/* renamed from: fg2.j */
public final class C75758j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f222360d;

    public C75758j(RadarMemberView radarMemberView) {
        this.f222360d = radarMemberView;
    }

    public final void run() {
        View currentFocus;
        if (this.f222360d.getContext() instanceof Activity) {
            int i = RadarMemberView.f203296C;
            Context context = this.f222360d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            Object systemService = activity.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null && (currentFocus = activity.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
                inputMethodManager.toggleSoftInput(0, 2);
            }
        }
    }
}
