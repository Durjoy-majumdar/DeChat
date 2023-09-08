package sf0;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31519v2;
import f40.C86709a0;
import f40.C86744o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Future;
import junit.framework.Assert;
import p755xs.C102720b;
import sf0.C101592a0;
import zt3.C119157j;

/* renamed from: sf0.c0 */
public final class C101594c0 {

    /* renamed from: a */
    public static Vector<WeakReference<C102720b.C78973a>> f297416a = new Vector<>();

    /* renamed from: b */
    public static LinkedList<C102720b.C78973a> f297417b = new LinkedList<>();

    /* renamed from: sf0.c0$a */
    public interface C101595a extends C102720b.C78973a {
    }

    /* renamed from: sf0.c0$b */
    public enum C101596b {
        INSTANCE;
        

        /* renamed from: i */
        public static DisplayMetrics f297419i;

        /* renamed from: d */
        public Map<String, C101599c> f297421d;

        /* renamed from: e */
        public Map<String, WeakReference<Bitmap>> f297422e;

        /* renamed from: f */
        public QueueWorkerThread f297423f;

        /* renamed from: g */
        public QueueWorkerThread f297424g;

        /* renamed from: sf0.c0$b$a */
        public static class C101597a implements QueueWorkerThread.ThreadObject {

            /* renamed from: d */
            public int f297425d;

            /* renamed from: e */
            public Bitmap f297426e;

            /* renamed from: f */
            public C101592a0 f297427f;

