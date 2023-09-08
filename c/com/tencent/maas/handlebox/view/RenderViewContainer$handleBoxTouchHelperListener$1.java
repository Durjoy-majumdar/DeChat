package com.tencent.maas.handlebox.view;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.MJHandleBoxTouchHelperListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u0010"}, mo182094d2 = {"com/tencent/maas/handlebox/view/RenderViewContainer$handleBoxTouchHelperListener$1", "Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelperListener;", "Lcom/tencent/maas/base/Rect2;", "curRect", "Lcom/tencent/maas/base/Vec2;", "scale", "", "rotation", "Lrx3/b0;", "onCurRectChanged", "", "lt", "lb", "rt", "rb", "onCurRectPosAfterChanged", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class RenderViewContainer$handleBoxTouchHelperListener$1 extends MJHandleBoxTouchHelperListener {
    public final /* synthetic */ RenderViewContainer this$0;

    public RenderViewContainer$handleBoxTouchHelperListener$1(RenderViewContainer renderViewContainer) {
        this.this$0 = renderViewContainer;
    }

    public void onCurRectChanged(Rect2 rect2, Vec2 vec2, float f) {
        C87412m.m108594g(rect2, "curRect");
        C87412m.m108594g(vec2, "scale");
        this.this$0.showBorder(rect2, vec2, f);
    }

    public void onCurRectPosAfterChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "lt");
        C87412m.m108594g(fArr2, "lb");
        C87412m.m108594g(fArr3, "rt");
        C87412m.m108594g(fArr4, "rb");
        this.this$0.updateCornerPosView(fArr, fArr2, fArr3, fArr4);
    }
}
