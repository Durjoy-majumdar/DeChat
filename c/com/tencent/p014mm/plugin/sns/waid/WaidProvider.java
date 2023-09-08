package com.tencent.p014mm.plugin.sns.waid;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.Iterator;
import kv2.C34071b;
import kv2.C76637a;

/* renamed from: com.tencent.mm.plugin.sns.waid.WaidProvider */
public class WaidProvider extends ContentProvider {

    /* renamed from: i */
    public static final String f249100i = WeChatAuthorities.AUTHORITIES_WAIDPROVIDER();

    /* renamed from: j */
    public static String[] f249101j = {"pkg", "appWaid", "errCode"};

    /* renamed from: d */
    public UriMatcher f249102d = new UriMatcher(-1);

    /* renamed from: e */
    public long f249103e;

    /* renamed from: f */
    public int f249104f = 0;

    /* renamed from: g */
    public final Object f249105g = new Object();

    /* renamed from: h */
    public volatile boolean f249106h = false;

    /* renamed from: com.tencent.mm.plugin.sns.waid.WaidProvider$a */
    public static class C30473a {

        /* renamed from: a */
        public String f82131a;

        /* renamed from: b */
        public String[] f82132b;

        /* renamed from: c */
        public int f82133c;

        /* renamed from: d */
        public String f82134d;
    }

    /* renamed from: com.tencent.mm.plugin.sns.waid.WaidProvider$b */
    public class C85475b extends Thread {

        /* renamed from: d */
        public int f249107d = 0;

        /* renamed from: e */
        public int f249108e = 12000;

