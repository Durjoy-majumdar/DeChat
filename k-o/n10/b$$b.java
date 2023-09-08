package n10;

import android.view.View;
import com.tencent.p014mm.flutter.p837ui.FlutterViewEngine;
import gy3.C87412m;

public final /* synthetic */ class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterViewEngine f351811d;

    public /* synthetic */ b$$b(FlutterViewEngine flutterViewEngine) {
        this.f351811d = flutterViewEngine;
    }

    public final void run() {
        FlutterViewEngine flutterViewEngine = this.f351811d;
        C87412m.m108594g(flutterViewEngine, "this$0");
        int childCount = flutterViewEngine.mo174304b().getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = flutterViewEngine.mo174304b().getChildAt(i);
            if (C87412m.m108589b(childAt, flutterViewEngine.f343928o)) {
                flutterViewEngine.mo174304b().removeView(childAt);
            }
            i = i2;
        }
        flutterViewEngine.f343928o = null;
    }
}
