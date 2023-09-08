package com.tencent.p014mm.plugin.lite;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.LiteAppShowStatusChangeEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.debug.C69112a;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.lite.storage.C115508j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import f40.C86718e;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p1204oa.C117728a;
import p156gj.C87203t;
import p206nj.C88957l;
import p244tt.C118512d;
import p244tt.C14088e;
import p823sg.C90193h;
import p979ia.C117147b;
import tw3.C118552d;
import u24.C90598g;
import vw3.C118708b;
import wc3.C15133e0;
import wc3.C78536j0;

/* renamed from: com.tencent.mm.plugin.lite.f */
public class C115478f extends LiteAppCenter implements LiteAppCenter.IWxaLiteAppCallback {

    /* renamed from: a */
    public static final List<String> f346206a = Arrays.asList(new String[]{"wxalitecce81f5fba338df4dd5f74df8229c600", "wxalitea95723728764364c6f996b4bdab3af52"});

    /* renamed from: b */
    public static final boolean[] f346207b = {false};

    /* renamed from: com.tencent.mm.plugin.lite.f$c */
    public class C42490c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f115020d;

        /* renamed from: e */
        public final /* synthetic */ String f115021e;

        /* renamed from: f */
        public final /* synthetic */ boolean f115022f;

        /* renamed from: g */
        public final /* synthetic */ long f115023g;

        /* renamed from: h */
        public final /* synthetic */ long f115024h;

        public C42490c(C115478f fVar, String str, String str2, boolean z, long j, long j2) {
            this.f115020d = str;
            this.f115021e = str2;
            this.f115022f = z;
            this.f115023g = j;
            this.f115024h = j2;
        }

