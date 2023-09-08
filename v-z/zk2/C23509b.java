package zk2;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.licence.model.LibCardRecog;
import com.tencent.p014mm.plugin.scanner.view.ScanCardRectView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: zk2.b */
public class C23509b {

    /* renamed from: m */
    public static C23509b f67427m = new C23509b();

    /* renamed from: a */
    public Map f67428a = new HashMap();

    /* renamed from: b */
    public Object f67429b = new Object();

    /* renamed from: c */
    public Object f67430c = new Object();

    /* renamed from: d */
    public ExecutorService f67431d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    public long f67432e;

    /* renamed from: f */
    public C23511b f67433f;

    /* renamed from: g */
    public volatile boolean f67434g;

    /* renamed from: h */
    public boolean f67435h;

    /* renamed from: i */
    public int f67436i;

    /* renamed from: j */
    public int f67437j;

    /* renamed from: k */
    public Rect f67438k = new Rect();

    /* renamed from: l */
    public Rect f67439l = new Rect();

    /* renamed from: zk2.b$a */
    public class C23510a implements Runnable {

        /* renamed from: d */
        public long f67440d;

        /* renamed from: e */
        public byte[] f67441e;

        /* renamed from: f */
        public Point f67442f;

        /* renamed from: g */
        public int f67443g;

        /* renamed from: h */
        public boolean[] f67444h = new boolean[4];