            public C101597a(C101592a0 a0Var) {
                this.f297425d = 0;
                this.f297426e = null;
                if (C101594c0.m133438b(a0Var)) {
                    this.f297427f = a0Var;
                    return;
                }
                throw new IllegalArgumentException("from net, picture strategy here must be validity");
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.graphics.Bitmap} */
            /* JADX WARNING: type inference failed for: r6v0 */
            /* JADX WARNING: type inference failed for: r6v1, types: [java.io.InputStream] */
            /* JADX WARNING: type inference failed for: r6v3 */
            /* JADX WARNING: type inference failed for: r6v4 */
            /* JADX WARNING: type inference failed for: r6v6 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:102:0x0273 A[SYNTHETIC, Splitter:B:102:0x0273] */
            /* JADX WARNING: Removed duplicated region for block: B:107:0x0285 A[SYNTHETIC, Splitter:B:107:0x0285] */
            /* JADX WARNING: Removed duplicated region for block: B:89:0x024c A[SYNTHETIC, Splitter:B:89:0x024c] */
            /* JADX WARNING: Removed duplicated region for block: B:94:0x025e A[SYNTHETIC, Splitter:B:94:0x025e] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean doInBackground() {
                /*
                    r14 = this;
                    sf0.a0$a r0 = sf0.C101592a0.C77686a.NET
                    java.lang.String r1 = "_tmp"
                    java.lang.String r2 = "exception:%s"
                    sf0.a0 r3 = r14.f297427f
                    java.lang.String r4 = "MicroMsg.MMPictureLogic"
                    r5 = 1
                    if (r3 != 0) goto L_0x0014
                    java.lang.String r0 = "picStrategy == null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                    return r5
                L_0x0014:
                    r6 = 0
                    r7 = 0
                    r3.mo94822f()     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    sf0.a0 r8 = r14.f297427f     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    java.lang.String r8 = r8.mo94827k()     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    r3.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    r8.<init>()     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    java.lang.String r9 = r3.mo119971i()     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    r8.append(r9)     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    r8.append(r1)     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    java.io.OutputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106429K(r8, r7)     // Catch:{ Exception -> 0x0228, all -> 0x0225 }
                    sf0.a0 r9 = r14.f297427f     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    java.lang.String r9 = r9.mo94823g()     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    com.tencent.mm.network.b0 r9 = com.tencent.p014mm.network.C81035d.m98963d(r9, r6)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    boolean r10 = com.tencent.p014mm.modelimage.C92856r0.m117121g()     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    if (r10 == 0) goto L_0x006a
                    sf0.a0 r10 = r14.f297427f     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    java.lang.String r10 = r10.mo94823g()     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    boolean r10 = com.tencent.p014mm.modelimage.C92856r0.m117122h(r10)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    if (r10 == 0) goto L_0x006a
                    int r10 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    java.lang.String r10 = com.tencent.p014mm.modelimage.C92856r0.m117115a(r10)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    java.lang.String r11 = "webp referer:%s"
                    java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    r12[r7] = r10     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r12)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    r9.mo112917b(r10)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                L_0x006a:
                    r10 = 10000(0x2710, float:1.4013E-41)
                    r9.mo112919d(r10)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    r10 = 20000(0x4e20, float:2.8026E-41)
                    r9.mo112923g(r10)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    java.lang.String r10 = "GET"
                    r9.mo112930l(r10)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    int r10 = com.tencent.p014mm.network.C81035d.m98960a(r9)     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    if (r10 != 0) goto L_0x0084
                    java.io.InputStream r10 = r9.getInputStream()     // Catch:{ Exception -> 0x0222, all -> 0x0220 }
                    goto L_0x0085
                L_0x0084:
                    r10 = r6
                L_0x0085:
                    java.lang.String r9 = r9.getContentType()     // Catch:{ Exception -> 0x021e }
                    java.lang.String r11 = "contentType:%s"
                    java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x021b }
                    r12[r7] = r9     // Catch:{ Exception -> 0x021b }
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r12)     // Catch:{ Exception -> 0x021b }
                    if (r10 != 0) goto L_0x00cd
                    java.lang.String r0 = "download %s error, can not open http stream"
                    java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x021b }
                    sf0.a0 r3 = r14.f297427f     // Catch:{ Exception -> 0x021b }
                    java.lang.String r3 = r3.mo94823g()     // Catch:{ Exception -> 0x021b }
                    r1[r7] = r3     // Catch:{ Exception -> 0x021b }
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)     // Catch:{ Exception -> 0x021b }
                    sf0.a0 r0 = r14.f297427f     // Catch:{ Exception -> 0x021b }
                    r0.mo94826j(r9, r7)     // Catch:{ Exception -> 0x021b }
                    if (r10 == 0) goto L_0x00ba
                    r10.close()     // Catch:{ IOException -> 0x00ae }
                    goto L_0x00ba
                L_0x00ae:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                    r1[r7] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
                L_0x00ba:
                    if (r8 == 0) goto L_0x00cc
                    r8.close()     // Catch:{ IOException -> 0x00c0 }
                    goto L_0x00cc
                L_0x00c0:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                    r1[r7] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
                L_0x00cc:
                    return r5
                L_0x00cd:
                    r11 = 1024(0x400, float:1.435E-42)
                    byte[] r11 = new byte[r11]     // Catch:{ Exception -> 0x021b }
                L_0x00d1:
                    int r12 = r10.read(r11)     // Catch:{ Exception -> 0x021b }
                    r13 = -1
                    if (r12 == r13) goto L_0x00e1
                    int r13 = r14.f297425d     // Catch:{ Exception -> 0x021b }
                    int r13 = r13 + r12
                    r14.f297425d = r13     // Catch:{ Exception -> 0x021b }
                    r8.write(r11, r7, r12)     // Catch:{ Exception -> 0x021b }
                    goto L_0x00d1
                L_0x00e1:
                    java.lang.String r11 = "get url[%s] ok, bufSize[%d]"
                    r12 = 2
                    java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x021b }
                    sf0.a0 r13 = r14.f297427f     // Catch:{ Exception -> 0x021b }
                    java.lang.String r13 = r13.mo94823g()     // Catch:{ Exception -> 0x021b }
                    r12[r7] = r13     // Catch:{ Exception -> 0x021b }
                    int r13 = r14.f297425d     // Catch:{ Exception -> 0x021b }
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x021b }
                    r12[r5] = r13     // Catch:{ Exception -> 0x021b }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r12)     // Catch:{ Exception -> 0x021b }
                    sf0.a0 r11 = r14.f297427f     // Catch:{ Exception -> 0x021b }
                    r11.mo94826j(r9, r5)     // Catch:{ Exception -> 0x021b }
                    r10.close()     // Catch:{ IOException -> 0x0102 }
                    goto L_0x010e
                L_0x0102:
                    r10 = move-exception
                    java.lang.Object[] r11 = new java.lang.Object[r5]
                    java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r10)
                    r11[r7] = r10
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r11)
                L_0x010e:
                    if (r8 == 0) goto L_0x0120
                    r8.close()     // Catch:{ IOException -> 0x0114 }
                    goto L_0x0120
                L_0x0114:
                    r8 = move-exception
                    java.lang.Object[] r10 = new java.lang.Object[r5]
                    java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r8)
                    r10[r7] = r8
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r10)
                L_0x0120:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fc }
                    r8.<init>()     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r10 = r3.mo119971i()     // Catch:{ Exception -> 0x01fc }
                    r8.append(r10)     // Catch:{ Exception -> 0x01fc }
                    r8.append(r1)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01fc }
                    com.tencent.p014mm.vfs.C86013q1.m106456q(r8)     // Catch:{ Exception -> 0x01fc }
                    sf0.a0 r8 = r14.f297427f     // Catch:{ Exception -> 0x01fc }
                    sf0.a0$b r8 = r8.mo94818b()     // Catch:{ Exception -> 0x01fc }
                    if (r8 == 0) goto L_0x0156
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fc }
                    r10.<init>()     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r11 = r3.mo119971i()     // Catch:{ Exception -> 0x01fc }
                    r10.append(r11)     // Catch:{ Exception -> 0x01fc }
                    r10.append(r1)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01fc }
                    android.graphics.Bitmap r8 = r8.mo95233a(r10)     // Catch:{ Exception -> 0x01fc }
                    goto L_0x016d
                L_0x0156:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fc }
                    r8.<init>()     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r10 = r3.mo119971i()     // Catch:{ Exception -> 0x01fc }
                    r8.append(r10)     // Catch:{ Exception -> 0x01fc }
                    r8.append(r1)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01fc }
                    android.graphics.Bitmap r8 = sf0.C101594c0.C101596b.m133443e(r8)     // Catch:{ Exception -> 0x01fc }
                L_0x016d:
                    if (r8 == 0) goto L_0x0189
                    sf0.a0 r9 = r14.f297427f     // Catch:{ Exception -> 0x01fc }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fc }
                    r10.<init>()     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r11 = r3.mo119971i()     // Catch:{ Exception -> 0x01fc }
                    r10.append(r11)     // Catch:{ Exception -> 0x01fc }
                    r10.append(r1)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01fc }
                    android.graphics.Bitmap r0 = r9.mo94819c(r8, r0, r10)     // Catch:{ Exception -> 0x01fc }
                    goto L_0x018f
                L_0x0189:
                    sf0.a0 r10 = r14.f297427f     // Catch:{ Exception -> 0x01fc }
                    r10.mo94825i(r0, r9)     // Catch:{ Exception -> 0x01fc }
                    r0 = r6
                L_0x018f:
                    if (r0 == r8) goto L_0x01a8
                    boolean r9 = r8.isRecycled()     // Catch:{ Exception -> 0x01fc }
                    if (r9 != 0) goto L_0x01a8
                    java.lang.String r9 = "recycle bitmap:%s"
                    java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r11 = r8.toString()     // Catch:{ Exception -> 0x01fc }
                    r10[r7] = r11     // Catch:{ Exception -> 0x01fc }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r10)     // Catch:{ Exception -> 0x01fc }
                    r8.recycle()     // Catch:{ Exception -> 0x01fc }
                L_0x01a8:
                    sf0.c0$b r8 = sf0.C101594c0.C101596b.INSTANCE     // Catch:{ Exception -> 0x01fc }
                    sf0.a0 r9 = r14.f297427f     // Catch:{ Exception -> 0x01fc }
                    r8.mo141070h(r9, r0)     // Catch:{ Exception -> 0x01fc }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fc }
                    r8.<init>()     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r3 = r3.mo119971i()     // Catch:{ Exception -> 0x01fc }
                    r8.append(r3)     // Catch:{ Exception -> 0x01fc }
                    r8.append(r1)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x01fc }
                    android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r3 = r1.getPath()     // Catch:{ Exception -> 0x01fc }
                    if (r3 == 0) goto L_0x01e6
                    java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r7, r7)     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r8 = r1.getPath()     // Catch:{ Exception -> 0x01fc }
                    boolean r8 = r8.equals(r3)     // Catch:{ Exception -> 0x01fc }
                    if (r8 != 0) goto L_0x01e6
                    android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ Exception -> 0x01fc }
                    android.net.Uri$Builder r1 = r1.path(r3)     // Catch:{ Exception -> 0x01fc }
                    android.net.Uri r1 = r1.build()     // Catch:{ Exception -> 0x01fc }
                L_0x01e6:
                    com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x01fc }
                    com.tencent.mm.vfs.f0$h r1 = r3.mo177799l(r1, r6)     // Catch:{ Exception -> 0x01fc }
                    boolean r3 = r1.mo177810a()     // Catch:{ Exception -> 0x01fc }
                    if (r3 == 0) goto L_0x01fa
                    com.tencent.mm.vfs.FileSystem$c r3 = r1.f348991a     // Catch:{ Exception -> 0x01fc }
                    java.lang.String r1 = r1.f348992b     // Catch:{ Exception -> 0x01fc }
                    boolean r1 = r3.mo119933c(r1)     // Catch:{ Exception -> 0x01fc }
                L_0x01fa:
                    r6 = r0
                    goto L_0x0218
                L_0x01fc:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    sf0.a0 r3 = r14.f297427f
                    java.lang.String r3 = r3.mo94823g()
                    r1[r7] = r3
                    java.lang.String r3 = "update pic for %s, error"
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r1)
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                    r1[r7] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
                L_0x0218:
                    r14.f297426e = r6
                    return r5
                L_0x021b:
                    r0 = move-exception
                    r6 = r9
                    goto L_0x022b
                L_0x021e:
                    r0 = move-exception
                    goto L_0x022b
                L_0x0220:
                    r0 = move-exception
                    goto L_0x0271
                L_0x0222:
                    r0 = move-exception
                    r10 = r6
                    goto L_0x022b
                L_0x0225:
                    r0 = move-exception
                    r8 = r6
                    goto L_0x0271
                L_0x0228:
                    r0 = move-exception
                    r8 = r6
                    r10 = r8
                L_0x022b:
                    java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x026f }
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x026f }
                    r1[r7] = r0     // Catch:{ all -> 0x026f }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)     // Catch:{ all -> 0x026f }
                    java.lang.String r0 = "get url:%s failed."
                    java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x026f }
                    sf0.a0 r3 = r14.f297427f     // Catch:{ all -> 0x026f }
                    java.lang.String r3 = r3.mo94823g()     // Catch:{ all -> 0x026f }
                    r1[r7] = r3     // Catch:{ all -> 0x026f }
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)     // Catch:{ all -> 0x026f }
                    sf0.a0 r0 = r14.f297427f     // Catch:{ all -> 0x026f }
                    r0.mo94826j(r6, r7)     // Catch:{ all -> 0x026f }
                    if (r10 == 0) goto L_0x025c
                    r10.close()     // Catch:{ IOException -> 0x0250 }
                    goto L_0x025c
                L_0x0250:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                    r1[r7] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
                L_0x025c:
                    if (r8 == 0) goto L_0x026e
                    r8.close()     // Catch:{ IOException -> 0x0262 }
                    goto L_0x026e
                L_0x0262:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                    r1[r7] = r0
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
                L_0x026e:
                    return r5
                L_0x026f:
                    r0 = move-exception
                    r6 = r10
                L_0x0271:
                    if (r6 == 0) goto L_0x0283
                    r6.close()     // Catch:{ IOException -> 0x0277 }
                    goto L_0x0283
                L_0x0277:
                    r1 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r5]
                    java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                    r3[r7] = r1
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
                L_0x0283:
                    if (r8 == 0) goto L_0x0295
                    r8.close()     // Catch:{ IOException -> 0x0289 }
                    goto L_0x0295
                L_0x0289:
                    r1 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r5]
                    java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                    r3[r7] = r1
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
                L_0x0295:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sf0.C101594c0.C101596b.C101597a.doInBackground():boolean");
            }

            public boolean onPostExecute() {
                try {
                    ((C29048w.C29055f) C31519v2.f84271a).mo56422a(this.f297425d, 0, 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MMPictureLogic", "exception:%s", Util.stackTraceToString(e));
                }
                C101596b.m133442c(C101596b.INSTANCE, this.f297427f.mo94823g(), this.f297427f.mo94820d(), this.f297426e);
                this.f297426e = null;
                return false;
            }
        }

        /* renamed from: sf0.c0$b$b */
        public static class C101598b implements QueueWorkerThread.ThreadObject {

