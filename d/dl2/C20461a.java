package dl2;

import android.graphics.Point;
import cl2.C28609a;
import com.tencent.p014mm.plugin.scanner.model.C106084y0;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanUIRectView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dl2.a */
public class C20461a {

    /* renamed from: j */
    public static C20461a f57497j = new C20461a();

    /* renamed from: a */
    public final Object f57498a = new Object();

    /* renamed from: b */
    public final Object f57499b = new Object();

    /* renamed from: c */
    public long f57500c;

    /* renamed from: d */
    public boolean f57501d;

    /* renamed from: e */
    public boolean f57502e;

    /* renamed from: f */
    public Map f57503f = new HashMap();

    /* renamed from: g */
    public C20463b f57504g;

    /* renamed from: h */
    public int f57505h = 0;

    /* renamed from: i */
    public int f57506i = 0;

    /* renamed from: dl2.a$a */
    public class C20462a implements C19027m0 {

        /* renamed from: d */
        public final /* synthetic */ byte[] f57507d;

        /* renamed from: e */
        public final /* synthetic */ Point f57508e;

        /* renamed from: f */
        public final /* synthetic */ int f57509f;

        /* renamed from: g */
        public final /* synthetic */ int f57510g;

        /* renamed from: h */
        public final /* synthetic */ boolean f57511h;

        public C20462a(byte[] bArr, Point point, int i, int i2, boolean z) {
            this.f57507d = bArr;
            this.f57508e = point;
            this.f57509f = i;
            this.f57510g = i2;
            this.f57511h = z;
        }

