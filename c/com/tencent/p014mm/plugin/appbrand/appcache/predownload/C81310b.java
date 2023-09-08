package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.database.sqlite.SQLiteDiskIOException;
import android.util.LongSparseArray;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import ii0.C87732a;
import java.util.LinkedList;
import java.util.List;
import lp3.C88631d;
import mp3.C88819d;
import mp3.C88825i;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import te3.C51949xb;
import te3.C52094yb;
import te3.je4;
import te3.ke4;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.b */
public class C81310b extends C89132b<C52094yb> {

    /* renamed from: i */
    public static final LongSparseArray<Object> f238747i = new LongSparseArray<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.b$a */
    public class C81311a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f238748d;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.b$a$a */
        public class C81312a implements C88631d.C76721a<Object> {
            public C81312a(C81311a aVar) {
            }

            /* renamed from: a */
            public void mo1720a(Object obj) {
                C115669n.INSTANCE.mo175911u(1422, 2);
                C87732a.INSTANCE.mo122144a(0, 2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.b$a$b */
        public class C81313b implements C88631d.C88632b<C89132b.C89134c<C52094yb>> {
            public C81313b(C81311a aVar) {
            }

            /* renamed from: a */
            public void mo1772a(Object obj) {
                LinkedList<ke4> linkedList;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                int i = cVar.f256793a;
                int i2 = cVar.f256794b;
                String str = cVar.f256795c;
                C52094yb ybVar = (C52094yb) cVar.f256796d;
                Log.m105925i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "onCgiBack, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i != 0 || i2 != 0 || ybVar == null || (linkedList = ybVar.f145216d) == null) {
                    C115669n.INSTANCE.mo175911u(1422, 2);
                    C87732a.INSTANCE.mo122144a(0, 2);
                    return;
                }
                C81314c.f238749w.mo113599a(linkedList, false);
                C81340p.m99758a(ybVar.f145216d, 0, (String) null);
                C115669n.INSTANCE.mo175911u(1422, 1);
                C87732a.INSTANCE.mo122144a(0, 1);
            }
        }

        public C81311a(long j) {
            this.f238748d = j;
        }

        /* renamed from: a */
        public final void mo113596a(List<je4> list) {
            C87732a.INSTANCE.mo122144a(0, 0);
            C89059e<C89132b.C89134c<C52094yb>> i = new C81310b(list, (C81311a) null).mo9225i();
            C88825i iVar = C88819d.LOGIC;
            i.mo114039c(iVar, new C81313b(this));
            i.mo123066f(iVar, new C81312a(this));
        }

        public void run() {
            int size;
            List list;
            LongSparseArray<Object> longSparseArray = C81310b.f238747i;
            synchronized (longSparseArray) {
                longSparseArray.remove(this.f238748d);
                size = longSparseArray.size();
            }
            if (size > 0) {
                C115669n.INSTANCE.mo175911u(1422, 12);
            }
            if (C86709a0.m107523b().f251765p) {
                C81161g2.requireAccountInitializedOnDemand();
                if (C81161g2.f238476o != null) {
                    C81161g2.requireAccountInitializedOnDemand();
                    if (C81161g2.f238471g != null) {
                        C85801v1 i = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar = C72994y1.C72995a.APPBRAND_PREDOWNLOAD_CGI_PULL_LAST_TIME_IN_SECOND_LONG;
                        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
                        long j = AppBrandGlobalSystemConfig.m100099b().f239287J.f239350d;
                        long nowSecond = Util.nowSecond();
                        int i2 = 0;
                        if (nowSecond >= longValue + j || longValue > j + nowSecond) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(nowSecond));
                            try {
                                list = C81310b.m99724k();
                            } catch (SQLiteDiskIOException | com.tencent.wcdb.database.SQLiteDiskIOException e) {
                                Log.m105921e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit::collectReqInfoList, e=%s", e);
                                list = null;
                            }
                            if (Util.isNullOrNil(list)) {
                                Log.m105920e("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, empty list");
                                return;
                            }
                            Log.m105925i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "pullIfExceedLimit, collectReqInfoList.size=%d", Integer.valueOf(list.size()));
                            int i3 = AppBrandGlobalSystemConfig.m100099b().f239287J.f239353g;
                            int i4 = 0;
                            while (i2 < list.size() / i3) {
                                int i5 = i2 * i3;
                                int i6 = i5 + i3;
                                mo113596a(list.subList(i5, i6));
                                i2++;
                                i4 = i6;
                            }
                            if (i4 < list.size()) {
                                mo113596a(list.subList(i4, list.size()));
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new LongSparseArray();
    }

    public C81310b(List list, C81311a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51949xb xbVar = new C51949xb();
        xbVar.f144574d.addAll(list);
        bVar.f127066a = xbVar;
        bVar.f127067b = new C52094yb();
        bVar.f127069d = 2763;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxasync/wxabatchsyncversion";
        mo123453j(bVar.mo72403a());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x009a */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0122 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x022d A[EDGE_INSN: B:172:0x022d->B:83:0x022d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0140 A[Catch:{ Exception -> 0x0258 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01dd A[Catch:{ all -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e0 A[Catch:{ all -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022e A[Catch:{ all -> 0x023c }, LOOP:3: B:64:0x01c5->B:84:0x022e, LOOP_END] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m99724k() {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.r> r1 = com.tencent.p014mm.plugin.appbrand.appusage.C29384r.class
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            sf0.z$a r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238476o
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r0 = r0.f239287J
            int r3 = r0.f239352f
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r0 = r0.f239287J
            long r6 = r0.f239351e
            long r4 = r4 - r6
            android.content.SharedPreferences r0 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            java.lang.String r6 = "MicroMsg.AppBrand.CgiBatchSyncPkgVersion__LaunchDuplicateRecordV2TransferComplete"
            r7 = 0
            boolean r0 = r0.getBoolean(r6, r7)
            r8 = 1
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r1)
            r9 = r0
            com.tencent.mm.plugin.appbrand.appusage.r r9 = (com.tencent.p014mm.plugin.appbrand.appusage.C29384r) r9
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r9.f80173d
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            long r10 = r10.getId()
            long r10 = r0.beginTransaction(r10)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r9.f80173d     // Catch:{ all -> 0x009a }
            java.lang.String r13 = "AppBrandAppLaunchUsernameDuplicateRecord"
            r14 = 0
            java.lang.String r15 = "updateTime>=?"
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x009a }
            java.lang.String r16 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009a }
            r0[r7] = r16     // Catch:{ all -> 0x009a }
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r0
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x009a }
            if (r12 == 0) goto L_0x0095
            boolean r0 = r12.isClosed()     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0095
            boolean r0 = r12.moveToFirst()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0095
            com.tencent.mm.plugin.appbrand.appusage.b r0 = new com.tencent.mm.plugin.appbrand.appusage.b     // Catch:{ all -> 0x0089 }
            r0.<init>()     // Catch:{ all -> 0x0089 }
        L_0x006f:
            r0.convertFrom(r12)     // Catch:{ all -> 0x0089 }
            java.lang.String r13 = r0.field_username     // Catch:{ all -> 0x0089 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0089 }
            if (r13 == 0) goto L_0x007b
            goto L_0x0082
        L_0x007b:
            java.lang.String r13 = r0.field_username     // Catch:{ all -> 0x0089 }
            long r14 = r0.field_updateTime     // Catch:{ all -> 0x0089 }
            r9.mo56652qq(r13, r14)     // Catch:{ all -> 0x0089 }
        L_0x0082:
            boolean r13 = r12.moveToNext()     // Catch:{ all -> 0x0089 }
            if (r13 != 0) goto L_0x006f
            goto L_0x0095
        L_0x0089:
            r0 = move-exception
            r13 = r0
            r12.close()     // Catch:{ all -> 0x008f }
            goto L_0x0094
        L_0x008f:
            r0 = move-exception
            r12 = r0
            r13.addSuppressed(r12)     // Catch:{ all -> 0x009a }
        L_0x0094:
            throw r13     // Catch:{ all -> 0x009a }
        L_0x0095:
            if (r12 == 0) goto L_0x009a
            r12.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r9.f80173d     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = "AppBrandAppLaunchUsernameDuplicateRecord"
            java.lang.String r13 = "DROP TABLE AppBrandAppLaunchUsernameDuplicateRecord"
            r0.execSQL(r12, r13)     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r9.f80173d
            r0.endTransaction(r10)
            android.content.SharedPreferences r0 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r6, r8)
            r0.apply()
        L_0x00b7:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r4)
            r0[r7] = r6
            java.lang.String r6 = "MicroMsg.AppBrand.CgiBatchSyncPkgVersion"
            java.lang.String r9 = "collectReqInfoList with minUpdateTime( %s )"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r0)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.String r0 = "database"
            gy3.C87412m.m108594g(r2, r0)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r0 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            java.lang.String r11 = "obtain()"
            gy3.C87412m.m108593f(r0, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "collectPreDownloadWhiteListReqList, preDownloadList:"
            r11.append(r12)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r12 = r0.f239287J
            android.util.LongSparseArray<java.util.List<java.lang.String>> r12 = r12.f239354h
            if (r12 == 0) goto L_0x00f3
            java.lang.String r12 = r12.toString()
            goto L_0x00f4
        L_0x00f3:
            r12 = 0
        L_0x00f4:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.AppBrand.BatchSyncVersionUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$WeAppSyncVersionSetting r0 = r0.f239287J     // Catch:{ Exception -> 0x0258 }
            android.util.LongSparseArray<java.util.List<java.lang.String>> r0 = r0.f239354h     // Catch:{ Exception -> 0x0258 }
            if (r0 == 0) goto L_0x0255
            int r14 = r0.size()     // Catch:{ Exception -> 0x0258 }
            r15 = 0
        L_0x010b:
            if (r15 >= r14) goto L_0x0255
            r17 = r14
            long r13 = r0.keyAt(r15)     // Catch:{ Exception -> 0x0258 }
            java.lang.Object r18 = r0.valueAt(r15)     // Catch:{ Exception -> 0x0258 }
            java.util.List r18 = (java.util.List) r18     // Catch:{ Exception -> 0x0258 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x0258 }
            r8.<init>()     // Catch:{ Exception -> 0x0258 }
            java.util.Iterator r18 = r18.iterator()     // Catch:{ Exception -> 0x0258 }
        L_0x0122:
            boolean r19 = r18.hasNext()     // Catch:{ Exception -> 0x0258 }
            if (r19 == 0) goto L_0x0144
            java.lang.Object r11 = r18.next()     // Catch:{ Exception -> 0x0258 }
            r19 = r11
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x0258 }
            if (r19 == 0) goto L_0x013c
            int r19 = r19.length()     // Catch:{ Exception -> 0x0258 }
            if (r19 != 0) goto L_0x0139
            goto L_0x013c
        L_0x0139:
            r19 = 0
            goto L_0x013e
        L_0x013c:
            r19 = 1
        L_0x013e:
            if (r19 != 0) goto L_0x0122
            r8.add(r11)     // Catch:{ Exception -> 0x0258 }
            goto L_0x0122
        L_0x0144:
            boolean r11 = r8.isEmpty()     // Catch:{ Exception -> 0x0258 }
            if (r11 == 0) goto L_0x0150
            r29 = r0
        L_0x014c:
            r19 = r1
            goto L_0x0249
        L_0x0150:
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x0258 }
            r28 = r8
            r7 = 0
            long r7 = java.lang.Math.max(r7, r13)     // Catch:{ Exception -> 0x0258 }
            long r7 = r18 - r7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0258 }
            r11.<init>()     // Catch:{ Exception -> 0x0258 }
            r29 = r0
            java.lang.String r0 = " select distinct  WxaAttributesTable.username, WxaAttributesTable.appId, WxaAttributesTable.versionInfo  from AppBrandAppLaunchUsernameDuplicateRecord2 left outer join WxaAttributesTable  on AppBrandAppLaunchUsernameDuplicateRecord2.usernameHash = WxaAttributesTable.usernameHash  where AppBrandAppLaunchUsernameDuplicateRecord2.updateTime >= "
            r11.append(r0)     // Catch:{ Exception -> 0x0258 }
            r11.append(r7)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r0 = "  and ("
            r11.append(r0)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r20 = " or "
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            com.tencent.mm.plugin.appbrand.appcache.predownload.a r25 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C29234a.f79894d     // Catch:{ Exception -> 0x0258 }
            r26 = 30
            r27 = 0
            r19 = r28
            java.lang.String r0 = sx3.C110818d0.m150921S(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0258 }
            r11.append(r0)     // Catch:{ Exception -> 0x0258 }
            r0 = 41
            r11.append(r0)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0258 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0258 }
            r7.<init>()     // Catch:{ Exception -> 0x0258 }
            java.lang.String r8 = "collectPreDownloadWhiteListReqList, execute sql:"
            r7.append(r8)     // Catch:{ Exception -> 0x0258 }
            r7.append(r0)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0258 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)     // Catch:{ Exception -> 0x0258 }
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0258 }
            r7 = r28
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r7, r8)     // Catch:{ Exception -> 0x0258 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ Exception -> 0x0258 }
            r8 = 2
            android.database.Cursor r7 = r2.rawQuery(r0, r7, r8)     // Catch:{ Exception -> 0x0258 }
            if (r7 == 0) goto L_0x014c
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x0231
        L_0x01c5:
            r8 = 0
            java.lang.String r0 = r7.getString(r8)     // Catch:{ all -> 0x023e }
            r8 = 1
            java.lang.String r11 = r7.getString(r8)     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x01da
            int r8 = r0.length()     // Catch:{ all -> 0x023e }
            if (r8 != 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r8 = 0
            goto L_0x01db
        L_0x01da:
            r8 = 1
        L_0x01db:
            if (r8 == 0) goto L_0x01e0
            r19 = r1
            goto L_0x0227
        L_0x01e0:
            java.lang.String r8 = "username"
            gy3.C87412m.m108593f(r0, r8)     // Catch:{ all -> 0x023e }
            te3.je4 r8 = new te3.je4     // Catch:{ all -> 0x023e }
            r8.<init>()     // Catch:{ all -> 0x023e }
            r8.f136068d = r0     // Catch:{ all -> 0x023e }
            r19 = r1
            r1 = 2
            java.lang.String r20 = r7.getString(r1)     // Catch:{ all -> 0x023c }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r1 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionInfo.m100125a(r20)     // Catch:{ all -> 0x023c }
            if (r1 == 0) goto L_0x01fd
            int r1 = r1.f239452d     // Catch:{ all -> 0x023c }
            goto L_0x01fe
        L_0x01fd:
            r1 = 0
        L_0x01fe:
            r8.f136069e = r1     // Catch:{ all -> 0x023c }
            r10.put(r0, r8)     // Catch:{ all -> 0x023c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023c }
            r1.<init>()     // Catch:{ all -> 0x023c }
            java.lang.String r8 = "collectPreDownloadWhiteListReqList, matched username:"
            r1.append(r8)     // Catch:{ all -> 0x023c }
            r1.append(r0)     // Catch:{ all -> 0x023c }
            java.lang.String r0 = ", appId:"
            r1.append(r0)     // Catch:{ all -> 0x023c }
            r1.append(r11)     // Catch:{ all -> 0x023c }
            java.lang.String r0 = ", usedTime:"
            r1.append(r0)     // Catch:{ all -> 0x023c }
            r1.append(r13)     // Catch:{ all -> 0x023c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x023c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x023c }
        L_0x0227:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x023c }
            if (r0 != 0) goto L_0x022e
            goto L_0x0233
        L_0x022e:
            r1 = r19
            goto L_0x01c5
        L_0x0231:
            r19 = r1
        L_0x0233:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x023c }
            r1 = 0
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x023a }
            goto L_0x0249
        L_0x023a:
            r0 = move-exception
            goto L_0x025b
        L_0x023c:
            r0 = move-exception
            goto L_0x0241
        L_0x023e:
            r0 = move-exception
            r19 = r1
        L_0x0241:
            r1 = r0
            throw r1     // Catch:{ all -> 0x0243 }
        L_0x0243:
            r0 = move-exception
            r8 = r0
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x023a }
            throw r8     // Catch:{ Exception -> 0x023a }
        L_0x0249:
            int r15 = r15 + 1
            r14 = r17
            r1 = r19
            r0 = r29
            r7 = 0
            r8 = 1
            goto L_0x010b
        L_0x0255:
            r19 = r1
            goto L_0x026f
        L_0x0258:
            r0 = move-exception
            r19 = r1
        L_0x025b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "collectPreDownloadWhiteListReqList get exception:"
            r1.append(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x026f:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x027c
            java.util.Collection r0 = r10.values()
            r9.addAll(r0)
        L_0x027c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select distinct WxaAttributesTable.username,WxaAttributesTable.versionInfo from AppBrandAppLaunchUsernameDuplicateRecord2 left outer join WxaAttributesTable on AppBrandAppLaunchUsernameDuplicateRecord2.usernameHash=WxaAttributesTable.usernameHash where AppBrandAppLaunchUsernameDuplicateRecord2.updateTime >= "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " order by "
            r0.append(r1)
            java.lang.String r1 = "AppBrandAppLaunchUsernameDuplicateRecord2.updateTime"
            r0.append(r1)
            java.lang.String r1 = " desc limit "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " offset 0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            r3 = 0
            android.database.Cursor r0 = r2.rawQuery(r0, r3, r1)
            if (r0 == 0) goto L_0x03ee
            boolean r1 = r0.isClosed()
            if (r1 == 0) goto L_0x02b5
            goto L_0x03ee
        L_0x02b5:
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L_0x02f4
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r1 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes
            r1.<init>()
        L_0x02c0:
            r3 = 0
            java.lang.String r7 = r0.getString(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r3 == 0) goto L_0x02cc
            goto L_0x02ee
        L_0x02cc:
            boolean r3 = r10.containsKey(r7)
            if (r3 == 0) goto L_0x02d3
            goto L_0x02ee
        L_0x02d3:
            r1.convertFrom(r0)
            te3.je4 r3 = new te3.je4
            r3.<init>()
            r3.f136068d = r7
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r7 = r1.mo113942o2()
            if (r7 == 0) goto L_0x02eb
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r7 = r1.mo113942o2()
            int r7 = r7.f239452d
            r3.f136069e = r7
        L_0x02eb:
            r9.add(r3)
        L_0x02ee:
            boolean r3 = r0.moveToNext()
            if (r3 != 0) goto L_0x02c0
        L_0x02f4:
            r0.close()
            r1 = 1
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r7 = 0
            r0[r7] = r3
            java.lang.String r3 = "AppBrandAppLaunchUsernameDuplicateRecord2"
            java.lang.String r8 = "updateTime < ?"
            int r0 = r2.delete(r3, r8, r0)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r4)
            r3[r7] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            java.lang.String r0 = "collectReqInfoList, delete records updateTime < %s, count %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r3)
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            if (r0 != 0) goto L_0x0329
            sx3.f0 r0 = sx3.C64186f0.f181907d
            goto L_0x03ea
        L_0x0329:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r2 = wi0.C38163u.f100828b
            java.util.Iterator r2 = r2.iterator()
        L_0x0334:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e9
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r4 = wi0.C38163u.f100829c
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r19)     // Catch:{ Exception -> 0x0353 }
            com.tencent.mm.plugin.appbrand.appusage.r r5 = (com.tencent.p014mm.plugin.appbrand.appusage.C29384r) r5     // Catch:{ Exception -> 0x0353 }
            boolean r5 = r5.mo56651jo(r4)     // Catch:{ Exception -> 0x0353 }
            goto L_0x0355
        L_0x0353:
            r5 = 0
        L_0x0355:
            if (r5 == 0) goto L_0x0358
            goto L_0x0334
        L_0x0358:
            r5 = 0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x037a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = ""
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 == 0) goto L_0x0370
            goto L_0x0372
        L_0x0370:
            java.lang.String r6 = "$"
        L_0x0372:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L_0x037b
        L_0x037a:
            r5 = 0
        L_0x037b:
            java.lang.String r6 = "PkgQueryKey(appId, \"\", 0).toString()"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r6 = "pkgPath"
            java.lang.String r7 = "version"
            java.lang.String r8 = "versionMd5"
            java.lang.String r10 = "NewMd5"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r10}
            r7 = 0
            com.tencent.mm.plugin.appbrand.appcache.z2 r5 = r0.mo113516Kn(r5, r7, r6)
            if (r5 == 0) goto L_0x03e3
            java.lang.String r6 = r5.field_pkgPath
            if (r6 == 0) goto L_0x03a4
            int r6 = r6.length()
            if (r6 != 0) goto L_0x03a1
            goto L_0x03a4
        L_0x03a1:
            r18 = 0
            goto L_0x03a6
        L_0x03a4:
            r18 = 1
        L_0x03a6:
            if (r18 != 0) goto L_0x03e3
            java.lang.String r6 = r5.field_pkgPath
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r6 == 0) goto L_0x03e3
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.String r7 = r5.field_pkgPath
            r6.<init>((java.lang.String) r7)
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.String r10 = r5.field_versionMd5
            r11 = 0
            r8[r11] = r10
            java.lang.String r10 = r5.field_NewMd5
            r12 = 1
            r8[r12] = r10
            java.lang.String r10 = "collectBatchSyncVersionReqList"
            r13 = 0
            boolean r6 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99684j(r6, r8, r3, r10, r13)
            if (r6 == 0) goto L_0x0334
            te3.je4 r6 = new te3.je4
            r6.<init>()
            r6.f136068d = r4
            int r4 = r5.field_version
            r6.f136069e = r4
            r6.f136070f = r4
            r6.f136071g = r13
            r6.f136072h = r3
            r1.add(r6)
            goto L_0x0334
        L_0x03e3:
            r7 = 2
            r11 = 0
            r12 = 1
            r13 = 0
            goto L_0x0334
        L_0x03e9:
            r0 = r1
        L_0x03ea:
            r9.addAll(r0)
            goto L_0x03f2
        L_0x03ee:
            java.util.List r9 = java.util.Collections.emptyList()
        L_0x03f2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81310b.m99724k():java.util.List");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 113 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m99725l() {
        /*
            long r0 = java.lang.System.nanoTime()
            android.util.LongSparseArray<java.lang.Object> r2 = f238747i
            monitor-enter(r2)
            r2.put(r0, r2)     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            com.tencent.mm.plugin.appbrand.appcache.predownload.b$a r2 = new com.tencent.mm.plugin.appbrand.appcache.predownload.b$a
            r2.<init>(r0)
            zt3.t r0 = zt3.C119157j.f356862d
            java.lang.String r1 = "MicroMsg.AppBrand.CgiBatchSyncPkgVersion"
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183876g(r2, r1)
            return
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x001c:
            r0 = move-exception
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81310b.m99725l():void");
    }

    /* renamed from: i */
    public synchronized C89059e<C89132b.C89134c<C52094yb>> mo9225i() {
        C115669n.INSTANCE.mo175911u(1422, 3);
        return super.mo9225i();
    }
}
