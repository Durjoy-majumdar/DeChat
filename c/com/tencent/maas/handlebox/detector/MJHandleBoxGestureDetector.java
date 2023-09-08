package com.tencent.maas.handlebox.detector;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.MJHandleBoxUtilsKt;
import com.tencent.maas.model.MJEdgeInsets;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 g2\u00020\u0001:\u0001gB\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\be\u0010fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u0010/\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\"\u00109\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\"\u0010<\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010,\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\"\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\"\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u00103\"\u0004\bD\u00105R\"\u0010E\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bF\u00103\"\u0004\bG\u00105R\"\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R\u0016\u0010K\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010,R\u0016\u0010L\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010,R\u0016\u0010M\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010,R\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010,R\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010,R\u0016\u0010S\u001a\u00020N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010PR\u0014\u0010T\u001a\u00020N8\u0002XD¢\u0006\u0006\n\u0004\bT\u0010PR\u0014\u0010V\u001a\u00020U8\u0002XD¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020U8\u0002XD¢\u0006\u0006\n\u0004\bX\u0010WR\u0016\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006h"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector;", "", "Landroid/view/MotionEvent;", "ev", "Lrx3/b0;", "cornerGestureWhenActionDownOrMove", "cornerGestureWhenActionUpOrCancel", "event", "Lcom/tencent/maas/base/Rect2;", "rect", "obtainMockMotionEvent", "", "dispatchTouchEvent", "Lcom/tencent/maas/model/MJEdgeInsets;", "edgeInsets", "Lcom/tencent/maas/base/Vec2;", "scale", "", "rotation", "setup", "update", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "viewSize", "Lcom/tencent/maas/base/Vec2;", "getViewSize", "()Lcom/tencent/maas/base/Vec2;", "setViewSize", "(Lcom/tencent/maas/base/Vec2;)V", "Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;", "gestureDetectorListener", "Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;", "getGestureDetectorListener", "()Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;", "setGestureDetectorListener", "(Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;)V", "curRect", "Lcom/tencent/maas/base/Rect2;", "curEdgeInsets", "Lcom/tencent/maas/model/MJEdgeInsets;", "touchCurRect", "Z", "touchRBCorner", "touchRTCorner", "touchLTCorner", "touchLBCorner", "enableRTClick", "getEnableRTClick", "()Z", "setEnableRTClick", "(Z)V", "enableRBClick", "getEnableRBClick", "setEnableRBClick", "enableLTClick", "getEnableLTClick", "setEnableLTClick", "enableLBClick", "getEnableLBClick", "setEnableLBClick", "enableRTGesture", "getEnableRTGesture", "setEnableRTGesture", "enableRBGesture", "getEnableRBGesture", "setEnableRBGesture", "enableLTGesture", "getEnableLTGesture", "setEnableLTGesture", "enableLBGesture", "getEnableLBGesture", "setEnableLBGesture", "isClicked", "isScrollVerticalCenter", "isScrollHorizontalCenter", "", "startScrollCenterMills", "J", "isScaling", "isRotating", "clickStartTimeMills", "clickIntervalMills", "", "cornerSize", "I", "cornerRadius", "rotationVal", "F", "scaleFactor", "Lcom/tencent/maas/handlebox/detector/ScaleGestureDetector;", "scaleDetector", "Lcom/tencent/maas/handlebox/detector/ScaleGestureDetector;", "Lcom/tencent/maas/handlebox/detector/RotateGestureDetector;", "rotateDetector", "Lcom/tencent/maas/handlebox/detector/RotateGestureDetector;", "Landroid/view/GestureDetector;", "scrollDetector", "Landroid/view/GestureDetector;", "<init>", "(Landroid/content/Context;Lcom/tencent/maas/base/Vec2;Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetectorListener;)V", "Companion", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class MJHandleBoxGestureDetector {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MJHandleBoxGestureDetector";
    private byte _hellAccFlag_;
    private final long clickIntervalMills = 200;
    private long clickStartTimeMills;
    private final Context context;
    private final int cornerRadius = (100 / 2);
    private final int cornerSize = 100;
    private MJEdgeInsets curEdgeInsets;
    /* access modifiers changed from: private */
    public Rect2 curRect;
    private boolean enableLBClick;
    private boolean enableLBGesture;
    private boolean enableLTClick;
    private boolean enableLTGesture;
    private boolean enableRBClick;
    private boolean enableRBGesture;
    private boolean enableRTClick;
    private boolean enableRTGesture;
    private MJHandleBoxGestureDetectorListener gestureDetectorListener;
    /* access modifiers changed from: private */
    public boolean isClicked;
    /* access modifiers changed from: private */
    public boolean isRotating;
    /* access modifiers changed from: private */
    public boolean isScaling;
    /* access modifiers changed from: private */
    public boolean isScrollHorizontalCenter;
    /* access modifiers changed from: private */
    public boolean isScrollVerticalCenter;
    private final RotateGestureDetector rotateDetector;
    /* access modifiers changed from: private */
    public float rotationVal;
    private final ScaleGestureDetector scaleDetector;
    /* access modifiers changed from: private */
    public float scaleFactor = 1.0f;
    private final GestureDetector scrollDetector;
    /* access modifiers changed from: private */
    public long startScrollCenterMills;
    /* access modifiers changed from: private */
    public boolean touchCurRect;
    private boolean touchLBCorner;
    private boolean touchLTCorner;
    private boolean touchRBCorner;
    private boolean touchRTCorner;
    private Vec2 viewSize;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector$Companion;", "", "()V", "TAG", "", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public MJHandleBoxGestureDetector(Context context2, Vec2 vec2, MJHandleBoxGestureDetectorListener mJHandleBoxGestureDetectorListener) {
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(vec2, "viewSize");
        C87412m.m108594g(mJHandleBoxGestureDetectorListener, "gestureDetectorListener");
        this.context = context2;
        this.viewSize = vec2;
        this.gestureDetectorListener = mJHandleBoxGestureDetectorListener;
        this.scaleDetector = new ScaleGestureDetector(context2, new MJHandleBoxGestureDetector$scaleDetector$1(this));
        this.rotateDetector = new RotateGestureDetector(context2, new MJHandleBoxGestureDetector$rotateDetector$1(this));
        this.scrollDetector = new GestureDetector(context2, new MJHandleBoxGestureDetector$scrollDetector$1(this));
    }

    private final void cornerGestureWhenActionDownOrMove(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.scaleDetector;
        scaleGestureDetector.setMinSpan((int) (((float) scaleGestureDetector.getMinSpan()) * 0.5f));
        Rect2 rect2 = this.curRect;
        if (motionEvent != null && rect2 != null) {
            MJHandleBoxUtilsKt.log(TAG, "rotateDetector.onTouchEvent(newEvent)");
            MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("obtain a new motionEvent for action ", Integer.valueOf(motionEvent.getAction())));
            if (motionEvent.getAction() == 0) {
                MotionEvent obtainMockMotionEvent = obtainMockMotionEvent(motionEvent, rect2);
                this.rotateDetector.onTouchEvent(motionEvent);
                this.rotateDetector.onTouchEvent(obtainMockMotionEvent);
                this.scaleDetector.onTouchEvent(motionEvent);
                this.scaleDetector.onTouchEvent(obtainMockMotionEvent);
            }
            if (motionEvent.getAction() == 2) {
                MotionEvent obtainMockMotionEvent2 = obtainMockMotionEvent(motionEvent, rect2);
                this.rotateDetector.onTouchEvent(obtainMockMotionEvent2);
                this.scaleDetector.onTouchEvent(obtainMockMotionEvent2);
            }
        }
    }

    private final void cornerGestureWhenActionUpOrCancel(MotionEvent motionEvent) {
        Rect2 rect2 = this.curRect;
        if (motionEvent != null && rect2 != null) {
            MotionEvent obtainMockMotionEvent = obtainMockMotionEvent(motionEvent, rect2);
            this.rotateDetector.onTouchEvent(obtainMockMotionEvent);
            this.scaleDetector.onTouchEvent(obtainMockMotionEvent);
        }
    }

    private final MotionEvent obtainMockMotionEvent(MotionEvent motionEvent, Rect2 rect2) {
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = 0;
        C13598b0 b0Var = C13598b0.f38549a;
        MotionEvent.PointerProperties pointerProperties2 = new MotionEvent.PointerProperties();
        pointerProperties2.id = 1;
        MotionEvent.PointerProperties[] pointerPropertiesArr = {pointerProperties, pointerProperties2};
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        MJHandleBoxUtilsKt.log(TAG, "pointerCoords[0] [" + motionEvent.getX() + ", " + motionEvent.getY() + ']');
        pointerCoords.x = motionEvent.getX();
        pointerCoords.y = motionEvent.getY();
        MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords();
        StringBuilder sb = new StringBuilder();
        sb.append("pointerCoords[1] [");
        float f = (float) 2;
        sb.append(rect2.getOrigin().f309908x + (rect2.getSize().f309908x / f));
        sb.append(", ");
        sb.append(rect2.getOrigin().f309909y + (rect2.getSize().f309909y / f));
        sb.append(']');
        MJHandleBoxUtilsKt.log(TAG, sb.toString());
        pointerCoords2.x = rect2.getOrigin().f309908x + (rect2.getSize().f309908x / f);
        pointerCoords2.y = rect2.getOrigin().f309909y + (rect2.getSize().f309909y / f);
        MotionEvent.PointerCoords[] pointerCoordsArr = {pointerCoords, pointerCoords2};
        MJHandleBoxUtilsKt.log(TAG, C87412m.m108600m("obtain a new motionEvent action ", Integer.valueOf(motionEvent.getAction())));
        int action = motionEvent.getAction();
        MotionEvent obtain = action != 0 ? action != 1 ? MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), 2, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()) : MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 6, 2, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()) : MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 5, 2, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C87412m.m108593f(obtain, "newEvent");
        return obtain;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C13598b0 b0Var;
        MotionEvent motionEvent2 = motionEvent;
        if (motionEvent2 != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    if (getEnableRTGesture() && this.touchRTCorner) {
                        cornerGestureWhenActionUpOrCancel(motionEvent);
                    }
                    if (getEnableRBGesture() && this.touchRBCorner) {
                        cornerGestureWhenActionUpOrCancel(motionEvent);
                    }
                    if (getEnableLTGesture() && this.touchLTCorner) {
                        cornerGestureWhenActionUpOrCancel(motionEvent);
                    }
                    if (getEnableLBGesture() && this.touchLBCorner) {
                        cornerGestureWhenActionUpOrCancel(motionEvent);
                    }
                    if (SystemClock.elapsedRealtime() - this.clickStartTimeMills < this.clickIntervalMills) {
                        if (this.touchRTCorner || this.touchRBCorner || this.touchLTCorner || this.touchLBCorner) {
                            this.isClicked = true;
                        }
                        if (getEnableRTClick() && this.touchRTCorner) {
                            getGestureDetectorListener().onRTClick();
                        }
                        if (getEnableRBClick() && this.touchRBCorner) {
                            getGestureDetectorListener().onRBClick();
                        }
                        if (getEnableLTClick() && this.touchLTCorner) {
                            getGestureDetectorListener().onLTClick();
                        }
                        if (getEnableLBClick() && this.touchLBCorner) {
                            getGestureDetectorListener().onLBClick();
                        }
                    }
                    this.touchRBCorner = false;
                    this.touchRTCorner = false;
                    this.touchLTCorner = false;
                    this.touchLBCorner = false;
                    this.touchCurRect = false;
                    this.isScrollVerticalCenter = false;
                    this.isScrollHorizontalCenter = false;
                    this.scaleDetector.resetMinSpan();
                    getGestureDetectorListener().onDetectorActionUp();
                    Rect2 rect2 = this.curRect;
                    if (rect2 != null) {
                        float f = rect2.getOrigin().f309908x;
                        float f2 = rect2.getOrigin().f309909y;
                        float f3 = rect2.getOrigin().f309908x + rect2.getSize().f309908x;
                        float f4 = rect2.getOrigin().f309909y + rect2.getSize().f309909y;
                        float f5 = (float) 2;
                        Matrix matrix = new Matrix();
                        matrix.postRotate(-this.rotationVal, (rect2.getSize().f309908x / f5) + f, (rect2.getSize().f309909y / f5) + f2);
                        float[] fArr = {f, f2};
                        float[] fArr2 = {f, f4};
                        float[] fArr3 = {f3, f2};
                        float[] fArr4 = {f3, f4};
                        matrix.mapPoints(fArr);
                        matrix.mapPoints(fArr2);
                        matrix.mapPoints(fArr3);
                        matrix.mapPoints(fArr4);
                        getGestureDetectorListener().onCurRectAfterChanged(fArr, fArr2, fArr3, fArr4);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                    }
                    getGestureDetectorListener().onTouchEventUp();
                }
                C13598b0 b0Var3 = C13598b0.f38549a;
            } else {
                Rect2 curRect2 = getGestureDetectorListener().getCurRect();
                this.curRect = curRect2;
                if (curRect2 == null) {
                    b0Var = null;
                } else {
                    MJHandleBoxUtilsKt.log(TAG, "dispatchTouchEvent, origin:" + curRect2.getOrigin() + ", size:" + curRect2.getSize() + ", event:[" + motionEvent.getX() + ", " + motionEvent.getY() + ']');
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    MJHandleBoxUtilsKt.log(TAG, "curRect is empty");
                    C13598b0 b0Var4 = C13598b0.f38549a;
                }
                Rect2 rect22 = this.curRect;
                if (rect22 != null) {
                    this.clickStartTimeMills = SystemClock.elapsedRealtime();
                    float f6 = rect22.getOrigin().f309908x;
                    float f7 = rect22.getOrigin().f309909y;
                    float f8 = rect22.getOrigin().f309908x + rect22.getSize().f309908x;
                    float f9 = rect22.getOrigin().f309909y + rect22.getSize().f309909y;
                    MJHandleBoxUtilsKt.log(TAG, "dispatchTouchEvent, left:" + f6 + ", top:" + f7 + ", right:" + f8 + ", bottom:" + f9 + ", event:[" + motionEvent.getX() + ", " + motionEvent.getY() + ']');
                    float f15 = (float) 2;
                    Matrix matrix2 = new Matrix();
                    matrix2.postRotate(-this.rotationVal, (rect22.getSize().f309908x / f15) + f6, (rect22.getSize().f309909y / f15) + f7);
                    float[] fArr5 = {f6, f7};
                    float[] fArr6 = {f6, f9};
                    float[] fArr7 = {f8, f7};
                    float[] fArr8 = {f8, f9};
                    matrix2.mapPoints(fArr5);
                    matrix2.mapPoints(fArr6);
                    matrix2.mapPoints(fArr7);
                    matrix2.mapPoints(fArr8);
                    if (motionEvent.getX() > fArr8[0] - ((float) this.cornerRadius) && motionEvent.getY() > fArr8[1] - ((float) this.cornerRadius) && motionEvent.getX() < fArr8[0] + ((float) this.cornerRadius) && motionEvent.getY() < fArr8[1] + ((float) this.cornerRadius)) {
                        MJHandleBoxUtilsKt.log(TAG, "touchRBCorner, origin:[" + rect22.getOrigin() + "]  size:[" + rect22.getSize() + ']');
                        this.touchRBCorner = true;
                    }
                    if (motionEvent.getX() > fArr7[0] - ((float) this.cornerRadius) && motionEvent.getY() > fArr7[1] - ((float) this.cornerRadius) && motionEvent.getX() < fArr7[0] + ((float) this.cornerRadius) && motionEvent.getY() < fArr7[1] + ((float) this.cornerRadius)) {
                        MJHandleBoxUtilsKt.log(TAG, "touchRTCorner, origin:[" + rect22.getOrigin() + "]  size:[" + rect22.getSize() + ']');
                        this.touchRTCorner = true;
                    }
                    if (motionEvent.getX() > fArr5[0] - ((float) this.cornerRadius) && motionEvent.getY() > fArr5[1] - ((float) this.cornerRadius) && motionEvent.getX() < fArr5[0] + ((float) (this.cornerRadius / 2)) && motionEvent.getY() < fArr5[1] + ((float) (this.cornerRadius / 2))) {
                        MJHandleBoxUtilsKt.log(TAG, "touchLTCorner, origin:[" + rect22.getOrigin() + "]  size:[" + rect22.getSize() + ']');
                        this.touchLTCorner = true;
                    }
                    if (motionEvent.getX() > fArr6[0] - ((float) this.cornerRadius) && motionEvent.getY() > fArr6[1] - ((float) this.cornerRadius) && motionEvent.getX() < fArr6[0] + ((float) this.cornerRadius) && motionEvent.getY() < fArr6[1] + ((float) this.cornerRadius)) {
                        MJHandleBoxUtilsKt.log(TAG, "touchLBCorner, origin:[" + rect22.getOrigin() + "]  size:[" + rect22.getSize() + ']');
                        this.touchLBCorner = true;
                    }
                    if (motionEvent.getX() > f6 && motionEvent.getY() > f7 && motionEvent.getX() < f8 && motionEvent.getY() < f9) {
                        MJHandleBoxUtilsKt.log(TAG, "touchCurRect, origin:[" + rect22.getOrigin() + "]  size:[" + rect22.getSize() + ']');
                        this.touchCurRect = true;
                    }
                    if (this.touchRTCorner || this.touchRBCorner || this.touchLTCorner || this.touchLBCorner || this.touchCurRect) {
                        getGestureDetectorListener().onDetectorActionDown();
                    }
                    C13598b0 b0Var5 = C13598b0.f38549a;
                }
            }
        }
        MJHandleBoxUtilsKt.log(TAG, "touchRBCorner:" + this.touchRBCorner + ", touchRTCorner:" + this.touchRTCorner + ", touchLTCorner:" + this.touchLTCorner + ", touchLBCorner:" + this.touchLBCorner + ", touchRTCorner:" + this.touchRTCorner + ", touchLTCorner:" + this.touchLTCorner + ", touchRBCorner:" + this.touchRBCorner + ", touchLBCorner:" + this.touchLBCorner + ", enableRTGesture:" + this.enableRTGesture + ", enableRBGesture:" + this.enableRBGesture + ", enableLTGesture:" + this.enableLTGesture + ", enableLBGesture:" + this.enableLBGesture);
        if (this.enableRTGesture && this.touchRTCorner) {
            cornerGestureWhenActionDownOrMove(motionEvent);
            return false;
        } else if (this.enableRBGesture && this.touchRBCorner) {
            cornerGestureWhenActionDownOrMove(motionEvent);
            return false;
        } else if (this.enableLTGesture && this.touchLTCorner) {
            cornerGestureWhenActionDownOrMove(motionEvent);
            return false;
        } else if (!this.enableLBGesture || !this.touchLBCorner) {
            this.scaleDetector.onTouchEvent(motionEvent2);
            this.rotateDetector.onTouchEvent(motionEvent2);
            GestureDetector gestureDetector = this.scrollDetector;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/maas/handlebox/detector/MJHandleBoxGestureDetector", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            return false;
        } else {
            cornerGestureWhenActionDownOrMove(motionEvent);
            return false;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean getEnableLBClick() {
        return this.enableLBClick;
    }

    public final boolean getEnableLBGesture() {
        return this.enableLBGesture;
    }

    public final boolean getEnableLTClick() {
        return this.enableLTClick;
    }

    public final boolean getEnableLTGesture() {
        return this.enableLTGesture;
    }

    public final boolean getEnableRBClick() {
        return this.enableRBClick;
    }

    public final boolean getEnableRBGesture() {
        return this.enableRBGesture;
    }

    public final boolean getEnableRTClick() {
        return this.enableRTClick;
    }

    public final boolean getEnableRTGesture() {
        return this.enableRTGesture;
    }

    public final MJHandleBoxGestureDetectorListener getGestureDetectorListener() {
        return this.gestureDetectorListener;
    }

    public final Vec2 getViewSize() {
        return this.viewSize;
    }

    public final void setEnableLBClick(boolean z) {
        this.enableLBClick = z;
    }

    public final void setEnableLBGesture(boolean z) {
        this.enableLBGesture = z;
    }

    public final void setEnableLTClick(boolean z) {
        this.enableLTClick = z;
    }

    public final void setEnableLTGesture(boolean z) {
        this.enableLTGesture = z;
    }

    public final void setEnableRBClick(boolean z) {
        this.enableRBClick = z;
    }

    public final void setEnableRBGesture(boolean z) {
        this.enableRBGesture = z;
    }

    public final void setEnableRTClick(boolean z) {
        this.enableRTClick = z;
    }

    public final void setEnableRTGesture(boolean z) {
        this.enableRTGesture = z;
    }

    public final void setGestureDetectorListener(MJHandleBoxGestureDetectorListener mJHandleBoxGestureDetectorListener) {
        C87412m.m108594g(mJHandleBoxGestureDetectorListener, "<set-?>");
        this.gestureDetectorListener = mJHandleBoxGestureDetectorListener;
    }

    public final void setViewSize(Vec2 vec2) {
        C87412m.m108594g(vec2, "<set-?>");
        this.viewSize = vec2;
    }

    public final void setup(Rect2 rect2, MJEdgeInsets mJEdgeInsets, Vec2 vec2, float f) {
        C87412m.m108594g(rect2, "rect");
        C87412m.m108594g(vec2, "scale");
        MJHandleBoxUtilsKt.log(TAG, "setup rect origin: " + rect2.getOrigin() + ", size:" + rect2.getSize() + ", scale:" + vec2 + ", rotation:" + f);
        this.curRect = rect2;
        this.curEdgeInsets = mJEdgeInsets;
        this.scaleFactor = vec2.f309908x;
        this.rotationVal = (float) Math.toDegrees((double) f);
        MJHandleBoxGestureDetectorListener mJHandleBoxGestureDetectorListener = this.gestureDetectorListener;
        float f2 = this.scaleFactor;
        mJHandleBoxGestureDetectorListener.onCurRectChanged(rect2, new Vec2(f2, f2), (float) Math.toRadians((double) this.rotationVal));
    }

    public final void update(Rect2 rect2, Vec2 vec2, float f) {
        C87412m.m108594g(rect2, "rect");
        C87412m.m108594g(vec2, "scale");
        MJHandleBoxUtilsKt.log(TAG, "update rect origin: " + rect2.getOrigin() + ", size:" + rect2.getSize() + ", scale:" + vec2 + ", rotation:" + f);
        this.curRect = rect2;
        MJHandleBoxGestureDetectorListener mJHandleBoxGestureDetectorListener = this.gestureDetectorListener;
        float f2 = this.scaleFactor;
        mJHandleBoxGestureDetectorListener.onCurRectChanged(rect2, new Vec2(f2, f2), (float) Math.toRadians((double) this.rotationVal));
        float f3 = rect2.getOrigin().f309908x;
        float f4 = rect2.getOrigin().f309909y;
        float f5 = rect2.getOrigin().f309908x + rect2.getSize().f309908x;
        float f6 = rect2.getOrigin().f309909y + rect2.getSize().f309909y;
        float f7 = (float) 2;
        Matrix matrix = new Matrix();
        matrix.postRotate(-this.rotationVal, (rect2.getSize().f309908x / f7) + f3, (rect2.getSize().f309909y / f7) + f4);
        float[] fArr = {f3, f4};
        float[] fArr2 = {f3, f6};
        float[] fArr3 = {f5, f4};
        float[] fArr4 = {f5, f6};
        matrix.mapPoints(fArr);
        matrix.mapPoints(fArr2);
        matrix.mapPoints(fArr3);
        matrix.mapPoints(fArr4);
        this.gestureDetectorListener.onCurRectAfterChanged(fArr, fArr2, fArr3, fArr4);
    }
}
