package p176jc;

import android.app.Activity;
import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineLogic;
import fy3.C32224a;
import gy3.C87413o;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.plugin.platform.PlatformPlugin;
import rx3.C13598b0;

/* renamed from: jc.d0 */
public final class C87920d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f254464d;

    /* renamed from: e */
    public final /* synthetic */ Activity f254465e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87920d0(SkylineView skylineView, Activity activity) {
        super(0);
        this.f254464d = skylineView;
        this.f254465e = activity;
    }

    public Object invoke() {
        FlutterEngine flutterEngine;
        Log.m105924i("SkylineView", "id:" + this.f254464d.f235004d + " attachToActivity platformPlugin:" + this.f254464d.f235019v);
        SkylineView skylineView = this.f254464d;
        if (skylineView.f235019v == null && (flutterEngine = SkylineLogic.INSTANCE.getFlutterEngine(skylineView.f235004d)) != null) {
            this.f254464d.f235019v = new PlatformPlugin(this.f254465e, flutterEngine.getPlatformChannel());
        }
        return C13598b0.f38549a;
    }
}
