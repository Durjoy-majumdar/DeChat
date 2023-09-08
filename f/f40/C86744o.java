package f40;

import a70.C112760b;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import bp3.C79753e;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30727c5;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85796t4;
import com.tencent.p014mm.storage.C85798u1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.C86016v1;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.xweb.file.XVFSFile;
import f40.C31887k0;
import f40.C86718e;
import h40.C87424c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import lu3.C117478d;
import nr3.C89055a;
import p156gj.C87199n;
import p206nj.C88955f;
import p206nj.C88956h;
import p261wl.C38166b;
import p261wl.C38174i;
import p823sg.C77710q;
import p823sg.C90193h;
import qe3.C89625d;
import zh3.C91753f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: f40.o */
public class C86744o {

    /* renamed from: w */
    public static HashMap<Integer, C91753f.C66827b> f251802w;

    /* renamed from: a */
    public final C85798u1 f251803a;

    /* renamed from: b */
    public C86747e f251804b = new C86747e();

    /* renamed from: c */
    public String f251805c;

    /* renamed from: d */
    public String f251806d;

    /* renamed from: e */
    public String f251807e;

    /* renamed from: f */
    public String f251808f;

    /* renamed from: g */
    public String f251809g;

    /* renamed from: h */
    public String f251810h;

    /* renamed from: i */
    public C91753f f251811i;

    /* renamed from: j */
    public C85801v1 f251812j;

    /* renamed from: k */
    public C85796t4 f251813k;

    /* renamed from: l */
    public C30727c5 f251814l;

    /* renamed from: m */
    public ConcurrentHashMap<Integer, String> f251815m;

    /* renamed from: n */
    public boolean f251816n;

    /* renamed from: o */
    public ConcurrentHashMap<String, SharedPreferences> f251817o;

    /* renamed from: p */
    public long f251818p;

    /* renamed from: q */
    public long f251819q;

    /* renamed from: r */
    public long f251820r;

    /* renamed from: s */
    public long f251821s;

    /* renamed from: t */
    public volatile Boolean f251822t;

    /* renamed from: u */
    public C86746d f251823u;

    /* renamed from: v */
    public long f251824v;