        public void run() {
            LiteAppShowStatusChangeEvent liteAppShowStatusChangeEvent = new LiteAppShowStatusChangeEvent();
            LiteAppShowStatusChangeEvent.C40132a aVar = liteAppShowStatusChangeEvent.f107623d;
            aVar.f107624a = this.f115020d;
            aVar.f107625b = this.f115021e;
            aVar.f107628e = this.f115022f;
            aVar.f107626c = Long.valueOf(this.f115023g);
            liteAppShowStatusChangeEvent.f107623d.f107627d = Long.valueOf(this.f115024h);
            liteAppShowStatusChangeEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.f$a */
    public class C115479a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f346208d;

        /* renamed from: e */
        public final /* synthetic */ int f346209e;

        /* renamed from: f */
        public final /* synthetic */ String f346210f;

        /* renamed from: g */
        public final /* synthetic */ String f346211g;

        public C115479a(C115478f fVar, String str, int i, String str2, String str3) {
            this.f346208d = str;
            this.f346209e = i;
            this.f346210f = str2;
            this.f346211g = str3;
        }

        public void run() {
            ((C14088e) C86312j.m106911c(C14088e.class)).onStoreSendResult(this.f346208d, this.f346209e, this.f346210f, this.f346211g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.f$b */
    public class C115480b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f346212d;

        /* renamed from: e */
        public final /* synthetic */ List f346213e;

        public C115480b(C115478f fVar, String str, List list) {
            this.f346212d = str;
            this.f346213e = list;
        }

        public void run() {
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13531v3(this.f346212d, this.f346213e);
        }
    }

    public static void initLib() {
        boolean[] zArr = f346207b;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    LiteAppCenter.initLib();
                    C88957l.m111078n("liteapphelper");
                    C88957l.m111078n("mmv8");
                    C88957l.m111078n("flutter");
                    C88957l.m111078n("wechatlv");
                    zArr[0] = true;
                }
            }
        }
    }

    public void dataReporting(String str, String str2) {
        if (str != null && str2 != null) {
            String replaceAll = str2.replaceAll(",", ";");
            reportKv(23449, str + "," + replaceAll);
        }
    }

    public String[] getAppInfo(String str) {
        return new String[0];
    }

    public LiteAppCenter.HostInfo getHostInfo() {
        LiteAppCenter.HostInfo hostInfo = new LiteAppCenter.HostInfo();
        hostInfo.system = "Android";
        hostInfo.systemVersion = "Android " + Build.VERSION.RELEASE;
        hostInfo.appVersion = BuildInfo.CLIENT_VERSION;
        hostInfo.appRevision = BuildInfo.REV;
        hostInfo.appBranch = BuildInfo.BUILD_TAG;
        hostInfo.appBuildJob = BuildInfo.HOSTNAME;
        hostInfo.appBuildTime = BuildInfo.TIME;
        hostInfo.appFlavor = BuildInfo.IS_FLAVOR_RED ? "red" : "release";
        return hostInfo;
    }

    public WxaLiteAppBaselibInfo getLiteAppBaselibInfo(String str) {
        Bundle bundle;
        initLib();
        C115492q.m162360g().getClass();
        try {
            bundle = C115508j.m162396a("getLiteAppBaselibInfo", str, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e, "", new Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            Log.m105924i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle, majorVersion:" + str);
            return null;
        }
        bundle.setClassLoader(WxaLiteAppBaselibInfo.class.getClassLoader());
        return (WxaLiteAppBaselibInfo) bundle.getParcelable("LiteAppBaselib");
    }

    public String getLiteAppRoot() {
        return C72994y1.f212834c;
    }

    public String getOfflineResource(String str, String str2, String str3) {
        C115492q g = C115492q.m162360g();
        if (!g.f346249c.isEmpty()) {
            for (Map.Entry next : g.f346249c.entrySet()) {
                Bundle bundle = new Bundle();
                bundle.putString("appId", str);
                bundle.putString("tag", str2);
                bundle.putString("url", str3);
                Bundle bundle2 = (Bundle) C80907o.m98783f((String) next.getKey(), bundle, ((C80916r) next.getValue()).getClass());
                if (bundle2 != null && !Util.isNullOrNil(bundle2.getString("result"))) {
                    return bundle2.getString("result");
                }
            }
        }
        return null;
    }

    public String getRecentForward(String str) {
        String F5 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5(String.format("%s%s", new Object[]{"clicfg_liteapp_fw_and_", str}), "0");
        if (!(!Util.isNullOrNil(F5) && F5.equalsIgnoreCase("1"))) {
            C115669n.INSTANCE.idkeyStat(1865, 10, 1, false);
            return "";
        }
        C115669n.INSTANCE.idkeyStat(1865, 11, 1, false);
        ArrayList<C78536j0> Bv0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Bv0();
        if (Bv0 != null && !Bv0.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (i < Bv0.size()) {
                try {
                    C78536j0 j0Var = Bv0.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MimeTypes.BASE_TYPE_TEXT, j0Var.f230020b);
                    jSONObject.put("content", MD5Util.getMD5String(j0Var.f230019a));
                    jSONObject.put("icon", j0Var.f230021c);
                    jSONObject.put("iconType", "img");
                    jSONArray.put(jSONObject);
                    i++;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMWxaLiteAppCenter", e, "getRecentForward fail.", new Object[0]);
                }
            }
            String d = C90598g.m113505d(jSONArray.toString());
            Log.m105925i("MicroMsg.MMWxaLiteAppCenter", "result0 %s", d);
            return d;
        }
        return "";
    }

    public String getRecentForwardTitle(String str) {
        return MMApplicationContext.getString(C0966R.string.m5u);
    }

    public String getRegionInfo(String str, String str2) {
        return ((C118512d) C86312j.m106911c(C118512d.class)).getRegionInfo(str, str2);
    }

    public LiteAppCenter.SystemInfo getSystemInfo() {
        LiteAppCenter.SystemInfo systemInfo = new LiteAppCenter.SystemInfo();
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isConnected(context)) {
            systemInfo.networkType = "none";
        } else if (NetStatusUtil.is2G(context)) {
            systemInfo.networkType = "2g";
        } else if (NetStatusUtil.is3G(context)) {
            systemInfo.networkType = "3g";
        } else if (NetStatusUtil.is4G(context)) {
            systemInfo.networkType = "4g";
        } else if (NetStatusUtil.isWifi(context)) {
            systemInfo.networkType = "wifi";
        } else {
            systemInfo.networkType = "unknown";
        }
        float f = context.getResources().getDisplayMetrics().density;
        systemInfo.brand = Build.MANUFACTURER;
        systemInfo.model = C87203t.m108275k();
        systemInfo.language = LocaleUtil.getCurrentLanguage(context);
        systemInfo.platform = "Android";
        systemInfo.system = "Android" + Build.VERSION.RELEASE;
        systemInfo.fontScale = LiteAppCenter.fontScaleFollowSystem ? context.getResources().getConfiguration().fontScale : LiteAppCenter.fontScale;
        systemInfo.version = BuildInfo.CLIENT_VERSION;
        systemInfo.pixelRatio = f;
        systemInfo.navigationBarHeight = ((float) C75044y4.m89991c(context)) / f;
        systemInfo.statusBarHeight = ((float) C75044y4.m89996h(context)) / f;
        systemInfo.titleBarHeight = ((float) C75044y4.m89989a(context)) / f;
        systemInfo.darkMode = C85875k4.m106211z();
        return systemInfo;
    }

    public String getUin() {
        int d = C86718e.C86720e.m107579d();
        return C90193h.m112878f(("" + d).getBytes());
    }

    public String getUserAgent() {
        String str;
        String str2;
        NetworkInfo activeNetworkInfo;
        String str3 = "NoNet";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        str3 = "WIFI";
                    } else if (!(type == 2 || type == 3 || type == 4 || type == 5)) {
                        str3 = "OtherNet";
                    }
                }
                str3 = "4G";
            }
            String[] strArr = Build.SUPPORTED_ABIS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                str = "arm64";
                if (i >= length) {
                    str2 = "arm32";
                    break;
                } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equals(strArr[i])) {
                    str2 = str;
                    break;
                } else {
                    i++;
                }
            }
            Context context = C117147b.f350981b;
            if (context != null) {
                PackageManager packageManager = context.getPackageManager();
                String str4 = C117147b.f350982c;
                if (str4 != null) {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str4, 0);
                    String str5 = packageInfo.versionName;
                    int i2 = packageInfo.versionCode;
                    Object[] objArr = new Object[10];
                    objArr[0] = Build.VERSION.RELEASE;
                    objArr[1] = C87203t.m108275k();
                    objArr[2] = Build.ID;
                    objArr[3] = str5;
                    objArr[4] = Integer.valueOf(i2);
                    objArr[5] = BuildInfo.CLIENT_VERSION;
                    objArr[6] = str3;
                    objArr[7] = LocaleUtil.getApplicationLanguage();
                    objArr[8] = str2;
                    if (!BuildInfo.IS_ARM64) {
                        str = "arm32";
                    }
                    objArr[9] = str;
                    String format = String.format("Mozilla/5.0 (Linux; Android %s; %s Build/%s; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/66.0.3359.126 MQQBrowser/6.2 TBS/045140 Mobile Safari/537.36 MMWEBID/3371 MicroMessenger/%s.%d(%s) Process/lite NetType/%s Language/%s ABI/%s WeChat/%s", objArr);
                    Log.m105924i("MicroMsg.MMWxaLiteAppCenter", "get user agent:" + format);
                    return format;
                }
                C87412m.m108603p("packageName");
                throw null;
            }
            C87412m.m108603p("appContext");
            throw null;
        } catch (Exception unused) {
            return System.getProperty("http.agent");
        }
    }

    public void hideKeyboard() {
        C118708b bVar = C118552d.m167207g().f354801e;
        if (bVar != null && (bVar.getActivity() instanceof C117728a)) {
            ((C117728a) bVar.getActivity()).hideKeyboard();
        }
    }

    public void onShowStatusChange(String str, String str2, long j, long j2, boolean z) {
        new MMHandler(Looper.getMainLooper()).post(new C42490c(this, str, str2, z, j, j2));
    }

    public void onStoreSendResult(String str, int i, String str2, String str3) {
        new MMHandler(Looper.getMainLooper()).post(new C115479a(this, str, i, str2, str3));
    }

    public void onStoreSetData(String str, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            arrayList.add(new C56832d.C56834b(strArr[i], strArr2[i]));
        }
        new MMHandler(Looper.getMainLooper()).post(new C115480b(this, str, arrayList));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openPage(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.MMWxaLiteAppCenter"
            java.lang.String r1 = "transparent"
            initLib()
            r2 = 0
            r3 = 1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0019 }
            r4.<init>(r15)     // Catch:{ JSONException -> 0x0019 }
            boolean r5 = r4.has(r1)     // Catch:{ JSONException -> 0x0019 }
            if (r5 == 0) goto L_0x0027
            boolean r4 = r4.getBoolean(r1)     // Catch:{ JSONException -> 0x0019 }
            goto L_0x0028
        L_0x0019:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r4 = r4.toString()
            r5[r2] = r4
            java.lang.String r4 = "openPage fail. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)
        L_0x0027:
            r4 = 0
        L_0x0028:
            com.tencent.mm.plugin.lite.logic.q r5 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()
            com.tencent.liteapp.storage.WxaLiteAppInfo r5 = r5.mo175472j(r12)
            if (r5 != 0) goto L_0x0045
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r12
            r1[r3] = r13
            r12 = 2
            r1[r12] = r14
            r12 = 3
            r1[r12] = r15
            java.lang.String r12 = "openPage fail. appId:%s, path:%s query:%s, config:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r12, r1)
            return
        L_0x0045:
            com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo r12 = new com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo
            r12.<init>()
            java.lang.String r15 = r5.f339290d
            java.lang.String r0 = "<set-?>"
            gy3.C87412m.m108594g(r15, r0)
            r12.f346214d = r15
            java.lang.String r15 = r5.f339295i
            r12.f346215e = r15
            java.lang.String r15 = r5.f339294h
            r12.f346216f = r15
            long r5 = java.lang.System.currentTimeMillis()
            r12.f346220j = r5
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r0 = "path"
            r15.putString(r0, r13)
            java.lang.String r13 = "query"
            r15.putString(r13, r14)
            if (r4 == 0) goto L_0x0075
            r15.putBoolean(r1, r3)
        L_0x0075:
            java.lang.String r14 = r15.getString(r0)
            r12.f346217g = r14
            java.lang.String r13 = r15.getString(r13)
            r12.f346218h = r13
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            r13.addFlags(r14)
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppProxyUI> r0 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppProxyUI.class
            r13.setClass(r14, r0)
            java.lang.String r14 = "WxaLiteAppLaunchInfo"
            r13.putExtra(r14, r12)
            java.lang.String r12 = "bundle"
            r13.putExtra(r12, r15)
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r13)
            java.lang.Object[] r4 = r14.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/lite/MMWxaLiteAppCenter"
            java.lang.String r6 = "openPage"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r12
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r13 = r14.mo10231a(r2)
            android.content.Intent r13 = (android.content.Intent) r13
            r12.startActivity(r13)
            java.lang.String r4 = "com/tencent/mm/plugin/lite/MMWxaLiteAppCenter"
            java.lang.String r5 = "openPage"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.C115478f.openPage(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void reloadDebug(String str, String str2) {
        C69112a.m81426a(str, str2);
    }

    public void reportIdKey(long j, long j2, long j3) {
        C115669n.INSTANCE.mo175913w(j, j2, j3);
    }

    public void reportKv(int i, String str) {
        C115669n.INSTANCE.kvStat(i, str);
    }
}
