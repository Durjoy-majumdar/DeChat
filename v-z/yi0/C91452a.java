package yi0;

import android.text.TextUtils;
import com.tencent.live2.V2TXLivePremier;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.AppBrands;
import com.tencent.skyline.SkylineLogic;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: yi0.a */
public final class C91452a implements C39024e {

    /* renamed from: d */
    public static final C91452a f262179d = new C91452a();

    /* renamed from: e */
    public static final AtomicBoolean f262180e = new AtomicBoolean(false);

    /* renamed from: f */
    public static final LinkedHashMap<C91454b, Boolean> f262181f = new LinkedHashMap<>(5, 0.7f, true);

    /* renamed from: yi0.a$a */
    public static final class C91453a<V> implements Callable {

        /* renamed from: d */
        public static final C91453a<V> f262182d = new C91453a<>();

        public Object call() {
            LinkedHashMap<C91454b, Boolean> linkedHashMap = C91452a.f262181f;
            if (linkedHashMap.isEmpty()) {
                return null;
            }
            Set<C91454b> keySet = linkedHashMap.keySet();
            C87412m.m108593f(keySet, "mRunningAppInfos.keys");
            C91454b bVar = (C91454b) C110818d0.m150922T(keySet);
            AppBrands.AppBrandAppInfo appBrandAppInfo = new AppBrands.AppBrandAppInfo();
            appBrandAppInfo.appId = bVar.f262184d;
            appBrandAppInfo.appName = bVar.f262185e;
            appBrandAppInfo.appType = bVar.f262186f;
            appBrandAppInfo.appVersion = bVar.f262187g;
            appBrandAppInfo.appServiceType = bVar.f262188h;
            appBrandAppInfo.renderBackend = bVar.f262189i;
            return appBrandAppInfo;
        }
    }

    /* renamed from: yi0.a$b */
    public static final class C91454b implements Comparable<C91454b> {

        /* renamed from: j */
        public static final C91455a f262183j = new C91455a((C8480h) null);

        /* renamed from: d */
        public final String f262184d;

        /* renamed from: e */
        public final String f262185e;

        /* renamed from: f */
        public final int f262186f;

        /* renamed from: g */
        public final int f262187g;

        /* renamed from: h */
        public final int f262188h;

        /* renamed from: i */
        public final int f262189i;

        /* renamed from: yi0.a$b$a */
        public static final class C91455a {
            public C91455a(C8480h hVar) {
            }

            /* JADX WARNING: type inference failed for: r10v1, types: [com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final yi0.C91452a.C91454b mo125389a(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r10) {
                /*
                    r9 = this;
                    java.lang.String r0 = "runtime"
                    gy3.C87412m.m108594g(r10, r0)
                    yi0.a$b r0 = new yi0.a$b
                    java.lang.String r2 = r10.f238147j
                    java.lang.String r1 = "runtime.appId"
                    gy3.C87412m.m108593f(r2, r1)
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r10.mo113036W()
                    r3 = 0
                    if (r1 == 0) goto L_0x001a
                    java.lang.String r1 = r1.f239363e
                    goto L_0x001b
                L_0x001a:
                    r1 = r3
                L_0x001b:
                    if (r1 != 0) goto L_0x0020
                    java.lang.String r1 = "unknown"
                L_0x0020:
                    r4 = r1
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r10.mo113036W()
                    boolean r5 = r1 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU
                    if (r5 == 0) goto L_0x002c
                    com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r1
                    goto L_0x002d
                L_0x002c:
                    r1 = r3
                L_0x002d:
                    r5 = -1
                    if (r1 == 0) goto L_0x0034
                    int r1 = r1.f239365g
                    r6 = r1
                    goto L_0x0035
                L_0x0034:
                    r6 = -1
                L_0x0035:
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r10.mo113036W()
                    boolean r7 = r1 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU
                    if (r7 == 0) goto L_0x0040
                    com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r1
                    goto L_0x0041
                L_0x0040:
                    r1 = r3
                L_0x0041:
                    if (r1 == 0) goto L_0x0047
                    int r1 = r1.f234802F
                    r7 = r1
                    goto L_0x0048
                L_0x0047:
                    r7 = -1
                L_0x0048:
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r10.mo113036W()
                    boolean r8 = r1 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU
                    if (r8 == 0) goto L_0x0053
                    com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r1
                    goto L_0x0054
                L_0x0053:
                    r1 = r3
                L_0x0054:
                    if (r1 == 0) goto L_0x005a
                    int r1 = r1.f234841u
                    r8 = r1
                    goto L_0x005b
                L_0x005a:
                    r8 = -1
                L_0x005b:
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r10 = r10.mo113036W()
                    boolean r1 = r10 instanceof com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC
                    if (r1 == 0) goto L_0x0066
                    r3 = r10
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r3
                L_0x0066:
                    r10 = 1
                    r1 = 0
                    if (r3 == 0) goto L_0x0071
                    boolean r3 = r3.mo111293d()
                    if (r3 != r10) goto L_0x0071
                    goto L_0x0072
                L_0x0071:
                    r10 = 0
                L_0x0072:
                    if (r10 == 0) goto L_0x007e
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = p176jc.C87919d.f254459c
                    java.lang.String r3 = "renderBackend"
                    int r10 = r10.getInt(r3, r1)
                    goto L_0x007f
                L_0x007e:
                    r10 = 0
                L_0x007f:
                    r1 = r0
                    r3 = r4
                    r4 = r6
                    r5 = r7
                    r6 = r8
                    r7 = r10
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: yi0.C91452a.C91454b.C91455a.mo125389a(com.tencent.mm.plugin.appbrand.AppBrandRuntime):yi0.a$b");
            }
        }

        public C91454b(String str, String str2, int i, int i2, int i3, int i4) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "appName");
            this.f262184d = str;
            this.f262185e = str2;
            this.f262186f = i;
            this.f262187g = i2;
            this.f262188h = i3;
            this.f262189i = i4;
        }

        /* renamed from: a */
        public int compareTo(C91454b bVar) {
            C87412m.m108594g(bVar, "other");
            int compareTo = this.f262184d.compareTo(bVar.f262184d);
            if (compareTo == 0) {
                compareTo = this.f262186f - bVar.f262186f;
            }
            return (compareTo != 0 || !C81289m.C81290a.m99664b(this.f262186f)) ? compareTo : this.f262187g - bVar.f262187g;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C91454b) && compareTo((C91454b) obj) == 0;
        }

