package com.tencent.p014mm.vfs;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C90364q0;
import z04.C112550d0;
import z04.C112551y;
import z04.C66716g;
import z04.C66717h;
import z04.C66723k;

/* renamed from: com.tencent.mm.vfs.d0 */
public final class C116274d0 {

    /* renamed from: a */
    public static final List<String> f348921a = C64197v.m75537f("${data}", "${extData}");

    /* renamed from: b */
    public static final String[] f348922b = {"${data}/.vfs", "${data}/lib", "${data}/code_cache", "${extData}", "${dataCache}", "${extCache}", "${data}/MicroMsg/${account}", "${extData}/MicroMsg/${accountSd}", "${dataCache}/${account}", "${extCache}/${accountSd}", "${data}/MicroMsg/${accountAllOther}", "${extData}/MicroMsg/${accountAllOther}", "${dataCache}/${accountAllOther}", "${extCache}/${accountAllOther}", "${storage}/tencent/MicroMsg", "${storage}/tencent/MicroMsg/${accountSd}", "${storage}/tencent/MicroMsg/${accountAllOther}", "${data}/shared_prefs", "${data}/.auth_cache", "${data}/cert", "${data}/files/mmkv", "${data}/files/kvcomm", "${data}/MicroMsg/last_avatar_dir", "${data}/app_lib", "${data}/app_dex", "${data}/app_recover_lib", "${data}/MicroMsg/recovery", "${data}/${xwebKeep}", "${storage}/tencent/MicroMsg/WeiXin", "${storage}/tencent/MicroMsg/WeChat"};