        public void run() {
            C20461a aVar = C20461a.this;
            byte[] bArr = this.f57507d;
            Point point = this.f57508e;
            int i = this.f57509f;
            int i2 = this.f57510g;
            boolean z = this.f57511h;
            int i3 = i2 != 17 ? i2 != 842094169 ? -1 : 4 : 3;
            if (!aVar.f57501d) {
                synchronized (aVar.f57499b) {
                    int i4 = point.x;
                    int i5 = point.y;
                    MultiProcessMMKV multiProcessMMKV = C28609a.f78501a;
                    Log.m105924i("MicroMsg.ScanClientConfigManager", "enableUseReIdForOldScanGoods false");
                    aVar.f57501d = C19021i0.m20102h(i4, i5, i3, i, z, false, C28609a.m38281a()) == 0;
                }
                if (i % 180 != 0) {
                    aVar.f57505h = point.y;
                    aVar.f57506i = point.x;
                } else {
                    aVar.f57505h = point.x;
                    aVar.f57506i = point.y;
                }
            }
            if (aVar.f57501d) {
                synchronized (aVar.f57498a) {
                    ((HashMap) aVar.f57503f).clear();
                    ((HashMap) aVar.f57503f).put("param_preview_data", bArr);
                    ((HashMap) aVar.f57503f).put("param_camera_resolution", point);
                    ((HashMap) aVar.f57503f).put("param_camera_rotation", Integer.valueOf(i));
                    ((HashMap) aVar.f57503f).put("param_pixel_format", Integer.valueOf(i3));
                    if (!aVar.f57502e) {
                        long j = aVar.f57500c;
                        if (j != 0) {
                            C19021i0.m20105l(new C20464c(j));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: dl2.a$b */
    public interface C20463b extends C20478i {
        /* renamed from: c */
        void mo24448c(C106084y0 y0Var);
    }

    /* renamed from: dl2.a$c */
    public class C20464c implements C19027m0 {

        /* renamed from: d */
        public long f57513d;

        /* renamed from: e */
        public byte[] f57514e;

        /* renamed from: f */
        public Point f57515f;

        /* renamed from: g */
        public int f57516g;

        /* renamed from: h */
        public int f57517h;

        public C20464c(long j) {
            this.f57513d = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x007f, code lost:
            if (r1.f57518i.f57501d == false) goto L_0x0185;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
            if (r1.f57514e == null) goto L_0x0185;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo processFrame session: %d, curSession: %d, resolution: %s, pixelFormat: %d, cameraRotation: %d, len: %d", java.lang.Long.valueOf(r1.f57513d), java.lang.Long.valueOf(r1.f57518i.f57500c), r1.f57515f, java.lang.Integer.valueOf(r1.f57517h), java.lang.Integer.valueOf(r1.f57516g), java.lang.Integer.valueOf(r1.f57514e.length));
            r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20103j(r1.f57514e, r1.f57517h, r1.f57516g);
            r5 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20101g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d0, code lost:
            if (r5 == null) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d2, code lost:
            r7 = r1.f57518i.f57504g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d6, code lost:
            if (r7 == null) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d8, code lost:
            r7.mo24448c(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00db, code lost:
            if (r2 == null) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
            if (r2.bestImageData == null) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
            if (r2.width <= 0) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e7, code lost:
            if (r2.height <= 0) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00eb, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ec, code lost:
            if (r5 == false) goto L_0x0185;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
            r0 = r2.result;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
            if (r0 <= 0) goto L_0x00f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
            if ((r0 & 2) == 0) goto L_0x00f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
            r15 = r2.bestImageData;
            r7 = r2.bestImageId;
            r9 = r2.width;
            r2 = r2.height;
            r6 = new java.lang.Object[6];
            r6[0] = java.lang.Integer.valueOf(r0);
            r6[1] = 2;
            r6[2] = java.lang.Boolean.valueOf(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0119, code lost:
            if (r15 == null) goto L_0x011d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x011b, code lost:
            r0 = r15.length;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x011d, code lost:
            r0 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x011e, code lost:
            r6[3] = java.lang.Integer.valueOf(r0);
            r6[4] = java.lang.Integer.valueOf(r9);
            r6[5] = java.lang.Integer.valueOf(r2);
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo processFrame result: %d, outputClearFlag: %d, isBest: %b, bestImage length: %d, finalWidth: %d, finalHeight: %d", r6);
            r14 = new android.graphics.YuvImage(r15, 17, r9, r2, (int[]) null);
            r10 = new android.graphics.Rect(0, 0, r9, r2);
            r11 = java.lang.System.currentTimeMillis();
            r2 = new java.io.ByteArrayOutputStream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r14.compressToJpeg(r10, 70, r2);
            r2.flush();
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x015c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.AiScanImageDecodeQueueNew", r0, "alvinluo compressToJpeg exception %s", r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0185, code lost:
            r5 = true;
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0075, code lost:
            r0 = null;
            r4 = r1.f57518i.f57499b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r20 = this;
                r1 = r20
                dl2.a r0 = dl2.C20461a.this
                java.lang.Object r2 = r0.f57498a
                monitor-enter(r2)
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x0217 }
                r3 = 1
                r0.f57502e = r3     // Catch:{ all -> 0x0217 }
                long r4 = r1.f57513d     // Catch:{ all -> 0x0217 }
                long r6 = r0.f57500c     // Catch:{ all -> 0x0217 }
                r8 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 != 0) goto L_0x0210
                java.util.Map r0 = r0.f57503f     // Catch:{ all -> 0x0217 }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0217 }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0217 }
                if (r0 != 0) goto L_0x0074
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x0217 }
                java.util.Map r0 = r0.f57503f     // Catch:{ all -> 0x0217 }
                java.lang.String r4 = "param_preview_data"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0217 }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0217 }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0217 }
                r1.f57514e = r0     // Catch:{ all -> 0x0217 }
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x0217 }
                java.util.Map r0 = r0.f57503f     // Catch:{ all -> 0x0217 }
                java.lang.String r4 = "param_camera_resolution"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0217 }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0217 }
                android.graphics.Point r0 = (android.graphics.Point) r0     // Catch:{ all -> 0x0217 }
                r1.f57515f = r0     // Catch:{ all -> 0x0217 }
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x0217 }
                java.util.Map r0 = r0.f57503f     // Catch:{ all -> 0x0217 }
                java.lang.String r4 = "param_camera_rotation"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0217 }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0217 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0217 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0217 }
                r1.f57516g = r0     // Catch:{ all -> 0x0217 }
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x0217 }
                java.util.Map r0 = r0.f57503f     // Catch:{ all -> 0x0217 }
                java.lang.String r4 = "param_pixel_format"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0217 }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0217 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0217 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0217 }
                r1.f57517h = r0     // Catch:{ all -> 0x0217 }
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x0217 }
                java.util.Map r0 = r0.f57503f     // Catch:{ all -> 0x0217 }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0217 }
                r0.clear()     // Catch:{ all -> 0x0217 }
            L_0x0074:
                monitor-exit(r2)     // Catch:{ all -> 0x0217 }
                r0 = 0
                dl2.a r2 = dl2.C20461a.this
                java.lang.Object r4 = r2.f57499b
                monitor-enter(r4)
                dl2.a r2 = dl2.C20461a.this     // Catch:{ all -> 0x020d }
                boolean r2 = r2.f57501d     // Catch:{ all -> 0x020d }
                if (r2 == 0) goto L_0x0185
                byte[] r2 = r1.f57514e     // Catch:{ all -> 0x020d }
                if (r2 == 0) goto L_0x0185
                java.lang.String r2 = "MicroMsg.AiScanImageDecodeQueueNew"
                java.lang.String r5 = "alvinluo processFrame session: %d, curSession: %d, resolution: %s, pixelFormat: %d, cameraRotation: %d, len: %d"
                r6 = 6
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x020d }
                long r9 = r1.f57513d     // Catch:{ all -> 0x020d }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x020d }
                r7[r8] = r9     // Catch:{ all -> 0x020d }
                dl2.a r9 = dl2.C20461a.this     // Catch:{ all -> 0x020d }
                long r9 = r9.f57500c     // Catch:{ all -> 0x020d }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x020d }
                r7[r3] = r9     // Catch:{ all -> 0x020d }
                android.graphics.Point r9 = r1.f57515f     // Catch:{ all -> 0x020d }
                r10 = 2
                r7[r10] = r9     // Catch:{ all -> 0x020d }
                int r9 = r1.f57517h     // Catch:{ all -> 0x020d }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020d }
                r11 = 3
                r7[r11] = r9     // Catch:{ all -> 0x020d }
                int r9 = r1.f57516g     // Catch:{ all -> 0x020d }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020d }
                r12 = 4
                r7[r12] = r9     // Catch:{ all -> 0x020d }
                byte[] r9 = r1.f57514e     // Catch:{ all -> 0x020d }
                int r9 = r9.length     // Catch:{ all -> 0x020d }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020d }
                r13 = 5
                r7[r13] = r9     // Catch:{ all -> 0x020d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r7)     // Catch:{ all -> 0x020d }
                byte[] r2 = r1.f57514e     // Catch:{ all -> 0x020d }
                int r5 = r1.f57517h     // Catch:{ all -> 0x020d }
                int r7 = r1.f57516g     // Catch:{ all -> 0x020d }
                com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20103j(r2, r5, r7)     // Catch:{ all -> 0x020d }
                com.tencent.mm.plugin.scanner.model.y0 r5 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20101g()     // Catch:{ all -> 0x020d }
                if (r5 == 0) goto L_0x00db
                dl2.a r7 = dl2.C20461a.this     // Catch:{ all -> 0x020d }
                dl2.a$b r7 = r7.f57504g     // Catch:{ all -> 0x020d }
                if (r7 == 0) goto L_0x00db
                r7.mo24448c(r5)     // Catch:{ all -> 0x020d }
            L_0x00db:
                if (r2 == 0) goto L_0x00eb
                byte[] r5 = r2.bestImageData     // Catch:{ all -> 0x020d }
                if (r5 == 0) goto L_0x00eb
                int r5 = r2.width     // Catch:{ all -> 0x020d }
                if (r5 <= 0) goto L_0x00eb
                int r5 = r2.height     // Catch:{ all -> 0x020d }
                if (r5 <= 0) goto L_0x00eb
                r5 = 1
                goto L_0x00ec
            L_0x00eb:
                r5 = 0
            L_0x00ec:
                if (r5 == 0) goto L_0x0185
                int r0 = r2.result     // Catch:{ all -> 0x020d }
                if (r0 <= 0) goto L_0x00f8
                r5 = r0 & 2
                if (r5 == 0) goto L_0x00f8
                r5 = 1
                goto L_0x00f9
            L_0x00f8:
                r5 = 0
            L_0x00f9:
                byte[] r15 = r2.bestImageData     // Catch:{ all -> 0x020d }
                int r7 = r2.bestImageId     // Catch:{ all -> 0x020d }
                int r9 = r2.width     // Catch:{ all -> 0x020d }
                int r2 = r2.height     // Catch:{ all -> 0x020d }
                java.lang.String r14 = "MicroMsg.AiScanImageDecodeQueueNew"
                java.lang.String r13 = "alvinluo processFrame result: %d, outputClearFlag: %d, isBest: %b, bestImage length: %d, finalWidth: %d, finalHeight: %d"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x020d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020d }
                r6[r8] = r0     // Catch:{ all -> 0x020d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x020d }
                r6[r3] = r0     // Catch:{ all -> 0x020d }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x020d }
                r6[r10] = r0     // Catch:{ all -> 0x020d }
                if (r15 == 0) goto L_0x011d
                int r0 = r15.length     // Catch:{ all -> 0x020d }
                goto L_0x011e
            L_0x011d:
                r0 = -1
            L_0x011e:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020d }
                r6[r11] = r0     // Catch:{ all -> 0x020d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020d }
                r6[r12] = r0     // Catch:{ all -> 0x020d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x020d }
                r10 = 5
                r6[r10] = r0     // Catch:{ all -> 0x020d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r13, r6)     // Catch:{ all -> 0x020d }
                android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ all -> 0x020d }
                r16 = 17
                r19 = 0
                r14 = r0
                r17 = r9
                r18 = r2
                r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x020d }
                r6 = 70
                android.graphics.Rect r10 = new android.graphics.Rect     // Catch:{ all -> 0x020d }
                r10.<init>(r8, r8, r9, r2)     // Catch:{ all -> 0x020d }
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020d }
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x020d }
                r2.<init>()     // Catch:{ all -> 0x020d }
                r0.compressToJpeg(r10, r6, r2)     // Catch:{ Exception -> 0x015c }
                r2.flush()     // Catch:{ Exception -> 0x015c }
                r2.close()     // Catch:{ Exception -> 0x015c }
                goto L_0x016c
            L_0x015c:
                r0 = move-exception
                java.lang.String r6 = "MicroMsg.AiScanImageDecodeQueueNew"
                java.lang.String r9 = "alvinluo compressToJpeg exception %s"
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x020d }
                java.lang.String r13 = r0.getMessage()     // Catch:{ all -> 0x020d }
                r10[r8] = r13     // Catch:{ all -> 0x020d }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r10)     // Catch:{ all -> 0x020d }
            L_0x016c:
                byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x020d }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020d }
                java.lang.String r2 = "MicroMsg.AiScanImageDecodeQueueNew"
                java.lang.String r6 = "alvinluo process yuvImage to jpg cost %d ms"
                java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x020d }
                long r9 = r9 - r11
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x020d }
                r13[r8] = r9     // Catch:{ all -> 0x020d }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r6, r13)     // Catch:{ all -> 0x020d }
                goto L_0x0187
            L_0x0185:
                r5 = 1
                r7 = 0
            L_0x0187:
                monitor-exit(r4)     // Catch:{ all -> 0x020d }
                dl2.a r2 = dl2.C20461a.this
                java.lang.Object r2 = r2.f57498a
                monitor-enter(r2)
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x020a }
                r4.<init>()     // Catch:{ all -> 0x020a }
                java.lang.String r6 = "result_is_best_img"
                r4.putBoolean(r6, r5)     // Catch:{ all -> 0x020a }
                java.lang.String r6 = "scan_source"
                r4.putInt(r6, r3)     // Catch:{ all -> 0x020a }
                java.lang.String r3 = "key_scan_goods_mode"
                r4.putInt(r3, r8)     // Catch:{ all -> 0x020a }
                long r9 = r1.f57513d     // Catch:{ all -> 0x020a }
                dl2.a r3 = dl2.C20461a.this     // Catch:{ all -> 0x020a }
                long r11 = r3.f57500c     // Catch:{ all -> 0x020a }
                int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r6 != 0) goto L_0x0203
                if (r5 == 0) goto L_0x01fd
                if (r0 == 0) goto L_0x01fd
                java.lang.String r3 = "result_best_img"
                r4.putByteArray(r3, r0)     // Catch:{ all -> 0x020a }
                java.lang.String r0 = "result_best_img_id"
                r4.putInt(r0, r7)     // Catch:{ all -> 0x020a }
                java.lang.String r0 = "result_img_origin_width"
                dl2.a r3 = dl2.C20461a.this     // Catch:{ all -> 0x020a }
                int r3 = r3.f57505h     // Catch:{ all -> 0x020a }
                r4.putInt(r0, r3)     // Catch:{ all -> 0x020a }
                java.lang.String r0 = "result_img_origin_height"
                dl2.a r3 = dl2.C20461a.this     // Catch:{ all -> 0x020a }
                int r3 = r3.f57506i     // Catch:{ all -> 0x020a }
                r4.putInt(r0, r3)     // Catch:{ all -> 0x020a }
                com.tencent.mm.protocal.protobuf.GoodsObject r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20098d()     // Catch:{ Exception -> 0x01e2 }
                if (r0 == 0) goto L_0x01ec
                java.lang.String r3 = "result_crop_object"
                byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x01e2 }
                r4.putByteArray(r3, r0)     // Catch:{ Exception -> 0x01e2 }
                goto L_0x01ec
            L_0x01e2:
                r0 = move-exception
                java.lang.String r3 = "MicroMsg.AiScanImageDecodeQueueNew"
                java.lang.String r5 = "alvinluo getCropObject and save exception"
                java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x020a }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r6)     // Catch:{ all -> 0x020a }
            L_0x01ec:
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x020a }
                dl2.a$b r3 = r0.f57504g     // Catch:{ all -> 0x020a }
                long r5 = r0.f57500c     // Catch:{ all -> 0x020a }
                r3.mo24447b(r5, r4)     // Catch:{ all -> 0x020a }
                dl2.a r0 = dl2.C20461a.this     // Catch:{ all -> 0x020a }
                r0.f57502e = r8     // Catch:{ all -> 0x020a }
                dl2.C20461a.m22081a(r0)     // Catch:{ all -> 0x020a }
                goto L_0x0208
            L_0x01fd:
                r3.f57502e = r8     // Catch:{ all -> 0x020a }
                dl2.C20461a.m22081a(r3)     // Catch:{ all -> 0x020a }
                goto L_0x0208
            L_0x0203:
                r3.f57502e = r8     // Catch:{ all -> 0x020a }
                dl2.C20461a.m22081a(r3)     // Catch:{ all -> 0x020a }
            L_0x0208:
                monitor-exit(r2)     // Catch:{ all -> 0x020a }
                return
            L_0x020a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x020a }
                throw r0
            L_0x020d:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x020d }
                throw r0
            L_0x0210:
                r0.f57502e = r8     // Catch:{ all -> 0x0217 }
                dl2.C20461a.m22081a(r0)     // Catch:{ all -> 0x0217 }
                monitor-exit(r2)     // Catch:{ all -> 0x0217 }
                return
            L_0x0217:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0217 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dl2.C20461a.C20464c.run():void");
        }
    }

    /* renamed from: dl2.a$d */
    public interface C20465d extends ScanUIRectView.ScanCallBack {
        /* renamed from: b */
        void mo24355b(long j, int i, int i2, String str);
    }

    /* renamed from: a */
    public static void m22081a(C20461a aVar) {
        if (!((HashMap) aVar.f57503f).isEmpty()) {
            long j = aVar.f57500c;
            if (j != 0) {
                Log.m105925i("MicroMsg.AiScanImageDecodeQueueNew", "%d decode hit cache", Long.valueOf(j));
                C19021i0.m20105l(new C20464c(aVar.f57500c));
                return;
            }
        }
        C20463b bVar = aVar.f57504g;
        if (bVar != null) {
            bVar.mo24446a(aVar.f57500c, 0);
        }
    }

    /* renamed from: b */
    public void mo32011b(byte[] bArr, Point point, int i, int i2, boolean z) {
        Log.m105927v("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo addDecodeTask resolution: %s, previewData length: %d, cameraRotation: %d, previewFormat: %d", point, Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2));
        C19021i0.m20105l(new C20462a(bArr, point, i, i2, z));
    }
}
