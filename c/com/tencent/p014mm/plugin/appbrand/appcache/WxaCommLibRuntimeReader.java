package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.res.AssetFileDescriptor;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.C83396o0;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C31189h;
import di0.C86296l;
import di3.C86312j;
import f40.C86709a0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import p252vb.C14423a;
import p252vb.C14427b;
import zt3.C119157j;
import zt3.C119179t;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader */
public final class WxaCommLibRuntimeReader {

    /* renamed from: a */
    public static volatile ICommLibReader f238555a;

    /* renamed from: b */
    public static Future<Object> f238556b;

    /* renamed from: c */
    public static final Object f238557c = new Object();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$AccountNotReadyError */
    public static final class AccountNotReadyError extends Error implements Parcelable {
        public static final Parcelable.Creator<AccountNotReadyError> CREATOR = new C81214a();

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$AccountNotReadyError$a */
        public class C81214a implements Parcelable.Creator<AccountNotReadyError> {
            public Object createFromParcel(Parcel parcel) {
                return new AccountNotReadyError(parcel);
            }

            public Object[] newArray(int i) {
                return new AccountNotReadyError[i];
            }
        }

        public AccountNotReadyError() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        public AccountNotReadyError(Parcel parcel) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader */
    public static final class PkgReader extends AbsReader {
        public static final Parcelable.Creator<PkgReader> CREATOR = new C81215a();

        /* renamed from: i */
        public volatile WxaPkg f238558i;

        /* renamed from: j */
        public final WxaPkgWrappingInfo f238559j;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader$a */
        public class C81215a implements Parcelable.Creator<PkgReader> {
            public Object createFromParcel(Parcel parcel) {
                return new PkgReader((WxaPkgWrappingInfo) parcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
            }

            public Object[] newArray(int i) {
                return new PkgReader[i];
            }
        }

        public PkgReader(WxaPkgWrappingInfo wxaPkgWrappingInfo) {
            this.f238559j = wxaPkgWrappingInfo;
        }

        /* renamed from: c */
        public IPkgInfo mo113379c() {
            return this.f238559j;
        }