            /* renamed from: d */
            public Bitmap f297428d;

            /* renamed from: e */
            public C101592a0 f297429e;

            public C101598b(C101592a0 a0Var) {
                this.f297428d = null;
                if (C101594c0.m133438b(a0Var)) {
                    this.f297429e = a0Var;
                    return;
                }
                throw new IllegalArgumentException("from sdcard, picture strategy here must be validity");
            }

            public boolean doInBackground() {
                Bitmap e = C101596b.m133443e(this.f297429e.mo94827k());
                this.f297428d = e;
                if (e != null) {
                    this.f297428d = C101596b.INSTANCE.mo141071i(this.f297429e, e);
                }
                Object[] objArr = new Object[3];
                boolean z = false;
                objArr[0] = this.f297429e.mo94823g();
                objArr[1] = this.f297429e.mo94827k();
                if (this.f297428d != null) {
                    z = true;
                }
                objArr[2] = Boolean.valueOf(z);
                Log.m105927v("MicroMsg.MMPictureLogic", "get url[%s] from[%s] result[%B]", objArr);
                return true;
            }

            public boolean onPostExecute() {
                if (this.f297428d == null) {
                    Log.m105919d("MicroMsg.MMPictureLogic", "can not find bitmap on sdCard, url=%s, try to download it", this.f297429e.mo94823g());
                    C101596b bVar = C101596b.INSTANCE;
                    QueueWorkerThread queueWorkerThread = bVar.f297423f;
                    if (queueWorkerThread == null || queueWorkerThread.isDead()) {
                        bVar.f297423f = new QueueWorkerThread(1, "readerapp-pic-logic-download", 3);
                    }
                    bVar.f297423f.add(new C101597a(this.f297429e));
                } else {
                    C101596b.m133442c(C101596b.INSTANCE, this.f297429e.mo94823g(), this.f297429e.mo94820d(), this.f297428d);
                    this.f297428d = null;
                }
                return false;
            }
        }

