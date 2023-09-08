package q73;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import f93.C31962d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kj2.C117407d;
import kotlin.Result;
import kr0.C33983a1;
import kr0.C33987b1;
import kr0.C88262c1;
import pe3.C47465a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t73.C48555a;
import te3.C49168dn;
import te3.C51831wg3;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: q73.c0 */
public final class C35796c0 {

    /* renamed from: a */
    public static final C35796c0 f95588a = new C35796c0();

    /* renamed from: b */
    public static final String f95589b = (C112760b.m154225d() + "/WebCanvasPkg");

    /* renamed from: c */
    public static final String f95590c = (C112760b.m154225d() + "/WebPrefetcherPkg");

    /* renamed from: d */
    public static final CopyOnWriteArraySet<C35797a> f95591d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    public static final C13601g f95592e = C36568h.m40985a(C12141f.f35246d);

    /* renamed from: f */
    public static final C13601g f95593f = C36568h.m40985a(C12140d.f35245d);

    /* renamed from: g */
    public static final C13601g f95594g = C36568h.m40985a(C12142g.f35247d);

    /* renamed from: h */
    public static final C13601g f95595h = C36568h.m40985a(C12139b.f35244d);

    /* renamed from: i */
    public static final C13601g f95596i = C36568h.m40985a(C12143h.f35248d);

    /* renamed from: j */
    public static final C13601g f95597j = C36568h.m40985a(C12144i.f35249d);

    /* renamed from: q73.c0$b */
    public static final class C12139b extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public static final C12139b f35244d = new C12139b();

        public C12139b() {
            super(0);
        }

