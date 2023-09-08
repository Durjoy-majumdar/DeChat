package com.tencent.p014mm.modelcdntran;

import androidx.exifinterface.media.ExifInterface;
import c13.C79917p;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.CdnDetailErrorsStruct;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31536y2;
import eb0.C45628s0;
import f40.C86709a0;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kj2.C117407d;
import p1081gi.C98119b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98122e;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p592kz.C99273c;
import p592kz.C99274d;
import p663qo.C101211h;
import p711uo.C78247c;
import q62.C101048b;
import sf0.C90188n0;
import te3.C101795jm;

/* renamed from: com.tencent.mm.modelcdntran.u */
public class C92796u implements CdnLogic.AppCallback, CdnLogic.UploadCallback, CdnLogic.SessionCallback, CdnLogic.DownloadCallback, CdnLogic.VideoStreamingCallback, C78247c {

    /* renamed from: v */
    public static long f267112v;

    /* renamed from: w */
    public static long f267113w;

    /* renamed from: d */
    public C101795jm f267114d = null;

    /* renamed from: e */
    public C98119b f267115e = null;

    /* renamed from: f */
    public C98119b f267116f = null;

    /* renamed from: g */
    public int f267117g = 0;

    /* renamed from: h */
    public int f267118h = 0;

    /* renamed from: i */
    public String f267119i = "";

    /* renamed from: j */
    public String f267120j = "";

    /* renamed from: n */
    public MTimerHandler f267121n = null;

    /* renamed from: o */
    public Object f267122o = new Object();

    /* renamed from: p */
    public int f267123p = 1;

    /* renamed from: q */
    public C92800w f267124q = new C92800w();

    /* renamed from: r */
    public C101211h.C101212a f267125r;

    /* renamed from: s */
    public C101211h.C101212a f267126s;

    /* renamed from: t */
    public C101211h.C101212a f267127t;

    /* renamed from: u */
    public C98119b f267128u;

    /* renamed from: com.tencent.mm.modelcdntran.u$a */
    public class C92797a implements MTimerHandler.CallBack {
        public C92797a() {
        }

        public boolean onTimerExpired() {
            C92796u uVar = C92796u.this;
            int i = uVar.f267117g;
            if (i == 0 && uVar.f267118h == 0) {
                return false;
            }
            Log.m105925i("MicroMsg.CdnTransportEngine", "CdnDataFlowStat id:%s send:%d recv:%d", uVar.f267119i, Integer.valueOf(i), Integer.valueOf(C92796u.this.f267118h));
            C31536y2 y2Var = C31519v2.f84271a;
            if (y2Var == null) {
                Log.m105920e("MicroMsg.CdnTransportEngine", "getNetStat null");
                return false;
            }
            C92796u uVar2 = C92796u.this;
            ((C29048w.C29055f) y2Var).mo56422a(uVar2.f267118h, uVar2.f267117g, 0);
            C92796u uVar3 = C92796u.this;
            uVar3.f267117g = 0;
            uVar3.f267118h = 0;
            return true;
        }
    }

