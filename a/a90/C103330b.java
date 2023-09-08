package a90;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: a90.b */
public final class C103330b {

    /* renamed from: a */
    public Matrix f304670a;

    /* renamed from: b */
    public RectF f304671b;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if ((r0.height() == 0.0f) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103330b(android.hardware.camera2.CameraCharacteristics r6, android.graphics.Rect r7) {
        /*
            r5 = this;
            java.lang.String r0 = "mCameraCharacteristics"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "previewRect"
            gy3.C87412m.m108594g(r7, r0)
            r5.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7)
            float r1 = r0.width()
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 != 0) goto L_0x002f
            float r1 = r0.height()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x004a
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "IllegalArgumentException("
            r1.append(r4)
            r1.append(r7)
            r7 = 41
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "MicroMsg.CameraFocusCoordinateTrans"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
        L_0x004a:
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r7 = r6.get(r7)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r1 = r6.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0061
            int r1 = r1.intValue()
            goto L_0x0063
        L_0x0061:
            r1 = 90
        L_0x0063:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r7)
            r5.f304671b = r4
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x007b
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x007b
            r2 = 1
        L_0x007b:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0087
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0089
        L_0x0087:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0089:
            r6.setScale(r2, r7)
            float r7 = (float) r1
            float r7 = -r7
            r6.postRotate(r7)
            r6.mapRect(r0)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            android.graphics.RectF r1 = r5.f304671b
            android.graphics.Matrix$ScaleToFit r2 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r0, r1, r2)
            r6.setConcat(r7, r6)
            r5.f304670a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103330b.<init>(android.hardware.camera2.CameraCharacteristics, android.graphics.Rect):void");
    }
}
