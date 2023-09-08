package wx1;

import android.database.Cursor;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import org.json.JSONObject;
import p237sp.C13754y;
import p237sp.C48456t;
import sw1.C48484q;
import tw1.C52369c;
import tw1.C52370d;
import tw1.C52371e;
import zt3.C119157j;

/* renamed from: wx1.b */
public final class C53217b {

    /* renamed from: a */
    public static final C53217b f148462a = new C53217b();

    /* renamed from: b */
    public static MTimerHandler f148463b = new MTimerHandler("GameResourceDownloadManager", (MTimerHandler.CallBack) C38344a.f101202d, true);

    /* renamed from: c */
    public static int f148464c = 1;

    /* renamed from: wx1.b$a */
    public static final class C38344a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public static final C38344a f101202d = new C38344a();

        public final boolean onTimerExpired() {
            C53217b.m59631a(C53217b.f148462a);
            return true;
        }
    }

    /* renamed from: wx1.b$b */
    public static final class C38345b implements Runnable {

        /* renamed from: d */
        public static final C38345b f101203d = new C38345b();

        public final void run() {
            C38347e Og0 = ((C48484q) C86312j.m106911c(C48484q.class)).Og0();
            Og0.getClass();
            String str = "select intervalSeconds - abs(" + Util.nowSecond() + " - checkCgiTime) as diffTime from GameResourceDownload order by diffTime asc";
            Log.m105924i("MicroMsg.GameResourceDownloadStorage", "getMinCheckInterval, sql: " + str);
            Cursor rawQuery = Og0.rawQuery(str, new String[0]);
            Long l = null;
            if (rawQuery != null) {
                if (rawQuery.moveToNext()) {
                    l = Long.valueOf(rawQuery.getLong(0));
                }
                rawQuery.close();
            }
            if (l != null) {
                long longValue = l.longValue();
                Log.m105924i("MicroMsg.GameResourceDownloadManager", "resetCheckTimer, interval:" + longValue);
                C53217b.f148463b.stopTimer();
                if (longValue <= 0) {
                    C53217b.m59631a(C53217b.f148462a);
                } else {
                    C53217b.f148463b.startTimer(longValue * ((long) 1000));
                }
                l.longValue();
                return;
            }
            C53217b.f148463b.stopTimer();
        }
    }

    /* renamed from: wx1.b$c */
    public static final class C53218c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f148465d;

        /* renamed from: e */
        public final /* synthetic */ int f148466e;

        /* renamed from: f */
        public final /* synthetic */ long f148467f;

        /* renamed from: wx1.b$c$a */
        public static final class C53219a implements l0$$e {

            /* renamed from: d */
            public final /* synthetic */ C44561j f148468d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<C52371e> f148469e;

            /* renamed from: f */
            public final /* synthetic */ long f148470f;

            /* renamed from: wx1.b$c$a$a */
            public static final class C53220a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C44561j f148471d;

                /* renamed from: e */
                public final /* synthetic */ C8479f0<C52371e> f148472e;

                /* renamed from: f */
                public final /* synthetic */ C47350c f148473f;

                /* renamed from: g */
                public final /* synthetic */ long f148474g;

                public C53220a(C44561j jVar, C8479f0<C52371e> f0Var, C47350c cVar, long j) {
                    this.f148471d = jVar;
                    this.f148472e = f0Var;
                    this.f148473f = cVar;
                    this.f148474g = j;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
                    return;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:36:0x0128  */
                /* JADX WARNING: Removed duplicated region for block: B:44:0x0138  */
                /* JADX WARNING: Removed duplicated region for block: B:45:0x013a  */
                /* JADX WARNING: Removed duplicated region for block: B:55:0x017a  */
                /* JADX WARNING: Removed duplicated region for block: B:57:0x01a4 A[SYNTHETIC, Splitter:B:57:0x01a4] */
                /* JADX WARNING: Removed duplicated region for block: B:71:0x01f7  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r26 = this;
                        r1 = r26
                        wx1.b r2 = wx1.C53217b.f148462a
                        com.tencent.mm.pluginsdk.model.app.j r0 = r1.f148471d
                        gy3.f0<tw1.e> r3 = r1.f148472e
                        T r3 = r3.f27484d
                        tw1.e r3 = (tw1.C52371e) r3
                        int r3 = r3.f146376p
                        ob0.c r4 = r1.f148473f
                        ob0.c$d r4 = r4.f127056b
                        pe3.a r4 = r4.f127083a
                        java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.download.GetGameResourceDownloadInfoResponse"
                        gy3.C87412m.m108592e(r4, r5)
                        tw1.f r4 = (tw1.C52372f) r4
                        long r10 = r1.f148474g
                        java.lang.Class<sp.x> r5 = p237sp.C13753x.class
                        java.lang.Class<sp.w> r6 = p237sp.C48457w.class
                        java.lang.Class<sw1.q> r7 = sw1.C48484q.class
                        monitor-enter(r2)
                        java.lang.String r8 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
                        r9.<init>()     // Catch:{ all -> 0x0371 }
                        java.lang.String r12 = "gamelog.download, downloadGameRes , response, PackageName:"
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        java.lang.String r12 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        java.lang.String r12 = ", ControlFlag:"
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        int r12 = r4.f146381g     // Catch:{ all -> 0x0371 }
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        java.lang.String r12 = ", IntervalSeconds:"
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        int r12 = r4.f146382h     // Catch:{ all -> 0x0371 }
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        java.lang.String r12 = ", expiredTime:"
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        int r12 = r4.f146384j     // Catch:{ all -> 0x0371 }
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        java.lang.String r12 = ", downloadStage:"
                        r9.append(r12)     // Catch:{ all -> 0x0371 }
                        r9.append(r3)     // Catch:{ all -> 0x0371 }
                        java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0371 }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x0371 }
                        java.lang.String r8 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        r9 = 0
                        r12 = 1
                        if (r8 == 0) goto L_0x0071
                        int r8 = r8.length()     // Catch:{ all -> 0x0371 }
                        if (r8 != 0) goto L_0x006f
                        goto L_0x0071
                    L_0x006f:
                        r8 = 0
                        goto L_0x0072
                    L_0x0071:
                        r8 = 1
                    L_0x0072:
                        if (r8 == 0) goto L_0x0077
                        monitor-exit(r2)
                        goto L_0x0370
                    L_0x0077:
                        int r8 = r4.f146381g     // Catch:{ all -> 0x0371 }
                        r13 = 2
                        if (r8 == 0) goto L_0x00e0
                        if (r8 == r12) goto L_0x00d4
                        if (r8 == r13) goto L_0x00d4
                        r3 = 3
                        if (r8 == r3) goto L_0x0085
                        goto L_0x0366
                    L_0x0085:
                        di3.d r3 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x0371 }
                        r12 = r3
                        sp.w r12 = (p237sp.C48457w) r12     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = r0.field_appId     // Catch:{ all -> 0x0371 }
                        java.lang.String r13 = r2.mo73886c(r3)     // Catch:{ all -> 0x0371 }
                        r14 = 33
                        r15 = 26
                        java.lang.String r16 = ""
                        java.lang.String r17 = ""
                        java.lang.String r18 = ""
                        java.lang.String r3 = "download reach limit"
                        java.lang.String r19 = r2.mo73888e(r3)     // Catch:{ all -> 0x0371 }
                        r12.mo72828q8(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.String r5 = "gamelog.download, downloadGameRes , checkResourceDownload, DOWNLOAD_REACH_LIMIT"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ all -> 0x0371 }
                        di3.d r3 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x0371 }
                        sw1.q r3 = (sw1.C48484q) r3     // Catch:{ all -> 0x0371 }
                        wx1.e r5 = r3.Og0()     // Catch:{ all -> 0x0371 }
                        java.lang.String r6 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = "PackageName"
                        gy3.C87412m.m108593f(r6, r3)     // Catch:{ all -> 0x0371 }
                        java.lang.String r7 = r0.field_appId     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = "appInfo.field_appId"
                        gy3.C87412m.m108593f(r7, r0)     // Catch:{ all -> 0x0371 }
                        int r8 = r4.f146382h     // Catch:{ all -> 0x0371 }
                        int r9 = r4.f146384j     // Catch:{ all -> 0x0371 }
                        int r12 = wx1.C53217b.f148464c     // Catch:{ all -> 0x0371 }
                        tw1.d r13 = new tw1.d     // Catch:{ all -> 0x0371 }
                        r13.<init>()     // Catch:{ all -> 0x0371 }
                        r5.mo61629g(r6, r7, r8, r9, r10, r12, r13)     // Catch:{ all -> 0x0371 }
                        goto L_0x0366
                    L_0x00d4:
                        java.lang.String r0 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = "PackageName"
                        gy3.C87412m.m108593f(r0, r3)     // Catch:{ all -> 0x0371 }
                        r2.mo73885b(r0)     // Catch:{ all -> 0x0371 }
                        goto L_0x0366
                    L_0x00e0:
                        di3.d r8 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x0371 }
                        sw1.q r8 = (sw1.C48484q) r8     // Catch:{ all -> 0x0371 }
                        wx1.e r8 = r8.Og0()     // Catch:{ all -> 0x0371 }
                        java.lang.String r14 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r15 = "PackageName"
                        gy3.C87412m.m108593f(r14, r15)     // Catch:{ all -> 0x0371 }
                        wx1.a r8 = r8.mo61626Lo(r14)     // Catch:{ all -> 0x0371 }
                        if (r8 == 0) goto L_0x0118
                        if (r3 != r13) goto L_0x0118
                        di3.d r0 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x0371 }
                        sw1.q r0 = (sw1.C48484q) r0     // Catch:{ all -> 0x0371 }
                        wx1.e r5 = r0.Og0()     // Catch:{ all -> 0x0371 }
                        java.lang.String r6 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = "PackageName"
                        gy3.C87412m.m108593f(r6, r0)     // Catch:{ all -> 0x0371 }
                        int r7 = r4.f146382h     // Catch:{ all -> 0x0371 }
                        long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ all -> 0x0371 }
                        int r10 = r4.f146384j     // Catch:{ all -> 0x0371 }
                        r5.mo61627Ow(r6, r7, r8, r10)     // Catch:{ all -> 0x0371 }
                        monitor-exit(r2)
                        goto L_0x0370
                    L_0x0118:
                        java.lang.String r3 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        if (r3 == 0) goto L_0x0125
                        int r3 = r3.length()     // Catch:{ all -> 0x0371 }
                        if (r3 != 0) goto L_0x0123
                        goto L_0x0125
                    L_0x0123:
                        r3 = 0
                        goto L_0x0126
                    L_0x0125:
                        r3 = 1
                    L_0x0126:
                        if (r3 != 0) goto L_0x0368
                        java.lang.String r3 = r0.field_packageName     // Catch:{ all -> 0x0371 }
                        if (r3 == 0) goto L_0x0135
                        int r3 = r3.length()     // Catch:{ all -> 0x0371 }
                        if (r3 != 0) goto L_0x0133
                        goto L_0x0135
                    L_0x0133:
                        r3 = 0
                        goto L_0x0136
                    L_0x0135:
                        r3 = 1
                    L_0x0136:
                        if (r3 == 0) goto L_0x013a
                        goto L_0x0368
                    L_0x013a:
                        java.lang.String r3 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        if (r3 != 0) goto L_0x0140
                        java.lang.String r3 = r0.field_packageName     // Catch:{ all -> 0x0371 }
                    L_0x0140:
                        java.lang.String r14 = "PackageName ?: appInfo.field_packageName"
                        gy3.C87412m.m108593f(r3, r14)     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = r2.mo73887d(r3)     // Catch:{ all -> 0x0371 }
                        java.lang.Iterable r14 = com.tencent.p014mm.vfs.C86013q1.m106459t(r3, r9)     // Catch:{ all -> 0x0371 }
                        if (r14 == 0) goto L_0x0177
                        java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0371 }
                        boolean r15 = r14.hasNext()     // Catch:{ all -> 0x0371 }
                        if (r15 == 0) goto L_0x0177
                        java.lang.Object r14 = r14.next()     // Catch:{ all -> 0x0371 }
                        com.tencent.mm.vfs.b0 r14 = (com.tencent.p014mm.vfs.C86001b0) r14     // Catch:{ all -> 0x0371 }
                        java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
                        r14.<init>()     // Catch:{ all -> 0x0371 }
                        java.lang.String r15 = "gamelog.download, downloadGameRes , download task exists in path:"
                        r14.append(r15)     // Catch:{ all -> 0x0371 }
                        r14.append(r3)     // Catch:{ all -> 0x0371 }
                        java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0371 }
                        java.lang.String r15 = "MicroMsg.GameResourceDownloadManager"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)     // Catch:{ all -> 0x0371 }
                        r14 = 1
                        goto L_0x0178
                    L_0x0177:
                        r14 = 0
                    L_0x0178:
                        if (r14 == 0) goto L_0x01a4
                        di3.d r3 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x0371 }
                        r4 = r3
                        sp.w r4 = (p237sp.C48457w) r4     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = r0.field_appId     // Catch:{ all -> 0x0371 }
                        java.lang.String r5 = r2.mo73886c(r0)     // Catch:{ all -> 0x0371 }
                        r6 = 33
                        r7 = 26
                        java.lang.String r8 = ""
                        java.lang.String r9 = ""
                        java.lang.String r10 = ""
                        java.lang.String r0 = "DownloadTaskExist"
                        java.lang.String r11 = r2.mo73888e(r0)     // Catch:{ all -> 0x0371 }
                        r4.mo72828q8(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.String r3 = "gamelog.download, downloadGameRes ,DownloadTaskExist"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0371 }
                        monitor-exit(r2)
                        goto L_0x0370
                    L_0x01a4:
                        tw1.d r14 = new tw1.d     // Catch:{ all -> 0x0371 }
                        r14.<init>()     // Catch:{ all -> 0x0371 }
                        java.util.LinkedList<tw1.g> r15 = r4.f146380f     // Catch:{ all -> 0x0371 }
                        r16 = 0
                        if (r15 == 0) goto L_0x02b4
                        java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x0371 }
                        r18 = r16
                        r20 = 1
                    L_0x01b7:
                        boolean r21 = r15.hasNext()     // Catch:{ all -> 0x0371 }
                        if (r21 == 0) goto L_0x02ab
                        java.lang.Object r21 = r15.next()     // Catch:{ all -> 0x0371 }
                        r12 = r21
                        tw1.g r12 = (tw1.C52373g) r12     // Catch:{ all -> 0x0371 }
                        java.lang.String r9 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
                        r13.<init>()     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = "checkResourceDownload url:"
                        r13.append(r1)     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r12.f146390i     // Catch:{ all -> 0x0371 }
                        r13.append(r1)     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = ", type:"
                        r13.append(r1)     // Catch:{ all -> 0x0371 }
                        int r1 = r12.f146389h     // Catch:{ all -> 0x0371 }
                        r13.append(r1)     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x0371 }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r12.f146390i     // Catch:{ all -> 0x0371 }
                        if (r1 == 0) goto L_0x01f4
                        int r1 = r1.length()     // Catch:{ all -> 0x0371 }
                        if (r1 != 0) goto L_0x01f2
                        goto L_0x01f4
                    L_0x01f2:
                        r1 = 0
                        goto L_0x01f5
                    L_0x01f4:
                        r1 = 1
                    L_0x01f5:
                        if (r1 != 0) goto L_0x028f
                        r1 = 2
                        java.lang.Integer[] r9 = new java.lang.Integer[r1]     // Catch:{ all -> 0x0371 }
                        r13 = 0
                        java.lang.Integer r21 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0371 }
                        r9[r13] = r21     // Catch:{ all -> 0x0371 }
                        java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0371 }
                        r1 = 1
                        r9[r1] = r13     // Catch:{ all -> 0x0371 }
                        java.util.List r1 = sx3.C64197v.m75537f(r9)     // Catch:{ all -> 0x0371 }
                        int r9 = r12.f146389h     // Catch:{ all -> 0x0371 }
                        java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0371 }
                        boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x0371 }
                        if (r1 == 0) goto L_0x028f
                        android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ all -> 0x0371 }
                        r13 = 2
                        java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ all -> 0x0371 }
                        java.lang.String r13 = r0.field_appName     // Catch:{ all -> 0x0371 }
                        r21 = 0
                        r9[r21] = r13     // Catch:{ all -> 0x0371 }
                        java.lang.Integer r13 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0371 }
                        r22 = 1
                        r9[r22] = r13     // Catch:{ all -> 0x0371 }
                        r13 = 2131830919(0x7f112887, float:1.9294849E38)
                        java.lang.String r1 = r1.getString(r13, r9)     // Catch:{ all -> 0x0371 }
                        java.lang.String r9 = "getResources().getString…nfo.field_appName, index)"
                        gy3.C87412m.m108593f(r1, r9)     // Catch:{ all -> 0x0371 }
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
                        r9.<init>()     // Catch:{ all -> 0x0371 }
                        java.lang.String r13 = r0.field_appId     // Catch:{ all -> 0x0371 }
                        r9.append(r13)     // Catch:{ all -> 0x0371 }
                        java.lang.String r13 = "_gameres_"
                        r9.append(r13)     // Catch:{ all -> 0x0371 }
                        r13 = r20
                        r9.append(r13)     // Catch:{ all -> 0x0371 }
                        java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0371 }
                        r20 = r15
                        java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0371 }
                        r15.<init>()     // Catch:{ all -> 0x0371 }
                        r15.append(r3)     // Catch:{ all -> 0x0371 }
                        r23 = r3
                        java.lang.String r3 = r12.f146385d     // Catch:{ all -> 0x0371 }
                        r15.append(r3)     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = r15.toString()     // Catch:{ all -> 0x0371 }
                        tw1.c r15 = new tw1.c     // Catch:{ all -> 0x0371 }
                        r15.<init>()     // Catch:{ all -> 0x0371 }
                        r24 = r10
                        java.lang.String r10 = r12.f146390i     // Catch:{ all -> 0x0371 }
                        r15.f146359f = r10     // Catch:{ all -> 0x0371 }
                        long r10 = r12.f146391j     // Catch:{ all -> 0x0371 }
                        r15.f146360g = r10     // Catch:{ all -> 0x0371 }
                        r15.f146361h = r1     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r12.f146386e     // Catch:{ all -> 0x0371 }
                        r15.f146362i = r1     // Catch:{ all -> 0x0371 }
                        r15.f146363j = r9     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        r15.f146364n = r1     // Catch:{ all -> 0x0371 }
                        r15.f146365o = r3     // Catch:{ all -> 0x0371 }
                        java.util.LinkedList<tw1.c> r1 = r14.f146366d     // Catch:{ all -> 0x0371 }
                        r1.add(r15)     // Catch:{ all -> 0x0371 }
                        long r9 = r12.f146391j     // Catch:{ all -> 0x0371 }
                        long r18 = r18 + r9
                        int r1 = r13 + 1
                        goto L_0x029c
                    L_0x028f:
                        r23 = r3
                        r24 = r10
                        r13 = r20
                        r21 = 0
                        r22 = 1
                        r20 = r15
                        r1 = r13
                    L_0x029c:
                        r15 = r20
                        r3 = r23
                        r10 = r24
                        r9 = 0
                        r12 = 1
                        r13 = 2
                        r20 = r1
                        r1 = r26
                        goto L_0x01b7
                    L_0x02ab:
                        r24 = r10
                        r21 = 0
                        r22 = 1
                        r9 = r18
                        goto L_0x02bc
                    L_0x02b4:
                        r24 = r10
                        r21 = 0
                        r22 = 1
                        r9 = r16
                    L_0x02bc:
                        java.util.LinkedList<tw1.c> r1 = r14.f146366d     // Catch:{ all -> 0x0371 }
                        if (r1 == 0) goto L_0x02c6
                        boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0371 }
                        if (r1 == 0) goto L_0x02c8
                    L_0x02c6:
                        r21 = 1
                    L_0x02c8:
                        if (r21 == 0) goto L_0x02d4
                        java.lang.String r0 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.String r1 = "gamelog.download, downloadGameRes , checkResourceDownload, DownloadItemList is empty"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0371 }
                        monitor-exit(r2)
                        goto L_0x0370
                    L_0x02d4:
                        int r1 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                        if (r1 <= 0) goto L_0x031b
                        di3.d r1 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x0371 }
                        sp.x r1 = (p237sp.C13753x) r1     // Catch:{ all -> 0x0371 }
                        boolean r1 = r1.Ci0(r9)     // Catch:{ all -> 0x0371 }
                        if (r1 != 0) goto L_0x031b
                        di3.d r1 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x0371 }
                        sp.x r1 = (p237sp.C13753x) r1     // Catch:{ all -> 0x0371 }
                        boolean r1 = r1.mo13122Um(r9)     // Catch:{ all -> 0x0371 }
                        if (r1 != 0) goto L_0x031b
                        di3.d r1 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x0371 }
                        r3 = r1
                        sp.w r3 = (p237sp.C48457w) r3     // Catch:{ all -> 0x0371 }
                        wx1.b r1 = wx1.C53217b.f148462a     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = r0.field_appId     // Catch:{ all -> 0x0371 }
                        java.lang.String r4 = r1.mo73886c(r0)     // Catch:{ all -> 0x0371 }
                        r5 = 33
                        r6 = 26
                        java.lang.String r7 = ""
                        java.lang.String r8 = ""
                        java.lang.String r9 = ""
                        java.lang.String r0 = "sdcard dont have enough space"
                        java.lang.String r10 = r1.mo73888e(r0)     // Catch:{ all -> 0x0371 }
                        r3.mo72828q8(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.String r1 = "gamelog.download, downloadGameRes , checkResourceDownload, sdcard dont have enough space"
                        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0371 }
                        monitor-exit(r2)
                        goto L_0x0370
                    L_0x031b:
                        if (r8 == 0) goto L_0x0336
                        di3.d r0 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x0371 }
                        sw1.q r0 = (sw1.C48484q) r0     // Catch:{ all -> 0x0371 }
                        wx1.e r0 = r0.Og0()     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = "PackageName"
                        gy3.C87412m.m108593f(r1, r3)     // Catch:{ all -> 0x0371 }
                        int r3 = r4.f146382h     // Catch:{ all -> 0x0371 }
                        int r5 = r4.f146384j     // Catch:{ all -> 0x0371 }
                        r0.mo61628Yt(r1, r3, r5, r14)     // Catch:{ all -> 0x0371 }
                        goto L_0x035a
                    L_0x0336:
                        di3.d r1 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x0371 }
                        sw1.q r1 = (sw1.C48484q) r1     // Catch:{ all -> 0x0371 }
                        wx1.e r5 = r1.Og0()     // Catch:{ all -> 0x0371 }
                        java.lang.String r6 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = "PackageName"
                        gy3.C87412m.m108593f(r6, r1)     // Catch:{ all -> 0x0371 }
                        java.lang.String r7 = r0.field_appId     // Catch:{ all -> 0x0371 }
                        java.lang.String r0 = "appInfo.field_appId"
                        gy3.C87412m.m108593f(r7, r0)     // Catch:{ all -> 0x0371 }
                        int r8 = r4.f146382h     // Catch:{ all -> 0x0371 }
                        int r9 = r4.f146384j     // Catch:{ all -> 0x0371 }
                        int r12 = wx1.C53217b.f148464c     // Catch:{ all -> 0x0371 }
                        r10 = r24
                        r13 = r14
                        r5.mo61629g(r6, r7, r8, r9, r10, r12, r13)     // Catch:{ all -> 0x0371 }
                    L_0x035a:
                        wx1.b r0 = wx1.C53217b.f148462a     // Catch:{ all -> 0x0371 }
                        java.lang.String r1 = r4.f146383i     // Catch:{ all -> 0x0371 }
                        java.lang.String r3 = "PackageName"
                        gy3.C87412m.m108593f(r1, r3)     // Catch:{ all -> 0x0371 }
                        r0.mo73889f(r1)     // Catch:{ all -> 0x0371 }
                    L_0x0366:
                        monitor-exit(r2)
                        goto L_0x0370
                    L_0x0368:
                        java.lang.String r0 = "MicroMsg.GameResourceDownloadManager"
                        java.lang.String r1 = "gamelog.download, downloadGameRes ,  PackageName is null"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0371 }
                        monitor-exit(r2)
                    L_0x0370:
                        return
                    L_0x0371:
                        r0 = move-exception
                        monitor-exit(r2)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: wx1.C53217b.C53218c.C53219a.C53220a.run():void");
                }
            }

            public C53219a(C44561j jVar, C8479f0<C52371e> f0Var, long j) {
                this.f148468d = jVar;
                this.f148469e = f0Var;
                this.f148470f = j;
            }

            /* renamed from: a */
            public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
                Log.m105925i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , tryDownload, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C119157j jVar = (C119157j) C119157j.f356862d;
                    jVar.mo183876g(new C53220a(this.f148468d, this.f148469e, cVar, this.f148470f), "GameResourceDownloadRequest_callback");
                }
                return 0;
            }
        }

        public C53218c(String str, int i, long j) {
            this.f148465d = str;
            this.f148466e = i;
            this.f148467f = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0211  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.Class<sp.t> r0 = p237sp.C48456t.class
                java.lang.Class<sw1.q> r2 = sw1.C48484q.class
                java.lang.Class<ym.l> r3 = p763ym.C79138l.class
                java.lang.Class<sp.w> r4 = p237sp.C48457w.class
                di3.d r5 = di3.C86312j.m106911c(r3)
                ym.l r5 = (p763ym.C79138l) r5
                java.lang.String r6 = r1.f148465d
                r7 = 0
                com.tencent.mm.pluginsdk.model.app.j r5 = r5.mo74001TT(r6, r7)
                if (r5 == 0) goto L_0x02cb
                java.lang.String r6 = r1.f148465d
                int r8 = r1.f148466e
                long r9 = r1.f148467f
                java.lang.String r11 = r5.field_packageName
                if (r11 == 0) goto L_0x002c
                int r11 = r11.length()
                if (r11 != 0) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r11 = 0
                goto L_0x002d
            L_0x002c:
                r11 = 1
            L_0x002d:
                if (r11 == 0) goto L_0x0030
                return
            L_0x0030:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "gamelog.download, downloadGameRes , tryDownload, packageName:"
                r11.append(r13)
                java.lang.String r13 = r5.field_packageName
                r11.append(r13)
                java.lang.String r11 = r11.toString()
                java.lang.String r13 = "MicroMsg.GameResourceDownloadManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
                di3.d r11 = di3.C86312j.m106911c(r2)
                sw1.q r11 = (sw1.C48484q) r11
                wx1.e r11 = r11.Og0()
                java.lang.String r14 = r5.field_packageName
                java.lang.String r15 = "field_packageName"
                gy3.C87412m.m108593f(r14, r15)
                r11.getClass()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r12 = "allowCleanPkg("
                r7.append(r12)
                r7.append(r14)
                r12 = 41
                r7.append(r12)
                java.lang.String r7 = r7.toString()
                java.lang.String r12 = "MicroMsg.GameResourceDownloadStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
                wx1.a r7 = r11.mo61626Lo(r14)
                if (r7 == 0) goto L_0x0095
                long r18 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r20 = r9
                long r9 = r7.field_finishDownloadTime
                long r18 = r18 - r9
                long r9 = java.lang.Math.abs(r18)
                int r7 = r7.field_expiredSeconds
                r11 = r8
                long r7 = (long) r7
                int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r14 <= 0) goto L_0x0098
                r7 = 1
                goto L_0x0099
            L_0x0095:
                r11 = r8
                r20 = r9
            L_0x0098:
                r7 = 0
            L_0x0099:
                if (r7 == 0) goto L_0x00ba
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "tryDownload, allowCleanPkg:"
                r0.append(r2)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                wx1.b r0 = wx1.C53217b.f148462a
                java.lang.String r2 = r5.field_packageName
                gy3.C87412m.m108593f(r2, r15)
                r0.mo73885b(r2)
                return
            L_0x00ba:
                di3.d r7 = di3.C86312j.m106911c(r0)
                sp.t r7 = (p237sp.C48456t) r7
                xh.w2 r7 = r7.mo72822IX(r6)
                di3.d r3 = di3.C86312j.m106911c(r3)
                ym.l r3 = (p763ym.C79138l) r3
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r3 = r3.Tb0(r8, r6)
                if (r7 == 0) goto L_0x00fa
                di3.d r0 = di3.C86312j.m106911c(r4)
                r14 = r0
                sp.w r14 = (p237sp.C48457w) r14
                wx1.b r0 = wx1.C53217b.f148462a
                java.lang.String r15 = r0.mo73886c(r6)
                r16 = 33
                r17 = 26
                java.lang.String r2 = "game apk is downloading"
                java.lang.String r21 = r0.mo73888e(r2)
                java.lang.String r18 = ""
                java.lang.String r19 = ""
                java.lang.String r20 = ""
                r14.mo72828q8(r15, r16, r17, r18, r19, r20, r21)
                java.lang.String r0 = "gamelog.download, downloadGameRes ,game apk is downloading"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                return
            L_0x00fa:
                if (r3 == 0) goto L_0x0122
                di3.d r0 = di3.C86312j.m106911c(r4)
                r14 = r0
                sp.w r14 = (p237sp.C48457w) r14
                wx1.b r0 = wx1.C53217b.f148462a
                java.lang.String r15 = r0.mo73886c(r6)
                r16 = 33
                r17 = 26
                java.lang.String r2 = "game apk isInstalled"
                java.lang.String r21 = r0.mo73888e(r2)
                java.lang.String r18 = ""
                java.lang.String r19 = ""
                java.lang.String r20 = ""
                r14.mo72828q8(r15, r16, r17, r18, r19, r20, r21)
                java.lang.String r0 = "gamelog.download, downloadGameRes ,game apk isInstalled"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                return
            L_0x0122:
                di3.d r2 = di3.C86312j.m106911c(r2)
                sw1.q r2 = (sw1.C48484q) r2
                wx1.e r2 = r2.Og0()
                java.lang.String r3 = r5.field_packageName
                gy3.C87412m.m108593f(r3, r15)
                r2.getClass()
                wx1.a r2 = r2.mo61626Lo(r3)
                r7 = 0
                if (r2 != 0) goto L_0x013f
            L_0x013c:
                r0 = 0
                goto L_0x01d0
            L_0x013f:
                tw1.d r3 = new tw1.d
                r3.<init>()
                byte[] r2 = r2.field_downloadItemList     // Catch:{ Exception -> 0x01b5 }
                r3.parseFrom(r2)     // Catch:{ Exception -> 0x01b5 }
                java.util.LinkedList<tw1.c> r2 = r3.f146366d
                if (r2 == 0) goto L_0x0156
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0154
                goto L_0x0156
            L_0x0154:
                r2 = 0
                goto L_0x0157
            L_0x0156:
                r2 = 1
            L_0x0157:
                if (r2 == 0) goto L_0x015a
                goto L_0x013c
            L_0x015a:
                java.util.LinkedList<tw1.c> r2 = r3.f146366d
                if (r2 == 0) goto L_0x01b3
                java.util.Iterator r2 = r2.iterator()
            L_0x0162:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x01b3
                java.lang.Object r3 = r2.next()
                tw1.c r3 = (tw1.C52369c) r3
                long r9 = r3.f146357d
                int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r14 != 0) goto L_0x0176
            L_0x0174:
                r0 = 1
                goto L_0x01d0
            L_0x0176:
                di3.d r9 = di3.C86312j.m106911c(r0)
                sp.t r9 = (p237sp.C48456t) r9
                long r7 = r3.f146357d
                xh.w2 r3 = r9.mo72824nh(r7)
                if (r3 == 0) goto L_0x01b0
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "downloadUrl:"
                r7.append(r8)
                java.lang.String r8 = r3.field_downloadUrl
                r7.append(r8)
                java.lang.String r8 = ", status:"
                r7.append(r8)
                int r8 = r3.field_status
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
                int r3 = r3.field_status
                r7 = 3
                if (r3 == r7) goto L_0x01b0
                r7 = 4
                if (r3 == r7) goto L_0x01b0
                r7 = 5
                if (r3 == r7) goto L_0x01b0
                goto L_0x0174
            L_0x01b0:
                r7 = 0
                goto L_0x0162
            L_0x01b3:
                r0 = 2
                goto L_0x01d0
            L_0x01b5:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "catch err:"
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                goto L_0x013c
            L_0x01d0:
                if (r0 != 0) goto L_0x0211
                r2 = 1
                if (r11 != r2) goto L_0x0211
                r2 = 0
                int r7 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
                if (r7 <= 0) goto L_0x0211
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                int r7 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
                if (r7 >= 0) goto L_0x0211
                wx1.b r0 = wx1.C53217b.f148462a
                java.lang.String r2 = r5.field_packageName
                gy3.C87412m.m108593f(r2, r15)
                r0.mo73885b(r2)
                di3.d r2 = di3.C86312j.m106911c(r4)
                r14 = r2
                sp.w r14 = (p237sp.C48457w) r14
                java.lang.String r15 = r0.mo73886c(r6)
                r16 = 33
                r17 = 26
                java.lang.String r2 = "download res task is expire"
                java.lang.String r21 = r0.mo73888e(r2)
                java.lang.String r18 = ""
                java.lang.String r19 = ""
                java.lang.String r20 = ""
                r14.mo72828q8(r15, r16, r17, r18, r19, r20, r21)
                java.lang.String r0 = "gamelog.download, downloadGameRes ,download res task is expire"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                return
            L_0x0211:
                wx1.C53217b.f148464c = r11
                gy3.f0 r2 = new gy3.f0
                r2.<init>()
                tw1.e r3 = new tw1.e
                r3.<init>()
                r2.f27484d = r3
                java.lang.String r4 = p156gj.C87203t.m108275k()
                r3.f146367d = r4
                T r3 = r2.f27484d
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                java.lang.String r6 = android.os.Build.MANUFACTURER
                r4.f146368e = r6
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                r4.f146377q = r11
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                java.lang.String r6 = ""
                r4.f146369f = r6
                tw1.e r3 = (tw1.C52371e) r3
                java.lang.String r4 = p156gj.C87203t.m108276l()
                r3.f146370g = r4
                T r3 = r2.f27484d
                tw1.e r3 = (tw1.C52371e) r3
                r4 = 0
                java.lang.String r6 = p156gj.C87203t.m108270f(r4)
                r3.f146371h = r6
                T r3 = r2.f27484d
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                java.lang.String r6 = r5.field_packageName
                r4.f146372i = r6
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                java.lang.String r6 = r5.field_appId
                r4.f146373j = r6
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                tw1.e r3 = (tw1.C52371e) r3
                java.lang.String r3 = r3.f146372i
                int r3 = uy1.C52642c.m58992j(r3)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r4.f146374n = r3
                T r3 = r2.f27484d
                r4 = r3
                tw1.e r4 = (tw1.C52371e) r4
                tw1.e r3 = (tw1.C52371e) r3
                java.lang.String r3 = r3.f146372i
                java.lang.String r3 = uy1.C52642c.m58993k(r3)
                r4.f146375o = r3
                T r3 = r2.f27484d
                tw1.e r3 = (tw1.C52371e) r3
                r3.f146376p = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "gamelog.download, downloadGameRes , download stage:"
                r0.append(r3)
                T r3 = r2.f27484d
                tw1.e r3 = (tw1.C52371e) r3
                int r3 = r3.f146376p
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                ob0.c$b r0 = new ob0.c$b
                r0.<init>()
                java.lang.String r3 = "/cgi-bin/mmgame-bin/getgameresourcedownloadinfo"
                r0.f127068c = r3
                r3 = 4218(0x107a, float:5.91E-42)
                r0.f127069d = r3
                r3 = 0
                r0.f127070e = r3
                r0.f127071f = r3
                T r3 = r2.f27484d
                pe3.a r3 = (pe3.C47465a) r3
                r0.f127066a = r3
                tw1.f r3 = new tw1.f
                r3.<init>()
                r0.f127067b = r3
                ob0.c r0 = r0.mo72403a()
                wx1.b$c$a r3 = new wx1.b$c$a
                r6 = r20
                r3.<init>(r5, r2, r6)
                r2 = 0
                ob0.C89144l0.m111429e(r0, r3, r2)
            L_0x02cb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wx1.C53217b.C53218c.run():void");
        }
    }

    /* renamed from: a */
    public static final void m59631a(C53217b bVar) {
        ArrayList<C38343a> arrayList;
        bVar.getClass();
        Cursor rawQuery = ((C48484q) C86312j.m106911c(C48484q.class)).Og0().rawQuery("select * from GameResourceDownload", new String[0]);
        if (rawQuery == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (rawQuery.moveToFirst()) {
                do {
                    C38343a aVar = new C38343a();
                    aVar.convertFrom(rawQuery);
                    arrayList2.add(aVar);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            arrayList = new ArrayList<>();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C38343a aVar2 = (C38343a) it.next();
                if (Math.abs(Util.nowSecond() - aVar2.field_checkCgiTime) >= ((long) aVar2.field_intervalSeconds)) {
                    arrayList.add(aVar2);
                }
            }
            Log.m105924i("MicroMsg.GameResourceDownloadStorage", "getNeedCheckItems, allItemsSize:" + arrayList2.size() + ", needCheckItemsSize:" + arrayList.size());
        }
        if (arrayList != null) {
            for (C38343a aVar3 : arrayList) {
                Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , loopDownload, appId:" + aVar3.field_appId);
                f148462a.mo73891h(aVar3.field_appId, aVar3.field_scene, aVar3.field_taskExpiredSeconds);
            }
        }
    }

    /* renamed from: b */
    public final void mo73885b(String str) {
        Class cls = C48484q.class;
        C87412m.m108594g(str, "packageName");
        if (!(str.length() == 0)) {
            C38343a Lo = ((C48484q) C86312j.m106911c(cls)).Og0().mo61626Lo(str);
            if (Lo != null) {
                C52370d dVar = new C52370d();
                try {
                    dVar.parseFrom(Lo.field_downloadItemList);
                    LinkedList<C52369c> linkedList = dVar.f146366d;
                    if (linkedList != null) {
                        for (C52369c cVar : linkedList) {
                            int r = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(cVar.f146357d);
                            Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , cancelDownloadTask, downloadId:" + cVar.f146357d + " ret:" + r);
                        }
                    }
                } catch (Exception e) {
                    Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , cancelDownloadTask, catch err:" + e.getMessage());
                }
            }
            boolean jo = ((C48484q) C86312j.m106911c(cls)).Og0().mo61630jo(str);
            Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , cancelDownloadTask, packageName:" + str + ", delDownloadInfo: " + jo);
        }
    }

    /* renamed from: c */
    public final String mo73886c(String str) {
        return str + "_gameres_1";
    }

    /* renamed from: d */
    public final String mo73887d(String str) {
        C87412m.m108594g(str, "pkgName");
        return VFSStrategy.m163776d("gameDownload") + "/gameRes/" + str + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: e */
    public final String mo73888e(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
        try {
            String encode = URLEncoder.encode(jSONObject.toString(), "utf-8");
            C87412m.m108593f(encode, "encode(errorMsgExtInfo.toString(), \"utf-8\")");
            return encode;
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: f */
    public final void mo73889f(String str) {
        Class cls = C48484q.class;
        C87412m.m108594g(str, "packageName");
        C38343a Lo = ((C48484q) C86312j.m106911c(cls)).Og0().mo61626Lo(str);
        if (Lo != null) {
            C52370d dVar = new C52370d();
            try {
                dVar.parseFrom(Lo.field_downloadItemList);
                LinkedList<C52369c> linkedList = dVar.f146366d;
                if (linkedList != null) {
                    for (C52369c cVar : linkedList) {
                        if (!cVar.f146358e) {
                            C40939n nVar = new C40939n((C40939n.C2206a) null);
                            nVar.f110176a = cVar.f146359f;
                            nVar.f110178c = cVar.f146360g;
                            nVar.f110174A = cVar.f146361h;
                            nVar.f110180e = cVar.f146362i;
                            nVar.f110182g = cVar.f146363j;
                            nVar.f110187l = 33;
                            nVar.f110183h = cVar.f146364n;
                            nVar.f110184i = false;
                            nVar.f110181f = 3;
                            nVar.f110189n = true;
                            nVar.f110201z = cVar.f146365o;
                            ((C48456t) C86312j.m106911c(C48456t.class)).tm0(cVar.f146359f);
                            long c = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63957c(nVar);
                            Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , add download task[packageName:" + cVar.f146364n + ", downloadUrl:" + cVar.f146359f + ", downloadPath:" + cVar.f146365o + "], size:" + cVar.f146360g + ", md5:" + cVar.f146362i + ", downloadId:" + c);
                            cVar.f146357d = c;
                            cVar.f146358e = true;
                            if (c > 0) {
                                break;
                            }
                        }
                    }
                }
                Lo.field_downloadItemList = dVar.toByteArray();
                boolean update = ((C48484q) C86312j.m106911c(cls)).Og0().update(Lo, new String[0]);
                Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , performNextDownload, updateRet:" + update);
            } catch (Exception e) {
                Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , performNextDownload, catch err:" + e.getMessage());
            }
        }
    }

    /* renamed from: g */
    public final void mo73890g() {
        ((C119157j) C119157j.f356862d).mo183876g(C38345b.f101203d, "GameResourceDownloadRequest_resetCheckTimer");
    }

    /* renamed from: h */
    public final void mo73891h(String str, int i, long j) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , appId is null");
            return;
        }
        Log.m105924i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , appId is " + str + " scene = " + i);
        ((C119157j) C119157j.f356862d).mo183876g(new C53218c(str, i, j), "GameResourceDownloadRequest_tryDownload");
    }
}
