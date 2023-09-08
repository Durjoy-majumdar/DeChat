package com.tencent.p014mm.plugin.game.model.silent_download;

import android.database.Cursor;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p237sp.C13754y;
import p763ym.C79138l;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.k */
public class C42107k {

    /* renamed from: com.tencent.mm.plugin.game.model.silent_download.k$a */
    public class C42108a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42103f f113417d;

        /* renamed from: com.tencent.mm.plugin.game.model.silent_download.k$a$a */
        public class C42109a implements Runnable {
            public C42109a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x009d, code lost:
                if (com.tencent.p014mm.sdk.platformtools.Util.nowSecond() >= r9) goto L_0x00ae;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ac, code lost:
                if (com.tencent.p014mm.sdk.platformtools.Util.nowSecond() >= r11.f113419d.f113417d.field_nextCheckTime) goto L_0x00ae;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b0, code lost:
                r0 = false;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    java.lang.Class<sw1.q> r0 = sw1.C48484q.class
                    com.tencent.mm.plugin.game.model.silent_download.k$a r1 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.f r1 = r1.f113417d
                    boolean r1 = r1.field_isFirst
                    java.lang.String r2 = "MicroMsg.GameSilentDownloader"
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    if (r1 == 0) goto L_0x00a0
                    di3.d r1 = di3.C86312j.m106911c(r0)
                    sw1.q r1 = (sw1.C48484q) r1
                    com.tencent.mm.plugin.game.model.silent_download.i r1 = r1.Po0()
                    com.tencent.mm.plugin.game.model.silent_download.k$a r6 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.f r6 = r6.f113417d
                    java.lang.String r6 = r6.field_appId
                    r1.getClass()
                    boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                    java.lang.String r8 = "MicroMsg.GameSilentDownloadStorage"
                    if (r7 == 0) goto L_0x0030
                    java.lang.String r1 = "updateFirstFlag: appid is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                    goto L_0x0059
                L_0x0030:
                    r7 = 4
                    java.lang.Object[] r7 = new java.lang.Object[r7]
                    java.lang.String r9 = "GameSilentDownload"
                    r7[r4] = r9
                    java.lang.String r10 = "isFirst"
                    r7[r5] = r10
                    java.lang.String r10 = "appId"
                    r7[r3] = r10
                    r10 = 3
                    r7[r10] = r6
                    java.lang.String r6 = "update %s set %s=0 where %s='%s'"
                    java.lang.String r6 = java.lang.String.format(r6, r7)
                    boolean r1 = r1.execSQL(r9, r6)
                    java.lang.Object[] r6 = new java.lang.Object[r5]
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r6[r4] = r1
                    java.lang.String r1 = "updateFirstFlag ret:%b"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r6)
                L_0x0059:
                    com.tencent.mm.plugin.game.model.silent_download.k$a r1 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.k r6 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.this
                    com.tencent.mm.plugin.game.model.silent_download.f r1 = r1.f113417d
                    long r7 = r1.field_randomTime
                    r6.getClass()
                    r9 = 0
                    int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r1 > 0) goto L_0x006b
                    goto L_0x0084
                L_0x006b:
                    int r1 = (int) r7
                    int r1 = com.tencent.p014mm.sdk.platformtools.Util.getIntRandom(r1, r4)
                    java.lang.Object[] r6 = new java.lang.Object[r5]
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                    r6[r4] = r7
                    java.lang.String r7 = "random time interval:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
                    long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                    long r8 = (long) r1
                    long r9 = r8 + r6
                L_0x0084:
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    sw1.q r0 = (sw1.C48484q) r0
                    com.tencent.mm.plugin.game.model.silent_download.i r0 = r0.Po0()
                    com.tencent.mm.plugin.game.model.silent_download.k$a r1 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.f r1 = r1.f113417d
                    java.lang.String r1 = r1.field_appId
                    r0.mo66059Ow(r1, r9)
                    long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                    int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                    if (r6 < 0) goto L_0x00b0
                    goto L_0x00ae
                L_0x00a0:
                    long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                    com.tencent.mm.plugin.game.model.silent_download.k$a r6 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.f r6 = r6.f113417d
                    long r6 = r6.field_nextCheckTime
                    int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                    if (r8 < 0) goto L_0x00b0
                L_0x00ae:
                    r0 = 1
                    goto L_0x00b1
                L_0x00b0:
                    r0 = 0
                L_0x00b1:
                    if (r0 == 0) goto L_0x0113
                    com.tencent.mm.plugin.game.model.silent_download.k$a r0 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.k r1 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.this
                    com.tencent.mm.plugin.game.model.silent_download.f r0 = r0.f113417d
                    java.lang.String r0 = r0.field_appId
                    r1.getClass()
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                    r3[r4] = r6
                    r3[r5] = r0
                    java.lang.String r6 = "source:%d, appid:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r3)
                    ob0.c$b r2 = new ob0.c$b
                    r2.<init>()
                    r3 = 2819(0xb03, float:3.95E-42)
                    r2.f127069d = r3
                    r2.f127070e = r4
                    r2.f127071f = r4
                    java.lang.String r3 = "/cgi-bin/mmgame-bin/checkappdownloadquota"
                    r2.f127068c = r3
                    tw1.a r3 = new tw1.a
                    r3.<init>()
                    r3.f146350d = r5
                    r3.f146352f = r0
                    java.lang.Class<sp.t> r5 = p237sp.C48456t.class
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    sp.t r5 = (p237sp.C48456t) r5
                    xh.w2 r5 = r5.mo72822IX(r0)
                    if (r5 == 0) goto L_0x00fd
                    java.lang.String r6 = r5.field_downloadUrl
                    r3.f146351e = r6
                    long r5 = r5.field_downloadedSize
                    r3.f146353g = r5
                L_0x00fd:
                    r2.f127066a = r3
                    tw1.b r3 = new tw1.b
                    r3.<init>()
                    r2.f127067b = r3
                    ob0.c r2 = r2.mo72403a()
                    com.tencent.mm.plugin.game.model.silent_download.l r3 = new com.tencent.mm.plugin.game.model.silent_download.l
                    r3.<init>(r1, r0)
                    ob0.C89144l0.m111429e(r2, r3, r4)
                    goto L_0x0126
                L_0x0113:
                    u10.a r5 = u10.C52415a.m58668a()
                    r6 = 12
                    com.tencent.mm.plugin.game.model.silent_download.k$a r0 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.this
                    com.tencent.mm.plugin.game.model.silent_download.f r0 = r0.f113417d
                    java.lang.String r7 = r0.field_appId
                    r9 = 0
                    java.lang.String r8 = "random_time"
                    r5.mo62980b(r6, r7, r8, r9)
                L_0x0126:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42108a.C42109a.run():void");
            }
        }

        public C42108a(C42103f fVar) {
            this.f113417d = fVar;
        }

        public void run() {
            ((C79138l) C86312j.m106911c(C79138l.class)).mo74001TT(this.f113417d.field_appId, false);
            MMHandlerThread.postToMainThread(new C42109a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.silent_download.k$b */
    public static class C42110b {

        /* renamed from: a */
        public static C42107k f113420a = new C42107k((C42106j) null);
    }

    public C42107k(C42106j jVar) {
    }

    /* renamed from: a */
    public final void mo66067a(String str) {
        FileDownloadTaskInfo a;
        if (!Util.isNullOrNil(str)) {
            C42103f fVar = new C42103f();
            fVar.field_appId = str;
            boolean delete = ((C48484q) C86312j.m106911c(C48484q.class)).Po0().delete(fVar, new String[0]);
            Log.m105925i("MicroMsg.GameSilentDownloader", "remove SilentDownload DB, appid:%s, ret:%b", str, Boolean.valueOf(delete));
            if (delete && (a = C42101c.m45793a(str)) != null) {
                long j = a.f12194d;
                if (j > 0) {
                    ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(j);
                    Log.m105925i("MicroMsg.GameSilentDownloader", "remove download task, appid:%s", a.f12199i);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01fb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66068b(boolean r15) {
        /*
            r14 = this;
            java.lang.Class<sp.x> r0 = p237sp.C13753x.class
            java.lang.Class<sw1.q> r1 = sw1.C48484q.class
            di3.d r2 = di3.C86312j.m106911c(r1)
            sw1.q r2 = (sw1.C48484q) r2
            com.tencent.mm.plugin.game.model.silent_download.i r2 = r2.Po0()
            r2.getClass()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "GameSilentDownload"
            r6 = 0
            r4[r6] = r5
            r7 = 1
            java.lang.String r8 = "isRunning"
            r4[r7] = r8
            java.lang.String r8 = "select * from %s where %s=1 limit 1"
            java.lang.String r4 = java.lang.String.format(r8, r4)
            java.lang.String[] r8 = new java.lang.String[r6]
            android.database.Cursor r4 = r2.rawQuery(r4, r8)
            java.lang.String r8 = "MicroMsg.GameSilentDownloadStorage"
            r9 = 0
            if (r4 != 0) goto L_0x0036
            java.lang.String r2 = "first cursor is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
        L_0x0034:
            r2 = r9
            goto L_0x0092
        L_0x0036:
            boolean r10 = r4.moveToFirst()
            if (r10 == 0) goto L_0x0048
            com.tencent.mm.plugin.game.model.silent_download.f r2 = new com.tencent.mm.plugin.game.model.silent_download.f
            r2.<init>()
            r2.convertFrom(r4)
            r4.close()
            goto L_0x0092
        L_0x0048:
            java.lang.String r10 = "no running task"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            r4.close()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r6] = r5
            java.lang.String r5 = "nextCheckTime"
            r4[r7] = r5
            java.lang.String r5 = "select * from %s where %s < ? limit 1"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.String[] r5 = new java.lang.String[r7]
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r5[r6] = r10
            android.database.Cursor r2 = r2.rawQuery(r4, r5)
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = "second cursor is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            goto L_0x0034
        L_0x0076:
            boolean r4 = r2.moveToFirst()
            if (r4 == 0) goto L_0x0089
            com.tencent.mm.plugin.game.model.silent_download.f r4 = new com.tencent.mm.plugin.game.model.silent_download.f
            r4.<init>()
            r4.convertFrom(r2)
            r2.close()
            r2 = r4
            goto L_0x0092
        L_0x0089:
            r2.close()
            java.lang.String r2 = "no record"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            goto L_0x0034
        L_0x0092:
            java.lang.String r4 = "MicroMsg.GameSilentDownloader"
            if (r2 != 0) goto L_0x009c
            java.lang.String r15 = "silentDownload witch can check is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            return
        L_0x009c:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r8 = r2.field_appId
            r5[r6] = r8
            java.lang.String r8 = "[appid:%s] in DB to check download"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r5)
            long r10 = r2.field_expireTime
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x00ca
            java.lang.Object[] r15 = new java.lang.Object[r7]
            java.lang.String r0 = r2.field_appId
            r15[r6] = r0
            java.lang.String r0 = "task expire time, appId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r15)
            java.lang.String r15 = r2.field_appId
            com.tencent.p014mm.plugin.game.model.silent_download.C42104h.m45807d(r15)
            java.lang.String r15 = r2.field_appId
            r14.mo66067a(r15)
            r14.mo66068b(r6)
            return
        L_0x00ca:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r5)
            if (r5 != 0) goto L_0x00e9
            java.lang.String r15 = "NetType is not WIFI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            u10.a r5 = u10.C52415a.m58668a()
            r6 = 12
            java.lang.String r7 = r2.field_appId
            r9 = 0
            java.lang.String r8 = "not_wifi"
            r5.mo62980b(r6, r7, r8, r9)
            return
        L_0x00e9:
            di3.d r5 = di3.C86312j.m106911c(r1)
            sw1.q r5 = (sw1.C48484q) r5
            com.tencent.mm.plugin.game.model.silent_download.i r5 = r5.Po0()
            java.lang.String r8 = r2.field_appId
            r5.mo66061TE(r8)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            boolean r5 = r5.mo121147n()
            if (r5 != 0) goto L_0x011a
            java.lang.String r15 = "sdcard isnt available"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            u10.a r5 = u10.C52415a.m58668a()
            r6 = 12
            java.lang.String r7 = r2.field_appId
            r9 = 0
            java.lang.String r8 = "sdcard_not_available"
            r5.mo62980b(r6, r7, r8, r9)
            return
        L_0x011a:
            di3.d r5 = di3.C86312j.m106911c(r1)
            sw1.q r5 = (sw1.C48484q) r5
            com.tencent.mm.plugin.game.model.silent_download.i r5 = r5.Po0()
            java.lang.String r8 = r2.field_appId
            r5.mo66065kD(r8)
            long r10 = r2.field_size
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0162
            di3.d r5 = di3.C86312j.m106911c(r0)
            sp.x r5 = (p237sp.C13753x) r5
            long r10 = r2.field_size
            boolean r5 = r5.Ci0(r10)
            if (r5 != 0) goto L_0x0162
            di3.d r0 = di3.C86312j.m106911c(r0)
            sp.x r0 = (p237sp.C13753x) r0
            long r10 = r2.field_size
            boolean r0 = r0.mo13122Um(r10)
            if (r0 != 0) goto L_0x0162
            java.lang.String r15 = "sdcard dont have enough space"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            u10.a r5 = u10.C52415a.m58668a()
            r6 = 12
            java.lang.String r7 = r2.field_appId
            r9 = 0
            java.lang.String r8 = "space_not_enough"
            r5.mo62980b(r6, r7, r8, r9)
            return
        L_0x0162:
            di3.d r0 = di3.C86312j.m106911c(r1)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.silent_download.i r0 = r0.Po0()
            java.lang.String r5 = r2.field_appId
            r0.mo66060SE(r5)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r15)
            r0[r6] = r5
            java.lang.String r5 = "fromBattery：%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            if (r15 != 0) goto L_0x020b
            android.content.IntentFilter r15 = new android.content.IntentFilter
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            r15.<init>(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Intent r15 = r0.registerReceiver(r9, r15)
            r0 = 0
            if (r15 == 0) goto L_0x01c6
            java.lang.String r5 = "status"
            r8 = -1
            int r5 = r15.getIntExtra(r5, r8)     // Catch:{ Exception -> 0x01b4 }
            if (r5 == r3) goto L_0x01a1
            r9 = 5
            if (r5 != r9) goto L_0x019f
            goto L_0x01a1
        L_0x019f:
            r5 = 0
            goto L_0x01a2
        L_0x01a1:
            r5 = 1
        L_0x01a2:
            java.lang.String r9 = "level"
            int r9 = r15.getIntExtra(r9, r8)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r10 = "scale"
            int r15 = r15.getIntExtra(r10, r8)     // Catch:{ Exception -> 0x01b2 }
            float r0 = (float) r9
            float r15 = (float) r15
            float r0 = r0 / r15
            goto L_0x01c7
        L_0x01b2:
            r15 = move-exception
            goto L_0x01b6
        L_0x01b4:
            r15 = move-exception
            r5 = 0
        L_0x01b6:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r15 = r15.getMessage()
            r8[r6] = r15
            java.lang.String r15 = "MicroMsg.BatteryHelper"
            java.lang.String r9 = "err:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r9, r8)
            goto L_0x01c7
        L_0x01c6:
            r5 = 0
        L_0x01c7:
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r15[r6] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r15[r7] = r3
            java.lang.String r3 = "battery isCharging:%b  percent:%f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r15)
            if (r5 != 0) goto L_0x01fb
            double r5 = (double) r0
            r7 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x01fb
            java.lang.String r15 = "battery is low"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            u10.a r5 = u10.C52415a.m58668a()
            r6 = 12
            java.lang.String r7 = r2.field_appId
            r9 = 0
            java.lang.String r8 = "battery_is_low"
            r5.mo62980b(r6, r7, r8, r9)
            return
        L_0x01fb:
            di3.d r15 = di3.C86312j.m106911c(r1)
            sw1.q r15 = (sw1.C48484q) r15
            com.tencent.mm.plugin.game.model.silent_download.i r15 = r15.Po0()
            java.lang.String r0 = r2.field_appId
            r15.mo66058Lo(r0)
            goto L_0x021a
        L_0x020b:
            di3.d r15 = di3.C86312j.m106911c(r1)
            sw1.q r15 = (sw1.C48484q) r15
            com.tencent.mm.plugin.game.model.silent_download.i r15 = r15.Po0()
            java.lang.String r0 = r2.field_appId
            r15.mo66058Lo(r0)
        L_0x021a:
            com.tencent.mm.plugin.game.model.silent_download.k$a r15 = new com.tencent.mm.plugin.game.model.silent_download.k$a
            r15.<init>(r2)
            ji3.C9457a.m9137a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.silent_download.C42107k.mo66068b(boolean):void");
    }

    /* renamed from: c */
    public void mo66069c() {
        C42105i Po0 = ((C48484q) C86312j.m106911c(C48484q.class)).Po0();
        Po0.getClass();
        Cursor rawQuery = Po0.rawQuery(String.format("select * from %s", new Object[]{"GameSilentDownload"}), new String[0]);
        ArrayList<C42103f> arrayList = null;
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
        } else if (rawQuery.moveToFirst()) {
            ArrayList arrayList2 = new ArrayList();
            do {
                C42103f fVar = new C42103f();
                fVar.convertFrom(rawQuery);
                arrayList2.add(fVar);
            } while (rawQuery.moveToNext());
            rawQuery.close();
            Log.m105925i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList size:%s", Integer.valueOf(arrayList2.size()));
            arrayList = arrayList2;
        } else {
            rawQuery.close();
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList no record");
        }
        if (!Util.isNullOrNil((List) arrayList)) {
            for (C42103f fVar2 : arrayList) {
                if (fVar2 != null) {
                    if (fVar2.field_expireTime <= Util.nowSecond()) {
                        Log.m105925i("MicroMsg.GameSilentDownloader", "pauseDownload, task expire time, appId:%s", fVar2.field_appId);
                        C42104h.m45807d(fVar2.field_appId);
                        mo66067a(fVar2.field_appId);
                    } else {
                        FileDownloadTaskInfo a = C42101c.m45793a(fVar2.field_appId);
                        if (a != null) {
                            long j = a.f12194d;
                            if (j > 0 && a.f12196f == 1) {
                                Class cls = C13754y.class;
                                ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).f110164g = true;
                                Log.m105925i("MicroMsg.GameSilentDownloader", "pauseDownload, appid:%s, ret:%b", a.f12199i, Boolean.valueOf(((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63965m(j)));
                            }
                        }
                    }
                }
            }
        }
    }
}
