package com.tencent.maas.handlebox.protocol;

import com.tencent.maas.base.Vec2;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/protocol/MJHandlerBoxListener;", "", "", "segmentID", "", "isTextEditable", "Lrx3/b0;", "onTapSegment", "onTapBackground", "onRemoveSegment", "didDoubleTapOnSegment", "", "scale", "didUpdateScale", "rotation", "didUpdateRotation", "Lcom/tencent/maas/base/Vec2;", "centerPos", "didUpdatePosition", "didDeleteSegment", "didFlipSegmentHorizontally", "onMoveSegment", "onMoveSegmentEnd", "isBottom", "onMoveSegmentToBtm", "<init>", "()V", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public abstract class MJHandlerBoxListener {
    public final void didDeleteSegment(String str) {
        C87412m.m108594g(str, "segmentID");
    }

    public final void didDoubleTapOnSegment(String str) {
        C87412m.m108594g(str, "segmentID");
    }

    public final void didFlipSegmentHorizontally(String str) {
        C87412m.m108594g(str, "segmentID");
    }

    public final void didUpdatePosition(String str, Vec2 vec2) {
        C87412m.m108594g(str, "segmentID");
        C87412m.m108594g(vec2, "centerPos");
    }

    public final void didUpdateRotation(String str, float f) {
        C87412m.m108594g(str, "segmentID");
    }

    public final void didUpdateScale(String str, float f) {
        C87412m.m108594g(str, "segmentID");
    }

    public void onMoveSegment() {
    }

    public void onMoveSegmentEnd() {
    }

    public void onMoveSegmentToBtm(boolean z) {
    }

    public void onRemoveSegment(String str) {
        C87412m.m108594g(str, "segmentID");
    }

    public abstract void onTapBackground();

    public abstract void onTapSegment(String str, boolean z);
}