        public C23510a(long j) {
            this.f67440d = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x007f, code lost:
            r0 = new com.tencent.p014mm.plugin.licence.model.CardInfo(r1.f67445i.f67439l.width(), r1.f67445i.f67439l.height());
            r4 = r1.f67445i.f67430c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0098, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r2 = r1.f67441e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x009d, code lost:
            if (r2 == null) goto L_0x0153;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
            if (r2.length <= 0) goto L_0x0153;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
            r9 = java.lang.System.currentTimeMillis();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
            if ((r1.f67443g % 180) == 0) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ac, code lost:
            r2 = r1.f67442f;
            r7 = r2.x;
            r2 = r2.y;
            r11 = new byte[(((r7 * r2) * 3) / 2)];
            r12 = r1.f67441e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bb, code lost:
            if (r12 != null) goto L_0x00be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
            com.tencent.qbar.QbarNative.nativeYUVrotate(r11, r12, r7, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
            r2 = r1.f67442f;
            r12 = r2.x;
            r13 = r2.y;
            r2 = r1.f67445i.f67439l;
            r2 = com.tencent.p014mm.plugin.licence.model.LibCardRecog.recognizeCardProcess(r11, r12, r13, r2.left, r2.top, r2.height(), r1.f67445i.f67439l.width(), r0, r1.f67444h);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e6, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
            r11 = r1.f67441e;
            r2 = r1.f67442f;
            r12 = r2.y;
            r13 = r2.x;
            r2 = r1.f67445i.f67439l;
            r2 = com.tencent.p014mm.plugin.licence.model.LibCardRecog.recognizeCardProcess(r11, r12, r13, r2.left, r2.top, r2.height(), r1.f67445i.f67439l.width(), r0, r1.f67444h);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x010f, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.LicenseCardDecodeQueue", "recognizeProcess, ret %d, cost %d", java.lang.Integer.valueOf(r2), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r9));
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.LicenseCardDecodeQueue", "mRecogRectEdge: %s", java.util.Arrays.toString(r1.f67444h));
            r7 = r1.f67445i;
            r7.f67437j++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0147, code lost:
            if (r7.mo36985c() == false) goto L_0x0154;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x014f, code lost:
            if (r1.f67445i.f67437j >= 60) goto L_0x0154;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0151, code lost:
            r2 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0153, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0154, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0159, code lost:
            if ((r1.f67443g % 180) == 0) goto L_0x016d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x015b, code lost:
            r4 = r1.f67444h;
            r7 = r4[0];
            r4[0] = r4[2];
            r4[2] = r7;
            r7 = r4[1];
            r4[1] = r4[3];
            r4[3] = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
            r7 = r1.f67445i.f67429b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0171, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r9 = r1.f67440d;
            r4 = r1.f67445i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x017a, code lost:
            if (r9 != r4.f67432e) goto L_0x028f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x017c, code lost:
            r4 = new android.os.Bundle();
            r4.putBooleanArray("param_card_edge", r1.f67444h);
            r9 = r1.f67445i.f67433f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x018d, code lost:
            if (r9 == null) goto L_0x0196;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x018f, code lost:
            ((com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19135d) r9).mo24522a(r1.f67440d, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0196, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.LicenseCardDecodeQueue", "scan card retCode:%d, bitmap len %d", java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r0.bitmapLen));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ae, code lost:
            if (r2 == 1) goto L_0x01b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b0, code lost:
            r0 = r1.f67445i;
            r0.f67435h = false;
            zk2.C23509b.m28081a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b7, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b8, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b9, code lost:
            r2 = new android.graphics.BitmapFactory.Options();
            r2.inSampleSize = 1;
            r0 = android.graphics.BitmapFactory.decodeByteArray(r0.bitmapData, 0, r0.bitmapLen, r2).copy(android.graphics.Bitmap.Config.ARGB_8888, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d4, code lost:
            if (r1.f67445i.mo36985c() == false) goto L_0x0222;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01da, code lost:
            if (1 != r1.f67445i.f67436i) goto L_0x0222;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01dc, code lost:
            r2 = r1.f67441e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e2, code lost:
            if ((r1.f67443g % 180) == 0) goto L_0x01f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e4, code lost:
            r4 = r1.f67442f;
            r9 = r4.x;
            r4 = r4.y;
            r6 = new byte[(((r9 * r4) * 3) / 2)];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f1, code lost:
            if (r2 != null) goto L_0x01f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f4, code lost:
            com.tencent.qbar.QbarNative.nativeYUVrotate(r6, r2, r9, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f7, code lost:
            r11 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f9, code lost:
            r11 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            r4 = r1.f67442f;
            r10 = new android.graphics.YuvImage(r11, 17, r4.y, r4.x, (int[]) null);
            r4 = new java.io.ByteArrayOutputStream();
            r10.compressToJpeg(r1.f67445i.f67439l, 40, r4);
            r2 = r4.toByteArray();
            r0 = android.graphics.BitmapFactory.decodeByteArray(r2, 0, r2.length);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x028f, code lost:
            r4.f67435h = false;
            zk2.C23509b.m28081a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x029a, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r20 = this;
                r1 = r20
                zk2.b r0 = zk2.C23509b.this
                java.lang.Object r2 = r0.f67429b
                monitor-enter(r2)
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x029f }
                r3 = 1
                r0.f67435h = r3     // Catch:{ all -> 0x029f }
                long r4 = r1.f67440d     // Catch:{ all -> 0x029f }
                long r6 = r0.f67432e     // Catch:{ all -> 0x029f }
                r8 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 != 0) goto L_0x029b
                java.util.Map r0 = r0.f67428a     // Catch:{ all -> 0x029f }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x029f }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x029f }
                if (r0 != 0) goto L_0x0069
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x029f }
                java.util.Map r0 = r0.f67428a     // Catch:{ all -> 0x029f }
                java.lang.String r4 = "param_preview_data"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x029f }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x029f }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x029f }
                int r4 = r0.length     // Catch:{ all -> 0x029f }
                byte[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x029f }
                r1.f67441e = r0     // Catch:{ all -> 0x029f }
                android.graphics.Point r0 = new android.graphics.Point     // Catch:{ all -> 0x029f }
                zk2.b r4 = zk2.C23509b.this     // Catch:{ all -> 0x029f }
                java.util.Map r4 = r4.f67428a     // Catch:{ all -> 0x029f }
                java.lang.String r5 = "param_camera_resolution"
                java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x029f }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x029f }
                android.graphics.Point r4 = (android.graphics.Point) r4     // Catch:{ all -> 0x029f }
                r0.<init>(r4)     // Catch:{ all -> 0x029f }
                r1.f67442f = r0     // Catch:{ all -> 0x029f }
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x029f }
                java.util.Map r0 = r0.f67428a     // Catch:{ all -> 0x029f }
                java.lang.String r4 = "param_camera_rotation"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x029f }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x029f }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x029f }
                int r0 = r0.intValue()     // Catch:{ all -> 0x029f }
                r1.f67443g = r0     // Catch:{ all -> 0x029f }
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x029f }
                java.util.Map r0 = r0.f67428a     // Catch:{ all -> 0x029f }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x029f }
                r0.clear()     // Catch:{ all -> 0x029f }
            L_0x0069:
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x029f }
                zk2.b$b r4 = r0.f67433f     // Catch:{ all -> 0x029f }
                long r5 = r0.f67432e     // Catch:{ all -> 0x029f }
                r9 = 10
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$d r4 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19135d) r4     // Catch:{ all -> 0x029f }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x029f }
                long r11 = r0.f53841p     // Catch:{ all -> 0x029f }
                int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r4 != 0) goto L_0x007e
                r0.mo24382k(r9)     // Catch:{ all -> 0x029f }
            L_0x007e:
                monitor-exit(r2)     // Catch:{ all -> 0x029f }
                com.tencent.mm.plugin.licence.model.CardInfo r0 = new com.tencent.mm.plugin.licence.model.CardInfo
                zk2.b r2 = zk2.C23509b.this
                android.graphics.Rect r2 = r2.f67439l
                int r2 = r2.width()
                zk2.b r4 = zk2.C23509b.this
                android.graphics.Rect r4 = r4.f67439l
                int r4 = r4.height()
                r0.<init>(r2, r4)
                zk2.b r2 = zk2.C23509b.this
                java.lang.Object r4 = r2.f67430c
                monitor-enter(r4)
                byte[] r2 = r1.f67441e     // Catch:{ all -> 0x00e6 }
                r5 = 2
                r6 = 3
                if (r2 == 0) goto L_0x0153
                int r2 = r2.length     // Catch:{ all -> 0x00e6 }
                if (r2 <= 0) goto L_0x0153
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e6 }
                int r2 = r1.f67443g     // Catch:{ all -> 0x00e6 }
                int r2 = r2 % 180
                if (r2 == 0) goto L_0x00e9
                android.graphics.Point r2 = r1.f67442f     // Catch:{ all -> 0x00e6 }
                int r7 = r2.x     // Catch:{ all -> 0x00e6 }
                int r2 = r2.y     // Catch:{ all -> 0x00e6 }
                int r11 = r7 * r2
                int r11 = r11 * 3
                int r11 = r11 / r5
                byte[] r11 = new byte[r11]     // Catch:{ all -> 0x00e6 }
                byte[] r12 = r1.f67441e     // Catch:{ all -> 0x00e6 }
                if (r12 != 0) goto L_0x00be
                goto L_0x00c1
            L_0x00be:
                com.tencent.qbar.QbarNative.nativeYUVrotate(r11, r12, r7, r2)     // Catch:{ all -> 0x00e6 }
            L_0x00c1:
                android.graphics.Point r2 = r1.f67442f     // Catch:{ all -> 0x00e6 }
                int r12 = r2.x     // Catch:{ all -> 0x00e6 }
                int r13 = r2.y     // Catch:{ all -> 0x00e6 }
                zk2.b r2 = zk2.C23509b.this     // Catch:{ all -> 0x00e6 }
                android.graphics.Rect r2 = r2.f67439l     // Catch:{ all -> 0x00e6 }
                int r14 = r2.left     // Catch:{ all -> 0x00e6 }
                int r15 = r2.top     // Catch:{ all -> 0x00e6 }
                int r16 = r2.height()     // Catch:{ all -> 0x00e6 }
                zk2.b r2 = zk2.C23509b.this     // Catch:{ all -> 0x00e6 }
                android.graphics.Rect r2 = r2.f67439l     // Catch:{ all -> 0x00e6 }
                int r17 = r2.width()     // Catch:{ all -> 0x00e6 }
                boolean[] r2 = r1.f67444h     // Catch:{ all -> 0x00e6 }
                r18 = r0
                r19 = r2
                int r2 = com.tencent.p014mm.plugin.licence.model.LibCardRecog.recognizeCardProcess(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00e6 }
                goto L_0x010f
            L_0x00e6:
                r0 = move-exception
                goto L_0x0299
            L_0x00e9:
                byte[] r11 = r1.f67441e     // Catch:{ all -> 0x00e6 }
                android.graphics.Point r2 = r1.f67442f     // Catch:{ all -> 0x00e6 }
                int r12 = r2.y     // Catch:{ all -> 0x00e6 }
                int r13 = r2.x     // Catch:{ all -> 0x00e6 }
                zk2.b r2 = zk2.C23509b.this     // Catch:{ all -> 0x00e6 }
                android.graphics.Rect r2 = r2.f67439l     // Catch:{ all -> 0x00e6 }
                int r14 = r2.left     // Catch:{ all -> 0x00e6 }
                int r15 = r2.top     // Catch:{ all -> 0x00e6 }
                int r16 = r2.height()     // Catch:{ all -> 0x00e6 }
                zk2.b r2 = zk2.C23509b.this     // Catch:{ all -> 0x00e6 }
                android.graphics.Rect r2 = r2.f67439l     // Catch:{ all -> 0x00e6 }
                int r17 = r2.width()     // Catch:{ all -> 0x00e6 }
                boolean[] r2 = r1.f67444h     // Catch:{ all -> 0x00e6 }
                r18 = r0
                r19 = r2
                int r2 = com.tencent.p014mm.plugin.licence.model.LibCardRecog.recognizeCardProcess(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00e6 }
            L_0x010f:
                java.lang.String r7 = "MicroMsg.LicenseCardDecodeQueue"
                java.lang.String r11 = "recognizeProcess, ret %d, cost %d"
                java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00e6 }
                r12[r8] = r13     // Catch:{ all -> 0x00e6 }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e6 }
                long r13 = r13 - r9
                java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x00e6 }
                r12[r3] = r9     // Catch:{ all -> 0x00e6 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r12)     // Catch:{ all -> 0x00e6 }
                java.lang.String r7 = "MicroMsg.LicenseCardDecodeQueue"
                java.lang.String r9 = "mRecogRectEdge: %s"
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e6 }
                boolean[] r11 = r1.f67444h     // Catch:{ all -> 0x00e6 }
                java.lang.String r11 = java.util.Arrays.toString(r11)     // Catch:{ all -> 0x00e6 }
                r10[r8] = r11     // Catch:{ all -> 0x00e6 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r9, r10)     // Catch:{ all -> 0x00e6 }
                zk2.b r7 = zk2.C23509b.this     // Catch:{ all -> 0x00e6 }
                int r9 = r7.f67437j     // Catch:{ all -> 0x00e6 }
                int r9 = r9 + r3
                r7.f67437j = r9     // Catch:{ all -> 0x00e6 }
                boolean r7 = r7.mo36985c()     // Catch:{ all -> 0x00e6 }
                if (r7 == 0) goto L_0x0154
                zk2.b r7 = zk2.C23509b.this     // Catch:{ all -> 0x00e6 }
                int r7 = r7.f67437j     // Catch:{ all -> 0x00e6 }
                r9 = 60
                if (r7 >= r9) goto L_0x0154
                r2 = 2
                goto L_0x0154
            L_0x0153:
                r2 = 0
            L_0x0154:
                monitor-exit(r4)     // Catch:{ all -> 0x00e6 }
                int r4 = r1.f67443g
                int r4 = r4 % 180
                if (r4 == 0) goto L_0x016d
                boolean[] r4 = r1.f67444h
                boolean r7 = r4[r8]
                boolean r9 = r4[r5]
                r4[r8] = r9
                r4[r5] = r7
                boolean r7 = r4[r3]
                boolean r9 = r4[r6]
                r4[r3] = r9
                r4[r6] = r7
            L_0x016d:
                zk2.b r4 = zk2.C23509b.this
                java.lang.Object r7 = r4.f67429b
                monitor-enter(r7)
                long r9 = r1.f67440d     // Catch:{ all -> 0x0296 }
                zk2.b r4 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                long r11 = r4.f67432e     // Catch:{ all -> 0x0296 }
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 != 0) goto L_0x028f
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0296 }
                r4.<init>()     // Catch:{ all -> 0x0296 }
                java.lang.String r9 = "param_card_edge"
                boolean[] r10 = r1.f67444h     // Catch:{ all -> 0x0296 }
                r4.putBooleanArray(r9, r10)     // Catch:{ all -> 0x0296 }
                zk2.b r9 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                zk2.b$b r9 = r9.f67433f     // Catch:{ all -> 0x0296 }
                if (r9 == 0) goto L_0x0196
                long r10 = r1.f67440d     // Catch:{ all -> 0x0296 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$d r9 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19135d) r9     // Catch:{ all -> 0x0296 }
                r9.mo24522a(r10, r4)     // Catch:{ all -> 0x0296 }
            L_0x0196:
                java.lang.String r4 = "MicroMsg.LicenseCardDecodeQueue"
                java.lang.String r9 = "scan card retCode:%d, bitmap len %d"
                java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0296 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0296 }
                r10[r8] = r11     // Catch:{ all -> 0x0296 }
                int r11 = r0.bitmapLen     // Catch:{ all -> 0x0296 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0296 }
                r10[r3] = r11     // Catch:{ all -> 0x0296 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r9, r10)     // Catch:{ all -> 0x0296 }
                if (r2 == r3) goto L_0x01b9
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                r0.f67435h = r8     // Catch:{ all -> 0x0296 }
                zk2.C23509b.m28081a(r0)     // Catch:{ all -> 0x0296 }
                monitor-exit(r7)     // Catch:{ all -> 0x0296 }
                return
            L_0x01b9:
                android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0296 }
                r2.<init>()     // Catch:{ all -> 0x0296 }
                r2.inSampleSize = r3     // Catch:{ all -> 0x0296 }
                byte[] r4 = r0.bitmapData     // Catch:{ all -> 0x0296 }
                int r0 = r0.bitmapLen     // Catch:{ all -> 0x0296 }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r4, r8, r0, r2)     // Catch:{ all -> 0x0296 }
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0296 }
                android.graphics.Bitmap r0 = r0.copy(r2, r3)     // Catch:{ all -> 0x0296 }
                zk2.b r2 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                boolean r2 = r2.mo36985c()     // Catch:{ all -> 0x0296 }
                if (r2 == 0) goto L_0x0222
                zk2.b r2 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                int r2 = r2.f67436i     // Catch:{ all -> 0x0296 }
                if (r3 != r2) goto L_0x0222
                byte[] r2 = r1.f67441e     // Catch:{ all -> 0x0296 }
                int r4 = r1.f67443g     // Catch:{ all -> 0x0296 }
                int r4 = r4 % 180
                if (r4 == 0) goto L_0x01f9
                android.graphics.Point r4 = r1.f67442f     // Catch:{ all -> 0x0296 }
                int r9 = r4.x     // Catch:{ all -> 0x0296 }
                int r4 = r4.y     // Catch:{ all -> 0x0296 }
                int r10 = r9 * r4
                int r10 = r10 * 3
                int r10 = r10 / r5
                byte[] r6 = new byte[r10]     // Catch:{ all -> 0x0296 }
                if (r2 != 0) goto L_0x01f4
                goto L_0x01f7
            L_0x01f4:
                com.tencent.qbar.QbarNative.nativeYUVrotate(r6, r2, r9, r4)     // Catch:{ all -> 0x0296 }
            L_0x01f7:
                r11 = r6
                goto L_0x01fa
            L_0x01f9:
                r11 = r2
            L_0x01fa:
                android.graphics.YuvImage r2 = new android.graphics.YuvImage     // Catch:{ RuntimeException -> 0x0221 }
                r12 = 17
                android.graphics.Point r4 = r1.f67442f     // Catch:{ RuntimeException -> 0x0221 }
                int r13 = r4.y     // Catch:{ RuntimeException -> 0x0221 }
                int r14 = r4.x     // Catch:{ RuntimeException -> 0x0221 }
                r15 = 0
                r10 = r2
                r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ RuntimeException -> 0x0221 }
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ RuntimeException -> 0x0221 }
                r4.<init>()     // Catch:{ RuntimeException -> 0x0221 }
                zk2.b r6 = zk2.C23509b.this     // Catch:{ RuntimeException -> 0x0221 }
                android.graphics.Rect r6 = r6.f67439l     // Catch:{ RuntimeException -> 0x0221 }
                r9 = 40
                r2.compressToJpeg(r6, r9, r4)     // Catch:{ RuntimeException -> 0x0221 }
                byte[] r2 = r4.toByteArray()     // Catch:{ RuntimeException -> 0x0221 }
                int r4 = r2.length     // Catch:{ RuntimeException -> 0x0221 }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r8, r4)     // Catch:{ RuntimeException -> 0x0221 }
                goto L_0x0222
            L_0x0221:
            L_0x0222:
                if (r0 != 0) goto L_0x022d
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                r0.f67435h = r8     // Catch:{ all -> 0x0296 }
                zk2.C23509b.m28081a(r0)     // Catch:{ all -> 0x0296 }
                monitor-exit(r7)     // Catch:{ all -> 0x0296 }
                return
            L_0x022d:
                java.lang.String r2 = "MicroMsg.LicenseCardDecodeQueue"
                java.lang.String r4 = "scan license card success width %d height %d"
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0296 }
                int r6 = r0.getWidth()     // Catch:{ all -> 0x0296 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0296 }
                r5[r8] = r6     // Catch:{ all -> 0x0296 }
                int r6 = r0.getHeight()     // Catch:{ all -> 0x0296 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0296 }
                r5[r3] = r6     // Catch:{ all -> 0x0296 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r5)     // Catch:{ all -> 0x0296 }
                android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0296 }
                r2.<init>()     // Catch:{ all -> 0x0296 }
                java.lang.String r4 = "param_card_bitmap"
                r5 = 80
                byte[] r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r0, r5)     // Catch:{ all -> 0x0296 }
                r2.putByteArray(r4, r0)     // Catch:{ all -> 0x0296 }
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                zk2.b$b r0 = r0.f67433f     // Catch:{ all -> 0x0296 }
                long r4 = r1.f67440d     // Catch:{ all -> 0x0296 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$d r0 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19135d) r0     // Catch:{ all -> 0x0296 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r6 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x0296 }
                long r9 = r6.f53841p     // Catch:{ all -> 0x0296 }
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L_0x028a
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0296 }
                java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0296 }
                r3[r8] = r6     // Catch:{ all -> 0x0296 }
                java.lang.String r6 = "MicroMsg.ScanCardRectView"
                java.lang.String r9 = "license decode success %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r3)     // Catch:{ all -> 0x0296 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r3 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x0296 }
                r3.mo24516p()     // Catch:{ all -> 0x0296 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x0296 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$g r0 = r0.f53844s     // Catch:{ all -> 0x0296 }
                if (r0 == 0) goto L_0x028a
                r0.mo6126a(r4, r2)     // Catch:{ all -> 0x0296 }
            L_0x028a:
                zk2.b r0 = zk2.C23509b.this     // Catch:{ all -> 0x0296 }
                r0.f67435h = r8     // Catch:{ all -> 0x0296 }
                goto L_0x0294
            L_0x028f:
                r4.f67435h = r8     // Catch:{ all -> 0x0296 }
                zk2.C23509b.m28081a(r4)     // Catch:{ all -> 0x0296 }
            L_0x0294:
                monitor-exit(r7)     // Catch:{ all -> 0x0296 }
                return
            L_0x0296:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0296 }
                throw r0
            L_0x0299:
                monitor-exit(r4)     // Catch:{ all -> 0x00e6 }
                throw r0
            L_0x029b:
                r0.f67435h = r8     // Catch:{ all -> 0x029f }
                monitor-exit(r2)     // Catch:{ all -> 0x029f }
                return
            L_0x029f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x029f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zk2.C23509b.C23510a.run():void");
        }
    }

    /* renamed from: zk2.b$b */
    public interface C23511b {
    }

    /* renamed from: a */
    public static void m28081a(C23509b bVar) {
        if (!((HashMap) bVar.f67428a).isEmpty()) {
            long j = bVar.f67432e;
            if (j != 0) {
                Log.m105925i("MicroMsg.LicenseCardDecodeQueue", "%d decode hit cache", Long.valueOf(j));
                ThreadPool.post(new C23510a(bVar.f67432e), "BankCardDecodeQueue_decode_task");
                return;
            }
        }
        C23511b bVar2 = bVar.f67433f;
        if (bVar2 != null) {
            long j2 = bVar.f67432e;
            ScanCardRectView scanCardRectView = ScanCardRectView.this;
            if (j2 == scanCardRectView.f53841p) {
                scanCardRectView.mo24382k(0);
            }
        }
    }

    /* renamed from: b */
    public void mo36984b(byte[] bArr, Point point, int i, Rect rect) {
        synchronized (this.f67429b) {
            if (!(rect.width() == this.f67438k.width() && rect.height() == this.f67438k.height())) {
                Log.m105924i("MicroMsg.LicenseCardDecodeQueue", "release");
                synchronized (this.f67430c) {
                    if (this.f67434g) {
                        LibCardRecog.recognizeCardRelease();
                    }
                    this.f67434g = false;
                }
                this.f67434g = false;
            }
        }
        if (!this.f67434g) {
            synchronized (this.f67430c) {
                this.f67438k = rect;
                int width = (((int) (((double) rect.width()) * 1.05d)) / 4) * 4;
                int height = (((int) (((double) rect.height()) * 1.05d)) / 4) * 4;
                this.f67439l.left = rect.left - ((width - rect.width()) / 2);
                this.f67439l.top = rect.top - ((height - rect.height()) / 2);
                Rect rect2 = this.f67439l;
                rect2.right = rect2.left + width;
                rect2.bottom = rect2.top + height;
                if (i % 180 != 0) {
                    int height2 = (point.y - rect2.height()) / 2;
                    int width2 = (point.x - this.f67439l.width()) / 2;
                    if (mo36985c()) {
                        width2 = rect.left;
                    }
                    this.f67439l = new Rect(height2, width2, this.f67439l.height() + height2, this.f67439l.width() + width2);
                }
                Log.m105925i("MicroMsg.LicenseCardDecodeQueue", "init cropRect %s", this.f67439l);
                int recognizeCardInit = LibCardRecog.recognizeCardInit(this.f67439l.width(), this.f67439l.height(), this.f67436i);
                Log.m105919d("MicroMsg.LicenseCardDecodeQueue", "initRet %d, cropWidth %d, cropHeight %d", Integer.valueOf(recognizeCardInit), Integer.valueOf(this.f67439l.width()), Integer.valueOf(this.f67439l.height()));
                this.f67434g = recognizeCardInit == 0;
            }
        }
        if (this.f67434g) {
            synchronized (this.f67429b) {
                ((HashMap) this.f67428a).clear();
                ((HashMap) this.f67428a).put("param_preview_data", bArr);
                ((HashMap) this.f67428a).put("param_camera_resolution", point);
                ((HashMap) this.f67428a).put("param_camera_rotation", Integer.valueOf(i));
                if (!this.f67435h) {
                    long j = this.f67432e;
                    if (j != 0) {
                        Log.m105925i("MicroMsg.LicenseCardDecodeQueue", "%d submit decode license card", Long.valueOf(j));
                        this.f67431d.execute(new C23510a(this.f67432e));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo36985c() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_id_card_scan_v2, 0) == 1;
        Log.m105925i("MicroMsg.LicenseCardDecodeQueue", "id_card_scan_v2: %s", Boolean.valueOf(z));
        return z;
    }
}
