package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import a70.C112760b;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import rx3.C36568h;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.e */
public final class C18054e {

    /* renamed from: a */
    public static final C18054e f49894a = new C18054e();

    /* renamed from: b */
    public static final AtomicBoolean f49895b = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.e$a */
    public static final class C18055a implements TPPlayerMgr.OnLogListener {
        /* renamed from: d */
        public int mo22568d(String str, String str2) {
            Log.m105918d("MicroMsg.AppBrand.TPPlayer", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
            return 0;
        }

        /* renamed from: e */
        public int mo22569e(String str, String str2) {
            Log.m105920e("MicroMsg.AppBrand.TPPlayer", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
            return 0;
        }

        /* renamed from: i */
        public int mo22570i(String str, String str2) {
            Log.m105924i("MicroMsg.AppBrand.TPPlayer", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
            return 0;
        }

        /* renamed from: v */
        public int mo22571v(String str, String str2) {
            Log.m105926v("MicroMsg.AppBrand.TPPlayer", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
            return 0;
        }

        /* renamed from: w */
        public int mo22572w(String str, String str2) {
            Log.m105928w("MicroMsg.AppBrand.TPPlayer", str + XVFSFile.PATH_SEPARATOR_CHAR + str2);
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.e$b */
    public static final class C18056b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18056b f49896d = new C18056b();

        public C18056b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            try {
                C18054e eVar = C18054e.f49894a;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                eVar.mo22566d(context, true);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AppBrand.ThumbPlayerInitLogic", th, "initializer#isThumbPlayerAvailable, initIfNeed fail", new Object[0]);
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        C36568h.m40985a(C18056b.f49896d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[Catch:{ Exception -> 0x009d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo22563a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x0062
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = r2.getQuery()     // Catch:{ Exception -> 0x009d }
            r4 = 0
            if (r3 == 0) goto L_0x001a
            boolean r3 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x009d }
            if (r3 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r3 = 0
            goto L_0x001b
        L_0x001a:
            r3 = 1
        L_0x001b:
            if (r3 != 0) goto L_0x0060
            java.lang.String r3 = "vid"
            java.lang.String r3 = r2.getQueryParameter(r3)     // Catch:{ Exception -> 0x009d }
            if (r3 != 0) goto L_0x0027
            r3 = r1
        L_0x0027:
            java.lang.String r5 = "format_id"
            java.lang.String r5 = r2.getQueryParameter(r5)     // Catch:{ Exception -> 0x009d }
            if (r5 != 0) goto L_0x0030
            r5 = r1
        L_0x0030:
            boolean r6 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x009d }
            if (r6 == 0) goto L_0x003d
            boolean r6 = z04.C112551y.m153811k(r5)     // Catch:{ Exception -> 0x009d }
            if (r6 == 0) goto L_0x003d
            goto L_0x0060
        L_0x003d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r6.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r2 = r2.getQuery()     // Catch:{ Exception -> 0x009d }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x009d }
            java.lang.String r2 = z04.C112551y.m153814n(r8, r2, r1, r4)     // Catch:{ Exception -> 0x009d }
            r6.append(r2)     // Catch:{ Exception -> 0x009d }
            r6.append(r3)     // Catch:{ Exception -> 0x009d }
            r2 = 95
            r6.append(r2)     // Catch:{ Exception -> 0x009d }
            r6.append(r5)     // Catch:{ Exception -> 0x009d }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x009d }
            goto L_0x0063
        L_0x0060:
            r2 = r8
            goto L_0x0063
        L_0x0062:
            r2 = r1
        L_0x0063:
            java.nio.charset.Charset r3 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x009d }
            byte[] r3 = r2.getBytes(r3)     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = p823sg.C90193h.m112878f(r3)     // Catch:{ Exception -> 0x009d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r4.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = "getFileIdFromVideoUrl: newUrl: "
            r4.append(r5)     // Catch:{ Exception -> 0x009d }
            r4.append(r2)     // Catch:{ Exception -> 0x009d }
            java.lang.String r2 = "   url:"
            r4.append(r2)     // Catch:{ Exception -> 0x009d }
            r4.append(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = "  fileId:"
            r4.append(r8)     // Catch:{ Exception -> 0x009d }
            r4.append(r3)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x009d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = "fileId"
            gy3.C87412m.m108593f(r3, r8)     // Catch:{ Exception -> 0x009d }
            return r3
        L_0x009d:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getFileIdFromVideoUrl  error: "
            r2.append(r3)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e.mo22563a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0013 A[Catch:{ Exception -> 0x000e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0014 A[Catch:{ Exception -> 0x000e }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo22564b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L_0x0010
            boolean r3 = z04.C112551y.m153811k(r6)     // Catch:{ Exception -> 0x000e }
            if (r3 == 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r3 = 0
            goto L_0x0011
        L_0x000e:
            r6 = move-exception
            goto L_0x001d
        L_0x0010:
            r3 = 1
        L_0x0011:
            if (r3 == 0) goto L_0x0014
            return r1
        L_0x0014:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r3 = r5.mo22565c()     // Catch:{ Exception -> 0x000e }
            long r0 = r3.decodeLong(r6, r1)     // Catch:{ Exception -> 0x000e }
            return r0
        L_0x001d:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e.mo22564b(java.lang.String):long");
    }

    /* renamed from: c */
    public final MMKVSlotManager mo22565c() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("ttplayer_preload_file");
        C87412m.m108593f(mmkv, "getMMKV(MMKV_TTPLAYER_PRELOAD)");
        return new MMKVSlotManager(mmkv, 1800);
    }

    /* renamed from: d */
    public final void mo22566d(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        if (!f49895b.compareAndSet(false, true)) {
            Log.m105918d("MicroMsg.AppBrand.ThumbPlayerInitLogic", "initIfNeed, already init");
            return;
        }
        TPPlayerMgr.setOnLogListener(new C18055a());
        TPPlayerMgr.initSdk(context.getApplicationContext(), "60303", 1);
        Log.m105918d("MicroMsg.AppBrand.ThumbPlayerInitLogic", "initIfNeed, useIsolateProxy: false");
        TPPlayerMgr.setProxyEnable(true);
        TPPlayerMgr.setProxyServiceType(100);
        TPDownloadProxyHelper.setUseService(false);
        Context applicationContext = context.getApplicationContext();
        C87412m.m108593f(applicationContext, "context.applicationContext");
        String a = C104818d.m140485a();
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(100);
        Log.m105918d("MicroMsg.AppBrand.ThumbPlayerInitLogic", "getCacheDirs, processName: " + a);
        C86009m1 m1Var = new C86009m1(C112760b.m154195C(), "ThumbVideoCache/TPDownload");
        C86013q1.m106461v(m1Var.mo119971i());
        C86009m1 m1Var2 = new C86009m1(m1Var, a);
        C86013q1.m106461v(m1Var2.mo119971i());
        String i = new C86009m1(m1Var2, XWalkPlugin.PRIVATE_CACHE_DIR_NAME).mo119971i();
        C86013q1.m106461v(i);
        String i2 = C86013q1.m106448i(i, true);
        String i3 = new C86009m1(m1Var2, "data").mo119971i();
        C86013q1.m106461v(i3);
        String i4 = C86013q1.m106448i(i3, true);
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("VodCacheEnable", true);
                jSONObject.put("MemoryAjustInterval", Integer.MAX_VALUE);
            } catch (Exception unused) {
            }
        }
        jSONObject.put("EnableOnlyHttpsUseCurl", false);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject()\n           …              .toString()");
        tPDownloadProxy.init(applicationContext, new TPDLProxyInitParam(TPPlayerConfig.getPlatform(), TPPlayerConfig.getAppVersionName(applicationContext), TPPlayerConfig.getGuid(), i2, i4, jSONObject2));
        if (z) {
            tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_MAX_USE_MEMORY_MB, 5);
        }
        tPDownloadProxy.setMaxStorageSizeMB(512);
    }

    /* renamed from: e */
    public final void mo22567e(String str, long j) {
        try {
            String a = mo22563a(str);
            if (!(C112551y.m153811k(a))) {
                ((MultiProcessMMKV) mo22565c().getSlotForWrite()).encode(a, j);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.ThumbPlayerInitLogic", e, "", new Object[0]);
        }
    }
}
