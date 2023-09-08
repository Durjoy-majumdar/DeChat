package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.FilesCopy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import js0.C9514m;
import s24.C90124b;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0 */
public class C81439t0 extends C81461w {

    /* renamed from: d */
    public final String f238992d;

    /* renamed from: e */
    public final String f238993e;

    /* renamed from: f */
    public volatile long f238994f = -1;

    /* renamed from: g */
    public C81418k0 f238995g = null;

    /* renamed from: h */
    public final C81459r f238996h = new C81448h(this);

    /* renamed from: i */
    public final C81459r f238997i = new C81449i(this);

    /* renamed from: j */
    public final C81458q f238998j = new C81450j(this);

    /* renamed from: n */
    public final C81458q f238999n = new C81451k();

    /* renamed from: o */
    public final C81458q f239000o = new C81452l(this);

    /* renamed from: p */
    public final C81458q f239001p = new C81454m();

    /* renamed from: q */
    public final C81458q f239002q = new C81455n(this);

    /* renamed from: r */
    public final C81458q f239003r = new C81456o();

    /* renamed from: s */
    public final C81459r f239004s = new C81457p(this);

    /* renamed from: t */
    public final C81458q f239005t = new C81440a(this);

    /* renamed from: u */
    public final C81458q f239006u = new C81441b(this);

    /* renamed from: v */
    public final C81458q f239007v = new C81443c();

    /* renamed from: w */
    public final C81458q f239008w = new C81444d(this);

    /* renamed from: x */
    public final C81458q f239009x = new C81445e();

