package com.tencent.maas.handlebox.detector;

import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.MJHandleBoxUtilsKt;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, mo182094d2 = {"com/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector$scrollDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "onSingleTapConfirmed", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class MJHandleBoxGestureDetector$scrollDetector$1 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ MJHandleBoxGestureDetector this$0;

    public MJHandleBoxGestureDetector$scrollDetector$1(MJHandleBoxGestureDetector mJHandleBoxGestureDetector) {
        this.this$0 = mJHandleBoxGestureDetector;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        Rect2 access$getCurRect$p = this.this$0.curRect;
        MJHandleBoxGestureDetector mJHandleBoxGestureDetector = this.this$0;
        if (!(access$getCurRect$p == null || motionEvent == null)) {
            float f = access$getCurRect$p.getOrigin().f309908x;
            float f2 = access$getCurRect$p.getOrigin().f309909y;
            float f3 = access$getCurRect$p.getOrigin().f309908x + access$getCurRect$p.getSize().f309908x;
            float f4 = access$getCurRect$p.getOrigin().f309909y + access$getCurRect$p.getSize().f309909y;
            if (motionEvent.getX() > f && motionEvent.getY() > f2 && motionEvent.getX() < f3 && motionEvent.getY() < f4) {
                MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onDoubleTap, origin:[" + access$getCurRect$p.getOrigin() + "]  size:[" + access$getCurRect$p.getSize() + ']');
                mJHandleBoxGestureDetector.getGestureDetectorListener().onDoubleTapOnCurRect();
            }
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Rect2 access$getCurRect$p;
        boolean z;
        float f3 = f;
        float f4 = f2;
        MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "onScroll, distanceX:" + f3 + ", distanceY:" + f4 + ", touchCurRect:" + this.this$0.touchCurRect);
        if (this.this$0.touchCurRect && (access$getCurRect$p = this.this$0.curRect) != null) {
            MJHandleBoxGestureDetector mJHandleBoxGestureDetector = this.this$0;
            MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "Scroll -- Check:isScrollHorizontalCenter:" + mJHandleBoxGestureDetector.isScrollHorizontalCenter + ", isScrollVerticalCenter:" + mJHandleBoxGestureDetector.isScrollVerticalCenter);
            boolean z2 = true;
            if (mJHandleBoxGestureDetector.isScrollHorizontalCenter || mJHandleBoxGestureDetector.isScrollVerticalCenter) {
                if (SystemClock.elapsedRealtime() - mJHandleBoxGestureDetector.startScrollCenterMills < 20) {
                    if (mJHandleBoxGestureDetector.isScrollHorizontalCenter) {
                        mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollHorizontalCenter(true);
                    }
                    if (mJHandleBoxGestureDetector.isScrollVerticalCenter) {
                        mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollVerticalCenter(true);
                    }
                    MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "Scroll -- SystemClock.elapsedRealtime() - startScrollCenterMills < 20");
                } else {
                    mJHandleBoxGestureDetector.isScrollHorizontalCenter = false;
                    mJHandleBoxGestureDetector.isScrollVerticalCenter = false;
                }
            }
            access$getCurRect$p.getOrigin().f309908x -= f3;
            access$getCurRect$p.getOrigin().f309909y -= f4;
            float f5 = (float) 2;
            Vec2 vec2 = new Vec2(access$getCurRect$p.getOrigin().f309908x + (access$getCurRect$p.getSize().f309908x / f5), access$getCurRect$p.getOrigin().f309909y + (access$getCurRect$p.getSize().f309909y / f5));
            MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "After curRect changed, origin:" + access$getCurRect$p.getOrigin() + "  size:" + access$getCurRect$p.getSize() + ", container's size: " + mJHandleBoxGestureDetector.getViewSize());
            StringBuilder sb = new StringBuilder();
            sb.append("Scroll -- x dis: ");
            sb.append(Math.abs(vec2.f309908x - (mJHandleBoxGestureDetector.getViewSize().f309908x / f5)) < 5.0f);
            sb.append(", y dis: ");
            sb.append(Math.abs(vec2.f309909y - (mJHandleBoxGestureDetector.getViewSize().f309909y / f5)) < 5.0f);
            sb.append(", centerPos.x: ");
            sb.append(vec2.f309908x);
            sb.append(", (viewSize.x / 2): ");
            sb.append(mJHandleBoxGestureDetector.getViewSize().f309908x / f5);
            sb.append(", centerPos.y:");
            sb.append(vec2.f309909y);
            sb.append(", (viewSize.y / 2): ");
            sb.append(mJHandleBoxGestureDetector.getViewSize().f309909y / f5);
            sb.append("isScrollHorizontalCenter:");
            sb.append(mJHandleBoxGestureDetector.isScrollHorizontalCenter);
            sb.append(", isScrollVerticalCenter:");
            sb.append(mJHandleBoxGestureDetector.isScrollHorizontalCenter);
            MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", sb.toString());
            if (Math.abs(vec2.f309908x - (mJHandleBoxGestureDetector.getViewSize().f309908x / f5)) < 3.0f) {
                vec2.f309908x = mJHandleBoxGestureDetector.getViewSize().f309908x / f5;
                access$getCurRect$p.getOrigin().f309908x = vec2.f309908x - (access$getCurRect$p.getSize().f309908x / f5);
                mJHandleBoxGestureDetector.startScrollCenterMills = SystemClock.elapsedRealtime();
                if (!mJHandleBoxGestureDetector.isScrollVerticalCenter) {
                    mJHandleBoxGestureDetector.isScrollVerticalCenter = true;
                }
                mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollVerticalCenter(true);
                z = true;
            } else {
                mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollVerticalCenter(false);
                z = false;
            }
            if (Math.abs(vec2.f309909y - (mJHandleBoxGestureDetector.getViewSize().f309909y / f5)) < 3.0f) {
                vec2.f309909y = mJHandleBoxGestureDetector.getViewSize().f309909y / f5;
                access$getCurRect$p.getOrigin().f309909y = vec2.f309909y - (access$getCurRect$p.getSize().f309909y / f5);
                mJHandleBoxGestureDetector.startScrollCenterMills = SystemClock.elapsedRealtime();
                if (!mJHandleBoxGestureDetector.isScrollHorizontalCenter) {
                    mJHandleBoxGestureDetector.isScrollHorizontalCenter = true;
                }
                mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollHorizontalCenter(true);
            } else {
                mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollHorizontalCenter(false);
                z2 = z;
            }
            if (z2) {
                mJHandleBoxGestureDetector.getGestureDetectorListener().onMove(f3, f4, access$getCurRect$p, new Vec2(mJHandleBoxGestureDetector.getViewSize().f309908x, mJHandleBoxGestureDetector.getViewSize().f309909y));
                mJHandleBoxGestureDetector.getGestureDetectorListener().onCurRectChanged(access$getCurRect$p, new Vec2(mJHandleBoxGestureDetector.scaleFactor, mJHandleBoxGestureDetector.scaleFactor), (float) Math.toRadians((double) mJHandleBoxGestureDetector.rotationVal));
                MJHandleBoxUtilsKt.log("MJHandleBoxGestureDetector", "Scroll -- isScrollVerticalOrHorizontal");
            } else {
                mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollHorizontalCenter(false);
                mJHandleBoxGestureDetector.getGestureDetectorListener().onScrollVerticalCenter(false);
                mJHandleBoxGestureDetector.getGestureDetectorListener().onMove(f3, f4, access$getCurRect$p, new Vec2(mJHandleBoxGestureDetector.getViewSize().f309908x, mJHandleBoxGestureDetector.getViewSize().f309909y));
                mJHandleBoxGestureDetector.getGestureDetectorListener().onCurRectChanged(access$getCurRect$p, new Vec2(mJHandleBoxGestureDetector.scaleFactor, mJHandleBoxGestureDetector.scaleFactor), (float) Math.toRadians((double) mJHandleBoxGestureDetector.rotationVal));
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.this$0.isClicked) {
            this.this$0.isClicked = false;
            return true;
        }
        if (motionEvent != null) {
            MJHandleBoxGestureDetector mJHandleBoxGestureDetector = this.this$0;
            mJHandleBoxGestureDetector.getGestureDetectorListener().onSingleTap(new Vec2(motionEvent.getX(), motionEvent.getY()), new Vec2(mJHandleBoxGestureDetector.getViewSize().f309908x, mJHandleBoxGestureDetector.getViewSize().f309909y));
        }
        return true;
    }
}
