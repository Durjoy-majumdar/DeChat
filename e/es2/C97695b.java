package es2;

import ad0.C0033t;
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

/* renamed from: es2.b */
public abstract class C97695b extends C97696c {

    /* renamed from: N */
    public static HashSet<String> f286557N = new HashSet<>();

    /* renamed from: A */
    public long f286558A = -1;

    /* renamed from: B */
    public String f286559B = "";

    /* renamed from: C */
    public PString f286560C = new PString();

    /* renamed from: D */
    public int f286561D;

    /* renamed from: E */
    public long f286562E;

    /* renamed from: F */
    public long f286563F;

    /* renamed from: G */
    public long f286564G;

    /* renamed from: H */
    public int f286565H = -1;

    /* renamed from: I */
    public int f286566I = 0;

    /* renamed from: J */
    public String f286567J = "";

    /* renamed from: K */
    public int f286568K = 0;

    /* renamed from: L */
    public Map<String, List<String>> f286569L;

    /* renamed from: M */
    public int f286570M = 0;

    /* renamed from: m */
    public C97696c.C97699b f286571m;

    /* renamed from: n */
    public C92714n f286572n = null;

    /* renamed from: o */
    public C97694a f286573o = null;

    /* renamed from: p */
    public C101804kv2 f286574p = null;

    /* renamed from: q */
    public String f286575q = "";

    /* renamed from: r */
    public String f286576r = "";

    /* renamed from: s */
    public String f286577s = "";

    /* renamed from: t */
    public int f286578t = 0;

    /* renamed from: u */
    public int f286579u = 0;

    /* renamed from: v */
    public long f286580v = -1;

    /* renamed from: w */
    public long f286581w = -1;

    /* renamed from: x */
    public int f286582x = -1;

    /* renamed from: y */
    public long f286583y = -1;

    /* renamed from: z */
    public long f286584z = -1;

    public C97695b(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
        this.f286571m = bVar;
        this.f286573o = aVar;
        if (aVar != null) {
            this.f286574p = aVar.f286537a;
            f286557N.add(aVar.mo136953e());
            aVar.mo136955g();
        }
    }