    /* renamed from: y */
    public final C81458q f239010y = new C81447g(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$a */
    public class C81440a implements C81458q {
        public C81440a(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            if (!m1Var.mo119967g()) {
                return C81410b0.RET_NOT_EXISTS;
            }
            int vfsStat = FileStat.vfsStat(m1Var.mo119976n(), objArr[0]);
            if (vfsStat != 0) {
                Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "stat err %d, %s", Integer.valueOf(vfsStat), m1Var.mo119976n());
            }
            return vfsStat == 0 ? C81410b0.OK : C81410b0.ERR_OP_FAIL;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$b */
    public class C81441b implements C81458q {

        /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$b$a */
        public class C81442a implements C86011o1 {

            /* renamed from: a */
            public final /* synthetic */ String f239011a;

            /* renamed from: b */
            public final /* synthetic */ List f239012b;

            public C81442a(C81441b bVar, String str, List list) {
                this.f239011a = str;
                this.f239012b = list;
            }

            public boolean accept(C86009m1 m1Var) {
                boolean z = !m1Var.getName().endsWith(FilePathGenerator.NO_MEDIA_FILENAME);
                if (z && !m1Var.mo119977o()) {
                    C81432q0 q0Var = new C81432q0(C81412d0.m99874h(m1Var.mo119971i().replaceFirst(this.f239011a, "")));
                    FileStat.vfsStat(m1Var.mo119971i(), q0Var);
                    this.f239012b.add(q0Var);
                }
                return z;
            }
        }

        public C81441b(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            if (!m1Var.mo119977o()) {
                return C81410b0.ERR_NOT_SUPPORTED;
            }
            C81412d0.m99873g(m1Var, new C81442a(this, Pattern.quote(m1Var.mo119971i()), objArr[0]));
            return C81410b0.OK;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$c */
    public class C81443c implements C81458q {
        public C81443c() {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            C81410b0 b0Var = C81410b0.ERR_OP_FAIL;
            C81410b0 b0Var2 = C81410b0.OK;
            C86009m1 m1Var2 = objArr[0];
            boolean booleanValue = objArr[1].booleanValue();
            if (m1Var.mo119977o()) {
                return C81410b0.RET_ALREADY_EXISTS;
            }
            if (C81412d0.m99867a(m1Var)) {
                return C81410b0.ERR_SYMLINK;
            }
            if (C81439t0.this.f238994f > 0 && C81439t0.this.mo113754c() + m1Var2.mo119980r() > C81439t0.this.f238994f) {
                return C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE;
            }
            if (!booleanValue) {
                return FilesCopy.copy(m1Var2.mo119971i(), m1Var.mo119971i(), false) ? b0Var2 : b0Var;
            }
            try {
                return C81409a0.m99866a(m1Var2.mo119971i(), m1Var.mo119971i()) ? b0Var2 : b0Var;
            } catch (ErrnoException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.FileMove", e, "handleFileMoveErrnoException", new Object[0]);
                return e.errno == OsConstants.ENAMETOOLONG ? C81410b0.ERR_NAME_TOO_LONG : b0Var;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$d */
    public class C81444d implements C81458q {
        public C81444d(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            objArr[0].f29691a = m1Var;
            return C81410b0.OK;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$e */
    public class C81445e implements C81458q {
        public C81445e() {
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0106=Splitter:B:58:0x0106, B:29:0x00a8=Splitter:B:29:0x00a8} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 mo113757a(com.tencent.p014mm.vfs.C86009m1 r11, java.lang.Object... r12) {
            /*
                r10 = this;
                java.lang.String r0 = "MicroMsg.LuggageNonFlattenedFileSystem"
                java.lang.String r1 = "LuggageNonFlattenedFileSystem#unzipFile"
                boolean r2 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99867a(r11)
                if (r2 == 0) goto L_0x000d
                com.tencent.mm.plugin.appbrand.appstorage.b0 r11 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_SYMLINK
                return r11
            L_0x000d:
                boolean r2 = r11.mo119978p()
                if (r2 == 0) goto L_0x001c
                boolean r2 = r11.mo119967g()
                if (r2 == 0) goto L_0x001c
                com.tencent.mm.plugin.appbrand.appstorage.b0 r11 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.RET_ALREADY_EXISTS
                return r11
            L_0x001c:
                long r2 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                r4 = 0
                r12 = r12[r4]     // Catch:{ all -> 0x011b }
                com.tencent.mm.vfs.m1 r12 = (com.tencent.p014mm.vfs.C86009m1) r12     // Catch:{ all -> 0x011b }
                java.lang.String r5 = r12.mo119971i()     // Catch:{ all -> 0x011b }
                java.lang.String r6 = r11.mo119971i()     // Catch:{ all -> 0x011b }
                r7 = 0
                int r5 = com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI.vfsUnzip(r5, r6, r7)     // Catch:{ all -> 0x011b }
                java.lang.String r6 = "unzip zipFile(%s) iRet(%d)"
                r7 = 2
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x011b }
                java.lang.String r12 = r12.mo119971i()     // Catch:{ all -> 0x011b }
                r8[r4] = r12     // Catch:{ all -> 0x011b }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x011b }
                r4 = 1
                r8[r4] = r12     // Catch:{ all -> 0x011b }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r8)     // Catch:{ all -> 0x011b }
                if (r5 != 0) goto L_0x00bd
                com.tencent.mm.plugin.appbrand.appstorage.t0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.k0 r4 = r12.f238995g     // Catch:{ all -> 0x011b }
                if (r4 == 0) goto L_0x007a
                java.lang.String r12 = r12.f238992d     // Catch:{ all -> 0x011b }
                java.lang.String r5 = ""
                long r4 = r4.mo113736b(r12, r5)     // Catch:{ all -> 0x011b }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x011b }
                r12.<init>()     // Catch:{ all -> 0x011b }
                java.lang.String r6 = "unzipFile: AppBrandStorageSpaceMonitorService size="
                r12.append(r6)     // Catch:{ all -> 0x011b }
                r12.append(r4)     // Catch:{ all -> 0x011b }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x011b }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ all -> 0x011b }
                r6 = -1
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x007e
                com.tencent.mm.plugin.appbrand.appstorage.t0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this     // Catch:{ all -> 0x011b }
                long r4 = r12.mo113754c()     // Catch:{ all -> 0x011b }
                goto L_0x007e
            L_0x007a:
                long r4 = r12.mo113754c()     // Catch:{ all -> 0x011b }
            L_0x007e:
                com.tencent.mm.plugin.appbrand.appstorage.t0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this     // Catch:{ all -> 0x011b }
                long r6 = r12.f238994f     // Catch:{ all -> 0x011b }
                r8 = 0
                int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r12 <= 0) goto L_0x00a8
                com.tencent.mm.plugin.appbrand.appstorage.t0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this     // Catch:{ all -> 0x011b }
                long r6 = r12.f238994f     // Catch:{ all -> 0x011b }
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 <= 0) goto L_0x00a8
                com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99872f(r11)     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x00a7
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x00a7:
                return r12
            L_0x00a8:
                com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x00bc
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x00bc:
                return r12
            L_0x00bd:
                r12 = -1
                if (r5 == r12) goto L_0x0106
                if (r5 == r4) goto L_0x00f1
                if (r5 == r7) goto L_0x0106
                switch(r5) {
                    case -106: goto L_0x00dc;
                    case -105: goto L_0x0106;
                    case -104: goto L_0x0106;
                    case -103: goto L_0x0106;
                    case -102: goto L_0x0106;
                    default: goto L_0x00c7;
                }
            L_0x00c7:
                com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x00db
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x00db:
                return r12
            L_0x00dc:
                com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_WRITE_ZIP_ENTRY     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x00f0
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x00f0:
                return r12
            L_0x00f1:
                com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_PERMISSION_DENIED     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x0105
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x0105:
                return r12
            L_0x0106:
                com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_BAD_ZIP_FILE     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x011a
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x011a:
                return r12
            L_0x011b:
                r12 = move-exception
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.this
                com.tencent.mm.plugin.appbrand.appstorage.k0 r0 = r0.f238995g
                if (r0 == 0) goto L_0x012e
                java.lang.String r4 = r11.mo119971i()
                long r5 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r11)
                long r5 = r5 - r2
                r0.mo113735a(r4, r5, r1)
            L_0x012e:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.C81445e.mo113757a(com.tencent.mm.vfs.m1, java.lang.Object[]):com.tencent.mm.plugin.appbrand.appstorage.b0");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$f */
    public class C81446f implements C81458q {

        /* renamed from: a */
        public final /* synthetic */ C86009m1 f239015a;

        /* renamed from: b */
        public final /* synthetic */ C9514m f239016b;

        /* renamed from: c */
        public final /* synthetic */ String f239017c;

        public C81446f(C86009m1 m1Var, C9514m mVar, String str) {
            this.f239015a = m1Var;
            this.f239016b = mVar;
            this.f239017c = str;
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            C81410b0 b0Var = C81410b0.ERR_OP_FAIL;
            long r = m1Var.mo119980r();
            long r2 = this.f239015a.mo119980r();
            m1Var.mo119966f();
            try {
                if (!C81409a0.m99866a(this.f239015a.mo119971i(), m1Var.mo119971i())) {
                    return b0Var;
                }
                C9514m mVar = this.f239016b;
                if (mVar != null) {
                    mVar.f29691a = this.f239017c;
                }
                C81418k0 k0Var = C81439t0.this.f238995g;
                if (k0Var != null) {
                    k0Var.mo113738d(this.f239015a.mo119976n(), this.f239015a.mo119980r() - r2, "LuggageNonFlattenedFileSystem#saveFile");
                    C81439t0.this.f238995g.mo113738d(m1Var.mo119976n(), m1Var.mo119980r() - r, "LuggageNonFlattenedFileSystem#saveFile");
                }
                return C81410b0.OK;
            } catch (ErrnoException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.FileMove", e, "handleFileMoveErrnoException", new Object[0]);
                return e.errno == OsConstants.ENAMETOOLONG ? C81410b0.ERR_NAME_TOO_LONG : b0Var;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$g */
    public class C81447g implements C81458q {
        public C81447g(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            C81410b0 b0Var = C81410b0.RET_NOT_EXISTS;
            C9514m mVar = objArr[0];
            if (!m1Var.mo119967g()) {
                return b0Var;
            }
            if (!m1Var.mo119978p()) {
                return C81410b0.ERR_PERMISSION_DENIED;
            }
            if (C81412d0.m99867a(m1Var)) {
                return C81410b0.ERR_SYMLINK;
            }
            try {
                mVar.f29691a = C86013q1.m106422D(m1Var);
                return C81410b0.OK;
            } catch (FileNotFoundException unused) {
                return b0Var;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$h */
    public class C81448h extends C81459r {
        public C81448h(C81439t0 t0Var) {
            super(t0Var, (C81448h) null);
        }

        /* renamed from: b */
        public C81410b0 mo113758b(C86009m1 m1Var) {
            return m1Var.mo119967g() ? C81410b0.OK : C81410b0.RET_NOT_EXISTS;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$i */
    public class C81449i extends C81459r {
        public C81449i(C81439t0 t0Var) {
            super(t0Var, (C81448h) null);
        }

        /* renamed from: b */
        public C81410b0 mo113758b(C86009m1 m1Var) {
            return !m1Var.mo119967g() ? C81410b0.RET_NOT_EXISTS : m1Var.mo119977o() ? C81410b0.OK : C81410b0.ERR_IS_FILE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$j */
    public class C81450j implements C81458q {
        public C81450j(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            return m1Var.mo119967g() ? C81410b0.RET_ALREADY_EXISTS : (!objArr[0].booleanValue() ? !m1Var.mo119987x() : !m1Var.mo119987x()) ? C81410b0.ERR_OP_FAIL : C81410b0.OK;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$k */
    public class C81451k implements C81458q {
        public C81451k() {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            C81410b0 b0Var = C81410b0.OK;
            C81410b0 b0Var2 = C81410b0.ERR_OP_FAIL;
            C81410b0 b0Var3 = C81410b0.ERR_DIR_NOT_EMPTY;
            if (m1Var.mo119978p() || !m1Var.mo119967g()) {
                return C81410b0.RET_NOT_EXISTS;
            }
            if (m1Var.equals(C81439t0.this.mo113753b())) {
                return C81410b0.ERR_PERMISSION_DENIED;
            }
            if (objArr[0].booleanValue()) {
                Log.m105918d("MicroMsg.LuggageNonFlattenedFileSystem", "rmdir recursive");
                try {
                    C81412d0.m99872f(m1Var);
                    return b0Var;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "rmdir recursive exp = %s", e);
                    return b0Var2;
                }
            } else {
                C86009m1[] u = m1Var.mo119984u();
                if (u.length > 0) {
                    if (u.length != 1 || !u[0].getName().equals(FilePathGenerator.NO_MEDIA_FILENAME)) {
                        return b0Var3;
                    }
                    u[0].mo119966f();
                }
                return m1Var.mo119966f() ? b0Var : b0Var2;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$l */
    public class C81452l implements C81458q {

        /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$l$a */
        public class C81453a implements C86011o1 {

            /* renamed from: a */
            public final /* synthetic */ String f239020a;

            /* renamed from: b */
            public final /* synthetic */ List f239021b;

            public C81453a(C81452l lVar, String str, List list) {
                this.f239020a = str;
                this.f239021b = list;
            }

            public boolean accept(C86009m1 m1Var) {
                boolean z = !m1Var.getName().endsWith(FilePathGenerator.NO_MEDIA_FILENAME);
                if (z) {
                    C81463z zVar = new C81463z();
                    zVar.f239026a = C81412d0.m99874h(m1Var.mo119971i().replaceFirst(this.f239020a, ""));
                    this.f239021b.add(zVar);
                }
                return z;
            }
        }

        public C81452l(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            if (!m1Var.mo119977o()) {
                return C81410b0.ERR_IS_FILE;
            }
            if (C81412d0.m99867a(m1Var)) {
                return C81410b0.ERR_SYMLINK;
            }
            T linkedList = new LinkedList();
            m1Var.mo119985v(new C81453a(this, Pattern.quote(m1Var.mo119971i()), linkedList));
            objArr[0].f29691a = linkedList;
            return C81410b0.OK;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$m */
    public class C81454m implements C81458q {
        public C81454m() {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            Long l;
            C81410b0 b0Var = C81410b0.OK;
            C9514m mVar = objArr[0];
            Long l2 = null;
            if (objArr.length >= 3) {
                l2 = objArr[1];
                l = objArr[2];
            } else {
                l = null;
            }
            if (!m1Var.mo119967g()) {
                return C81410b0.RET_NOT_EXISTS;
            }
            if (!m1Var.mo119978p()) {
                return C81410b0.ERR_PERMISSION_DENIED;
            }
            if (C81412d0.m99867a(m1Var)) {
                return C81410b0.ERR_SYMLINK;
            }
            if (mVar != null) {
                if (l2 == null || l == null) {
                    mVar.f29691a = C81412d0.m99870d(m1Var, 0, -1);
                } else {
                    if (l.longValue() == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                        l = Long.valueOf(m1Var.mo119980r() - l2.longValue());
                    }
                    C81410b0 a = C81439t0.this.mo113759a(l2.longValue(), l.longValue(), m1Var.mo119980r());
                    if (a != b0Var) {
                        return a;
                    }
                    mVar.f29691a = C81412d0.m99870d(m1Var, l2.longValue(), l.longValue());
                }
            }
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$n */
    public class C81455n implements C81458q {
        public C81455n(C81439t0 t0Var) {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            long j;
            long j2;
            String str;
            C9514m mVar = objArr[0];
            if (objArr.length >= 4) {
                long longValue = objArr[2].longValue();
                j = objArr[3].longValue();
                j2 = longValue;
                str = objArr[1];
            } else {
                j = Long.MAX_VALUE;
                str = null;
                j2 = 0;
            }
            return !m1Var.mo119967g() ? C81410b0.RET_NOT_EXISTS : !m1Var.mo119978p() ? C81410b0.ERR_PERMISSION_DENIED : C81412d0.m99867a(m1Var) ? C81410b0.ERR_SYMLINK : mVar != null ? C81412d0.m99871e(m1Var.mo119971i(), mVar, str, j2, j) : C81410b0.OK;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$o */
    public class C81456o implements C81458q {
        public C81456o() {
        }

        /* renamed from: a */
        public C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            C81410b0 b0Var = C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE;
            C81410b0 b0Var2 = C81410b0.OK;
            C81410b0 b0Var3 = C81410b0.ERR_OP_FAIL;
            if (C81412d0.m99867a(m1Var)) {
                return C81410b0.ERR_SYMLINK;
            }
            InputStream inputStream = objArr[0];
            boolean booleanValue = objArr[1].booleanValue();
            if (inputStream instanceof ZipInputStream) {
                if (C81412d0.m99876j((ZipInputStream) inputStream, m1Var.mo119971i()) != 0) {
                    return b0Var3;
                }
                if (C81439t0.this.f238994f <= 0 || C81439t0.this.mo113754c() <= C81439t0.this.f238994f) {
                    return b0Var2;
                }
                m1Var.mo119966f();
                return b0Var;
            } else if (m1Var.mo119977o()) {
                return C81410b0.RET_ALREADY_EXISTS;
            } else {
                if (C81439t0.this.f238994f > 0) {
                    try {
                        if (C81439t0.this.mo113754c() + ((long) inputStream.available()) > C81439t0.this.f238994f) {
                            return b0Var;
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "writeFile, access available e=%s", e);
                        return b0Var3;
                    }
                }
                if (!m1Var.mo119967g() && booleanValue) {
                    return C81410b0.RET_NOT_EXISTS;
                }
                OutputStream outputStream = null;
                try {
                    outputStream = C86013q1.m106429K(m1Var.mo119971i(), booleanValue);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 4096);
                        if (read != -1) {
                            outputStream.write(bArr, 0, read);
                        } else {
                            outputStream.flush();
                            return b0Var2;
                        }
                    }
                } catch (Exception e2) {
                    Log.m105925i("MicroMsg.LuggageNonFlattenedFileSystem", "writeFile exp %s", e2);
                    return b0Var3;
                } finally {
                    Util.qualityClose(outputStream);
                    Util.qualityClose(inputStream);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$p */
    public class C81457p extends C81459r {
        public C81457p(C81439t0 t0Var) {
            super(t0Var, (C81448h) null);
        }

        /* renamed from: b */
        public C81410b0 mo113758b(C86009m1 m1Var) {
            if (m1Var.mo119977o()) {
                return C81410b0.ERR_IS_DIRECTORY;
            }
            if (!m1Var.mo119967g()) {
                return C81410b0.RET_NOT_EXISTS;
            }
            int vfsUnlink = FileUnlink.vfsUnlink(m1Var.mo119976n());
            if (vfsUnlink != 0) {
                Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "unlink err %d, %s", Integer.valueOf(vfsUnlink), m1Var.mo119976n());
            }
            return vfsUnlink == 0 ? C81410b0.OK : C81410b0.ERR_OP_FAIL;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$q */
    public interface C81458q {
        /* renamed from: a */
        C81410b0 mo113757a(C86009m1 m1Var, Object... objArr);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t0$r */
    public abstract class C81459r implements C81458q {
        public C81459r(C81439t0 t0Var, C81448h hVar) {
        }

        /* renamed from: a */
        public final C81410b0 mo113757a(C86009m1 m1Var, Object... objArr) {
            return mo113758b(m1Var);
        }

        /* renamed from: b */
        public abstract C81410b0 mo113758b(C86009m1 m1Var);
    }

    public C81439t0(String str, String str2) {
        this.f238992d = str;
        this.f238993e = str2;
        Log.m105925i("MicroMsg.LuggageNonFlattenedFileSystem", "mRootPath:%s mPathPrefix:%s", str, str2);
    }

    public boolean accept(String str) {
        return Util.nullAsNil(str).startsWith(this.f238993e);
    }

    public C81410b0 access(String str) {
        return mo113756d(str, this.f238996h, false, new Object[0]);
    }

    /* renamed from: b */
    public final C86009m1 mo113753b() {
        if (TextUtils.isEmpty(this.f238992d)) {
            return null;
        }
        C86009m1 m1Var = new C86009m1(this.f238992d);
        if (m1Var.mo119967g() && m1Var.mo119978p()) {
            m1Var.mo119966f();
        }
        m1Var.mo119987x();
        try {
            new C86009m1(m1Var.mo119976n() + "/.nomedia").mo119964e();
        } catch (Exception unused) {
        }
        return m1Var;
    }

    /* renamed from: c */
    public final long mo113754c() {
        return C81412d0.m99869c(new C86009m1(this.f238992d));
    }

    public void cleanupDirectory() {
        C86009m1 m1Var = new C86009m1(this.f238992d);
        C81412d0.m99872f(m1Var);
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
    }

    public C81410b0 copyTo(String str, C86009m1 m1Var, boolean z) {
        return mo113756d(str, this.f239007v, false, m1Var, Boolean.valueOf(z));
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        return C81410b0.ERR_NOT_SUPPORTED;
    }

    /* renamed from: d */
    public final C81410b0 mo113756d(String str, C81458q qVar, boolean z, Object... objArr) {
        String str2;
        boolean z2;
        C81410b0 b0Var = C81410b0.ERR_PERMISSION_DENIED;
        if (Util.isNullOrNil(str)) {
            return b0Var;
        }
        if (this.f238993e.endsWith("/")) {
            str2 = this.f238993e;
        } else {
            str2 = this.f238993e + "/";
        }
        if (str.equals(this.f238993e)) {
            str = str2;
        } else if (!str.startsWith(str2)) {
            return b0Var;
        }
        String replace = C81412d0.m99874h(str.replaceFirst(Pattern.quote(this.f238993e), "")).replace("\u0000", "");
        C86009m1 b = mo113753b();
        if (b == null) {
            return C81410b0.ERR_FS_NOT_MOUNTED;
        }
        String a = C90124b.m112766a(b.mo119971i(), replace);
        if (Util.isNullOrNil(a)) {
            return b0Var;
        }
        C86009m1 m1Var = new C86009m1(a);
        C86009m1 b2 = mo113753b();
        boolean z3 = false;
        if (b2 != null) {
            C86009m1 m1Var2 = m1Var;
            while (true) {
                if (m1Var2 == null) {
                    z2 = false;
                    break;
                } else if (b2.equals(m1Var2)) {
                    z2 = true;
                    break;
                } else {
                    m1Var2 = m1Var2.mo119974l();
                }
            }
            if (z2) {
                z3 = true;
            }
        }
        return !z3 ? b0Var : (z || m1Var.mo119974l().mo119967g()) ? qVar.mo113757a(m1Var, objArr) : C81410b0.ERR_PARENT_DIR_NOT_EXISTS;
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        C9514m mVar = new C9514m();
        mo113756d(str, this.f239008w, false, mVar);
        C86009m1 m1Var = (C86009m1) mVar.f29691a;
        if (m1Var == null) {
            Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), get null file", str);
            return null;
        } else if (!m1Var.mo119967g()) {
            Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), file not exists", str);
            return null;
        } else if (!z && !m1Var.mo119978p()) {
            Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), not a file", str);
            return null;
        } else if (!C81412d0.m99867a(m1Var)) {
            return m1Var;
        } else {
            Log.m105921e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), symlink file", str);
            return null;
        }
    }

    public List<C81415h0.C81416a> getSavedFileList() {
        return null;
    }

    public C81418k0 getStorageSpaceStatistics() {
        return this.f238995g;
    }

    public C81410b0 getTempDirectory(C9514m<String> mVar) {
        return C81410b0.ERR_NOT_SUPPORTED;
    }

    public void initialize() {
        C86009m1 b = mo113753b();
        if (b == null || !b.mo119967g()) {
            Log.m105920e("MicroMsg.LuggageNonFlattenedFileSystem", "Initialization Failed");
        }
    }

    public C81410b0 isdir(String str) {
        return mo113756d(str, this.f238997i, false, new Object[0]);
    }

    public C81410b0 mkdir(String str, boolean z) {
        return mo113756d(str, this.f238998j, z, Boolean.valueOf(z));
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        return mo113756d(str, this.f239000o, false, mVar);
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        return mo113756d(str, this.f239001p, false, mVar);
    }

    public final InputStream readStream(String str) {
        C9514m mVar = new C9514m();
        if (C81410b0.OK == mo113756d(str, this.f239010y, false, mVar)) {
            return (InputStream) mVar.f29691a;
        }
        return null;
    }

    public C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2) {
        return mo113756d(str, this.f239002q, false, mVar, str2, Long.valueOf(j), Long.valueOf(j2));
    }

    public void release() {
    }

    public C81410b0 rmdir(String str, boolean z) {
        return mo113756d(str, this.f238999n, z, Boolean.valueOf(z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 saveFile(com.tencent.p014mm.vfs.C86009m1 r11, java.lang.String r12, js0.C9514m<java.lang.String> r13) {
        /*
            r10 = this;
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL
            com.tencent.mm.plugin.appbrand.appstorage.b0 r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_NOT_SUPPORTED
            boolean r2 = r10.accept(r12)
            if (r2 != 0) goto L_0x000b
            return r1
        L_0x000b:
            if (r11 == 0) goto L_0x00b6
            boolean r2 = r11.mo119967g()
            if (r2 != 0) goto L_0x0015
            goto L_0x00b6
        L_0x0015:
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 == 0) goto L_0x001c
            return r1
        L_0x001c:
            com.tencent.mm.plugin.appbrand.appstorage.k0 r1 = r10.f238995g
            java.lang.String r2 = "MicroMsg.LuggageNonFlattenedFileSystem"
            if (r1 == 0) goto L_0x005b
            java.lang.String r3 = r10.f238992d
            java.lang.String r4 = r11.mo119971i()
            long r3 = r1.mo113736b(r3, r4)
            long r5 = r11.mo119980r()
            long r3 = r3 + r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "saveFile: WxaStorageSpaceStatisticsService getDirTotalSize="
            r1.append(r5)
            long r5 = r11.mo119980r()
            long r5 = r3 - r5
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            long r3 = r10.mo113754c()
            long r5 = r11.mo119980r()
            goto L_0x0063
        L_0x005b:
            long r3 = r10.mo113754c()
            long r5 = r11.mo119980r()
        L_0x0063:
            long r3 = r3 + r5
        L_0x0064:
            long r5 = r10.f238994f
            r7 = 0
            r1 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0093
            long r5 = r10.f238994f
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0093
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            long r12 = r10.f238994f
            r5 = 1048576(0x100000, double:5.180654E-318)
            long r12 = r12 / r5
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r1] = r12
            r12 = 1
            long r3 = r3 / r5
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            r11[r12] = r13
            java.lang.String r12 = "saveFile exceed directory max size, MAX_SIZE[%d MB], TOTAL_SIZE[%d MB]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r12, r11)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r11 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE
            return r11
        L_0x0093:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r3 = r10.isdir(r12)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r4 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.RET_NOT_EXISTS
            if (r3 == r4) goto L_0x00a1
            com.tencent.mm.plugin.appbrand.appstorage.b0 r4 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_IS_FILE
            if (r3 != r4) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            return r3
        L_0x00a1:
            com.tencent.mm.plugin.appbrand.appstorage.t0$f r3 = new com.tencent.mm.plugin.appbrand.appstorage.t0$f     // Catch:{ Exception -> 0x00ad }
            r3.<init>(r11, r13, r12)     // Catch:{ Exception -> 0x00ad }
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00ad }
            com.tencent.mm.plugin.appbrand.appstorage.b0 r11 = r10.mo113756d(r12, r3, r1, r11)     // Catch:{ Exception -> 0x00ad }
            return r11
        L_0x00ad:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r13 = "saveFile() error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r11, r13, r12)
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0.saveFile(com.tencent.mm.vfs.m1, java.lang.String, js0.m):com.tencent.mm.plugin.appbrand.appstorage.b0");
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        return mo113756d(str, this.f239005t, false, fileStructStat);
    }

    public C81410b0 statDir(String str, List<C81432q0> list) {
        return mo113756d(str, this.f239006u, false, list);
    }

    public C81410b0 unlink(String str) {
        return mo113756d(str, this.f239004s, false, new Object[0]);
    }

    public C81410b0 unzip(String str, C86009m1 m1Var) {
        return mo113756d(str, this.f239009x, false, m1Var);
    }

    public C81410b0 writeFile(String str, InputStream inputStream, boolean z) {
        if (inputStream == null) {
            return C81410b0.ERR_OP_FAIL;
        }
        return mo113756d(str, this.f239003r, false, inputStream, Boolean.valueOf(z));
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        return mo113756d(str, this.f239001p, false, mVar, Long.valueOf(j), Long.valueOf(j2));
    }
}
