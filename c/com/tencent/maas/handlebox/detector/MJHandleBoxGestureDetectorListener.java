package com.tencent.maas.handlebox.detector;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016J(\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J(\u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0016J \u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016¨\u0006+"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;", "", "Lcom/tencent/maas/base/Rect2;", "getCurRect", "Lcom/tencent/maas/base/Vec2;", "pos", "size", "Lrx3/b0;", "onSingleTap", "onDoubleTapOnCurRect", "", "scaleFactor", "onScale", "onScaleEnd", "rotation", "onRotation", "disX", "disY", "newRect", "newSize", "onMove", "onTouchEventUp", "onDetectorActionDown", "onDetectorActionUp", "onRTClick", "onRBClick", "onLTClick", "onLBClick", "", "lt", "lb", "rt", "rb", "onCurRectAfterChanged", "curRect", "scale", "onCurRectChanged", "", "center", "onScrollVerticalCenter", "onScrollHorizontalCenter", "<init>", "()V", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public abstract class MJHandleBoxGestureDetectorListener {
    public abstract Rect2 getCurRect();

    public void onCurRectAfterChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "lt");
        C87412m.m108594g(fArr2, "lb");
        C87412m.m108594g(fArr3, "rt");
        C87412m.m108594g(fArr4, "rb");
    }

    public void onCurRectChanged(Rect2 rect2, Vec2 vec2, float f) {
        C87412m.m108594g(rect2, "curRect");
        C87412m.m108594g(vec2, "scale");
    }

    public void onDetectorActionDown() {
    }

    public void onDetectorActionUp() {
    }

    public void onDoubleTapOnCurRect() {
    }

    public void onLBClick() {
    }

    public void onLTClick() {
    }

    public void onMove(float f, float f2, Rect2 rect2, Vec2 vec2) {
        C87412m.m108594g(rect2, "newRect");
        C87412m.m108594g(vec2, "newSize");
    }

    public void onRBClick() {
    }

    public void onRTClick() {
    }

    public void onRotation(float f) {
    }

    public void onScale(float f) {
    }

    public void onScaleEnd() {
    }

    public void onScrollHorizontalCenter(boolean z) {
    }

    public void onScrollVerticalCenter(boolean z) {
    }

    public void onSingleTap(Vec2 vec2, Vec2 vec22) {
        C87412m.m108594g(vec2, "pos");
        C87412m.m108594g(vec22, "size");
    }

    public void onTouchEventUp() {
    }
}
