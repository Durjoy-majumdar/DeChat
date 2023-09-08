package d90;

import android.hardware.camera2.CaptureResult;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: d90.b */
public final class C107027b {

    /* renamed from: a */
    public CaptureResult f320429a;

    /* renamed from: b */
    public ArrayList<C107026a> f320430b;

    /* renamed from: c */
    public int f320431c;

    public C107027b(CaptureResult captureResult, String str, ArrayList<C107026a> arrayList) {
        C87412m.m108594g(captureResult, "result");
        C87412m.m108594g(str, "mCameraId");
        this.f320429a = captureResult;
        this.f320430b = arrayList;
        this.f320431c = C87412m.m108589b(str, "0") ? 1 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x003d A[EDGE_INSN: B:36:0x003d->B:17:0x003d ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.hardware.camera2.CaptureResult.Key<?> mo157458a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r8, r0)
            java.util.ArrayList<d90.a> r0 = r7.f320430b
            r1 = 0
            if (r0 == 0) goto L_0x00a0
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()
            r3 = r2
            d90.a r3 = (d90.C107026a) r3
            java.lang.String r4 = r3.f320424f
            boolean r4 = gy3.C87412m.m108589b(r4, r8)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0038
            java.lang.Integer r3 = r3.f320425g
            if (r3 == 0) goto L_0x0034
            int r3 = r3.intValue()
            int r4 = r7.f320431c
            r3 = r3 & r4
            if (r3 != 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 != 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x000e
            goto L_0x003d
        L_0x003c:
            r2 = r1
        L_0x003d:
            d90.a r2 = (d90.C107026a) r2
            if (r2 != 0) goto L_0x0042
            goto L_0x00a0
        L_0x0042:
            java.lang.String r8 = r2.f320428j
            if (r8 == 0) goto L_0x00a0
            int r0 = r8.hashCode()
            switch(r0) {
                case -1808118735: goto L_0x008c;
                case -672261858: goto L_0x0077;
                case 2086184: goto L_0x0062;
                case 1729365000: goto L_0x004e;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x00a0
        L_0x004e:
            java.lang.String r0 = "Boolean"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00a0
            java.lang.String r8 = r2.f320426h
            gy3.C87412m.m108591d(r8)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            android.hardware.camera2.CaptureResult$Key r1 = d90.C31097c.m39305a(r8, r0)
            goto L_0x00a0
        L_0x0062:
            java.lang.String r0 = "Byte"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x006b
            goto L_0x00a0
        L_0x006b:
            java.lang.String r8 = r2.f320426h
            gy3.C87412m.m108591d(r8)
            java.lang.Class r0 = java.lang.Byte.TYPE
            android.hardware.camera2.CaptureResult$Key r1 = d90.C31097c.m39305a(r8, r0)
            goto L_0x00a0
        L_0x0077:
            java.lang.String r0 = "Integer"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0080
            goto L_0x00a0
        L_0x0080:
            java.lang.String r8 = r2.f320426h
            gy3.C87412m.m108591d(r8)
            java.lang.Class r0 = java.lang.Integer.TYPE
            android.hardware.camera2.CaptureResult$Key r1 = d90.C31097c.m39305a(r8, r0)
            goto L_0x00a0
        L_0x008c:
            java.lang.String r0 = "String"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0095
            goto L_0x00a0
        L_0x0095:
            java.lang.String r8 = r2.f320426h
            gy3.C87412m.m108591d(r8)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            android.hardware.camera2.CaptureResult$Key r1 = d90.C31097c.m39305a(r8, r0)
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d90.C107027b.mo157458a(java.lang.String):android.hardware.camera2.CaptureResult$Key");
    }
}