        /* renamed from: sf0.c0$b$c */
        public static class C101599c {

            /* renamed from: a */
            public boolean f297430a;

            /* renamed from: b */
            public int f297431b;

            /* renamed from: c */
            public int f297432c;

            public String toString() {
                return "fail[" + this.f297430a + "]," + "tryTimes[" + this.f297431b + "]," + "lastTS[" + this.f297432c + "]";
            }
        }

        /* access modifiers changed from: public */
        static {
            f297419i = null;
        }

        /* renamed from: a */
        public static Bitmap m133440a(C101596b bVar, C101592a0 a0Var) {
            Bitmap bitmap;
            bVar.getClass();
            Assert.assertTrue("picture strategy here must be validity", C101594c0.m133438b(a0Var));
            WeakReference weakReference = (WeakReference) ((HashMap) bVar.f297422e).get(a0Var.mo94817a());
            if (weakReference == null || (bitmap = (Bitmap) weakReference.get()) == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }

        /* renamed from: b */
        public static Bitmap m133441b(C101596b bVar, C101592a0 a0Var) {
            bVar.getClass();
            Assert.assertTrue("picture strategy here must be validity", C101594c0.m133438b(a0Var));
            WeakReference weakReference = (WeakReference) ((HashMap) bVar.f297422e).get(a0Var.mo94817a());
            if (weakReference == null) {
                return bVar.mo141069g(a0Var);
            }
            Bitmap bitmap = (Bitmap) weakReference.get();
            return (bitmap == null || bitmap.isRecycled()) ? bVar.mo141069g(a0Var) : bitmap;
        }

        /* renamed from: c */
        public static void m133442c(C101596b bVar, String str, String str2, Bitmap bitmap) {
            bVar.getClass();
            LinkedList<C102720b.C78973a> linkedList = C101594c0.f297417b;
            for (C102720b.C78973a aVar : (C102720b.C78973a[]) linkedList.toArray(new C102720b.C78973a[linkedList.size()])) {
                if (aVar != null) {
                    aVar.mo24656j3(str2, bitmap);
                }
            }
            Vector vector = new Vector();
            for (int i = 0; i < C101594c0.f297416a.size(); i++) {
                WeakReference weakReference = C101594c0.f297416a.get(i);
                if (weakReference != null) {
                    C102720b.C78973a aVar2 = (C102720b.C78973a) weakReference.get();
                    if (aVar2 != null) {
                        aVar2.mo24656j3(str2, bitmap);
                    } else {
                        vector.add(weakReference);
                    }
                }
            }
            C101594c0.f297416a.removeAll(vector);
            if (bitmap != null) {
                ((HashMap) bVar.f297421d).remove(str);
                return;
            }
            C101599c cVar = (C101599c) ((HashMap) bVar.f297421d).get(str);
            if (cVar != null) {
                cVar.f297430a = true;
            }
        }

        /* renamed from: e */
        public static Bitmap m133443e(String str) {
            if (f297419i == null) {
                f297419i = MMApplicationContext.getContext().getResources().getDisplayMetrics();
            }
            DisplayMetrics displayMetrics = f297419i;
            return m133444f(str, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }

        /* renamed from: f */
        public static Bitmap m133444f(String str, int i, int i2) {
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.MMPictureLogic", "error input, path is null");
                return null;
            } else if (i > 0 && i2 > 0) {
                return BitmapUtil.getBitmapNative(str, i, i2);
            } else {
                Log.m105929w("MicroMsg.MMPictureLogic", "error input, targetWidth %d, targetHeight %d", Integer.valueOf(i), Integer.valueOf(i2));
                return null;
            }
        }

        /* renamed from: g */
        public Bitmap mo141069g(C101592a0 a0Var) {
            Assert.assertTrue("picture strategy here must be validity", C101594c0.m133438b(a0Var));
            String g = a0Var.mo94823g();
            C101599c cVar = (C101599c) ((HashMap) this.f297421d).get(g);
            if (cVar == null) {
                cVar = new C101599c();
            }
            if (cVar.f297430a) {
                int i = cVar.f297431b;
                if (i < 3) {
                    cVar.f297431b = i + 1;
                } else if (Util.secondsToNow((long) cVar.f297432c) < 120) {
                    Log.m105929w("MicroMsg.MMPictureLogic", "download fail interval less than %d s for %s", 120, g);
                    return null;
                } else {
                    cVar.f297431b = 0;
                }
                cVar.f297430a = false;
                cVar.f297432c = (int) Util.nowSecond();
                ((HashMap) this.f297421d).put(g, cVar);
            } else if (Util.secondsToNow((long) cVar.f297432c) < 120) {
                Log.m105919d("MicroMsg.MMPictureLogic", "downloading interval less than %d s for %s", 120, g);
                return null;
            } else {
                cVar.f297431b++;
                cVar.f297432c = (int) Util.nowSecond();
                ((HashMap) this.f297421d).put(g, cVar);
            }
            if (a0Var.mo94828l()) {
                C101592a0.C101593b b = a0Var.mo94818b();
                Bitmap a = b != null ? b.mo95233a(a0Var.mo94827k()) : m133443e(a0Var.mo94827k());
                if (a != null) {
                    Bitmap i2 = mo141071i(a0Var, a);
                    ((HashMap) this.f297421d).remove(g);
                    return i2;
                }
                QueueWorkerThread queueWorkerThread = this.f297423f;
                if (queueWorkerThread == null || queueWorkerThread.isDead()) {
                    this.f297423f = new QueueWorkerThread(1, "readerapp-pic-logic-download", 3);
                }
                this.f297423f.add(new C101597a(a0Var));
                return null;
            }
            QueueWorkerThread queueWorkerThread2 = this.f297424g;
            if (queueWorkerThread2 == null || queueWorkerThread2.isDead()) {
                this.f297424g = new QueueWorkerThread(1, "readerapp-pic-logic-reader", 1);
            }
            this.f297424g.add(new C101598b(a0Var));
            return null;
        }

        /* renamed from: h */
        public final void mo141070h(C101592a0 a0Var, Bitmap bitmap) {
            Assert.assertTrue("picture strategy here must be validity", C101594c0.m133438b(a0Var));
            String a = a0Var.mo94817a();
            Bitmap bitmap2 = ((HashMap) this.f297422e).containsKey(a) ? (Bitmap) ((WeakReference) ((HashMap) this.f297422e).get(a)).get() : null;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                ((HashMap) this.f297422e).remove(a);
                ((HashMap) this.f297422e).put(a, new WeakReference(bitmap));
            }
        }

