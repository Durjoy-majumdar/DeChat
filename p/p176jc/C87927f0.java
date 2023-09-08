package p176jc;

import com.tencent.luggage.skyline.SkylineView;
import com.tencent.skyline.SkylineLogic;
import lu3.C109426i;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;

/* renamed from: jc.f0 */
public final class C87927f0 implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f254482d;

    public C87927f0(SkylineView skylineView) {
        this.f254482d = skylineView;
    }

    public String getKey() {
        return "";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        SkylineView skylineView = this.f254482d;
        skylineView.getClass();
        FlutterRenderer obtainRenderer = SkylineLogic.INSTANCE.obtainRenderer(skylineView.f235004d);
        if (obtainRenderer != null) {
            obtainRenderer.addIsDisplayingFlutterUiListener(new C87922e0(this.f254482d));
        }
    }
}
