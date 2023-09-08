package com.tencent.p014mm.plugin.appbrand.widget.base;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import ct0.C86129c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat */
public final class AppBrandViewMotionCompat {

    /* renamed from: a */
    public static MotionEvent.PointerCoords[] f247517a;

    /* renamed from: b */
    public static MotionEvent.PointerProperties[] f247518b;

    /* renamed from: c */
    public static int[] f247519c;

    /* renamed from: a */
    public static boolean m104661a(View view) {
        return view.getVisibility() == 0 || view.getAnimation() != null;
    }

    /* renamed from: b */
    public static boolean m104662b(ViewGroup viewGroup, float f, float f2, View view, PointF pointF) {
        float[] fArr = {0.0f, 0.0f};
        fArr[0] = f + ((float) (viewGroup.getScrollX() - view.getLeft()));
        fArr[1] = f2 + ((float) (viewGroup.getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.invert(matrix);
            matrix.mapPoints(fArr);
        }
        float f3 = fArr[0];
        boolean z = f3 >= 0.0f && fArr[1] >= 0.0f && f3 < ((float) (view.getRight() - view.getLeft())) && fArr[1] < ((float) (view.getBottom() - view.getTop()));
        if (z && pointF != null) {
            pointF.set(fArr[0], fArr[1]);
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.MotionEvent m104663c(android.view.MotionEvent r27, int r28) {
        /*
            r0 = r27
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 != r2) goto L_0x0132
            int r1 = r27.getPointerCount()
            android.view.MotionEvent$PointerCoords[] r2 = f247517a
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L_0x001a
            int r5 = r2.length
            if (r5 >= r1) goto L_0x004b
        L_0x001a:
            if (r2 == 0) goto L_0x001e
            int r2 = r2.length
            goto L_0x0020
        L_0x001e:
            r2 = 8
        L_0x0020:
            if (r2 >= r1) goto L_0x0025
            int r2 = r2 * 2
            goto L_0x0020
        L_0x0025:
            android.view.MotionEvent$PointerCoords[] r5 = new android.view.MotionEvent.PointerCoords[r2]
            r6 = 0
        L_0x0028:
            if (r6 >= r2) goto L_0x0034
            android.view.MotionEvent$PointerCoords r7 = new android.view.MotionEvent$PointerCoords
            r7.<init>()
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0034:
            f247517a = r5
            android.view.MotionEvent$PointerProperties[] r5 = new android.view.MotionEvent.PointerProperties[r2]
            r6 = 0
        L_0x0039:
            if (r6 >= r2) goto L_0x0045
            android.view.MotionEvent$PointerProperties r7 = new android.view.MotionEvent$PointerProperties
            r7.<init>()
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0045:
            f247518b = r5
            int[] r2 = new int[r2]
            f247519c = r2
        L_0x004b:
            android.view.MotionEvent$PointerProperties[] r2 = f247518b
            android.view.MotionEvent$PointerCoords[] r15 = f247517a
            int[] r21 = f247519c
            int r5 = r27.getAction()
            r6 = r5 & 255(0xff, float:3.57E-43)
            r7 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r5
            int r7 = r7 >> r3
            r8 = -1
            r9 = 0
            r14 = 0
        L_0x005f:
            r10 = 1
            if (r9 >= r1) goto L_0x007a
            r11 = r2[r14]
            r0.getPointerProperties(r9, r11)
            r11 = r2[r14]
            int r11 = r11.id
            int r10 = r10 << r11
            r10 = r10 & r28
            if (r10 == 0) goto L_0x0077
            if (r9 != r7) goto L_0x0073
            r8 = r14
        L_0x0073:
            r21[r14] = r9
            int r14 = r14 + 1
        L_0x0077:
            int r9 = r9 + 1
            goto L_0x005f
        L_0x007a:
            if (r14 == 0) goto L_0x012a
            r1 = 5
            if (r6 == r1) goto L_0x0085
            r7 = 6
            if (r6 != r7) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r1 = r5
            goto L_0x0097
        L_0x0085:
            if (r8 >= 0) goto L_0x008a
            r5 = 2
            r1 = 2
            goto L_0x0097
        L_0x008a:
            if (r14 != r10) goto L_0x0092
            if (r6 != r1) goto L_0x0090
            r5 = 0
            goto L_0x0083
        L_0x0090:
            r5 = 1
            goto L_0x0083
        L_0x0092:
            int r1 = r8 << 8
            r5 = r6 | r1
            goto L_0x0083
        L_0x0097:
            r3 = 0
            int r13 = r27.getHistorySize()
            r12 = 0
        L_0x009d:
            if (r12 > r13) goto L_0x0129
            if (r12 != r13) goto L_0x00a4
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00a5
        L_0x00a4:
            r5 = r12
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 >= r14) goto L_0x00b2
            r7 = r21[r6]
            r8 = r15[r6]
            r0.getHistoricalPointerCoords(r7, r5, r8)
            int r6 = r6 + 1
            goto L_0x00a6
        L_0x00b2:
            long r5 = r0.getHistoricalEventTime(r5)
            if (r12 != 0) goto L_0x0116
            long r5 = r27.getDownTime()
            long r7 = r27.getEventTime()
            int r3 = r27.getMetaState()
            int r16 = r27.getButtonState()
            float r17 = r27.getXPrecision()
            float r18 = r27.getYPrecision()
            int r19 = r27.getDeviceId()
            int r20 = r27.getEdgeFlags()
            int r22 = r27.getSource()
            int r23 = r27.getFlags()
            r9 = r1
            r10 = r14
            r11 = r2
            r24 = r12
            r12 = r15
            r25 = r13
            r13 = r3
            r26 = r14
            r14 = r16
            r3 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r22
            r20 = r23
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r6 = r5.getX()
            float r7 = r5.getRawX()
            float r6 = r6 - r7
            float r7 = r5.getY()
            float r8 = r5.getRawY()
            float r7 = r7 - r8
            r5.offsetLocation(r6, r7)
            r7 = r3
            r3 = r5
            goto L_0x0120
        L_0x0116:
            r24 = r12
            r25 = r13
            r26 = r14
            r7 = r15
            r3.addBatch(r5, r7, r4)
        L_0x0120:
            int r12 = r24 + 1
            r15 = r7
            r13 = r25
            r14 = r26
            goto L_0x009d
        L_0x0129:
            return r3
        L_0x012a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "idBits did not match any ids in the event"
            r0.<init>(r1)
            throw r0
        L_0x0132:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Should be called on main-thread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat.m104663c(android.view.MotionEvent, int):android.view.MotionEvent");
    }

    /* renamed from: d */
    public static boolean m104664d(View view) {
        return view != null && (view instanceof C86129c) && ((C86129c) view).mo117831m();
    }

    public static boolean dispatchTransformedTouchEvent(ViewGroup viewGroup, MotionEvent motionEvent, boolean z, View view, int i) {
        MotionEvent motionEvent2;
        if (viewGroup == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (z || action == 3) {
            motionEvent.setAction(3);
            if (view == null) {
                return false;
            }
            boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(action);
            return dispatchTouchEvent;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            i2 |= 1 << motionEvent.getPointerId(i3);
        }
        int i4 = i & i2;
        if (i4 == 0) {
            return false;
        }
        if (i4 != i2) {
            try {
                motionEvent2 = m104663c(motionEvent, i4);
            } catch (IllegalArgumentException e) {
                Log.m105929w("MicroMsg.AppBrandViewMotionCompat", "dispatchTransformedTouchEvent e=%s", e.getMessage());
                return false;
            }
        } else if (view != null && !view.getMatrix().isIdentity()) {
            motionEvent2 = MotionEvent.obtain(motionEvent);
        } else if (view == null) {
            return false;
        } else {
            float scrollX = (float) (viewGroup.getScrollX() - view.getLeft());
            float scrollY = (float) (viewGroup.getScrollY() - view.getTop());
            motionEvent.offsetLocation(scrollX, scrollY);
            boolean dispatchTouchEvent2 = view.dispatchTouchEvent(motionEvent);
            motionEvent.offsetLocation(-scrollX, -scrollY);
            return dispatchTouchEvent2;
        }
        if (view == null) {
            return false;
        }
        motionEvent2.offsetLocation((float) (viewGroup.getScrollX() - view.getLeft()), (float) (viewGroup.getScrollY() - view.getTop()));
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            matrix.invert(matrix);
            motionEvent2.transform(matrix);
        }
        boolean dispatchTouchEvent3 = view.dispatchTouchEvent(motionEvent2);
        motionEvent2.recycle();
        return dispatchTouchEvent3;
    }
}
