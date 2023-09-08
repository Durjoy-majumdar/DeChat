package com.tencent.p014mm.plugin.appbrand.config;

import a70.C112760b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87689c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig */
public final class AppBrandGlobalSystemConfig implements Parcelable {
    public static final Parcelable.Creator<AppBrandGlobalSystemConfig> CREATOR = new C81614b();

    /* renamed from: p0 */
    public static volatile AppBrandGlobalSystemConfig f239276p0;

    /* renamed from: x0 */
    public static final AppBrandGlobalSystemConfig f239277x0;

    /* renamed from: A */
    public int f239278A;

    /* renamed from: B */
    public int f239279B;

    /* renamed from: C */
    public int f239280C;

    /* renamed from: D */
    public int f239281D;

    /* renamed from: E */
    public int f239282E;

    /* renamed from: F */
    public String[] f239283F;

    /* renamed from: G */
    public double f239284G;

    /* renamed from: H */
    public int f239285H;

    /* renamed from: I */
    public int f239286I;

    /* renamed from: J */
    public WeAppSyncVersionSetting f239287J;

    /* renamed from: K */
    public PackageManager f239288K;

    /* renamed from: L */
    public long f239289L;

    /* renamed from: M */
    public String[] f239290M;

    /* renamed from: N */
    public int f239291N;

    /* renamed from: P */
    public int f239292P;

    /* renamed from: Q */
    public int f239293Q;

    /* renamed from: R */
    public String[] f239294R;

    /* renamed from: S */
    public long f239295S;

    /* renamed from: T */
    public int f239296T;

    /* renamed from: U */
    public int f239297U;

    /* renamed from: V */
    public String f239298V;

    /* renamed from: W */
    public RelievedBuySetting f239299W = new RelievedBuySetting();

    /* renamed from: X */
    public FlagshipSetting f239300X = new FlagshipSetting();

    /* renamed from: Y */
    public double f239301Y;

    /* renamed from: Z */
    public String f239302Z;

    /* renamed from: d */
    public int f239303d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f239304e;

    /* renamed from: f */
    public int f239305f;

    /* renamed from: g */
    public int f239306g;

    /* renamed from: h */
    public int f239307h;

    /* renamed from: i */
    public int f239308i;

    /* renamed from: j */
    public int f239309j;

    /* renamed from: n */
    public int f239310n;

    /* renamed from: o */
    public int f239311o;

    /* renamed from: p */
    public int f239312p;

    /* renamed from: q */
    public String f239313q;

    /* renamed from: r */
    public String f239314r;

    /* renamed from: s */
    public HttpSetting f239315s = new HttpSetting();

    /* renamed from: t */
    public int[] f239316t;

    /* renamed from: u */
    public int f239317u;

    /* renamed from: v */
    public int f239318v;

    /* renamed from: w */
    public int f239319w;

    /* renamed from: x */
    public int f239320x;

    /* renamed from: y */
    public int f239321y;

    /* renamed from: z */
    public int f239322z;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$a */
    public class C81613a implements C32226l<JSONObject, C13598b0> {
        public C81613a() {
        }

        public Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                LinkedList linkedList = new LinkedList();
                C87689c.m109089b(jSONObject.getJSONArray("list"), new C29473c(this, linkedList));
                AppBrandGlobalSystemConfig.this.f239287J.f239354h.put(jSONObject.getLong("UsedTime"), linkedList);
            } catch (JSONException unused) {
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$b */
    public class C81614b implements Parcelable.Creator<AppBrandGlobalSystemConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandGlobalSystemConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandGlobalSystemConfig[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$c */
    public interface C81615c {

        /* renamed from: a */
        public static final String f239357a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmb) + "");

        /* renamed from: b */
        public static final int[] f239358b = new int[0];

        /* renamed from: c */
        public static final String[] f239359c = {"https://wx.qlogo.cn/"};

        /* renamed from: d */
        public static final String[] f239360d = new String[0];

        /* renamed from: e */
        public static final String[] f239361e = new String[0];
    }

    static {
        AppBrandGlobalSystemConfig appBrandGlobalSystemConfig = new AppBrandGlobalSystemConfig();
        f239277x0 = appBrandGlobalSystemConfig;
        appBrandGlobalSystemConfig.f239304e = 5;
        appBrandGlobalSystemConfig.f239305f = 1;
        appBrandGlobalSystemConfig.f239306g = 300;
        appBrandGlobalSystemConfig.f239307h = 50;
        appBrandGlobalSystemConfig.f239308i = 1048576;
        appBrandGlobalSystemConfig.f239309j = 1048576;
        appBrandGlobalSystemConfig.f239310n = 20971520;
        appBrandGlobalSystemConfig.f239311o = 200;
        appBrandGlobalSystemConfig.f239312p = 5120;
        appBrandGlobalSystemConfig.f239316t = C81615c.f239358b;
        appBrandGlobalSystemConfig.f239317u = 50;
        appBrandGlobalSystemConfig.f239318v = 11;
        appBrandGlobalSystemConfig.f239319w = 12;
        appBrandGlobalSystemConfig.f239321y = 1800;
        appBrandGlobalSystemConfig.f239322z = 307200;
        appBrandGlobalSystemConfig.f239278A = 25;
        appBrandGlobalSystemConfig.f239279B = 104857600;
        appBrandGlobalSystemConfig.f239280C = 314572800;
        appBrandGlobalSystemConfig.f239281D = 1;
        appBrandGlobalSystemConfig.f239282E = 50;
        appBrandGlobalSystemConfig.f239283F = C81615c.f239359c;
        appBrandGlobalSystemConfig.f239284G = 0.0d;
        appBrandGlobalSystemConfig.f239285H = 60;
        appBrandGlobalSystemConfig.f239286I = 60;
        appBrandGlobalSystemConfig.f239287J = new WeAppSyncVersionSetting();
        appBrandGlobalSystemConfig.f239288K = new PackageManager();
        appBrandGlobalSystemConfig.f239289L = 30;
        appBrandGlobalSystemConfig.f239290M = C81615c.f239360d;
        appBrandGlobalSystemConfig.f239291N = 10;
        appBrandGlobalSystemConfig.f239293Q = 86400;
        appBrandGlobalSystemConfig.f239294R = C81615c.f239361e;
        appBrandGlobalSystemConfig.f239295S = 60;
        appBrandGlobalSystemConfig.f239296T = 1;
        appBrandGlobalSystemConfig.f239297U = 1;
        appBrandGlobalSystemConfig.f239302Z = null;
    }

