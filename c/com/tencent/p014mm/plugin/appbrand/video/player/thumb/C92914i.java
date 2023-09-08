package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import androidx.exifinterface.media.ExifInterface;
import b72.C16755c;
import c13.C79917p;
import c72.C16866b;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C45628s0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import p1081gi.C98119b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p592kz.C99274d;
import p663qo.C101211h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import rx3.C48096k;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.i */
public final class C92914i implements CdnLogic.DownloadCallback, CdnLogic.VideoStreamingCallback, CdnLogic.AppCallback, C16755c, C16866b, C98119b {

    /* renamed from: f */
    public static final C13601g<C92914i> f267629f = C36568h.m40986b(C13602i.SYNCHRONIZED, C92917c.f267635d);

    /* renamed from: d */
    public C101211h.C101212a f267630d;

    /* renamed from: e */
    public C98119b f267631e;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.i$a */
    public static final class C92915a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C92915a<InputType, ResultType> f267632d = new C92915a<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            gVar.mo894a(new IPCString(((C101211h) C86312j.m106911c(C101211h.class)).aw0()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.i$b */
    public static final class C92916b extends C87413o implements C32226l<IPCString, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92914i f267633d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<CountDownLatch> f267634e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92916b(C92914i iVar, C8479f0<CountDownLatch> f0Var) {
            super(1);
            this.f267633d = iVar;
            this.f267634e = f0Var;
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            Class cls = C32735h.class;
            C87412m.m108594g(iPCString, "historyPath");
            Log.m105924i("MicroMsg.WebviewCdnService", "CdnLogic.Initialize, historyPath: " + iPCString.f10315d);
            CdnLogic.Initialize(iPCString.f10315d, this.f267633d, "1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001", "cdnwx2013usrname", C45628s0.m50756U() ^ true);
            CdnLogic.setFlowReportParams("ANDROID.MM.CDN.WebviewCdnService", 5242880, 60);
            CdnLogic.Config config = new CdnLogic.Config();
            config.EnableSafeCDN = 1;
            config.ApprovedVideoHosts = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_approved_videohosts, "weixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com,wxsnsdysvp.wxs.qq.com,finder.video.qq.com,findermp.video.qq.com,weixinf.tc.qq.com.cn,szwbwxsns.video.qq.com.cn,szxzwxsns.video.qq.com.cn,szzjwxsns.video.qq.com.cn,shwbwxsns.video.qq.com.cn,shxzwxsns.video.qq.com.cn,shzjwxsns.video.qq.com.cn,wxsnsdy.wxs.qq.com.cn,vweixinthumb.tc.qq.com.cn,wxsnsdythumb.wxs.qq.com.cn,wxappthumb.tc.qq.com.cn,wxapp.tc.qq.com.cn,wxsnsdysvp.wxs.qq.com.cn,finder.video.qq.com.cn,findermp.video.qq.com.cn,snsvideo.c2c.qq.com.cn,wxsnsdy.video.qq.com.cn,snsvideo.hk.wechat.com,snsvideo.c2c.wechat.com,findera4.video.qq.com");
            config.QuicExptValues = "clicfg_android_channelvideo_quic=" + ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_channelvideo_quic, "224") + ";";
            CdnLogic.setConfig(config);
            ((CountDownLatch) this.f267634e.f27484d).countDown();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.i$c */
    public static final class C92917c extends C87413o implements C32224a<C92914i> {

        /* renamed from: d */
        public static final C92917c f267635d = new C92917c();

        public C92917c() {
            super(0);
        }

        public Object invoke() {
            return new C92914i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.i$d */
    public static final class C92918d {
        public C92918d(C8480h hVar) {
        }
    }

    static {
        new C92918d((C8480h) null);
    }

    public C92914i() {
        Log.m105924i("MicroMsg.WebviewCdnService", "ipcinvoke start");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new CountDownLatch(1);
        String str = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(str, "PROCESS_MAIN");
        C28947a.m38500a(str, IPCVoid.f10316d, C92915a.f267632d, new C92916b(this, f0Var));
        ((CountDownLatch) f0Var.f27484d).await();
        Log.m105924i("MicroMsg.WebviewCdnService", "ipcinvoke end");
    }

    /* renamed from: B2 */
    public void mo17767B2(C98119b bVar) {
        this.f267631e = bVar;
    }

    /* renamed from: K1 */
    public void mo17768K1(C101211h.C101212a aVar) {
        this.f267630d = aVar;
    }

    /* renamed from: a */
    public int mo17770a(String str, C98120c cVar, C98121d dVar) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: b */
    public int mo17771b(String str, C98121d dVar) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a5, code lost:
        if (z04.C112550d0.m153768D(r3, 'X', 0, false, 6, (java.lang.Object) null) >= 0) goto L_0x00a7;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17914c(p1081gi.C98124g r10, int r11) {
        /*
            r9 = this;
            java.lang.String r11 = "task"
            gy3.C87412m.m108594g(r10, r11)
            boolean r11 = r10 instanceof p1081gi.C98127h
            java.lang.String r0 = "MicroMsg.WebviewCdnService"
            if (r11 != 0) goto L_0x0023
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "start for invalid task:"
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)
            r10 = -1
            return r10
        L_0x0023:
            com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest r11 = new com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest
            r11.<init>()
            r1 = 20302(0x4f4e, float:2.8449E-41)
            r11.fileType = r1
            java.lang.String r1 = r10.field_mediaId
            r11.fileKey = r1
            r1 = r10
            gi.h r1 = (p1081gi.C98127h) r1
            java.lang.String r2 = r1.f287705p0
            r11.url = r2
            java.lang.String r2 = r1.f287706x0
            r11.referer = r2
            java.lang.String r2 = r10.field_fullpath
            r11.setSavePath(r2)
            r2 = 0
            r11.isColdSnsData = r2
            boolean r3 = r10.f287665i
            r11.isHotSnsVideo = r3
            r11.isHLSVideo = r2
            java.lang.String r2 = r10.f287666j
            r11.hlsVideoFlag = r2
            java.lang.String r2 = r1.f287686T0
            r11.signalQuality = r2
            java.lang.String r2 = r1.f287688U0
            r11.snsScene = r2
            int r2 = r10.field_preloadRatio
            r11.preloadRatio = r2
            long r2 = r10.f287671r
            r11.preloadMinSize = r2
            int r2 = r10.field_requestVideoFormat
            r11.requestVideoFormat = r2
            int r2 = r10.f287657N
            r11.connectionCount = r2
            java.lang.String r2 = r1.f287700b1
            r11.snsCipherKey = r2
            r2 = 3
            r11.bizid = r2
            r2 = 251(0xfb, float:3.52E-43)
            r11.apptype = r2
            int r2 = r1.f287698Z0
            r11.videoflagPolicy = r2
            int r2 = r10.f287658P
            r11.concurrentCount = r2
            r2 = 15
            r11.maxHttpRedirectCount = r2
            int r10 = r10.f287664h
            r11.downloadBehavior = r10
            java.lang.String r2 = r1.f287699a1
            if (r2 == 0) goto L_0x00ba
            java.lang.String r10 = "task.videoFlag"
            gy3.C87412m.m108593f(r2, r10)
            r3 = 120(0x78, float:1.68E-43)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            int r2 = z04.C112550d0.m153768D(r2, r3, r4, r5, r6, r7)
            if (r2 >= 0) goto L_0x00a7
            java.lang.String r3 = r1.f287699a1
            gy3.C87412m.m108593f(r3, r10)
            r4 = 88
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            int r2 = z04.C112550d0.m153768D(r3, r4, r5, r6, r7, r8)
            if (r2 < 0) goto L_0x00ba
        L_0x00a7:
            java.lang.String r2 = r1.f287699a1
            gy3.C87412m.m108593f(r2, r10)
            r10 = 1
            java.lang.String r10 = r2.substring(r10)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r10, r2)
            r11.requestVideoFlag = r10
            goto L_0x00be
        L_0x00ba:
            java.lang.String r10 = r1.f287699a1
            r11.requestVideoFlag = r10
        L_0x00be:
            boolean r10 = sf0.C90188n0.f258910D
            if (r10 == 0) goto L_0x00e4
            java.lang.String r10 = sf0.C90188n0.f258911E
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x00e4
            java.lang.String r10 = sf0.C90188n0.f258911E
            r11.debugIP = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "debugip "
            r10.append(r2)
            java.lang.String r2 = r11.debugIP
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)
        L_0x00e4:
            int r10 = r1.f287689V
            int r10 = com.tencent.mars.cdn.CdnLogic.startSNSDownload(r11, r9, r9, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.video.player.thumb.C92914i.mo17914c(gi.g, int):int");
    }

    /* renamed from: d */
    public int mo17915d(String str, C98121d dVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(dVar, "result");
        Log.m105925i("MicroMsg.WebviewCdnService", "[stopVideoStreamingDownload] mediaId=%s %s", str, Util.getStack());
        CdnLogic.C2CDownloadResult c2CDownloadResult = new CdnLogic.C2CDownloadResult();
        int cancelDownloadTaskWithResult = CdnLogic.cancelDownloadTaskWithResult(str, c2CDownloadResult);
        mo127320g(c2CDownloadResult, dVar);
        return cancelDownloadTaskWithResult;
    }

    /* renamed from: e */
    public int mo17916e(String str, long j, long j2, int i) {
        C87412m.m108594g(str, "mediaId");
        return CdnLogic.requestVideoData(str, j, j2, i);
    }

    /* renamed from: f */
    public final int mo127319f(String str) {
        byte b;
        Log.m105925i("MicroMsg.WebviewCdnService", "ipFromString %s ->", str);
        try {
            if (C112550d0.m153803w(str, ".", false, 2, (Object) null) || C112550d0.m153803w(str, XVFSFile.PATH_SEPARATOR, false, 2, (Object) null)) {
                byte[] address = InetAddress.getByName(str).getAddress();
                C87412m.m108593f(address, "address.address");
                int length = address.length;
                int i = 0;
                b = 0;
                while (i < length) {
                    try {
                        b = (b << 8) | (address[i] & ExifInterface.MARKER);
                        i++;
                    } catch (NullPointerException | UnknownHostException unused) {
                    }
                }
                Log.m105925i("MicroMsg.WebviewCdnService", "<- ipFromString %s --> %d", str, Integer.valueOf(b));
                return b;
            }
            Log.m105928w("MicroMsg.WebviewCdnService", "invalid ip str.");
            return 0;
        } catch (NullPointerException | UnknownHostException unused2) {
            b = 0;
        }
    }

    /* renamed from: g */
    public final C98121d mo127320g(CdnLogic.C2CDownloadResult c2CDownloadResult, C98121d dVar) {
        if (dVar == null) {
            dVar = new C98121d();
        }
        dVar.field_retCode = c2CDownloadResult.errorCode;
        dVar.field_argInfo = c2CDownloadResult.argInfo;
        dVar.field_fileLength = c2CDownloadResult.fileSize;
        dVar.field_fileId = c2CDownloadResult.fileid;
        dVar.field_transInfo = c2CDownloadResult.transforMsg;
        dVar.field_convert2baseline = false;
        dVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
        dVar.field_videoFormat = c2CDownloadResult.videoFormat;
        dVar.field_videoFlag = c2CDownloadResult.videoFlag;
        dVar.field_videoCdnMsg = c2CDownloadResult.videoCdnMsg;
        dVar.field_enQueueTime = c2CDownloadResult.enQueueTime;
        dVar.field_startTime = c2CDownloadResult.startTime;
        dVar.field_endTime = c2CDownloadResult.endTime;
        dVar.field_firstRequestCost = c2CDownloadResult.firstRequestCost;
        dVar.field_firstRequestSize = c2CDownloadResult.firstRequestSize;
        dVar.field_firstRequestDownloadSize = c2CDownloadResult.firstRequestDownloadSize;
        dVar.field_firstRequestCompleted = c2CDownloadResult.firstRequestCompleted;
        dVar.field_averageSpeed = c2CDownloadResult.averageSpeed;
        dVar.field_averageConnectCost = c2CDownloadResult.averageConnectCost;
        dVar.field_firstConnectCost = c2CDownloadResult.firstConnectCost;
        dVar.field_netConnectTimes = c2CDownloadResult.netConnectTimes;
        dVar.field_moovRequestTimes = c2CDownloadResult.moovRequestTimes;
        dVar.field_moovCost = c2CDownloadResult.moovCost;
        dVar.field_moovSize = c2CDownloadResult.moovSize;
        dVar.field_moovCompleted = c2CDownloadResult.moovCompleted;
        dVar.field_moovFailReason = c2CDownloadResult.moovFailReason;
        dVar.field_previousCompletedSize = c2CDownloadResult.previousCompletedSize;
        dVar.field_averageRequestSize = c2CDownloadResult.averageRequestSize;
        dVar.field_averageRequestCost = c2CDownloadResult.averageRequestCost;
        dVar.field_requestTotalCount = c2CDownloadResult.requestTotalCount;
        dVar.field_requestCompletedCount = c2CDownloadResult.requestCompletedCount;
        dVar.field_requestTimeoutCount = c2CDownloadResult.requestTimeoutCount;
        dVar.f287611c = c2CDownloadResult.svrFallbackCount;
        dVar.field_httpStatusCode = c2CDownloadResult.httpStatusCode;
        dVar.field_httpResponseHeader = c2CDownloadResult.httpResponseHeader;
        dVar.field_delayTime = c2CDownloadResult.delayTime;
        dVar.field_dnsCostTime = c2CDownloadResult.dnsCostTime;
        dVar.field_connectCostTime = c2CDownloadResult.connectCostTime;
        dVar.field_waitResponseCostTime = c2CDownloadResult.waitResponseCostTime;
        dVar.field_receiveCostTime = c2CDownloadResult.receiveCostTime;
        String str = c2CDownloadResult.clientIP;
        dVar.field_clientIP = str;
        dVar.field_serverIP = c2CDownloadResult.serverIP;
        C87412m.m108593f(str, "result.clientIP");
        dVar.field_clientHostIP = mo127319f(str);
        String str2 = c2CDownloadResult.serverIP;
        C87412m.m108593f(str2, "result.serverIP");
        dVar.field_serverHostIP = mo127319f(str2);
        dVar.field_xErrorNo = c2CDownloadResult.xErrorNo;
        dVar.field_cSeqCheck = c2CDownloadResult.cSeqCheck;
        dVar.field_usePrivateProtocol = c2CDownloadResult.usePrivateProtocol;
        dVar.field_isCrossNet = c2CDownloadResult.crossNet;
        dVar.field_clientIP = c2CDownloadResult.clientIP;
        dVar.field_detailErrorType = c2CDownloadResult.detailErrorType;
        dVar.field_detailErrorCode = c2CDownloadResult.detailErrorCode;
        String[] strArr = c2CDownloadResult.usedSvrIps;
        if (strArr != null && strArr.length > 0) {
            dVar.field_usedSvrIps = (String[]) strArr.clone();
            String[] strArr2 = c2CDownloadResult.usedSvrIps;
            dVar.f287612d = strArr2[strArr2.length - 1];
            dVar.f287613e = c2CDownloadResult.lastSvrPort;
            dVar.f287614f = c2CDownloadResult.lastNetType;
        }
        dVar.field_isResume = c2CDownloadResult.isResume;
        dVar.f287616h = c2CDownloadResult.picIndex;
        dVar.f287617i = c2CDownloadResult.batchImageNeedRetry;
        dVar.f287618j = c2CDownloadResult.transportProtocol;
        dVar.f287619k = c2CDownloadResult.transportProtocolError;
        dVar.f287620l = c2CDownloadResult.traceId;
        dVar.f287621m = c2CDownloadResult.profile;
        dVar.f287622n = c2CDownloadResult.snsVideoProfile;
        dVar.f287623o = c2CDownloadResult.snsVideoInfo;
        Log.m105918d("MicroMsg.WebviewCdnService", "trace_id " + dVar.f287620l + " flag " + dVar.field_videoFlag + " msg " + dVar.field_videoCdnMsg + ' ' + dVar.f287611c);
        CdnLogic.SNSVideoProfile sNSVideoProfile = dVar.f287622n;
        if (sNSVideoProfile != null) {
            Log.m105925i("MicroMsg.WebviewCdnService", "snsvideo mode %d usecold %b useprov %d exptid %d strategy %s", Integer.valueOf(sNSVideoProfile.mode), Boolean.valueOf(dVar.f287622n.useColdRule), Integer.valueOf(dVar.f287622n.usedProvince), Integer.valueOf(dVar.f287622n.experimentalGroupID), dVar.f287622n.strategy);
        }
        CdnLogic.VideoInfo videoInfo = dVar.f287623o;
        if (videoInfo != null) {
            Log.m105925i("MicroMsg.WebviewCdnService", "snsvideo flag %s flag %d rawflag %d", videoInfo.svrFlag, Integer.valueOf(videoInfo.videoFormat), Integer.valueOf(dVar.f287623o.oriVideoFormat));
        }
        return dVar;
    }

    /* renamed from: h */
    public void mo17772h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: j */
    public byte[] mo17773j(String str, byte[] bArr) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void onBadNetworkProbed() {
        Log.m105918d("MicroMsg.WebviewCdnService", "onBadNetworkProbed");
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        CdnLogic.CronetTaskResult cronetTaskResult;
        C87412m.m108594g(c2CDownloadResult, "result");
        Log.m105925i("MicroMsg.WebviewCdnService", "onC2CDownloadCompleted filekey %s error %d", str, Integer.valueOf(c2CDownloadResult.errorCode));
        C98121d g = mo127320g(c2CDownloadResult, (C98121d) null);
        if (c2CDownloadResult.fromCronet && (cronetTaskResult = c2CDownloadResult.cronetTaskResult) != null) {
            Object[] objArr = new Object[3];
            String str2 = "true";
            objArr[0] = cronetTaskResult.useHttp2 ? str2 : "false";
            if (!cronetTaskResult.useQuic) {
                str2 = "false";
            }
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(cronetTaskResult.statusCode);
            Log.m105925i("MicroMsg.WebviewCdnService", "cronet this task is from cronet ,use http2 %s, use quic %s, status code %d ", objArr);
            CdnLogic.WebPageProfile webPageProfile = c2CDownloadResult.cronetTaskResult.performance;
            Log.m105925i("MicroMsg.WebviewCdnService", "cronet webperformance ip:%s, protocol:%s", webPageProfile.peerIP, webPageProfile.protocol);
            CdnLogic.CronetTaskResult cronetTaskResult2 = new CdnLogic.CronetTaskResult();
            CdnLogic.CronetTaskResult cronetTaskResult3 = c2CDownloadResult.cronetTaskResult;
            cronetTaskResult2.useQuic = cronetTaskResult3.useQuic;
            cronetTaskResult2.useHttp2 = cronetTaskResult3.useHttp2;
            cronetTaskResult2.statusCode = cronetTaskResult3.statusCode;
            cronetTaskResult2.statusText = cronetTaskResult3.statusText;
            cronetTaskResult2.performance = cronetTaskResult3.performance;
            g.field_httpStatusCode = cronetTaskResult3.statusCode;
        }
        long currentTimeMillis = System.currentTimeMillis() - c2CDownloadResult.taskStartTime;
        if (30001 == c2CDownloadResult.fileType && c2CDownloadResult.fromCronet) {
            Log.m105924i("MicroMsg.WebviewCdnService", "cronet task use cronet download time " + currentTimeMillis);
            CdnLogic.CronetTaskResult cronetTaskResult4 = c2CDownloadResult.cronetTaskResult;
            if (cronetTaskResult4 != null) {
                if (cronetTaskResult4.useQuic) {
                    Log.m105924i("MicroMsg.WebviewCdnService", "cronet task use cronet quic download time " + currentTimeMillis);
                } else if (cronetTaskResult4.useHttp2) {
                    Log.m105924i("MicroMsg.WebviewCdnService", "cronet task use cronet http2 download time " + currentTimeMillis);
                } else {
                    Log.m105924i("MicroMsg.WebviewCdnService", "cronet task use cronet http1.x download time " + currentTimeMillis);
                }
            }
        }
        if (g.field_retCode != 0) {
            C101211h.C101212a aVar = this.f267630d;
            if (aVar != null) {
                aVar.mo17774a(str, (C98120c) null, g);
            }
            C98119b bVar = this.f267631e;
            if (bVar != null) {
                bVar.mo17770a(str, (C98120c) null, g);
                return;
            }
            return;
        }
        C101211h.C101212a aVar2 = this.f267630d;
        if (aVar2 != null) {
            aVar2.mo17774a(str, (C98120c) null, g);
        }
        C98119b bVar2 = this.f267631e;
        if (bVar2 != null) {
            bVar2.mo17770a(str, (C98120c) null, g);
        }
    }

    public void onDataAvailable(String str, long j, long j2) {
        C101211h.C101212a aVar = this.f267630d;
        if (aVar != null) {
            aVar.mo17776c(str, (int) j, (int) j2);
        }
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
        Log.m105918d("MicroMsg.WebviewCdnService", "onDownloadProgressChanged, mediaId: " + str + ", offset: " + j + ", total: " + j2 + ", tryShow: " + z);
        C98120c cVar = new C98120c();
        cVar.field_finishedLength = j;
        cVar.field_toltalLength = j2;
        cVar.field_status = 0;
        cVar.field_mtlnotify = z;
        cVar.field_isUploadTask = false;
        C98119b bVar = this.f267631e;
        if (bVar != null) {
            bVar.mo17770a(str, cVar, (C98121d) null);
        }
        C101211h.C101212a aVar = this.f267630d;
        if (aVar != null) {
            aVar.mo17774a(str, cVar, (C98121d) null);
        }
    }

    public void onDownloadToEnd(String str, long j, long j2) {
        C101211h.C101212a aVar = this.f267630d;
        if (aVar != null) {
            aVar.mo17776c(str, (int) j, (int) j2);
        }
    }

    public void onM3U8Ready(String str, String str2) {
        C101211h.C101212a aVar = this.f267630d;
        if (aVar != null) {
            aVar.onM3U8Ready(str, str2);
        }
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        C101211h.C101212a aVar = this.f267630d;
        if (aVar != null) {
            aVar.mo17777d(str, (int) j, (int) j2, videoInfo);
        }
    }

    public void onMoovReadyWithFlag(String str, long j, long j2, String str2) {
    }

    public void onPreloadCompletedWithResult(String str, long j, long j2, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        C87412m.m108591d(c2CDownloadResult);
        long j3 = c2CDownloadResult.recvedBytes;
        c2CDownloadResult.recvedBytes = (long) ((int) j);
        C98121d g = mo127320g(c2CDownloadResult, (C98121d) null);
        g.field_recvedTotalBytes = j3;
        C98119b bVar = this.f267631e;
        if (bVar != null) {
            bVar.mo17771b(str, g);
        }
    }

    public void onTaskTearDown(String str, CdnLogic.DownloadTaskProfile downloadTaskProfile, String str2) {
    }

    public void reportFlow(int i, int i2, int i3, int i4) {
        Log.m105918d("MicroMsg.WebviewCdnService", "reportFlow, wifiRecv: " + i + ", wifiSend: " + i2 + ", mobileRecv: " + i3 + ", mobileSend: " + i4);
    }

    public void reportFlowWithTag(String str, int i, long j, long j2, long j3, long j4) {
        ((C79917p.C79918a) ((C99274d) C86312j.m106911c(C99274d.class)).mo110079wT()).mo110081b(str, j2, j, j4, j3);
    }

    public void requestGetCDN(int i) {
        Log.m105918d("MicroMsg.WebviewCdnService", "requestGetCDN, reason: " + i);
    }

    public void requestSnsGetCdnDistance(int i, int i2, int i3) {
    }

    public String[] resolveHost(String str, boolean z, int[] iArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("reportFlow, host: ");
        sb.append(str);
        sb.append(", isDcip: ");
        sb.append(z);
        sb.append(", dnsType: ");
        if (iArr != null) {
            str2 = Arrays.toString(iArr);
            C87412m.m108593f(str2, "toString(this)");
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.m105918d("MicroMsg.WebviewCdnService", sb.toString());
        return new String[0];
    }
}
