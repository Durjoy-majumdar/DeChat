package n10;

import com.tencent.p014mm.flutter.p837ui.FlutterViewEngine;
import gy3.C87412m;
import p172io.flutter.Log;

public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterViewEngine f351810d;

    public /* synthetic */ b$$a(FlutterViewEngine flutterViewEngine) {
        this.f351810d = flutterViewEngine;
    }

    public final void run() {
        FlutterViewEngine flutterViewEngine = this.f351810d;
        C87412m.m108594g(flutterViewEngine, "this$0");
        flutterViewEngine.mo174309g();
        if (flutterViewEngine.f343935v == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            flutterViewEngine.f343935v = currentTimeMillis;
            Log.m165288i(flutterViewEngine.f343936w, C87412m.m108600m("mark snapshotRenderMills:", Long.valueOf(currentTimeMillis)));
        }
    }
}