        public int hashCode() {
            return ('[' + this.f262184d + "::" + this.f262186f + "::" + this.f262187g + ']').hashCode();
        }
    }

    static {
        AppBrands.setAppBrandInfoGetterSupplier(C91453a.f262182d);
    }

    /* renamed from: a */
    public static final void m114755a(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        LinkedHashMap<C91454b, Boolean> linkedHashMap = f262181f;
        synchronized (linkedHashMap) {
            Boolean put = linkedHashMap.put(C91454b.f262183j.mo125389a(appBrandRuntime), Boolean.TRUE);
        }
        XWebSdk.setAppBrandId(appBrandRuntime.f238147j);
    }

    public String getCrashReportExtraMessage() {
        String str;
        C91454b bVar;
        LinkedList linkedList = new LinkedList();
        ICommLibReader iCommLibReader = WxaCommLibRuntimeReader.f238555a;
        linkedList.add(new C13604l("weapp_lib_version_int", Integer.valueOf(iCommLibReader != null ? iCommLibReader.mo113371a() : -1)));
        if (iCommLibReader == null || (str = iCommLibReader.mo113377i()) == null) {
            str = "unknown";
        }
        linkedList.add(new C13604l("weapp_lib_version_str", str));
        LinkedHashMap<C91454b, Boolean> linkedHashMap = f262181f;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                Iterator<C91454b> it = linkedHashMap.keySet().iterator();
                StringBuilder sb = new StringBuilder();
                while (true) {
                    C91454b next = it.next();
                    C87412m.m108593f(next, "it.next()");
                    bVar = next;
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(bVar.f262184d);
                    sb.append(',');
                }
                linkedList.add(new C13604l("weapp_id", bVar.f262184d));
                linkedList.add(new C13604l("weapp_name", bVar.f262185e));
                linkedList.add(new C13604l("weapp_version", Integer.valueOf(bVar.f262187g)));
                linkedList.add(new C13604l("weapp_service_type", Integer.valueOf(bVar.f262188h)));
                linkedList.add(new C13604l("weapp_render_backend", Integer.valueOf(bVar.f262189i)));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "this");
                String substring = sb4.substring(0, Math.max(C112550d0.m153771G(sb4, ',', 0, false, 6, (Object) null), 0));
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (!TextUtils.isEmpty(substring)) {
                    linkedList.add(new C13604l("weapp_other_ids", substring));
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        linkedList.add(new C13604l("weapp_skyline_version", SkylineLogic.INSTANCE.version()));
        linkedList.add(new C13604l("liteav_version", V2TXLivePremier.getSDKVersionStr()));
        StringBuilder sb5 = new StringBuilder();
        Iterator it4 = linkedList.iterator();
        while (it4.hasNext()) {
            C13604l lVar = (C13604l) it4.next();
            B b = lVar.f38556e;
            sb5.append((String) lVar.f38555d);
            sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb5.append(b.toString());
            sb5.append(';');
        }
        return sb5.toString();
    }
}
