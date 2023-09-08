package xc0;

import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.p136ui.contact.C74535o0;
import com.tencent.p014mm.p136ui.contact.C74539p0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import ki2.C33918a;
import p823sg.C90193h;

/* renamed from: xc0.g */
public class C78795g {

    /* renamed from: b */
    public static C78795g f230547b;

    /* renamed from: a */
    public QueueWorkerThread f230548a = null;

    /* renamed from: xc0.g$a */
    public interface C78796a {
    }

    /* renamed from: xc0.g$b */
    public class C78797b implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public String f230549d;

        /* renamed from: e */
        public String f230550e;

        /* renamed from: f */
        public boolean f230551f = false;

        /* renamed from: g */
        public String f230552g;

        /* renamed from: h */
        public C78796a f230553h;

        public C78797b(String str, String str2, C78796a aVar) {
            this.f230549d = str;
            this.f230550e = str2;
            this.f230553h = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.tencent.mm.network.d0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.tencent.mm.network.b0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0141 A[SYNTHETIC, Splitter:B:47:0x0141] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0153 A[SYNTHETIC, Splitter:B:52:0x0153] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0165 A[SYNTHETIC, Splitter:B:57:0x0165] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0179 A[SYNTHETIC, Splitter:B:64:0x0179] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x018b A[SYNTHETIC, Splitter:B:69:0x018b] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x019d A[SYNTHETIC, Splitter:B:74:0x019d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r11 = this;
                java.lang.String r0 = "exception:%s"
                java.lang.String r1 = r11.f230549d
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                r2 = 0
                if (r1 == 0) goto L_0x000c
                return r2
            L_0x000c:
                xc0.g r1 = xc0.C78795g.this
                java.lang.String r3 = r11.f230549d
                java.lang.String r1 = r1.mo108705b(r3)
                r11.f230552g = r1
                f40.e r1 = f40.C86709a0.m107523b()
                boolean r1 = r1.mo121114l()
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x0078
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "https://"
                r1.append(r6)
                r6 = 2131831344(0x7f112a30, float:1.929571E38)
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r6)
                r1.append(r6)
                java.lang.String r6 = "/?version=%d&uin=%s&nettype=%d&signal=%d"
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                int r7 = qe3.C89625d.f257841g
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r2] = r7
                f40.e r7 = f40.C86709a0.m107523b()
                int r7 = r7.mo121110g()
                java.lang.String r7 = p823sg.C77710q.m93738a(r7)
                r6[r5] = r7
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r3] = r7
                com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r7 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
                int r7 = r7.getCompatMixStrength()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r4] = r7
                java.lang.String r1 = java.lang.String.format(r1, r6)
                goto L_0x007a
            L_0x0078:
                java.lang.String r1 = ""
            L_0x007a:
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r6 = r11.f230549d
                r4[r2] = r6
                r4[r5] = r1
                java.lang.String r6 = r11.f230550e
                r4[r3] = r6
                java.lang.String r3 = "MicroMsg.RemarkImageStorage"
                java.lang.String r6 = "get remark image user: %s referer: %s  url:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r4)
                r11.f230551f = r2
                r4 = 0
                java.lang.String r6 = r11.f230550e     // Catch:{ Exception -> 0x012f, all -> 0x012b }
                com.tencent.mm.network.b0 r6 = com.tencent.p014mm.network.C81035d.m98963d(r6, r4)     // Catch:{ Exception -> 0x012f, all -> 0x012b }
                java.lang.String r7 = r11.f230550e     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                com.tencent.mm.network.d0 r6 = com.tencent.p014mm.network.C81035d.m98964e(r7, r4)     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                java.lang.String r7 = "GET"
                r6.f238053i = r7     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                java.lang.String r7 = "referer"
                r6.mo112921e(r7, r1)     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                r1 = 5000(0x1388, float:7.006E-42)
                r6.f238049e = r1     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                r6.f238050f = r1     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                r1 = 1196(0x4ac, float:1.676E-42)
                r6.f238062r = r1     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                int r1 = com.tencent.p014mm.network.C81035d.m98960a(r6)     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                if (r1 == 0) goto L_0x00c1
                java.lang.String r1 = "checkHttpConnection failed! url:%s"
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                java.lang.String r8 = r11.f230550e     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                r7[r2] = r8     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r7)     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                return r5
            L_0x00c1:
                java.io.InputStream r1 = r6.getInputStream()     // Catch:{ Exception -> 0x0126, all -> 0x0121 }
                r7 = 1024(0x400, float:1.435E-42)
                byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                r8.<init>()     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                java.lang.String r9 = r11.f230552g     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                r8.append(r9)     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                java.lang.String r9 = ".tmp"
                r8.append(r9)     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r8, r2)     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
            L_0x00e0:
                int r8 = r1.read(r7)     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                r9 = -1
                if (r8 == r9) goto L_0x00eb
                r4.write(r7, r2, r8)     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                goto L_0x00e0
            L_0x00eb:
                r11.f230551f = r5     // Catch:{ Exception -> 0x011a, all -> 0x0112 }
                r1.close()     // Catch:{ Exception -> 0x00f1 }
                goto L_0x00fd
            L_0x00f1:
                r1 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r6[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r6)
            L_0x00fd:
                if (r4 == 0) goto L_0x0175
                r4.close()     // Catch:{ Exception -> 0x0104 }
                goto L_0x0175
            L_0x0104:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r4[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
                goto L_0x0175
            L_0x0112:
                r7 = move-exception
                r10 = r6
                r6 = r1
                r1 = r7
                r7 = r4
                r4 = r10
                goto L_0x0177
            L_0x011a:
                r7 = move-exception
                r10 = r6
                r6 = r1
                r1 = r7
                r7 = r4
                r4 = r10
                goto L_0x0132
            L_0x0121:
                r1 = move-exception
                r7 = r4
                r4 = r6
                r6 = r7
                goto L_0x0177
            L_0x0126:
                r1 = move-exception
                r7 = r4
                r4 = r6
                r6 = r7
                goto L_0x0132
            L_0x012b:
                r1 = move-exception
                r6 = r4
                r7 = r6
                goto L_0x0177
            L_0x012f:
                r1 = move-exception
                r6 = r4
                r7 = r6
            L_0x0132:
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0176 }
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x0176 }
                r8[r2] = r1     // Catch:{ all -> 0x0176 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r8)     // Catch:{ all -> 0x0176 }
                r11.f230551f = r2     // Catch:{ all -> 0x0176 }
                if (r4 == 0) goto L_0x0151
                r4.disconnect()     // Catch:{ Exception -> 0x0145 }
                goto L_0x0151
            L_0x0145:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r4[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            L_0x0151:
                if (r6 == 0) goto L_0x0163
                r6.close()     // Catch:{ Exception -> 0x0157 }
                goto L_0x0163
            L_0x0157:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r4[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            L_0x0163:
                if (r7 == 0) goto L_0x0175
                r7.close()     // Catch:{ Exception -> 0x0169 }
                goto L_0x0175
            L_0x0169:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r4[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            L_0x0175:
                return r5
            L_0x0176:
                r1 = move-exception
            L_0x0177:
                if (r4 == 0) goto L_0x0189
                r4.disconnect()     // Catch:{ Exception -> 0x017d }
                goto L_0x0189
            L_0x017d:
                r4 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r5]
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
                r8[r2] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r8)
            L_0x0189:
                if (r6 == 0) goto L_0x019b
                r6.close()     // Catch:{ Exception -> 0x018f }
                goto L_0x019b
            L_0x018f:
                r4 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
                r6[r2] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r6)
            L_0x019b:
                if (r7 == 0) goto L_0x01ad
                r7.close()     // Catch:{ Exception -> 0x01a1 }
                goto L_0x01ad
            L_0x01a1:
                r4 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
                r5[r2] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r5)
            L_0x01ad:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: xc0.C78795g.C78797b.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            if (!this.f230551f) {
                C74539p0 p0Var = (C74539p0) this.f230553h;
                p0Var.f219113a.f218582f.post(new C74535o0(p0Var, false));
                return false;
            }
            C86013q1.m106447h(this.f230552g);
            Uri n = C116299g2.m163858n(this.f230552g + ".tmp");
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            Uri n2 = C116299g2.m163858n(this.f230552g);
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            C116281f0.C116288h l2 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
            if (l.mo177810a() && l2.mo177810a()) {
                try {
                    l2.f348991a.mo119946t(l2.f348992b, l.f348991a, l.f348992b);
                } catch (IOException unused) {
                }
            }
            C74539p0 p0Var2 = (C74539p0) this.f230553h;
            p0Var2.f219113a.f218582f.post(new C74535o0(p0Var2, true));
            return true;
        }
    }

    /* renamed from: e */
    public static C78795g m95196e() {
        if (f230547b == null) {
            f230547b = new C78795g();
        }
        return f230547b;
    }

    /* renamed from: a */
    public String mo108704a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String a = C33918a.m40191a();
        return FilePathGenerator.genPath(a, C90193h.m112878f((str + "ZnVjaw==").getBytes()), 1);
    }

    /* renamed from: b */
    public String mo108705b(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String a = C33918a.m40191a();
        return FilePathGenerator.genPath(a, "remark_", C90193h.m112878f((str + "ZnVjaw==").getBytes()), ".png", 1);
    }

    /* renamed from: c */
    public String mo108706c(String str, int i) {
        String str2;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (i > 0) {
            str2 = "_" + Integer.toString(i);
        } else {
            str2 = "";
        }
        return FilePathGenerator.genPath(C33918a.m40191a(), "remark_", C90193h.m112878f((str + "ZnVjaw==").getBytes()) + str2, ".png", 1);
    }

    /* renamed from: d */
    public String mo108707d(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String str3 = "_" + C90193h.m112878f(str2.getBytes());
        return FilePathGenerator.genPath(C33918a.m40191a(), "remark_", C90193h.m112878f((str + "ZnVjaw==").getBytes()) + str3, ".png", 1);
    }

    /* renamed from: f */
    public boolean mo108708f(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(mo108704a(str));
        if (!m1Var.mo119967g() || m1Var.mo119981s().length <= 0) {
            Log.m105924i("MicroMsg.RemarkImageStorage", "remarkImg is empty!!");
            return false;
        }
        Log.m105925i("MicroMsg.RemarkImageStorage", "RemarkImg size: %s", Integer.valueOf(m1Var.mo119981s().length));
        return true;
    }

    /* renamed from: g */
    public boolean mo108709g(String str) {
        String b = mo108705b(str);
        Log.m105919d("MicroMsg.RemarkImageStorage", "remove remark image: %s, path:%s", str, b);
        return new C86009m1(b).mo119967g();
    }

    /* renamed from: h */
    public Bitmap mo108710h(String str) {
        boolean z = false;
        Bitmap bitmapNative = BitmapUtil.getBitmapNative(mo108705b(str), 0, 0);
        if (bitmapNative != null && !bitmapNative.isRecycled()) {
            z = true;
        }
        if (z) {
            return bitmapNative;
        }
        return null;
    }
}
