package wk0;

import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: wk0.b */
public class C22913b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f65874d;

    /* renamed from: e */
    public final /* synthetic */ int f65875e;

    /* renamed from: f */
    public final /* synthetic */ int f65876f;

    /* renamed from: g */
    public final /* synthetic */ int f65877g;

    /* renamed from: h */
    public final /* synthetic */ int f65878h;

    /* renamed from: i */
    public final /* synthetic */ int f65879i;

    /* renamed from: j */
    public final /* synthetic */ Point f65880j;

    /* renamed from: n */
    public final /* synthetic */ Rect f65881n;

    /* renamed from: o */
    public final /* synthetic */ int f65882o;

    /* renamed from: p */
    public final /* synthetic */ C22914c f65883p;

    public C22913b(C22914c cVar, byte[] bArr, int i, int i2, int i3, int i4, int i5, Point point, Rect rect, int i6) {
        this.f65883p = cVar;
        this.f65874d = bArr;
        this.f65875e = i;
        this.f65876f = i2;
        this.f65877g = i3;
        this.f65878h = i4;
        this.f65879i = i5;
        this.f65880j = point;
        this.f65881n = rect;
        this.f65882o = i6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r32 = this;
            r1 = r32
            wk0.c r0 = r1.f65883p
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f65884a
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 1
            boolean r0 = r0.compareAndSet(r2, r4)
            if (r0 == 0) goto L_0x0331
            byte[] r0 = r1.f65874d
            r5 = 270(0x10e, float:3.78E-43)
            int r6 = r1.f65875e
            if (r5 == r6) goto L_0x001e
            r5 = 90
            if (r5 != r6) goto L_0x0034
        L_0x001e:
            int r5 = r0.length
            byte[] r5 = new byte[r5]
            int r6 = r1.f65876f
            int r7 = r1.f65877g
            com.tencent.qbar.QbarNative.nativeYUVrotate(r5, r0, r6, r7)
            byte[] r0 = r1.f65874d
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            int r6 = r1.f65877g
            int r7 = r1.f65876f
            com.tencent.qbar.QbarNative.nativeYUVrotate(r0, r5, r6, r7)
        L_0x0034:
            r9 = r0
            wk0.c r0 = r1.f65883p
            int r5 = r1.f65876f
            int r6 = r1.f65877g
            int r7 = r1.f65878h
            int r8 = r1.f65879i
            android.graphics.Point r12 = r1.f65880j
            android.graphics.Rect r11 = r1.f65881n
            int r15 = r1.f65875e
            int r14 = r1.f65882o
            wk0.a r0 = (wk0.C22912a) r0
            java.lang.Object r13 = r0.f65870f
            monitor-enter(r13)
            boolean r10 = r0.f65871g     // Catch:{ all -> 0x0328 }
            if (r10 != 0) goto L_0x005a
            java.lang.String r0 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r3 = "not init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x0328 }
            monitor-exit(r13)     // Catch:{ all -> 0x0328 }
            goto L_0x031d
        L_0x005a:
            java.lang.String r10 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r4 = "decode start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r4)     // Catch:{ all -> 0x0328 }
            r4 = 4
            r10 = 2
            if (r11 != 0) goto L_0x008f
            java.lang.String r11 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r12 = "scanArea is null, use whole screen area, left: %d, top: %d, right: %d, bottom: %d"
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x0328 }
            r14[r2] = r3     // Catch:{ all -> 0x0328 }
            r17 = 1
            r14[r17] = r3     // Catch:{ all -> 0x0328 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0328 }
            r14[r10] = r3     // Catch:{ all -> 0x0328 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0328 }
            r16 = 3
            r14[r16] = r3     // Catch:{ all -> 0x0328 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r14)     // Catch:{ all -> 0x0328 }
            r2 = r5
            r14 = r6
            r24 = r13
            r19 = r15
            r3 = 3
            r4 = 2
            r10 = 0
            r11 = 0
            goto L_0x0147
        L_0x008f:
            java.lang.String r3 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r4 = "origin scan area decodeDegrees: %d, left: %d, top: %d, right: %d, bottom: %d"
            r10 = 5
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ all -> 0x0328 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0328 }
            r21 = 0
            r2[r21] = r20     // Catch:{ all -> 0x0328 }
            int r10 = r11.left     // Catch:{ all -> 0x0328 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0328 }
            r17 = 1
            r2[r17] = r10     // Catch:{ all -> 0x0328 }
            int r10 = r11.top     // Catch:{ all -> 0x0328 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0328 }
            r19 = 2
            r2[r19] = r10     // Catch:{ all -> 0x0328 }
            int r10 = r11.right     // Catch:{ all -> 0x0328 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0328 }
            r16 = 3
            r2[r16] = r10     // Catch:{ all -> 0x0328 }
            int r10 = r11.bottom     // Catch:{ all -> 0x0328 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0328 }
            r18 = 4
            r2[r18] = r10     // Catch:{ all -> 0x0328 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)     // Catch:{ all -> 0x0328 }
            r2 = 5
            r3 = 3
            r4 = 2
            r10 = r0
            r24 = r13
            r13 = r5
            r16 = r14
            r14 = r6
            r19 = r15
            android.graphics.Rect r10 = r10.mo36093d(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0326 }
            java.lang.String r11 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r12 = "translated scan area decodeDegrees: %d, left: %d, top: %d, right: %d, bottom: %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0326 }
            r14 = 0
            r2[r14] = r13     // Catch:{ all -> 0x0326 }
            int r13 = r10.left     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0326 }
            r14 = 1
            r2[r14] = r13     // Catch:{ all -> 0x0326 }
            int r13 = r10.top     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0326 }
            r2[r4] = r13     // Catch:{ all -> 0x0326 }
            int r13 = r10.right     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0326 }
            r2[r3] = r13     // Catch:{ all -> 0x0326 }
            int r13 = r10.bottom     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0326 }
            r14 = 4
            r2[r14] = r13     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r2)     // Catch:{ all -> 0x0326 }
            int r2 = r10.left     // Catch:{ all -> 0x0326 }
            if (r2 < r5) goto L_0x0112
            int r2 = r5 + -1
        L_0x0112:
            int r11 = r10.top     // Catch:{ all -> 0x0326 }
            if (r11 < r6) goto L_0x0118
            int r11 = r6 + -1
        L_0x0118:
            int r12 = r10.width()     // Catch:{ all -> 0x0326 }
            int r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0326 }
            int r12 = r12 + r2
            if (r12 <= r5) goto L_0x0126
            int r12 = r5 - r2
            goto L_0x012e
        L_0x0126:
            int r12 = r10.width()     // Catch:{ all -> 0x0326 }
            int r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0326 }
        L_0x012e:
            int r13 = r10.height()     // Catch:{ all -> 0x0326 }
            int r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0326 }
            int r13 = r13 + r11
            if (r13 <= r6) goto L_0x013c
            int r10 = r6 - r11
            goto L_0x0144
        L_0x013c:
            int r10 = r10.height()     // Catch:{ all -> 0x0326 }
            int r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0326 }
        L_0x0144:
            r14 = r10
            r10 = r2
            r2 = r12
        L_0x0147:
            int[] r15 = new int[r4]     // Catch:{ all -> 0x0326 }
            r12 = 0
            r15[r12] = r2     // Catch:{ all -> 0x0326 }
            r12 = 1
            r15[r12] = r14     // Catch:{ all -> 0x0326 }
            byte[] r12 = r0.f65872h     // Catch:{ all -> 0x0326 }
            if (r12 != 0) goto L_0x017e
            int r12 = r2 * r14
            int r13 = r12 * 3
            int r13 = r13 / r4
            byte[] r13 = new byte[r13]     // Catch:{ all -> 0x0326 }
            r0.f65872h = r13     // Catch:{ all -> 0x0326 }
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x0326 }
            r0.f65873i = r12     // Catch:{ all -> 0x0326 }
            java.lang.String r12 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r13 = "tempOutBytes = null, new byte[%s]"
            r4 = 1
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0326 }
            int r4 = r5 * r6
            r16 = 3
            int r4 = r4 * 3
            r16 = 2
            int r4 = r4 / 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0326 }
            r16 = 0
            r3[r16] = r4     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r3)     // Catch:{ all -> 0x0326 }
            goto L_0x01b3
        L_0x017e:
            int r3 = r12.length     // Catch:{ all -> 0x0326 }
            int r4 = r2 * r14
            int r12 = r4 * 3
            int r13 = r12 / 2
            if (r3 == r13) goto L_0x01b3
            r3 = 0
            r0.f65872h = r3     // Catch:{ all -> 0x0326 }
            r13 = 2
            int r12 = r12 / r13
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x0326 }
            r0.f65872h = r12     // Catch:{ all -> 0x0326 }
            r0.f65873i = r3     // Catch:{ all -> 0x0326 }
            byte[] r3 = new byte[r4]     // Catch:{ all -> 0x0326 }
            r0.f65873i = r3     // Catch:{ all -> 0x0326 }
            java.lang.String r3 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r4 = "tempOutBytes size change, new byte[%s]"
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x0326 }
            int r12 = r5 * r6
            r16 = 3
            int r12 = r12 * 3
            r16 = 2
            int r12 = r12 / 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0326 }
            r16 = 0
            r13[r16] = r12     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r13)     // Catch:{ all -> 0x0326 }
        L_0x01b3:
            java.lang.String r3 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r4 = "onFrameData: %s, width: %s, height: %s decodeDegrees:%d"
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0326 }
            r13 = 0
            r12[r13] = r9     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0326 }
            r16 = 1
            r12[r16] = r13     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0326 }
            r16 = 2
            r12[r16] = r13     // Catch:{ all -> 0x0326 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0326 }
            r16 = 3
            r12[r16] = r13     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r12)     // Catch:{ all -> 0x0326 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ all -> 0x0326 }
            r3.<init>(r5, r6)     // Catch:{ all -> 0x0326 }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ all -> 0x0326 }
            int r4 = r10 + r2
            int r5 = r11 + r14
            r12.<init>(r10, r11, r4, r5)     // Catch:{ all -> 0x0326 }
            r4 = 2
            int[] r5 = new int[r4]     // Catch:{ all -> 0x0326 }
            it3.a r4 = r0.f65869e     // Catch:{ all -> 0x0326 }
            r6 = r8
            r8 = r4
            r10 = r3
            r11 = r19
            r13 = r5
            byte[] r3 = r8.mo33086c(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0326 }
            r0.f65872h = r3     // Catch:{ all -> 0x0326 }
            byte[] r4 = r0.f65873i     // Catch:{ all -> 0x0326 }
            int r8 = r4.length     // Catch:{ all -> 0x0326 }
            r9 = 0
            java.lang.System.arraycopy(r3, r9, r4, r9, r8)     // Catch:{ all -> 0x0326 }
            byte[] r3 = r0.f65873i     // Catch:{ all -> 0x0326 }
            if (r3 == 0) goto L_0x0227
            java.lang.String r4 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r8 = "tempGrayData.len: %d, width: %d, height: %d"
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0326 }
            int r3 = r3.length     // Catch:{ all -> 0x0326 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0326 }
            r9 = 0
            r10[r9] = r3     // Catch:{ all -> 0x0326 }
            r3 = r15[r9]     // Catch:{ all -> 0x0326 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0326 }
            r9 = 1
            r10[r9] = r3     // Catch:{ all -> 0x0326 }
            r3 = r15[r9]     // Catch:{ all -> 0x0326 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0326 }
            r9 = 2
            r10[r9] = r3     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r8, r10)     // Catch:{ all -> 0x0326 }
        L_0x0227:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0326 }
            r3.<init>()     // Catch:{ all -> 0x0326 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0326 }
            r4.<init>()     // Catch:{ all -> 0x0326 }
            byte[] r8 = r0.f65873i     // Catch:{ all -> 0x0326 }
            if (r8 == 0) goto L_0x031c
            it3.a r9 = r0.f65869e     // Catch:{ all -> 0x0326 }
            r25 = r9
            lx.i0 r25 = (p200lx.C21474i0) r25     // Catch:{ all -> 0x0326 }
            r9 = 0
            r27 = r5[r9]     // Catch:{ all -> 0x0326 }
            r9 = 1
            r28 = r5[r9]     // Catch:{ all -> 0x0326 }
            r29 = 0
            r26 = r8
            r30 = r4
            r31 = r3
            java.util.List r5 = r25.mo27321a(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0326 }
            java.lang.String r8 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r9 = "after scanImage, result:%b"
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0326 }
            if (r5 == 0) goto L_0x025e
            boolean r10 = r5.isEmpty()     // Catch:{ all -> 0x0326 }
            if (r10 != 0) goto L_0x025e
            r10 = 1
            goto L_0x025f
        L_0x025e:
            r10 = 0
        L_0x025f:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0326 }
            r12 = 0
            r11[r12] = r10     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r11)     // Catch:{ all -> 0x0326 }
            if (r5 == 0) goto L_0x031a
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x0326 }
            if (r8 != 0) goto L_0x031a
            boolean r8 = r4.isEmpty()     // Catch:{ all -> 0x0326 }
            if (r8 == 0) goto L_0x0279
            goto L_0x031a
        L_0x0279:
            java.lang.String r8 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r9 = "GetResults size %d"
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0326 }
            int r10 = r5.size()     // Catch:{ all -> 0x0326 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0326 }
            r12 = 0
            r11[r12] = r10     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r11)     // Catch:{ all -> 0x0326 }
            java.lang.Object r5 = r5.get(r12)     // Catch:{ all -> 0x0326 }
            com.tencent.qbar.a$a r5 = (com.tencent.qbar.C19931a.C19932a) r5     // Catch:{ all -> 0x0326 }
            java.lang.Object r4 = r4.get(r12)     // Catch:{ all -> 0x0326 }
            r23 = r4
            com.tencent.qbar.QbarNative$QBarPoint r23 = (com.tencent.qbar.QbarNative.QBarPoint) r23     // Catch:{ all -> 0x0326 }
            r10 = r0
            r11 = r23
            r12 = r2
            r13 = r14
            r14 = r7
            r15 = r6
            r16 = r19
            r10.mo36094e(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0326 }
            java.lang.String r2 = "MicroMsg.appbrand.ScanQBarDecoder"
            java.lang.String r4 = "decode type:%s, sCharset: %s, data:%s"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0326 }
            java.lang.String r7 = r5.f56828e     // Catch:{ all -> 0x0326 }
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x0326 }
            java.lang.String r7 = r5.f56831h     // Catch:{ all -> 0x0326 }
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x0326 }
            java.lang.String r7 = r5.f56829f     // Catch:{ all -> 0x0326 }
            r8 = 2
            r6[r8] = r7     // Catch:{ all -> 0x0326 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ all -> 0x0326 }
            java.lang.String r2 = r5.f56829f     // Catch:{ all -> 0x0326 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x0326 }
            if (r2 != 0) goto L_0x0318
            java.lang.String r2 = r5.f56828e     // Catch:{ all -> 0x0326 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0326 }
            if (r4 == 0) goto L_0x02d4
            r21 = 0
            goto L_0x02df
        L_0x02d4:
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0326 }
            com.tencent.qbar.WxQbarNative$QBarReportMsg r3 = (com.tencent.qbar.WxQbarNative.QBarReportMsg) r3     // Catch:{ all -> 0x0326 }
            int r3 = r3.qrcodeVersion     // Catch:{ all -> 0x0326 }
            r21 = r3
        L_0x02df:
            java.lang.String r3 = "QR_CODE"
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0326 }
            if (r3 != 0) goto L_0x0303
            java.lang.String r3 = "WX_CODE"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0326 }
            if (r2 == 0) goto L_0x02f0
            goto L_0x0303
        L_0x02f0:
            java.lang.String r2 = r5.f56829f     // Catch:{ all -> 0x0326 }
            r19 = 2
            r17 = 1
            r20 = 0
            r22 = 0
            r16 = r0
            r18 = r2
            r16.mo36096a(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0326 }
            monitor-exit(r24)     // Catch:{ all -> 0x0326 }
            goto L_0x031d
        L_0x0303:
            java.lang.String r2 = r5.f56829f     // Catch:{ all -> 0x0326 }
            r19 = 1
            r17 = 1
            r20 = 0
            byte[] r3 = r5.f56830g     // Catch:{ all -> 0x0326 }
            r16 = r0
            r18 = r2
            r22 = r3
            r16.mo36096a(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0326 }
            monitor-exit(r24)     // Catch:{ all -> 0x0326 }
            goto L_0x031d
        L_0x0318:
            monitor-exit(r24)     // Catch:{ all -> 0x0326 }
            goto L_0x031d
        L_0x031a:
            monitor-exit(r24)     // Catch:{ all -> 0x0326 }
            goto L_0x031d
        L_0x031c:
            monitor-exit(r24)     // Catch:{ all -> 0x0326 }
        L_0x031d:
            wk0.c r0 = r1.f65883p
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f65884a
            r2 = 0
            r0.set(r2)
            return
        L_0x0326:
            r0 = move-exception
            goto L_0x032b
        L_0x0328:
            r0 = move-exception
            r24 = r13
        L_0x032b:
            r13 = r24
        L_0x032d:
            monitor-exit(r13)     // Catch:{ all -> 0x032f }
            throw r0
        L_0x032f:
            r0 = move-exception
            goto L_0x032d
        L_0x0331:
            java.lang.String r0 = "MicroMsg.appbrand.ScanDecoder"
            java.lang.String r2 = "decode isDecoding"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk0.C22913b.run():void");
    }
}