    /* renamed from: f40.o$c */
    public class C31895c implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C30727c5.f82643e;
        }
    }

    /* renamed from: f40.o$a */
    public class C75679a implements C86016v1 {
        public C75679a(C86744o oVar) {
        }

        public boolean accept(C86009m1 m1Var, String str) {
            return str.startsWith("EnMicroMsg.dberr");
        }
    }

    /* renamed from: f40.o$f */
    public static class C75680f {

        /* renamed from: a */
        public boolean f222289a = false;

        /* renamed from: b */
        public int f222290b = 0;
    }

    /* renamed from: f40.o$b */
    public class C86745b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C85801v1.f249892k;
        }
    }

    /* renamed from: f40.o$d */
    public class C86746d implements Runnable, C117478d {

        /* renamed from: d */
        public Future f251825d;

        public C86746d(C31886k kVar) {
        }

        /* renamed from: g */
        public void mo121152g(Future future) {
            this.f251825d = future;
        }

        public void run() {
            C86744o oVar = C86744o.this;
            oVar.f251822t = Boolean.valueOf(oVar.mo121147n());
        }
    }

    /* renamed from: f40.o$e */
    public static class C86747e extends C89055a<C91753f.C91754a> implements C91753f.C91754a {

        /* renamed from: f40.o$e$a */
        public class C86748a implements C89055a.C89056a<C91753f.C91754a> {
            public C86748a(C86747e eVar) {
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C91753f.C91754a) obj).mo56419d();
            }
        }

        /* renamed from: f40.o$e$b */
        public class C86749b implements C89055a.C89056a<C91753f.C91754a> {
            public C86749b(C86747e eVar) {
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C91753f.C91754a) obj).mo56420f();
            }
        }

        /* renamed from: f40.o$e$c */
        public class C86750c implements C89055a.C89056a<C91753f.C91754a> {
            public C86750c(C86747e eVar) {
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C91753f.C91754a) obj).mo56421m();
            }
        }

        /* renamed from: d */
        public void mo56419d() {
            mo123416n(new C86748a(this));
        }

        /* renamed from: f */
        public void mo56420f() {
            mo123416n(new C86749b(this));
        }

        /* renamed from: m */
        public void mo56421m() {
            mo123416n(new C86750c(this));
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f251802w = hashMap;
        hashMap.put(-518839183, new C86745b());
        f251802w.put(-584410477, new C31895c());
    }

    public C86744o() {
        new C86747e();
        this.f251811i = null;
        this.f251816n = false;
        this.f251817o = new ConcurrentHashMap<>();
        this.f251818p = -1;
        this.f251819q = -1;
        this.f251820r = -1;
        this.f251821s = 0;
        this.f251822t = null;
        this.f251823u = new C86746d((C31886k) null);
        this.f251824v = 0;
        Log.m105925i("MMKernel.CoreStorage", "initialize packageInfo:%s version:%x", BuildInfo.info(), Integer.valueOf(C89625d.f257841g));
        Uri n = C116299g2.m163858n(C72994y1.f212832a);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        C85798u1 u1Var = new C85798u1(C72994y1.f212832a + "systemInfo.cfg");
        String str = (String) u1Var.mo119660a(258);
        if (str != null) {
            C87199n.m108254a().mo121634b(258, str);
        }
        try {
            StatFs statFs = new StatFs(C88956h.m111060a().getPath());
            this.f251819q = statFs.getBlockSizeLong();
            this.f251818p = statFs.getBlockCountLong();
            this.f251820r = statFs.getAvailableBlocksLong();
            Log.m105925i("MMKernel.CoreStorage", "CheckData path[%s] blocksize:%s blockcount:%s availcount:%s", C88956h.m111060a().getAbsolutePath(), Long.valueOf(this.f251819q), Long.valueOf(this.f251818p), Long.valueOf(this.f251820r));
        } catch (Exception e) {
            Log.m105921e("MMKernel.CoreStorage", "check data size failed :%s", e.getMessage());
        }
        this.f251803a = u1Var;
        C86718e.C86720e eVar = C86718e.f251745u;
        synchronized (eVar) {
            eVar.f251772c = u1Var;
        }
        this.f251805c = m107605a();
    }

    /* renamed from: a */
    public static String m107605a() {
        String str = C72994y1.f212832a;
        Uri n = C116299g2.m163858n(C112760b.m154230f0());
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("summer buildSysPath sysPath[");
        sb.append(str);
        sb.append("] SDCARD_ROOT[");
        sb.append(C112760b.m154230f0());
        sb.append("] file.exists:");
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        sb.append(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b));
        sb.append(" CUtil.isSDCardAvail():");
        sb.append(C88955f.m111058b());
        Log.m105924i("MMKernel.CoreStorage", sb.toString());
        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
        if ((!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) && C88955f.m111058b()) {
            if (m107606e(C112760b.m154195C())) {
                str = C112760b.m154195C();
            }
            Uri n2 = C116299g2.m163858n(C112760b.m154206N());
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!(!l3.mo177810a() ? false : l3.f348991a.mo119948x(l3.f348992b))) {
                C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(n2, l3);
                if (l4.mo177810a()) {
                    l4.f348991a.mo119937g(l4.f348992b);
                }
            }
            Uri n3 = C116299g2.m163858n(C112760b.m154253y());
            String path3 = n3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!n3.getPath().equals(k3)) {
                    n3 = n3.buildUpon().path(k3).build();
                }
            }
            C116281f0.C116288h l5 = C116281f0.C116289i.f348994a.mo177799l(n3, (C116281f0.C116288h) null);
            if (!(!l5.mo177810a() ? false : l5.f348991a.mo119948x(l5.f348992b))) {
                C116281f0.C116288h l6 = C116281f0.C116289i.f348994a.mo177799l(n3, l5);
                if (l6.mo177810a()) {
                    l6.f348991a.mo119937g(l6.f348992b);
                }
            }
            Uri n4 = C116299g2.m163858n(C112760b.m154242n());
            String path4 = n4.getPath();
            if (path4 != null) {
                String k4 = C116299g2.m163855k(path4, false, false);
                if (!n4.getPath().equals(k4)) {
                    n4 = n4.buildUpon().path(k4).build();
                }
            }
            C116281f0.C116288h l7 = C116281f0.C116289i.f348994a.mo177799l(n4, (C116281f0.C116288h) null);
            if (!(!l7.mo177810a() ? false : l7.f348991a.mo119948x(l7.f348992b))) {
                C116281f0.C116288h l8 = C116281f0.C116289i.f348994a.mo177799l(n4, l7);
                if (l8.mo177810a()) {
                    l8.f348991a.mo119937g(l8.f348992b);
                }
            }
            C86009m1 m1Var = new C86009m1(C112760b.m154206N() + FilePathGenerator.NO_MEDIA_FILENAME);
            if (!m1Var.mo119967g()) {
                try {
                    m1Var.mo119964e();
                } catch (IOException e) {
                    Log.m105921e("MMKernel.CoreStorage", "exception:%s", Util.stackTraceToString(e));
                }
            }
            m107606e(C112760b.m154247s());
        }
        Uri n5 = C116299g2.m163858n(str);
        String path5 = n5.getPath();
        if (path5 != null) {
            String k5 = C116299g2.m163855k(path5, false, false);
            if (!n5.getPath().equals(k5)) {
                n5 = n5.buildUpon().path(k5).build();
            }
        }
        C116281f0.C116288h l9 = C116281f0.C116289i.f348994a.mo177799l(n5, (C116281f0.C116288h) null);
        if (l9.mo177810a()) {
            z = l9.f348991a.mo119948x(l9.f348992b);
        }
        if (!z) {
            C116281f0.C116288h l15 = C116281f0.C116289i.f348994a.mo177799l(n5, l9);
            if (l15.mo177810a()) {
                l15.f348991a.mo119937g(l15.f348992b);
            }
        }
        Log.m105924i("MMKernel.CoreStorage", "summer buildSysPath ret sysPath: " + str);
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m107606e(java.lang.String r11) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r1 = "MMKernel.CoreStorage"
            r2 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r11 = "forceMkdirs absolutePath isNullOrNil ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            return r2
        L_0x000f:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r11)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r11
            boolean r4 = r0.mo119967g()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            boolean r4 = r0.mo119977o()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 2
            r3[r6] = r4
            java.lang.String r4 = "forceMkdirs absolutePath[%s], f.exists[%b], f.isDirectory[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
            boolean r3 = r0.mo119967g()
            if (r3 == 0) goto L_0x0046
            boolean r0 = r0.mo119977o()
            if (r0 == 0) goto L_0x0046
            java.lang.String r11 = "forceMkdirs f is dir and exist ret true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            return r5
        L_0x0046:
            java.lang.String r0 = "/"
            java.lang.String[] r11 = r11.split(r0)
            if (r11 == 0) goto L_0x0125
            int r3 = r11.length
            if (r3 >= r6) goto L_0x0053
            goto L_0x0125
        L_0x0053:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "forceMkdirs absolutePath arr len: "
            r3.append(r4)
            int r4 = r11.length
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            r4 = r0
            r3 = 0
        L_0x006a:
            int r6 = r11.length
            if (r3 >= r6) goto L_0x011f
            r6 = r11[r3]
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0077
            goto L_0x011b
        L_0x0077:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r0)
            r4 = r11[r3]
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>((java.lang.String) r4)
            boolean r7 = r6.mo119978p()
            if (r7 == 0) goto L_0x0101
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r8 = "_mmbak"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r7)
            r8 = 0
            java.lang.String r9 = r7.getPath()
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r2, r2)
            java.lang.String r10 = r7.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x00cc
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r7 = r7.path(r9)
            android.net.Uri r7 = r7.build()
        L_0x00cc:
            com.tencent.mm.vfs.f0$h r9 = r6.mo119989z()
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r7 = r10.mo177799l(r7, r8)
            boolean r8 = r9.mo177810a()
            if (r8 == 0) goto L_0x00f0
            boolean r8 = r7.mo177810a()
            if (r8 != 0) goto L_0x00e3
            goto L_0x00f0
        L_0x00e3:
            com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r7 = r7.f348992b     // Catch:{ IOException -> 0x00f0 }
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r9 = r9.f348992b     // Catch:{ IOException -> 0x00f0 }
            boolean r7 = r8.mo119946t(r7, r10, r9)     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
            r7 = 0
        L_0x00f1:
            if (r7 != 0) goto L_0x0101
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r0 = r6.getName()
            r11[r2] = r0
            java.lang.String r0 = "forceMkdirs renameTo false ret false file[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r11)
            return r2
        L_0x0101:
            boolean r7 = r6.mo119967g()
            if (r7 != 0) goto L_0x011b
            boolean r7 = r6.mo119987x()
            if (r7 != 0) goto L_0x011b
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r0 = r6.getName()
            r11[r2] = r0
            java.lang.String r0 = "forceMkdirs mkdir false ret false file[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r11)
            return r2
        L_0x011b:
            int r3 = r3 + 1
            goto L_0x006a
        L_0x011f:
            java.lang.String r11 = "forceMkdirs false ret true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            return r5
        L_0x0125:
            java.lang.String r11 = "forceMkdirs absolutePath arr len illegal ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C86744o.m107606e(java.lang.String):boolean");
    }

    /* renamed from: p */
    public static byte[] m107607p(C86009m1 m1Var) {
        InputStream D;
        long r = m1Var.mo119980r();
        int i = (r > 4096 ? 1 : (r == 4096 ? 0 : -1));
        if (i == 0 || r == 4112) {
            try {
                D = C86013q1.m106422D(m1Var);
                byte[] bArr = new byte[4096];
                int i2 = 0;
                do {
                    int read = D.read(bArr, i2, 4096 - i2);
                    if (read < 0) {
                        Log.m105921e("MMKernel.CoreStorage", "Early EOF of account file %s: %d", m1Var, Integer.valueOf(i2));
                        D.close();
                        return null;
                    }
                    i2 += read;
                } while (i2 < 4096);
                if (i > 0) {
                    byte[] bArr2 = new byte[16];
                    int i3 = 0;
                    do {
                        int read2 = D.read(bArr2, i3, 16 - i3);
                        if (read2 < 0) {
                            Log.m105921e("MMKernel.CoreStorage", "Early EOF of account file %s: %d", m1Var, Integer.valueOf(i3));
                            D.close();
                            return null;
                        }
                        i3 += read2;
                    } while (i3 < 16);
                    if (!Arrays.equals(bArr2, C90193h.m112879g(bArr))) {
                        Log.m105921e("MMKernel.CoreStorage", "Failed account file checksum: %s", m1Var);
                        D.close();
                        return null;
                    }
                }
                D.close();
                return bArr;
            } catch (IOException e) {
                Log.printErrStackTrace("MMKernel.CoreStorage", e, "Cannot read account file %s", m1Var);
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Log.m105929w("MMKernel.CoreStorage", "Invalid length of account file %s: %d", m1Var, Long.valueOf(r));
            return null;
        }
        throw th;
    }

    /* renamed from: t */
    public static boolean m107608t() {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        boolean equalsIgnoreCase = C112760b.m154230f0().equalsIgnoreCase(absolutePath);
        boolean equals = Environment.getExternalStorageState().equals("mounted");
        boolean z = false;
        try {
            Uri n = C116299g2.m163858n(Environment.getExternalStorageDirectory().getAbsolutePath());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                FileSystem.C85995c cVar = l.f348991a;
                String w = cVar.mo119947w(l.f348992b, false);
                z = w != null ? new File(w).canRead() : cVar.mo119948x(l.f348992b);
            }
        } catch (Exception e) {
            Log.m105928w("MMKernel.CoreStorage", "testSdcardReadable 1 e: " + e.getMessage());
        }
        C86009m1 m1Var = new C86009m1(C112760b.m154195C());
        boolean g = m1Var.mo119967g();
        if (g) {
            Log.m105924i("MMKernel.CoreStorage", "testSdcardReadable testFile isDirectory:" + m1Var.mo119977o() + " isFile:" + m1Var.mo119978p());
        }
        Log.m105924i("MMKernel.CoreStorage", "testSdcardWritable primaryExtStg: " + absolutePath + " CConstants.SDCARD_ROOT: " + C112760b.m154230f0() + " CConstants.DATAROOT_SDCARD_PATH: " + C112760b.m154195C() + " isPrimaryExtStg: " + equalsIgnoreCase + " mounted: " + equals + " canRead: " + z + " canTrueRead:" + g);
        return g;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.OutputStream, com.tencent.mm.vfs.f0$h] */
    /* renamed from: u */
    public static boolean m107609u() {
        boolean z;
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        boolean equalsIgnoreCase = C112760b.m154230f0().equalsIgnoreCase(absolutePath);
        boolean equals = Environment.getExternalStorageState().equals("mounted");
        ? r5 = 0;
        boolean z2 = false;
        try {
            Uri n = C116299g2.m163858n(Environment.getExternalStorageDirectory().getAbsolutePath());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, r5);
            if (l.mo177810a()) {
                FileSystem.C85995c cVar = l.f348991a;
                if ((cVar.mo119936f() & 1) != 0) {
                    String w = cVar.mo119947w(l.f348992b, true);
                    z = w != null ? new File(w).canWrite() : cVar.mo119948x(l.f348992b);
                    C86009m1 m1Var = new C86009m1(Environment.getExternalStorageDirectory().getAbsolutePath(), "test_writable");
                    m1Var.mo119964e();
                    OutputStream H = C86013q1.m106426H(m1Var);
                    H.write(APMidasPayAPI.ENV_TEST.getBytes());
                    H.flush();
                    H.close();
                    boolean f = m1Var.mo119966f();
                    try {
                        H.close();
                    } catch (IOException e) {
                        Log.m105921e("MMKernel.CoreStorage", "exception:%s", Util.stackTraceToString(e));
                    }
                    z2 = f;
                    Log.m105924i("MMKernel.CoreStorage", "testSdcardWritable primaryExtStg: " + absolutePath + " CConstants.SDCARD_ROOT: " + C112760b.m154230f0() + " isPrimaryExtStg: " + equalsIgnoreCase + " mounted: " + equals + " canWrite: " + z + " canTrueWrite:" + z2);
                    return z2;
                }
            }
        } catch (Exception e2) {
            Log.m105928w("MMKernel.CoreStorage", "testSdcardWritable 1 e: " + e2.getMessage());
        }
        z = false;
        C86009m1 m1Var2 = new C86009m1(Environment.getExternalStorageDirectory().getAbsolutePath(), "test_writable");
        try {
            m1Var2.mo119964e();
            OutputStream H2 = C86013q1.m106426H(m1Var2);
            H2.write(APMidasPayAPI.ENV_TEST.getBytes());
            H2.flush();
            H2.close();
            boolean f2 = m1Var2.mo119966f();
            H2.close();
            z2 = f2;
        } catch (Exception e3) {
            Log.m105928w("MMKernel.CoreStorage", "testSdcardWritable 2 e: " + e3.getMessage());
            if (r5 != 0) {
                try {
                    r5.close();
                } catch (IOException e4) {
                    Log.m105921e("MMKernel.CoreStorage", "exception:%s", Util.stackTraceToString(e4));
                }
            }
        } catch (Throwable th) {
            if (r5 != 0) {
                try {
                    r5.close();
                } catch (IOException e5) {
                    Log.m105921e("MMKernel.CoreStorage", "exception:%s", Util.stackTraceToString(e5));
                }
            }
            throw th;
        }
        Log.m105924i("MMKernel.CoreStorage", "testSdcardWritable primaryExtStg: " + absolutePath + " CConstants.SDCARD_ROOT: " + C112760b.m154230f0() + " isPrimaryExtStg: " + equalsIgnoreCase + " mounted: " + equals + " canWrite: " + z + " canTrueWrite:" + z2);
        return z2;
    }

    /* renamed from: v */
    public static boolean m107610v(C86009m1 m1Var, byte[] bArr) {
        OutputStream H;
        if (bArr.length != 4096) {
            Log.m105920e("MMKernel.CoreStorage", "Wrong length of data.");
            return false;
        }
        m1Var.mo119974l().mo119987x();
        try {
            H = C86013q1.m106426H(m1Var);
            H.write(bArr);
            H.write(C90193h.m112879g(bArr));
            Log.m105924i("MMKernel.CoreStorage", "Write account file " + m1Var);
            H.close();
            return true;
        } catch (IOException e) {
            Log.printErrStackTrace("MMKernel.CoreStorage", e, "Cannot write to account file %s", m1Var);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public boolean mo121136b() {
        Object obj = C116281f0.C116289i.f348994a.mo177791d().get("accountOtherList");
        if ((obj instanceof String ? new String[]{(String) obj} : obj instanceof String[] ? (String[]) obj : null) == null) {
            return false;
        }
        return MultiProcessMMKV.getDefault().decodeBool("C2CErrorToBeRescued", true);
    }

    /* renamed from: c */
    public final void mo121137c(String str) {
        C91753f fVar = this.f251811i;
        if (fVar != null) {
            fVar.mo124433c(str);
        }
        this.f251816n = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        if (r12.equals(r3) != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d8, code lost:
        if (r12.equals(r3) != false) goto L_0x00da;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo121138d(zh3.C119118e r18, java.util.HashMap<java.lang.Integer, zh3.C91753f.C66827b> r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            if (r19 != 0) goto L_0x000b
            r4 = -1
            goto L_0x000f
        L_0x000b:
            int r4 = r19.size()
        L_0x000f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r0[r5] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r20)
            r6 = 1
            r0[r6] = r4
            java.lang.String r4 = "MMKernel.CoreStorage"
            java.lang.String r7 = "createtables %d %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r0)
            sf0.m0 r0 = sf0.C101600m0.f297433b
            r0.mo141077e(r2)
            nj.g$a r7 = new nj.g$a
            r7.<init>()
            if (r19 == 0) goto L_0x0198
            int r0 = r19.size()
            if (r0 <= 0) goto L_0x0198
            java.util.Set r0 = r19.entrySet()
            java.util.Iterator r8 = r0.iterator()
            r0 = 0
        L_0x003f:
            boolean r9 = r8.hasNext()
            r10 = 3
            if (r9 == 0) goto L_0x0173
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r11 = r9.getKey()
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r9 = r9.getValue()
            zh3.f$b r9 = (zh3.C91753f.C66827b) r9
            r12 = 0
            java.lang.String[] r13 = r9.mo6410a()
            if (r13 != 0) goto L_0x006b
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r5] = r11
            r10[r6] = r9
            java.lang.String r9 = "factory.getSQLs() is null! %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r9, r10)
            goto L_0x00da
        L_0x006b:
            if (r20 != 0) goto L_0x00dd
            boolean r13 = r1.f251816n
            if (r13 != 0) goto L_0x00dd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String[] r13 = r9.mo6410a()
            int r14 = r13.length
            r15 = 0
        L_0x007c:
            if (r15 >= r14) goto L_0x008b
            r16 = r13[r15]
            int r3 = r16.hashCode()
            r12.append(r3)
            int r15 = r15 + 1
            r3 = 2
            goto L_0x007c
        L_0x008b:
            java.lang.String r3 = r12.toString()
            byte[] r3 = r3.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r3 = r1.f251815m
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r3.get(r11)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r5] = r11
            r10[r6] = r3
            r13 = 2
            r10[r13] = r12
            java.lang.String r13 = "Create tables on %s(%s) compare with %s, using table versions"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r10)
            if (r3 == 0) goto L_0x00dd
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L_0x00dd
            goto L_0x00da
        L_0x00b8:
            com.tencent.mm.storage.c5 r3 = r1.f251814l
            if (r3 == 0) goto L_0x00dd
            int r13 = r11.intValue()
            java.lang.String r3 = r3.mo57621jo(r13)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r5] = r11
            r10[r6] = r3
            r13 = 2
            r10[r13] = r12
            java.lang.String r13 = "Create tables on %s(%s) compare with %s, using table versions storage"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r10)
            if (r3 == 0) goto L_0x00dd
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L_0x00dd
        L_0x00da:
            r3 = 2
            goto L_0x003f
        L_0x00dd:
            r18.mo183809a()
            java.lang.String[] r3 = r9.mo6410a()
            int r9 = r3.length
            r10 = r0
            r13 = 0
        L_0x00e7:
            if (r13 >= r9) goto L_0x014e
            r14 = r3[r13]
            r2.mo183812e(r14)     // Catch:{ Exception -> 0x00f1 }
            int r10 = r10 + 1
            goto L_0x0147
        L_0x00f1:
            r0 = move-exception
            r15 = r0
            java.util.regex.Pattern r0 = zh3.C91752a.f262802h
            java.util.regex.Matcher r0 = r0.matcher(r14)
            java.lang.String r6 = "]"
            java.lang.String r5 = "]["
            java.lang.String r2 = "CreateTable failed:["
            if (r0 == 0) goto L_0x0128
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0128
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r14)
            r0.append(r5)
            java.lang.String r2 = r15.getMessage()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2 = 0
            junit.framework.Assert.assertTrue(r0, r2)
            goto L_0x0147
        L_0x0128:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r14)
            r0.append(r5)
            java.lang.String r2 = r15.getMessage()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x0147:
            int r13 = r13 + 1
            r2 = r18
            r5 = 0
            r6 = 1
            goto L_0x00e7
        L_0x014e:
            r18.mo183811d()
            if (r20 != 0) goto L_0x016b
            boolean r0 = r1.f251816n
            if (r0 != 0) goto L_0x016b
            com.tencent.mm.storage.c5 r0 = r1.f251814l
            if (r0 == 0) goto L_0x016b
            if (r12 == 0) goto L_0x016b
            int r2 = r11.intValue()
            r0.mo57620Lo(r2, r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r0 = r1.f251815m
            if (r0 == 0) goto L_0x016b
            r0.put(r11, r12)
        L_0x016b:
            r2 = r18
            r0 = r10
            r3 = 2
            r5 = 0
            r6 = 1
            goto L_0x003f
        L_0x0173:
            long r2 = r7.mo72288a()
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r5[r3] = r2
            long r2 = r7.mo72288a()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r5[r3] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r5[r2] = r0
            java.lang.String r0 = "createtables end sql:%d trans:%d sqlCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r5)
            goto L_0x0199
        L_0x0198:
            r3 = 1
        L_0x0199:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C86744o.mo121138d(zh3.e, java.util.HashMap, boolean):boolean");
    }

    /* renamed from: f */
    public String mo121139f() {
        return this.f251807e + "MicroMsg.db";
    }

    /* renamed from: g */
    public String mo121140g() {
        return this.f251807e + "EnMicroMsg.db";
    }

    /* renamed from: h */
    public String mo121141h() {
        return this.f251807e;
    }

    /* renamed from: i */
    public C85801v1 mo121142i() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        return this.f251812j;
    }

    /* renamed from: j */
    public C91753f mo121143j() {
        return this.f251811i;
    }

    /* renamed from: k */
    public C85796t4 mo121144k() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        return this.f251813k;
    }

    /* renamed from: l */
    public C85798u1 mo121145l() {
        return this.f251803a;
    }

    /* renamed from: m */
    public boolean mo121146m() {
        String o = mo121148o();
        if (o == null) {
            return false;
        }
        Log.m105924i("MMKernel.CoreStorage", "hasCorruptedDB : " + o);
        return true;
    }

    /* renamed from: n */
    public boolean mo121147n() {
        boolean startsWith = this.f251805c.startsWith(C112760b.m154230f0());
        long nowMilliSecond = Util.nowMilliSecond();
        long j = nowMilliSecond - this.f251821s;
        if (startsWith) {
            C86709a0.m107528h();
            if (C86709a0.m107523b().mo121114l() && j > 0 && j < 2000) {
                Uri n = C116299g2.m163858n(this.f251805c);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    return true;
                }
            }
        }
        this.f251821s = nowMilliSecond;
        boolean b = C88955f.m111058b();
        C86709a0.m107528h();
        Log.m105925i("MMKernel.CoreStorage", "isSDCardAvail:%b uin:%s toNow:%d sysPath:[%s] sdRoot:[%s], acc init:[%b]", Boolean.valueOf(b), C77710q.m93738a(C86709a0.m107523b().mo121110g()), Long.valueOf(j), this.f251805c, C112760b.m154230f0(), Boolean.valueOf(C86709a0.m107523b().mo121114l()));
        if (!b) {
            return false;
        }
        if (startsWith) {
            return true;
        }
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            Log.m105924i("MMKernel.CoreStorage", "summer isSDCardAvailable accHasReady and remount");
            mo121149q();
        }
        return true;
    }

    /* renamed from: o */
    public String mo121148o() {
        C86009m1 m1Var = new C86009m1(this.f251807e + "/ctest", "EnMicroMsg.db");
        if (m1Var.mo119978p()) {
            return m1Var.mo119971i();
        }
        C86009m1 m1Var2 = new C86009m1(this.f251807e + "/corrupted", "EnMicroMsg.db");
        if (m1Var2.mo119978p()) {
            return m1Var2.mo119971i();
        }
        String[] t = new C86009m1(this.f251807e).mo119982t(new C75679a(this));
        if (t == null || t.length <= 0) {
            return null;
        }
        String str = t[0];
        for (int i = 1; i < t.length; i++) {
            String str2 = t[i];
            if (str2.compareTo(str) > 0) {
                str = str2;
            }
        }
        return this.f251807e + XVFSFile.SEPARATOR_CHAR + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0121, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121149q() {
        /*
            r11 = this;
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            byte[] r1 = r0.f251752c
            monitor-enter(r1)
            boolean r2 = p206nj.C88955f.m111058b()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = m107605a()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "MMKernel.CoreStorage"
            java.lang.String r5 = "remount begin uin:%d oldpath:[%s] newPath:[%s] init:[%b]"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            int r0 = r0.mo121110g()     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0122 }
            r7 = 0
            r6[r7] = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r11.f251805c     // Catch:{ all -> 0x0122 }
            r8 = 1
            r6[r8] = r0     // Catch:{ all -> 0x0122 }
            r0 = 2
            r6[r0] = r3     // Catch:{ all -> 0x0122 }
            r9 = 3
            f40.e r10 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0122 }
            boolean r10 = r10.mo121114l()     // Catch:{ all -> 0x0122 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0122 }
            r6[r9] = r10     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ all -> 0x0122 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x0122 }
            if (r4 != 0) goto L_0x0120
            java.lang.String r4 = r11.f251805c     // Catch:{ all -> 0x0122 }
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ all -> 0x0122 }
            if (r4 == 0) goto L_0x00bf
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069 }
            r2.<init>()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = "testSdcardWritable done ret:"
            r2.append(r3)     // Catch:{ Exception -> 0x0069 }
            boolean r3 = m107609u()     // Catch:{ Exception -> 0x0069 }
            r2.append(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0085
        L_0x0069:
            r0 = move-exception
            java.lang.String r2 = "MMKernel.CoreStorage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "testSdcardWritable Exception e: "
            r3.append(r4)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0122 }
            r3.append(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ all -> 0x0122 }
        L_0x0085:
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            r2.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "testSdcardReadable done ret:"
            r2.append(r3)     // Catch:{ Exception -> 0x00a1 }
            boolean r3 = m107608t()     // Catch:{ Exception -> 0x00a1 }
            r2.append(r3)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00bd
        L_0x00a1:
            r0 = move-exception
            java.lang.String r2 = "MMKernel.CoreStorage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "testSdcardReadable Exception e: "
            r3.append(r4)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0122 }
            r3.append(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ all -> 0x0122 }
        L_0x00bd:
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            return
        L_0x00bf:
            if (r2 == 0) goto L_0x00cd
            java.lang.String r4 = a70.C112760b.m154230f0()     // Catch:{ all -> 0x0122 }
            boolean r4 = r3.startsWith(r4)     // Catch:{ all -> 0x0122 }
            if (r4 == 0) goto L_0x00cd
            r4 = 1
            goto L_0x00ce
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0122 }
            com.tencent.mm.vfs.f0$b r5 = r5.mo177789b()     // Catch:{ all -> 0x0122 }
            java.lang.String r6 = r11.f251809g     // Catch:{ all -> 0x0122 }
            java.lang.String r9 = r11.f251808f     // Catch:{ all -> 0x0122 }
            boolean r6 = r6.equals(r9)     // Catch:{ all -> 0x0122 }
            if (r6 != 0) goto L_0x00e0
            r6 = 1
            goto L_0x00e1
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            com.tencent.p014mm.vfs.VFSStrategy.m163782j(r5, r4, r6)     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.vfs.VFSStrategy.m163780h(r5, r3, r4)     // Catch:{ all -> 0x0122 }
            java.lang.String r6 = "accountSd"
            if (r4 == 0) goto L_0x00f6
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = r11.f251809g     // Catch:{ all -> 0x0122 }
            r0[r7] = r4     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = r11.f251808f     // Catch:{ all -> 0x0122 }
            r0[r8] = r4     // Catch:{ all -> 0x0122 }
            goto L_0x00fc
        L_0x00f6:
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = r11.f251808f     // Catch:{ all -> 0x0122 }
            r0[r7] = r4     // Catch:{ all -> 0x0122 }
        L_0x00fc:
            com.tencent.mm.vfs.v0 r4 = r5.f348981a     // Catch:{ all -> 0x0122 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f349109e     // Catch:{ all -> 0x0122 }
            r4.put(r6, r0)     // Catch:{ all -> 0x0122 }
            r5.f348982b = r8     // Catch:{ all -> 0x0122 }
            r5.mo177801a()     // Catch:{ all -> 0x0122 }
            r11.mo121151s(r3, r2)     // Catch:{ all -> 0x0122 }
            h40.c r0 = h40.C87424c.f253334g     // Catch:{ all -> 0x0122 }
            r0.mo121845a()     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r3 = "remout isSDCardAvail :[%b] done"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x0122 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0122 }
            r4[r7] = r2     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ all -> 0x0122 }
        L_0x0120:
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            return
        L_0x0122:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C86744o.mo121149q():void");
    }

    /* renamed from: r */
    public final void mo121150r() {
        C87424c cVar = C87424c.f253334g;
        String str = this.f251806d;
        cVar.getClass();
        Context context = MMApplicationContext.getContext();
        C31887k0 k0Var = C31887k0.INSTANCE;
        k0Var.mo58409b(context);
        ArrayList arrayList = new ArrayList();
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C31887k0.C31891d.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C119179t tVar = C119157j.f356862d;
            C31893m0 m0Var = new C31893m0(k0Var, (C38174i) bVar.next(), str);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            arrayList.add(jVar.mo183878i(m0Var, 0));
        }
        C79753e.m96889a(arrayList);
        C86009m1 m1Var = new C86009m1(this.f251806d + FilePathGenerator.NO_MEDIA_FILENAME);
        if (!m1Var.mo119967g()) {
            try {
                m1Var.mo119964e();
            } catch (IOException e) {
                Log.m105921e("MMKernel.CoreStorage", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* renamed from: s */
    public final void mo121151s(String str, boolean z) {
        boolean z2 = false;
        Log.m105925i("MMKernel.CoreStorage", "remount resetSysPath sysPath:[%s] newSysPath:[%s] accPath:[%s] cachePath: [%s]", this.f251805c, str, this.f251806d, this.f251807e);
        if (!Util.isNullOrNil(str)) {
            this.f251806d.substring(this.f251805c.length());
            this.f251805c = str;
            if (z && str.startsWith(C112760b.m154230f0())) {
                z2 = true;
            }
            this.f251810h = z2 ? this.f251809g : this.f251808f;
            this.f251806d = this.f251805c + this.f251810h + "/";
            mo121150r();
        }
    }
}