        public C85475b() {
            String str = WaidProvider.f249100i;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            int i = WaidProvider.this.f249104f;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            SnsMethodCalculate.markStartTimeMs("getExpiredDuration", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
            int i2 = 12000 - (i * 4000);
            i2 = i2 < 2000 ? 2000 : i2;
            SnsMethodCalculate.markEndTimeMs("getExpiredDuration", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
            this.f249108e = i2;
        }

        /* renamed from: a */
        public final void mo118840a() {
            SnsMethodCalculate.markStartTimeMs("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
            WaidProvider waidProvider = WaidProvider.this;
            String str = WaidProvider.f249100i;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            Object obj = waidProvider.f249105g;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            synchronized (obj) {
                try {
                    Log.m105924i("ad.waid.WaidProvider", "break Wait, waitTime=" + this.f249107d);
                    WaidProvider waidProvider2 = WaidProvider.this;
                    SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    waidProvider2.f249106h = true;
                    SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    WaidProvider waidProvider3 = WaidProvider.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    Object obj2 = waidProvider3.f249105g;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    obj2.notifyAll();
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
            Log.m105924i("ad.waid.WaidProvider", "CheckThread run, thread.hash=" + hashCode());
            while (!C34071b.m40236j()) {
                Log.m105918d("ad.waid.WaidProvider", "wait, delay=200");
                try {
                    Thread.sleep(200);
                    this.f249107d += 200;
                } catch (Exception unused) {
                }
                if (this.f249107d >= this.f249108e) {
                    Log.m105920e("ad.waid.WaidProvider", "wait expired, expiredDuration=" + this.f249108e);
                    mo118840a();
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
                    return;
                }
            }
            Log.m105924i("ad.waid.WaidProvider", "init done");
            mo118840a();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        }
    }

    /* renamed from: a */
    public final MatrixCursor mo118831a(String str, String str2, int i) {
        SnsMethodCalculate.markStartTimeMs("buildRetCursor", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        MatrixCursor matrixCursor = new MatrixCursor(f249101j, 1);
        MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
        newRow.add("pkg", str);
        newRow.add("appWaid", str2);
        newRow.add("errCode", Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("buildRetCursor", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return matrixCursor;
    }

    /* renamed from: b */
    public synchronized boolean mo118832b(PInt pInt) {
        SnsMethodCalculate.markStartTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        Log.m105924i("ad.waid.WaidProvider", "checkWXEnv start, isInitDone=" + C34071b.m40236j() + ", mIsWxEnvCheckEnd=" + this.f249106h);
        if (C34071b.m40236j()) {
            this.f249106h = true;
            SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return true;
        }
        this.f249106h = false;
        pInt.value = 1;
        new C85475b().start();
        Log.m105924i("ad.waid.WaidProvider", "begin wait");
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.f249106h) {
            synchronized (this.f249105g) {
                try {
                    this.f249105g.wait();
                } catch (Exception e) {
                    try {
                        Log.m105920e("ad.waid.WaidProvider", "wait exp=" + e.toString());
                    } catch (Throwable th) {
                        SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                        throw th;
                    }
                }
            }
        }
        Log.m105924i("ad.waid.WaidProvider", "after wait, timeCost=" + (System.currentTimeMillis() - currentTimeMillis) + ", fromOnCreate=" + (System.currentTimeMillis() - this.f249103e) + ", waitIdx=" + this.f249104f);
        this.f249104f = this.f249104f + 1;
        if (!C34071b.m40236j()) {
            this.f249106h = false;
            Log.m105920e("ad.waid.WaidProvider", "checkWXEnv expired");
            SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return false;
        }
        Log.m105924i("ad.waid.WaidProvider", "checkWXEnv succ");
        SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return true;
    }

    /* renamed from: c */
    public C30473a mo118833c() {
        SnsMethodCalculate.markStartTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        C30473a aVar = new C30473a();
        try {
            aVar.f82131a = getCallingPackage();
        } catch (Throwable th) {
            Log.m105920e("ad.waid.WaidProvider", "getCallingPkg exp=" + th.toString());
        }
        try {
            aVar.f82132b = getContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
        } catch (Throwable th4) {
            Log.m105920e("ad.waid.WaidProvider", "getCallingUid exp=" + th4.toString());
        }
        String[] strArr = aVar.f82132b;
        if (strArr == null || strArr.length <= 0) {
            aVar.f82133c = 5;
            aVar.f82134d = aVar.f82131a;
            SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return aVar;
        } else if (TextUtils.isEmpty(aVar.f82131a)) {
            aVar.f82133c = 1;
            aVar.f82134d = aVar.f82132b[0];
            SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return aVar;
        } else {
            for (String str : aVar.f82132b) {
                if (aVar.f82131a.equals(str)) {
                    if (aVar.f82132b.length > 1) {
                        aVar.f82133c = 2;
                    } else {
                        aVar.f82133c = 3;
                    }
                    aVar.f82134d = str;
                    SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    return aVar;
                }
            }
            aVar.f82133c = 4;
            aVar.f82134d = aVar.f82132b[0];
            SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return aVar;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return 0;
    }

    public String getType(Uri uri) {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SnsMethodCalculate.markStartTimeMs("insert", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return null;
    }

    public boolean onCreate() {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        this.f249102d.addURI(f249100i, "appWaid", 1);
        this.f249103e = System.currentTimeMillis();
        C76637a aVar = new C76637a();
        SnsMethodCalculate.markStartTimeMs("startInit", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        try {
            Log.m105924i("InitTaskMgr", IXWebBroadcastListener.STAGE_START);
            Iterator<Runnable> it = aVar.f224256a.iterator();
            while (it.hasNext()) {
                aVar.f224258c.post(it.next());
            }
            aVar.f224256a.clear();
            aVar.f224257b.quitSafely();
        } catch (Exception e) {
            Log.m105920e("InitTaskMgr", "startInit exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("startInit", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        Log.m105924i("ad.waid.WaidProvider", "onCreate, this.hash=" + hashCode());
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006a A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079 A[SYNTHETIC, Splitter:B:14:0x0079] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r20, java.lang.String[] r21, java.lang.String r22, java.lang.String[] r23, java.lang.String r24) {
        /*
            r19 = this;
            r1 = r19
            r0 = r23
            java.lang.String r2 = "query"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.waid.WaidProvider"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "com.tencent.mm.plugin.sns.waid.WaidHelper"
            java.lang.String r5 = ", callingPkg="
            java.lang.String r6 = "ad.waid.WaidProvider"
            java.lang.String r7 = "handleQuery"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0134 }
            com.tencent.mm.plugin.sns.waid.WaidProvider$a r10 = r19.mo118833c()     // Catch:{ all -> 0x0134 }
            r11 = 0
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0032
            int r13 = r0.length     // Catch:{ all -> 0x0134 }
            if (r13 <= 0) goto L_0x0032
            r0 = r0[r11]     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0134 }
            goto L_0x0033
        L_0x0032:
            r0 = r12
        L_0x0033:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r13.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r14 = "handleQuery queryPkg="
            r13.append(r14)     // Catch:{ all -> 0x0134 }
            r13.append(r0)     // Catch:{ all -> 0x0134 }
            r13.append(r5)     // Catch:{ all -> 0x0134 }
            java.lang.String r14 = r10.f82134d     // Catch:{ all -> 0x0134 }
            r13.append(r14)     // Catch:{ all -> 0x0134 }
            java.lang.String r14 = ", thread.hash="
            r13.append(r14)     // Catch:{ all -> 0x0134 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0134 }
            int r14 = r14.hashCode()     // Catch:{ all -> 0x0134 }
            r13.append(r14)     // Catch:{ all -> 0x0134 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)     // Catch:{ all -> 0x0134 }
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt     // Catch:{ all -> 0x0134 }
            r13.<init>()     // Catch:{ all -> 0x0134 }
            boolean r14 = r1.mo118832b(r13)     // Catch:{ all -> 0x0134 }
            if (r14 != 0) goto L_0x0079
            java.lang.String r0 = "checkWXEnv failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x0134 }
            r0 = -1
            android.database.MatrixCursor r0 = r1.mo118831a(r12, r12, r0)     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x0151
        L_0x0079:
            java.lang.String r14 = r10.f82134d     // Catch:{ all -> 0x0134 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0134 }
            r15 = 1
            if (r14 == 0) goto L_0x008b
            java.lang.String r4 = "handleQuery callingPkg empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)     // Catch:{ all -> 0x0134 }
            r11 = r12
            r4 = 1
            goto L_0x010e
        L_0x008b:
            boolean r14 = kv2.C34071b.m40234h()     // Catch:{ all -> 0x0134 }
            if (r14 != 0) goto L_0x0099
            java.lang.String r4 = "handleQuery isExptWaidEnable==false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)     // Catch:{ all -> 0x0134 }
            r4 = 2
            r15 = 2
            goto L_0x00aa
        L_0x0099:
            android.content.UriMatcher r14 = r1.f249102d     // Catch:{ all -> 0x0134 }
            r11 = r20
            int r11 = r14.match(r11)     // Catch:{ all -> 0x0134 }
            if (r11 == r15) goto L_0x00ad
            java.lang.String r4 = "handleQuery uriMatch failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)     // Catch:{ all -> 0x0134 }
            r4 = 3
            r15 = 3
        L_0x00aa:
            r11 = r12
            r4 = r15
            goto L_0x010e
        L_0x00ad:
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0134 }
            if (r11 == 0) goto L_0x00b6
            java.lang.String r11 = r10.f82134d     // Catch:{ all -> 0x0134 }
            goto L_0x00b7
        L_0x00b6:
            r11 = r0
        L_0x00b7:
            java.lang.String r14 = "isInWhiteList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)     // Catch:{ all -> 0x0134 }
            java.lang.String r14 = r10.f82134d     // Catch:{ all -> 0x0134 }
            boolean r14 = r14.equals(r11)     // Catch:{ all -> 0x0134 }
            if (r14 != 0) goto L_0x00e5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r4.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r14 = "handleQuery queryPkg!=callingPkg, queryPkg="
            r4.append(r14)     // Catch:{ all -> 0x0134 }
            r4.append(r11)     // Catch:{ all -> 0x0134 }
            r4.append(r5)     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = r10.f82134d     // Catch:{ all -> 0x0134 }
            r4.append(r5)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)     // Catch:{ all -> 0x0134 }
            r4 = 4
            goto L_0x010e
        L_0x00e5:
            java.lang.String r5 = "getAppWaidForThirdApp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)     // Catch:{ all -> 0x0134 }
            java.lang.String r12 = kv2.C34071b.m40228b(r11)     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r4.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = "handleQuery, appWaid="
            r4.append(r5)     // Catch:{ all -> 0x0134 }
            r4.append(r12)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)     // Catch:{ all -> 0x0134 }
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x010d
            r4 = 5
            goto L_0x010e
        L_0x010d:
            r4 = 0
        L_0x010e:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0134 }
            long r14 = r14 - r8
            int r5 = (int) r14     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = r10.f82134d     // Catch:{ all -> 0x0134 }
            int r14 = r10.f82133c     // Catch:{ all -> 0x0134 }
            int r9 = r13.value     // Catch:{ all -> 0x0134 }
            r13 = r8
            r15 = r0
            r16 = r4
            r17 = r9
            r18 = r5
            com.tencent.p014mm.plugin.sns.waid.C30474a.m39104d(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.plugin.sns.waid.C30474a.m39103c(r10, r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ all -> 0x0134 }
            android.database.MatrixCursor r0 = r1.mo118831a(r11, r0, r4)     // Catch:{ all -> 0x0134 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x0151
        L_0x0134:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleQuery exp="
            r4.append(r5)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r0 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x0151:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.waid.WaidProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return 0;
    }
}