    /* renamed from: c */
    public static final Integer[] f348923c = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 131072, 4096, 4096, 8192, 8192, 8192, 8192, 16384, 16384, 16384, 16384, 32768, 8192, 16384, 12, 12, 12, 12, 12, 12, 65536, 65536, 65536, 65536, 65546, 65536, 65536};

    /* renamed from: d */
    public static final Map<String, Integer> f348924d = C90364q0.m113147f(new C13604l("SnsMicroMsg", 4), new C13604l("UnEncryptNewBiz", 5), new C13604l("AppBrandComm", 6), new C13604l("enFavorite", 7));

    /* renamed from: e */
    public static final Set<String> f348925e = C110826x0.m151017e("EnMicroMsg", "WxFileIndex", "WxExpt", "WxExptAi", "UnEncryptNewBiz", "SnsMicroMsg");

    /* renamed from: f */
    public static final Set<String> f348926f = C110826x0.m151017e("", ".ini", "-wal", "-shm", "-journal");

    /* renamed from: g */
    public static final C32227p<C86001b0, Integer, Integer> f348927g;

    /* renamed from: h */
    public static final C32227p<C86001b0, Integer, Integer> f348928h;

    /* renamed from: i */
    public static final String[] f348929i = {"${data}/files/mmkv", "${data}/shared_prefs", "${data}", "${data}/MicroMsg", "${data}/files", "${extData}", "${extData}/MicroMsg", "${data}/MicroMsg/${account}", "${data}/MicroMsg/${accountAllOther}", "${data}/MicroMsg/${account}/corrupted", "${data}/MicroMsg/${accountAllOther}/corrupted"};

    /* renamed from: j */
    public static final C32227p<C86001b0, Integer, Integer>[] f348930j;

    /* renamed from: k */
    public static final C66723k f348931k = new C66723k("^[0-9a-zA-Z_:]+_([0-9]{8})\\.xlog$");

    /* renamed from: l */
    public static final String[] f348932l = {"WxaCodePkgsCache", "WxaCodePkgsCacheGlobal", "xlogPrivate"};

    /* renamed from: m */
    public static final C32227p<C86001b0, Integer, Integer>[] f348933m = {C7067c.f24911d, C7068d.f24912d, C116275e.f348938d};

    /* renamed from: n */
    public static final C97318g1 f348934n = new C97318g1(0, (String) null, new C86001b0(NullFileSystem.m163697z(), "", "", 0, 0, 0, false));

    /* renamed from: o */
    public static volatile Collection<String> f348935o;

    /* renamed from: p */
    public static volatile List<String> f348936p;

    /* renamed from: q */
    public static volatile String f348937q;

    /* renamed from: com.tencent.mm.vfs.d0$a */
    public static final class C7065a extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C7065a f24909d = new C7065a();

        public C7065a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Integer num;
            C86001b0 b0Var = (C86001b0) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(b0Var, "fe");
            String str = b0Var.f250472b;
            C87412m.m108593f(str, "fe.name");
            List U = C112550d0.m153785U(str, new String[]{".db"}, false, 2, 2, (Object) null);
            if (U.size() == 2 && (num = C116274d0.f348924d.get(U.get(0))) != null) {
                intValue = (intValue & -4096) | num.intValue();
            }
            return Integer.valueOf((b0Var.f250476f ? 1073741824 : 65536) | (intValue & -4097));
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$b */
    public static final class C7066b extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C7066b f24910d = new C7066b();

        public C7066b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C86001b0 b0Var = (C86001b0) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(b0Var, "fe");
            return Integer.valueOf((b0Var.f250476f ? 1073741824 : 65536) | (intValue & -4097));
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$c */
    public static final class C7067c extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C7067c f24911d = new C7067c();

        public C7067c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C86001b0 b0Var = (C86001b0) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(b0Var, "fe");
            List<String> list = C116274d0.f348936p;
            if (!b0Var.f250476f) {
                String str = b0Var.f250471a;
                C87412m.m108593f(str, "fe.relPath");
                boolean z = false;
                if (C112551y.m153819s(str, "pkg/", false)) {
                    String str2 = b0Var.f250471a;
                    C87412m.m108593f(str2, "fe.relPath");
                    if (C112551y.m153808h(str2, ".wxapkg", false, 2, (Object) null)) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str3 = b0Var.f250471a;
                                C87412m.m108593f(str3, "fe.relPath");
                                String substring = str3.substring(4);
                                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                                if (C112551y.m153819s(substring, (String) it.next(), false)) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (!z) {
                            intValue |= 65536;
                        }
                    }
                }
            }
            return Integer.valueOf(intValue);
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$d */
    public static final class C7068d extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C7068d f24912d = new C7068d();

        public C7068d() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            boolean z;
            C86001b0 b0Var = (C86001b0) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(b0Var, "fe");
            List<String> list = C116274d0.f348936p;
            if (!b0Var.f250476f) {
                String str = b0Var.f250471a;
                C87412m.m108593f(str, "fe.relPath");
                boolean z2 = false;
                if (C112551y.m153819s(str, "pkg/", false)) {
                    String str2 = b0Var.f250471a;
                    C87412m.m108593f(str2, "fe.relPath");
                    if (C112551y.m153808h(str2, ".wxapkg", false, 2, (Object) null)) {
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str3 = (String) it.next();
                                String str4 = b0Var.f250471a;
                                C87412m.m108593f(str4, "fe.relPath");
                                if (C112550d0.m153785U(str4, new String[]{"/"}, false, 0, 6, (Object) null).size() < 3) {
                                    z = false;
                                    continue;
                                } else {
                                    String str5 = b0Var.f250471a;
                                    C87412m.m108593f(str5, "fe.relPath");
                                    z = C112551y.m153820t((String) C112550d0.m153785U(str5, new String[]{"/"}, false, 0, 6, (Object) null).get(2), str3, false, 2, (Object) null);
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (!z2) {
                            intValue |= 65536;
                        }
                    }
                }
            }
            return Integer.valueOf(intValue);
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$f */
    public static final class C7069f extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C7069f f24913d = new C7069f();

        public C7069f() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            boolean z;
            C86001b0 b0Var = (C86001b0) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(b0Var, "fe");
            String[] strArr = {"#mmkv_ringtone_manager", "#mmkv_ringtone_params", "mmkv_ringtone_info", "mmkv_exclusive_manager"};
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    z = false;
                    break;
                }
                String str = strArr[i2];
                String str2 = b0Var.f250472b;
                C87412m.m108593f(str2, "fe.name");
                if (C112550d0.m153801u(str2, str, false)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                i = intValue | 65536;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$g */
    public static final class C7070g extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C7070g f24914d = new C7070g();

        public C7070g() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g((C86001b0) obj, "<anonymous parameter 0>");
            return Integer.valueOf(65536 | intValue);
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$e */
    public static final class C116275e extends C87413o implements C32227p<C86001b0, Integer, Integer> {

        /* renamed from: d */
        public static final C116275e f348938d = new C116275e();

        public C116275e() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C86001b0 b0Var = (C86001b0) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(b0Var, "fe");
            String str = C116274d0.f348937q;
            if (str == null) {
                C116271c0 c0Var = C116271c0.f348905a;
                str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(System.currentTimeMillis()));
                C116274d0.f348937q = str;
                C87412m.m108593f(str, FFmpegMetadataRetriever.METADATA_KEY_DATE);
            }
            int i = (-65537 & intValue) | 4096;
            int i2 = (intValue & -4097) | 65536;
            if (!b0Var.f250476f) {
                String str2 = b0Var.f250471a;
                C87412m.m108593f(str2, "fe.relPath");
                if (!C112550d0.m153802v(str2, XVFSFile.SEPARATOR_CHAR, false, 2, (Object) null)) {
                    C66723k kVar = C116274d0.f348931k;
                    String str3 = b0Var.f250472b;
                    C87412m.m108593f(str3, "fe.name");
                    C66716g c = kVar.mo90758c(str3);
                    if (c == null) {
                        return Integer.valueOf(i2);
                    }
                    if (((C66717h) c).mo90752b().get(1).compareTo(str) >= 0) {
                        i = i2;
                    }
                    return Integer.valueOf(i);
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.vfs.d0$h */
    public static final class C116276h implements C116299g2.C86006b {

        /* renamed from: a */
        public final /* synthetic */ C32226l f348939a;

        public C116276h(C32226l lVar) {
            this.f348939a = lVar;
        }

        public final /* synthetic */ boolean accept(Object obj) {
            return ((Boolean) this.f348939a.invoke(obj)).booleanValue();
        }
    }

    static {
        C7065a aVar = C7065a.f24909d;
        f348927g = aVar;
        C7066b bVar = C7066b.f24910d;
        f348928h = bVar;
        f348930j = new C32227p[]{C7069f.f24913d, C7070g.f24914d, bVar, bVar, bVar, bVar, bVar, aVar, aVar, aVar, aVar};
        C64186f0 f0Var = C64186f0.f181907d;
        f348935o = f0Var;
        f348936p = f0Var;
    }
}
