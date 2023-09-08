package com.tencent.luggage.wxa.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import java.util.HashMap;
import java.util.Map;
import p736wc.C38051a;

public abstract class WxaCriticalDataProvider extends ContentProvider {

    /* renamed from: f */
    public static final UriMatcher f235039f = new UriMatcher(-1);

    /* renamed from: g */
    public static final SparseArray<String> f235040g;

    /* renamed from: d */
    public volatile ISQLiteDatabase f235041d;

    /* renamed from: e */
    public final Map<Class<?>, Object> f235042e = new HashMap();

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f235040g = sparseArray;
        sparseArray.put(1, "WxaAttributesTable");
        sparseArray.put(2, "LaunchWxaAppPBTable");
        sparseArray.put(4, "DevPkgLaunchExtInfo");
        sparseArray.put(5, "AppBrandWxaPkgManifestRecord");
        sparseArray.put(7, "PersistentWxaSyncInvalidContactCmd");
        int i = 0;
        while (true) {
            SparseArray<String> sparseArray2 = f235040g;
            if (i < sparseArray2.size()) {
                f235039f.addURI(C38051a.f100592a, sparseArray2.valueAt(i), sparseArray2.keyAt(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo111461a() {
        if (this.f235041d == null) {
            this.f235041d = mo111463c();
        }
        return this.f235041d != null;
    }

    /* renamed from: b */
    public final <T> T mo111462b(Class<T> cls) {
        return ((HashMap) this.f235042e).get(cls);
    }

    /* renamed from: c */
    public abstract ISQLiteDatabase mo111463c();

    public int delete(Uri uri, String str, String[] strArr) {
        if (!mo111461a()) {
            return -1;
        }
        if (f235039f.match(uri) != 7) {
            return 0;
        }
        if (strArr == null || strArr.length < 1) {
            return -1;
        }
        String str2 = strArr[0];
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        return ((WxaSyncCmdPersistentStorage) mo111462b(WxaSyncCmdPersistentStorage.class)).mo56571d(str2) ? 1 : 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r26, android.content.ContentValues r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.i> r3 = com.tencent.p014mm.plugin.appbrand.config.C81660i.class
            java.lang.String r4 = "CONTENT_KEY_BATCH_SYNC_PROTO"
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.h3> r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81258h3.class
            boolean r6 = r25.mo111461a()
            r7 = 0
            if (r6 != 0) goto L_0x0014
            return r7
        L_0x0014:
            android.content.UriMatcher r6 = f235039f
            int r6 = r6.match(r0)
            java.lang.String r8 = "CONTENT_KEY_SYNC_PROTO"
            java.lang.String r9 = "Luggage.WxaCriticalDataProvider"
            java.lang.String r10 = "CONTENT_KEY_APPID"
            r12 = 1
            if (r6 == r12) goto L_0x02ab
            r3 = 2
            if (r6 == r3) goto L_0x0280
            java.lang.String r4 = "insert LaunchExtInfoForDevPkg, e = %s"
            r8 = 4
            if (r6 == r8) goto L_0x0254
            r13 = 5
            if (r6 == r13) goto L_0x0031
            r2 = r7
            goto L_0x0305
        L_0x0031:
            java.lang.String r6 = "CONTENT_KEY_ACTION"
            java.lang.String r6 = r2.getAsString(r6)
            r6.getClass()
            int r14 = r6.hashCode()
            switch(r14) {
                case -1297425212: goto L_0x0079;
                case -946499957: goto L_0x006e;
                case -214401522: goto L_0x0063;
                case 396944: goto L_0x0058;
                case 755152062: goto L_0x004d;
                case 1067970480: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0084
        L_0x0042:
            java.lang.String r14 = "ACTION_FLUSH_WXA_DEBUG_PKG_INFO"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x004b
            goto L_0x0084
        L_0x004b:
            r6 = 5
            goto L_0x0085
        L_0x004d:
            java.lang.String r14 = "ACIION_UPDATE_WITHOUT_PLUGINCODE_INFO"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0056
            goto L_0x0084
        L_0x0056:
            r6 = 4
            goto L_0x0085
        L_0x0058:
            java.lang.String r14 = "ACTION_UPDATE_PLUGINCODE_LIST"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0061
            goto L_0x0084
        L_0x0061:
            r6 = 3
            goto L_0x0085
        L_0x0063:
            java.lang.String r14 = "ACTION_UPDATE_PKG_INFO"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x006c
            goto L_0x0084
        L_0x006c:
            r6 = 2
            goto L_0x0085
        L_0x006e:
            java.lang.String r14 = "ACTION_FLUSH_WXA_PKG_VERSION_INFO"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            r6 = 1
            goto L_0x0085
        L_0x0079:
            java.lang.String r14 = "ACTION_UPDATE_MODULE_LIST"
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r6 = 0
            goto L_0x0085
        L_0x0084:
            r6 = -1
        L_0x0085:
            java.lang.String r14 = "CONTENT_KEY_CODE_TYPE"
            java.lang.String r7 = "CONTENT_KEY_MODULE_NAME"
            java.lang.String r11 = "CONTENT_KEY_PKG_DOWNLOAD_URL"
            java.lang.String r13 = "CONTENT_KEY_PKG_VERSION_MD5"
            java.lang.String r8 = "CONTENT_KEY_PKG_VERSION"
            java.lang.String r15 = "CONTENT_KEY_PKG_TYPE"
            if (r6 == 0) goto L_0x0218
            if (r6 == r12) goto L_0x01f0
            if (r6 == r3) goto L_0x01c2
            r4 = 3
            if (r6 == r4) goto L_0x0120
            r4 = 4
            if (r6 == r4) goto L_0x00f0
            r4 = 5
            if (r6 == r4) goto L_0x00a2
            goto L_0x0304
        L_0x00a2:
            java.lang.String r4 = r2.getAsString(r10)
            java.lang.Integer r6 = r2.getAsInteger(r15)
            int r6 = r6.intValue()
            java.lang.String r7 = r2.getAsString(r13)
            java.lang.String r19 = r2.getAsString(r11)
            java.lang.Object r2 = r1.mo111462b(r5)
            r16 = r2
            com.tencent.mm.plugin.appbrand.appcache.h3 r16 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r16
            r21 = 0
            long r23 = java.lang.System.currentTimeMillis()
            r17 = r4
            r18 = r6
            r20 = r7
            boolean r2 = r16.mo113526j(r17, r18, r19, r20, r21, r23)
            if (r2 == 0) goto L_0x0304
            java.util.Locale r2 = java.util.Locale.US
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            r5[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5[r12] = r4
            r5[r3] = r7
            java.lang.String r3 = "%s_%d_%s"
            java.lang.String r2 = java.lang.String.format(r2, r3, r5)
            int r2 = r2.hashCode()
            long r2 = (long) r2
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r2)
            return r0
        L_0x00f0:
            java.lang.String r3 = r2.getAsString(r10)
            java.lang.String r4 = r2.getAsString(r7)
            java.lang.Integer r0 = r2.getAsInteger(r8)
            int r0 = r0.intValue()
            java.lang.Integer r6 = r2.getAsInteger(r14)
            int r6 = r6.intValue()
            java.lang.String r7 = r2.getAsString(r13)
            java.lang.Integer r2 = r2.getAsInteger(r15)
            int r8 = r2.intValue()
            java.lang.Object r2 = r1.mo111462b(r5)
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r2
            r5 = r0
            r2.mo113515D(r3, r4, r5, r6, r7, r8)
            goto L_0x0304
        L_0x0120:
            java.lang.String r0 = "CONTENT_KEY_PLUGINCODE_LIST"
            java.lang.String r0 = r2.getAsString(r0)
            java.lang.Object r2 = r1.mo111462b(r5)
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r2
            java.util.List r0 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo.m100123a(r0)
            r2.getClass()
            if (r0 == 0) goto L_0x0304
            r3 = r0
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0304
            java.lang.Object[] r4 = new java.lang.Object[r12]
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "MicroMsg.AppBrandWxaPkgStorage"
            java.lang.String r5 = "updatePluginCodeList size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0157:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0304
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo r3 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo) r3
            java.lang.String r4 = r3.f239437d
            java.lang.String r7 = r3.f239439f
            int r6 = r3.f239438e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r3 != 0) goto L_0x0157
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r3 != 0) goto L_0x0157
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0157
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 == 0) goto L_0x0182
            goto L_0x0157
        L_0x0182:
            java.lang.String r3 = "__PLUGINCODE__"
            java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r3)
            r5 = 0
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r8 == 0) goto L_0x01ba
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x01a0
            java.lang.String r3 = ""
            goto L_0x01b1
        L_0x01a0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r8 = 36
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L_0x01b1:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4 = r3
            goto L_0x01bb
        L_0x01ba:
            r4 = 0
        L_0x01bb:
            r5 = 0
            r8 = 0
            r3 = r2
            r3.mo113527k(r4, r5, r6, r7, r8)
            goto L_0x0157
        L_0x01c2:
            java.lang.String r10 = r2.getAsString(r10)
            java.lang.String r13 = r2.getAsString(r7)
            java.lang.Integer r0 = r2.getAsInteger(r8)
            int r11 = r0.intValue()
            java.lang.Integer r0 = r2.getAsInteger(r14)
            int r12 = r0.intValue()
            java.lang.String r0 = "CONTENT_KEY_PKGINFO_LIST"
            java.lang.String r0 = r2.getAsString(r0)
            java.lang.Object r2 = r1.mo111462b(r5)
            r9 = r2
            com.tencent.mm.plugin.appbrand.appcache.h3 r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r9
            java.util.List r14 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaWidgetInfo.m100128a(r0)
            r9.mo113513B(r10, r11, r12, r13, r14)
            goto L_0x0304
        L_0x01f0:
            java.lang.String r3 = r2.getAsString(r10)
            java.lang.Integer r0 = r2.getAsInteger(r15)
            int r4 = r0.intValue()
            java.lang.Integer r0 = r2.getAsInteger(r8)
            int r0 = r0.intValue()
            java.lang.String r6 = r2.getAsString(r13)
            java.lang.String r7 = r2.getAsString(r11)
            java.lang.Object r2 = r1.mo111462b(r5)
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r2
            r5 = r0
            r2.mo113527k(r3, r4, r5, r6, r7)
            goto L_0x0304
        L_0x0218:
            java.lang.String r0 = r2.getAsString(r10)     // Catch:{ Exception -> 0x0249 }
            java.lang.Integer r3 = r2.getAsInteger(r15)     // Catch:{ Exception -> 0x0249 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0249 }
            java.lang.Integer r6 = r2.getAsInteger(r8)     // Catch:{ Exception -> 0x0249 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0249 }
            java.lang.String r7 = "CONTENT_KEY_MODULE_LIST_JSON"
            java.lang.String r2 = r2.getAsString(r7)     // Catch:{ Exception -> 0x0249 }
            java.util.List r2 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo.m100126a(r2)     // Catch:{ Exception -> 0x0237 }
            goto L_0x0238
        L_0x0237:
            r2 = 0
        L_0x0238:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ Exception -> 0x0249 }
            if (r7 != 0) goto L_0x0304
            java.lang.Object r5 = r1.mo111462b(r5)     // Catch:{ Exception -> 0x0249 }
            com.tencent.mm.plugin.appbrand.appcache.h3 r5 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r5     // Catch:{ Exception -> 0x0249 }
            r5.mo113512A(r0, r3, r6, r2)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0304
        L_0x0249:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 0
            r2[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r4, r2)
            goto L_0x0304
        L_0x0254:
            java.lang.String r0 = r2.getAsString(r10)     // Catch:{ Exception -> 0x0275 }
            java.lang.String r3 = "CONTENT_KEY_VERSION_TYPE"
            java.lang.Integer r3 = r2.getAsInteger(r3)     // Catch:{ Exception -> 0x0275 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0275 }
            java.lang.String r5 = "CONTENT_KEY_EXT_INFO"
            java.lang.String r2 = r2.getAsString(r5)     // Catch:{ Exception -> 0x0275 }
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.d1> r5 = com.tencent.p014mm.plugin.appbrand.launching.C29567d1.class
            java.lang.Object r5 = r1.mo111462b(r5)     // Catch:{ Exception -> 0x0275 }
            com.tencent.mm.plugin.appbrand.launching.d1 r5 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r5     // Catch:{ Exception -> 0x0275 }
            r5.mo56814Lo(r0, r3, r2)     // Catch:{ Exception -> 0x0275 }
            goto L_0x0304
        L_0x0275:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 0
            r2[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r4, r2)
            goto L_0x0304
        L_0x0280:
            java.lang.String r0 = r2.getAsString(r10)     // Catch:{ Exception -> 0x029f }
            byte[] r2 = r2.getAsByteArray(r8)     // Catch:{ Exception -> 0x029f }
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.y2> r3 = com.tencent.p014mm.plugin.appbrand.launching.C29592y2.class
            java.lang.Object r3 = r1.mo111462b(r3)     // Catch:{ Exception -> 0x029f }
            com.tencent.mm.plugin.appbrand.launching.y2 r3 = (com.tencent.p014mm.plugin.appbrand.launching.C29592y2) r3     // Catch:{ Exception -> 0x029f }
            te3.wm2 r4 = new te3.wm2     // Catch:{ Exception -> 0x029f }
            r4.<init>()     // Catch:{ Exception -> 0x029f }
            pe3.a r2 = r4.parseFrom(r2)     // Catch:{ Exception -> 0x029f }
            te3.wm2 r2 = (te3.C90446wm2) r2     // Catch:{ Exception -> 0x029f }
            r3.mo56832jo(r0, r2)     // Catch:{ Exception -> 0x029f }
            goto L_0x0304
        L_0x029f:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "insert LaunchWxaAppPB, e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r2)
            goto L_0x0304
        L_0x02ab:
            boolean r0 = r2.containsKey(r8)     // Catch:{ Exception -> 0x02f9 }
            if (r0 == 0) goto L_0x02ce
            java.lang.String r0 = r2.getAsString(r10)     // Catch:{ Exception -> 0x02f9 }
            byte[] r2 = r2.getAsByteArray(r8)     // Catch:{ Exception -> 0x02f9 }
            java.lang.Object r3 = r1.mo111462b(r3)     // Catch:{ Exception -> 0x02f9 }
            com.tencent.mm.plugin.appbrand.config.i r3 = (com.tencent.p014mm.plugin.appbrand.config.C81660i) r3     // Catch:{ Exception -> 0x02f9 }
            te3.o55 r4 = new te3.o55     // Catch:{ Exception -> 0x02f9 }
            r4.<init>()     // Catch:{ Exception -> 0x02f9 }
            pe3.a r2 = r4.parseFrom(r2)     // Catch:{ Exception -> 0x02f9 }
            te3.o55 r2 = (te3.o55) r2     // Catch:{ Exception -> 0x02f9 }
            r3.mo114009bO(r0, r2)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x0304
        L_0x02ce:
            boolean r0 = r2.containsKey(r4)     // Catch:{ Exception -> 0x02f9 }
            if (r0 == 0) goto L_0x0304
            java.lang.String r0 = "CONTENT_KEY_BATCH_SYNC_SCENE"
            java.lang.Integer r0 = r2.getAsInteger(r0)     // Catch:{ Exception -> 0x02f9 }
            r5 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r5)     // Catch:{ Exception -> 0x02f9 }
            byte[] r2 = r2.getAsByteArray(r4)     // Catch:{ Exception -> 0x02f9 }
            java.lang.Object r3 = r1.mo111462b(r3)     // Catch:{ Exception -> 0x02f9 }
            com.tencent.mm.plugin.appbrand.config.i r3 = (com.tencent.p014mm.plugin.appbrand.config.C81660i) r3     // Catch:{ Exception -> 0x02f9 }
            te3.hc r4 = new te3.hc     // Catch:{ Exception -> 0x02f9 }
            r4.<init>()     // Catch:{ Exception -> 0x02f9 }
            pe3.a r2 = r4.parseFrom(r2)     // Catch:{ Exception -> 0x02f9 }
            te3.hc r2 = (te3.C49684hc) r2     // Catch:{ Exception -> 0x02f9 }
            r4 = 0
            r3.mo114001Lo(r0, r2, r4)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x0304
        L_0x02f9:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "insert WxaAttributes, e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r2)
        L_0x0304:
            r2 = 0
        L_0x0305:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.wxa.storage.WxaCriticalDataProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!mo111461a()) {
            return null;
        }
        String str3 = f235040g.get(f235039f.match(uri));
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        return this.f235041d.query(str3, strArr, str, strArr2, (String) null, (String) null, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!mo111461a()) {
            return -1;
        }
        if (f235039f.match(uri) != 5) {
            return 0;
        }
        String asString = contentValues.getAsString("CONTENT_KEY_ACTION");
        asString.getClass();
        if (!asString.equals("ACTION_DELETE_MODULE_LIST")) {
            return 0;
        }
        return ((C81258h3) mo111462b(C81258h3.class)).mo113521e(contentValues.getAsString("CONTENT_KEY_APPID"), contentValues.getAsInteger("CONTENT_KEY_PKG_TYPE").intValue(), contentValues.getAsInteger("CONTENT_KEY_PKG_VERSION").intValue());
    }
}
