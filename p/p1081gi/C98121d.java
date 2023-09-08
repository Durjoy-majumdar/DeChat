package p1081gi;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: gi.d */
public class C98121d {

    /* renamed from: p */
    public static final char[] f287608p = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public String f287609a;

    /* renamed from: b */
    public String f287610b = "";

    /* renamed from: c */
    public int f287611c = 0;

    /* renamed from: d */
    public String f287612d;

    /* renamed from: e */
    public int f287613e = 0;

    /* renamed from: f */
    public int f287614f = -1;
    public int field_UploadHitCacheType = 0;
    public String field_aesKey;
    public String field_arg;
    public String field_argInfo;
    public int field_averageConnectCost = 0;
    public int field_averageRequestCost = 0;
    public int field_averageRequestSize = 0;
    public int field_averageSpeed = 0;
    public int field_cSeqCheck = 0;
    public int field_clientHostIP = 0;
    public String field_clientIP = "";
    public int field_connectCostTime = 0;
    public boolean field_convert2baseline = false;
    public int field_delayTime = 0;
    public int field_detailErrorCode = 0;
    public int field_detailErrorType = 0;
    public int field_dnsCostTime = 0;
    public long field_enQueueTime = 0;
    public long field_endTime = 0;
    public boolean field_exist_whencheck = false;
    public String field_fileId;
    public long field_fileLength;
    public String field_fileUrl = "";
    public int field_filecrc;
    public String field_filemd5 = "";
    public int field_firstConnectCost = 0;
    public boolean field_firstRequestCompleted = false;
    public int field_firstRequestCost = 0;
    public int field_firstRequestDownloadSize = 0;
    public int field_firstRequestSize = 0;
    public String field_httpResponseHeader = "";
    public int field_httpStatusCode = 0;
    public boolean field_isCrossNet = false;
    public boolean field_isResume = false;
    public boolean field_isVideoReduced = false;
    public int field_midimgLength;
    public boolean field_moovCompleted = false;
    public int field_moovCost = 0;
    public int field_moovFailReason = 0;
    public int field_moovRequestTimes = 0;
    public int field_moovSize = 0;
    public String field_mp4identifymd5 = "";
    public boolean field_needSendMsgField = true;
    public int field_netConnectTimes = 0;
    public int field_previousCompletedSize = 0;
    public int field_receiveCostTime = 0;
    public long field_recvedBytes = 0;
    public long field_recvedTotalBytes = 0;
    public int field_requestCompletedCount = 0;
    public int field_requestTimeoutCount = 0;
    public int field_requestTotalCount = 0;
    public int field_retCode;
    public byte[] field_sKeyrespbuf;
    public int field_serverHostIP = 0;
    public String field_serverIP = "";
    public long field_startTime = 0;
    public String field_thumbUrl = "";
    public String field_thumbfilemd5 = "";
    public int field_thumbimgLength;
    public String field_toUser;
    public String field_transInfo;
    public boolean field_upload_by_safecdn;
    public boolean field_usePrivateProtocol = true;
    public String[] field_usedSvrIps;
    public String field_videoCdnMsg = "";
    public String field_videoFileId;
    public String field_videoFlag = "";
    public int field_videoFormat = 0;
    public int field_waitResponseCostTime = 0;
    public String field_xErrorNo = "";

    /* renamed from: g */
    public String f287615g = "";

    /* renamed from: h */
    public int f287616h;

    /* renamed from: i */
    public CdnLogic.BatchSnsReqImageData[] f287617i;

    /* renamed from: j */
    public int f287618j = 0;

    /* renamed from: k */
    public int f287619k = 0;

    /* renamed from: l */
    public long f287620l = 0;

    /* renamed from: m */
    public String f287621m = "";

    /* renamed from: n */
    public CdnLogic.SNSVideoProfile f287622n = null;

    /* renamed from: o */
    public CdnLogic.VideoInfo f287623o = null;

    /* renamed from: a */
    public String mo137408a() {
        if (this.field_usedSvrIps == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String append : this.field_usedSvrIps) {
            stringBuffer.append(append);
            stringBuffer.append("|");
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.field_UploadHitCacheType;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo137409b() {
        /*
            r2 = this;
            boolean r0 = r2.field_upload_by_safecdn
            if (r0 == 0) goto L_0x000e
            r0 = 2
            int r1 = r2.field_UploadHitCacheType
            if (r0 == r1) goto L_0x000c
            r0 = 3
            if (r0 != r1) goto L_0x000e
        L_0x000c:
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1081gi.C98121d.mo137409b():boolean");
    }

    public String toString() {
        String format = String.format("id:%s file:%s filelen:%d midlen:%d thlen:%d transInfo:%s retCode:%d toUser:%s arg:%s videoFileId:%s argInfo:%s hitcache:%d needsend:%b msgid:%d convert2baseline:%b thumbUrl:%s fileUrl:%s filemd5:%s thumbfilemd5:%s,mp4identifymd5:%s, exist_whencheck[%b], aesKey[%s], crc[%s], safecdn:%b field_recvedBytes:%d field_recvedTotalBytes:%d", new Object[]{this.f287609a, this.field_fileId, Long.valueOf(this.field_fileLength), Integer.valueOf(this.field_midimgLength), Integer.valueOf(this.field_thumbimgLength), this.field_transInfo, Integer.valueOf(this.field_retCode), this.field_toUser, this.field_arg, this.field_videoFileId, this.field_argInfo, Integer.valueOf(this.field_UploadHitCacheType), Boolean.valueOf(this.field_needSendMsgField), 0, Boolean.valueOf(this.field_convert2baseline), this.field_thumbUrl, this.field_fileUrl, this.field_filemd5, this.field_thumbfilemd5, this.field_mp4identifymd5, Boolean.valueOf(this.field_exist_whencheck), Util.secPrint(this.field_aesKey), Integer.valueOf(this.field_filecrc), Boolean.valueOf(this.field_upload_by_safecdn), Long.valueOf(this.field_recvedBytes), Long.valueOf(this.field_recvedTotalBytes)});
        if (this.field_sKeyrespbuf == null) {
            return format;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        Object[] objArr = new Object[1];
        byte[] bArr = this.field_sKeyrespbuf;
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & ExifInterface.MARKER;
            int i2 = i * 2;
            char[] cArr2 = f287608p;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        objArr[0] = new String(cArr);
        sb.append(String.format("skeyrespbuf:%s", objArr));
        return sb.toString();
    }
}
