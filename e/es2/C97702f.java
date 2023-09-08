package es2;

import as2.C92084a;
import cl0.C80065o;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.network.C81034b0;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.xweb.file.XVFSFile;
import es2.C97696c;
import java.io.InputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: es2.f */
public abstract class C97702f extends C97696c {

    /* renamed from: M */
    public static HashSet<String> f286603M = new HashSet<>();

    /* renamed from: A */
    public long f286604A = -1;

    /* renamed from: B */
    public String f286605B = "";

    /* renamed from: C */
    public PString f286606C = new PString();

    /* renamed from: D */
    public int f286607D;

    /* renamed from: E */
    public long f286608E;

    /* renamed from: F */
    public long f286609F;

    /* renamed from: G */
    public int f286610G = -1;

    /* renamed from: H */
    public int f286611H = 0;

    /* renamed from: I */
    public String f286612I = "";

    /* renamed from: J */
    public int f286613J = 0;

    /* renamed from: K */
    public Map<String, List<String>> f286614K;

    /* renamed from: L */
    public int f286615L = 0;

    /* renamed from: m */
    public C97696c.C97699b f286616m;

    /* renamed from: n */
    public C92714n f286617n = null;

    /* renamed from: o */
    public C97694a f286618o = null;

    /* renamed from: p */
    public C101804kv2 f286619p = null;

    /* renamed from: q */
    public String f286620q = "";

    /* renamed from: r */
    public String f286621r = "";

    /* renamed from: s */
    public String f286622s = "";

    /* renamed from: t */
    public int f286623t = 0;

    /* renamed from: u */
    public int f286624u = 0;

    /* renamed from: v */
    public long f286625v = -1;

    /* renamed from: w */
    public long f286626w = -1;

    /* renamed from: x */
    public int f286627x = -1;

    /* renamed from: y */
    public long f286628y = -1;

    /* renamed from: z */
    public long f286629z = -1;

    public C97702f(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
        this.f286616m = bVar;
        this.f286618o = aVar;
        if (aVar != null) {
            this.f286619p = aVar.f286537a;
            f286603M.add(aVar.mo136953e());
            aVar.mo136955g();
        }
    }

