package com.tencent.maas.handlebox.detector;

import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.MJHandleBoxUtilsKt;
import com.tencent.maas.handlebox.detector.RotateGestureDetector;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, mo182094d2 = {"com/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector$rotateDetector$1", "Lcom/tencent/maas/handlebox/detector/RotateGestureDetector$OnRotateGestureListener;", "Lcom/tencent/maas/handlebox/detector/RotateGestureDetector;", "detector", "", "onRotateBegin", "onRotate", "Lrx3/b0;", "onRotateEnd", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class MJHandleBoxGestureDetector$rotateDetector$1 implements RotateGestureDetector.OnRotateGestureListener {
    public final /* synthetic */ MJHandleBoxGestureDetector this$0;

    public MJHandleBoxGestureDetector$rotateDetector$1(MJHandleBoxGestureDetector mJHandleBoxGestureDetector) {
        this.this$0 = mJHandleBoxGestureDetector;
    }

    public boolean onRotate(RotateGestureDetector rotateGestureDetector) {
        MJHandleBoxGestureDetector mJHandleBoxGestureDetector = this.this$0;
        mJHandleBoxGestureDetector.rotationVal = mJHandleBoxGestureDetector.rotationVal + (rotateGestureDetector == null ? 0.0f : rotateGestureDetector.getRotationDegreesDelta());
        double radians = Math.toRadians((double) this.this$0.rotationVal);
        StringBuilder sb = new StringBuilder();
        sb.append("onRotate rotationDegreesDelta: ");
        sb.append(rotateGestureDetector == null ? null : Float.valueOf(rotateGestureDetector.getRotationDegreesDelta()));
        sb.append(", rotationVal: ");
        sb.append(this.this$0.rotationVal);
        sb.append(", angrad: ");
        sb.append(radians);
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", sb.toString());
        this.this$0.getGestureDetectorListener().onRotation((float) radians);
        Rect2 access$getCurRect$p = this.this$0.curRect;
        if (access$getCurRect$p == null) {
            return true;
        }
        MJHandleBoxGestureDetector mJHandleBoxGestureDetector2 = this.this$0;
        mJHandleBoxGestureDetector2.getGestureDetectorListener().onCurRectChanged(access$getCurRect$p, new Vec2(mJHandleBoxGestureDetector2.scaleFactor, mJHandleBoxGestureDetector2.scaleFactor), (float) Math.toRadians((double) mJHandleBoxGestureDetector2.rotationVal));
        return true;
    }

    public boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onRotateBegin");
        this.this$0.isRotating = true;
        return true;
    }

    public void onRotateEnd(RotateGestureDetector rotateGestureDetector) {
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onRotateEnd");
        this.this$0.isRotating = false;
    }
}
