package p176jc;

import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.Log;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;

/* renamed from: jc.e0 */
public final class C87922e0 implements FlutterUiDisplayListener {

    /* renamed from: a */
    public final /* synthetic */ SkylineView f254467a;

    public C87922e0(SkylineView skylineView) {
        this.f254467a = skylineView;
    }

    public void onFlutterUiDisplayed() {
        Log.m105924i("SkylineView", "onFlutterUiDisplayed id:" + this.f254467a.f235004d + ", stack:" + android.util.Log.getStackTraceString(new Throwable()));
    }

    public void onFlutterUiNoLongerDisplayed() {
        Log.m105924i("SkylineView", "onFlutterUiNoLongerDisplayed id:" + this.f254467a.f235004d);
    }
}
