package com.tencent.p014mm.plugin.appbrand;

import android.content.SharedPreferences;
import ci0.C0506a;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandFileCleanEvent;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appusage.C81523q1;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandFileCleaner */
public final class AppBrandFileCleaner {

    /* renamed from: a */
    public static final C81062a f238096a = new C81062a((C8480h) null);

    /* renamed from: b */
    public static final String f238097b = "_1123949441_";

    /* renamed from: c */
    public static final String f238098c = "snapshot";

    /* renamed from: d */
    public static final IListener<AppBrandFileCleanEvent> f238099d = new AppBrandFileCleaner$Companion$cleanEvent$1(C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$a */
    public static final class C81062a {
        public C81062a(C8480h hVar) {
        }

        /* renamed from: c */
        public static void m99060c(C81062a aVar, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = Boolean.TRUE;
            }
            aVar.getClass();
            C87412m.m108594g(str, "uin");
            C87412m.m108594g(str2, "appId");
            Log.m105924i("MicroMsg.AppBrandFileCleaner", "clean include temp file: " + bool);
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i2 = C82419d1.f241503f;
                    sb.append(AppBrandLocalMediaObjectManager.f238909a);
                    sb.append(str2);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    String sb4 = sb.toString();
                    C86009m1 m1Var = new C86009m1(sb4);
                    C86013q1.m106446g(sb4, true);
                    if (m1Var.mo119967g()) {
                        m1Var.mo119966f();
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean Flatten appId=%s e=%s", str2, e);
                }
            }
            try {
                C82419d1.m101179f(str, str2).cleanupDirectory();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean NonFlatten appId=%s e=%s", str2, e2);
            }
            try {
                C82419d1.m101180g(str, str2).cleanupDirectory();
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean open data NonFlatten appId=%s e=%s", str2, e3);
            }
            try {
                C82419d1.m101181h(str, str2).cleanupDirectory();
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean private data NonFlatten appId=%s e=%s", str2, e4);
            }
            try {
                C82419d1.m101177c(str, str2).cleanupDirectory();
            } catch (Exception e5) {
                Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean client data NonFlatten appId=%s e=%s", str2, e5);
            }
            try {
                C82419d1.m101182i(str, str2).cleanupDirectory();
            } catch (Exception e6) {
                Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean SinglePageNotFlatten appId=%s e=%s", str2, e6);
            }
            try {
                String str3 = AppBrandLocalMediaObjectManager.f238909a + str2 + "/blobTmp/";
                C86009m1 m1Var2 = new C86009m1(str3);
                C86013q1.m106446g(str3, true);
                if (m1Var2.mo119967g()) {
                    m1Var2.mo119966f();
                }
            } catch (Exception e7) {
                Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean flattenBlobPath appId=%s e=%s", str2, e7);
            }
            String str4 = AppBrandLocalMediaObjectManager.f238909a;
            if (!Util.isNullOrNil(str2)) {
                C86013q1.m106445f(AppBrandLocalMediaObjectManager.m99833f(str2));
            }
            ((C90388a) C89909e.m112436a(C90388a.class)).mo56836Sl(str2);
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            if (a != null) {
                SharedPreferences.Editor putBoolean = a.putBoolean("appbrand_enable_file_storage_space_statistics_for_" + str2, false);
                if (putBoolean != null) {
                    putBoolean.commit();
                }
            }
            JsApiOperateWXData.m100836B(str2);
            Log.m105924i("MicroMsg.AppBrandXNetModelCache", "[clear] result" + C86013q1.m106446g(new C0506a(str, str2).f1232d, true));
        }