    public C92796u(String str, C98119b bVar) {
        if (MMApplicationContext.isMMProcess()) {
            this.f267121n = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C92797a(), true);
        }
        this.f267116f = bVar;
        this.f267120j = str;
        CdnLogic.Initialize(str, this, "1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001", "cdnwx2013usrname", !C45628s0.m50756U());
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(hashCode());
        objArr[1] = str;
        objArr[2] = Util.getStack();
        C98119b bVar2 = this.f267116f;
        objArr[3] = Integer.valueOf(bVar2 != null ? bVar2.hashCode() : -1);
        Log.m105925i("MicroMsg.CdnTransportEngine", "summersafecdn CdnTransportEngine init[%s] infoPath[%s], stack[%s], cdnTransCallback[%s]", objArr);
        CdnLogic.setFlowReportParams("ANDROID.MM.CDN.CdnTransportEngine", 5242880, 60);
    }

    public static int keep_callFromJni(int i, int i2, byte[] bArr) {
        if (i == 100) {
            if (Util.isNullOrNil(bArr)) {
                bArr = new byte[0];
            }
            String str = new String(bArr);
            if (i2 == 4) {
                Log.m105920e("MicroMsg.CdnEngine", str);
            } else if (i2 == 3) {
                Log.m105928w("MicroMsg.CdnEngine", str);
            } else if (i2 == 2) {
                Log.m105924i("MicroMsg.CdnEngine", str);
            } else if (i2 == 1) {
                Log.m105918d("MicroMsg.CdnEngine", str);
            } else if (i2 == 0) {
                Log.m105926v("MicroMsg.CdnEngine", str);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo127017a() {
        Class cls = C101048b.class;
        if (C45628s0.m50756U()) {
            return false;
        }
        if (!MMApplicationContext.isMainProcess() && !MMApplicationContext.isPushProcess()) {
            return false;
        }
        if (NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext())) {
            return true;
        }
        if (!C86312j.m106916h(cls)) {
            return false;
        }
        if (!((C101048b) C86312j.m106911c(cls)).Uo0()) {
            return true;
        }
        int Pe = ((C101048b) C86312j.m106911c(cls)).mo60591Pe();
        Log.m105924i("MicroMsg.CdnTransportEngine", "wkType=" + Pe);
        return Pe == 0;
    }

    /* renamed from: b */
    public final CdnLogic.C2CDownloadRequest mo127018b(C98124g gVar) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileid = gVar.field_fileId;
        c2CDownloadRequest.url = gVar.f287672s;
        c2CDownloadRequest.aeskey = gVar.field_aesKey;
        c2CDownloadRequest.fileType = gVar.field_fileType;
        c2CDownloadRequest.fileKey = gVar.field_mediaId;
        c2CDownloadRequest.setSavePath(gVar.field_fullpath);
        c2CDownloadRequest.isStorageMode = gVar.field_needStorage;
        c2CDownloadRequest.isSmallVideo = gVar.field_smallVideoFlag == 1;
        c2CDownloadRequest.isLargeSVideo = gVar.field_largesvideo > 0;
        c2CDownloadRequest.isAutoStart = gVar.field_autostart;
        c2CDownloadRequest.chatType = gVar.field_chattype;
        c2CDownloadRequest.isSilentTask = gVar.field_isSilentTask;
        int i = gVar.field_requestVideoFormat;
        c2CDownloadRequest.isColdSnsData = false;
        c2CDownloadRequest.isHotSnsVideo = gVar.f287665i;
        c2CDownloadRequest.signalQuality = gVar.field_signalQuality;
        c2CDownloadRequest.snsScene = gVar.field_snsScene;
        c2CDownloadRequest.snsVideoStragegy = gVar.f287667n;
        c2CDownloadRequest.requestVideoFormat = i;
        c2CDownloadRequest.isHLSVideo = false;
        c2CDownloadRequest.hlsVideoFlag = gVar.f287666j;
        String str = gVar.field_svr_signature;
        c2CDownloadRequest.bigfileSignature = str;
        if (Util.isNullOrNil(str)) {
            c2CDownloadRequest.bigfileSignature = "";
        }
        String str2 = gVar.field_fake_bigfile_signature;
        c2CDownloadRequest.fakeBigfileSignature = str2;
        if (Util.isNullOrNil(str2)) {
            c2CDownloadRequest.fakeBigfileSignature = "";
        }
        String str3 = gVar.field_fake_bigfile_signature_aeskey;
        c2CDownloadRequest.fakeBigfileSignatureAeskey = str3;
        if (Util.isNullOrNil(str3)) {
            c2CDownloadRequest.fakeBigfileSignatureAeskey = "";
        }
        String str4 = gVar.field_wxmsgparam;
        c2CDownloadRequest.msgExtra = str4;
        if (Util.isNullOrNil(str4)) {
            c2CDownloadRequest.msgExtra = "";
        }
        c2CDownloadRequest.queueTimeoutSeconds = gVar.f287673t;
        c2CDownloadRequest.transforTimeoutSeconds = gVar.f287674u;
        c2CDownloadRequest.preloadRatio = gVar.field_preloadRatio;
        c2CDownloadRequest.certificateVerifyPolicy = gVar.f287647D;
        c2CDownloadRequest.expectImageFormat = gVar.f287648E;
        int i2 = gVar.f287663g;
        c2CDownloadRequest.bizid = i2;
        if (i2 == 0) {
            c2CDownloadRequest.bizid = 1;
            if (gVar.field_bzScene != 0) {
                c2CDownloadRequest.bizid = 3;
            }
        }
        int i3 = gVar.field_appType;
        c2CDownloadRequest.apptype = i3;
        if (i3 == -1 && c2CDownloadRequest.bizid == 1) {
            c2CDownloadRequest.apptype = 1;
        }
        if (gVar.field_bzScene == 0 && gVar.field_needStorage) {
            c2CDownloadRequest.bizid = 2;
            c2CDownloadRequest.apptype = 10;
        }
        c2CDownloadRequest.useMultithread = gVar.field_use_multithread;
        c2CDownloadRequest.concurrentCount = gVar.f287658P;
        c2CDownloadRequest.connectionCount = gVar.f287657N;
        c2CDownloadRequest.downloadBehavior = gVar.f287664h;
        c2CDownloadRequest.netflowTag = gVar.f287668o;
        return c2CDownloadRequest;
    }

    /* renamed from: c */
    public final int mo127019c(String str) {
        byte b;
        Log.m105925i("MicroMsg.CdnTransportEngine", "ipFromString %s ->", str);
        try {
            if (str.contains(".") || str.contains(XVFSFile.PATH_SEPARATOR)) {
                byte[] address = InetAddress.getByName(str).getAddress();
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
                Log.m105925i("MicroMsg.CdnTransportEngine", "<- ipFromString %s --> %d", str, Integer.valueOf(b));
                return b;
            }
            Log.m105928w("MicroMsg.CdnTransportEngine", "invalid ip str.");
            return 0;
        } catch (NullPointerException | UnknownHostException unused2) {
            b = 0;
        }
    }

    /* renamed from: d */
    public String mo127020d(String str) {
        return CdnLogic.calcFileMD5(C86013q1.m106448i(str, false));
    }

    public byte[] decodeSessionResponseBuf(String str, byte[] bArr) {
        if (!MMApplicationContext.isMMProcess()) {
            return null;
        }
        return keep_cdnDecodePrepareResponse(str, bArr);
    }

    /* renamed from: e */
    public final C98121d mo127021e(CdnLogic.C2CDownloadResult c2CDownloadResult, C98121d dVar) {
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
        dVar.field_clientHostIP = mo127019c(str);
        dVar.field_serverHostIP = mo127019c(c2CDownloadResult.serverIP);
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
        Log.m105918d("MicroMsg.CdnTransportEngine", "trace_id " + dVar.f287620l + " flag " + dVar.field_videoFlag + " msg " + dVar.field_videoCdnMsg + " " + dVar.f287611c);
        CdnLogic.SNSVideoProfile sNSVideoProfile = dVar.f287622n;
        if (sNSVideoProfile != null) {
            Log.m105925i("MicroMsg.CdnTransportEngine", "snsvideo mode %d usecold %b useprov %d exptid %d strategy %s", Integer.valueOf(sNSVideoProfile.mode), Boolean.valueOf(dVar.f287622n.useColdRule), Integer.valueOf(dVar.f287622n.usedProvince), Integer.valueOf(dVar.f287622n.experimentalGroupID), dVar.f287622n.strategy);
        }
        CdnLogic.VideoInfo videoInfo = dVar.f287623o;
        if (videoInfo != null) {
            Log.m105925i("MicroMsg.CdnTransportEngine", "snsvideo flag %s flag %d rawflag %d", videoInfo.svrFlag, Integer.valueOf(videoInfo.videoFormat), Integer.valueOf(dVar.f287623o.oriVideoFormat));
        }
        return dVar;
    }

    /* renamed from: f */
    public boolean mo127022f(C101795jm jmVar, C101795jm jmVar2, C101795jm jmVar3, byte[] bArr, byte[] bArr2, C101795jm jmVar4) {
        C101795jm jmVar5 = jmVar;
        C101795jm jmVar6 = jmVar4;
        Log.m105925i("MicroMsg.CdnTransportEngine", "summersafecdn cdntra setCDNDnsInfo old [%s]  new [%s], safecdn [%s], stack[%s]", this.f267114d, jmVar5, jmVar6, Util.getStack());
        if (jmVar5 == null && bArr == null) {
            return false;
        }
        this.f267114d = jmVar5;
        try {
            CdnLogic.setLegacyCdnInfo(mo127053v(jmVar), mo127053v(jmVar2), mo127053v(jmVar3), mo127053v(jmVar6), bArr, bArr2);
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CdnTransportEngine", "tocdninfo failed:" + e.getLocalizedMessage());
            return false;
        }
    }

    public void finalize() {
    }

    /* renamed from: g */
    public final void mo127024g(C98121d dVar) {
        if (dVar != null && !Util.isNullOrNil(dVar.field_transInfo)) {
            int indexOf = dVar.field_transInfo.indexOf("@,");
            if (indexOf > 0) {
                dVar.f287610b = dVar.field_transInfo.substring(indexOf + 2);
                dVar.field_transInfo = dVar.field_transInfo.substring(0, indexOf);
            }
            Log.m105927v("MicroMsg.CdnTransportEngine", "transinfo:%s, report_part2:%s", dVar.field_transInfo, dVar.f287610b);
        }
    }

    public byte[] getSessionRequestBuf(String str, byte[] bArr) {
        if (!MMApplicationContext.isMMProcess()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        keep_cdnGetSkeyBuf(str, byteArrayOutputStream);
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* renamed from: h */
    public int mo127025h(C98127h hVar) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileType = CdnLogic.kMediaTypeAppVideo;
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = hVar.f287684S0;
        c2CDownloadRequest.isHotSnsVideo = hVar.f287665i;
        c2CDownloadRequest.isHLSVideo = false;
        c2CDownloadRequest.hlsVideoFlag = hVar.f287666j;
        c2CDownloadRequest.signalQuality = hVar.f287686T0;
        c2CDownloadRequest.snsScene = hVar.f287688U0;
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        c2CDownloadRequest.requestVideoFormat = hVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = hVar.f287657N;
        c2CDownloadRequest.snsCipherKey = hVar.f287700b1;
        c2CDownloadRequest.bizid = 3;
        c2CDownloadRequest.apptype = 251;
        c2CDownloadRequest.videoflagPolicy = hVar.f287698Z0;
        c2CDownloadRequest.concurrentCount = hVar.f287696Y0;
        c2CDownloadRequest.maxHttpRedirectCount = 15;
        c2CDownloadRequest.downloadBehavior = hVar.f287664h;
        String str = hVar.f287699a1;
        if (str == null || (str.indexOf(120) < 0 && hVar.f287699a1.indexOf(88) < 0)) {
            c2CDownloadRequest.requestVideoFlag = hVar.f287699a1;
        } else {
            c2CDownloadRequest.requestVideoFlag = hVar.f287699a1.substring(1);
        }
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_disable_finder_pcdn, 0);
        if (Qe != 0) {
            Log.m105929w("MicroMsg.CdnTransportEngine", "finder pcdn disabled by expt %d", Integer.valueOf(Qe));
        }
        if (Qe == 0 && mo127017a()) {
            c2CDownloadRequest.pcdnAppID = 30001;
            c2CDownloadRequest.maxPCDNConnections = 4;
            Log.m105925i("MicroMsg.CdnTransportEngine", "enable pcdn appid %d", 30001);
        }
        return CdnLogic.startSNSDownload(c2CDownloadRequest, this, this, hVar.f287689V);
    }

    /* renamed from: i */
    public int mo127026i(String str, String str2, String str3, String str4, Map<String, String> map, boolean z, int i, int i2, boolean z2, boolean z3, String[] strArr) {
        Log.m105924i("MicroMsg.CdnTransportEngine", "startGamePackageDownload: mediaid:" + str);
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = str;
        c2CDownloadRequest.url = str3;
        c2CDownloadRequest.bakup_url = str4;
        c2CDownloadRequest.setSavePath(str2);
        c2CDownloadRequest.queueTimeoutSeconds = i;
        c2CDownloadRequest.transforTimeoutSeconds = i2;
        c2CDownloadRequest.is_resume_task = z2;
        c2CDownloadRequest.fileType = 30002;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                c2CDownloadRequest.serialized_verify_headers += ((String) next.getKey());
                c2CDownloadRequest.serialized_verify_headers += XVFSFile.PATH_SEPARATOR;
                c2CDownloadRequest.serialized_verify_headers += ((String) next.getValue());
                c2CDownloadRequest.serialized_verify_headers += ";";
            }
        }
        c2CDownloadRequest.allow_mobile_net_download = z;
        c2CDownloadRequest.wifiAutoStart = z3;
        c2CDownloadRequest.maxHttpRedirectCount = 18;
        c2CDownloadRequest.customHeader = String.format("X-Forwarded-Access-Type:%s\r\n", new Object[]{NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext())});
        if (mo127017a()) {
            c2CDownloadRequest.pcdnAppID = 30003;
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_gamedl_maxpcdn, 0);
            c2CDownloadRequest.maxPCDNConnections = Qe;
            Log.m105925i("MicroMsg.CdnTransportEngine", "pcdn maxconn %d for game", Integer.valueOf(Qe));
        }
        return CdnLogic.startHttpMultiSocketDownloadTask(c2CDownloadRequest, this);
    }

    /* renamed from: j */
    public int mo127027j(C98127h hVar) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.fileType = 90;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        c2CDownloadRequest.concurrentCount = hVar.f287696Y0;
        c2CDownloadRequest.maxHttpRedirectCount = 20;
        c2CDownloadRequest.downloadBehavior = hVar.f287664h;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startHttpVideoStreamingDownload(c2CDownloadRequest, this, this, hVar.f287689V);
    }

    /* renamed from: k */
    public int mo127028k(C98127h hVar) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileType = 20202;
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = hVar.f287684S0;
        c2CDownloadRequest.isHotSnsVideo = hVar.f287665i;
        c2CDownloadRequest.isHLSVideo = false;
        c2CDownloadRequest.hlsVideoFlag = hVar.f287666j;
        c2CDownloadRequest.signalQuality = hVar.f287686T0;
        c2CDownloadRequest.snsScene = hVar.f287688U0;
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        c2CDownloadRequest.requestVideoFormat = hVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = hVar.f287657N;
        c2CDownloadRequest.concurrentCount = hVar.f287696Y0;
        c2CDownloadRequest.snsCipherKey = hVar.f287700b1;
        c2CDownloadRequest.snsVideoStragegy = hVar.f287667n;
        c2CDownloadRequest.videoflagPolicy = hVar.f287698Z0;
        c2CDownloadRequest.downloadBehavior = hVar.f287664h;
        String str = hVar.f287699a1;
        if (str == null || (str.indexOf(120) < 0 && hVar.f287699a1.indexOf(88) < 0)) {
            c2CDownloadRequest.requestVideoFlag = hVar.f287699a1;
        } else {
            c2CDownloadRequest.requestVideoFlag = hVar.f287699a1.substring(1);
        }
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startSNSDownload(c2CDownloadRequest, this, this, hVar.f287689V);
    }

    public void keep_OnRequestDoGetCdnDnsInfo(int i) {
        if (C86709a0.m107523b().mo121115m()) {
            C92779i0.Cx0().Gx0(i);
        }
    }

    public byte[] keep_cdnDecodePrepareResponse(String str, byte[] bArr) {
        C98119b bVar = this.f267116f;
        if (bVar != null) {
            return bVar.mo17773j(str, bArr);
        }
        return null;
    }

    public void keep_cdnGetSkeyBuf(String str, ByteArrayOutputStream byteArrayOutputStream) {
        C98119b bVar = this.f267116f;
        if (bVar != null) {
            bVar.mo17772h(str, byteArrayOutputStream);
        }
    }

    public void keep_cdnSendAndRecvData(String str, int i, int i2) {
        MTimerHandler mTimerHandler;
        if (i >= 0 && i2 >= 0) {
            this.f267117g += i;
            this.f267118h += i2;
            if (!Util.isNullOrNil(str)) {
                this.f267119i = str;
            }
            if (this.f267117g + this.f267118h > 51200 && (mTimerHandler = this.f267121n) != null) {
                mTimerHandler.startTimer(500);
            }
        }
    }

    public void keep_onDataAvailable(String str, long j, long j2) {
        C101211h.C101212a aVar;
        int i = 0;
        Log.m105925i("MicroMsg.CdnTransportEngine", "keep_onDataAvailable %s, %d, %d", str, Long.valueOf(j), Long.valueOf(j2));
        C101211h.C101212a aVar2 = this.f267125r;
        if (aVar2 != null) {
            i = aVar2.mo17776c(str, (int) j, (int) j2);
        }
        if (i == 0 && (aVar = this.f267126s) != null) {
            aVar.mo17776c(str, (int) j, (int) j2);
        }
        C101211h.C101212a aVar3 = this.f267127t;
        if (aVar3 != null) {
            aVar3.mo17776c(str, (int) j, (int) j2);
        }
    }

    public int keep_onDownloadError(String str, C98121d dVar) {
        C98119b bVar;
        C101211h.C101212a aVar;
        if (!Util.isNullOrNil(str)) {
            C92798v vVar = new C92798v(C92798v.C92799a.OnDownloadCallbackError, str);
            if (dVar != null) {
                vVar.f267132c = dVar.field_retCode;
            }
            vVar.f267135f = dVar;
            this.f267124q.notify(vVar);
        }
        C101211h.C101212a aVar2 = this.f267125r;
        int a = aVar2 != null ? aVar2.mo17774a(str, (C98120c) null, dVar) : 0;
        if (a == 0 && (aVar = this.f267126s) != null) {
            a = aVar.mo17774a(str, (C98120c) null, dVar);
        }
        if (a == 0 && (bVar = this.f267115e) != null) {
            a = bVar.mo17770a(str, (C98120c) null, dVar);
        }
        if (a == 0 && this.f267116f != null) {
            mo127024g(dVar);
            this.f267116f.mo17770a(str, (C98120c) null, dVar);
        }
        C101211h.C101212a aVar3 = this.f267127t;
        if (aVar3 != null) {
            aVar3.mo17774a(str, (C98120c) null, dVar);
        }
        C98119b bVar2 = this.f267128u;
        if (bVar2 != null) {
            bVar2.mo17770a(str, (C98120c) null, dVar);
        }
        ((C99273c) C86312j.m106911c(C99273c.class)).mo138683vZ(str, (C98120c) null, dVar);
        return 0;
    }

    public int keep_onDownloadProgress(String str, C98120c cVar) {
        C98119b bVar;
        C98119b bVar2;
        C101211h.C101212a aVar;
        cVar.field_isUploadTask = false;
        if (!Util.isNullOrNil(str)) {
            C92798v vVar = new C92798v(C92798v.C92799a.OnDownloadCallbackProgress, str);
            vVar.f267134e = cVar;
            this.f267124q.notify(vVar);
        }
        C101211h.C101212a aVar2 = this.f267125r;
        int a = aVar2 != null ? aVar2.mo17774a(str, cVar, (C98121d) null) : 0;
        if (a == 0 && (aVar = this.f267126s) != null) {
            a = aVar.mo17774a(str, cVar, (C98121d) null);
        }
        if (a == 0 && (bVar2 = this.f267115e) != null) {
            a = bVar2.mo17770a(str, cVar, (C98121d) null);
        }
        if (a == 0 && (bVar = this.f267116f) != null) {
            bVar.mo17770a(str, cVar, (C98121d) null);
        }
        C101211h.C101212a aVar3 = this.f267127t;
        if (aVar3 != null) {
            aVar3.mo17774a(str, cVar, (C98121d) null);
        }
        C98119b bVar3 = this.f267128u;
        if (bVar3 != null) {
            bVar3.mo17770a(str, cVar, (C98121d) null);
        }
        ((C99273c) C86312j.m106911c(C99273c.class)).mo138683vZ(str, cVar, (C98121d) null);
        return 0;
    }

    public int keep_onDownloadSuccessed(String str, C98121d dVar) {
        C98119b bVar;
        C101211h.C101212a aVar;
        if (!Util.isNullOrNil(str)) {
            C92798v vVar = new C92798v(C92798v.C92799a.OnDownloadCallbackSuccess, str);
            vVar.f267135f = dVar;
            this.f267124q.notify(vVar);
        }
        C101211h.C101212a aVar2 = this.f267125r;
        int a = aVar2 != null ? aVar2.mo17774a(str, (C98120c) null, dVar) : 0;
        if (a == 0 && (aVar = this.f267126s) != null) {
            a = aVar.mo17774a(str, (C98120c) null, dVar);
        }
        if (a == 0 && (bVar = this.f267115e) != null) {
            a = bVar.mo17770a(str, (C98120c) null, dVar);
        }
        if (a == 0 && this.f267116f != null) {
            mo127024g(dVar);
            this.f267116f.mo17770a(str, (C98120c) null, dVar);
        }
        C101211h.C101212a aVar3 = this.f267127t;
        if (aVar3 != null) {
            aVar3.mo17774a(str, (C98120c) null, dVar);
        }
        C98119b bVar2 = this.f267128u;
        if (bVar2 != null) {
            bVar2.mo17770a(str, (C98120c) null, dVar);
        }
        ((C99273c) C86312j.m106911c(C99273c.class)).mo138683vZ(str, (C98120c) null, dVar);
        return 0;
    }

    public void keep_onDownloadToEnd(String str, long j, long j2) {
        C101211h.C101212a aVar;
        int i = 0;
        Log.m105925i("MicroMsg.CdnTransportEngine", "keep_onDownloadToEnd %s, %d, %d", str, Long.valueOf(j), Long.valueOf(j2));
        C101211h.C101212a aVar2 = this.f267125r;
        if (aVar2 != null) {
            i = aVar2.mo17776c(str, (int) j, (int) j2);
        }
        if (i == 0 && (aVar = this.f267126s) != null) {
            aVar.mo17775b(str, (int) j, (int) j2);
        }
        C101211h.C101212a aVar3 = this.f267127t;
        if (aVar3 != null) {
            aVar3.mo17776c(str, (int) j, (int) j2);
        }
    }

    public void keep_onMoovReady(String str, long j, long j2, String str2) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "keep_onMoovReady %s, %d, %d, %s, hash[%d]", str, Long.valueOf(j), Long.valueOf(j2), str2, Integer.valueOf(hashCode()));
        Log.m105921e("MicroMsg.CdnTransportEngine", "cdn call on moov ready but onlineVideoCallback is null.hash[%d]", Integer.valueOf(hashCode()));
        C117407d.INSTANCE.mo182088q(C82855e.CTRL_INDEX, 29);
    }

    public int keep_onUploadError(String str, C98121d dVar) {
        if (!Util.isNullOrNil(str)) {
            C92798v vVar = new C92798v(C92798v.C92799a.OnUploadCallbackError, str);
            if (dVar != null) {
                vVar.f267132c = dVar.field_retCode;
            }
            vVar.f267135f = dVar;
            this.f267124q.notify(vVar);
        }
        if (this.f267116f != null) {
            mo127024g(dVar);
            this.f267116f.mo17770a(str, (C98120c) null, dVar);
        }
        ((C99273c) C86312j.m106911c(C99273c.class)).mo138683vZ(str, (C98120c) null, dVar);
        return 0;
    }

    public int keep_onUploadProgress(String str, C98120c cVar) {
        cVar.field_isUploadTask = true;
        if (!Util.isNullOrNil(str)) {
            C92798v vVar = new C92798v(C92798v.C92799a.OnUploadCallbackProgress, str);
            vVar.f267134e = cVar;
            this.f267124q.notify(vVar);
        }
        if (this.f267116f != null) {
            Log.m105927v("MicroMsg.CdnTransportEngine", "klem keep_onUploadProgress mediaId:%s, totalLen%d, offset%d", str, Long.valueOf(cVar.field_toltalLength), Long.valueOf(cVar.field_finishedLength));
            this.f267116f.mo17770a(str, cVar, (C98121d) null);
        }
        ((C99273c) C86312j.m106911c(C99273c.class)).mo138683vZ(str, cVar, (C98121d) null);
        return 0;
    }

    public int keep_onUploadSuccessed(String str, C98121d dVar) {
        if (!Util.isNullOrNil(str)) {
            C92798v vVar = new C92798v(C92798v.C92799a.OnUploadCallbackSuccess, str);
            vVar.f267135f = dVar;
            this.f267124q.notify(vVar);
        }
        if (this.f267116f != null) {
            Log.m105927v("MicroMsg.CdnTransportEngine", "klem keep_onUploadSuccessed mediaId:%s", str);
            mo127024g(dVar);
            this.f267116f.mo17770a(str, (C98120c) null, dVar);
        }
        ((C99273c) C86312j.m106911c(C99273c.class)).mo138683vZ(str, (C98120c) null, dVar);
        return 0;
    }

    /* renamed from: l */
    public int mo127043l(C98122e eVar) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileType = 20201;
        c2CDownloadRequest.fileKey = eVar.field_mediaId;
        c2CDownloadRequest.url = eVar.f287631R;
        c2CDownloadRequest.referer = eVar.f287634T;
        c2CDownloadRequest.isColdSnsData = eVar.f287640Z;
        c2CDownloadRequest.signalQuality = eVar.f287641p0;
        c2CDownloadRequest.snsScene = eVar.f287642x0;
        c2CDownloadRequest.concurrentCount = 6;
        c2CDownloadRequest.bizid = eVar.f287663g;
        c2CDownloadRequest.apptype = eVar.f287630Q0;
        c2CDownloadRequest.fileType = eVar.f287632R0;
        c2CDownloadRequest.downloadBehavior = eVar.f287664h;
        c2CDownloadRequest.msgType = 2;
        c2CDownloadRequest.feedId = eVar.f287624S0;
        c2CDownloadRequest.feedPicCount = eVar.f287625T0;
        c2CDownloadRequest.batchSnsReqImageDatas = eVar.f287627V0;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    /* renamed from: m */
    public int mo127044m(C98123f fVar) {
        if (Util.isNullOrNil(fVar.field_mediaId) || Util.isNullOrNil(fVar.f287631R) || Util.isNullOrNil(fVar.f287635U)) {
            Log.m105920e("MicroMsg.CdnTransportEngine", "invalid param.");
            return -1;
        }
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileType = 20201;
        c2CDownloadRequest.fileKey = fVar.field_mediaId;
        c2CDownloadRequest.url = fVar.f287631R;
        c2CDownloadRequest.referer = fVar.f287634T;
        c2CDownloadRequest.setSavePath(fVar.f287635U);
        c2CDownloadRequest.isColdSnsData = fVar.f287640Z;
        c2CDownloadRequest.signalQuality = fVar.f287641p0;
        c2CDownloadRequest.snsScene = fVar.f287642x0;
        c2CDownloadRequest.snsCipherKey = fVar.f287643y0;
        c2CDownloadRequest.concurrentCount = 6;
        c2CDownloadRequest.bizid = fVar.f287663g;
        c2CDownloadRequest.apptype = fVar.f287630Q0;
        c2CDownloadRequest.fileType = fVar.f287632R0;
        c2CDownloadRequest.requestVideoFormat = fVar.field_requestVideoFormat;
        c2CDownloadRequest.downloadBehavior = fVar.f287664h;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    /* renamed from: n */
    public int mo127045n(C98127h hVar) {
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileType = CdnLogic.kMediaTypeAppVideo;
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = hVar.f287684S0;
        c2CDownloadRequest.isHotSnsVideo = hVar.f287665i;
        c2CDownloadRequest.isHLSVideo = false;
        c2CDownloadRequest.hlsVideoFlag = hVar.f287666j;
        c2CDownloadRequest.signalQuality = hVar.f287686T0;
        c2CDownloadRequest.snsScene = hVar.f287688U0;
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        c2CDownloadRequest.requestVideoFormat = hVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = hVar.f287657N;
        c2CDownloadRequest.apptype = 205;
        c2CDownloadRequest.downloadBehavior = hVar.f287664h;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startSNSDownload(c2CDownloadRequest, this, this, hVar.f287689V);
    }

    /* renamed from: o */
    public int mo127046o(String str, String str2, String str3, int i, int i2, int i3, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i4 = i;
        String[] strArr2 = strArr;
        Object[] objArr = new Object[8];
        objArr[0] = str4;
        objArr[1] = str6;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Integer.valueOf(i3);
        objArr[5] = Integer.valueOf(strArr2 == null ? 0 : strArr2.length);
        objArr[6] = Boolean.valueOf(z);
        objArr[7] = Boolean.valueOf(z4);
        Log.m105925i("MicroMsg.CdnTransportEngine", "startURLDownload: mediaid:%s, savepath:%s, filetype:%d, timeout:%d, %d, ip.size:%d, gzip:%b, allowPCDN:%b", objArr);
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = str4;
        c2CDownloadRequest.url = str5;
        c2CDownloadRequest.setSavePath(str6);
        c2CDownloadRequest.queueTimeoutSeconds = i2;
        c2CDownloadRequest.transforTimeoutSeconds = i3;
        if (!z) {
            c2CDownloadRequest.customHeader = "Accept-Encoding:";
        }
        c2CDownloadRequest.fileType = i4;
        c2CDownloadRequest.taskStartTime = System.currentTimeMillis();
        if (30001 == c2CDownloadRequest.fileType) {
            if (z3) {
                c2CDownloadRequest.useNewdns = true;
            }
            if (z2) {
                Log.m105925i("MicroMsg.CdnTransportEngine", "use cronet download pkg mediaId:%s, url:%s", str4, str5);
                return CdnLogic.startCronetFileDownload(c2CDownloadRequest, this);
            }
            Log.m105925i("MicroMsg.CdnTransportEngine", "use normal download pkg mediaId:%s, url:%s", str4, str5);
            return CdnLogic.startHttpsDownload(c2CDownloadRequest, this);
        }
        if (i4 == 30003 && z4 && mo127017a()) {
            c2CDownloadRequest.pcdnAppID = 30002;
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_patchdl_maxpcdn, 0);
            c2CDownloadRequest.maxPCDNConnections = Qe;
            Log.m105925i("MicroMsg.CdnTransportEngine", "pcdn maxconn %d for patch", Integer.valueOf(Qe));
        }
        return CdnLogic.startURLDownload(c2CDownloadRequest, this);
    }

    public void onBadNetworkProbed() {
        Log.m105928w("MicroMsg.CdnTransportEngine", "bad network probed by CDN, try analyze STN network.");
        StnLogic.startNetworkAnalysis();
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        CdnLogic.CronetTaskResult cronetTaskResult;
        String str2 = str;
        CdnLogic.C2CDownloadResult c2CDownloadResult2 = c2CDownloadResult;
        Log.m105925i("MicroMsg.CdnTransportEngine", "onC2CDownloadCompleted filekey %s error %d", str2, Integer.valueOf(c2CDownloadResult2.errorCode));
        C98121d e = mo127021e(c2CDownloadResult2, (C98121d) null);
        if (c2CDownloadResult2.fromCronet && (cronetTaskResult = c2CDownloadResult2.cronetTaskResult) != null) {
            Object[] objArr = new Object[3];
            String str3 = "true";
            objArr[0] = cronetTaskResult.useHttp2 ? str3 : "false";
            if (!cronetTaskResult.useQuic) {
                str3 = "false";
            }
            objArr[1] = str3;
            objArr[2] = Integer.valueOf(cronetTaskResult.statusCode);
            Log.m105925i("MicroMsg.CdnTransportEngine", "cronet this task is from cronet ,use http2 %s, use quic %s, status code %d ", objArr);
            CdnLogic.WebPageProfile webPageProfile = c2CDownloadResult2.cronetTaskResult.performance;
            Log.m105925i("MicroMsg.CdnTransportEngine", "cronet webperformance ip:%s, protocol:%s", webPageProfile.peerIP, webPageProfile.protocol);
            CdnLogic.CronetTaskResult cronetTaskResult2 = new CdnLogic.CronetTaskResult();
            CdnLogic.CronetTaskResult cronetTaskResult3 = c2CDownloadResult2.cronetTaskResult;
            cronetTaskResult2.useQuic = cronetTaskResult3.useQuic;
            cronetTaskResult2.useHttp2 = cronetTaskResult3.useHttp2;
            cronetTaskResult2.statusCode = cronetTaskResult3.statusCode;
            cronetTaskResult2.statusText = cronetTaskResult3.statusText;
            cronetTaskResult2.performance = cronetTaskResult3.performance;
            e.field_httpStatusCode = cronetTaskResult3.statusCode;
        }
        long currentTimeMillis = System.currentTimeMillis() - c2CDownloadResult2.taskStartTime;
        if (30001 == c2CDownloadResult2.fileType) {
            if (c2CDownloadResult2.fromCronet) {
                Log.m105924i("MicroMsg.CdnTransportEngine", "cronet task use cronet download time " + currentTimeMillis);
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo182089r(1173, 97, 1);
                dVar.mo182089r(1173, 99, currentTimeMillis);
                CdnLogic.CronetTaskResult cronetTaskResult4 = c2CDownloadResult2.cronetTaskResult;
                if (cronetTaskResult4 != null) {
                    if (cronetTaskResult4.useQuic) {
                        dVar.mo182089r(1173, 94, 1);
                        dVar.mo182089r(1173, 95, currentTimeMillis);
                        Log.m105924i("MicroMsg.CdnTransportEngine", "cronet task use cronet quic download time " + currentTimeMillis);
                    } else if (cronetTaskResult4.useHttp2) {
                        dVar.mo182089r(1173, 91, 1);
                        dVar.mo182089r(1173, 92, currentTimeMillis);
                        Log.m105924i("MicroMsg.CdnTransportEngine", "cronet task use cronet http2 download time " + currentTimeMillis);
                    } else {
                        dVar.mo182089r(1173, 88, 1);
                        dVar.mo182089r(1173, 89, currentTimeMillis);
                        Log.m105924i("MicroMsg.CdnTransportEngine", "cronet task use cronet http1.x download time " + currentTimeMillis);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.CdnTransportEngine", "cronet task use normal download time " + currentTimeMillis);
                C117407d dVar2 = C117407d.INSTANCE;
                dVar2.mo182089r(1173, 100, 1);
                dVar2.mo182089r(1173, 98, currentTimeMillis);
            }
        }
        if (e.field_retCode != 0) {
            CdnDetailErrorsStruct cdnDetailErrorsStruct = new CdnDetailErrorsStruct();
            cdnDetailErrorsStruct.f265362h = cdnDetailErrorsStruct.mo86045b("filekey", str2, true);
            cdnDetailErrorsStruct.f265358d = 1;
            cdnDetailErrorsStruct.f265359e = c2CDownloadResult2.detailErrorType;
            cdnDetailErrorsStruct.f265360f = c2CDownloadResult2.detailErrorCode;
            cdnDetailErrorsStruct.f265361g = c2CDownloadResult2.errorCode;
            cdnDetailErrorsStruct.f265363i = c2CDownloadResult2.fileType;
            cdnDetailErrorsStruct.f265364j = c2CDownloadResult2.tryWritenBytes;
            cdnDetailErrorsStruct.f265365k = c2CDownloadResult2.availableBytes;
            cdnDetailErrorsStruct.f265366l = cdnDetailErrorsStruct.mo86045b("SystemErrorDescribe", c2CDownloadResult2.systemErrorDescribe, true);
            cdnDetailErrorsStruct.f265367m = c2CDownloadResult2.currentFileSize;
            cdnDetailErrorsStruct.mo86054n();
            Log.m105925i("MicroMsg.CdnTransportEngine", "reportstr %s", cdnDetailErrorsStruct.mo1006q());
            keep_onDownloadError(str2, e);
            return;
        }
        keep_onDownloadSuccessed(str2, e);
    }

    public void onC2CUploadCompleted(String str, CdnLogic.C2CUploadResult c2CUploadResult) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "onC2CUploadCompleted filekey %s error %d", str, Integer.valueOf(c2CUploadResult.errorCode));
        C98121d dVar = new C98121d();
        dVar.field_retCode = c2CUploadResult.errorCode;
        dVar.field_toUser = c2CUploadResult.touser;
        dVar.field_UploadHitCacheType = c2CUploadResult.hitCache;
        dVar.field_fileId = c2CUploadResult.fileid;
        dVar.field_aesKey = c2CUploadResult.aeskey;
        dVar.field_filemd5 = c2CUploadResult.filemd5;
        dVar.field_thumbfilemd5 = c2CUploadResult.thumbfilemd5;
        dVar.field_mp4identifymd5 = c2CUploadResult.mp4identifymd5;
        dVar.field_transInfo = c2CUploadResult.transforMsg;
        dVar.field_fileLength = c2CUploadResult.fileSize;
        dVar.field_midimgLength = c2CUploadResult.midfileSize;
        dVar.field_thumbimgLength = c2CUploadResult.thumbfileSize;
        dVar.field_needSendMsgField = !c2CUploadResult.sendmsgFromCDN;
        dVar.field_exist_whencheck = c2CUploadResult.existOnSvr;
        byte[] bArr = c2CUploadResult.skeyrespbuf;
        if (bArr != null) {
            dVar.field_sKeyrespbuf = (byte[]) bArr.clone();
        }
        dVar.field_videoFileId = c2CUploadResult.videofileid;
        dVar.field_filecrc = c2CUploadResult.fileCrc32;
        dVar.field_upload_by_safecdn = c2CUploadResult.uploadBySafecdn;
        dVar.field_isVideoReduced = c2CUploadResult.isVideoReduced;
        String[] strArr = c2CUploadResult.usedSvrIps;
        if (strArr != null) {
            dVar.field_usedSvrIps = (String[]) strArr.clone();
        }
        dVar.field_fileUrl = c2CUploadResult.fileUrl;
        dVar.field_thumbUrl = c2CUploadResult.thumbfileUrl;
        dVar.f287615g = c2CUploadResult.emojiMD5;
        dVar.field_isResume = c2CUploadResult.isResume;
        dVar.field_delayTime = c2CUploadResult.delayTime;
        dVar.field_connectCostTime = c2CUploadResult.connectCostTime;
        dVar.field_waitResponseCostTime = c2CUploadResult.waitResponseCostTime;
        dVar.field_receiveCostTime = c2CUploadResult.receiveCostTime;
        String str2 = c2CUploadResult.clientIP;
        dVar.field_clientIP = str2;
        dVar.field_serverIP = c2CUploadResult.serverIP;
        dVar.field_clientHostIP = mo127019c(str2);
        dVar.field_serverHostIP = mo127019c(c2CUploadResult.serverIP);
        dVar.f287618j = c2CUploadResult.transportProtocol;
        dVar.f287619k = c2CUploadResult.transportProtocolError;
        dVar.field_detailErrorType = c2CUploadResult.detailErrorType;
        dVar.field_detailErrorCode = c2CUploadResult.detailErrorCode;
        if (dVar.field_retCode != 0) {
            CdnDetailErrorsStruct cdnDetailErrorsStruct = new CdnDetailErrorsStruct();
            cdnDetailErrorsStruct.f265362h = cdnDetailErrorsStruct.mo86045b("filekey", str, true);
            cdnDetailErrorsStruct.f265358d = 0;
            cdnDetailErrorsStruct.f265359e = c2CUploadResult.detailErrorType;
            cdnDetailErrorsStruct.f265360f = c2CUploadResult.detailErrorCode;
            cdnDetailErrorsStruct.f265361g = c2CUploadResult.errorCode;
            cdnDetailErrorsStruct.f265363i = c2CUploadResult.filetype;
            cdnDetailErrorsStruct.f265364j = 0;
            cdnDetailErrorsStruct.f265365k = 0;
            cdnDetailErrorsStruct.f265366l = cdnDetailErrorsStruct.mo86045b("SystemErrorDescribe", c2CUploadResult.systemErrorDescribe, true);
            cdnDetailErrorsStruct.mo86054n();
            Log.m105925i("MicroMsg.CdnTransportEngine", "reportstr %s", cdnDetailErrorsStruct.mo1006q());
            keep_onUploadError(str, dVar);
            return;
        }
        keep_onUploadSuccessed(str, dVar);
    }

    public void onDataAvailable(String str, long j, long j2) {
        keep_onDataAvailable(str, j, j2);
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
        C98120c cVar = new C98120c();
        cVar.field_finishedLength = j;
        cVar.field_toltalLength = j2;
        cVar.field_status = 0;
        cVar.field_mtlnotify = z;
        keep_onDownloadProgress(str, cVar);
    }

    public void onDownloadToEnd(String str, long j, long j2) {
        keep_onDownloadToEnd(str, j, j2);
    }

    public void onM3U8Ready(String str, String str2) {
        C101211h.C101212a aVar;
        Log.m105925i("MicroMsg.CdnTransportEngine", "onM3U8Ready %s, %d, hash[%d]", str, Integer.valueOf(str2.length()), Integer.valueOf(hashCode()));
        C101211h.C101212a aVar2 = this.f267125r;
        int onM3U8Ready = aVar2 != null ? aVar2.onM3U8Ready(str, str2) : 0;
        if (onM3U8Ready == 0 && (aVar = this.f267126s) != null) {
            onM3U8Ready = aVar.onM3U8Ready(str, str2);
        }
        C101211h.C101212a aVar3 = this.f267127t;
        if (aVar3 != null) {
            onM3U8Ready = aVar3.onM3U8Ready(str, str2);
        }
        if (onM3U8Ready == 0) {
            Log.m105921e("MicroMsg.CdnTransportEngine", "cdn call on m3u8 ready but onlineVideoCallback is null.hash[%d]", Integer.valueOf(hashCode()));
            C117407d.INSTANCE.mo182088q(C82855e.CTRL_INDEX, 29);
        }
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        keep_onMoovReady(str, j, j2, videoInfo);
    }

    public void onMoovReadyWithFlag(String str, long j, long j2, String str2) {
    }

    public void onPreloadCompletedWithResult(String str, long j, long j2, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        C98119b bVar;
        long j3 = c2CDownloadResult.recvedBytes;
        c2CDownloadResult.recvedBytes = (long) ((int) j);
        C98121d e = mo127021e(c2CDownloadResult, (C98121d) null);
        e.field_recvedTotalBytes = j3;
        C98119b bVar2 = this.f267115e;
        if ((bVar2 != null ? bVar2.mo17771b(str, e) : 0) == 0 && (bVar = this.f267116f) != null) {
            bVar.mo17771b(str, e);
        }
        C98119b bVar3 = this.f267128u;
        if (bVar3 != null) {
            bVar3.mo17771b(str, e);
        }
    }

    public void onTaskTearDown(String str, CdnLogic.DownloadTaskProfile downloadTaskProfile, String str2) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "onTaskTearDown %s json %s", str, str2);
    }

    public void onUploadProgressChanged(String str, long j, long j2) {
        C98120c cVar = new C98120c();
        cVar.field_finishedLength = j;
        cVar.field_toltalLength = j2;
        cVar.field_status = 0;
        cVar.field_mtlnotify = false;
        keep_onUploadProgress(str, cVar);
    }

    /* renamed from: p */
    public int mo127047p(String str, String str2, String str3, int i, String str4, String str5, int i2, boolean z) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "startURLDownload: mediaid:%s, savepath:%s", str, str3);
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = str;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.setSavePath(str3);
        c2CDownloadRequest.aeskey = str4;
        c2CDownloadRequest.customHeader = "authkey:" + str5 + APLogFileUtil.SEPARATOR_LINE;
        c2CDownloadRequest.useCronet = z;
        c2CDownloadRequest.fileType = i;
        return CdnLogic.startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    /* renamed from: q */
    public int mo127048q(C98124g gVar, int i) {
        CdnLogic.C2CDownloadRequest b = mo127018b(gVar);
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            b.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + b.debugIP);
        }
        return CdnLogic.startVideoStreamingDownload(b, this, this, i);
    }

    /* renamed from: r */
    public int mo127049r(C98124g gVar) {
        CdnLogic.C2CDownloadRequest b = mo127018b(gVar);
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            b.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + b.debugIP);
        }
        return CdnLogic.startC2CDownload(b, this);
    }

    public void reportFlow(int i, int i2, int i3, int i4) {
        if (MMApplicationContext.isMMProcess()) {
            int i5 = i2 + i4;
            int i6 = i + i3;
            f267112v += (long) i6;
            f267113w += (long) i5;
            Log.m105925i("MicroMsg.CdnTransportEngine", "ReportFlow, wifi:s:%d, r:%d, mobile:s:%d, r:%d tr:%d, ts:%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(f267112v), Long.valueOf(f267113w));
            keep_cdnSendAndRecvData("dummy clientmsgid", i5, i6);
        }
    }

    public void reportFlowWithTag(String str, int i, long j, long j2, long j3, long j4) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "reportFlowWithTag tag %s seconds %d mobile %d wifi %d", str, Integer.valueOf(i), Long.valueOf(j3 + j4), Long.valueOf(j + j2));
        ((C79917p.C79918a) ((C99274d) C86312j.m106911c(C99274d.class)).mo110079wT()).mo110081b(str, j2, j, j4, j3);
    }

    public void requestGetCDN(int i) {
        if (MMApplicationContext.isMMProcess()) {
            Log.m105925i("MicroMsg.CdnTransportEngine", "requestgetcdn scene %d", Integer.valueOf(i));
            keep_OnRequestDoGetCdnDnsInfo(i);
        }
    }

    public void requestSnsGetCdnDistance(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "requestSnsGetCdnDistance version %d prov %d city %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C86709a0.m107524d().mo123460f(new C40355c0(i, i2, i3));
    }

    public String[] resolveHost(String str, boolean z, int[] iArr) {
        if (!MMApplicationContext.isMMProcess()) {
            return null;
        }
        Log.m105925i("MicroMsg.CdnTransportEngine", "try resolve host %s, isdc %b", str, Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList();
        iArr[0] = C81035d.m98965f(str, z, arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Log.m105925i("MicroMsg.CdnTransportEngine", "resolved dnstype %d iplist %s", Integer.valueOf(iArr[0]), Arrays.toString(strArr));
        return strArr;
    }

    /* renamed from: s */
    public int mo127050s(C98124g gVar) {
        CdnLogic.C2CUploadRequest c2CUploadRequest = new CdnLogic.C2CUploadRequest();
        c2CUploadRequest.fileKey = gVar.field_mediaId;
        c2CUploadRequest.setFilePath(gVar.field_fullpath);
        c2CUploadRequest.setThumbfilePath(gVar.field_thumbpath);
        c2CUploadRequest.fileType = gVar.field_fileType;
        c2CUploadRequest.forwardAeskey = gVar.field_aesKey;
        c2CUploadRequest.forwardFileid = gVar.field_fileId;
        c2CUploadRequest.queueTimeoutSeconds = gVar.f287673t;
        c2CUploadRequest.transforTimeoutSeconds = gVar.f287674u;
        c2CUploadRequest.toUser = gVar.field_talker;
        c2CUploadRequest.netflowTag = gVar.f287668o;
        c2CUploadRequest.sendmsgFromCDN = gVar.field_sendmsg_viacdn;
        c2CUploadRequest.chatType = gVar.field_chattype;
        int i = gVar.f287663g;
        c2CUploadRequest.bizid = i;
        boolean z = true;
        if (i == 0) {
            c2CUploadRequest.bizid = 1;
            if (gVar.field_bzScene != 0) {
                c2CUploadRequest.bizid = 3;
            }
        }
        int i2 = gVar.field_appType;
        c2CUploadRequest.apptype = i2;
        if (i2 == -1 && c2CUploadRequest.bizid == 1) {
            c2CUploadRequest.apptype = 1;
        }
        if (gVar.field_bzScene == 0 && gVar.field_needStorage) {
            c2CUploadRequest.bizid = 2;
            c2CUploadRequest.apptype = 10;
        }
        c2CUploadRequest.checkExistOnly = gVar.field_onlycheckexist;
        c2CUploadRequest.isSmallVideo = gVar.field_smallVideoFlag == 1;
        c2CUploadRequest.isLargeSVideo = gVar.field_largesvideo;
        c2CUploadRequest.videoSource = gVar.field_videosource;
        if (gVar.field_advideoflag != 1) {
            z = false;
        }
        c2CUploadRequest.isSnsAdVideo = z;
        c2CUploadRequest.isStorageMode = gVar.field_needStorage;
        c2CUploadRequest.enableHitCheck = gVar.field_enable_hitcheck;
        c2CUploadRequest.forceNoSafeCdn = gVar.field_force_aeskeycdn;
        c2CUploadRequest.trySafeCdn = gVar.field_trysafecdn;
        c2CUploadRequest.setMidimgPath(gVar.field_midimgpath);
        String str = gVar.field_svr_signature;
        c2CUploadRequest.bigfileSignature = str;
        if (Util.isNullOrNil(str)) {
            c2CUploadRequest.bigfileSignature = "";
        }
        String str2 = gVar.field_fake_bigfile_signature;
        c2CUploadRequest.fakeBigfileSignature = str2;
        if (Util.isNullOrNil(str2)) {
            c2CUploadRequest.fakeBigfileSignature = "";
        }
        String str3 = gVar.field_fake_bigfile_signature_aeskey;
        c2CUploadRequest.fakeBigfileSignatureAeskey = str3;
        if (Util.isNullOrNil(str3)) {
            c2CUploadRequest.fakeBigfileSignatureAeskey = "";
        }
        c2CUploadRequest.emojiExtinfo = gVar.f287649F;
        c2CUploadRequest.fileBuffer = gVar.f287650G;
        c2CUploadRequest.thumbnailBuffer = gVar.f287651H;
        c2CUploadRequest.customHeader = gVar.f287653J;
        c2CUploadRequest.useMultithread = gVar.field_use_multithread;
        c2CUploadRequest.concurrentCount = gVar.f287658P;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CUploadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CUploadRequest.debugIP);
        }
        return c2CUploadRequest.sendmsgFromCDN ? CdnLogic.startSSUpload(c2CUploadRequest, this, this) : CdnLogic.startC2CUpload(c2CUploadRequest, this);
    }

    /* renamed from: t */
    public int mo127051t(String str) {
        Log.m105924i("MicroMsg.CdnTransportEngine", "stopHttpsDownload: mediaid:" + str);
        CdnLogic.cancelTask(str);
        return 0;
    }

    /* renamed from: u */
    public int mo127052u(String str, C98121d dVar) {
        Log.m105925i("MicroMsg.CdnTransportEngine", "[stopVideoStreamingDownload] mediaId=%s %s", str, Util.getStack());
        CdnLogic.C2CDownloadResult c2CDownloadResult = new CdnLogic.C2CDownloadResult();
        int cancelDownloadTaskWithResult = CdnLogic.cancelDownloadTaskWithResult(str, c2CDownloadResult);
        mo127021e(c2CDownloadResult, dVar);
        return cancelDownloadTaskWithResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.mars.cdn.CdnLogic.CdnInfo mo127053v(te3.C101795jm r9) {
        /*
            r8 = this;
            com.tencent.mars.cdn.CdnLogic$CdnInfo r0 = new com.tencent.mars.cdn.CdnLogic$CdnInfo
            r0.<init>()
            if (r9 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r1 = r9.f298537d
            r0.ver = r1
            int r1 = r9.f298538e
            r0.uin = r1
            int r1 = r9.f298540g
            r0.frontid = r1
            int r1 = r9.f298545o
            r0.zoneid = r1
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2
            r2 = 1
            r3 = 0
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ NullPointerException -> 0x004f }
            java.lang.String r5 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ NullPointerException -> 0x004f }
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch:{ NullPointerException -> 0x004f }
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch:{ NullPointerException -> 0x004f }
            if (r4 != 0) goto L_0x0031
        L_0x0030:
            goto L_0x005f
        L_0x0031:
            int r5 = r4.getType()     // Catch:{ NullPointerException -> 0x004f }
            r6 = 3
            if (r5 != r2) goto L_0x0039
            goto L_0x0060
        L_0x0039:
            int r5 = r4.getSubtype()     // Catch:{ NullPointerException -> 0x004f }
            if (r5 != r2) goto L_0x0040
            goto L_0x0030
        L_0x0040:
            int r5 = r4.getSubtype()     // Catch:{ NullPointerException -> 0x004f }
            if (r5 != r1) goto L_0x0047
            goto L_0x0030
        L_0x0047:
            int r4 = r4.getSubtype()     // Catch:{ NullPointerException -> 0x004f }
            if (r4 < r6) goto L_0x005f
            r6 = 2
            goto L_0x0060
        L_0x004f:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)
            r5[r3] = r4
            java.lang.String r4 = "MicroMsg.CdnUtil"
            java.lang.String r6 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r6, r5)
        L_0x005f:
            r6 = 1
        L_0x0060:
            r0.nettype = r6
            te3.qv3 r4 = r9.f298544n
            byte[] r4 = sf0.C48374j0.m53715d(r4)
            r0.authkey = r4
            int r4 = r9.f298541h
            java.lang.String r5 = "MicroMsg.CdnTransportEngine"
            if (r4 < r1) goto L_0x0099
            java.util.LinkedList<te3.rv3> r4 = r9.f298542i
            java.lang.Object r4 = r4.get(r3)
            te3.rv3 r4 = (te3.C51163rv3) r4
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            r0.frontip1 = r4
            java.util.LinkedList<te3.rv3> r4 = r9.f298542i
            java.lang.Object r4 = r4.get(r2)
            te3.rv3 r4 = (te3.C51163rv3) r4
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            r0.frontip2 = r4
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = r0.frontip1
            r6[r3] = r7
            r6[r2] = r4
            java.lang.String r4 = "frontip %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r6)
        L_0x0099:
            int r4 = r9.f298546p
            if (r4 < r1) goto L_0x00c9
            java.util.LinkedList<te3.rv3> r4 = r9.f298547q
            java.lang.Object r4 = r4.get(r3)
            te3.rv3 r4 = (te3.C51163rv3) r4
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            r0.zoneip1 = r4
            java.util.LinkedList<te3.rv3> r4 = r9.f298547q
            java.lang.Object r4 = r4.get(r2)
            te3.rv3 r4 = (te3.C51163rv3) r4
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            r0.zoneip2 = r4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r0.frontip1
            r1[r3] = r4
            java.lang.String r4 = r0.frontip2
            r1[r2] = r4
            java.lang.String r2 = "zoneip %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
        L_0x00c9:
            int r1 = r9.f298550t
            if (r1 <= 0) goto L_0x00f9
            java.util.LinkedList<te3.km> r1 = r9.f298548r
            java.lang.Object r1 = r1.get(r3)
            te3.km r1 = (te3.C50148km) r1
            int r1 = r1.f136882d
            int[] r2 = new int[r1]
            r0.frontports = r2
            r2 = 0
        L_0x00dc:
            if (r2 >= r1) goto L_0x00f9
            int[] r4 = r0.frontports
            java.util.LinkedList<te3.km> r5 = r9.f298548r
            java.lang.Object r5 = r5.get(r3)
            te3.km r5 = (te3.C50148km) r5
            java.util.LinkedList<java.lang.Integer> r5 = r5.f136883e
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4[r2] = r5
            int r2 = r2 + 1
            goto L_0x00dc
        L_0x00f9:
            int r1 = r9.f298551u
            if (r1 <= 0) goto L_0x0129
            java.util.LinkedList<te3.km> r1 = r9.f298549s
            java.lang.Object r1 = r1.get(r3)
            te3.km r1 = (te3.C50148km) r1
            int r1 = r1.f136882d
            int[] r2 = new int[r1]
            r0.zoneports = r2
            r2 = 0
        L_0x010c:
            if (r2 >= r1) goto L_0x0129
            int[] r4 = r0.zoneports
            java.util.LinkedList<te3.km> r5 = r9.f298549s
            java.lang.Object r5 = r5.get(r3)
            te3.km r5 = (te3.C50148km) r5
            java.util.LinkedList<java.lang.Integer> r5 = r5.f136883e
            java.lang.Object r5 = r5.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4[r2] = r5
            int r2 = r2 + 1
            goto L_0x010c
        L_0x0129:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92796u.mo127053v(te3.jm):com.tencent.mars.cdn.CdnLogic$CdnInfo");
    }

    public void keep_onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        C101211h.C101212a aVar;
        C101211h.C101212a aVar2;
        Log.m105925i("MicroMsg.CdnTransportEngine", "onMoovReady filekey:%s off:%d len:%d flag:%s videoFormat:%d oriVideoFormat:%d", str, Long.valueOf(j), Long.valueOf(j2), videoInfo.svrFlag, Integer.valueOf(videoInfo.videoFormat), Integer.valueOf(videoInfo.oriVideoFormat));
        C101211h.C101212a aVar3 = this.f267125r;
        int d = aVar3 != null ? aVar3.mo17777d(str, (int) j, (int) j2, videoInfo) : 0;
        if (d == 0 && (aVar2 = this.f267126s) != null) {
            d = aVar2.mo17777d(str, (int) j, (int) j2, videoInfo);
        }
        if (d == 0 && (aVar = this.f267127t) != null) {
            d = aVar.mo17777d(str, (int) j, (int) j2, videoInfo);
        }
        if (d == 0) {
            Log.m105921e("MicroMsg.CdnTransportEngine", "cdn call on moov ready but onlineVideoCallback is null.hash[%d]", Integer.valueOf(hashCode()));
            C117407d.INSTANCE.mo182088q(C82855e.CTRL_INDEX, 29);
        }
    }
}
