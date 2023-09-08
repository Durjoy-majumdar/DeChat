package p233s3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import p233s3.C101526p;

/* renamed from: s3.a */
public final class C101506a implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a */
    public List<Window.OnFrameMetricsAvailableListener> f297217a;

    public C101506a(List<Window.OnFrameMetricsAvailableListener> list) {
        C87412m.m108594g(list, "delegates");
        this.f297217a = list;
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        for (Window.OnFrameMetricsAvailableListener onFrameMetricsAvailable : this.f297217a) {
            onFrameMetricsAvailable.onFrameMetricsAvailable(window, frameMetrics, i);
        }
        if ((window != null ? window.getDecorView() : null) != null) {
            View decorView = window.getDecorView();
            C87412m.m108593f(decorView, "window.decorView");
            ViewParent viewParent = decorView.getParent();
            while (viewParent instanceof View) {
                decorView = (View) viewParent;
                viewParent = decorView.getParent();
            }
            Object tag = decorView.getTag(C0966R.C0970id.mtt);
            if (tag == null) {
                tag = new C101526p.C101527a();
                decorView.setTag(C0966R.C0970id.mtt, tag);
            }
            C101526p pVar = ((C101526p.C101527a) tag).f297258a;
            if (pVar != null) {
                pVar.mo141011b();
            }
        }
    }
}