    /* renamed from: w */
    public static long m125976w(String str) {
        SnsMethodCalculate.markStartTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        if (str == null || str.length() == 0) {
            SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return 0;
        }
        try {
            String[] split = str.split("\\.");
            long j = Util.getLong(split[0], 0) * 16777216;
            long j2 = Util.getLong(split[1], 0);
            Long.signum(j2);
            long j3 = j + (j2 * 65536) + (Util.getLong(split[2], 0) * 256) + Util.getLong(split[3], 0);
            SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return j3;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return 0;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo57374a(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        Integer k = mo136960k((String[]) objArr);
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        return k;
    }

    /* renamed from: b */
    public ExecutorService mo57375b() {
        SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        ExecutorService Gx0 = C94866e1.Gx0();
        SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        return Gx0;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo57376c(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        mo136963p((Integer) obj);
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
    }

    /* renamed from: e */
    public void mo119142e(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        Integer[] numArr = (Integer[]) objArr;
        SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        if (numArr == null || numArr.length == 0) {
            SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        } else {
            Log.m105925i("MicroMsg.SnsDownloadCommonMediaBase", "responeTotalLen:%d, downloadlen:%d ", Integer.valueOf(this.f286613J), numArr[0]);
            SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        }
        SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
    }

    /* renamed from: h */
    public String mo136971h(String str) {
        SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x03fa A[SYNTHETIC, Splitter:B:114:0x03fa] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0498 A[Catch:{ Exception -> 0x053d }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04e3 A[Catch:{ Exception -> 0x053d }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04f1 A[Catch:{ Exception -> 0x053d }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0504 A[Catch:{ Exception -> 0x053d }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0644 A[SYNTHETIC, Splitter:B:189:0x0644] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0660 A[SYNTHETIC, Splitter:B:198:0x0660] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01fa A[Catch:{ Exception -> 0x0208 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0205 A[Catch:{ Exception -> 0x0208 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0290 A[Catch:{ Exception -> 0x053f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x029f A[Catch:{ Exception -> 0x053d }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0351 A[Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:114:0x03fa=Splitter:B:114:0x03fa, B:129:0x048b=Splitter:B:129:0x048b} */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer mo136960k(java.lang.String... r41) {
        /*
            r40 = this;
            r7 = r40
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            boolean r1 = r1.mo121147n()
            r10 = 2
            r11 = 0
            if (r1 == 0) goto L_0x06aa
            es2.a r1 = r7.f286618o
            if (r1 != 0) goto L_0x0020
            goto L_0x06aa
        L_0x0020:
            r40.mo136962o()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            es2.a r2 = r7.f286618o
            java.lang.String r2 = r2.f286545i
            r1.append(r2)
            es2.a r2 = r7.f286618o
            java.lang.String r2 = r2.mo136954f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r12 = 1
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r11] = r1
            java.lang.String r13 = "MicroMsg.SnsDownloadCommonMediaBase"
            java.lang.String r3 = "[tomys] delete img: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            long r14 = java.lang.System.currentTimeMillis()
            long r1 = java.lang.System.currentTimeMillis()
            r7.f286604A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "to downloadBitmap "
            r1.append(r2)
            es2.a r2 = r7.f286618o
            java.lang.String r2 = r2.f286538b
            r1.append(r2)
            java.lang.String r6 = " "
            r1.append(r6)
            es2.a r2 = r7.f286618o
            boolean r2 = r2.f286540d
            r1.append(r2)
            java.lang.String r2 = " type "
            r1.append(r2)
            es2.a r2 = r7.f286618o
            int r2 = r2.mo136952d()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r1)
            es2.a r1 = r7.f286618o
            java.lang.String r1 = r1.mo136951c()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r1)
            es2.a r1 = r7.f286618o
            com.tencent.mm.storage.o3 r1 = r1.f286548l
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x009f
            com.tencent.mm.storage.o3 r1 = com.tencent.p014mm.storage.C96983o3.f284139k
        L_0x009b:
            r16 = r1
            r2 = r4
            goto L_0x00f1
        L_0x009f:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284132d
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = "album_friend"
        L_0x00a9:
            r16 = r1
            goto L_0x00f1
        L_0x00ac:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284133e
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "album_self"
            goto L_0x00a9
        L_0x00b7:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284134f
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00c2
            java.lang.String r2 = "album_stranger"
            goto L_0x00a9
        L_0x00c2:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284135g
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00ce
            java.lang.String r2 = "profile_friend"
            goto L_0x00a9
        L_0x00ce:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284136h
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00da
            java.lang.String r2 = "profile_stranger"
            goto L_0x00a9
        L_0x00da:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284137i
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "comment"
            goto L_0x00a9
        L_0x00e5:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284131c
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = "timeline"
            goto L_0x00a9
        L_0x00f1:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 != 0) goto L_0x0108
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "&scene="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x0108:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://"
            r1.append(r3)
            r3 = 2131831344(0x7f112a30, float:1.929571E38)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)
            r1.append(r3)
            java.lang.String r3 = "/?version=%d&uin=%s&nettype=%d&signal=%d%s"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r5 = 5
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r17 = qe3.C89625d.f257841g
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r3[r11] = r17
            int r17 = com.tencent.p014mm.plugin.sns.model.C94866e1.Nx0()
            java.lang.String r17 = p823sg.C77710q.m93738a(r17)
            r3[r12] = r17
            android.content.Context r17 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r17 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r17)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r3[r10] = r17
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r17 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            int r17 = r17.getCompatMixStrength()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r18 = 3
            r3[r18] = r17
            r10 = 4
            r3[r10] = r2
            java.lang.String r3 = java.lang.String.format(r1, r3)
            es2.a r1 = r7.f286618o
            java.lang.String r2 = r1.f286539c
            r7.mo136971h(r2)
            r1.f286539c = r2
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.f286626w = r1
            es2.a r1 = r7.f286618o
            boolean r1 = r1.f286541e
            if (r1 == 0) goto L_0x0175
            java.lang.String r2 = "SnsSightDomainList"
            goto L_0x0177
        L_0x0175:
            java.lang.String r2 = "SnsAlbumDomainList"
        L_0x0177:
            if (r1 == 0) goto L_0x017c
            java.lang.String r1 = "SnsSightMainStandbyIpSwitchTime"
            goto L_0x017e
        L_0x017c:
            java.lang.String r1 = "SnsAlbumMainStandbyIpSwitchTime"
        L_0x017e:
            k40.a r17 = f40.C86709a0.m107533q(r0)
            lc3.b r17 = (lc3.C10485b) r17
            pj.f r5 = r17.vh0()
            java.lang.String r17 = r5.mo107405c(r2)
            k40.a r2 = f40.C86709a0.m107533q(r0)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            int r1 = r2.mo107404b(r1, r11)
            long r1 = (long) r1
            java.lang.Object[] r5 = new java.lang.Object[r10]
            es2.a r10 = r7.f286618o
            boolean r10 = r10.f286541e
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r5[r11] = r10
            es2.a r10 = r7.f286618o
            boolean r10 = r10.f286540d
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r5[r12] = r10
            r10 = 2
            r5[r10] = r17
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r5[r18] = r10
            java.lang.String r10 = "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r10, r5)
            r19 = 0
            int r5 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r5 > 0) goto L_0x01c9
            r1 = 259200(0x3f480, double:1.28062E-318)
        L_0x01c9:
            r19 = r1
            es2.a r1 = r7.f286618o
            java.lang.String r5 = r1.f286539c
            r1 = r40
            r2 = r16
            r10 = r3
            r3 = r5
            r21 = r4
            r4 = r19
            r23 = r6
            r6 = r17
            boolean r1 = r1.mo136961n(r2, r3, r4, r6)
            com.tencent.mm.network.d$b r2 = new com.tencent.mm.network.d$b
            es2.a r3 = r7.f286618o
            java.lang.String r3 = r3.f286539c
            r2.<init>(r3, r1)
            long r3 = r7.f286626w
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
            r7.f286626w = r3
            java.lang.String r3 = r2.f238040c     // Catch:{ Exception -> 0x0208 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0208 }
            if (r3 == 0) goto L_0x0205
            java.lang.String r3 = r2.f238038a     // Catch:{ Exception -> 0x0208 }
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r3 = r3.getHostAddress()     // Catch:{ Exception -> 0x0208 }
            goto L_0x020a
        L_0x0205:
            java.lang.String r3 = r2.f238040c     // Catch:{ Exception -> 0x0208 }
            goto L_0x020a
        L_0x0208:
            java.lang.String r3 = "-"
        L_0x020a:
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r11] = r10
            es2.a r5 = r7.f286618o
            java.lang.String r6 = r5.f286539c
            r4[r12] = r6
            java.lang.String r5 = r5.f286538b
            r6 = 2
            r4[r6] = r5
            int r5 = r2.f238041d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r18] = r5
            r5 = 4
            r4[r5] = r3
            es2.a r3 = r7.f286618o
            java.lang.String r5 = r3.f286539c
            r6 = 5
            r4[r6] = r5
            r5 = 6
            int r3 = r3.mo136952d()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r5] = r3
            r3 = 7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4[r3] = r1
            r1 = 8
            java.lang.String r3 = r16.toString()
            r4[r1] = r3
            java.lang.String r1 = "checkAndGetHttpConn[%s] [%s] [id:%s] host ip:%d[%s] [%s] download type[%d] isDcIp[%s] fromScene[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r4)
            r7.f286624u = r12
            java.lang.String r1 = " msg:"
            java.lang.String r3 = "GprsSetting.checkHttpConnection failed! mediaId : "
            java.lang.String r4 = "connect"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)
            java.lang.String r5 = r2.f238040c     // Catch:{ Exception -> 0x0543 }
            r7.f286622s = r5     // Catch:{ Exception -> 0x0543 }
            int r5 = r2.f238041d     // Catch:{ Exception -> 0x0543 }
            r7.f286627x = r5     // Catch:{ Exception -> 0x0543 }
            r17 = r13
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x053f }
            r7.f286628y = r12     // Catch:{ Exception -> 0x053f }
            es2.a r12 = r7.f286618o     // Catch:{ Exception -> 0x053f }
            java.lang.String r12 = r12.f286539c     // Catch:{ Exception -> 0x053f }
            com.tencent.mm.network.b0 r12 = com.tencent.p014mm.network.C81035d.m98963d(r12, r2)     // Catch:{ Exception -> 0x053f }
            java.lang.String r13 = "GET"
            r12.mo112930l(r13)     // Catch:{ Exception -> 0x053f }
            java.lang.String r13 = "referer"
            r12.mo112921e(r13, r10)     // Catch:{ Exception -> 0x053f }
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x053f }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x053f }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x053f }
            java.lang.String r10 = "SnsDownloadHttpKeep"
            java.lang.String r0 = r0.mo107405c(r10)     // Catch:{ Exception -> 0x053f }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)     // Catch:{ Exception -> 0x053f }
            if (r0 <= 0) goto L_0x029f
            java.lang.String r0 = "header Connection close "
            r10 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = "Connection"
            java.lang.String r13 = "close"
            r12.mo112921e(r0, r13)     // Catch:{ Exception -> 0x053d }
            goto L_0x02a1
        L_0x029f:
            r10 = r17
        L_0x02a1:
            r0 = 25000(0x61a8, float:3.5032E-41)
            r12.mo112919d(r0)     // Catch:{ Exception -> 0x053d }
            r12.mo112923g(r0)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = "appendHttpArg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)     // Catch:{ Exception -> 0x053d }
            java.util.Map r0 = r12.mo112927i()     // Catch:{ Exception -> 0x053d }
            r7.f286614K = r0     // Catch:{ Exception -> 0x053d }
            java.lang.String r13 = "X-ClientIp"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x053d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x053d }
            if (r0 == 0) goto L_0x02cf
            int r13 = r0.size()     // Catch:{ Exception -> 0x053d }
            if (r13 <= 0) goto L_0x02cf
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x053d }
            r7.f286621r = r0     // Catch:{ Exception -> 0x053d }
        L_0x02cf:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r7.f286614K     // Catch:{ Exception -> 0x053d }
            java.lang.String r13 = "X-ServerIp"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x053d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x053d }
            if (r0 == 0) goto L_0x02e9
            int r13 = r0.size()     // Catch:{ Exception -> 0x053d }
            if (r13 <= 0) goto L_0x02e9
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x053d }
            r7.f286620q = r0     // Catch:{ Exception -> 0x053d }
        L_0x02e9:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r7.f286614K     // Catch:{ Exception -> 0x053d }
            java.lang.String r13 = "X-ErrNo"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x053d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x053d }
            if (r0 == 0) goto L_0x0307
            int r13 = r0.size()     // Catch:{ Exception -> 0x053d }
            if (r13 <= 0) goto L_0x0307
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x053d }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x053d }
            r7.f286623t = r0     // Catch:{ Exception -> 0x053d }
        L_0x0307:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r7.f286614K     // Catch:{ Exception -> 0x053d }
            java.lang.String r13 = "X-RtFlag"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x053d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x053d }
            if (r0 == 0) goto L_0x0325
            int r13 = r0.size()     // Catch:{ Exception -> 0x053d }
            if (r13 <= 0) goto L_0x0325
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x053d }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x053d }
            r7.f286624u = r0     // Catch:{ Exception -> 0x053d }
        L_0x0325:
            int r0 = r12.mo112916a()     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r7.f286610G = r0     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            java.lang.String r0 = r12.mo112928j()     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r7.f286612I = r0     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            java.lang.String r0 = "connect responseCode retCode:%d, host:%s"
            r13 = 2
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            int r13 = r7.f286610G     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r5[r11] = r13     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            java.lang.String r13 = r7.f286612I     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r17 = 1
            r5[r17] = r13     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r5)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            int r0 = r7.f286610G     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 == r5) goto L_0x03fa
            r5 = 206(0xce, float:2.89E-43)
            if (r0 == r5) goto L_0x03fa
            java.util.Map r0 = r12.mo112927i()     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r7.mo136981u(r0)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            es2.a r0 = r7.f286618o     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            boolean r0 = r0.f286541e     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r5 = 600(0x258, float:8.41E-43)
            r12 = 400(0x190, float:5.6E-43)
            r13 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L_0x038a
            int r0 = r7.f286610G     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            if (r0 < r12) goto L_0x0378
            if (r0 >= r13) goto L_0x0378
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r25 = 22
            r27 = 78
            r29 = 1
            r31 = 1
            r24.idkeyStat(r25, r27, r29, r31)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            goto L_0x03af
        L_0x0378:
            if (r0 < r13) goto L_0x03af
            if (r0 >= r5) goto L_0x03af
            com.tencent.mm.plugin.report.service.n r32 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r33 = 22
            r35 = 79
            r37 = 1
            r39 = 1
            r32.idkeyStat(r33, r35, r37, r39)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            goto L_0x03af
        L_0x038a:
            int r0 = r7.f286610G     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            if (r0 < r12) goto L_0x039e
            if (r0 >= r13) goto L_0x039e
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r25 = 22
            r27 = 56
            r29 = 1
            r31 = 1
            r24.idkeyStat(r25, r27, r29, r31)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            goto L_0x03af
        L_0x039e:
            if (r0 < r13) goto L_0x03af
            if (r0 >= r5) goto L_0x03af
            com.tencent.mm.plugin.report.service.n r32 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r33 = 22
            r35 = 57
            r37 = 1
            r39 = 1
            r32.idkeyStat(r33, r35, r37, r39)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
        L_0x03af:
            es2.a r0 = r7.f286618o     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            boolean r0 = r0.f286540d     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            if (r0 == 0) goto L_0x03c2
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r25 = 150(0x96, double:7.4E-322)
            r27 = 14
            r29 = 1
            r31 = 1
            r24.idkeyStat(r25, r27, r29, r31)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
        L_0x03c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r0.append(r3)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            es2.a r5 = r7.f286618o     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            java.lang.String r5 = r5.f286538b     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r0.append(r5)     // Catch:{ SocketTimeoutException -> 0x04d0, Exception -> 0x0488 }
            r13 = r23
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            es2.a r5 = r7.f286618o     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            java.lang.String r5 = r5.f286539c     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            r0.append(r5)     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            int r5 = r7.f286610G     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            r0.append(r5)     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            r7.mo136982x(r11)     // Catch:{ SocketTimeoutException -> 0x03f7, Exception -> 0x03f4 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x0568
        L_0x03f4:
            r0 = move-exception
            goto L_0x048b
        L_0x03f7:
            r0 = move-exception
            goto L_0x04d3
        L_0x03fa:
            java.util.Map r0 = r12.mo112927i()     // Catch:{ Exception -> 0x053d }
            r7.mo136981u(r0)     // Catch:{ Exception -> 0x053d }
            boolean r0 = r7.mo136980t(r12)     // Catch:{ Exception -> 0x053d }
            if (r0 != 0) goto L_0x0434
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x053d }
            r23 = 22
            r25 = 62
            r27 = 1
            r29 = 1
            r22.idkeyStat(r23, r25, r27, r29)     // Catch:{ Exception -> 0x053d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053d }
            r0.<init>()     // Catch:{ Exception -> 0x053d }
            java.lang.String r1 = "checkHttpConnection failed! nocache mediaId : "
            r0.append(r1)     // Catch:{ Exception -> 0x053d }
            es2.a r1 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            java.lang.String r1 = r1.f286538b     // Catch:{ Exception -> 0x053d }
            r0.append(r1)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x053d }
            r7.mo136982x(r11)     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x0568
        L_0x0434:
            long r0 = r7.f286628y     // Catch:{ Exception -> 0x053d }
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r0)     // Catch:{ Exception -> 0x053d }
            r7.f286628y = r0     // Catch:{ Exception -> 0x053d }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r7.f286614K     // Catch:{ Exception -> 0x053d }
            java.lang.String r1 = "Content-Length"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x053d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x053d }
            if (r0 == 0) goto L_0x045a
            int r1 = r0.size()     // Catch:{ Exception -> 0x053d }
            if (r1 <= 0) goto L_0x045a
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x053d }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x053d }
            r7.f286613J = r0     // Catch:{ Exception -> 0x053d }
        L_0x045a:
            java.lang.String r0 = "ip: url %s client ip %s server ip %s svrlen %d %d"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x053d }
            es2.a r3 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            java.lang.String r3 = r3.f286539c     // Catch:{ Exception -> 0x053d }
            r1[r11] = r3     // Catch:{ Exception -> 0x053d }
            java.lang.String r3 = r7.f286621r     // Catch:{ Exception -> 0x053d }
            r5 = 1
            r1[r5] = r3     // Catch:{ Exception -> 0x053d }
            java.lang.String r3 = r7.f286620q     // Catch:{ Exception -> 0x053d }
            r13 = 2
            r1[r13] = r3     // Catch:{ Exception -> 0x053d }
            int r3 = r7.f286613J     // Catch:{ Exception -> 0x053d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x053d }
            r1[r18] = r3     // Catch:{ Exception -> 0x053d }
            int r3 = r7.f286623t     // Catch:{ Exception -> 0x053d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x053d }
            r13 = 4
            r1[r13] = r3     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x0569
        L_0x0488:
            r0 = move-exception
            r13 = r23
        L_0x048b:
            r7.mo136982x(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x053d }
            es2.a r12 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            boolean r12 = r12.f286540d     // Catch:{ Exception -> 0x053d }
            if (r12 == 0) goto L_0x04a5
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x053d }
            r23 = 150(0x96, double:7.4E-322)
            r25 = 14
            r27 = 1
            r29 = 1
            r22.idkeyStat(r23, r25, r27, r29)     // Catch:{ Exception -> 0x053d }
        L_0x04a5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053d }
            r12.<init>()     // Catch:{ Exception -> 0x053d }
            r12.append(r3)     // Catch:{ Exception -> 0x053d }
            es2.a r3 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            java.lang.String r3 = r3.f286538b     // Catch:{ Exception -> 0x053d }
            r12.append(r3)     // Catch:{ Exception -> 0x053d }
            r12.append(r13)     // Catch:{ Exception -> 0x053d }
            es2.a r3 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            java.lang.String r3 = r3.f286539c     // Catch:{ Exception -> 0x053d }
            r12.append(r3)     // Catch:{ Exception -> 0x053d }
            r12.append(r1)     // Catch:{ Exception -> 0x053d }
            r12.append(r0)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x0568
        L_0x04d0:
            r0 = move-exception
            r13 = r23
        L_0x04d3:
            r3 = 1
            r7.f286610G = r3     // Catch:{ Exception -> 0x053d }
            r7.mo136982x(r11)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x053d }
            es2.a r3 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            boolean r3 = r3.f286541e     // Catch:{ Exception -> 0x053d }
            if (r3 == 0) goto L_0x04f1
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x053d }
            r23 = 22
            r25 = 77
            r27 = 1
            r29 = 1
            r22.idkeyStat(r23, r25, r27, r29)     // Catch:{ Exception -> 0x053d }
            goto L_0x04fe
        L_0x04f1:
            com.tencent.mm.plugin.report.service.n r30 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x053d }
            r31 = 22
            r33 = 55
            r35 = 1
            r37 = 1
            r30.idkeyStat(r31, r33, r35, r37)     // Catch:{ Exception -> 0x053d }
        L_0x04fe:
            es2.a r3 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            boolean r3 = r3.f286540d     // Catch:{ Exception -> 0x053d }
            if (r3 == 0) goto L_0x0511
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x053d }
            r23 = 150(0x96, double:7.4E-322)
            r25 = 14
            r27 = 1
            r29 = 1
            r22.idkeyStat(r23, r25, r27, r29)     // Catch:{ Exception -> 0x053d }
        L_0x0511:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053d }
            r3.<init>()     // Catch:{ Exception -> 0x053d }
            java.lang.String r12 = "GprsSetting.checkHttpConnection failed! socket timeout mediaId : "
            r3.append(r12)     // Catch:{ Exception -> 0x053d }
            es2.a r12 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            java.lang.String r12 = r12.f286538b     // Catch:{ Exception -> 0x053d }
            r3.append(r12)     // Catch:{ Exception -> 0x053d }
            r3.append(r13)     // Catch:{ Exception -> 0x053d }
            es2.a r12 = r7.f286618o     // Catch:{ Exception -> 0x053d }
            java.lang.String r12 = r12.f286539c     // Catch:{ Exception -> 0x053d }
            r3.append(r12)     // Catch:{ Exception -> 0x053d }
            r3.append(r1)     // Catch:{ Exception -> 0x053d }
            r3.append(r0)     // Catch:{ Exception -> 0x053d }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x053d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x0568
        L_0x053d:
            r0 = move-exception
            goto L_0x0545
        L_0x053f:
            r0 = move-exception
            r10 = r17
            goto L_0x0545
        L_0x0543:
            r0 = move-exception
            r10 = r13
        L_0x0545:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "connect fail : "
            r1.append(r3)
            java.lang.String r3 = r0.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r1, r3)
            r1 = 2
            r7.f286610G = r1
            r7.mo136982x(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
        L_0x0568:
            r12 = 0
        L_0x0569:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = r2.f238040c
            r0[r11] = r1
            if (r12 == 0) goto L_0x0573
            r1 = 1
            goto L_0x0574
        L_0x0573:
            r1 = 0
        L_0x0574:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            int r1 = r7.f286624u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r0[r3] = r1
            boolean r1 = r2.f238044g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r18] = r1
            java.lang.String r1 = r2.f238043f
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "[sns ip strategy]connect ip:%s, result:%b, canRetry(X-RtFlag):%d, isDC(cold ip):%b, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.String r0 = "canRetry"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            if (r12 == 0) goto L_0x0672
            java.lang.String r1 = "download"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r9)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r7.f286609F = r2     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            java.io.InputStream r2 = r12.getInputStream()     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0615, all -> 0x0610 }
            r7.f286629z = r3     // Catch:{ Exception -> 0x0615, all -> 0x0610 }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r7.f286614K     // Catch:{ Exception -> 0x0615, all -> 0x0610 }
            boolean r0 = r7.mo136979v(r2, r0)     // Catch:{ Exception -> 0x0615, all -> 0x0610 }
            r2.close()     // Catch:{ Exception -> 0x0615, all -> 0x0610 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r2.<init>()     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            java.lang.String r3 = "reportResult ret : "
            r2.append(r3)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r2.append(r0)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            if (r0 != 0) goto L_0x05e0
            r7.mo136982x(r11)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r12.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            goto L_0x0672
        L_0x05e0:
            long r2 = r7.f286629z     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r7.f286629z = r2     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            long r2 = r7.f286604A     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r7.f286625v = r2     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r40.mo136976q()     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            java.lang.String r0 = "processData ret : true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x061e, all -> 0x0619 }
            r12.disconnect()
            r2 = 1
            r7.mo136982x(r2)
            es2.a r0 = r7.f286618o
            boolean r0 = r0.f286540d
            if (r0 == 0) goto L_0x0609
            r17 = 3
            goto L_0x060b
        L_0x0609:
            r17 = 1
        L_0x060b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            goto L_0x0674
        L_0x0610:
            r0 = move-exception
            r5 = r2
            r3 = r21
            goto L_0x065d
        L_0x0615:
            r0 = move-exception
            r16 = r2
            goto L_0x0621
        L_0x0619:
            r0 = move-exception
            r3 = r21
            r5 = 0
            goto L_0x065d
        L_0x061e:
            r0 = move-exception
            r16 = 0
        L_0x0621:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0658 }
            r2.<init>()     // Catch:{ all -> 0x0658 }
            java.lang.String r3 = "snscdndownload fail : "
            r2.append(r3)     // Catch:{ all -> 0x0658 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0658 }
            r2.append(r3)     // Catch:{ all -> 0x0658 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0658 }
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x0658 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r3)     // Catch:{ all -> 0x0658 }
            r2 = 4
            r7.f286610G = r2     // Catch:{ all -> 0x0658 }
            r7.mo136982x(r11)     // Catch:{ all -> 0x0658 }
            if (r16 == 0) goto L_0x0651
            r16.close()     // Catch:{ IOException -> 0x0648 }
            goto L_0x0651
        L_0x0648:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r3 = r21
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r2, r3, r0)
        L_0x0651:
            r12.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            goto L_0x0672
        L_0x0658:
            r0 = move-exception
            r3 = r21
            r5 = r16
        L_0x065d:
            r2 = r0
            if (r5 == 0) goto L_0x066b
            r5.close()     // Catch:{ IOException -> 0x0664 }
            goto L_0x066b
        L_0x0664:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r4, r3, r0)
        L_0x066b:
            r12.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            throw r2
        L_0x0672:
            r17 = 2
        L_0x0674:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r14)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r11] = r1
            long r1 = r7.f286625v
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            es2.a r1 = r7.f286618o
            java.lang.String r2 = r1.f286538b
            r3 = 2
            r0[r3] = r2
            java.lang.String r1 = r1.f286539c
            r0[r18] = r1
            int r1 = r7.f286615L
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "DOWN FIN time:%d down:%d mediaId:%s url[%s], size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r0
        L_0x06aa:
            r7.mo136982x(r11)
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97702f.mo136960k(java.lang.String[]):java.lang.Integer");
    }

    /* renamed from: n */
    public boolean mo136961n(C96983o3 o3Var, String str, long j, String str2) {
        SnsMethodCalculate.markStartTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return false;
        }
        try {
            URL url = new URL(str);
            if (o3Var == null) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                return false;
            } else if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                return false;
            } else if (!str2.contains(url.getHost())) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                return false;
            } else {
                int i = o3Var.f284145b;
                if (i == 0) {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                    return false;
                } else if (Util.secondsToNow((long) i) > j) {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                    return true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                    return false;
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsDownloadCommonMediaBase", "error for check dcip %s", e.getMessage());
            SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return false;
        }
    }

    /* renamed from: o */
    public boolean mo136962o() {
        SnsMethodCalculate.markStartTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        SnsMethodCalculate.markEndTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        return true;
    }

    /* renamed from: p */
    public void mo136963p(Integer num) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        super.mo136963p(num);
        C97694a aVar = this.f286618o;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return;
        }
        Log.m105925i("MicroMsg.SnsDownloadCommonMediaBase", "download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d", num, aVar.f286539c, aVar.f286538b, Integer.valueOf(this.f286611H), Integer.valueOf(f286603M.size()));
        f286603M.remove(this.f286618o.mo136953e());
        if (!this.f286618o.f286540d || num.intValue() == 2) {
            C97694a aVar2 = this.f286618o;
            if (!aVar2.f286540d && aVar2.f286542f == 4) {
                C94866e1.Fx0().mo131086F(this.f286618o.f286538b, this.f286618o.mo136951c() + C102236a0.m134725T(this.f286619p));
            }
        } else {
            C97694a aVar3 = this.f286618o;
            C94921o2.m120483e(aVar3.f286538b, aVar3.f286550n);
            mo136964s();
        }
        C97696c.C97699b bVar = this.f286616m;
        int intValue = num.intValue();
        C101804kv2 kv22 = this.f286619p;
        int d = this.f286618o.mo136952d();
        C97694a aVar4 = this.f286618o;
        ((C94853e) bVar).mo130996u(intValue, kv22, d, aVar4.f286540d, aVar4.mo136953e(), this.f286611H, -1, true);
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
    }

    /* renamed from: s */
    public void mo136964s() {
        String str;
        SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        if (C94866e1.qy0()) {
            SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return;
        }
        System.currentTimeMillis();
        if (this.f286618o.f286544h.mo141829a() == 4) {
            Log.m105924i("MicroMsg.SnsDownloadCommonMediaBase", "decodeType blur thumb");
            String X = C102236a0.m134729X(this.f286619p);
            String str2 = this.f286618o.mo136951c() + X;
            this.f286617n = C92084a.m115750b(str2, this.f286618o.mo136951c() + C102236a0.m134720O(this.f286619p));
            C94901o Fx0 = C94866e1.Fx0();
            C97694a aVar = this.f286618o;
            Fx0.mo131085E(aVar.f286538b, this.f286617n, aVar.f286544h.mo141829a());
        } else if (this.f286618o.f286544h.mo141829a() == 5) {
            Log.m105924i("MicroMsg.SnsDownloadCommonMediaBase", "decodeType blur grid");
            String X2 = C102236a0.m134729X(this.f286619p);
            String str3 = this.f286618o.mo136951c() + X2;
            this.f286617n = C92084a.m115750b(str3, this.f286618o.mo136951c() + C102236a0.m134719N(this.f286619p));
            C94901o Fx02 = C94866e1.Fx0();
            C97694a aVar2 = this.f286618o;
            Fx02.mo131085E(aVar2.f286538b, this.f286617n, aVar2.f286544h.mo141829a());
        } else if (this.f286618o.f286544h.mo141830b().size() <= 1) {
            C94901o Fx03 = C94866e1.Fx0();
            C97694a aVar3 = this.f286618o;
            Fx03.mo131085E(aVar3.f286538b, this.f286617n, aVar3.f286544h.mo141829a());
        } else {
            C94866e1.Fx0().mo131085E(this.f286618o.f286538b, this.f286617n, 0);
            LinkedList linkedList = new LinkedList();
            int i = 0;
            while (i < this.f286618o.f286544h.mo141830b().size() && i < 4) {
                C101804kv2 kv22 = this.f286618o.f286544h.mo141830b().get(i);
                C92714n h = C94866e1.Fx0().mo131119h(0, kv22.f298689d);
                if (C102236a0.m134742f(h)) {
                    linkedList.add(h);
                    Log.m105924i("MicroMsg.SnsDownloadCommonMediaBase", "merge bitmap from " + h + " " + kv22.f298689d);
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                    return;
                }
            }
            this.f286617n = C92714n.m116851c(C102236a0.m134767r0(linkedList, C94866e1.Hx0()));
            Log.m105924i("MicroMsg.SnsDownloadCommonMediaBase", "merge bitmap " + this.f286618o.f286544h.mo141831c() + " " + this.f286617n);
            C94866e1.Fx0().mo131085E(this.f286618o.f286544h.mo141831c(), this.f286617n, this.f286618o.f286544h.mo141829a());
        }
        if (this.f286618o.f286544h.mo141829a() == 0) {
            str = "0-" + this.f286618o.f286544h.mo141831c();
        } else if (this.f286618o.f286544h.mo141829a() == 1) {
            str = "1-" + this.f286618o.f286544h.mo141831c();
        } else if (this.f286618o.f286544h.mo141829a() == 4) {
            str = "4-" + this.f286618o.f286544h.mo141831c();
        } else if (this.f286618o.f286544h.mo141829a() == 5) {
            str = "5-" + this.f286618o.f286544h.mo141831c();
        } else {
            str = null;
        }
        C94901o Fx04 = C94866e1.Fx0();
        Fx04.getClass();
        SnsMethodCalculate.markStartTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markStartTimeMs(C80065o.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Fx04.mo131126k0("", str, (C92714n) null);
        SnsMethodCalculate.markEndTimeMs(C80065o.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
    }

    /* renamed from: t */
    public final boolean mo136980t(C81034b0 b0Var) {
        SnsMethodCalculate.markStartTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        try {
            List list = b0Var.mo112927i().get("cache-control");
            if (list != null) {
                if (list.size() != 0) {
                    if (!Util.isNullOrNil(list.toString())) {
                        if (list.toString().contains("no-cache")) {
                            if (list.toString().contains("no-cache")) {
                                SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                                return false;
                            }
                            SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                            return false;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
                    return true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsDownloadCommonMediaBase", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return false;
        }
    }

    /* renamed from: u */
    public final void mo136981u(Map<String, List<String>> map) {
        SnsMethodCalculate.markStartTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        if (map == null) {
            SnsMethodCalculate.markEndTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (String next : map.keySet()) {
                List<String> list = map.get(next);
                if (list != null) {
                    stringBuffer.append(next + XVFSFile.PATH_SEPARATOR);
                    for (String str : list) {
                        stringBuffer.append(str + "|");
                    }
                    stringBuffer.append(";");
                }
            }
            Log.m105925i("MicroMsg.SnsDownloadCommonMediaBase", "header respone %s", stringBuffer.toString());
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
    }

    /* renamed from: v */
    public abstract boolean mo136979v(InputStream inputStream, Map<String, List<String>> map);

    /* renamed from: x */
    public final void mo136982x(boolean z) {
        SnsMethodCalculate.markStartTimeMs("reportResult", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
        C97694a aVar = this.f286618o;
        if (aVar == null || !aVar.f286541e) {
            if (!z) {
                C115669n.INSTANCE.idkeyStat(22, 52, 1, true);
            } else {
                C115669n.INSTANCE.idkeyStat(22, 53, this.f286625v, true);
            }
            C115669n.INSTANCE.idkeyStat(22, 51, 1, true);
        } else {
            if (!z) {
                C115669n.INSTANCE.idkeyStat(22, 74, 1, true);
            } else {
                C115669n.INSTANCE.idkeyStat(22, 75, this.f286625v, true);
            }
            C115669n.INSTANCE.idkeyStat(22, 73, 1, true);
        }
        C97694a aVar2 = this.f286618o;
        if (aVar2 != null && aVar2.f286540d && !z && !C102236a0.m134742f(this.f286617n)) {
            C115669n.INSTANCE.idkeyStat(150, 66, 1, true);
        }
        this.f286611H = this.f286615L;
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        int compatMixStrength = ConnectivityCompat.Companion.getCompatMixStrength();
        Object[] objArr = new Object[11];
        objArr[0] = Integer.valueOf(this.f286627x);
        objArr[1] = Integer.valueOf(isWifi ? 1 : 0);
        objArr[2] = Integer.valueOf(compatMixStrength);
        objArr[3] = Long.valueOf(this.f286626w);
        objArr[4] = Long.valueOf(this.f286628y);
        objArr[5] = Long.valueOf(this.f286629z);
        objArr[6] = Long.valueOf(this.f286625v);
        objArr[7] = this.f286620q;
        objArr[8] = this.f286622s;
        objArr[9] = this.f286621r;
        C97694a aVar3 = this.f286618o;
        objArr[10] = aVar3 == null ? "" : aVar3.f286539c;
        Log.m105927v("MicroMsg.SnsDownloadCommonMediaBase", "report dns:%d wifi:%d signal:%d [%d,%d,%d]%d serverIp:[%s,%s] xclientip:%s url[%s]", objArr);
        int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
        C97694a aVar4 = this.f286618o;
        int i = (aVar4 == null || aVar4.f286542f != 4) ? 0 : 1;
        Log.m105925i("MicroMsg.SnsDownloadCommonMediaBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", Integer.valueOf(this.f286610G), Integer.valueOf(this.f286611H), Integer.valueOf(netType), Integer.valueOf(i), Integer.valueOf(this.f286623t));
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr2 = new Object[19];
        C97694a aVar5 = this.f286618o;
        objArr2[0] = aVar5 == null ? "" : aVar5.f286539c;
        objArr2[1] = Long.valueOf(m125976w(this.f286622s));
        objArr2[2] = Long.valueOf(z ? this.f286625v : 0);
        objArr2[3] = "";
        objArr2[4] = Integer.valueOf(isWifi);
        objArr2[5] = Long.valueOf(this.f286626w);
        objArr2[6] = Long.valueOf(this.f286628y);
        objArr2[7] = 0;
        objArr2[8] = 0;
        objArr2[9] = Long.valueOf(this.f286629z);
        objArr2[10] = Long.valueOf(m125976w(this.f286621r));
        objArr2[11] = Long.valueOf(m125976w(this.f286620q));
        objArr2[12] = Integer.valueOf(this.f286627x);
        objArr2[13] = Integer.valueOf(compatMixStrength);
        objArr2[14] = Integer.valueOf(this.f286610G);
        objArr2[15] = Integer.valueOf(this.f286611H);
        objArr2[16] = Integer.valueOf(netType);
        objArr2[17] = Integer.valueOf(i);
        objArr2[18] = Integer.valueOf(this.f286623t);
        nVar.mo160131h(10736, objArr2);
        boolean isConnected = NetStatusUtil.isConnected(MMApplicationContext.getContext());
        Log.m105918d("MicroMsg.SnsDownloadCommonMediaBase", "isConntected  " + isConnected + " urlIp: " + this.f286605B);
        if (!z && !Util.isNullOrNil(this.f286605B) && isConnected) {
            C81035d.m98966g(this.f286605B);
        }
        SnsMethodCalculate.markEndTimeMs("reportResult", "com.tencent.mm.plugin.sns.model.download.SnsDownloadCommonMediaBase");
    }
}
