package androidx.compose.p002ui.platform;

import android.view.RenderNode;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.t1 */
public final class C103688t1 {

    /* renamed from: a */
    public static final C103688t1 f306259a = new C103688t1();

    /* renamed from: a */
    public final int mo144857a(RenderNode renderNode) {
        C87412m.m108594g(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    /* renamed from: b */
    public final int mo144858b(RenderNode renderNode) {
        C87412m.m108594g(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    /* renamed from: c */
    public final void mo144859c(RenderNode renderNode, int i) {
        C87412m.m108594g(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    /* renamed from: d */
    public final void mo144860d(RenderNode renderNode, int i) {
        C87412m.m108594g(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
