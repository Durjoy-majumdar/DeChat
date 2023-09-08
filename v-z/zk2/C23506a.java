package zk2;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.scanner.view.ScanCardRectView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.qbar.WxQbarNative;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: zk2.a */
public class C23506a {

    /* renamed from: l */
    public static C23506a f67409l = new C23506a();

    /* renamed from: m */
    public static float f67410m = 1.15f;

    /* renamed from: a */
    public Map f67411a = new HashMap();

    /* renamed from: b */
    public Object f67412b = new Object();

    /* renamed from: c */
    public Object f67413c = new Object();

    /* renamed from: d */
    public ExecutorService f67414d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    public long f67415e;

    /* renamed from: f */
    public C23507a f67416f;

    /* renamed from: g */
    public volatile boolean f67417g;

    /* renamed from: h */
    public boolean f67418h;

    /* renamed from: i */
    public Rect f67419i = new Rect();

    /* renamed from: j */
    public Rect f67420j = new Rect();

    /* renamed from: k */
    public int f67421k;

    /* renamed from: zk2.a$a */
    public interface C23507a {
    }

    /* renamed from: zk2.a$b */
    public class C23508b implements Runnable {

        /* renamed from: d */
        public long f67422d;

        /* renamed from: e */
        public byte[] f67423e;

        /* renamed from: f */
        public Point f67424f;

        /* renamed from: g */
        public int f67425g;

