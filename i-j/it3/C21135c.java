package it3;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.qbar.C19931a;
import com.tencent.stubs.logger.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: it3.c */
public class C21135c {

    /* renamed from: k */
    public static C21135c f59755k = new C21135c();

    /* renamed from: a */
    public int[] f59756a = {2, 1};

    /* renamed from: b */
    public Map f59757b = new HashMap();

    /* renamed from: c */
    public Object f59758c = new Object();

    /* renamed from: d */
    public ExecutorService f59759d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    public ExecutorService f59760e = Executors.newSingleThreadExecutor();

    /* renamed from: f */
    public long f59761f;

    /* renamed from: g */
    public C21138c f59762g;

    /* renamed from: h */
    public boolean f59763h;

    /* renamed from: i */
    public int f59764i;

    /* renamed from: j */
    public C21134a f59765j = new C21134a("ScanDecodeQueue");

    /* renamed from: it3.c$a */
    public class C21136a implements Runnable {

        /* renamed from: d */
        public long f59766d;

        /* renamed from: e */
        public byte[] f59767e;

        /* renamed from: f */
        public Point f59768f;

        /* renamed from: g */
        public Rect f59769g;

        /* renamed from: h */
        public int f59770h;

        public C21136a(long j, byte[] bArr, Point point, int i, Rect rect) {
            this.f59766d = j;
            this.f59767e = bArr;
            this.f59768f = point;
            this.f59770h = i;
            this.f59769g = rect;
        }

        public void run() {
            byte[] c;
            int[] iArr = new int[2];
            synchronized (C21135c.this.f59765j) {
                c = C21135c.this.f59765j.mo33086c(this.f59767e, this.f59768f, this.f59770h, this.f59769g, iArr);
            }
            synchronized (C21135c.this.f59758c) {
                if (c != null) {
                    long j = this.f59766d;
                    C21135c cVar = C21135c.this;
                    if (j == cVar.f59761f) {
                        ((HashMap) cVar.f59757b).put("param_gray_data", c);
                        ((HashMap) C21135c.this.f59757b).put("param_out_size", new Point(iArr[0], iArr[1]));
                        C21135c cVar2 = C21135c.this;
                        if (!cVar2.f59763h) {
                            Log.m106505i("ScanDecodeQueue", String.format("%d submit decode gray", new Object[]{Long.valueOf(cVar2.f59761f)}));
                            C21135c cVar3 = C21135c.this;
                            cVar3.f59760e.execute(new C21137b(this.f59766d));
                        }
                        C21135c cVar4 = C21135c.this;
                        cVar4.f59762g.mo27884a(cVar4.f59761f, 10);
                    }
                }
            }
        }
    }

    /* renamed from: it3.c$b */
    public class C21137b implements Runnable {

        /* renamed from: d */
        public long f59772d;

        /* renamed from: e */
        public byte[] f59773e;

        /* renamed from: f */
        public Point f59774f;

