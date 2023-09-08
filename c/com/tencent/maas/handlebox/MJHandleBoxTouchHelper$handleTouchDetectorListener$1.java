package com.tencent.maas.handlebox;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.detector.MJHandleBoxGestureDetectorListener;
import com.tencent.maas.handlebox.model.MJHandleBoxItem;
import com.tencent.maas.model.MJEdgeInsets;
import com.tencent.thumbplayer.api.TPOptionalID;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016J(\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J(\u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0016J \u0010$\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016¨\u0006)"}, mo182094d2 = {"com/tencent/maas/handlebox/MJHandleBoxTouchHelper$handleTouchDetectorListener$1", "Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;", "Lcom/tencent/maas/base/Rect2;", "getCurRect", "Lcom/tencent/maas/base/Vec2;", "pos", "size", "Lrx3/b0;", "onSingleTap", "onDoubleTapOnCurRect", "", "scaleFactor", "onScale", "onScaleEnd", "rotation", "onRotation", "disX", "disY", "newRect", "newSize", "onMove", "onTouchEventUp", "onDetectorActionDown", "onDetectorActionUp", "onRTClick", "onRBClick", "onLTClick", "onLBClick", "", "lt", "lb", "rt", "rb", "onCurRectAfterChanged", "curRect", "scale", "onCurRectChanged", "", "center", "onScrollHorizontalCenter", "onScrollVerticalCenter", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class MJHandleBoxTouchHelper$handleTouchDetectorListener$1 extends MJHandleBoxGestureDetectorListener {
    public final /* synthetic */ MJHandleBoxTouchHelper this$0;

    public MJHandleBoxTouchHelper$handleTouchDetectorListener$1(MJHandleBoxTouchHelper mJHandleBoxTouchHelper) {
        this.this$0 = mJHandleBoxTouchHelper;
    }

    public Rect2 getCurRect() {
        return this.this$0.curRect;
    }

    public void onCurRectAfterChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(fArr, "lt");
        C87412m.m108594g(fArr2, "lb");
        C87412m.m108594g(fArr3, "rt");
        C87412m.m108594g(fArr4, "rb");
        MJHandleBoxTouchHelperListener access$getHandleBoxTouchHelperListener$p = this.this$0.handleBoxTouchHelperListener;
        if (access$getHandleBoxTouchHelperListener$p != null) {
            access$getHandleBoxTouchHelperListener$p.onCurRectPosAfterChanged(fArr, fArr2, fArr3, fArr4);
        }
    }

    public void onCurRectChanged(Rect2 rect2, Vec2 vec2, float f) {
        MJHandleBoxTouchHelperListener access$getHandleBoxTouchHelperListener$p;
        C87412m.m108594g(rect2, "curRect");
        C87412m.m108594g(vec2, "scale");
        if (this.this$0.getCurSegmentID() != null && (access$getHandleBoxTouchHelperListener$p = this.this$0.handleBoxTouchHelperListener) != null) {
            access$getHandleBoxTouchHelperListener$p.onCurRectChanged(rect2, vec2, f);
        }
    }

    public void onDetectorActionDown() {
        this.this$0.isGestureDetecting = true;
    }

    public void onDetectorActionUp() {
        this.this$0.isGestureDetecting = false;
    }

    public void onDoubleTapOnCurRect() {
        String curSegmentID;
        if (this.this$0.getEnable() && (curSegmentID = this.this$0.getCurSegmentID()) != null) {
            this.this$0.handleBoxListener.didDoubleTapOnSegment(curSegmentID);
        }
    }

    public void onLBClick() {
        this.this$0.onCornerClick(MJHandleBoxItem.MJRectCorner.MJRectCornerBottomLeft);
    }

    public void onLTClick() {
        this.this$0.onCornerClick(MJHandleBoxItem.MJRectCorner.MJRectCornerTopLeft);
    }

    public void onMove(float f, float f2, Rect2 rect2, Vec2 vec2) {
        String curSegmentID;
        MJHandleBoxTouchHelper mJHandleBoxTouchHelper;
        MJEdgeInsets access$getCurEdgeInsets$p;
        C87412m.m108594g(rect2, "newRect");
        C87412m.m108594g(vec2, "newSize");
        C87412m.m108600m("onMove enable: ", Boolean.valueOf(this.this$0.getEnable()));
        if (this.this$0.getEnable() && (curSegmentID = this.this$0.getCurSegmentID()) != null && (access$getCurEdgeInsets$p = mJHandleBoxTouchHelper.curEdgeInsets) != null) {
            Rect2 invertEdgeInsets = (mJHandleBoxTouchHelper = this.this$0).invertEdgeInsets(rect2, access$getCurEdgeInsets$p);
            float f3 = (float) 2;
            Vec2 vec22 = new Vec2(invertEdgeInsets.getOrigin().f309908x + (invertEdgeInsets.getSize().f309908x / f3), invertEdgeInsets.getOrigin().f309909y + (invertEdgeInsets.getSize().f309909y / f3));
            MJHandleBoxUtilsKt.log("MJHandleBoxTouchHelper", "originalRect: [" + invertEdgeInsets.getOrigin().f309908x + ", " + invertEdgeInsets.getOrigin().f309909y + "], [" + invertEdgeInsets.getSize().f309908x + ", " + invertEdgeInsets.getSize().f309909y + "], position: " + vec22);
            mJHandleBoxTouchHelper.handleBoxListener.didUpdatePosition(curSegmentID, vec22);
            mJHandleBoxTouchHelper.getMovieSession().onUpdateSegmentPosition(vec22, new Rect2(new Vec2(0.0f, 0.0f), new Vec2(mJHandleBoxTouchHelper.getViewSize().f309908x, mJHandleBoxTouchHelper.getViewSize().f309909y)));
            mJHandleBoxTouchHelper.commitAction("setLayerPositionForSegment");
            mJHandleBoxTouchHelper.handleBoxListener.onMoveSegmentToBtm(vec22.f309909y > mJHandleBoxTouchHelper.getViewSize().f309909y - ((float) TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE));
            if (!mJHandleBoxTouchHelper.isMoving) {
                mJHandleBoxTouchHelper.isMoving = true;
                mJHandleBoxTouchHelper.handleBoxListener.onMoveSegment();
            }
        }
    }

    public void onRBClick() {
        this.this$0.onCornerClick(MJHandleBoxItem.MJRectCorner.MJRectCornerBottomRight);
    }

    public void onRTClick() {
        this.this$0.onCornerClick(MJHandleBoxItem.MJRectCorner.MJRectCornerTopRight);
    }

    public void onRotation(float f) {
        String curSegmentID;
        if (this.this$0.getEnable() && (curSegmentID = this.this$0.getCurSegmentID()) != null) {
            MJHandleBoxTouchHelper mJHandleBoxTouchHelper = this.this$0;
            mJHandleBoxTouchHelper.handleBoxListener.didUpdateRotation(curSegmentID, -((float) Math.toDegrees((double) f)));
            mJHandleBoxTouchHelper.getMovieSession().onUpdateSegmentRotation(f);
            mJHandleBoxTouchHelper.commitAction("setLayerRotationForSegment");
        }
    }

    public void onScale(float f) {
        String curSegmentID;
        if (this.this$0.getEnable() && (curSegmentID = this.this$0.getCurSegmentID()) != null) {
            MJHandleBoxTouchHelper mJHandleBoxTouchHelper = this.this$0;
            mJHandleBoxTouchHelper.handleBoxListener.didUpdateScale(curSegmentID, f);
            mJHandleBoxTouchHelper.getMovieSession().onUpdateSegmentScale(f);
            mJHandleBoxTouchHelper.commitAction("setLayerScaleForSegment");
        }
    }

    public void onScaleEnd() {
        super.onScaleEnd();
        if (this.this$0.getEnable()) {
            this.this$0.getMovieSession().onUpdateSegmentScaleDidFinish();
            this.this$0.commitAction("onUpdateSegmentScaleDidFinish");
        }
    }

    public void onScrollHorizontalCenter(boolean z) {
        MJHandleBoxTouchHelperListener access$getHandleBoxTouchHelperListener$p;
        if (this.this$0.getCurSegmentID() != null && (access$getHandleBoxTouchHelperListener$p = this.this$0.handleBoxTouchHelperListener) != null) {
            access$getHandleBoxTouchHelperListener$p.onScrollHorizontalCenter(z);
        }
    }

    public void onScrollVerticalCenter(boolean z) {
        MJHandleBoxTouchHelperListener access$getHandleBoxTouchHelperListener$p;
        if (this.this$0.getCurSegmentID() != null && (access$getHandleBoxTouchHelperListener$p = this.this$0.handleBoxTouchHelperListener) != null) {
            access$getHandleBoxTouchHelperListener$p.onScrollVerticalCenter(z);
        }
    }

    public void onSingleTap(Vec2 vec2, Vec2 vec22) {
        C87412m.m108594g(vec2, "pos");
        C87412m.m108594g(vec22, "size");
        this.this$0.getMovieSession().onTapRenderView(vec2, new Rect2(new Vec2(0.0f, 0.0f), vec22));
    }

    public void onTouchEventUp() {
        super.onTouchEventUp();
        if (this.this$0.isMoving) {
            this.this$0.isMoving = false;
            this.this$0.handleBoxListener.onMoveSegmentEnd();
        }
    }
}