        /* renamed from: i */
        public Bitmap mo141071i(C101592a0 a0Var, Bitmap bitmap) {
            C101592a0.C77686a aVar = C101592a0.C77686a.DISK;
            Assert.assertTrue("picture strategy here must be validity", C101594c0.m133438b(a0Var));
            if (bitmap != null) {
                Bitmap c = a0Var.mo94819c(bitmap, aVar, a0Var.mo94827k());
                if (c != bitmap && !bitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.MMPictureLogic", "recycle bitmap:%s", bitmap.toString());
                    bitmap.recycle();
                }
                mo141070h(a0Var, c);
                return c;
            }
            a0Var.mo94825i(aVar, (String) null);
            return bitmap;
        }
    }

    /* renamed from: b */
    public static boolean m133438b(C101592a0 a0Var) {
        return a0Var != null && !Util.isNullOrNil(a0Var.mo94823g());
    }

    /* renamed from: c */
    public static Bitmap m133439c(C101592a0 a0Var) {
        if (!m133438b(a0Var)) {
            return null;
        }
        C86744o s = C86709a0.m107535s();
        if (s.f251822t == null) {
            s.f251822t = Boolean.valueOf(s.mo121147n());
        } else {
            long currentTimeMillis = System.currentTimeMillis() - s.f251824v;
            if (currentTimeMillis <= 0 || currentTimeMillis >= 1000) {
                C86744o.C86746d dVar = s.f251823u;
                Future future = dVar.f251825d;
                if (future != null && !future.isDone()) {
                    dVar.f251825d.cancel(false);
                }
                ((C119157j) C119157j.f356862d).mo183878i(s.f251823u, 1000);
                s.f251824v = System.currentTimeMillis();
            }
        }
        return !s.f251822t.booleanValue() ? a0Var.mo94821e() : a0Var.mo94824h() ? C101596b.m133440a(C101596b.INSTANCE, a0Var) : C101596b.m133441b(C101596b.INSTANCE, a0Var);
    }
}
