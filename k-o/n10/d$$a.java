package n10;

import com.tencent.p014mm.flutter.p837ui.FlutterViewEngine;
import gy3.C87412m;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.FlutterView;

public final /* synthetic */ class d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterViewEngine f351815d;

    public /* synthetic */ d$$a(FlutterViewEngine flutterViewEngine) {
        this.f351815d = flutterViewEngine;
    }

    public final void run() {
        FlutterViewEngine flutterViewEngine = this.f351815d;
        C87412m.m108594g(flutterViewEngine, "this$0");
        Log.m165288i(flutterViewEngine.f343936w, "do switchToSurfaceView onNextFrameDisplayed");
        FlutterView flutterView = flutterViewEngine.f343927n;
        if (flutterView != null) {
            flutterView.switchSurface(true);
        }
        flutterViewEngine.mo174309g();
        if (flutterViewEngine.f343935v == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            flutterViewEngine.f343935v = currentTimeMillis;
            Log.m165288i(flutterViewEngine.f343936w, C87412m.m108600m("mark snapshotRenderMills:", Long.valueOf(currentTimeMillis)));
        }
    }
}