    public AppBrandGlobalSystemConfig() {
    }

    /* renamed from: a */
    public static String m100098a() {
        C86009m1 m1Var = new C86009m1(C112760b.m154231g(), "wxaapp/res/");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        return new C86009m1(m1Var, "AppService.conf").mo119971i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[SYNTHETIC, Splitter:B:18:0x0035] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig m100099b() {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig> r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.class
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = f239276p0     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x003b
            r1 = 0
            java.lang.String r2 = m100098a()     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x0011 }
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106432N(r2)     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x0011 }
            goto L_0x002d
        L_0x0011:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.AppBrandGlobalSystemConfig"
            java.lang.String r4 = "read config file, exp = %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0043 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0043 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x0043 }
            goto L_0x002c
        L_0x0021:
            java.lang.Class<tb.a> r2 = p1039tb.C90388a.class
            ra.b r2 = p224ra.C89909e.m112436a(r2)     // Catch:{ all -> 0x0043 }
            tb.a r2 = (p1039tb.C90388a) r2     // Catch:{ all -> 0x0043 }
            r2.mo56833Fn()     // Catch:{ all -> 0x0043 }
        L_0x002c:
            r2 = r1
        L_0x002d:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0035
            monitor-exit(r0)
            goto L_0x003e
        L_0x0035:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = m100100c(r2)     // Catch:{ all -> 0x0043 }
            f239276p0 = r1     // Catch:{ all -> 0x0043 }
        L_0x003b:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = f239276p0     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
        L_0x003e:
            if (r1 != 0) goto L_0x0042
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = f239277x0
        L_0x0042:
            return r1
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b():com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x02c9 A[Catch:{ Exception -> 0x0437 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x030a A[Catch:{ Exception -> 0x0437 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x034f A[Catch:{ Exception -> 0x0437 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03df A[Catch:{ Exception -> 0x0437 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig m100100c(java.lang.String r14) {
        /*
            java.lang.String r0 = "AgeAppropriateIcon"
            java.lang.String r1 = "PreDownloadList"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r14
            java.lang.String r5 = "MicroMsg.AppBrandGlobalSystemConfig"
            java.lang.String r6 = "parse json = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r3)
            r3 = 0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0437 }
            r6.<init>(r14)     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r14 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig     // Catch:{ Exception -> 0x0437 }
            r14.<init>()     // Catch:{ Exception -> 0x0437 }
            java.lang.String r7 = "HTTPSetting"
            org.json.JSONObject r7 = r6.optJSONObject(r7)     // Catch:{ Exception -> 0x0437 }
            if (r7 == 0) goto L_0x00c6
            java.lang.String r8 = "HTTPHeaderMode"
            java.lang.String r9 = ""
            java.lang.String r8 = r7.optString(r8, r9)     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = "BlackList"
            boolean r9 = r8.equals(r9)     // Catch:{ Exception -> 0x0437 }
            if (r9 == 0) goto L_0x003a
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            r8.f239329d = r2     // Catch:{ Exception -> 0x0437 }
            goto L_0x0047
        L_0x003a:
            java.lang.String r9 = "WhiteList"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0437 }
            if (r8 == 0) goto L_0x0047
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            r9 = 2
            r8.f239329d = r9     // Catch:{ Exception -> 0x0437 }
        L_0x0047:
            java.lang.String r8 = "HeaderBlackList"
            org.json.JSONArray r8 = r7.optJSONArray(r8)     // Catch:{ Exception -> 0x0437 }
            if (r8 == 0) goto L_0x006d
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r9 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0437 }
            r10.<init>()     // Catch:{ Exception -> 0x0437 }
            r9.f239330e = r10     // Catch:{ Exception -> 0x0437 }
            r9 = 0
        L_0x0059:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0437 }
            if (r9 >= r10) goto L_0x006d
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r10 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.util.ArrayList<java.lang.String> r10 = r10.f239330e     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r8.getString(r9)     // Catch:{ Exception -> 0x0437 }
            r10.add(r11)     // Catch:{ Exception -> 0x0437 }
            int r9 = r9 + 1
            goto L_0x0059
        L_0x006d:
            java.lang.String r8 = "HeaderWhiteList"
            org.json.JSONArray r8 = r7.optJSONArray(r8)     // Catch:{ Exception -> 0x0437 }
            if (r8 == 0) goto L_0x0093
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r9 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0437 }
            r10.<init>()     // Catch:{ Exception -> 0x0437 }
            r9.f239331f = r10     // Catch:{ Exception -> 0x0437 }
            r9 = 0
        L_0x007f:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0437 }
            if (r9 >= r10) goto L_0x0093
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r10 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.util.ArrayList<java.lang.String> r10 = r10.f239331f     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r8.getString(r9)     // Catch:{ Exception -> 0x0437 }
            r10.add(r11)     // Catch:{ Exception -> 0x0437 }
            int r9 = r9 + 1
            goto L_0x007f
        L_0x0093:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = "WebsocketMaxTimeoutMS"
            r10 = -1
            int r9 = r7.optInt(r9, r10)     // Catch:{ Exception -> 0x0437 }
            r8.f239332g = r9     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = "UploadMaxTimeoutMS"
            int r9 = r7.optInt(r9, r10)     // Catch:{ Exception -> 0x0437 }
            r8.f239333h = r9     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = "DownloadMaxTimeoutMS"
            int r9 = r7.optInt(r9, r10)     // Catch:{ Exception -> 0x0437 }
            r8.f239334i = r9     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = "RequestMaxTimeoutMS"
            int r9 = r7.optInt(r9, r10)     // Catch:{ Exception -> 0x0437 }
            r8.f239335j = r9     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting r8 = r14.f239315s     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = "HTTPHeaderReferer"
            java.lang.String r7 = r7.optString(r9)     // Catch:{ Exception -> 0x0437 }
            r8.f239336n = r7     // Catch:{ Exception -> 0x0437 }
        L_0x00c6:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r7 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting     // Catch:{ Exception -> 0x0437 }
            r7.<init>()     // Catch:{ Exception -> 0x0437 }
            r14.f239287J = r7     // Catch:{ Exception -> 0x0437 }
            java.lang.String r7 = "SyncVersionSetting"
            org.json.JSONObject r7 = r6.optJSONObject(r7)     // Catch:{ Exception -> 0x0437 }
            r8 = 30
            if (r7 == 0) goto L_0x012c
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r10 = r14.f239287J     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = "PullVersionInterval"
            long r12 = r10.f239350d     // Catch:{ Exception -> 0x0437 }
            long r11 = r7.optLong(r11, r12)     // Catch:{ Exception -> 0x0437 }
            r10.f239350d = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r10 = r14.f239287J     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = "PullVersionWxaUsageLastInterval"
            long r12 = r10.f239351e     // Catch:{ Exception -> 0x0437 }
            long r11 = r7.optLong(r11, r12)     // Catch:{ Exception -> 0x0437 }
            r10.f239351e = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r10 = r14.f239287J     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = "PullVersionMaxCount"
            int r12 = r10.f239352f     // Catch:{ Exception -> 0x0437 }
            int r11 = r7.optInt(r11, r12)     // Catch:{ Exception -> 0x0437 }
            r10.f239352f = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r10 = r14.f239287J     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = "PullVersionMaxCountPerRequest"
            int r12 = r10.f239353g     // Catch:{ Exception -> 0x0437 }
            int r11 = r7.optInt(r11, r12)     // Catch:{ Exception -> 0x0437 }
            r10.f239353g = r11     // Catch:{ Exception -> 0x0437 }
            boolean r10 = r7.has(r1)     // Catch:{ Exception -> 0x0437 }
            if (r10 == 0) goto L_0x0122
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r10 = r14.f239287J     // Catch:{ Exception -> 0x0437 }
            android.util.LongSparseArray r11 = new android.util.LongSparseArray     // Catch:{ Exception -> 0x0437 }
            r11.<init>()     // Catch:{ Exception -> 0x0437 }
            r10.f239354h = r11     // Catch:{ Exception -> 0x0437 }
            org.json.JSONArray r1 = r7.getJSONArray(r1)     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$a r10 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$a     // Catch:{ Exception -> 0x0437 }
            r10.<init>()     // Catch:{ Exception -> 0x0437 }
            p170ic.C87689c.m109089b(r1, r10)     // Catch:{ Exception -> 0x0437 }
        L_0x0122:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r1 = r14.f239287J     // Catch:{ Exception -> 0x0437 }
            java.lang.String r10 = "InvalidContactFreqBlockSeconds"
            long r10 = r7.optLong(r10, r8)     // Catch:{ Exception -> 0x0437 }
            r1.f239355i = r10     // Catch:{ Exception -> 0x0437 }
        L_0x012c:
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r1 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager     // Catch:{ Exception -> 0x0437 }
            r1.<init>()     // Catch:{ Exception -> 0x0437 }
            r14.f239288K = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "PackageManager"
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch:{ Exception -> 0x0437 }
            if (r1 == 0) goto L_0x016b
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r7 = r14.f239288K     // Catch:{ Exception -> 0x0437 }
            java.lang.String r10 = "CheckInterval"
            long r11 = r7.f239337d     // Catch:{ Exception -> 0x0437 }
            long r10 = r1.optLong(r10, r11)     // Catch:{ Exception -> 0x0437 }
            r7.f239337d = r10     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r7 = r14.f239288K     // Catch:{ Exception -> 0x0437 }
            java.lang.String r10 = "WithoutContactClearSeconds"
            long r11 = r7.f239338e     // Catch:{ Exception -> 0x0437 }
            long r10 = r1.optLong(r10, r11)     // Catch:{ Exception -> 0x0437 }
            r7.f239338e = r10     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r7 = r14.f239288K     // Catch:{ Exception -> 0x0437 }
            java.lang.String r10 = "ClientStorageMinMB"
            long r11 = r7.f239339f     // Catch:{ Exception -> 0x0437 }
            long r10 = r1.optLong(r10, r11)     // Catch:{ Exception -> 0x0437 }
            r7.f239339f = r10     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r7 = r14.f239288K     // Catch:{ Exception -> 0x0437 }
            java.lang.String r10 = "WholeClientStoragePercent"
            int r11 = r7.f239340g     // Catch:{ Exception -> 0x0437 }
            int r1 = r1.optInt(r10, r11)     // Catch:{ Exception -> 0x0437 }
            r7.f239340g = r1     // Catch:{ Exception -> 0x0437 }
        L_0x016b:
            java.lang.String r1 = "CDNBaseURL"
            java.lang.String r1 = r6.optString(r1)     // Catch:{ Exception -> 0x0437 }
            r14.f239313q = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "CDNPreConnectURL"
            java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.C81615c.f239357a     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = r6.optString(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239314r = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "AppMaxRunningCount"
            r7 = 5
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239304e = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "AppSharedResourceBackgroundRunningCount"
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0437 }
            r14.f239305f = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "TempFileSizeLimitTotal"
            r7 = 300(0x12c, float:4.2E-43)
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239306g = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "DownloadFileSizeLimit"
            r7 = 50
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239307h = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "MaxLocalStorageItemSize"
            r10 = 1048576(0x100000, float:1.469368E-39)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239308i = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "MaxGlobalStorageItemSize"
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239309j = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "MaxGlobalStorageSize"
            r10 = 20971520(0x1400000, float:3.526483E-38)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239310n = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "SingleWxaFileStorageCleanMbThreshold"
            r10 = 200(0xc8, float:2.8E-43)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239311o = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "GlobalWxaFileStorageCleanMbThreshold"
            r10 = 5120(0x1400, float:7.175E-42)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239312p = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "NativeBufferSizeLimitByte"
            r10 = 104857600(0x6400000, float:3.6111186E-35)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239279B = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "NativeBufferQueueLimitByte"
            r10 = 314572800(0x12c00000, float:1.21169035E-27)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239280C = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "WeUseRecallInterval"
            r10 = 86400(0x15180, float:1.21072E-40)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239293Q = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "SyncLaunchSceneList"
            org.json.JSONArray r1 = r6.optJSONArray(r1)     // Catch:{ Exception -> 0x0437 }
            if (r1 == 0) goto L_0x0213
            int r10 = r1.length()     // Catch:{ Exception -> 0x0437 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0437 }
            r14.f239316t = r10     // Catch:{ Exception -> 0x0437 }
            r10 = 0
        L_0x0202:
            int r11 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r10 >= r11) goto L_0x0213
            int[] r11 = r14.f239316t     // Catch:{ Exception -> 0x0437 }
            int r12 = r1.optInt(r10, r4)     // Catch:{ Exception -> 0x0437 }
            r11[r10] = r12     // Catch:{ Exception -> 0x0437 }
            int r10 = r10 + 1
            goto L_0x0202
        L_0x0213:
            int[] r1 = r14.f239316t     // Catch:{ Exception -> 0x0437 }
            if (r1 != 0) goto L_0x021b
            int[] r1 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.C81615c.f239358b     // Catch:{ Exception -> 0x0437 }
            r14.f239316t = r1     // Catch:{ Exception -> 0x0437 }
        L_0x021b:
            java.lang.String r1 = "StarNumberLimitation"
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239317u = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "TaskBarItemCountLimitation"
            r10 = 11
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239318v = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "NewTaskBarRecentsItemCountLimitation"
            r10 = 12
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239319w = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "TaskBarSyncUsageRecordIntervalMinute"
            r10 = 20
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239320x = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "WidgetImageFlowLimitDuration"
            r10 = 1800(0x708, float:2.522E-42)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239321y = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "WidgetImageFlowLimitMaxSize"
            r10 = 307200(0x4b000, float:4.30479E-40)
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239322z = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "WidgetDrawMinInterval"
            r10 = 25
            int r1 = r6.optInt(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239278A = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "GameMaxRunningCount"
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0437 }
            r14.f239281D = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "GameDownloadFileSizeLimit"
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239282E = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "SubContextImgDomain"
            org.json.JSONArray r1 = r6.optJSONArray(r1)     // Catch:{ Exception -> 0x0437 }
            if (r1 == 0) goto L_0x0299
            int r7 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r7 != 0) goto L_0x027f
            goto L_0x0299
        L_0x027f:
            int r7 = r1.length()     // Catch:{ Exception -> 0x0437 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0437 }
            r14.f239283F = r7     // Catch:{ Exception -> 0x0437 }
            r7 = 0
        L_0x0288:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r7 >= r10) goto L_0x029d
            java.lang.String[] r10 = r14.f239283F     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r1.optString(r7, r3)     // Catch:{ Exception -> 0x0437 }
            r10[r7] = r11     // Catch:{ Exception -> 0x0437 }
            int r7 = r7 + 1
            goto L_0x0288
        L_0x0299:
            java.lang.String[] r1 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.C81615c.f239359c     // Catch:{ Exception -> 0x0437 }
            r14.f239283F = r1     // Catch:{ Exception -> 0x0437 }
        L_0x029d:
            java.lang.String r1 = "GamePerfCollectSamplePercentage"
            r10 = 0
            double r10 = r6.optDouble(r1, r10)     // Catch:{ Exception -> 0x0437 }
            r14.f239284G = r10     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "GamePerfCollectInterval"
            r7 = 60
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239285H = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "PerformIndexReportGapInSeconds"
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239286I = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "OpendataMaxFileStorageSize"
            long r7 = r6.optLong(r1, r8)     // Catch:{ Exception -> 0x0437 }
            r14.f239289L = r7     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "PreDownloadUserNameBlackList"
            org.json.JSONArray r1 = r6.optJSONArray(r1)     // Catch:{ Exception -> 0x0437 }
            if (r1 == 0) goto L_0x02ea
            int r7 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r7 > 0) goto L_0x02d0
            goto L_0x02ea
        L_0x02d0:
            int r7 = r1.length()     // Catch:{ Exception -> 0x0437 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0437 }
            r14.f239290M = r7     // Catch:{ Exception -> 0x0437 }
            r7 = 0
        L_0x02d9:
            int r8 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r7 >= r8) goto L_0x02ee
            java.lang.String[] r8 = r14.f239290M     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = r1.optString(r7, r3)     // Catch:{ Exception -> 0x0437 }
            r8[r7] = r9     // Catch:{ Exception -> 0x0437 }
            int r7 = r7 + 1
            goto L_0x02d9
        L_0x02ea:
            java.lang.String[] r1 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.C81615c.f239360d     // Catch:{ Exception -> 0x0437 }
            r14.f239290M = r1     // Catch:{ Exception -> 0x0437 }
        L_0x02ee:
            java.lang.String r1 = "WXDataMaxRequestConcurrent"
            r7 = 10
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239291N = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "WxaWebRenderingCacheMaxStorageSizeMB"
            r7 = 100
            int r1 = r6.optInt(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239292P = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "UsePackageConfirmSubDescScopeList"
            org.json.JSONArray r1 = r6.optJSONArray(r1)     // Catch:{ Exception -> 0x0437 }
            if (r1 == 0) goto L_0x032b
            int r7 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r7 > 0) goto L_0x0311
            goto L_0x032b
        L_0x0311:
            int r7 = r1.length()     // Catch:{ Exception -> 0x0437 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0437 }
            r14.f239294R = r7     // Catch:{ Exception -> 0x0437 }
            r7 = 0
        L_0x031a:
            int r8 = r1.length()     // Catch:{ Exception -> 0x0437 }
            if (r7 >= r8) goto L_0x032f
            java.lang.String[] r8 = r14.f239294R     // Catch:{ Exception -> 0x0437 }
            java.lang.String r9 = r1.optString(r7, r3)     // Catch:{ Exception -> 0x0437 }
            r8[r7] = r9     // Catch:{ Exception -> 0x0437 }
            int r7 = r7 + 1
            goto L_0x031a
        L_0x032b:
            java.lang.String[] r1 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.C81615c.f239361e     // Catch:{ Exception -> 0x0437 }
            r14.f239294R = r1     // Catch:{ Exception -> 0x0437 }
        L_0x032f:
            java.lang.String r1 = "BluetoothBackgroundTimeoutWithoutConnectionInSeconds"
            r7 = 60
            long r7 = r6.optLong(r1, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239295S = r7     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "AppMaxBackgroundBluetoothCount"
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0437 }
            r14.f239296T = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "AppMaxBackgroundLaunchBluetoothCount"
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0437 }
            r14.f239297U = r1     // Catch:{ Exception -> 0x0437 }
            org.json.JSONObject r1 = r6.optJSONObject(r0)     // Catch:{ Exception -> 0x0437 }
            if (r1 == 0) goto L_0x0359
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch:{ Exception -> 0x0437 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0437 }
            r14.f239298V = r0     // Catch:{ Exception -> 0x0437 }
        L_0x0359:
            java.lang.String r0 = "RelievedBuySetting"
            org.json.JSONObject r0 = r6.optJSONObject(r0)     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r1 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting     // Catch:{ Exception -> 0x0437 }
            r1.<init>()     // Catch:{ Exception -> 0x0437 }
            r14.f239299W = r1     // Catch:{ Exception -> 0x0437 }
            java.lang.String r1 = "height"
            java.lang.String r7 = "width"
            java.lang.String r8 = "url"
            if (r0 == 0) goto L_0x03d0
            java.lang.String r9 = "icon_green"
            org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0437 }
            if (r9 == 0) goto L_0x0390
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r9.optString(r8)     // Catch:{ Exception -> 0x0437 }
            r10.f239341d = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            int r11 = r9.optInt(r7, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239342e = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            int r9 = r9.optInt(r1, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239343f = r9     // Catch:{ Exception -> 0x0437 }
        L_0x0390:
            java.lang.String r9 = "icon_gray"
            org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0437 }
            if (r9 == 0) goto L_0x03b0
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r9.optString(r8)     // Catch:{ Exception -> 0x0437 }
            r10.f239344g = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            int r11 = r9.optInt(r7, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239345h = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            int r9 = r9.optInt(r1, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239346i = r9     // Catch:{ Exception -> 0x0437 }
        L_0x03b0:
            java.lang.String r9 = "icon_big"
            org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0437 }
            if (r9 == 0) goto L_0x03d0
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r9.optString(r8)     // Catch:{ Exception -> 0x0437 }
            r10.f239347j = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            int r11 = r9.optInt(r7, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239348n = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting r10 = r14.f239299W     // Catch:{ Exception -> 0x0437 }
            int r9 = r9.optInt(r1, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239349o = r9     // Catch:{ Exception -> 0x0437 }
        L_0x03d0:
            java.lang.String r9 = "FlagshipSetting"
            org.json.JSONObject r9 = r6.optJSONObject(r9)     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r10 = new com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting     // Catch:{ Exception -> 0x0437 }
            r10.<init>()     // Catch:{ Exception -> 0x0437 }
            r14.f239300X = r10     // Catch:{ Exception -> 0x0437 }
            if (r9 == 0) goto L_0x041f
            java.lang.String r9 = "icon_dark"
            org.json.JSONObject r9 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0437 }
            if (r9 == 0) goto L_0x03ff
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r10 = r14.f239300X     // Catch:{ Exception -> 0x0437 }
            java.lang.String r11 = r9.optString(r8)     // Catch:{ Exception -> 0x0437 }
            r10.f239323d = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r10 = r14.f239300X     // Catch:{ Exception -> 0x0437 }
            int r11 = r9.optInt(r7, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239324e = r11     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r10 = r14.f239300X     // Catch:{ Exception -> 0x0437 }
            int r9 = r9.optInt(r1, r4)     // Catch:{ Exception -> 0x0437 }
            r10.f239325f = r9     // Catch:{ Exception -> 0x0437 }
        L_0x03ff:
            java.lang.String r9 = "icon_light"
            org.json.JSONObject r0 = r0.optJSONObject(r9)     // Catch:{ Exception -> 0x0437 }
            if (r0 == 0) goto L_0x041f
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r9 = r14.f239300X     // Catch:{ Exception -> 0x0437 }
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Exception -> 0x0437 }
            r9.f239326g = r8     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r8 = r14.f239300X     // Catch:{ Exception -> 0x0437 }
            int r7 = r0.optInt(r7, r4)     // Catch:{ Exception -> 0x0437 }
            r8.f239327h = r7     // Catch:{ Exception -> 0x0437 }
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting r7 = r14.f239300X     // Catch:{ Exception -> 0x0437 }
            int r0 = r0.optInt(r1, r4)     // Catch:{ Exception -> 0x0437 }
            r7.f239328i = r0     // Catch:{ Exception -> 0x0437 }
        L_0x041f:
            java.lang.String r0 = "WhiteScreenDetectThresholdFloatNew"
            r7 = 4606732058729906176(0x3fee666660000000, double:0.949999988079071)
            double r0 = r6.optDouble(r0, r7)     // Catch:{ Exception -> 0x0437 }
            r14.f239301Y = r0     // Catch:{ Exception -> 0x0437 }
            java.lang.String r0 = "TradeGuaranteeMenuSetting"
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.C81615c.f239357a     // Catch:{ Exception -> 0x0437 }
            java.lang.String r0 = r6.optString(r0, r3)     // Catch:{ Exception -> 0x0437 }
            r14.f239302Z = r0     // Catch:{ Exception -> 0x0437 }
            return r14
        L_0x0437:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r14)
            r0[r4] = r14
            java.lang.String r14 = "parse exception = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r14, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100100c(java.lang.String):com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239303d);
        parcel.writeInt(this.f239304e);
        parcel.writeInt(this.f239305f);
        parcel.writeInt(this.f239306g);
        parcel.writeInt(this.f239307h);
        parcel.writeInt(this.f239308i);
        parcel.writeInt(this.f239309j);
        parcel.writeInt(this.f239310n);
        parcel.writeInt(this.f239311o);
        parcel.writeInt(this.f239312p);
        parcel.writeString(this.f239313q);
        parcel.writeString(this.f239314r);
        parcel.writeParcelable(this.f239315s, i);
        parcel.writeIntArray(this.f239316t);
        parcel.writeInt(this.f239317u);
        parcel.writeInt(this.f239318v);
        parcel.writeInt(this.f239321y);
        parcel.writeInt(this.f239322z);
        parcel.writeInt(this.f239278A);
        parcel.writeInt(this.f239279B);
        parcel.writeInt(this.f239280C);
        parcel.writeInt(this.f239281D);
        parcel.writeInt(this.f239282E);
        parcel.writeStringArray(this.f239283F);
        parcel.writeDouble(this.f239284G);
        parcel.writeInt(this.f239285H);
        parcel.writeParcelable(this.f239287J, i);
        parcel.writeParcelable(this.f239288K, i);
        parcel.writeLong(this.f239289L);
        parcel.writeStringArray(this.f239290M);
        parcel.writeInt(this.f239291N);
        parcel.writeInt(this.f239293Q);
        parcel.writeInt(this.f239292P);
        parcel.writeInt(this.f239286I);
        parcel.writeStringArray(this.f239294R);
        parcel.writeLong(this.f239295S);
        parcel.writeInt(this.f239296T);
        parcel.writeInt(this.f239297U);
        parcel.writeString(this.f239298V);
        parcel.writeParcelable(this.f239299W, i);
        parcel.writeParcelable(this.f239300X, i);
        parcel.writeDouble(this.f239301Y);
        parcel.writeString(this.f239302Z);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting */
    public static final class HttpSetting implements Parcelable {
        public static final Parcelable.Creator<HttpSetting> CREATOR = new C81609a();

        /* renamed from: d */
        public int f239329d = 0;

        /* renamed from: e */
        public ArrayList<String> f239330e;

        /* renamed from: f */
        public ArrayList<String> f239331f;

        /* renamed from: g */
        public int f239332g;

        /* renamed from: h */
        public int f239333h;

        /* renamed from: i */
        public int f239334i;

        /* renamed from: j */
        public int f239335j;

        /* renamed from: n */
        public String f239336n;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$HttpSetting$a */
        public class C81609a implements Parcelable.Creator<HttpSetting> {
            public Object createFromParcel(Parcel parcel) {
                return new HttpSetting(parcel);
            }

            public Object[] newArray(int i) {
                return new HttpSetting[i];
            }
        }

        public HttpSetting() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f239329d);
            parcel.writeStringList(this.f239330e);
            parcel.writeStringList(this.f239331f);
            parcel.writeInt(this.f239332g);
            parcel.writeInt(this.f239333h);
            parcel.writeInt(this.f239334i);
            parcel.writeInt(this.f239335j);
            parcel.writeString(this.f239336n);
        }

        public HttpSetting(Parcel parcel) {
            this.f239329d = parcel.readInt();
            this.f239330e = parcel.createStringArrayList();
            this.f239331f = parcel.createStringArrayList();
            this.f239332g = parcel.readInt();
            this.f239333h = parcel.readInt();
            this.f239334i = parcel.readInt();
            this.f239335j = parcel.readInt();
            this.f239336n = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager */
    public static final class PackageManager implements Parcelable {
        public static final Parcelable.Creator<PackageManager> CREATOR = new C81610a();

        /* renamed from: d */
        public long f239337d = 86400;

        /* renamed from: e */
        public long f239338e = 864000;

        /* renamed from: f */
        public long f239339f = 256;

        /* renamed from: g */
        public int f239340g = 5;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager$a */
        public class C81610a implements Parcelable.Creator<PackageManager> {
            public Object createFromParcel(Parcel parcel) {
                return new PackageManager(parcel);
            }

            public Object[] newArray(int i) {
                return new PackageManager[i];
            }
        }

        public PackageManager() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f239337d);
            parcel.writeLong(this.f239338e);
            parcel.writeLong(this.f239339f);
            parcel.writeInt(this.f239340g);
        }

        public PackageManager(Parcel parcel) {
            this.f239337d = parcel.readLong();
            this.f239338e = parcel.readLong();
            this.f239339f = parcel.readLong();
            this.f239340g = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting */
    public static final class WeAppSyncVersionSetting implements Parcelable {
        public static final Parcelable.Creator<WeAppSyncVersionSetting> CREATOR = new C81612a();

        /* renamed from: d */
        public long f239350d = 21600;

        /* renamed from: e */
        public long f239351e = 604800;

        /* renamed from: f */
        public int f239352f = 1000;

        /* renamed from: g */
        public int f239353g = 100;

        /* renamed from: h */
        public LongSparseArray<List<String>> f239354h;

        /* renamed from: i */
        public long f239355i = 30;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting$a */
        public class C81612a implements Parcelable.Creator<WeAppSyncVersionSetting> {
            public Object createFromParcel(Parcel parcel) {
                return new WeAppSyncVersionSetting(parcel);
            }

            public Object[] newArray(int i) {
                return new WeAppSyncVersionSetting[i];
            }
        }

        public WeAppSyncVersionSetting() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f239350d);
            parcel.writeLong(this.f239351e);
            parcel.writeInt(this.f239352f);
            parcel.writeInt(this.f239353g);
            LongSparseArray<List<String>> longSparseArray = this.f239354h;
            if (longSparseArray == null || longSparseArray.size() == 0) {
                parcel.writeInt(-1);
            } else {
                parcel.writeInt(this.f239354h.size());
                for (int i2 = 0; i2 < this.f239354h.size(); i2++) {
                    parcel.writeLong(this.f239354h.keyAt(i2));
                    parcel.writeStringList(this.f239354h.valueAt(i2));
                }
            }
            parcel.writeLong(this.f239355i);
        }

        public WeAppSyncVersionSetting(Parcel parcel) {
            this.f239350d = parcel.readLong();
            this.f239351e = parcel.readLong();
            this.f239352f = parcel.readInt();
            this.f239353g = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f239354h = new LongSparseArray<>(readInt);
                for (int i = 0; i < readInt; i++) {
                    long readLong = parcel.readLong();
                    LinkedList linkedList = new LinkedList();
                    parcel.readStringList(linkedList);
                    this.f239354h.put(readLong, linkedList);
                }
            }
            this.f239355i = parcel.readLong();
        }
    }

    public AppBrandGlobalSystemConfig(Parcel parcel) {
        this.f239303d = parcel.readInt();
        this.f239304e = parcel.readInt();
        this.f239305f = parcel.readInt();
        this.f239306g = parcel.readInt();
        this.f239307h = parcel.readInt();
        this.f239308i = parcel.readInt();
        this.f239309j = parcel.readInt();
        this.f239310n = parcel.readInt();
        this.f239311o = parcel.readInt();
        this.f239312p = parcel.readInt();
        this.f239313q = parcel.readString();
        this.f239314r = parcel.readString();
        this.f239315s = (HttpSetting) parcel.readParcelable(HttpSetting.class.getClassLoader());
        this.f239316t = parcel.createIntArray();
        this.f239317u = parcel.readInt();
        this.f239318v = parcel.readInt();
        this.f239321y = parcel.readInt();
        this.f239322z = parcel.readInt();
        this.f239278A = parcel.readInt();
        this.f239279B = parcel.readInt();
        this.f239280C = parcel.readInt();
        this.f239281D = parcel.readInt();
        this.f239282E = parcel.readInt();
        this.f239283F = parcel.createStringArray();
        this.f239284G = parcel.readDouble();
        this.f239285H = parcel.readInt();
        this.f239287J = (WeAppSyncVersionSetting) parcel.readParcelable(WeAppSyncVersionSetting.class.getClassLoader());
        this.f239288K = (PackageManager) parcel.readParcelable(PackageManager.class.getClassLoader());
        this.f239289L = parcel.readLong();
        this.f239290M = parcel.createStringArray();
        this.f239291N = parcel.readInt();
        this.f239293Q = parcel.readInt();
        this.f239292P = parcel.readInt();
        this.f239286I = parcel.readInt();
        this.f239294R = parcel.createStringArray();
        this.f239295S = parcel.readLong();
        this.f239296T = parcel.readInt();
        this.f239297U = parcel.readInt();
        this.f239298V = parcel.readString();
        this.f239299W = (RelievedBuySetting) parcel.readParcelable(RelievedBuySetting.class.getClassLoader());
        this.f239300X = (FlagshipSetting) parcel.readParcelable(FlagshipSetting.class.getClassLoader());
        this.f239301Y = parcel.readDouble();
        this.f239302Z = parcel.readString();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting */
    public static final class FlagshipSetting implements Parcelable {
        public static final Parcelable.Creator<FlagshipSetting> CREATOR = new C81608a();

        /* renamed from: d */
        public String f239323d = "";

        /* renamed from: e */
        public int f239324e = 0;

        /* renamed from: f */
        public int f239325f = 0;

        /* renamed from: g */
        public String f239326g = "";

        /* renamed from: h */
        public int f239327h = 0;

        /* renamed from: i */
        public int f239328i = 0;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$FlagshipSetting$a */
        public class C81608a implements Parcelable.Creator<FlagshipSetting> {
            public Object createFromParcel(Parcel parcel) {
                return new FlagshipSetting(parcel);
            }

            public Object[] newArray(int i) {
                return new FlagshipSetting[i];
            }
        }

        public FlagshipSetting() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str = this.f239323d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            parcel.writeString(str);
            parcel.writeInt(this.f239324e);
            parcel.writeInt(this.f239325f);
            String str3 = this.f239326g;
            if (str3 != null) {
                str2 = str3;
            }
            parcel.writeString(str2);
            parcel.writeInt(this.f239327h);
            parcel.writeInt(this.f239328i);
        }

        public FlagshipSetting(Parcel parcel) {
            this.f239323d = parcel.readString();
            this.f239324e = parcel.readInt();
            this.f239325f = parcel.readInt();
            this.f239326g = parcel.readString();
            this.f239327h = parcel.readInt();
            this.f239328i = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting */
    public static final class RelievedBuySetting implements Parcelable {
        public static final Parcelable.Creator<RelievedBuySetting> CREATOR = new C81611a();

        /* renamed from: d */
        public String f239341d = "";

        /* renamed from: e */
        public int f239342e = 0;

        /* renamed from: f */
        public int f239343f = 0;

        /* renamed from: g */
        public String f239344g = "";

        /* renamed from: h */
        public int f239345h = 0;

        /* renamed from: i */
        public int f239346i = 0;

        /* renamed from: j */
        public String f239347j = "";

        /* renamed from: n */
        public int f239348n = 0;

        /* renamed from: o */
        public int f239349o = 0;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$RelievedBuySetting$a */
        public class C81611a implements Parcelable.Creator<RelievedBuySetting> {
            public Object createFromParcel(Parcel parcel) {
                return new RelievedBuySetting(parcel);
            }

            public Object[] newArray(int i) {
                return new RelievedBuySetting[i];
            }
        }

        public RelievedBuySetting() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str = this.f239341d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            parcel.writeString(str);
            parcel.writeInt(this.f239342e);
            parcel.writeInt(this.f239343f);
            String str3 = this.f239344g;
            if (str3 == null) {
                str3 = str2;
            }
            parcel.writeString(str3);
            parcel.writeInt(this.f239345h);
            parcel.writeInt(this.f239346i);
            String str4 = this.f239347j;
            if (str4 != null) {
                str2 = str4;
            }
            parcel.writeString(str2);
            parcel.writeInt(this.f239348n);
            parcel.writeInt(this.f239349o);
        }

        public RelievedBuySetting(Parcel parcel) {
            this.f239341d = parcel.readString();
            this.f239342e = parcel.readInt();
            this.f239343f = parcel.readInt();
            this.f239344g = parcel.readString();
            this.f239345h = parcel.readInt();
            this.f239346i = parcel.readInt();
            this.f239347j = parcel.readString();
            this.f239348n = parcel.readInt();
            this.f239349o = parcel.readInt();
        }
    }
}
