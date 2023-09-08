package com.tencent.maas.handlebox.detector;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.MJHandleBoxUtilsKt;
import com.tencent.maas.handlebox.detector.ScaleGestureDetector;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, mo182094d2 = {"com/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector$scaleDetector$1", "Lcom/tencent/maas/handlebox/detector/ScaleGestureDetector$OnScaleGestureListener;", "Lcom/tencent/maas/handlebox/detector/ScaleGestureDetector;", "detector", "", "onScaleBegin", "onScale", "Lrx3/b0;", "onScaleEnd", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class MJHandleBoxGestureDetector$scaleDetector$1 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ MJHandleBoxGestureDetector this$0;

    public MJHandleBoxGestureDetector$scaleDetector$1(MJHandleBoxGestureDetector mJHandleBoxGestureDetector) {
        this.this$0 = mJHandleBoxGestureDetector;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        MJHandleBoxGestureDetector mJHandleBoxGestureDetector = this.this$0;
        mJHandleBoxGestureDetector.scaleFactor = mJHandleBoxGestureDetector.scaleFactor * scaleGestureDetector.getScaleFactor();
        MJHandleBoxGestureDetector mJHandleBoxGestureDetector2 = this.this$0;
        mJHandleBoxGestureDetector2.scaleFactor = Math.max(0.1f, Math.min(mJHandleBoxGestureDetector2.scaleFactor, 5.0f));
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onScale ScaleFactor: " + this.this$0.scaleFactor + ", detector.scaleFactor: " + scaleGestureDetector.getScaleFactor());
        this.this$0.getGestureDetectorListener().onScale(this.this$0.scaleFactor);
        Rect2 access$getCurRect$p = this.this$0.curRect;
        if (access$getCurRect$p == null) {
            return true;
        }
        MJHandleBoxGestureDetector mJHandleBoxGestureDetector3 = this.this$0;
        mJHandleBoxGestureDetector3.getGestureDetectorListener().onCurRectChanged(access$getCurRect$p, new Vec2(mJHandleBoxGestureDetector3.scaleFactor, mJHandleBoxGestureDetector3.scaleFactor), (float) Math.toRadians((double) mJHandleBoxGestureDetector3.rotationVal));
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onScaleBegin");
        this.this$0.isScaling = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onScaleEnd");
        this.this$0.isScaling = false;
        this.this$0.getGestureDetectorListener().onScaleEnd();
    }
}
