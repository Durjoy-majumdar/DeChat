package com.tencent.maas.handlebox;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/MJHandleBoxTouchHelperListener;", "", "", "lt", "lb", "rt", "rb", "Lrx3/b0;", "onCurRectPosAfterChanged", "Lcom/tencent/maas/base/Rect2;", "curRect", "Lcom/tencent/maas/base/Vec2;", "scale", "", "rotation", "onCurRectChanged", "", "center", "onScrollVerticalCenter", "onScrollHorizontalCenter", "<init>", "()V", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public abstract class MJHandleBoxTouchHelperListener {
    public void onCurRectChanged(Rect2 rect2, Vec2 vec2, float f) {
        C87412m.m108594g(rect2, "curRect");
        C87412m.m108594g(vec2, "scale");
    }

    public void onCurRectPosAfterChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "lt");
        C87412m.m108594g(fArr2, "lb");
        C87412m.m108594g(fArr3, "rt");
        C87412m.m108594g(fArr4, "rb");
    }

    public void onScrollHorizontalCenter(boolean z) {
    }

    public void onScrollVerticalCenter(boolean z) {
    }
}
