package fu0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: fu0.b */
public final class C87094b implements ViewManager {

    /* renamed from: d */
    public final WindowManager f252694d;

    public C87094b(WindowManager windowManager) {
        C87412m.m108594g(windowManager, "windowManager");
        this.f252694d = windowManager;
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Log.m105924i("MicroMsg.WMPFVoip.WindowManagerProxy", "addView() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f252694d.addView(view, layoutParams);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WMPFVoip.WindowManagerProxy", "addView: ", e);
        }
    }

    public void removeView(View view) {
        Log.m105924i("MicroMsg.WMPFVoip.WindowManagerProxy", "removeView() called with: view = " + view);
        try {
            this.f252694d.removeView(view);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout: ", e);
        }
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        Log.m105924i("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f252694d.updateViewLayout(view, layoutParams);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout: ", e);
        }
    }
}