    /* renamed from: y */
    public static long m125932y(String str) {
        SnsMethodCalculate.markStartTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (str == null || str.length() == 0) {
            SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return 0;
        }
        try {
            String[] split = str.split("\\.");
            long j = Util.getLong(split[0], 0) * 16777216;
            long j2 = Util.getLong(split[1], 0);
            Long.signum(j2);
            long j3 = j + (j2 * 65536) + (Util.getLong(split[2], 0) * 256) + Util.getLong(split[3], 0);
            SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return j3;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getStringIpToLong", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return 0;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo57374a(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        Integer k = mo136960k((String[]) objArr);
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        return k;
    }

    /* renamed from: b */
    public ExecutorService mo57375b() {
        SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        ExecutorService Gx0 = C94866e1.Gx0();
        SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        return Gx0;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo57376c(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        mo136963p((Integer) obj);
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    /* renamed from: e */
    public void mo119142e(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        Integer[] numArr = (Integer[]) objArr;
        SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (numArr == null || numArr.length == 0) {
            SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        } else {
            Log.m105925i("MicroMsg.SnsCdnDownloadBase", "responeTotalLen:%d, downloadlen:%d ", Integer.valueOf(this.f286568K), numArr[0]);
            SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        }
        SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x03e1 A[SYNTHETIC, Splitter:B:113:0x03e1] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0481 A[Catch:{ Exception -> 0x0526 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04cc A[Catch:{ Exception -> 0x0526 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04da A[Catch:{ Exception -> 0x0526 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04ed A[Catch:{ Exception -> 0x0526 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0649 A[SYNTHETIC, Splitter:B:189:0x0649] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0665 A[SYNTHETIC, Splitter:B:198:0x0665] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ff A[Catch:{ Exception -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x020a A[Catch:{ Exception -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0296 A[Catch:{ Exception -> 0x0526 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0338 A[Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:113:0x03e1=Splitter:B:113:0x03e1, B:128:0x0474=Splitter:B:128:0x0474} */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer mo136960k(java.lang.String... r42) {
        /*
            r41 = this;
            r7 = r41
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            java.lang.String r8 = "doInBackground"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            boolean r1 = r1.mo121147n()
            r10 = 2
            r11 = 0
            if (r1 == 0) goto L_0x06af
            es2.a r1 = r7.f286573o
            if (r1 != 0) goto L_0x0020
            goto L_0x06af
        L_0x0020:
            boolean r1 = r41.mo136962o()
            java.lang.String r12 = "MicroMsg.SnsCdnDownloadBase"
            r13 = 1
            if (r1 == 0) goto L_0x004e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            es2.a r2 = r7.f286573o
            java.lang.String r2 = r2.f286545i
            r1.append(r2)
            es2.a r2 = r7.f286573o
            java.lang.String r2 = r2.mo136954f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r11] = r1
            java.lang.String r3 = "[tomys] delete img: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
        L_0x004e:
            long r14 = java.lang.System.currentTimeMillis()
            long r1 = java.lang.System.currentTimeMillis()
            r7.f286558A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "to downloadBitmap "
            r1.append(r2)
            es2.a r2 = r7.f286573o
            java.lang.String r2 = r2.f286538b
            r1.append(r2)
            java.lang.String r6 = " "
            r1.append(r6)
            es2.a r2 = r7.f286573o
            boolean r2 = r2.f286540d
            r1.append(r2)
            java.lang.String r2 = " type "
            r1.append(r2)
            es2.a r2 = r7.f286573o
            int r2 = r2.mo136952d()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
            es2.a r1 = r7.f286573o
            java.lang.String r1 = r1.mo136951c()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r1)
            es2.a r1 = r7.f286573o
            com.tencent.mm.storage.o3 r1 = r1.f286548l
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x00a2
            com.tencent.mm.storage.o3 r1 = com.tencent.p014mm.storage.C96983o3.f284139k
        L_0x009e:
            r16 = r1
            r2 = r4
            goto L_0x00f4
        L_0x00a2:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284132d
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00af
            java.lang.String r2 = "album_friend"
        L_0x00ac:
            r16 = r1
            goto L_0x00f4
        L_0x00af:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284133e
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00ba
            java.lang.String r2 = "album_self"
            goto L_0x00ac
        L_0x00ba:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284134f
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00c5
            java.lang.String r2 = "album_stranger"
            goto L_0x00ac
        L_0x00c5:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284135g
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d1
            java.lang.String r2 = "profile_friend"
            goto L_0x00ac
        L_0x00d1:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284136h
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00dd
            java.lang.String r2 = "profile_stranger"
            goto L_0x00ac
        L_0x00dd:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284137i
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00e8
            java.lang.String r2 = "comment"
            goto L_0x00ac
        L_0x00e8:
            com.tencent.mm.storage.o3 r2 = com.tencent.p014mm.storage.C96983o3.f284131c
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = "timeline"
            goto L_0x00ac
        L_0x00f4:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 != 0) goto L_0x010b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "&scene="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x010b:
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
            r3[r13] = r17
            android.content.Context r17 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r17 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r17)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r3[r10] = r17
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r17 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
            int r17 = r17.getCompatMixStrength()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r10 = 3
            r3[r10] = r17
            r10 = 4
            r3[r10] = r2
            java.lang.String r3 = java.lang.String.format(r1, r3)
            es2.a r1 = r7.f286573o
            java.lang.String r2 = r1.f286539c
            java.lang.String r2 = r7.mo136971h(r2)
            r1.f286539c = r2
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.f286581w = r1
            es2.a r1 = r7.f286573o
            boolean r1 = r1.f286541e
            if (r1 == 0) goto L_0x0178
            java.lang.String r2 = "SnsSightDomainList"
            goto L_0x017a
        L_0x0178:
            java.lang.String r2 = "SnsAlbumDomainList"
        L_0x017a:
            if (r1 == 0) goto L_0x017f
            java.lang.String r1 = "SnsSightMainStandbyIpSwitchTime"
            goto L_0x0181
        L_0x017f:
            java.lang.String r1 = "SnsAlbumMainStandbyIpSwitchTime"
        L_0x0181:
            k40.a r18 = f40.C86709a0.m107533q(r0)
            lc3.b r18 = (lc3.C10485b) r18
            pj.f r5 = r18.vh0()
            java.lang.String r18 = r5.mo107405c(r2)
            k40.a r2 = f40.C86709a0.m107533q(r0)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            int r1 = r2.mo107404b(r1, r11)
            long r1 = (long) r1
            java.lang.Object[] r5 = new java.lang.Object[r10]
            es2.a r10 = r7.f286573o
            boolean r10 = r10.f286541e
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r5[r11] = r10
            es2.a r10 = r7.f286573o
            boolean r10 = r10.f286540d
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r5[r13] = r10
            r10 = 2
            r5[r10] = r18
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r17 = 3
            r5[r17] = r10
            java.lang.String r10 = "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r5)
            r20 = 0
            int r5 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x01ce
            r1 = 259200(0x3f480, double:1.28062E-318)
        L_0x01ce:
            r20 = r1
            es2.a r1 = r7.f286573o
            java.lang.String r5 = r1.f286539c
            r1 = r41
            r2 = r16
            r10 = r3
            r3 = r5
            r22 = r4
            r4 = r20
            r24 = r6
            r6 = r18
            boolean r1 = r1.mo136961n(r2, r3, r4, r6)
            com.tencent.mm.network.d$b r2 = new com.tencent.mm.network.d$b
            es2.a r3 = r7.f286573o
            java.lang.String r3 = r3.f286539c
            r2.<init>(r3, r1)
            long r3 = r7.f286581w
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
            r7.f286581w = r3
            java.lang.String r3 = r2.f238040c     // Catch:{ Exception -> 0x020d }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x020d }
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = r2.f238038a     // Catch:{ Exception -> 0x020d }
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch:{ Exception -> 0x020d }
            java.lang.String r3 = r3.getHostAddress()     // Catch:{ Exception -> 0x020d }
            goto L_0x020f
        L_0x020a:
            java.lang.String r3 = r2.f238040c     // Catch:{ Exception -> 0x020d }
            goto L_0x020f
        L_0x020d:
            java.lang.String r3 = "-"
        L_0x020f:
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r11] = r10
            es2.a r5 = r7.f286573o
            java.lang.String r6 = r5.f286539c
            r4[r13] = r6
            java.lang.String r5 = r5.f286538b
            r6 = 2
            r4[r6] = r5
            int r5 = r2.f238041d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            r5 = 4
            r4[r5] = r3
            es2.a r3 = r7.f286573o
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
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r4)
            r7.f286579u = r13
            java.lang.String r1 = " msg:"
            java.lang.String r3 = "GprsSetting.checkHttpConnection failed! mediaId : "
            java.lang.String r4 = "connect"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)
            java.lang.String r5 = r2.f238040c     // Catch:{ Exception -> 0x0528 }
            r7.f286577s = r5     // Catch:{ Exception -> 0x0528 }
            int r5 = r2.f238041d     // Catch:{ Exception -> 0x0528 }
            r7.f286582x = r5     // Catch:{ Exception -> 0x0528 }
            r18 = r14
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0526 }
            r7.f286583y = r13     // Catch:{ Exception -> 0x0526 }
            es2.a r13 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = r13.f286539c     // Catch:{ Exception -> 0x0526 }
            com.tencent.mm.network.b0 r13 = com.tencent.p014mm.network.C81035d.m98963d(r13, r2)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r14 = "GET"
            r13.mo112930l(r14)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r14 = "referer"
            r13.mo112921e(r14, r10)     // Catch:{ Exception -> 0x0526 }
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x0526 }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x0526 }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = "SnsDownloadHttpKeep"
            java.lang.String r0 = r0.mo107405c(r10)     // Catch:{ Exception -> 0x0526 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)     // Catch:{ Exception -> 0x0526 }
            if (r0 <= 0) goto L_0x02a2
            java.lang.String r0 = "header Connection close "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r0 = "Connection"
            java.lang.String r10 = "close"
            r13.mo112921e(r0, r10)     // Catch:{ Exception -> 0x0526 }
        L_0x02a2:
            r0 = 25000(0x61a8, float:3.5032E-41)
            r13.mo112919d(r0)     // Catch:{ Exception -> 0x0526 }
            r13.mo112923g(r0)     // Catch:{ Exception -> 0x0526 }
            com.tencent.mm.network.b0 r0 = r7.mo136965t(r13)     // Catch:{ Exception -> 0x0526 }
            java.util.Map r10 = r0.mo112927i()     // Catch:{ Exception -> 0x0526 }
            r7.f286569L = r10     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = "X-ClientIp"
            java.lang.Object r10 = r10.get(r13)     // Catch:{ Exception -> 0x0526 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x0526 }
            if (r10 == 0) goto L_0x02cc
            int r13 = r10.size()     // Catch:{ Exception -> 0x0526 }
            if (r13 <= 0) goto L_0x02cc
            java.lang.Object r10 = r10.get(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0526 }
            r7.f286576r = r10     // Catch:{ Exception -> 0x0526 }
        L_0x02cc:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10 = r7.f286569L     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = "X-ServerIp"
            java.lang.Object r10 = r10.get(r13)     // Catch:{ Exception -> 0x0526 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x0526 }
            if (r10 == 0) goto L_0x02e6
            int r13 = r10.size()     // Catch:{ Exception -> 0x0526 }
            if (r13 <= 0) goto L_0x02e6
            java.lang.Object r10 = r10.get(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0526 }
            r7.f286575q = r10     // Catch:{ Exception -> 0x0526 }
        L_0x02e6:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10 = r7.f286569L     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = "X-ErrNo"
            java.lang.Object r10 = r10.get(r13)     // Catch:{ Exception -> 0x0526 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x0526 }
            if (r10 == 0) goto L_0x0304
            int r13 = r10.size()     // Catch:{ Exception -> 0x0526 }
            if (r13 <= 0) goto L_0x0304
            java.lang.Object r10 = r10.get(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0526 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)     // Catch:{ Exception -> 0x0526 }
            r7.f286578t = r10     // Catch:{ Exception -> 0x0526 }
        L_0x0304:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10 = r7.f286569L     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = "X-RtFlag"
            java.lang.Object r10 = r10.get(r13)     // Catch:{ Exception -> 0x0526 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x0526 }
            if (r10 == 0) goto L_0x0322
            int r13 = r10.size()     // Catch:{ Exception -> 0x0526 }
            if (r13 <= 0) goto L_0x0322
            java.lang.Object r10 = r10.get(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0526 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)     // Catch:{ Exception -> 0x0526 }
            r7.f286579u = r10     // Catch:{ Exception -> 0x0526 }
        L_0x0322:
            int r10 = r0.mo112916a()     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r7.f286565H = r10     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            java.lang.String r10 = r0.mo112928j()     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r7.f286567J = r10     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            int r10 = r7.f286565H     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r10 == r13) goto L_0x03e1
            r13 = 206(0xce, float:2.89E-43)
            if (r10 == r13) goto L_0x03e1
            java.util.Map r0 = r0.mo112927i()     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r7.mo136968w(r0)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            es2.a r0 = r7.f286573o     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            boolean r0 = r0.f286541e     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r10 = 600(0x258, float:8.41E-43)
            r13 = 400(0x190, float:5.6E-43)
            r14 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L_0x0371
            int r0 = r7.f286565H     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            if (r0 < r13) goto L_0x035f
            if (r0 >= r14) goto L_0x035f
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r26 = 22
            r28 = 78
            r30 = 1
            r32 = 1
            r25.idkeyStat(r26, r28, r30, r32)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            goto L_0x0396
        L_0x035f:
            if (r0 < r14) goto L_0x0396
            if (r0 >= r10) goto L_0x0396
            com.tencent.mm.plugin.report.service.n r33 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r34 = 22
            r36 = 79
            r38 = 1
            r40 = 1
            r33.idkeyStat(r34, r36, r38, r40)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            goto L_0x0396
        L_0x0371:
            int r0 = r7.f286565H     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            if (r0 < r13) goto L_0x0385
            if (r0 >= r14) goto L_0x0385
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r26 = 22
            r28 = 56
            r30 = 1
            r32 = 1
            r25.idkeyStat(r26, r28, r30, r32)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            goto L_0x0396
        L_0x0385:
            if (r0 < r14) goto L_0x0396
            if (r0 >= r10) goto L_0x0396
            com.tencent.mm.plugin.report.service.n r33 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r34 = 22
            r36 = 57
            r38 = 1
            r40 = 1
            r33.idkeyStat(r34, r36, r38, r40)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
        L_0x0396:
            es2.a r0 = r7.f286573o     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            boolean r0 = r0.f286540d     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            if (r0 == 0) goto L_0x03a9
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r26 = 150(0x96, double:7.4E-322)
            r28 = 14
            r30 = 1
            r32 = 1
            r25.idkeyStat(r26, r28, r30, r32)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
        L_0x03a9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r0.append(r3)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            es2.a r10 = r7.f286573o     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            java.lang.String r10 = r10.f286538b     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r0.append(r10)     // Catch:{ SocketTimeoutException -> 0x04b9, Exception -> 0x0471 }
            r10 = r24
            r0.append(r10)     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            es2.a r13 = r7.f286573o     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            java.lang.String r13 = r13.f286539c     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            r0.append(r10)     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            int r13 = r7.f286565H     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            r0.append(r13)     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            r7.mo136970z(r11)     // Catch:{ SocketTimeoutException -> 0x03de, Exception -> 0x03db }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x054e
        L_0x03db:
            r0 = move-exception
            goto L_0x0474
        L_0x03de:
            r0 = move-exception
            goto L_0x04bc
        L_0x03e1:
            java.util.Map r1 = r0.mo112927i()     // Catch:{ Exception -> 0x0526 }
            r7.mo136968w(r1)     // Catch:{ Exception -> 0x0526 }
            boolean r1 = r7.mo136966u(r0)     // Catch:{ Exception -> 0x0526 }
            if (r1 != 0) goto L_0x041b
            com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0526 }
            r24 = 22
            r26 = 62
            r28 = 1
            r30 = 1
            r23.idkeyStat(r24, r26, r28, r30)     // Catch:{ Exception -> 0x0526 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0526 }
            r0.<init>()     // Catch:{ Exception -> 0x0526 }
            java.lang.String r1 = "checkHttpConnection failed! nocache mediaId : "
            r0.append(r1)     // Catch:{ Exception -> 0x0526 }
            es2.a r1 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r1 = r1.f286538b     // Catch:{ Exception -> 0x0526 }
            r0.append(r1)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0526 }
            r7.mo136970z(r11)     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x054e
        L_0x041b:
            long r13 = r7.f286583y     // Catch:{ Exception -> 0x0526 }
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r13)     // Catch:{ Exception -> 0x0526 }
            r7.f286583y = r13     // Catch:{ Exception -> 0x0526 }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r7.f286569L     // Catch:{ Exception -> 0x0526 }
            java.lang.String r3 = "Content-Length"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0526 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0526 }
            if (r1 == 0) goto L_0x0441
            int r3 = r1.size()     // Catch:{ Exception -> 0x0526 }
            if (r3 <= 0) goto L_0x0441
            java.lang.Object r1 = r1.get(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0526 }
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)     // Catch:{ Exception -> 0x0526 }
            r7.f286568K = r1     // Catch:{ Exception -> 0x0526 }
        L_0x0441:
            java.lang.String r1 = "ip: url %s client ip %s server ip %s svrlen %d %d"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0526 }
            es2.a r10 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = r10.f286539c     // Catch:{ Exception -> 0x0526 }
            r3[r11] = r10     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = r7.f286576r     // Catch:{ Exception -> 0x0526 }
            r5 = 1
            r3[r5] = r10     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = r7.f286575q     // Catch:{ Exception -> 0x0526 }
            r13 = 2
            r3[r13] = r10     // Catch:{ Exception -> 0x0526 }
            int r10 = r7.f286568K     // Catch:{ Exception -> 0x0526 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0526 }
            r13 = 3
            r3[r13] = r10     // Catch:{ Exception -> 0x0526 }
            int r10 = r7.f286578t     // Catch:{ Exception -> 0x0526 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0526 }
            r13 = 4
            r3[r13] = r10     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r3)     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            r1 = r0
            goto L_0x054f
        L_0x0471:
            r0 = move-exception
            r10 = r24
        L_0x0474:
            r7.mo136970z(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0526 }
            es2.a r13 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            boolean r13 = r13.f286540d     // Catch:{ Exception -> 0x0526 }
            if (r13 == 0) goto L_0x048e
            com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0526 }
            r24 = 150(0x96, double:7.4E-322)
            r26 = 14
            r28 = 1
            r30 = 1
            r23.idkeyStat(r24, r26, r28, r30)     // Catch:{ Exception -> 0x0526 }
        L_0x048e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0526 }
            r13.<init>()     // Catch:{ Exception -> 0x0526 }
            r13.append(r3)     // Catch:{ Exception -> 0x0526 }
            es2.a r3 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r3 = r3.f286538b     // Catch:{ Exception -> 0x0526 }
            r13.append(r3)     // Catch:{ Exception -> 0x0526 }
            r13.append(r10)     // Catch:{ Exception -> 0x0526 }
            es2.a r3 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r3 = r3.f286539c     // Catch:{ Exception -> 0x0526 }
            r13.append(r3)     // Catch:{ Exception -> 0x0526 }
            r13.append(r1)     // Catch:{ Exception -> 0x0526 }
            r13.append(r0)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x054e
        L_0x04b9:
            r0 = move-exception
            r10 = r24
        L_0x04bc:
            r3 = 1
            r7.f286565H = r3     // Catch:{ Exception -> 0x0526 }
            r7.mo136970z(r11)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0526 }
            es2.a r3 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            boolean r3 = r3.f286541e     // Catch:{ Exception -> 0x0526 }
            if (r3 == 0) goto L_0x04da
            com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0526 }
            r24 = 22
            r26 = 77
            r28 = 1
            r30 = 1
            r23.idkeyStat(r24, r26, r28, r30)     // Catch:{ Exception -> 0x0526 }
            goto L_0x04e7
        L_0x04da:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0526 }
            r32 = 22
            r34 = 55
            r36 = 1
            r38 = 1
            r31.idkeyStat(r32, r34, r36, r38)     // Catch:{ Exception -> 0x0526 }
        L_0x04e7:
            es2.a r3 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            boolean r3 = r3.f286540d     // Catch:{ Exception -> 0x0526 }
            if (r3 == 0) goto L_0x04fa
            com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0526 }
            r24 = 150(0x96, double:7.4E-322)
            r26 = 14
            r28 = 1
            r30 = 1
            r23.idkeyStat(r24, r26, r28, r30)     // Catch:{ Exception -> 0x0526 }
        L_0x04fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0526 }
            r3.<init>()     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = "GprsSetting.checkHttpConnection failed! socket timeout mediaId : "
            r3.append(r13)     // Catch:{ Exception -> 0x0526 }
            es2.a r13 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r13 = r13.f286538b     // Catch:{ Exception -> 0x0526 }
            r3.append(r13)     // Catch:{ Exception -> 0x0526 }
            r3.append(r10)     // Catch:{ Exception -> 0x0526 }
            es2.a r10 = r7.f286573o     // Catch:{ Exception -> 0x0526 }
            java.lang.String r10 = r10.f286539c     // Catch:{ Exception -> 0x0526 }
            r3.append(r10)     // Catch:{ Exception -> 0x0526 }
            r3.append(r1)     // Catch:{ Exception -> 0x0526 }
            r3.append(r0)     // Catch:{ Exception -> 0x0526 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0526 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x054e
        L_0x0526:
            r0 = move-exception
            goto L_0x052b
        L_0x0528:
            r0 = move-exception
            r18 = r14
        L_0x052b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "connect fail : "
            r1.append(r3)
            java.lang.String r3 = r0.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r1, r3)
            r1 = 2
            r7.f286565H = r1
            r7.mo136970z(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
        L_0x054e:
            r1 = 0
        L_0x054f:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r3 = r2.f238040c
            r0[r11] = r3
            if (r1 == 0) goto L_0x0559
            r3 = 1
            goto L_0x055a
        L_0x0559:
            r3 = 0
        L_0x055a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 1
            r0[r4] = r3
            int r3 = r7.f286579u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r0[r4] = r3
            boolean r3 = r2.f238044g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 3
            r0[r4] = r3
            java.lang.String r2 = r2.f238043f
            r3 = 4
            r0[r3] = r2
            java.lang.String r2 = "[sns ip strategy]connect ip:%s, result:%b, canRetry(X-RtFlag):%d, isDC(cold ip):%b, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r0)
            java.lang.String r0 = "canRetry"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            if (r1 == 0) goto L_0x0677
            java.lang.String r2 = "download"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r9)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r7.f286564G = r3     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x061a, all -> 0x0615 }
            r7.f286584z = r13     // Catch:{ Exception -> 0x061a, all -> 0x0615 }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r7.f286569L     // Catch:{ Exception -> 0x061a, all -> 0x0615 }
            boolean r0 = r7.mo136969x(r3, r0)     // Catch:{ Exception -> 0x061a, all -> 0x0615 }
            r3.close()     // Catch:{ Exception -> 0x061a, all -> 0x0615 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r3.<init>()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            java.lang.String r4 = "reportResult ret : "
            r3.append(r4)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r3.append(r0)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            if (r0 != 0) goto L_0x05c7
            r7.mo136970z(r11)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r1.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            goto L_0x0677
        L_0x05c7:
            long r3 = r7.f286584z     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r7.f286584z = r3     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            long r3 = r7.f286558A     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r7.f286580v = r3     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            boolean r0 = r41.mo136976q()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r3.<init>()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            java.lang.String r4 = "processData ret : "
            r3.append(r4)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r3.append(r0)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            if (r0 != 0) goto L_0x0600
            r3 = 3
            r7.f286565H = r3     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r7.mo136970z(r11)     // Catch:{ Exception -> 0x0623, all -> 0x061e }
            r1.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            goto L_0x0677
        L_0x0600:
            r1.disconnect()
            r1 = 1
            r7.mo136970z(r1)
            es2.a r0 = r7.f286573o
            boolean r0 = r0.f286540d
            if (r0 == 0) goto L_0x060f
            r0 = 3
            goto L_0x0610
        L_0x060f:
            r0 = 1
        L_0x0610:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            goto L_0x0678
        L_0x0615:
            r0 = move-exception
            r5 = r3
            r4 = r22
            goto L_0x0662
        L_0x061a:
            r0 = move-exception
            r16 = r3
            goto L_0x0626
        L_0x061e:
            r0 = move-exception
            r4 = r22
            r5 = 0
            goto L_0x0662
        L_0x0623:
            r0 = move-exception
            r16 = 0
        L_0x0626:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x065d }
            r3.<init>()     // Catch:{ all -> 0x065d }
            java.lang.String r4 = "snscdndownload fail : "
            r3.append(r4)     // Catch:{ all -> 0x065d }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x065d }
            r3.append(r4)     // Catch:{ all -> 0x065d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x065d }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x065d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r4)     // Catch:{ all -> 0x065d }
            r3 = 4
            r7.f286565H = r3     // Catch:{ all -> 0x065d }
            r7.mo136970z(r11)     // Catch:{ all -> 0x065d }
            if (r16 == 0) goto L_0x0656
            r16.close()     // Catch:{ IOException -> 0x064d }
            goto L_0x0656
        L_0x064d:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r4 = r22
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r3, r4, r0)
        L_0x0656:
            r1.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            goto L_0x0677
        L_0x065d:
            r0 = move-exception
            r4 = r22
            r5 = r16
        L_0x0662:
            r3 = r0
            if (r5 == 0) goto L_0x0670
            r5.close()     // Catch:{ IOException -> 0x0669 }
            goto L_0x0670
        L_0x0669:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r5, r4, r0)
        L_0x0670:
            r1.disconnect()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r9)
            throw r3
        L_0x0677:
            r0 = 2
        L_0x0678:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r18)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r11] = r2
            long r2 = r7.f286580v
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            es2.a r2 = r7.f286573o
            java.lang.String r3 = r2.f286538b
            r4 = 2
            r1[r4] = r3
            java.lang.String r2 = r2.f286539c
            r3 = 3
            r1[r3] = r2
            int r2 = r7.f286570M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            r1[r3] = r2
            java.lang.String r2 = "DOWN FIN time:%d down:%d mediaId:%s url[%s], size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r0
        L_0x06af:
            r7.mo136970z(r11)
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es2.C97695b.mo136960k(java.lang.String[]):java.lang.Integer");
    }

    /* renamed from: n */
    public boolean mo136961n(C96983o3 o3Var, String str, long j, String str2) {
        SnsMethodCalculate.markStartTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
        try {
            URL url = new URL(str);
            if (o3Var == null) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            } else if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            } else if (str2.indexOf(url.getHost()) == -1) {
                SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                return false;
            } else {
                int i = o3Var.f284145b;
                if (i == 0) {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return false;
                } else if (Util.secondsToNow((long) i) > j) {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return false;
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", e.getMessage());
            SnsMethodCalculate.markEndTimeMs("idDcIp", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
    }

    /* renamed from: o */
    public abstract boolean mo136962o();

    /* renamed from: p */
    public void mo136963p(Integer num) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        super.mo136963p(num);
        C97694a aVar = this.f286573o;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return;
        }
        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d", num, aVar.f286539c, aVar.f286538b, Integer.valueOf(this.f286566I), Integer.valueOf(f286557N.size()));
        f286557N.remove(this.f286573o.mo136953e());
        if (!this.f286573o.f286540d || num.intValue() == 2) {
            C97694a aVar2 = this.f286573o;
            if (!aVar2.f286540d && aVar2.f286542f == 4) {
                C94866e1.Fx0().mo131086F(this.f286573o.f286538b, this.f286573o.mo136951c() + C102236a0.m134725T(this.f286574p));
            }
        } else {
            C97694a aVar3 = this.f286573o;
            C94921o2.m120483e(aVar3.f286538b, aVar3.f286550n);
            mo136964s();
        }
        C97696c.C97699b bVar = this.f286571m;
        int intValue = num.intValue();
        C101804kv2 kv22 = this.f286574p;
        int d = this.f286573o.mo136952d();
        C97694a aVar4 = this.f286573o;
        ((C94853e) bVar).mo130996u(intValue, kv22, d, aVar4.f286540d, aVar4.mo136953e(), this.f286566I, -1, true);
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    /* renamed from: s */
    public void mo136964s() {
        String str;
        SnsMethodCalculate.markStartTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (C94866e1.qy0()) {
            SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return;
        }
        System.currentTimeMillis();
        if (this.f286573o.f286544h.mo141829a() == 4) {
            Log.m105924i("MicroMsg.SnsCdnDownloadBase", "decodeType blur thumb");
            String X = C102236a0.m134729X(this.f286574p);
            String str2 = this.f286573o.mo136951c() + X;
            this.f286572n = C92084a.m115750b(str2, this.f286573o.mo136951c() + C102236a0.m134720O(this.f286574p));
            C94901o Fx0 = C94866e1.Fx0();
            C97694a aVar = this.f286573o;
            Fx0.mo131085E(aVar.f286538b, this.f286572n, aVar.f286544h.mo141829a());
        } else if (this.f286573o.f286544h.mo141829a() == 5) {
            Log.m105924i("MicroMsg.SnsCdnDownloadBase", "decodeType blur grid");
            String X2 = C102236a0.m134729X(this.f286574p);
            String str3 = this.f286573o.mo136951c() + X2;
            this.f286572n = C92084a.m115750b(str3, this.f286573o.mo136951c() + C102236a0.m134719N(this.f286574p));
            C94901o Fx02 = C94866e1.Fx0();
            C97694a aVar2 = this.f286573o;
            Fx02.mo131085E(aVar2.f286538b, this.f286572n, aVar2.f286544h.mo141829a());
        } else if (this.f286573o.f286544h.mo141830b().size() <= 1) {
            C94901o Fx03 = C94866e1.Fx0();
            C97694a aVar3 = this.f286573o;
            Fx03.mo131085E(aVar3.f286538b, this.f286572n, aVar3.f286544h.mo141829a());
        } else {
            C94866e1.Fx0().mo131085E(this.f286573o.f286538b, this.f286572n, 0);
            LinkedList linkedList = new LinkedList();
            int i = 0;
            while (i < this.f286573o.f286544h.mo141830b().size() && i < 4) {
                C101804kv2 kv22 = this.f286573o.f286544h.mo141830b().get(i);
                C92714n h = C94866e1.Fx0().mo131119h(0, kv22.f298689d);
                if (C102236a0.m134742f(h)) {
                    linkedList.add(h);
                    Log.m105924i("MicroMsg.SnsCdnDownloadBase", "merge bitmap from " + h + " " + kv22.f298689d);
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return;
                }
            }
            this.f286572n = C92714n.m116851c(C102236a0.m134767r0(linkedList, C94866e1.Hx0()));
            Log.m105924i("MicroMsg.SnsCdnDownloadBase", "merge bitmap " + this.f286573o.f286544h.mo141831c() + " " + this.f286572n);
            C94866e1.Fx0().mo131085E(this.f286573o.f286544h.mo141831c(), this.f286572n, this.f286573o.f286544h.mo141829a());
        }
        if (this.f286573o.f286544h.mo141829a() == 0) {
            str = "0-" + this.f286573o.f286544h.mo141831c();
        } else if (this.f286573o.f286544h.mo141829a() == 1) {
            str = "1-" + this.f286573o.f286544h.mo141831c();
        } else if (this.f286573o.f286544h.mo141829a() == 4) {
            str = "4-" + this.f286573o.f286544h.mo141831c();
        } else if (this.f286573o.f286544h.mo141829a() == 5) {
            str = "5-" + this.f286573o.f286544h.mo141831c();
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
        SnsMethodCalculate.markEndTimeMs("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    /* renamed from: t */
    public abstract C81034b0 mo136965t(C81034b0 b0Var);

    /* renamed from: u */
    public final boolean mo136966u(C81034b0 b0Var) {
        SnsMethodCalculate.markStartTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        try {
            List list = b0Var.mo112927i().get("cache-control");
            if (list != null) {
                if (list.size() != 0) {
                    if (!Util.isNullOrNil(list.toString())) {
                        if (list.toString().contains("no-cache")) {
                            if (list.toString().contains("no-cache")) {
                                SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                                return false;
                            }
                            SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                            return false;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
                    return true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("checkHttpCacheConnection", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
    }

    /* renamed from: v */
    public boolean mo136967v(int i, long j, PString pString) {
        SnsMethodCalculate.markStartTimeMs("checkStatistic", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < 1000) {
            SnsMethodCalculate.markEndTimeMs("checkStatistic", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
            return false;
        }
        pString.value += String.format("ts=%d&size=%d|", new Object[]{Long.valueOf(currentTimeMillis / 1000), Integer.valueOf(i)});
        SnsMethodCalculate.markEndTimeMs("checkStatistic", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        return true;
    }

    /* renamed from: w */
    public final void mo136968w(Map<String, List<String>> map) {
        SnsMethodCalculate.markStartTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        if (map == null) {
            SnsMethodCalculate.markEndTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
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
            Log.m105925i("MicroMsg.SnsCdnDownloadBase", "header respone %s", stringBuffer.toString());
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("dumpRespHeader", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }

    /* renamed from: x */
    public abstract boolean mo136969x(InputStream inputStream, Map<String, List<String>> map);

    /* renamed from: z */
    public final void mo136970z(boolean z) {
        int i;
        SnsMethodCalculate.markStartTimeMs("reportResult", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        C97694a aVar = this.f286573o;
        if (aVar == null || !aVar.f286541e) {
            if (!z) {
                C115669n.INSTANCE.idkeyStat(22, 52, 1, true);
            } else {
                C115669n.INSTANCE.idkeyStat(22, 53, this.f286580v, true);
            }
            C115669n.INSTANCE.idkeyStat(22, 51, 1, true);
        } else {
            if (!z) {
                C115669n.INSTANCE.idkeyStat(22, 74, 1, true);
            } else {
                C115669n.INSTANCE.idkeyStat(22, 75, this.f286580v, true);
            }
            C115669n.INSTANCE.idkeyStat(22, 73, 1, true);
        }
        C97694a aVar2 = this.f286573o;
        if (aVar2 != null && aVar2.f286540d && !z && !C102236a0.m134742f(this.f286572n)) {
            C115669n.INSTANCE.idkeyStat(150, 66, 1, true);
        }
        this.f286566I = this.f286570M;
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
        int compatMixStrength = companion.getCompatMixStrength();
        Object[] objArr = new Object[11];
        objArr[0] = Integer.valueOf(this.f286582x);
        objArr[1] = Integer.valueOf(isWifi ? 1 : 0);
        objArr[2] = Integer.valueOf(compatMixStrength);
        objArr[3] = Long.valueOf(this.f286581w);
        objArr[4] = Long.valueOf(this.f286583y);
        objArr[5] = Long.valueOf(this.f286584z);
        objArr[6] = Long.valueOf(this.f286580v);
        objArr[7] = this.f286575q;
        objArr[8] = this.f286577s;
        objArr[9] = this.f286576r;
        C97694a aVar3 = this.f286573o;
        objArr[10] = aVar3 == null ? "" : aVar3.f286539c;
        Log.m105927v("MicroMsg.SnsCdnDownloadBase", "report dns:%d wifi:%d signal:%d [%d,%d,%d]%d serverIp:[%s,%s] xclientip:%s url[%s]", objArr);
        int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
        C97694a aVar4 = this.f286573o;
        if (aVar4 != null) {
            i = aVar4.f286542f == 4 ? 1 : 0;
        } else {
            i = 0;
        }
        Object[] objArr2 = new Object[5];
        objArr2[0] = Integer.valueOf(this.f286565H);
        objArr2[1] = Integer.valueOf(this.f286566I);
        objArr2[2] = Integer.valueOf(netType);
        objArr2[3] = Integer.valueOf(i);
        objArr2[4] = Integer.valueOf(this.f286578t);
        Log.m105925i("MicroMsg.SnsCdnDownloadBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", objArr2);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr3 = new Object[19];
        C97694a aVar5 = this.f286573o;
        objArr3[0] = aVar5 == null ? "" : aVar5.f286539c;
        objArr3[1] = Long.valueOf(m125932y(this.f286577s));
        String str = "MicroMsg.SnsCdnDownloadBase";
        objArr3[2] = Long.valueOf(z ? this.f286580v : 0);
        objArr3[3] = "";
        objArr3[4] = Integer.valueOf(isWifi);
        objArr3[5] = Long.valueOf(this.f286581w);
        objArr3[6] = Long.valueOf(this.f286583y);
        objArr3[7] = 0;
        objArr3[8] = 0;
        objArr3[9] = Long.valueOf(this.f286584z);
        objArr3[10] = Long.valueOf(m125932y(this.f286576r));
        objArr3[11] = Long.valueOf(m125932y(this.f286575q));
        objArr3[12] = Integer.valueOf(this.f286582x);
        objArr3[13] = Integer.valueOf(compatMixStrength);
        objArr3[14] = Integer.valueOf(this.f286565H);
        objArr3[15] = Integer.valueOf(this.f286566I);
        objArr3[16] = Integer.valueOf(netType);
        objArr3[17] = Integer.valueOf(i);
        objArr3[18] = Integer.valueOf(this.f286578t);
        nVar.mo160131h(10736, objArr3);
        boolean isConnected = NetStatusUtil.isConnected(MMApplicationContext.getContext());
        String str2 = str;
        Log.m105918d(str2, "isConntected  " + isConnected + " urlIp: " + this.f286559B);
        if (!z && !Util.isNullOrNil(this.f286559B) && isConnected) {
            C81035d.m98966g(this.f286559B);
        }
        SnsMethodCalculate.markStartTimeMs("reportDownloadRecord", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        Log.m105925i(str2, "ready to report logbuffer(13346) packageRecordList:%s", this.f286560C.value);
        int l = mo136974l();
        C0033t tVar = new C0033t();
        tVar.mo32a("20ImgSize", this.f286570M + ",");
        tVar.mo32a("21NetType", (NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 1 : 0) + ",");
        tVar.mo32a("22DelayTime", (this.f286580v - this.f286583y) + ",");
        tVar.mo32a("23RetCode", this.f286565H + ",");
        tVar.mo32a("24DnsCostTime", this.f286581w + ",");
        tVar.mo32a("25ConnectCostTime", this.f286583y + ",");
        tVar.mo32a("26SendCostTime", ",");
        tVar.mo32a("27WaitResponseCostTime", this.f286563F + ",");
        tVar.mo32a("28ReceiveCostTime", this.f286584z + ",");
        tVar.mo32a("29ClientAddrIP", this.f286576r + ",");
        tVar.mo32a("30ServerAddrIP", this.f286577s + ",");
        tVar.mo32a("31dnstype", this.f286582x + ",");
        tVar.mo32a("32signal", companion.getCompatMixStrength() + ",");
        tVar.mo32a("33host", this.f286567J + ",");
        tVar.mo32a("34MediaType", l + ",");
        tVar.mo32a("35X_Errno", this.f286578t + ",");
        tVar.mo32a("36MaxPackageSize", this.f286561D + ",");
        tVar.mo32a("37MaxPackageTimeStamp", this.f286562E + ",");
        tVar.mo32a("38PackageRecordList", this.f286560C.value + ",");
        tVar.mo32a("39ExpLayerId", "0,");
        tVar.mo32a("40ExpId", "0,");
        tVar.mo32a("41FeedId", ",");
        Log.m105924i(str2, "report logbuffer(13480 TLMediaFielDownloadRecord): " + tVar.mo34c());
        nVar.mo160131h(13480, tVar);
        if (this.f286565H != 200) {
            nVar.mo160131h(14071, tVar);
        }
        SnsMethodCalculate.markEndTimeMs("reportDownloadRecord", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
        SnsMethodCalculate.markEndTimeMs("reportResult", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadAdBase");
    }
}