        public void close() {
            WxaPkg wxaPkg;
            try {
                wxaPkg = this.f238558i;
                if (wxaPkg != null) {
                    wxaPkg.close();
                }
                this.f238558i = null;
                if (wxaPkg != null) {
                    wxaPkg.close();
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
            throw th;
        }

        public int describeContents() {
            return 0;
        }

        public void finalize() {
            super.finalize();
            close();
        }

        /* renamed from: g */
        public AssetFileDescriptor mo113382g(String str) {
            WxaPkg j0 = mo113421j0();
            j0.mo63189b();
            WxaPkg.Info openReadPartialInfo = j0.openReadPartialInfo(str);
            if (openReadPartialInfo == null) {
                return null;
            }
            try {
                return new AssetFileDescriptor(C86013q1.m106465z(openReadPartialInfo.f238569d, "r"), (long) openReadPartialInfo.f238571f, (long) openReadPartialInfo.f238572g);
            } catch (FileNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: j0 */
        public final WxaPkg mo113421j0() {
            if (this.f238558i != null) {
                return this.f238558i;
            }
            synchronized (this) {
                if (this.f238558i == null) {
                    this.f238558i = new WxaPkg(this.f238559j.pkgPath());
                }
            }
            return this.f238558i;
        }

        public InputStream openRead(String str) {
            WxaPkg j0 = mo113421j0();
            j0.mo63189b();
            return j0.mo63188a(str);
        }

        public String toString() {
            return String.format(Locale.US, "PkgReader[%d] [%s]", new Object[]{Integer.valueOf(mo113371a()), mo113377i()});
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f238559j, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$a */
    public class C81216a implements C14427b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$b */
    public class C81217b implements Callable<Object> {
        public Object call() {
            try {
                return MMApplicationContext.isMainProcess() ? new C81218c().invoke(IPCVoid.f10316d) : XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C81218c.class);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WxaCommLibRuntimeReader", e, "load() ipc read lib", new Object[0]);
                return e;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$c */
    public static final class C81218c implements C80916r<IPCVoid, Object> {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$c$a */
        public class C29176a implements Runnable {
            public C29176a(C81218c cVar) {
            }

            public void run() {
                if (C86709a0.m107523b().f251765p) {
                    try {
                        ((C31189h) C86312j.m106911c(C31189h.class)).mo58016kh(false, (Runnable) null);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.WxaCommLibRuntimeReader", e, "[NOT CRASH]", new Object[0]);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo113427a(C29315z2 z2Var) {
            if (z2Var != null) {
                String str = z2Var.field_pkgPath;
                String j = C81372u2.m99810j(z2Var.field_appId, str);
                if (!Util.isNullOrNil(j)) {
                    Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "prepare to move wxapkg to new dir, legacy path: %s", str);
                    if (C86013q1.m106463x(str, j)) {
                        Log.m105924i("MicroMsg.WxaCommLibRuntimeReader", "move wxapkg to new dir success");
                        String str2 = null;
                        try {
                            str2 = WxaPkgWrappingInfo.m99521f(new C86009m1(j));
                        } catch (IOException e) {
                            Log.m105921e("MicroMsg.WxaCommLibRuntimeReader", "get file md5 fail", e);
                        }
                        String nullAsNil = Util.nullAsNil(str2);
                        if (nullAsNil.equals(z2Var.field_versionMd5) || nullAsNil.equals(z2Var.field_NewMd5)) {
                            C81161g2.requireAccountInitializedOnDemand();
                            if (C81161g2.f238471g.mo113514C(z2Var.field_appId, z2Var.field_debugType, z2Var.field_version, j)) {
                                z2Var.field_pkgPath = j;
                                ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(str);
                                Log.m105924i("MicroMsg.WxaCommLibRuntimeReader", "update dir success");
                                return;
                            }
                            return;
                        }
                        Log.m105920e("MicroMsg.WxaCommLibRuntimeReader", "check md5 fail after file move");
                        return;
                    }
                    Log.m105921e("MicroMsg.WxaCommLibRuntimeReader", "move wxapkg to new dir, move fail, new path: %s", j);
                } else if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
                    Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "prepare to find lib in public pkg storage", str);
                    PString pString = new PString();
                    String c = C83396o0.m102338c(z2Var.field_appId, z2Var.field_version, new String[]{z2Var.field_versionMd5, z2Var.field_NewMd5}, pString);
                    if (c != null) {
                        Log.m105924i("MicroMsg.WxaCommLibRuntimeReader", "find lib in public pkg storage success");
                        if ((Util.isNullOrNil(z2Var.field_versionMd5) || !z2Var.field_versionMd5.equals(pString.value)) && (Util.isNullOrNil(z2Var.field_NewMd5) || !z2Var.field_NewMd5.equals(pString.value))) {
                            Log.m105920e("MicroMsg.WxaCommLibRuntimeReader", "check md5 fail after find public file");
                            return;
                        }
                        z2Var.field_pkgPath = c;
                        C81161g2.requireAccountInitializedOnDemand();
                        C81161g2.f238471g.mo113514C(z2Var.field_appId, z2Var.field_debugType, z2Var.field_version, c);
                    }
                }
            }
        }

        /* renamed from: b */
        public final WxaPkgWrappingInfo mo113428b() {
            C81258h3 h3Var;
            if (!C86709a0.m107523b().f251765p) {
                return null;
            }
            try {
                h3Var = ((C86296l) C86312j.m106911c(C86296l.class)).mo113349uv();
            } catch (Exception unused) {
                h3Var = null;
            }
            if (h3Var == null) {
                Log.m105920e("MicroMsg.WxaCommLibRuntimeReader", "decideWhichLib, NULL == WxaPkgStorage");
                return null;
            }
            synchronized (WxaCommLibRuntimeReader.f238557c) {
                WxaPkgWrappingInfo c = mo113429c(h3Var, false);
                if (c != null) {
                    return c;
                }
                WxaPkgWrappingInfo c2 = mo113429c(h3Var, true);
                return c2;
            }
        }

        /* renamed from: c */
        public final WxaPkgWrappingInfo mo113429c(C81258h3 h3Var, boolean z) {
            C29315z2 z2Var;
            Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "getLib(release:%b)", Boolean.valueOf(z));
            if (z) {
                z2Var = C81292m2.m99672b(h3Var, 0);
                mo113427a(z2Var);
                if (z2Var == null || z2Var.field_version != h3Var.mo113528l("@LibraryAppId", 0)) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C29176a(this), "AppBrand$checkLibUnbrokenOrDownload_releaseLib(false)");
                }
            } else {
                z2Var = C81292m2.m99672b(h3Var, 999);
                mo113427a(z2Var);
            }
            if (z2Var == null) {
                return null;
            }
            AssetReader assetReader = AssetReader.f238551j;
            Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "getLib(%b), record.version:%d, record.md5:%s, embed.version:%d", Boolean.valueOf(z), Integer.valueOf(z2Var.field_version), z2Var.field_versionMd5, Integer.valueOf(assetReader.mo113371a()));
            if (z && z2Var.field_version < assetReader.mo113371a()) {
                return null;
            }
            if (C86013q1.m106450k(z2Var.field_pkgPath)) {
                return C81292m2.m99673c(z2Var);
            }
            Log.m105921e("MicroMsg.WxaCommLibRuntimeReader", "getLib, file not found, path %s", z2Var.field_pkgPath);
            return null;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0066 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(com.tencent.p014mm.ipcinvoker.type.IPCVoid r7) {
            /*
                r6 = this;
                f40.e r7 = f40.C86709a0.m107523b()
                boolean r7 = r7.f251765p
                if (r7 != 0) goto L_0x000e
                com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$AccountNotReadyError r7 = new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$AccountNotReadyError
                r7.<init>()
                return r7
            L_0x000e:
                r7 = 0
                r0 = 0
                r1 = 1
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r6.mo113428b()     // Catch:{ all -> 0x00d7 }
                if (r2 == 0) goto L_0x0025
                boolean r3 = r2.f238587f     // Catch:{ all -> 0x00d7 }
                if (r3 == 0) goto L_0x0025
                com.tencent.mm.plugin.appbrand.appcache.AssetReader r7 = com.tencent.p014mm.plugin.appbrand.appcache.AssetReader.f238551j     // Catch:{ all -> 0x00d7 }
                java.lang.String r2 = "MicroMsg.WxaCommLibRuntimeReader"
                java.lang.String r3 = "IPC_ReadLib use local pkg"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00d7 }
                goto L_0x0044
            L_0x0025:
                if (r2 == 0) goto L_0x0037
                java.lang.String r3 = r2.pkgPath     // Catch:{ all -> 0x00d7 }
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00d7 }
                if (r3 == 0) goto L_0x0030
                goto L_0x0037
            L_0x0030:
                com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader r3 = new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader     // Catch:{ all -> 0x00d7 }
                r3.<init>(r2)     // Catch:{ all -> 0x00d7 }
                r7 = r3
                goto L_0x0044
            L_0x0037:
                com.tencent.mm.plugin.appbrand.appcache.AssetReader r7 = com.tencent.p014mm.plugin.appbrand.appcache.AssetReader.f238551j     // Catch:{ all -> 0x00d7 }
                java.lang.String r3 = "MicroMsg.WxaCommLibRuntimeReader"
                java.lang.String r4 = "IPC_ReadLib invalid PkgInfo=%s"
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d7 }
                r5[r0] = r2     // Catch:{ all -> 0x00d7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x00d7 }
            L_0x0044:
                java.util.Objects.requireNonNull(r7)
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.f238682a
                java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.j2> r2 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.class
                monitor-enter(r2)
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r3 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.f238682a     // Catch:{ Exception -> 0x0066 }
                if (r3 == 0) goto L_0x005e
                r3.close()     // Catch:{ all -> 0x0054 }
                goto L_0x005e
            L_0x0054:
                r4 = move-exception
                r3.close()     // Catch:{ all -> 0x0059 }
                goto L_0x005d
            L_0x0059:
                r3 = move-exception
                r4.addSuppressed(r3)     // Catch:{ Exception -> 0x0066 }
            L_0x005d:
                throw r4     // Catch:{ Exception -> 0x0066 }
            L_0x005e:
                if (r3 == 0) goto L_0x0066
                r3.close()     // Catch:{ Exception -> 0x0066 }
                goto L_0x0066
            L_0x0064:
                r7 = move-exception
                goto L_0x00d5
            L_0x0066:
                com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.f238682a = r7     // Catch:{ all -> 0x0064 }
                monitor-exit(r2)     // Catch:{ all -> 0x0064 }
                java.lang.String r2 = "MicroMsg.AppBrand.WxaCommLibPreloadSessionInMM"
                java.lang.String r3 = "setCurrentUsingVersion wx.version:%s, delegate?:%b"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = r7.mo113377i()
                r4[r0] = r5
                java.util.Set<com.tencent.mm.plugin.appbrand.appcache.j2$a> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.f238683b
                java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
                boolean r5 = r0.isEmpty()
                r5 = r5 ^ r1
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r4[r1] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
                java.util.Iterator r0 = r0.iterator()
            L_0x008d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x009d
                java.lang.Object r1 = r0.next()
                com.tencent.mm.plugin.appbrand.appcache.j2$a r1 = (com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.C81275a) r1
                r1.mo113563o3(r7)
                goto L_0x008d
            L_0x009d:
                java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.j2$b> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.C81276b.class
                wl.d r0 = p261wl.C38166b.m41759f(r0)
                wl.b$a r0 = (p261wl.C38166b.C38167a) r0
                wl.b$a$b r1 = new wl.b$a$b
                wl.d<T> r2 = r0.f100837d
                java.lang.Iterable r2 = r2.all()
                java.util.Iterator r2 = r2.iterator()
                r1.<init>(r0, r2)
            L_0x00b4:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x00d4
                java.lang.Object r0 = r1.next()
                wl.i r0 = (p261wl.C38174i) r0
                android.app.Application r2 = p261wl.C38166b.f100836c
                boolean r2 = p261wl.C38166b.m41757d(r2, r0)
                if (r2 == 0) goto L_0x00b4
                java.lang.Object r0 = r0.get()
                wl.f r0 = (p261wl.C15510f) r0
                com.tencent.mm.plugin.appbrand.appcache.j2$b r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.C81276b) r0
                r0.mo56522o3(r7)
                goto L_0x00b4
            L_0x00d4:
                return r7
            L_0x00d5:
                monitor-exit(r2)     // Catch:{ all -> 0x0064 }
                throw r7
            L_0x00d7:
                r2 = move-exception
                java.lang.String r3 = "MicroMsg.WxaCommLibRuntimeReader"
                java.lang.String r4 = "IPC_ReadLib exception:%s"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e4 }
                r1[r0] = r2     // Catch:{ all -> 0x00e4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r1)     // Catch:{ all -> 0x00e4 }
                throw r2     // Catch:{ all -> 0x00e4 }
            L_0x00e4:
                r0 = move-exception
                java.util.Objects.requireNonNull(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.C81218c.invoke(com.tencent.mm.ipcinvoker.type.IPCVoid):java.lang.Object");
        }
    }

    static {
        C14423a.C14424a.f40030a = new C81216a();
    }

    /* renamed from: a */
    public static void m99497a() {
        Assert.assertTrue(MMApplicationContext.isMainProcess());
        Log.m105924i("MicroMsg.WxaCommLibRuntimeReader", "ensureLibReaderInMainProcess()");
        new C81218c().invoke(IPCVoid.f10316d);
    }

    /* renamed from: b */
    public static synchronized ICommLibReader m99498b() {
        ICommLibReader iCommLibReader;
        synchronized (WxaCommLibRuntimeReader.class) {
            if (f238555a == null) {
                m99501e();
            }
            iCommLibReader = f238555a;
        }
        return iCommLibReader;
    }

    /* renamed from: c */
    public static synchronized void m99499c(boolean z) {
        synchronized (WxaCommLibRuntimeReader.class) {
            if (f238555a != null) {
                Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "load(), sReader %s loaded", f238555a);
                return;
            }
            if (C81352s2.f238831d == null) {
                C81352s2.f238831d = Boolean.FALSE;
            }
            if (C81352s2.f238831d.booleanValue()) {
                f238555a = AssetReader.f238551j;
                Log.m105924i("MicroMsg.WxaCommLibRuntimeReader", "load(), forceLocal, use AssetReader");
                return;
            }
            if (MMApplicationContext.isMainProcess()) {
                if (!C86709a0.m107522a()) {
                    throw new AccountNotReadyError();
                }
            } else if (!MMApplicationContext.isMMProcessExist()) {
                Log.m105920e("MicroMsg.WxaCommLibRuntimeReader", "load(), mm process not exists");
                throw new AccountNotReadyError();
            }
            try {
                f238555a = m99500d(z);
            } catch (Throwable th) {
                f238556b.cancel(false);
                f238556b = null;
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static ICommLibReader m99500d(boolean z) {
        if (f238556b != null) {
            Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "loadAwaitingRetriever(isForPreload:%b), wait for existing retriever", Boolean.valueOf(z));
        } else {
            Log.m105925i("MicroMsg.WxaCommLibRuntimeReader", "loadAwaitingRetriever(isForPreload:%b), new retriever", Boolean.valueOf(z));
            C119179t tVar = C119157j.f356862d;
            C81217b bVar = new C81217b();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            f238556b = jVar.mo183880k(bVar, 0);
        }
        Object obj = f238556b.get(z ? 30 : 5, TimeUnit.SECONDS);
        if (obj instanceof ICommLibReader) {
            return (ICommLibReader) obj;
        }
        if (obj instanceof WxaPkgWrappingInfo) {
            WxaPkgWrappingInfo wxaPkgWrappingInfo = (WxaPkgWrappingInfo) obj;
            return wxaPkgWrappingInfo.f238587f ? AssetReader.f238551j : new PkgReader(wxaPkgWrappingInfo);
        } else if (obj instanceof AccountNotReadyError) {
            throw ((AccountNotReadyError) obj);
        } else if (!(obj instanceof Exception)) {
            throw new IllegalArgumentException("Unknown result null" == obj ? "null" : obj.getClass().getName());
        } else {
            throw ((Exception) obj);
        }
    }

    /* renamed from: e */
    public static synchronized void m99501e() {
        AssetReader assetReader;
        synchronized (WxaCommLibRuntimeReader.class) {
            try {
                m99499c(false);
                if (f238555a == null) {
                    assetReader = AssetReader.f238551j;
                    f238555a = assetReader;
                }
            } catch (Throwable th) {
                if (f238555a == null) {
                    f238555a = AssetReader.f238551j;
                }
                throw th;
            }
        }
    }
}