        public C23508b(long j) {
            this.f67422d = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0081, code lost:
            r4 = r1.f67426h.f67413c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = new byte[(((r1.f67426h.f67420j.width() * r1.f67426h.f67420j.height()) * 3) / 2)];
            r10 = r1.f67423e;
            r2 = r1.f67424f;
            r11 = r2.x;
            r12 = r2.y;
            r2 = r1.f67426h.f67420j;
            r2 = com.tencent.qbar.WxQbarNative.QIPUtilYUVCrop(r0, r10, r11, r12, r2.left, r2.top, r2.width(), r1.f67426h.f67420j.height());
            r1.f67426h.f67421k++;
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.BankCardDetectQueue", "yuv crop ret %d", java.lang.Integer.valueOf(r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d6, code lost:
            if (r2 != 0) goto L_0x017d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dc, code lost:
            if (com.tencent.qbar.WxQbarNative.focusedEngineProcess(r0) != 1) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00de, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e0, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e1, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.BankCardDetectQueue", "isBest %s", java.lang.Boolean.valueOf(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f0, code lost:
            if (r0 == false) goto L_0x017d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f2, code lost:
            r10 = r1.f67423e;
            r2 = r1.f67424f;
            r9 = new android.graphics.YuvImage(r10, 17, r2.x, r2.y, (int[]) null);
            r2 = new java.io.ByteArrayOutputStream();
            r9.compressToJpeg(r1.f67426h.f67420j, 80, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0117, code lost:
            if ((r1.f67425g % 180) == 0) goto L_0x0122;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0119, code lost:
            r0 = r1.f67426h.f67420j.height();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0122, code lost:
            r0 = r1.f67426h.f67420j.width();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x012a, code lost:
            r5 = 448.0f / ((float) r0);
            r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r2.toByteArray()), (float) r1.f67425g, r5, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x013b, code lost:
            if (r0 == null) goto L_0x017d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x013d, code lost:
            r2 = new android.os.Bundle();
            r2.putParcelable("param_card_bitmap", r0);
            r0 = r1.f67426h.f67416f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x014c, code lost:
            if (r0 == null) goto L_0x0177;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x014e, code lost:
            r5 = r1.f67422d;
            r0 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19132c) r0;
            r9 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this.f53841p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0158, code lost:
            if (r5 != r9) goto L_0x0177;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x015a, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ScanCardRectView", "bankcard decode success %s", java.lang.Long.valueOf(r9));
            com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this.mo24516p();
            r0 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this.f53844s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0172, code lost:
            if (r0 == null) goto L_0x0177;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0174, code lost:
            r0.mo6126a(r5, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0177, code lost:
            r1.f67426h.f67418h = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x017b, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x017c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x017d, code lost:
            r0 = r1.f67426h;
            r0.f67418h = false;
            zk2.C23506a.m28079a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0184, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0185, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                zk2.a r0 = zk2.C23506a.this
                java.lang.Object r2 = r0.f67412b
                monitor-enter(r2)
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                r3 = 1
                r0.f67418h = r3     // Catch:{ all -> 0x01aa }
                long r4 = r1.f67422d     // Catch:{ all -> 0x01aa }
                long r6 = r0.f67415e     // Catch:{ all -> 0x01aa }
                r8 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 != 0) goto L_0x01a6
                java.util.Map r0 = r0.f67411a     // Catch:{ all -> 0x01aa }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01aa }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01aa }
                if (r0 != 0) goto L_0x0189
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                java.util.Map r0 = r0.f67411a     // Catch:{ all -> 0x01aa }
                java.lang.String r4 = "param_preview_data"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01aa }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01aa }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x01aa }
                int r4 = r0.length     // Catch:{ all -> 0x01aa }
                byte[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x01aa }
                r1.f67423e = r0     // Catch:{ all -> 0x01aa }
                android.graphics.Point r0 = new android.graphics.Point     // Catch:{ all -> 0x01aa }
                zk2.a r4 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                java.util.Map r4 = r4.f67411a     // Catch:{ all -> 0x01aa }
                java.lang.String r5 = "param_camera_resolution"
                java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x01aa }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x01aa }
                android.graphics.Point r4 = (android.graphics.Point) r4     // Catch:{ all -> 0x01aa }
                r0.<init>(r4)     // Catch:{ all -> 0x01aa }
                r1.f67424f = r0     // Catch:{ all -> 0x01aa }
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                java.util.Map r0 = r0.f67411a     // Catch:{ all -> 0x01aa }
                java.lang.String r4 = "param_camera_rotation"
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01aa }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01aa }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01aa }
                int r0 = r0.intValue()     // Catch:{ all -> 0x01aa }
                r1.f67425g = r0     // Catch:{ all -> 0x01aa }
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                java.util.Map r0 = r0.f67411a     // Catch:{ all -> 0x01aa }
                java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01aa }
                r0.clear()     // Catch:{ all -> 0x01aa }
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                zk2.a$a r4 = r0.f67416f     // Catch:{ all -> 0x01aa }
                if (r4 == 0) goto L_0x0080
                long r5 = r0.f67415e     // Catch:{ all -> 0x01aa }
                r9 = 10
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$c r4 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19132c) r4     // Catch:{ all -> 0x01aa }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x01aa }
                long r11 = r0.f53841p     // Catch:{ all -> 0x01aa }
                int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r4 != 0) goto L_0x0080
                r0.mo24382k(r9)     // Catch:{ all -> 0x01aa }
            L_0x0080:
                monitor-exit(r2)     // Catch:{ all -> 0x01aa }
                zk2.a r0 = zk2.C23506a.this
                java.lang.Object r4 = r0.f67413c
                monitor-enter(r4)
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r0 = r0.f67420j     // Catch:{ all -> 0x0186 }
                int r0 = r0.width()     // Catch:{ all -> 0x0186 }
                zk2.a r2 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r2 = r2.f67420j     // Catch:{ all -> 0x0186 }
                int r2 = r2.height()     // Catch:{ all -> 0x0186 }
                int r0 = r0 * r2
                int r0 = r0 * 3
                int r0 = r0 / 2
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0186 }
                byte[] r10 = r1.f67423e     // Catch:{ all -> 0x0186 }
                android.graphics.Point r2 = r1.f67424f     // Catch:{ all -> 0x0186 }
                int r11 = r2.x     // Catch:{ all -> 0x0186 }
                int r12 = r2.y     // Catch:{ all -> 0x0186 }
                zk2.a r2 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r2 = r2.f67420j     // Catch:{ all -> 0x0186 }
                int r13 = r2.left     // Catch:{ all -> 0x0186 }
                int r14 = r2.top     // Catch:{ all -> 0x0186 }
                int r15 = r2.width()     // Catch:{ all -> 0x0186 }
                zk2.a r2 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r2 = r2.f67420j     // Catch:{ all -> 0x0186 }
                int r16 = r2.height()     // Catch:{ all -> 0x0186 }
                r9 = r0
                int r2 = com.tencent.qbar.WxQbarNative.QIPUtilYUVCrop(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0186 }
                zk2.a r5 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                int r6 = r5.f67421k     // Catch:{ all -> 0x0186 }
                int r6 = r6 + r3
                r5.f67421k = r6     // Catch:{ all -> 0x0186 }
                java.lang.String r5 = "MicroMsg.BankCardDetectQueue"
                java.lang.String r6 = "yuv crop ret %d"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0186 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0186 }
                r7[r8] = r9     // Catch:{ all -> 0x0186 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)     // Catch:{ all -> 0x0186 }
                if (r2 != 0) goto L_0x017d
                int r0 = com.tencent.qbar.WxQbarNative.focusedEngineProcess(r0)     // Catch:{ all -> 0x0186 }
                if (r0 != r3) goto L_0x00e0
                r0 = 1
                goto L_0x00e1
            L_0x00e0:
                r0 = 0
            L_0x00e1:
                java.lang.String r2 = "MicroMsg.BankCardDetectQueue"
                java.lang.String r5 = "isBest %s"
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0186 }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0186 }
                r6[r8] = r7     // Catch:{ all -> 0x0186 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r6)     // Catch:{ all -> 0x0186 }
                if (r0 == 0) goto L_0x017d
                android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ all -> 0x0186 }
                byte[] r10 = r1.f67423e     // Catch:{ all -> 0x0186 }
                r11 = 17
                android.graphics.Point r2 = r1.f67424f     // Catch:{ all -> 0x0186 }
                int r12 = r2.x     // Catch:{ all -> 0x0186 }
                int r13 = r2.y     // Catch:{ all -> 0x0186 }
                r14 = 0
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0186 }
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0186 }
                r2.<init>()     // Catch:{ all -> 0x0186 }
                zk2.a r5 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r5 = r5.f67420j     // Catch:{ all -> 0x0186 }
                r6 = 80
                r0.compressToJpeg(r5, r6, r2)     // Catch:{ all -> 0x0186 }
                int r0 = r1.f67425g     // Catch:{ all -> 0x0186 }
                int r0 = r0 % 180
                r5 = 1138753536(0x43e00000, float:448.0)
                if (r0 == 0) goto L_0x0122
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r0 = r0.f67420j     // Catch:{ all -> 0x0186 }
                int r0 = r0.height()     // Catch:{ all -> 0x0186 }
                goto L_0x012a
            L_0x0122:
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                android.graphics.Rect r0 = r0.f67420j     // Catch:{ all -> 0x0186 }
                int r0 = r0.width()     // Catch:{ all -> 0x0186 }
            L_0x012a:
                float r0 = (float) r0     // Catch:{ all -> 0x0186 }
                float r5 = r5 / r0
                byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0186 }
                android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r0)     // Catch:{ all -> 0x0186 }
                int r2 = r1.f67425g     // Catch:{ all -> 0x0186 }
                float r2 = (float) r2     // Catch:{ all -> 0x0186 }
                android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r0, r2, r5, r5)     // Catch:{ all -> 0x0186 }
                if (r0 == 0) goto L_0x017d
                android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0186 }
                r2.<init>()     // Catch:{ all -> 0x0186 }
                java.lang.String r5 = "param_card_bitmap"
                r2.putParcelable(r5, r0)     // Catch:{ all -> 0x0186 }
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                zk2.a$a r0 = r0.f67416f     // Catch:{ all -> 0x0186 }
                if (r0 == 0) goto L_0x0177
                long r5 = r1.f67422d     // Catch:{ all -> 0x0186 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$c r0 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19132c) r0     // Catch:{ all -> 0x0186 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r7 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x0186 }
                long r9 = r7.f53841p     // Catch:{ all -> 0x0186 }
                int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r7 != 0) goto L_0x0177
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0186 }
                java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0186 }
                r3[r8] = r7     // Catch:{ all -> 0x0186 }
                java.lang.String r7 = "MicroMsg.ScanCardRectView"
                java.lang.String r9 = "bankcard decode success %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r3)     // Catch:{ all -> 0x0186 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r3 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x0186 }
                r3.mo24516p()     // Catch:{ all -> 0x0186 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x0186 }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$g r0 = r0.f53844s     // Catch:{ all -> 0x0186 }
                if (r0 == 0) goto L_0x0177
                r0.mo6126a(r5, r2)     // Catch:{ all -> 0x0186 }
            L_0x0177:
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                r0.f67418h = r8     // Catch:{ all -> 0x0186 }
                monitor-exit(r4)     // Catch:{ all -> 0x0186 }
                return
            L_0x017d:
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x0186 }
                r0.f67418h = r8     // Catch:{ all -> 0x0186 }
                zk2.C23506a.m28079a(r0)     // Catch:{ all -> 0x0186 }
                monitor-exit(r4)     // Catch:{ all -> 0x0186 }
                return
            L_0x0186:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0186 }
                throw r0
            L_0x0189:
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                zk2.a$a r3 = r0.f67416f     // Catch:{ all -> 0x01aa }
                if (r3 == 0) goto L_0x01a0
                long r4 = r0.f67415e     // Catch:{ all -> 0x01aa }
                r6 = 0
                com.tencent.mm.plugin.scanner.view.ScanCardRectView$c r3 = (com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.C19132c) r3     // Catch:{ all -> 0x01aa }
                com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = com.tencent.p014mm.plugin.scanner.view.ScanCardRectView.this     // Catch:{ all -> 0x01aa }
                long r9 = r0.f53841p     // Catch:{ all -> 0x01aa }
                int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r3 != 0) goto L_0x01a0
                r0.mo24382k(r6)     // Catch:{ all -> 0x01aa }
            L_0x01a0:
                zk2.a r0 = zk2.C23506a.this     // Catch:{ all -> 0x01aa }
                r0.f67418h = r8     // Catch:{ all -> 0x01aa }
                monitor-exit(r2)     // Catch:{ all -> 0x01aa }
                return
            L_0x01a6:
                r0.f67418h = r8     // Catch:{ all -> 0x01aa }
                monitor-exit(r2)     // Catch:{ all -> 0x01aa }
                return
            L_0x01aa:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01aa }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zk2.C23506a.C23508b.run():void");
        }
    }

    /* renamed from: a */
    public static void m28079a(C23506a aVar) {
        if (!((HashMap) aVar.f67411a).isEmpty()) {
            long j = aVar.f67415e;
            if (j != 0) {
                Log.m105925i("MicroMsg.BankCardDetectQueue", "%d decode hit cache", Long.valueOf(j));
                ThreadPool.post(new C23508b(aVar.f67415e), "BankCardDetectQueue_detect_task");
                return;
            }
        }
        C23507a aVar2 = aVar.f67416f;
        if (aVar2 != null) {
            long j2 = aVar.f67415e;
            ScanCardRectView scanCardRectView = ScanCardRectView.this;
            if (j2 == scanCardRectView.f53841p) {
                scanCardRectView.mo24382k(0);
            }
        }
    }

    /* renamed from: b */
    public void mo36982b() {
        Log.m105924i("MicroMsg.BankCardDetectQueue", "release");
        long j = this.f67415e;
        synchronized (this.f67412b) {
            if (this.f67415e == j) {
                this.f67415e = 0;
                this.f67421k = 0;
                this.f67416f = null;
                ((HashMap) this.f67411a).clear();
            }
        }
        synchronized (this.f67413c) {
            if (this.f67417g) {
                WxQbarNative.focusedEngineRelease();
            }
            this.f67417g = false;
        }
    }
}