        /* renamed from: d */
        public static void m99061d(C81062a aVar, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 4) != 0) {
                bool = Boolean.TRUE;
            }
            aVar.getClass();
            Log.m105924i("MicroMsg.AppBrandFileCleaner", "deep clean include temp file: " + bool);
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i2 = C82419d1.f241503f;
                    sb.append(AppBrandLocalMediaObjectManager.f238909a);
                    sb.append(str2);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    String sb4 = sb.toString();
                    C86009m1 m1Var = new C86009m1(sb4);
                    C86013q1.m106446g(sb4, true);
                    if (m1Var.mo119967g()) {
                        m1Var.mo119966f();
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandFileCleaner", "clean Flatten appId=%s e=%s", str2, e);
                }
            }
            Log.m105925i("MicroMsg.AppBrand.RemoveUsageTask", "removeStorageSync with appId(%s)", str2);
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.AppBrand.RemoveUsageTask", "appId is null");
                return;
            }
            String f = C81661j.m100181f(str2);
            if (Util.isNullOrNil(f)) {
                Log.m105920e("MicroMsg.AppBrand.RemoveUsageTask", "username is null");
            } else {
                C81523q1.m100017b(f, str2, 0);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x0308 A[Catch:{ Exception -> 0x034e }] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0323 A[Catch:{ Exception -> 0x034e }] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0326 A[Catch:{ Exception -> 0x034e }] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x032b A[Catch:{ Exception -> 0x034e }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0377  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0393  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x039a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0 A[Catch:{ Exception -> 0x0107 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc A[Catch:{ Exception -> 0x0107 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00df A[Catch:{ Exception -> 0x0107 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4 A[Catch:{ Exception -> 0x0107 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0132 A[Catch:{ Exception -> 0x0178 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x014d A[Catch:{ Exception -> 0x0178 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x016f A[Catch:{ Exception -> 0x0178 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0174  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01a3 A[Catch:{ Exception -> 0x01e9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01be A[Catch:{ Exception -> 0x01e9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01e0 A[Catch:{ Exception -> 0x01e9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0214 A[Catch:{ Exception -> 0x025a }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x022f A[Catch:{ Exception -> 0x025a }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0232 A[Catch:{ Exception -> 0x025a }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0237 A[Catch:{ Exception -> 0x025a }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0285 A[Catch:{ Exception -> 0x02cb }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x02a0 A[Catch:{ Exception -> 0x02cb }] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02a3 A[Catch:{ Exception -> 0x02cb }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02a8 A[Catch:{ Exception -> 0x02cb }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo112997a(java.lang.String r19, java.lang.String r20, java.lang.Boolean r21) {
            /*
                r18 = this;
                r1 = r20
                r0 = r21
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "clean include temp file: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.AppBrandFileCleaner"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                boolean r0 = gy3.C87412m.m108589b(r0, r2)
                java.lang.String r2 = ", e="
                r4 = 0
                r5 = 1
                java.lang.String r6 = ", cost "
                r7 = 0
                if (r0 == 0) goto L_0x00af
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0092 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092 }
                r0.<init>()     // Catch:{ Exception -> 0x0092 }
                int r11 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.f241503f     // Catch:{ Exception -> 0x0092 }
                java.lang.String r11 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f238909a     // Catch:{ Exception -> 0x0092 }
                r0.append(r11)     // Catch:{ Exception -> 0x0092 }
                r0.append(r1)     // Catch:{ Exception -> 0x0092 }
                r11 = 47
                r0.append(r11)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0092 }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x0092 }
                if (r0 == 0) goto L_0x0066
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0092 }
                r11 = r7
            L_0x0051:
                boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x0092 }
                if (r13 == 0) goto L_0x0061
                java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x0092 }
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13     // Catch:{ Exception -> 0x0092 }
                long r13 = r13.f250474d     // Catch:{ Exception -> 0x0092 }
                long r11 = r11 + r13
                goto L_0x0051
            L_0x0061:
                java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0092 }
                goto L_0x0067
            L_0x0066:
                r0 = r4
            L_0x0067:
                if (r0 == 0) goto L_0x006e
                long r11 = r0.longValue()     // Catch:{ Exception -> 0x0092 }
                goto L_0x006f
            L_0x006e:
                r11 = r7
            L_0x006f:
                long r11 = r11 + r7
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
                r13.<init>()     // Catch:{ Exception -> 0x0090 }
                java.lang.String r14 = "getFlattenDir size = "
                r13.append(r14)     // Catch:{ Exception -> 0x0090 }
                r13.append(r0)     // Catch:{ Exception -> 0x0090 }
                r13.append(r6)     // Catch:{ Exception -> 0x0090 }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0090 }
                long r14 = r14 - r9
                r13.append(r14)     // Catch:{ Exception -> 0x0090 }
                java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0090 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x0090 }
                goto L_0x00b0
            L_0x0090:
                r0 = move-exception
                goto L_0x0094
            L_0x0092:
                r0 = move-exception
                r11 = r7
            L_0x0094:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "clean Flatten appId="
                r9.append(r10)
                r9.append(r1)
                r9.append(r2)
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                goto L_0x00b0
            L_0x00af:
                r11 = r7
            L_0x00b0:
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0107 }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.m101179f(r19, r20)     // Catch:{ Exception -> 0x0107 }
                java.lang.String r0 = r0.f238992d     // Catch:{ Exception -> 0x0107 }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x0107 }
                if (r0 == 0) goto L_0x00dc
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0107 }
                r13 = r7
            L_0x00c5:
                boolean r15 = r0.hasNext()     // Catch:{ Exception -> 0x0107 }
                if (r15 == 0) goto L_0x00d7
                java.lang.Object r15 = r0.next()     // Catch:{ Exception -> 0x0107 }
                com.tencent.mm.vfs.b0 r15 = (com.tencent.p014mm.vfs.C86001b0) r15     // Catch:{ Exception -> 0x0107 }
                long r7 = r15.f250474d     // Catch:{ Exception -> 0x0107 }
                long r13 = r13 + r7
                r7 = 0
                goto L_0x00c5
            L_0x00d7:
                java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0107 }
                goto L_0x00dd
            L_0x00dc:
                r0 = r4
            L_0x00dd:
                if (r0 == 0) goto L_0x00e4
                long r7 = r0.longValue()     // Catch:{ Exception -> 0x0107 }
                goto L_0x00e6
            L_0x00e4:
                r7 = 0
            L_0x00e6:
                long r11 = r11 + r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107 }
                r7.<init>()     // Catch:{ Exception -> 0x0107 }
                java.lang.String r8 = "getNonFlattenFileSystem size = "
                r7.append(r8)     // Catch:{ Exception -> 0x0107 }
                r7.append(r0)     // Catch:{ Exception -> 0x0107 }
                r7.append(r6)     // Catch:{ Exception -> 0x0107 }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0107 }
                long r13 = r13 - r9
                r7.append(r13)     // Catch:{ Exception -> 0x0107 }
                java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0107 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x0107 }
                goto L_0x0122
            L_0x0107:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "clean NonFlatten appId="
                r7.append(r8)
                r7.append(r1)
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x0122:
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0178 }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.m101180g(r19, r20)     // Catch:{ Exception -> 0x0178 }
                java.lang.String r0 = r0.f238992d     // Catch:{ Exception -> 0x0178 }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x0178 }
                if (r0 == 0) goto L_0x014d
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0178 }
                r9 = 0
            L_0x0138:
                boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x0178 }
                if (r13 == 0) goto L_0x0148
                java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x0178 }
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13     // Catch:{ Exception -> 0x0178 }
                long r13 = r13.f250474d     // Catch:{ Exception -> 0x0178 }
                long r9 = r9 + r13
                goto L_0x0138
            L_0x0148:
                java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0178 }
                goto L_0x014e
            L_0x014d:
                r0 = r4
            L_0x014e:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178 }
                r9.<init>()     // Catch:{ Exception -> 0x0178 }
                java.lang.String r10 = "get open data NonFlattenFileSystem size = "
                r9.append(r10)     // Catch:{ Exception -> 0x0178 }
                r9.append(r0)     // Catch:{ Exception -> 0x0178 }
                r9.append(r6)     // Catch:{ Exception -> 0x0178 }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0178 }
                long r13 = r13 - r7
                r9.append(r13)     // Catch:{ Exception -> 0x0178 }
                java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x0178 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x0178 }
                if (r0 == 0) goto L_0x0174
                long r7 = r0.longValue()     // Catch:{ Exception -> 0x0178 }
                goto L_0x0176
            L_0x0174:
                r7 = 0
            L_0x0176:
                long r11 = r11 + r7
                goto L_0x0193
            L_0x0178:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "get open data NonFlattenFileSystem appId="
                r7.append(r8)
                r7.append(r1)
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x0193:
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01e9 }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.m101181h(r19, r20)     // Catch:{ Exception -> 0x01e9 }
                java.lang.String r0 = r0.f238992d     // Catch:{ Exception -> 0x01e9 }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x01e9 }
                if (r0 == 0) goto L_0x01be
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01e9 }
                r9 = 0
            L_0x01a9:
                boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x01e9 }
                if (r13 == 0) goto L_0x01b9
                java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x01e9 }
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13     // Catch:{ Exception -> 0x01e9 }
                long r13 = r13.f250474d     // Catch:{ Exception -> 0x01e9 }
                long r9 = r9 + r13
                goto L_0x01a9
            L_0x01b9:
                java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x01e9 }
                goto L_0x01bf
            L_0x01be:
                r0 = r4
            L_0x01bf:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e9 }
                r9.<init>()     // Catch:{ Exception -> 0x01e9 }
                java.lang.String r10 = "get private NonFlattenFileSystem size = "
                r9.append(r10)     // Catch:{ Exception -> 0x01e9 }
                r9.append(r0)     // Catch:{ Exception -> 0x01e9 }
                r9.append(r6)     // Catch:{ Exception -> 0x01e9 }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01e9 }
                long r13 = r13 - r7
                r9.append(r13)     // Catch:{ Exception -> 0x01e9 }
                java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x01e9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x01e9 }
                if (r0 == 0) goto L_0x01e5
                long r7 = r0.longValue()     // Catch:{ Exception -> 0x01e9 }
                goto L_0x01e7
            L_0x01e5:
                r7 = 0
            L_0x01e7:
                long r11 = r11 + r7
                goto L_0x0204
            L_0x01e9:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "get private NonFlattenFileSystem appId="
                r7.append(r8)
                r7.append(r1)
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x0204:
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x025a }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.m101177c(r19, r20)     // Catch:{ Exception -> 0x025a }
                java.lang.String r0 = r0.f238992d     // Catch:{ Exception -> 0x025a }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x025a }
                if (r0 == 0) goto L_0x022f
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x025a }
                r9 = 0
            L_0x021a:
                boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x025a }
                if (r13 == 0) goto L_0x022a
                java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x025a }
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13     // Catch:{ Exception -> 0x025a }
                long r13 = r13.f250474d     // Catch:{ Exception -> 0x025a }
                long r9 = r9 + r13
                goto L_0x021a
            L_0x022a:
                java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x025a }
                goto L_0x0230
            L_0x022f:
                r0 = r4
            L_0x0230:
                if (r0 == 0) goto L_0x0237
                long r9 = r0.longValue()     // Catch:{ Exception -> 0x025a }
                goto L_0x0239
            L_0x0237:
                r9 = 0
            L_0x0239:
                long r11 = r11 + r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025a }
                r9.<init>()     // Catch:{ Exception -> 0x025a }
                java.lang.String r10 = "get client data NonFlattenFileSystem size = "
                r9.append(r10)     // Catch:{ Exception -> 0x025a }
                r9.append(r0)     // Catch:{ Exception -> 0x025a }
                r9.append(r6)     // Catch:{ Exception -> 0x025a }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x025a }
                long r13 = r13 - r7
                r9.append(r13)     // Catch:{ Exception -> 0x025a }
                java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x025a }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x025a }
                goto L_0x0275
            L_0x025a:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "get client data NonFlattenFileSystem appId="
                r7.append(r8)
                r7.append(r1)
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x0275:
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02cb }
                com.tencent.mm.plugin.appbrand.appstorage.t0 r0 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.m101182i(r19, r20)     // Catch:{ Exception -> 0x02cb }
                java.lang.String r0 = r0.f238992d     // Catch:{ Exception -> 0x02cb }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x02cb }
                if (r0 == 0) goto L_0x02a0
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x02cb }
                r9 = 0
            L_0x028b:
                boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x02cb }
                if (r13 == 0) goto L_0x029b
                java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x02cb }
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13     // Catch:{ Exception -> 0x02cb }
                long r13 = r13.f250474d     // Catch:{ Exception -> 0x02cb }
                long r9 = r9 + r13
                goto L_0x028b
            L_0x029b:
                java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x02cb }
                goto L_0x02a1
            L_0x02a0:
                r0 = r4
            L_0x02a1:
                if (r0 == 0) goto L_0x02a8
                long r9 = r0.longValue()     // Catch:{ Exception -> 0x02cb }
                goto L_0x02aa
            L_0x02a8:
                r9 = 0
            L_0x02aa:
                long r11 = r11 + r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02cb }
                r9.<init>()     // Catch:{ Exception -> 0x02cb }
                java.lang.String r10 = "getSinglePageNonFlattenFileSystem size = "
                r9.append(r10)     // Catch:{ Exception -> 0x02cb }
                r9.append(r0)     // Catch:{ Exception -> 0x02cb }
                r9.append(r6)     // Catch:{ Exception -> 0x02cb }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02cb }
                long r13 = r13 - r7
                r9.append(r13)     // Catch:{ Exception -> 0x02cb }
                java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x02cb }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x02cb }
                goto L_0x02e6
            L_0x02cb:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "clean SinglePageNotFlatten appId="
                r7.append(r8)
                r7.append(r1)
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x02e6:
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x034e }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x034e }
                r0.<init>()     // Catch:{ Exception -> 0x034e }
                int r9 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.f241503f     // Catch:{ Exception -> 0x034e }
                java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f238909a     // Catch:{ Exception -> 0x034e }
                r0.append(r9)     // Catch:{ Exception -> 0x034e }
                r0.append(r1)     // Catch:{ Exception -> 0x034e }
                java.lang.String r9 = "/blobTmp/"
                r0.append(r9)     // Catch:{ Exception -> 0x034e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x034e }
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ Exception -> 0x034e }
                if (r0 == 0) goto L_0x0323
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x034e }
                r9 = 0
            L_0x030e:
                boolean r13 = r0.hasNext()     // Catch:{ Exception -> 0x034e }
                if (r13 == 0) goto L_0x031e
                java.lang.Object r13 = r0.next()     // Catch:{ Exception -> 0x034e }
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13     // Catch:{ Exception -> 0x034e }
                long r13 = r13.f250474d     // Catch:{ Exception -> 0x034e }
                long r9 = r9 + r13
                goto L_0x030e
            L_0x031e:
                java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x034e }
                goto L_0x0324
            L_0x0323:
                r0 = r4
            L_0x0324:
                if (r0 == 0) goto L_0x032b
                long r9 = r0.longValue()     // Catch:{ Exception -> 0x034e }
                goto L_0x032d
            L_0x032b:
                r9 = 0
            L_0x032d:
                long r11 = r11 + r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x034e }
                r9.<init>()     // Catch:{ Exception -> 0x034e }
                java.lang.String r10 = "flattenBlobPath size = "
                r9.append(r10)     // Catch:{ Exception -> 0x034e }
                r9.append(r0)     // Catch:{ Exception -> 0x034e }
                r9.append(r6)     // Catch:{ Exception -> 0x034e }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x034e }
                long r13 = r13 - r7
                r9.append(r13)     // Catch:{ Exception -> 0x034e }
                java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x034e }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x034e }
                goto L_0x0369
            L_0x034e:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "clean flattenBlobPath appId="
                r7.append(r8)
                r7.append(r1)
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x0369:
                long r7 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99833f(r20)
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)
                if (r0 == 0) goto L_0x0391
                java.util.Iterator r0 = r0.iterator()
                r4 = 0
            L_0x037d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x038d
                java.lang.Object r2 = r0.next()
                com.tencent.mm.vfs.b0 r2 = (com.tencent.p014mm.vfs.C86001b0) r2
                long r9 = r2.f250474d
                long r4 = r4 + r9
                goto L_0x037d
            L_0x038d:
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
            L_0x0391:
                if (r4 == 0) goto L_0x039a
                long r9 = r4.longValue()
                r16 = r9
                goto L_0x039c
            L_0x039a:
                r16 = 0
            L_0x039c:
                long r11 = r11 + r16
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "AppBrandLocalMediaObjectManager size = "
                r0.append(r2)
                r0.append(r4)
                r0.append(r6)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r7
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.Class<tb.a> r0 = p1039tb.C90388a.class
                ra.b r0 = p224ra.C89909e.m112436a(r0)
                tb.a r0 = (p1039tb.C90388a) r0
                long r7 = r0.mo56839jx(r1)
                java.lang.Long r0 = java.lang.Long.valueOf(r7)
                long r7 = r0.longValue()
                long r11 = r11 + r7
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "getAllKVStorageSize size = "
                r2.append(r7)
                r2.append(r0)
                r2.append(r6)
                long r7 = java.lang.System.currentTimeMillis()
                long r7 = r7 - r4
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                long r4 = java.lang.System.currentTimeMillis()
                int r1 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.m100837C(r20)
                long r1 = (long) r1
                long r11 = r11 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JsApiOperateWXData size = "
                r1.append(r2)
                r1.append(r0)
                r1.append(r6)
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 - r4
                r1.append(r6)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81062a.mo112997a(java.lang.String, java.lang.String, java.lang.Boolean):long");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ca, code lost:
            r13 = r12.f250472b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo112998b(java.lang.String r19, java.lang.String r20) {
            /*
                r18 = this;
                r0 = r19
                r1 = r20
                long r2 = java.lang.System.currentTimeMillis()
                com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
                com.tencent.mm.plugin.appbrand.appcache.r2 r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238482u
                r4.getClass()
                com.tencent.mm.plugin.appbrand.appcache.q2 r5 = new com.tencent.mm.plugin.appbrand.appcache.q2
                r5.<init>(r4, r1)
                java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0.m38799b()
                com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
                r6.<init>((java.lang.String) r4)
                boolean r4 = r6.mo119967g()
                r7 = 0
                r8 = 1
                r9 = 0
                if (r4 == 0) goto L_0x005d
                boolean r4 = r6.mo119977o()
                if (r4 == 0) goto L_0x005d
                com.tencent.mm.vfs.m1[] r4 = r6.mo119986w(r5)
                if (r4 == 0) goto L_0x005d
                int r5 = r4.length
                if (r5 <= 0) goto L_0x005d
                int r5 = r4.length
                r11 = r9
                r6 = 0
            L_0x003a:
                if (r6 >= r5) goto L_0x005e
                r13 = r4[r6]
                java.lang.String r14 = r13.mo119971i()
                com.tencent.mm.vfs.b0 r14 = com.tencent.p014mm.vfs.C86013q1.m106453n(r14)
                if (r14 == 0) goto L_0x004b
                long r14 = r14.f250474d
                long r11 = r11 + r14
            L_0x004b:
                java.lang.Object[] r14 = new java.lang.Object[r8]
                java.lang.String r13 = r13.getName()
                r14[r7] = r13
                java.lang.String r13 = "WxaJsCacheStorage"
                java.lang.String r15 = "get size file:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
                int r6 = r6 + 1
                goto L_0x003a
            L_0x005d:
                r11 = r9
            L_0x005e:
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                long r5 = r4.longValue()
                long r5 = r5 + r9
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "js code cache size = "
                r11.append(r12)
                r11.append(r4)
                java.lang.String r4 = ", cost "
                r11.append(r4)
                long r12 = java.lang.System.currentTimeMillis()
                long r12 = r12 - r2
                r11.append(r12)
                java.lang.String r2 = r11.toString()
                java.lang.String r3 = "MicroMsg.AppBrandFileCleaner"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                long r11 = java.lang.System.currentTimeMillis()
                com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
                com.tencent.mm.plugin.appbrand.appcache.q3 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238483v
                r2.getClass()
                com.tencent.mm.pointers.PLong r2 = new com.tencent.mm.pointers.PLong
                r2.<init>(r9)
                f40.o r13 = f40.C86709a0.m107535s()
                java.lang.String r13 = r13.f251807e
                java.lang.String r14 = "/"
                boolean r15 = r13.endsWith(r14)
                if (r15 != 0) goto L_0x00b8
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r13)
                r15.append(r14)
                java.lang.String r13 = r15.toString()
            L_0x00b8:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r13)
                java.lang.String r13 = "appbrand/loadingurl"
                r15.append(r13)
                r15.append(r14)
                r15.append(r1)
                java.lang.String r13 = r15.toString()
                com.tencent.mm.vfs.m1 r15 = new com.tencent.mm.vfs.m1
                r15.<init>((java.lang.String) r13)
                boolean r16 = r15.mo119967g()
                if (r16 == 0) goto L_0x0104
                boolean r15 = r15.mo119977o()
                if (r15 == 0) goto L_0x0104
                java.lang.Iterable r13 = com.tencent.p014mm.vfs.C86013q1.m106459t(r13, r8)
                if (r13 == 0) goto L_0x0104
                java.util.Iterator r13 = r13.iterator()
            L_0x00ea:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x0104
                java.lang.Object r15 = r13.next()
                com.tencent.mm.vfs.b0 r15 = (com.tencent.p014mm.vfs.C86001b0) r15
                if (r15 == 0) goto L_0x00ea
                long r9 = r2.value
                long r7 = r15.f250474d
                long r9 = r9 + r7
                r2.value = r9
                r7 = 0
                r8 = 1
                r9 = 0
                goto L_0x00ea
            L_0x0104:
                java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
                java.lang.String r7 = r7.getAbsolutePath()
                boolean r8 = r7.endsWith(r14)
                if (r8 != 0) goto L_0x0121
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                r8.append(r14)
                java.lang.String r7 = r8.toString()
            L_0x0121:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = "tencent/MicroMsg/appbrand/loadingurl"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
                r8.<init>((java.lang.String) r7)
                boolean r9 = r8.mo119967g()
                if (r9 == 0) goto L_0x0165
                boolean r8 = r8.mo119977o()
                if (r8 == 0) goto L_0x0165
                r8 = 1
                java.lang.Iterable r7 = com.tencent.p014mm.vfs.C86013q1.m106459t(r7, r8)
                if (r7 == 0) goto L_0x0165
                java.util.Iterator r7 = r7.iterator()
            L_0x014f:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0165
                java.lang.Object r8 = r7.next()
                com.tencent.mm.vfs.b0 r8 = (com.tencent.p014mm.vfs.C86001b0) r8
                if (r8 == 0) goto L_0x014f
                long r9 = r2.value
                long r13 = r8.f250474d
                long r9 = r9 + r13
                r2.value = r9
                goto L_0x014f
            L_0x0165:
                long r7 = r2.value
                java.lang.Long r2 = java.lang.Long.valueOf(r7)
                long r7 = r2.longValue()
                long r5 = r5 + r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "preload image cache size = "
                r7.append(r8)
                r7.append(r2)
                r7.append(r4)
                long r8 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r11
                r7.append(r8)
                java.lang.String r2 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                long r7 = java.lang.System.currentTimeMillis()
                com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
                com.tencent.mm.plugin.appbrand.page.o3$a r9 = com.tencent.p014mm.plugin.appbrand.page.C83864o3.f244851c
                java.lang.String r10 = r9.mo116423c()
                r2.<init>((java.lang.String) r10)
                boolean r10 = r2.mo119967g()
                if (r10 == 0) goto L_0x0212
                boolean r2 = r2.mo119977o()
                if (r2 == 0) goto L_0x0212
                java.lang.String r2 = r9.mo116423c()
                r9 = 1
                java.lang.Iterable r2 = com.tencent.p014mm.vfs.C86013q1.m106459t(r2, r9)
                if (r2 == 0) goto L_0x01e7
                java.util.Iterator r2 = r2.iterator()
                r9 = 0
            L_0x01bc:
                boolean r12 = r2.hasNext()
                if (r12 == 0) goto L_0x01e2
                java.lang.Object r12 = r2.next()
                com.tencent.mm.vfs.b0 r12 = (com.tencent.p014mm.vfs.C86001b0) r12
                if (r12 == 0) goto L_0x01d8
                java.lang.String r13 = r12.f250472b
                if (r13 == 0) goto L_0x01d8
                r14 = 0
                boolean r13 = z04.C112551y.m153819s(r13, r1, r14)
                r14 = 1
                if (r13 != r14) goto L_0x01d8
                r13 = 1
                goto L_0x01d9
            L_0x01d8:
                r13 = 0
            L_0x01d9:
                if (r13 == 0) goto L_0x01de
                long r12 = r12.f250474d
                goto L_0x01e0
            L_0x01de:
                r12 = 0
            L_0x01e0:
                long r9 = r9 + r12
                goto L_0x01bc
            L_0x01e2:
                java.lang.Long r2 = java.lang.Long.valueOf(r9)
                goto L_0x01e8
            L_0x01e7:
                r2 = 0
            L_0x01e8:
                if (r2 == 0) goto L_0x01ef
                long r9 = r2.longValue()
                goto L_0x01f1
            L_0x01ef:
                r9 = 0
            L_0x01f1:
                long r5 = r5 + r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "webview code cache size = "
                r9.append(r10)
                r9.append(r2)
                r9.append(r4)
                long r12 = java.lang.System.currentTimeMillis()
                long r12 = r12 - r7
                r9.append(r12)
                java.lang.String r2 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            L_0x0212:
                long r7 = java.lang.System.currentTimeMillis()
                java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0.m102077a()
                r9 = 0
                java.lang.Iterable r2 = com.tencent.p014mm.vfs.C86013q1.m106459t(r2, r9)
                if (r2 == 0) goto L_0x0278
                java.util.Iterator r2 = r2.iterator()
                r9 = 0
            L_0x0227:
                boolean r12 = r2.hasNext()
                if (r12 == 0) goto L_0x0273
                java.lang.Object r12 = r2.next()
                com.tencent.mm.vfs.b0 r12 = (com.tencent.p014mm.vfs.C86001b0) r12
                boolean r13 = r12.f250476f
                if (r13 != 0) goto L_0x023a
            L_0x0237:
                r11 = 0
                goto L_0x0271
            L_0x023a:
                java.lang.String r13 = r12.f250472b
                boolean r13 = gy3.C87412m.m108589b(r1, r13)
                if (r13 == 0) goto L_0x0237
                java.lang.String r12 = r12.f250471a
                r13 = 1
                java.lang.Iterable r12 = com.tencent.p014mm.vfs.C86013q1.m106459t(r12, r13)
                if (r12 == 0) goto L_0x026a
                java.util.Iterator r12 = r12.iterator()
                r13 = 0
            L_0x0251:
                boolean r15 = r12.hasNext()
                if (r15 == 0) goto L_0x0265
                java.lang.Object r15 = r12.next()
                com.tencent.mm.vfs.b0 r15 = (com.tencent.p014mm.vfs.C86001b0) r15
                r17 = r12
                long r11 = r15.f250474d
                long r13 = r13 + r11
                r12 = r17
                goto L_0x0251
            L_0x0265:
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                goto L_0x026b
            L_0x026a:
                r11 = 0
            L_0x026b:
                if (r11 == 0) goto L_0x0237
                long r11 = r11.longValue()
            L_0x0271:
                long r9 = r9 + r11
                goto L_0x0227
            L_0x0273:
                java.lang.Long r2 = java.lang.Long.valueOf(r9)
                goto L_0x0279
            L_0x0278:
                r2 = 0
            L_0x0279:
                if (r2 == 0) goto L_0x0280
                long r9 = r2.longValue()
                goto L_0x0282
            L_0x0280:
                r9 = 0
            L_0x0282:
                long r5 = r5 + r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "v8 wasm cache size = "
                r9.append(r10)
                r9.append(r2)
                r9.append(r4)
                long r10 = java.lang.System.currentTimeMillis()
                long r10 = r10 - r7
                r9.append(r10)
                java.lang.String r2 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                long r7 = java.lang.System.currentTimeMillis()
                java.lang.String r2 = "uin"
                gy3.C87412m.m108594g(r0, r2)
                java.lang.String r2 = "appId"
                gy3.C87412m.m108594g(r1, r2)
                ci0.a r2 = new ci0.a
                r2.<init>(r0, r1)
                java.lang.String r0 = r2.f1232d
                r1 = 1
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r1)
                if (r0 == 0) goto L_0x02db
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L_0x02c6:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto L_0x02d6
                java.lang.Object r9 = r0.next()
                com.tencent.mm.vfs.b0 r9 = (com.tencent.p014mm.vfs.C86001b0) r9
                long r9 = r9.f250474d
                long r1 = r1 + r9
                goto L_0x02c6
            L_0x02d6:
                java.lang.Long r11 = java.lang.Long.valueOf(r1)
                goto L_0x02dc
            L_0x02db:
                r11 = 0
            L_0x02dc:
                if (r11 == 0) goto L_0x02e3
                long r9 = r11.longValue()
                goto L_0x02e5
            L_0x02e3:
                r9 = 0
            L_0x02e5:
                java.lang.Long r0 = java.lang.Long.valueOf(r9)
                long r1 = r0.longValue()
                long r5 = r5 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "xnet model cache size = "
                r1.append(r2)
                r1.append(r0)
                r1.append(r4)
                long r9 = java.lang.System.currentTimeMillis()
                long r9 = r9 - r7
                r1.append(r9)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81062a.mo112998b(java.lang.String, java.lang.String):long");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$b */
    public static final class C81063b {

        /* renamed from: a */
        public static final C83728p3 f238100a = new C83728p3();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$c */
    public static final class C81064c {

        /* renamed from: a */
        public static final C84079q3 f238101a = new C84079q3();
    }
}