        public Object invoke() {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_web_canvas_download_pkg_use_batch_download_list, "wx4456404b7b80670e");
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "batchDownloadAppId " + Y60);
            C87412m.m108593f(Y60, LocaleUtil.ITALIAN);
            return C112550d0.m153785U(Y60, new String[]{";"}, false, 0, 6, (Object) null);
        }
    }

    /* renamed from: q73.c0$d */
    public static final class C12140d extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C12140d f35245d = new C12140d();

        public C12140d() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("WebCanvasStorage");
        }
    }

    /* renamed from: q73.c0$f */
    public static final class C12141f extends C87413o implements C32224a<LinkedList<String>> {

        /* renamed from: d */
        public static final C12141f f35246d = new C12141f();

        public C12141f() {
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[Catch:{ Exception -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ Exception -> 0x003a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                q73.c0 r1 = q73.C35796c0.f95588a
                monitor-enter(r1)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r1.mo60404e()     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = "mmkv"
                gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = "KPrefetcherBizAppIds"
                boolean r4 = r2.containsKey(r3)     // Catch:{ all -> 0x0071 }
                r5 = 0
                if (r4 == 0) goto L_0x0044
                byte[] r2 = r2.decodeBytes(r3)     // Catch:{ all -> 0x0071 }
                if (r2 == 0) goto L_0x0044
                int r3 = r2.length     // Catch:{ all -> 0x0071 }
                r4 = 0
                r6 = 1
                if (r3 != 0) goto L_0x0027
                r3 = 1
                goto L_0x0028
            L_0x0027:
                r3 = 0
            L_0x0028:
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x0044
                java.lang.Class<te3.wg3> r3 = te3.C51831wg3.class
                java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x003a }
                r6 = r3
                pe3.a r6 = (pe3.C47465a) r6     // Catch:{ Exception -> 0x003a }
                r6.parseFrom(r2)     // Catch:{ Exception -> 0x003a }
                pe3.a r3 = (pe3.C47465a) r3     // Catch:{ Exception -> 0x003a }
                goto L_0x0045
            L_0x003a:
                r2 = move-exception
                java.lang.String r3 = "MultiProcessMMKV.decodeProtoBuffer"
                java.lang.String r6 = "decode ProtoBuffer"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0071 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r6, r4)     // Catch:{ all -> 0x0071 }
            L_0x0044:
                r3 = r5
            L_0x0045:
                te3.wg3 r3 = (te3.C51831wg3) r3     // Catch:{ all -> 0x0071 }
                if (r3 == 0) goto L_0x004b
                java.util.LinkedList<java.lang.String> r5 = r3.f144042d     // Catch:{ all -> 0x0071 }
            L_0x004b:
                if (r5 != 0) goto L_0x0052
                java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ all -> 0x0071 }
                r5.<init>()     // Catch:{ all -> 0x0071 }
            L_0x0052:
                java.lang.String r2 = "MicroMsg.WebCanvasStorageLogic"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r3.<init>()     // Catch:{ all -> 0x0071 }
                java.lang.String r4 = "getBizAppIds size "
                r3.append(r4)     // Catch:{ all -> 0x0071 }
                int r4 = r5.size()     // Catch:{ all -> 0x0071 }
                r3.append(r4)     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0071 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ all -> 0x0071 }
                monitor-exit(r1)
                r0.addAll(r5)
                return r0
            L_0x0071:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q73.C35796c0.C12141f.invoke():java.lang.Object");
        }
    }

    /* renamed from: q73.c0$g */
    public static final class C12142g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12142g f35247d = new C12142g();

        public C12142g() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C35796c0.f95588a.mo60404e().decodeInt("BizTimeLineAdPkgPreviewMode", 0));
        }
    }

    /* renamed from: q73.c0$h */
    public static final class C12143h extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C12143h f35248d = new C12143h();

        public C12143h() {
            super(0);
        }

        public Object invoke() {
            Long valueOf = Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_open_biz_trigger_download_prefetch_pkg_interval, 3600000));
            long longValue = valueOf.longValue();
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "download prefetch pkg on interval " + longValue);
            return valueOf;
        }
    }

    /* renamed from: q73.c0$i */
    public static final class C12144i extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C12144i f35249d = new C12144i();

        public C12144i() {
            super(0);
        }

        public Object invoke() {
            Long valueOf = Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_web_prefetch_download_pkg_interval, 3600000));
            long longValue = valueOf.longValue();
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "download prefetch pkg on interval " + longValue);
            return valueOf;
        }
    }

    /* renamed from: q73.c0$a */
    public interface C35797a {
        /* renamed from: a */
        void mo60209a(String str, C86009m1 m1Var);
    }

    /* renamed from: q73.c0$c */
    public static final class C35798c implements Runnable {

        /* renamed from: d */
        public static final C35798c f95598d = new C35798c();

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            LinkedList<String> linkedList = new LinkedList<>(C35796c0.f95588a.mo60407i());
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "init appId size = " + linkedList.size());
            for (String str : linkedList) {
                Log.m105926v("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg appId: " + str);
                C35796c0 c0Var = C35796c0.f95588a;
                C87412m.m108593f(str, "appId");
                C35796c0.m40830a(c0Var, new C86009m1(C35796c0.f95589b + XVFSFile.SEPARATOR_CHAR + str), str, currentTimeMillis);
                C35796c0.m40830a(c0Var, new C86009m1(C35796c0.f95590c + XVFSFile.SEPARATOR_CHAR + str), str, currentTimeMillis);
            }
        }
    }

    /* renamed from: q73.c0$e */
    public static final class C35799e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35799e f95599d = new C35799e();

        public C35799e() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C35812s.f95619e);
        }
    }

    static {
        C36568h.m40985a(C35799e.f95599d);
    }

    /* renamed from: a */
    public static final void m40830a(C35796c0 c0Var, C86009m1 m1Var, String str, long j) {
        C86009m1[] u;
        C35796c0 c0Var2 = c0Var;
        String str2 = str;
        c0Var.getClass();
        if (m1Var.mo119967g()) {
            C33987b1 b1Var = (C33987b1) C86312j.m106911c(C33987b1.class);
            char c = 0;
            if (b1Var != null) {
                C87412m.m108594g(str2, "appId");
                C49168dn f = c0Var2.mo60405f(str2);
                b1Var.mo59394hF(str2, f != null ? f.f132425f : 0);
            }
            MultiProcessMMKV e = c0Var.mo60404e();
            C87412m.m108594g(str2, "<this>");
            String decodeString = e.decodeString("webcanvas_last_use_pkg_path_" + str2, "");
            MultiProcessMMKV e2 = c0Var.mo60404e();
            long decodeLong = e2.decodeLong("webcanvas_last_use_pkg_time_" + str2, 0);
            String k = c0Var2.mo60409k(str2);
            if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
                int length = u.length;
                int i = 0;
                while (i < length) {
                    C86009m1 m1Var2 = u[i];
                    Object[] objArr = new Object[4];
                    objArr[c] = m1Var2.mo119971i();
                    objArr[1] = k;
                    objArr[2] = decodeString;
                    objArr[3] = m1Var2.getName();
                    Log.m105927v("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg file: %s, newestPath: %s, lastUsePath: %s, fileName: %s", objArr);
                    if (!Util.isEqual(m1Var2.mo119971i(), decodeString) && !Util.isEqual(m1Var2.mo119971i(), k)) {
                        m1Var2.mo119966f();
                        CopyOnWriteArraySet<C35797a> copyOnWriteArraySet = f95591d;
                        synchronized (copyOnWriteArraySet) {
                            Iterator<C35797a> it = copyOnWriteArraySet.iterator();
                            while (it.hasNext()) {
                                it.next().mo60209a(str2, m1Var2);
                            }
                        }
                        Log.m105924i("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg appId=" + str2 + ", path=" + m1Var2.mo119971i());
                        C117407d.INSTANCE.mo182089r(1454, 120, 1);
                    } else if (f95588a.mo60407i().contains(str2) && decodeLong != 0 && j - decodeLong > 2592000000L) {
                        m1Var2.mo119966f();
                        CopyOnWriteArraySet<C35797a> copyOnWriteArraySet2 = f95591d;
                        synchronized (copyOnWriteArraySet2) {
                            Iterator<C35797a> it4 = copyOnWriteArraySet2.iterator();
                            while (it4.hasNext()) {
                                it4.next().mo60209a(str2, m1Var2);
                            }
                        }
                        Log.m105924i("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg on timeout appId=" + str2 + ", path=" + m1Var2.mo119971i() + '}');
                        C117407d.INSTANCE.mo182089r(1454, 121, 1);
                    }
                    i++;
                    c = 0;
                }
            }
        }
    }

    /* renamed from: h */
    public static final String m40831h(String str) {
        if (str == null) {
            return "";
        }
        C35796c0 c0Var = f95588a;
        String g = c0Var.mo60408j() == 1 ? c0Var.mo60406g(str, 2) : c0Var.mo60409k(str);
        return g == null ? "" : g;
    }

    /* renamed from: b */
    public final synchronized void mo60401b(String str) {
        C87412m.m108594g(str, "appId");
        if ((str.length() > 0) && !mo60407i().contains(str)) {
            mo60407i().add(str);
            C33987b1 b1Var = (C33987b1) C86312j.m106911c(C33987b1.class);
            if (b1Var != null) {
                b1Var.mo59394hF(str, 0);
            }
            mo60411m();
        }
    }

    /* renamed from: c */
    public final void mo60402c(boolean z) {
        long decodeLong = mo60404e().decodeLong("webcanvas_last_clear_pkg_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(currentTimeMillis - decodeLong);
        if (z || abs >= 86400000) {
            mo60404e().encode("webcanvas_last_clear_pkg_time", currentTimeMillis);
            ((C119157j) C119157j.f356862d).mo183878i(C35798c.f95598d, 20000);
            return;
        }
        Log.m105918d("MicroMsg.WebCanvasStorageLogic", "clearInvalidPkg delta " + abs);
    }

    /* renamed from: d */
    public final Object mo60403d(C48555a aVar, String str, String str2, int i, C15601d<? super Boolean> dVar) {
        C48555a aVar2 = aVar;
        String str3 = str;
        Class cls = C33983a1.class;
        C31962d.C31964b bVar = C31962d.C31964b.WXA_PKG_RESOURCE_BY_APPID;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C35796c0 c0Var = f95588a;
        long longValue = ((Number) ((C36570n) f95597j).getValue()).longValue();
        c0Var.mo60401b(str3);
        int i2 = 2;
        if (c0Var.mo60408j() == 1) {
            ((C33983a1) C86312j.m106911c(cls)).mo56533yv("wx97b7aebac2183fd2", 2, new C35802e0("wx97b7aebac2183fd2"), new C12145f0("wx97b7aebac2183fd2"));
            ((C33983a1) C86312j.m106911c(cls)).mo56533yv(str3, 2, new C35802e0(str3), new C12145f0(str3));
        } else {
            c0Var.mo60413o();
            c0Var.mo60414p(str3, longValue, 10);
        }
        if (C86013q1.m106450k(c0Var.mo60409k(str3))) {
            C31962d.m39599a(C31962d.C31963a.ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD, bVar, aVar2.f129887a.f140537d, i, aVar2.f129890d, aVar2.f129891e, "", "");
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg pkg not exist, wait for download complete. appId=" + str3);
            C31962d.m39599a(C31962d.C31963a.ACTION_NO_CACHE_AND_DOWNLOAD, bVar, aVar2.f129887a.f140537d, i, aVar2.f129890d, aVar2.f129891e, "", "");
            C33983a1 a1Var = (C33983a1) C86312j.m106911c(cls);
            if (c0Var.mo60408j() != 1) {
                i2 = 0;
            }
            a1Var.mo56533yv(str3, i2, new C35807g0(str3, hVar), new C12147h0(str3, hVar));
        }
        return hVar.mo90314b();
    }

    /* renamed from: e */
    public final MultiProcessMMKV mo60404e() {
        return (MultiProcessMMKV) ((C36570n) f95593f).getValue();
    }

    /* renamed from: f */
    public final C49168dn mo60405f(String str) {
        C47465a aVar;
        byte[] decodeBytes;
        C87412m.m108594g(str, "appId");
        MultiProcessMMKV e = mo60404e();
        C87412m.m108593f(e, "mmkv");
        String str2 = "webcanvas_pkg_info_" + str;
        if (e.containsKey(str2) && (decodeBytes = e.decodeBytes(str2)) != null) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C49168dn newInstance = C49168dn.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e2) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e2, "decode ProtoBuffer", new Object[0]);
                }
                return (C49168dn) aVar;
            }
        }
        aVar = null;
        return (C49168dn) aVar;
    }

    /* renamed from: g */
    public final String mo60406g(String str, int i) {
        C87412m.m108594g(str, "appId");
        try {
            C29315z2 Yh = ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59392Yh(str, i, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("getPreviewPkgPath appId=");
            sb.append(str);
            sb.append(", pkgType=");
            sb.append(i);
            sb.append(", md5=");
            sb.append(Yh != null ? Yh.field_versionMd5 : null);
            sb.append(" download version= ");
            sb.append(Yh != null ? Integer.valueOf(Yh.field_version) : null);
            sb.append(" path=");
            sb.append(Yh != null ? Yh.field_pkgPath : null);
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", sb.toString());
            if (Yh != null) {
                return Yh.field_pkgPath;
            }
            return null;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.WebCanvasStorageLogic", "getPreviewPkgPath ex " + e.getMessage());
            return null;
        }
    }

    /* renamed from: i */
    public final LinkedList<String> mo60407i() {
        return (LinkedList) ((C36570n) f95592e).getValue();
    }

    /* renamed from: j */
    public final int mo60408j() {
        return ((Number) ((C36570n) f95594g).getValue()).intValue();
    }

    /* renamed from: k */
    public final String mo60409k(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "appId");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C49168dn f = mo60405f(str);
        if (f == null) {
            Log.m105925i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath pkgInfo is null, appId: %s", str2);
            return null;
        } else if (!C86013q1.m106450k(f.f132424e)) {
            String g = mo60406g(str2, 0);
            if (C86013q1.m106450k(g)) {
                C117407d.INSTANCE.mo182089r(1454, 123, 1);
                Log.m105924i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath use wxa appId=" + str2 + ", md5=" + f.f132427h + " download version= " + f.f132425f + " path=" + g);
                return g;
            }
            Log.m105924i("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath pkgInfo " + f.f132424e + " not exist");
            return null;
        } else {
            Log.m105918d("MicroMsg.WebCanvasStorageLogic", "geReleasePkgPath appId=" + str2 + ", md5=" + f.f132427h + " download version= " + f.f132425f + " path=" + f.f132424e);
            MultiProcessMMKV e = mo60404e();
            StringBuilder sb = new StringBuilder();
            sb.append("webcanvas_last_use_pkg_path_");
            sb.append(str2);
            e.encode(sb.toString(), new C86009m1(f.f132424e).mo119971i());
            MultiProcessMMKV e2 = mo60404e();
            e2.encode("webcanvas_last_use_pkg_time_" + str2, System.currentTimeMillis());
            return f.f132424e;
        }
    }

    /* renamed from: l */
    public final String mo60410l() {
        String str = C86709a0.m107535s().f251806d + "webcanvascache/";
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
        return str;
    }

    /* renamed from: m */
    public final synchronized void mo60411m() {
        try {
            MultiProcessMMKV e = mo60404e();
            C51831wg3 wg32 = new C51831wg3();
            wg32.f144042d = f95588a.mo60407i();
            C13598b0 b0Var = C13598b0.f38549a;
            e.encode("KPrefetcherBizAppIds", wg32.toByteArray());
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.WebCanvasStorageLogic", "saveBizAppIds ex " + e2.getMessage());
        }
        return;
    }

    /* renamed from: n */
    public final void mo60412n(String str, C49168dn dnVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(dnVar, "pkg");
        MultiProcessMMKV e = mo60404e();
        e.encode("webcanvas_pkg_info_" + str, dnVar.toByteArray());
    }

    /* renamed from: o */
    public final void mo60413o() {
        if (mo60414p("wx97b7aebac2183fd2", ((Number) ((C36570n) f95596i).getValue()).longValue(), 6)) {
            C117407d.INSTANCE.mo182089r(1454, 54, 1);
        }
    }

    /* renamed from: p */
    public final boolean mo60414p(String str, long j, int i) {
        MultiProcessMMKV e = mo60404e();
        C87412m.m108594g(str, "<this>");
        long j2 = e.getLong(str + "-lastDownLoawnTime", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(currentTimeMillis - j2);
        if ((mo60408j() != 0 || abs >= j) && (mo60408j() == 0 || abs >= 10000)) {
            Log.m105918d("MicroMsg.WebCanvasStorageLogic", "triggerPreDownloadPrefetchPkg " + str);
            MultiProcessMMKV e2 = mo60404e();
            e2.encode(str + "-lastDownLoawnTime", currentTimeMillis);
            if (!((List) ((C36570n) f95595h).getValue()).contains(str)) {
                ((C88262c1) C86312j.m106911c(C88262c1.class)).e60((String) null, str, i);
                return true;
            }
            ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56533yv(str, 0, new C35808i0(str), new C12148j0(str));
            return true;
        }
        Log.m105918d("MicroMsg.WebCanvasStorageLogic", "triggerPreDownloadPrefetchPkg return " + mo60408j());
        return false;
    }
}