        public C21137b(long j) {
            this.f59772d = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
            if (r13.f59773e == null) goto L_0x01b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
            if (r13.f59774f == null) goto L_0x01b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
            r3 = r13.f59775g.f59765j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r4 = r13.f59775g;
            r5 = r4.f59765j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
            if (r5.f59753c == false) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
            r4.f59764i++;
            r4 = r13.f59773e;
            r7 = r13.f59774f;
            r8 = r7.x;
            r7 = r7.y;
            r9 = r5.f59754d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r4 = r5.mo33087d(r4, r8, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r5 = r13.f59775g.f59765j.f59752b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
            if (r5.f56825a >= 0) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
            r7 = new com.tencent.qbar.QbarNative.QBarZoomInfo();
            r5.f56826b.GetZoomInfo(r7, r5.f56825a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r13.f59775g.f59765j.mo33088e(r0, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
            r5 = r13.f59775g.f59758c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            r8 = r13.f59772d;
            r3 = r13.f59775g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
            if (r8 != r3.f59761f) goto L_0x019c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
            r10 = new java.lang.Object[2];
            r10[0] = com.tencent.qbar.QbarNative.GetVersion();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
            if (r4 != null) goto L_0x00c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
            r11 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
            r11 = r4.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
            r10[1] = java.lang.Integer.valueOf(r11);
            com.tencent.stubs.logger.Log.m106505i("ScanDecodeQueue", java.lang.String.format("qbar version %s, get %d decode results", r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
            if (r4 == null) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
            r3 = r4.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
            if (r3.hasNext() == false) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
            r8 = r3.next();
            com.tencent.stubs.logger.Log.m106505i("ScanDecodeQueue", "result " + r8.f56828e + "," + r8.f56829f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x010e, code lost:
            r3 = new android.os.Bundle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
            if (r7 == null) goto L_0x0145;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
            com.tencent.stubs.logger.Log.m106505i("ScanDecodeQueue", java.lang.String.format("isZoom %b, zoomFactor %f", new java.lang.Object[]{java.lang.Boolean.valueOf(r7.isZoom), java.lang.Float.valueOf(r7.zoomFactor)}));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0132, code lost:
            if (r4 == null) goto L_0x013e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0138, code lost:
            if (r4.isEmpty() == false) goto L_0x0145;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
            if (r7.isZoom == false) goto L_0x0145;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
            r3.putFloat("param_zoom_ratio", r7.zoomFactor);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
            com.tencent.stubs.logger.Log.m106505i("ScanDecodeQueue", java.lang.String.format("detect %d codes", new java.lang.Object[]{java.lang.Integer.valueOf(r0.size())}));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0160, code lost:
            if (r0.size() <= 0) goto L_0x0171;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
            r0 = gt3.C20839a.m22866b(r0, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x016a, code lost:
            if (r0.isEmpty() != false) goto L_0x0171;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x016c, code lost:
            r3.putParcelableArrayList("param_detect_codes", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0175, code lost:
            if (r3.isEmpty() != false) goto L_0x0180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0177, code lost:
            r13.f59775g.f59762g.mo27885b(r13.f59772d, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
            if (r4 == null) goto L_0x0192;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0186, code lost:
            if (r4.isEmpty() != false) goto L_0x0192;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0188, code lost:
            r0 = r13.f59775g;
            r0.f59762g.mo27886c(r0.f59761f, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
            it3.C21135c.m23533a(r13.f59775g);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0197, code lost:
            r13.f59775g.f59763h = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x019c, code lost:
            r3.f59763h = false;
            it3.C21135c.m23533a(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a1, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a2, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ac, code lost:
            r4.f59763h = false;
            it3.C21135c.m23533a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b1, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b2, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b6, code lost:
            r0 = r13.f59775g;
            r0.f59763h = false;
            it3.C21135c.m23533a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bd, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
            r0 = new java.util.ArrayList();
            r2 = new java.util.ArrayList();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                it3.c r0 = it3.C21135c.this
                java.lang.Object r0 = r0.f59758c
                monitor-enter(r0)
                long r1 = r13.f59772d     // Catch:{ all -> 0x01c5 }
                it3.c r3 = it3.C21135c.this     // Catch:{ all -> 0x01c5 }
                long r4 = r3.f59761f     // Catch:{ all -> 0x01c5 }
                r6 = 0
                int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r7 != 0) goto L_0x01be
                r1 = 1
                r3.f59763h = r1     // Catch:{ all -> 0x01c5 }
                java.util.Map r2 = r3.f59757b     // Catch:{ all -> 0x01c5 }
                java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x01c5 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01c5 }
                if (r2 != 0) goto L_0x0050
                it3.c r2 = it3.C21135c.this     // Catch:{ all -> 0x01c5 }
                java.util.Map r2 = r2.f59757b     // Catch:{ all -> 0x01c5 }
                java.lang.String r3 = "param_gray_data"
                java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x01c5 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x01c5 }
                byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x01c5 }
                int r3 = r2.length     // Catch:{ all -> 0x01c5 }
                byte[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ all -> 0x01c5 }
                r13.f59773e = r2     // Catch:{ all -> 0x01c5 }
                android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x01c5 }
                it3.c r3 = it3.C21135c.this     // Catch:{ all -> 0x01c5 }
                java.util.Map r3 = r3.f59757b     // Catch:{ all -> 0x01c5 }
                java.lang.String r4 = "param_out_size"
                java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x01c5 }
                java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x01c5 }
                android.graphics.Point r3 = (android.graphics.Point) r3     // Catch:{ all -> 0x01c5 }
                r2.<init>(r3)     // Catch:{ all -> 0x01c5 }
                r13.f59774f = r2     // Catch:{ all -> 0x01c5 }
                it3.c r2 = it3.C21135c.this     // Catch:{ all -> 0x01c5 }
                java.util.Map r2 = r2.f59757b     // Catch:{ all -> 0x01c5 }
                java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x01c5 }
                r2.clear()     // Catch:{ all -> 0x01c5 }
            L_0x0050:
                monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                byte[] r3 = r13.f59773e
                if (r3 == 0) goto L_0x01b6
                android.graphics.Point r3 = r13.f59774f
                if (r3 == 0) goto L_0x01b6
                it3.c r3 = it3.C21135c.this
                it3.a r3 = r3.f59765j
                monitor-enter(r3)
                it3.c r4 = it3.C21135c.this     // Catch:{ all -> 0x01b3 }
                it3.a r5 = r4.f59765j     // Catch:{ all -> 0x01b3 }
                boolean r7 = r5.f59753c     // Catch:{ all -> 0x01b3 }
                if (r7 == 0) goto L_0x01ac
                int r7 = r4.f59764i     // Catch:{ all -> 0x01b3 }
                int r7 = r7 + r1
                r4.f59764i = r7     // Catch:{ all -> 0x01b3 }
                byte[] r4 = r13.f59773e     // Catch:{ all -> 0x01b3 }
                android.graphics.Point r7 = r13.f59774f     // Catch:{ all -> 0x01b3 }
                int r8 = r7.x     // Catch:{ all -> 0x01b3 }
                int r7 = r7.y     // Catch:{ all -> 0x01b3 }
                java.lang.Object r9 = r5.f59754d     // Catch:{ all -> 0x01b3 }
                monitor-enter(r9)     // Catch:{ all -> 0x01b3 }
                java.util.List r4 = r5.mo33087d(r4, r8, r7)     // Catch:{ all -> 0x01a9 }
                monitor-exit(r9)     // Catch:{ all -> 0x01a9 }
                it3.c r5 = it3.C21135c.this     // Catch:{ all -> 0x01b3 }
                it3.a r5 = r5.f59765j     // Catch:{ all -> 0x01b3 }
                com.tencent.qbar.a r5 = r5.f59752b     // Catch:{ all -> 0x01b3 }
                monitor-enter(r5)     // Catch:{ all -> 0x01b3 }
                int r7 = r5.f56825a     // Catch:{ all -> 0x01a6 }
                if (r7 >= 0) goto L_0x0093
                r7 = 0
                monitor-exit(r5)     // Catch:{ all -> 0x01a6 }
                goto L_0x00a0
            L_0x0093:
                com.tencent.qbar.QbarNative$QBarZoomInfo r7 = new com.tencent.qbar.QbarNative$QBarZoomInfo     // Catch:{ all -> 0x01a6 }
                r7.<init>()     // Catch:{ all -> 0x01a6 }
                com.tencent.qbar.QbarNative r8 = r5.f56826b     // Catch:{ all -> 0x01a6 }
                int r9 = r5.f56825a     // Catch:{ all -> 0x01a6 }
                r8.GetZoomInfo(r7, r9)     // Catch:{ all -> 0x01a6 }
                monitor-exit(r5)     // Catch:{ all -> 0x01a6 }
            L_0x00a0:
                it3.c r5 = it3.C21135c.this     // Catch:{ all -> 0x01b3 }
                it3.a r5 = r5.f59765j     // Catch:{ all -> 0x01b3 }
                r5.mo33088e(r0, r2)     // Catch:{ all -> 0x01b3 }
                monitor-exit(r3)     // Catch:{ all -> 0x01b3 }
                it3.c r3 = it3.C21135c.this
                java.lang.Object r5 = r3.f59758c
                monitor-enter(r5)
                long r8 = r13.f59772d     // Catch:{ all -> 0x01a3 }
                it3.c r3 = it3.C21135c.this     // Catch:{ all -> 0x01a3 }
                long r10 = r3.f59761f     // Catch:{ all -> 0x01a3 }
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto L_0x019c
                java.lang.String r3 = "ScanDecodeQueue"
                java.lang.String r8 = "qbar version %s, get %d decode results"
                r9 = 2
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x01a3 }
                java.lang.String r11 = com.tencent.qbar.QbarNative.GetVersion()     // Catch:{ all -> 0x01a3 }
                r10[r6] = r11     // Catch:{ all -> 0x01a3 }
                if (r4 != 0) goto L_0x00c8
                r11 = 0
                goto L_0x00cc
            L_0x00c8:
                int r11 = r4.size()     // Catch:{ all -> 0x01a3 }
            L_0x00cc:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01a3 }
                r10[r1] = r11     // Catch:{ all -> 0x01a3 }
                java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch:{ all -> 0x01a3 }
                com.tencent.stubs.logger.Log.m106505i(r3, r8)     // Catch:{ all -> 0x01a3 }
                if (r4 == 0) goto L_0x010e
                java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x01a3 }
            L_0x00df:
                boolean r8 = r3.hasNext()     // Catch:{ all -> 0x01a3 }
                if (r8 == 0) goto L_0x010e
                java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x01a3 }
                com.tencent.qbar.a$a r8 = (com.tencent.qbar.C19931a.C19932a) r8     // Catch:{ all -> 0x01a3 }
                java.lang.String r10 = "ScanDecodeQueue"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a3 }
                r11.<init>()     // Catch:{ all -> 0x01a3 }
                java.lang.String r12 = "result "
                r11.append(r12)     // Catch:{ all -> 0x01a3 }
                java.lang.String r12 = r8.f56828e     // Catch:{ all -> 0x01a3 }
                r11.append(r12)     // Catch:{ all -> 0x01a3 }
                java.lang.String r12 = ","
                r11.append(r12)     // Catch:{ all -> 0x01a3 }
                java.lang.String r8 = r8.f56829f     // Catch:{ all -> 0x01a3 }
                r11.append(r8)     // Catch:{ all -> 0x01a3 }
                java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x01a3 }
                com.tencent.stubs.logger.Log.m106505i(r10, r8)     // Catch:{ all -> 0x01a3 }
                goto L_0x00df
            L_0x010e:
                android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x01a3 }
                r3.<init>()     // Catch:{ all -> 0x01a3 }
                if (r7 == 0) goto L_0x0145
                java.lang.String r8 = "ScanDecodeQueue"
                java.lang.String r10 = "isZoom %b, zoomFactor %f"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x01a3 }
                boolean r11 = r7.isZoom     // Catch:{ all -> 0x01a3 }
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x01a3 }
                r9[r6] = r11     // Catch:{ all -> 0x01a3 }
                float r11 = r7.zoomFactor     // Catch:{ all -> 0x01a3 }
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ all -> 0x01a3 }
                r9[r1] = r11     // Catch:{ all -> 0x01a3 }
                java.lang.String r9 = java.lang.String.format(r10, r9)     // Catch:{ all -> 0x01a3 }
                com.tencent.stubs.logger.Log.m106505i(r8, r9)     // Catch:{ all -> 0x01a3 }
                if (r4 == 0) goto L_0x013e
                boolean r8 = r4.isEmpty()     // Catch:{ all -> 0x01a3 }
                if (r8 == 0) goto L_0x0145
                boolean r8 = r7.isZoom     // Catch:{ all -> 0x01a3 }
                if (r8 == 0) goto L_0x0145
            L_0x013e:
                java.lang.String r8 = "param_zoom_ratio"
                float r7 = r7.zoomFactor     // Catch:{ all -> 0x01a3 }
                r3.putFloat(r8, r7)     // Catch:{ all -> 0x01a3 }
            L_0x0145:
                java.lang.String r7 = "ScanDecodeQueue"
                java.lang.String r8 = "detect %d codes"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01a3 }
                int r9 = r0.size()     // Catch:{ all -> 0x01a3 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01a3 }
                r1[r6] = r9     // Catch:{ all -> 0x01a3 }
                java.lang.String r1 = java.lang.String.format(r8, r1)     // Catch:{ all -> 0x01a3 }
                com.tencent.stubs.logger.Log.m106505i(r7, r1)     // Catch:{ all -> 0x01a3 }
                int r1 = r0.size()     // Catch:{ all -> 0x01a3 }
                if (r1 <= 0) goto L_0x0171
                java.util.ArrayList r0 = gt3.C20839a.m22866b(r0, r2)     // Catch:{ all -> 0x01a3 }
                boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x01a3 }
                if (r1 != 0) goto L_0x0171
                java.lang.String r1 = "param_detect_codes"
                r3.putParcelableArrayList(r1, r0)     // Catch:{ all -> 0x01a3 }
            L_0x0171:
                boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x01a3 }
                if (r0 != 0) goto L_0x0180
                it3.c r0 = it3.C21135c.this     // Catch:{ all -> 0x01a3 }
                it3.c$c r0 = r0.f59762g     // Catch:{ all -> 0x01a3 }
                long r1 = r13.f59772d     // Catch:{ all -> 0x01a3 }
                r0.mo27885b(r1, r3)     // Catch:{ all -> 0x01a3 }
            L_0x0180:
                if (r4 == 0) goto L_0x0192
                boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x01a3 }
                if (r0 != 0) goto L_0x0192
                it3.c r0 = it3.C21135c.this     // Catch:{ all -> 0x01a3 }
                it3.c$c r1 = r0.f59762g     // Catch:{ all -> 0x01a3 }
                long r2 = r0.f59761f     // Catch:{ all -> 0x01a3 }
                r1.mo27886c(r2, r4)     // Catch:{ all -> 0x01a3 }
                goto L_0x0197
            L_0x0192:
                it3.c r0 = it3.C21135c.this     // Catch:{ all -> 0x01a3 }
                it3.C21135c.m23533a(r0)     // Catch:{ all -> 0x01a3 }
            L_0x0197:
                it3.c r0 = it3.C21135c.this     // Catch:{ all -> 0x01a3 }
                r0.f59763h = r6     // Catch:{ all -> 0x01a3 }
                goto L_0x01a1
            L_0x019c:
                r3.f59763h = r6     // Catch:{ all -> 0x01a3 }
                it3.C21135c.m23533a(r3)     // Catch:{ all -> 0x01a3 }
            L_0x01a1:
                monitor-exit(r5)     // Catch:{ all -> 0x01a3 }
                return
            L_0x01a3:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x01a3 }
                throw r0
            L_0x01a6:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x01a6 }
                throw r0     // Catch:{ all -> 0x01b3 }
            L_0x01a9:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x01a9 }
                throw r0     // Catch:{ all -> 0x01b3 }
            L_0x01ac:
                r4.f59763h = r6     // Catch:{ all -> 0x01b3 }
                it3.C21135c.m23533a(r4)     // Catch:{ all -> 0x01b3 }
                monitor-exit(r3)     // Catch:{ all -> 0x01b3 }
                return
            L_0x01b3:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x01b3 }
                throw r0
            L_0x01b6:
                it3.c r0 = it3.C21135c.this
                r0.f59763h = r6
                it3.C21135c.m23533a(r0)
                return
            L_0x01be:
                r3.f59763h = r6     // Catch:{ all -> 0x01c5 }
                it3.C21135c.m23533a(r3)     // Catch:{ all -> 0x01c5 }
                monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
                return
            L_0x01c5:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01c5 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: it3.C21135c.C21137b.run():void");
        }
    }

    /* renamed from: it3.c$c */
    public interface C21138c {
        /* renamed from: a */
        void mo27884a(long j, long j2);

        /* renamed from: b */
        void mo27885b(long j, Bundle bundle);

        /* renamed from: c */
        void mo27886c(long j, List<C19931a.C19932a> list);
    }

    /* renamed from: a */
    public static void m23533a(C21135c cVar) {
        if (!((HashMap) cVar.f59757b).isEmpty()) {
            long j = cVar.f59761f;
            if (j != 0) {
                Log.m106505i("ScanDecodeQueue", String.format("%d decode hit cache", new Object[]{Long.valueOf(j)}));
                cVar.f59760e.execute(new C21137b(cVar.f59761f));
                return;
            }
        }
        C21138c cVar2 = cVar.f59762g;
        if (cVar2 != null) {
            cVar2.mo27884a(cVar.f59761f, 0);
        }
    }

    /* renamed from: b */
    public void mo33092b(long j) {
        synchronized (this.f59758c) {
            if (this.f59761f == j) {
                this.f59761f = 0;
                this.f59762g = null;
                this.f59764i = 0;
                ((HashMap) this.f59757b).clear();
            }
        }
    }
}
