package com.tencent.mars.cdn;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.security.InvalidParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import p206nj.C88956h;

public class CdnLogic {
    public static final int HIT_FILEID = 1;
    public static final int HIT_NEWMD5 = 4;
    public static final int HIT_UPLOADCHECKMD5 = 2;
    public static final int HIT_UPLOADWITHMD5 = 3;
    public static final int HIT_VIDEODROPRATE = 5;
    public static final int ImageFormat_HEVC = 2;
    public static final int ImageFormat_JPEG = 1;
    public static final int MediaTypeAppImage = 20301;
    public static final int MediaTypeFriendsADImageThumb = 20204;
    public static final int MediaTypeFriendsImageThumb = 20205;
    public static final int MediaTypeFriendsVideoThumbImage = 20250;
    public static final int MediaType_ChatVoice = 15;
    public static final int MediaType_F2F_VOICE_RESOURCE = 101;
    public static final int MediaType_FAVORITE_FILE = 10001;
    public static final int MediaType_FAVORITE_VIDEO = 10002;
    public static final int MediaType_FILE = 5;
    public static final int MediaType_FRIENDS = 20201;
    public static final int MediaType_FRIENDS_Video = 20202;
    public static final int MediaType_FULLSIZEIMAGE = 1;
    public static final int MediaType_GlanceVideo = 90;
    public static final int MediaType_IMAGE = 2;
    public static final int MediaType_SnsAdLangdingPageVideo = 100;
    public static final int MediaType_THUMBIMAGE = 3;
    public static final int MediaType_TinyVideo = 6;
    public static final int MediaType_VIDEO = 4;
    public static final int MediaType_WIMDownload = 19;
    public static final int NO_ERROR = 0;
    public static final int NO_HITCACHE = 0;
    public static final int PreloadMode = 2;
    public static final int QueryInfoMode = 3;
    public static final int RealTimeMode = 4;
    public static final int StorageMode = 0;
    private static final String TAG = "mars.CdnLogic";
    public static final int VideoFormat_Unknown = 0;
    public static final int VideoFormat_X264 = 1;
    public static final int VideoFormat_X265 = 2;
    public static final int VideoFormat_X266 = 3;
    public static final int VideoPlayMode = 1;
    public static final String defaultApprovedVideoHosts = "vweixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com";
    public static final int kAppTypeAdImage = 109;
    public static final int kAppTypeAdVideo = 105;
    public static final int kAppTypeAny = 0;
    public static final int kAppTypeC2C = 1;
    public static final int kAppTypeC2CGroupChat = 2;
    public static final int kAppTypeEmoji = 110;
    public static final int kAppTypeFavorite = 10;
    public static final int kAppTypeFestivalImage = 257;
    public static final int kAppTypeFestivalVideo = 258;
    public static final int kAppTypeFinderVideo = 251;
    public static final int kAppTypeHDVideo = 205;
    public static final int kAppTypeHwPage = 200;
    public static final int kAppTypeMultiJpeg = 101;
    public static final int kAppTypeMultiVCodec = 108;
    public static final int kAppTypeMultiWebp = 104;
    public static final int kAppTypeNearEvent = 201;
    public static final int kAppTypeP2021 = 255;
    public static final int kAppTypeRemarkImgAppType = 274;
    public static final int kAppTypeSelfieEmoji = 111;
    public static final int kAppTypeShop = 200;
    public static final int kAppTypeSingleJpeg = 100;
    public static final int kAppTypeSingleVCodec = 107;
    public static final int kAppTypeSingleWebp = 103;
    public static final int kAppTypeUnknown = -1;
    public static final int kAppTypeUserStatus = 256;
    public static final int kAppTypeVideo = 102;
    public static final int kAppTypeVideoThumb = 150;
    public static final int kAppTypeYunStorage = 202;
    public static final int kBizAny = 0;
    public static final int kBizApp = 4;
    public static final int kBizC2C = 1;
    public static final int kBizDC = 5;
    public static final int kBizEWC = -3;
    public static final int kBizFavorite = 2;
    public static final int kBizLanCS = -2;
    public static final int kBizNormalHttp = -1;
    public static final int kBizSns = 3;
    public static final int kBizUnknown = 0;
    public static final int kErrSafeProtoNoAeskey = -21111;
    public static final int kErrUploadHevcIllegal = -5103237;
    public static final int kGroupNoticeCDNAppType = 264;
    public static final int kGroupNoticeCDNFileType = 20303;
    public static final int kIpSource_NewDNS = 1;
    public static final int kIpSource_None = 0;
    public static final int kIpSource_SysDNS = 2;
    public static final int kMediaGamePacket = 30002;
    public static final int kMediaLittleAppPacket = 30001;
    public static final int kMediaTypeAdImage = 20204;
    public static final int kMediaTypeAdVideo = 20210;
    public static final int kMediaTypeAny = 0;
    public static final int kMediaTypeAppFile = 20303;
    public static final int kMediaTypeAppImageStorage = 20304;
    public static final int kMediaTypeAppVideo = 20302;
    public static final int kMediaTypeBackupFile = 20001;
    public static final int kMediaTypeBeatificFile = 10011;
    public static final int kMediaTypeBigFile = 7;
    public static final int kMediaTypeEmojiGIF = 20402;
    public static final int kMediaTypeEmojiNormal = 20401;
    public static final int kMediaTypeEmojiWXAM = 20403;
    public static final int kMediaTypeExposeImage = 11000;
    public static final int kMediaTypeFavoriteBigFile = 10007;
    public static final int kMediaTypeFavoriteFile = 10001;
    public static final int kMediaTypeFavoriteVideo = 10002;
    public static final int kMediaTypeFile = 5;
    public static final int kMediaTypeFriends = 20201;
    public static final int kMediaTypeFriendsVideo = 20202;
    public static final int kMediaTypeFriendsVideoThumbImage = 20250;
    public static final int kMediaTypeFullSizeImage = 1;
    public static final int kMediaTypeHWDevice = 20322;
    public static final int kMediaTypeHWDeviceFile = 20303;
    public static final int kMediaTypeImage = 2;
    public static final int kMediaTypeNearEvent = 20310;
    public static final int kMediaTypeShop = 20301;
    public static final int kMediaTypeSmartHwPage = 20321;
    public static final int kMediaTypeStoryAudio = 40001;
    public static final int kMediaTypeThumbImage = 3;
    public static final int kMediaTypeTinyVideo = 6;
    public static final int kMediaTypeVideo = 4;
    public static final int kMultiImageDownload = 2;
    public static final int kNetTypeDisconnected = -1;
    public static final int kNetTypeMobile = 2;
    public static final int kNetTypeOther = 3;
    public static final int kNetTypeWifi = 1;
    public static final int kSingleImageDownload = 1;
    public static final int kVideoBufferingBegin = 0;
    public static final int kVideoBufferingEnd = 1;

    public static class CdnTaskStateInfo {
        public static final int kCompleted = 104;
        public static final int kNotExits = 103;
        public static final int kPausing = 102;
        public static final int kRunning = 100;
        public static final int kWaiting = 101;
        public long completeSize = 0;
        public long fileTotalSize = 0;
        public int taskState = -100;
    }

    public static class CertificateVerifyPolicy {
        public static final int kIngoreError = 2;
        public static final int kNoVerify = 0;
        public static final int kStrictVerify = 1;
    }

    public static class DownloadBehavior {
        public static final int kUserRequest = 0;
        public static final int kViaClientSync = 3;
        public static final int kViaServerNoQuota = 1;
        public static final int kViaServerQuota = 2;
    }

    public interface DownloadCallback {
        void onC2CDownloadCompleted(String str, C2CDownloadResult c2CDownloadResult);

        void onDownloadProgressChanged(String str, long j, long j2, boolean z);
    }

    public static class DownloadInfo {
        public long beginTickcount = 0;
        public long endTickcount = 0;
        public long recvedBytes = 0;
        public long transforMS = 0;
    }

    public static class GetCdnScene {
        public static final int GET_CDN_AUTH = 1;
        public static final int GET_CDN_CHECK = 4;
        public static final int GET_CDN_DEFAULT = 0;
        public static final int GET_CDN_IGNORE_FETCH_RETRY = 6;
        public static final int GET_CDN_MARS_CACHE_EXPIRED = 9;
        public static final int GET_CDN_MARS_SVR_REQUEST = 8;
        public static final int GET_CDN_MARS_TIMING_FETCH = 7;
        public static final int GET_CDN_NETWORK_CHANGE = 2;
        public static final int GET_CDN_NETWORK_CHANGE_RETRY = 3;
        public static final int GET_CDN_TEST = 5;
        public static final int GET_CDN_USER_ATTRIBUTE_CHANGED = 10;
    }

    public static class PCDNAppID {
        public static final int kFinderVideo = 30001;
        public static final int kGame = 30003;
        public static final int kPatch = 30002;
        public static final int kStoriesVideo = 30004;
    }

    public static class SnsUploadVersion {
        public static final int kVersion100M = 1;
        public static final int kVersion30M = 0;
    }

    public static class SpeedType {
        public static final int stDownload = 2;
        public static final int stUpload = 1;
    }

    public static class VideoFlagPolicy {
        public static final int kVideoFlagAuto = 0;
        public static final int kVideoFlagMustMatch = 1;
    }

    public interface UploadCallback {
        void onC2CUploadCompleted(String str, C2CUploadResult c2CUploadResult);

        void onUploadProgressChanged(String str, long j, long j2);
    }

    public interface AppCallback {
        void onBadNetworkProbed();

        void onTaskTearDown(String str, DownloadTaskProfile downloadTaskProfile, String str2);

        void reportFlow(int i, int i2, int i3, int i4);

        void reportFlowWithTag(String str, int i, long j, long j2, long j3, long j4);

        void requestGetCDN(int i);

        void requestSnsGetCdnDistance(int i, int i2, int i3);

        String[] resolveHost(String str, boolean z, int[] iArr);
    }

    public static class CronetTaskResult {
        public WebPageProfile performance = null;
        public int statusCode = 0;
        public String statusText = "";
        public boolean useHttp2 = false;
        public boolean useQuic = false;
    }

    public static class DownloadTaskProfile {
        public Transfor cdn;
        public Transfor overall;
        public Transfor pcdn;
        public Transfor redirect;
    }

    public static class HostIPHint {
        public HostIpMap[] hostMap;
    }

    public static class HostIpMap {
        public String host;

        /* renamed from: ip */
        public String f235228ip;
        public int port;
    }

    public static class Transfor {
        public int connCostMs = 0;
        public int errCode = 0;
        public int errType = 0;
        public long recvedBytes = 0;
        public int speedKps = 0;
        public int transCostMs = 0;
    }

    public static class TransportProtocol {
        public static final int HTTP = 1;
        public static final int HTTP3 = 4;
        public static final int HTTPS = 2;
        public static final int QUIC = 3;
        public static final int TCP = 0;
    }

    public static class BatchSnsReqImageData {
        public String decryptKey = "";
        public String fileKey = "";
        public String imageCachePath = "";
        public int picIndex = 0;
        public boolean retry = true;
        public int totalFileSize = 0;
        public String url = "";
    }

    public static class C2CDownloadRequest {
        public String aeskey = "";
        public boolean allow_mobile_net_download = false;
        public int apptype = -1;
        public String argInfo = "";
        public String bakup_url = "";
        public BatchSnsReqImageData[] batchSnsReqImageDatas = null;
        public String bigfileSignature = "";
        public int bizid = 0;
        public int certificateVerifyPolicy = 2;
        public int chatType = 0;
        public int concurrentCount = 1;
        public int connectionCount = 1;
        public String customHeader = "";
        public String debugIP = "";
        public int downloadBehavior = 0;
        public int downloadMode = 0;
        public String expectFileMD5 = "";
        public long expectFileSize = 0;
        public int expectImageFormat = 1;
        public String fakeBigfileSignature = "";
        public String fakeBigfileSignatureAeskey = "";
        public String feedId = "";
        public int feedPicCount;
        public String fileKey = "";
        public int fileType = 0;
        public String fileid = "";
        public String hlsVideoFlag = "";
        public String host = "";
        public HostIPHint hostIPHint = null;
        public String httpMethod = "";
        public boolean isAutoStart = false;
        public boolean isColdSnsData = false;
        public boolean isHLSVideo = false;
        public boolean isHotSnsVideo = false;
        public boolean isLargeSVideo = false;
        public boolean isSilentTask = false;
        public boolean isSmallVideo = false;
        public boolean isStorageMode = false;
        public boolean is_resume_task = false;
        public int maxHttpRedirectCount = 5;
        public int maxPCDNConnections = 0;
        public String msgExtra = "";
        public int msgType = 1;
        public String netflowTag = "";
        public int pcdnAppID = 0;
        public long preloadMinSize = 0;
        public int preloadRatio = 30;
        public int queueTimeoutSeconds = 1800;
        public CronetLogic.QuicTaskParams quicTaskParams = null;
        public String referer = "";
        public String requestVideoFlag = "";
        public int requestVideoFormat = 1;
        private String savePath = "";
        public String serialized_verify_headers = "";
        public String signalQuality = "";
        public String snsCipherKey = "";
        public String snsScene = "";
        public String snsVideoStragegy = "";
        private String statePath = "";
        public long taskStartTime = 0;
        public int transforTimeoutSeconds = 600;
        public String url = "";
        public boolean useCronet = false;
        public boolean useMultithread = false;
        public boolean useNewdns = false;
        public int videoflagPolicy = 1;
        public boolean wifiAutoStart = false;

        public C2CDownloadRequest build() {
            int i;
            int i2 = this.bizid;
            if (i2 == 0 || i2 == 0 || (i = this.apptype) == -1 || i == 0) {
                throw new InvalidParameterException("must set bizid,apptype");
            } else if (this.fileKey.isEmpty()) {
                throw new InvalidParameterException("must set filekey");
            } else if (this.url.isEmpty() && this.fileid.isEmpty()) {
                throw new InvalidParameterException("must set url or fileid");
            } else if (!this.fileid.isEmpty() && this.aeskey.length() != 32) {
                throw new InvalidParameterException("aeskey must be 32 bytes");
            } else if (this.aeskey.isEmpty() || this.snsCipherKey.isEmpty()) {
                return this;
            } else {
                throw new InvalidParameterException("one of (aeskey,snsCipherKey) must be empty");
            }
        }

        public C2CDownloadRequest setAeskey(String str) {
            this.aeskey = str;
            return this;
        }

        public C2CDownloadRequest setAllow_mobile_net_download(boolean z) {
            this.allow_mobile_net_download = z;
            return this;
        }

        public C2CDownloadRequest setApptype(int i) {
            this.apptype = i;
            return this;
        }

        public C2CDownloadRequest setArgInfo(String str) {
            this.argInfo = str;
            return this;
        }

        public C2CDownloadRequest setBakup_url(String str) {
            this.bakup_url = str;
            return this;
        }

        public C2CDownloadRequest setBatchSnsReqImageDatas(BatchSnsReqImageData[] batchSnsReqImageDataArr) {
            this.batchSnsReqImageDatas = batchSnsReqImageDataArr;
            return this;
        }

        public C2CDownloadRequest setBigfileSignature(String str) {
            this.bigfileSignature = str;
            return this;
        }

        public C2CDownloadRequest setBizid(int i) {
            this.bizid = i;
            return this;
        }

        public C2CDownloadRequest setCertificateVerifyPolicy(int i) {
            this.certificateVerifyPolicy = i;
            return this;
        }

        public C2CDownloadRequest setChatType(int i) {
            this.chatType = i;
            return this;
        }

        public C2CDownloadRequest setConcurrentCount(int i) {
            this.concurrentCount = i;
            return this;
        }

        public C2CDownloadRequest setCustomHeader(String str) {
            this.customHeader = str;
            return this;
        }

        public C2CDownloadRequest setDebugIP(String str) {
            this.debugIP = str;
            return this;
        }

        public C2CDownloadRequest setDownloadMode(int i) {
            this.downloadMode = i;
            return this;
        }

        public C2CDownloadRequest setExpectFileMD5(String str) {
            this.expectFileMD5 = str;
            return this;
        }

        public C2CDownloadRequest setExpectFileSize(long j) {
            this.expectFileSize = j;
            return this;
        }

        public C2CDownloadRequest setExpectImageFormat(int i) {
            this.expectImageFormat = i;
            return this;
        }

        public C2CDownloadRequest setFakeBigfileSignature(String str) {
            this.fakeBigfileSignature = str;
            return this;
        }

        public C2CDownloadRequest setFakeBigfileSignatureAeskey(String str) {
            this.fakeBigfileSignatureAeskey = str;
            return this;
        }

        public C2CDownloadRequest setFeedId(String str) {
            this.feedId = str;
            return this;
        }

        public C2CDownloadRequest setFeedPicCount(int i) {
            this.feedPicCount = i;
            return this;
        }

        public C2CDownloadRequest setFileKey(String str) {
            this.fileKey = str;
            return this;
        }

        public C2CDownloadRequest setFileType(int i) {
            this.fileType = i;
            return this;
        }

        public C2CDownloadRequest setFileid(String str) {
            this.fileid = str;
            return this;
        }

        public C2CDownloadRequest setHlsVideoFlag(String str) {
            this.hlsVideoFlag = str;
            return this;
        }

        public C2CDownloadRequest setHost(String str) {
            this.host = str;
            return this;
        }

        public C2CDownloadRequest setHostIPHint(HostIPHint hostIPHint2) {
            this.hostIPHint = hostIPHint2;
            return this;
        }

        public C2CDownloadRequest setHttpMethod(String str) {
            this.httpMethod = str;
            return this;
        }

        public C2CDownloadRequest setIsAutoStart(boolean z) {
            this.isAutoStart = z;
            return this;
        }

        public C2CDownloadRequest setIsColdSnsData(boolean z) {
            this.isColdSnsData = z;
            return this;
        }

        public C2CDownloadRequest setIsHLSVideo(boolean z) {
            this.isHLSVideo = z;
            return this;
        }

        public C2CDownloadRequest setIsHotSnsVideo(boolean z) {
            this.isHotSnsVideo = z;
            return this;
        }

        public C2CDownloadRequest setIsLargeSVideo(boolean z) {
            this.isLargeSVideo = z;
            return this;
        }

        public C2CDownloadRequest setIsSilentTask(boolean z) {
            this.isSilentTask = z;
            return this;
        }

        public C2CDownloadRequest setIsSmallVideo(boolean z) {
            this.isSmallVideo = z;
            return this;
        }

        public C2CDownloadRequest setIsStorageMode(boolean z) {
            this.isStorageMode = z;
            return this;
        }

        public C2CDownloadRequest setIs_resume_task(boolean z) {
            this.is_resume_task = z;
            return this;
        }

        public C2CDownloadRequest setMaxHttpRedirectCount(int i) {
            this.maxHttpRedirectCount = i;
            return this;
        }

        public C2CDownloadRequest setMaxPCDNConnections(int i) {
            this.maxPCDNConnections = i;
            return this;
        }

        public C2CDownloadRequest setMsgExtra(String str) {
            this.msgExtra = str;
            return this;
        }

        public C2CDownloadRequest setMsgType(int i) {
            this.msgType = i;
            return this;
        }

        public C2CDownloadRequest setPcdnAppID(int i) {
            this.pcdnAppID = i;
            return this;
        }

        public C2CDownloadRequest setPreloadMinSize(long j) {
            this.preloadMinSize = j;
            return this;
        }

        public C2CDownloadRequest setPreloadRatio(int i) {
            this.preloadRatio = i;
            return this;
        }

        public C2CDownloadRequest setQueueTimeoutSeconds(int i) {
            this.queueTimeoutSeconds = i;
            return this;
        }

        public C2CDownloadRequest setQuicTaskParams(CronetLogic.QuicTaskParams quicTaskParams2) {
            this.quicTaskParams = quicTaskParams2;
            return this;
        }

        public C2CDownloadRequest setReferer(String str) {
            this.referer = str;
            return this;
        }

        public C2CDownloadRequest setRequestVideoFlag(String str) {
            this.requestVideoFlag = str;
            return this;
        }

        public C2CDownloadRequest setRequestVideoFormat(int i) {
            this.requestVideoFormat = i;
            return this;
        }

        public void setSavePath(String str) {
            this.savePath = C86013q1.m106448i(str, false);
        }

        public C2CDownloadRequest setSavePath2(String str) {
            this.savePath = C86013q1.m106448i(str, false);
            return this;
        }

        public C2CDownloadRequest setSerialized_verify_headers(String str) {
            this.serialized_verify_headers = str;
            return this;
        }

        public C2CDownloadRequest setSignalQuality(String str) {
            this.signalQuality = str;
            return this;
        }

        public C2CDownloadRequest setSnsCipherKey(String str) {
            this.snsCipherKey = str;
            return this;
        }

        public C2CDownloadRequest setSnsScene(String str) {
            this.snsScene = str;
            return this;
        }

        public C2CDownloadRequest setSnsVideoStragegy(String str) {
            this.snsVideoStragegy = str;
            return this;
        }

        public void setStatePath(String str) {
            this.statePath = C86013q1.m106448i(str, false);
        }

        public C2CDownloadRequest setStatePath2(String str) {
            this.statePath = C86013q1.m106448i(str, false);
            return this;
        }

        public C2CDownloadRequest setTaskStartTime(long j) {
            this.taskStartTime = j;
            return this;
        }

        public C2CDownloadRequest setTransforTimeoutSeconds(int i) {
            this.transforTimeoutSeconds = i;
            return this;
        }

        public C2CDownloadRequest setUrl(String str) {
            this.url = str;
            return this;
        }

        public C2CDownloadRequest setUseCronet(boolean z) {
            this.useCronet = z;
            return this;
        }

        public C2CDownloadRequest setUseMultithread(boolean z) {
            this.useMultithread = z;
            return this;
        }

        public C2CDownloadRequest setUseNewdns(boolean z) {
            this.useNewdns = z;
            return this;
        }

        public C2CDownloadRequest setVideoflagPolicy(int i) {
            this.videoflagPolicy = i;
            return this;
        }

        public C2CDownloadRequest setWifiAutoStart(boolean z) {
            this.wifiAutoStart = z;
            return this;
        }
    }

    public static class C2CDownloadResult {
        public String argInfo = "";
        public long availableBytes = 0;
        public int averageConnectCost = 0;
        public int averageRequestCost = 0;
        public int averageRequestSize = 0;
        public int averageSpeed = 0;
        public String batchImageFileKey = "";
        public BatchSnsReqImageData[] batchImageNeedRetry = null;
        public String batchPicFeedId = "";
        public int cSeqCheck = 0;
        public String clientIP = "";
        public int connectCostTime = 0;
        public CronetTaskResult cronetTaskResult = null;
        public boolean crossNet = false;
        public long currentFileSize = 0;
        public int delayTime = 0;
        public int detailErrorCode = 0;
        public int detailErrorType = 0;
        public int dnsCostTime = 0;
        public long enQueueTime = 0;
        public long endTime = 0;
        public int errorCode = 0;
        public long fileSize = 0;
        public int fileType = 0;
        public String fileid = "";
        public int firstConnectCost = 0;
        public boolean firstRequestCompleted = false;
        public int firstRequestCost = 0;
        public int firstRequestDownloadSize = 0;
        public int firstRequestSize = 0;
        public boolean fromCronet = false;
        public String httpResponseHeader = "";
        public int httpStatusCode = 0;
        public boolean isResume = false;
        public boolean isSnsImageProtocolAvailable;
        public int lastNetType = -1;
        public int lastSvrPort = 0;
        public boolean moovCompleted = false;
        public int moovCost = 0;
        public int moovFailReason = 0;
        public int moovRequestTimes = 0;
        public int moovSize = 0;
        public int netConnectTimes = 0;
        public String picCachePath = "";
        public int picIndex = -1;
        public int previousCompletedSize = 0;
        public String profile = "";
        public String realUsedURL = "";
        public int receiveCostTime = 0;
        public long recvedBytes = 0;
        public int requestCompletedCount = 0;
        public int requestTimeoutCount = 0;
        public int requestTotalCount = 0;
        public String serverIP = "";
        public VideoInfo snsVideoInfo = null;
        public SNSVideoProfile snsVideoProfile = null;
        public long startTime = 0;
        public int svrFallbackCount = 0;
        public String systemErrorDescribe = "";
        public long taskStartTime = 0;
        public long traceId = 0;
        public String traceMsg = "";
        public String transforMsg = "";
        public int transportProtocol = 0;
        public int transportProtocolError = 0;
        public long tryWritenBytes = 0;
        public boolean usePrivateProtocol = false;
        public String[] usedSvrIps;
        public String videoCdnMsg = "";
        public String videoFlag = "";
        public int videoFormat = 0;
        public int waitResponseCostTime = 0;
        public String xErrorNo = "";
    }

    public static class C2CUploadRequest {
        public int apptype = 0;
        public CheckHitFileInfo[] batchCheckHitFiles;
        public String bigfileSignature = "";
        public int bizid = 0;
        public int chatType = 0;
        public boolean checkExistOnly = false;
        public int concurrentCount = 1;
        public String customHeader = "";
        public String debugIP = "";
        public String emojiExtinfo = "";
        public boolean enableHitCheck = true;
        public String fakeBigfileSignature = "";
        public String fakeBigfileSignatureAeskey = "";
        public byte[] fileBuffer;
        public String fileKey = "";
        private String filePath = "";
        public int fileType = 0;
        public String filemd5 = "";
        public boolean forceNoSafeCdn = false;
        public String forwardAeskey = "";
        public String forwardFileid = "";
        public String host = "";
        public int isLargeSVideo = 0;
        public boolean isSmallVideo = false;
        public boolean isSnsAdVideo = false;
        public boolean isStorageMode = false;
        public String midimgPath = "";
        public String netflowTag = "";
        public int queueTimeoutSeconds = 1800;
        public boolean sendmsgFromCDN = false;
        public String statePath = "";
        private String thumbfilePath = "";
        public byte[] thumbnailBuffer;
        public String toUser = "";
        public int transforTimeoutSeconds = 600;
        public boolean trySafeCdn = false;
        public boolean useMultithread = false;
        public int videoSource = 0;

        public C2CUploadRequest build() {
            int i;
            int i2 = this.bizid;
            if (i2 == 0 || i2 == 0 || (i = this.apptype) == -1 || i == 0) {
                throw new InvalidParameterException("must set marscdnBizType,apptype");
            } else if (!this.fileKey.isEmpty()) {
                if (this.enableHitCheck) {
                    if (this.checkExistOnly && (this.forwardFileid.isEmpty() || this.forwardAeskey.isEmpty())) {
                        throw new InvalidParameterException("checkexist must set forwardFileid,forwardAeskey");
                    } else if (!this.forwardFileid.isEmpty() && this.forwardAeskey.isEmpty()) {
                        throw new InvalidParameterException("forwardFileid not empty but forwardAeskey empty");
                    }
                }
                return this;
            } else {
                throw new InvalidParameterException("must set filekey");
            }
        }

        public C2CUploadRequest setApptype(int i) {
            this.apptype = i;
            return this;
        }

        public C2CUploadRequest setBigfileSignature(String str) {
            this.bigfileSignature = str;
            return this;
        }

        public C2CUploadRequest setBizid(int i) {
            this.bizid = i;
            return this;
        }

        public C2CUploadRequest setChatType(int i) {
            this.chatType = i;
            return this;
        }

        public C2CUploadRequest setCheckExistOnly(boolean z) {
            this.checkExistOnly = z;
            return this;
        }

        public C2CUploadRequest setConcurrentCount(int i) {
            this.concurrentCount = i;
            return this;
        }

        public C2CUploadRequest setCustomHeader(String str) {
            this.customHeader = str;
            return this;
        }

        public C2CUploadRequest setDebugIP(String str) {
            this.debugIP = str;
            return this;
        }

        public C2CUploadRequest setEmojiExtinfo(String str) {
            this.emojiExtinfo = str;
            return this;
        }

        public C2CUploadRequest setEnableHitCheck(boolean z) {
            this.enableHitCheck = z;
            return this;
        }

        public C2CUploadRequest setFakeBigfileSignature(String str) {
            this.fakeBigfileSignature = str;
            return this;
        }

        public C2CUploadRequest setFakeBigfileSignatureAeskey(String str) {
            this.fakeBigfileSignatureAeskey = str;
            return this;
        }

        public C2CUploadRequest setFileBuffer(byte[] bArr) {
            this.fileBuffer = bArr;
            return this;
        }

        public C2CUploadRequest setFileKey(String str) {
            this.fileKey = str;
            return this;
        }

        public C2CUploadRequest setFilePath(String str) {
            String i = C86013q1.m106448i(str, false);
            this.filePath = i;
            if (Util.isNullOrNil(i)) {
                this.filePath = "";
            }
            return this;
        }

        public void setFilePath2(String str) {
            setFilePath(str);
        }

        public C2CUploadRequest setFileType(int i) {
            this.fileType = i;
            return this;
        }

        public C2CUploadRequest setFilemd5(String str) {
            this.filemd5 = str;
            return this;
        }

        public C2CUploadRequest setForceNoSafeCdn(boolean z) {
            this.forceNoSafeCdn = z;
            return this;
        }

        public C2CUploadRequest setForwardAeskey(String str) {
            this.forwardAeskey = str;
            return this;
        }

        public C2CUploadRequest setForwardFileid(String str) {
            this.forwardFileid = str;
            return this;
        }

        public C2CUploadRequest setHost(String str) {
            this.host = str;
            return this;
        }

        public C2CUploadRequest setIsLargeSVideo(int i) {
            this.isLargeSVideo = i;
            return this;
        }

        public C2CUploadRequest setIsSmallVideo(boolean z) {
            this.isSmallVideo = z;
            return this;
        }

        public C2CUploadRequest setIsSnsAdVideo(boolean z) {
            this.isSnsAdVideo = z;
            return this;
        }

        public C2CUploadRequest setIsStorageMode(boolean z) {
            this.isStorageMode = z;
            return this;
        }

        public C2CUploadRequest setMidimgPath(String str) {
            String i = C86013q1.m106448i(str, false);
            this.midimgPath = i;
            if (Util.isNullOrNil(i)) {
                this.midimgPath = "";
            }
            return this;
        }

        public C2CUploadRequest setQueueTimeoutSeconds(int i) {
            this.queueTimeoutSeconds = i;
            return this;
        }

        public C2CUploadRequest setSendmsgFromCDN(boolean z) {
            this.sendmsgFromCDN = z;
            return this;
        }

        public C2CUploadRequest setStatePath(String str) {
            this.statePath = str;
            return this;
        }

        public C2CUploadRequest setThumbfilePath(String str) {
            String i = C86013q1.m106448i(str, false);
            this.thumbfilePath = i;
            if (Util.isNullOrNil(i)) {
                this.thumbfilePath = "";
            }
            return this;
        }

        public C2CUploadRequest setThumbnailBuffer(byte[] bArr) {
            this.thumbnailBuffer = bArr;
            return this;
        }

        public C2CUploadRequest setToUser(String str) {
            this.toUser = str;
            return this;
        }

        public C2CUploadRequest setTransforTimeoutSeconds(int i) {
            this.transforTimeoutSeconds = i;
            return this;
        }

        public C2CUploadRequest setTrySafeCdn(boolean z) {
            this.trySafeCdn = z;
            return this;
        }

        public C2CUploadRequest setUseMultithread(boolean z) {
            this.useMultithread = z;
            return this;
        }

        public C2CUploadRequest setVideoSource(int i) {
            this.videoSource = i;
            return this;
        }
    }

    public static class C2CUploadResult {
        public String aeskey = "";
        public CheckHitFileInfo[] batchCheckHitFiles;
        public String clientIP = "";
        public int connectCostTime = 0;
        public boolean crossNet = false;
        public int delayTime = 0;
        public int detailErrorCode = 0;
        public int detailErrorType = 0;
        public String emojiMD5 = "";
        public int errorCode = 0;
        public boolean existOnSvr = false;
        public int fileCrc32 = 0;
        public long fileSize = 0;
        public String fileUrl = "";
        public String fileid = "";
        public String filemd5 = "";
        public int filetype = 0;
        public int hitCache = 0;
        public boolean isResume = false;
        public boolean isVideoReduced = false;
        public int midfileSize = 0;
        public String mp4identifymd5 = "";
        public int receiveCostTime = 0;
        public boolean sendmsgFromCDN = false;
        public String serverIP = "";
        public byte[] skeyrespbuf = null;
        public String systemErrorDescribe = "";
        public int thumbfileSize = 0;
        public String thumbfileUrl = "";
        public String thumbfilemd5 = "";
        public String touser = "";
        public String transforMsg = "";
        public int transportProtocol = 0;
        public int transportProtocolError = 0;
        public boolean uploadBySafecdn = false;
        public String[] usedSvrIps;
        public String videofileid = "";
        public int waitResponseCostTime = 0;
    }

    public static class CdnInfo {
        public byte[] authkey = null;
        public int frontid = 0;
        public String frontip1 = null;
        public String frontip2 = null;
        public int[] frontports = null;
        public int nettype = 0;
        public int uin = 0;
        public int ver = 0;
        public int zoneid = 0;
        public String zoneip1 = null;
        public String zoneip2 = null;
        public int[] zoneports = null;
    }

    public static class CdnInfoParams {
        public int c2CretryIntervalMs = 0;
        public int c2CrwtimeoutMs = 0;
        public int c2CshowErrorDelayMs = 0;
        public int snsretryIntervalMs = 0;
        public int snsrwtimeoutMs = 0;
        public int snsshowErrorDelayMs = 0;
    }

    public static class CertVerifyResult {
        public byte[][] certificateChain = null;
        public boolean isIssuedByKnownRoot = false;
        public int status = 0;
    }

    public static class CheckHitFileInfo {
        public String fileid;
        public String filemd5;
        public long filesize;
        public int filetype;
        public int hittype;
        public int thumbsize;
    }

    public static class Config {
        public String ApprovedVideoHosts = CdnLogic.defaultApprovedVideoHosts;
        public int EnableSafeCDN = 0;
        public int EnableSnsImageDownload = 0;
        public int EnableSnsStreamDownload = 0;
        public String MiscellaneousExptValues = "";
        public String QuicExptValues = "";

        public String toString() {
            return String.format("safecdn:%d,snsstream:%d,snsimage:%d", new Object[]{Integer.valueOf(this.EnableSafeCDN), Integer.valueOf(this.EnableSnsStreamDownload), Integer.valueOf(this.EnableSnsImageDownload)});
        }
    }

    public static class SNSVideoProfile {
        public int experimentalGroupID = 0;
        public int mode = 0;
        public String strategy;
        public boolean useColdRule = false;
        public int usedProvince = 0;
    }

    public interface SessionCallback {
        byte[] decodeSessionResponseBuf(String str, byte[] bArr);

        byte[] getSessionRequestBuf(String str, byte[] bArr);
    }

    public interface VideoStreamingCallback {
        void onDataAvailable(String str, long j, long j2);

        void onDownloadToEnd(String str, long j, long j2);

        void onM3U8Ready(String str, String str2);

        void onMoovReady(String str, long j, long j2, VideoInfo videoInfo);

        void onMoovReadyWithFlag(String str, long j, long j2, String str2);

        void onPreloadCompletedWithResult(String str, long j, long j2, C2CDownloadResult c2CDownloadResult);
    }

    public static void InitSavePath(String str, AppCallback appCallback, boolean z) {
        setAppCallback(appCallback);
        onCreate(C86013q1.m106448i(str, true), z);
    }

    public static void Initialize(String str, AppCallback appCallback, String str2, String str3, String str4, String str5, boolean z) {
        Log.m105924i(TAG, "init cdnlogic");
        setAppCallback(appCallback);
        onCreate(C86013q1.m106448i(str, true), z);
        setRSAPublicKeyParams(str2, str3, str4);
        setToUserCiper(str5);
    }

    public static void UnInitialize() {
        Log.m105928w(TAG, "uninit cdnlogic");
        setAppCallback((AppCallback) null);
    }

    public static native boolean allowBatchImageDownload();

    public static native int calcFileCrc32(String str);

    public static native String calcFileMD5(String str);

    public static native String calcMP4IdentifyMD5(String str);

    public static native int cancelDownloadTaskWithResult(String str, C2CDownloadResult c2CDownloadResult);

    public static native void cancelTask(String str);

    public static native int cancelUploadTaskWithResult(String str, C2CUploadResult c2CUploadResult);

    public static native String createAeskey();

    public static C2CDownloadRequest createC2CBigfileDownload(String str, String str2, String str3, String str4, String str5, String str6) {
        return new C2CDownloadRequest().setFileKey(str).setFileid(str4).setAeskey(str5).setBizid(1).setApptype(1).setFileType(7).setFakeBigfileSignature(str2).setFakeBigfileSignatureAeskey(str3).setSavePath2(str6).build();
    }

    public static C2CUploadRequest createC2CBigfileUpload(String str, String str2, String str3, String str4) {
        return new C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(7).setFakeBigfileSignature(str2).setFakeBigfileSignatureAeskey(str3).setTrySafeCdn(true).setFilePath(str4).build();
    }

    public static C2CDownloadRequest createC2CDownload(String str, String str2, String str3, int i, String str4) {
        return new C2CDownloadRequest().setFileKey(str).setFileid(str2).setAeskey(str3).setBizid(1).setApptype(1).setFileType(i).setSavePath2(str4).build();
    }

    public static C2CUploadRequest createC2CExistCheck(String str, int i, String str2, String str3) {
        return new C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i).setForwardFileid(str2).setForwardAeskey(str3).setEnableHitCheck(true).setCheckExistOnly(true).build();
    }

    public static C2CUploadRequest createC2CSSUpload(C2CUploadRequest c2CUploadRequest) {
        return c2CUploadRequest.setSendmsgFromCDN(true).build();
    }

    public static C2CUploadRequest createC2CUpload(String str, int i, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i).setFilePath(str2).build();
    }

    public static C2CDownloadRequest createC2CVideoDownload(C2CDownloadRequest c2CDownloadRequest, int i, int i2) {
        return c2CDownloadRequest.setRequestVideoFormat(i).setVideoflagPolicy(i2).build();
    }

    public static C2CDownloadRequest createFavDownload(String str, String str2, String str3, int i, String str4) {
        return new C2CDownloadRequest().setFileKey(str).setFileid(str2).setAeskey(str3).setBizid(2).setApptype(10).setFileType(i).setIsStorageMode(true).setSavePath2(str4).build();
    }

    public static C2CUploadRequest createFavUpload(String str, int i, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(2).setApptype(10).setIsStorageMode(true).setFileType(i).setFilePath(str2).setEnableHitCheck(false).build();
    }

    public static C2CUploadRequest createFinderImageUpload(String str, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(251).setFileType(20304).setFilePath(str2).build();
    }

    public static C2CUploadRequest createFinderVideoUpload(String str, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(251).setFileType(kMediaTypeAppVideo).setFilePath(str2).build();
    }

    public static C2CUploadRequest createFreshC2CUpload(C2CUploadRequest c2CUploadRequest) {
        return c2CUploadRequest.setEnableHitCheck(false).build();
    }

    public static C2CUploadRequest createFriendsImageUpload(String str, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(100).setFileType(20201).setFilePath(str2).build();
    }

    public static C2CUploadRequest createFriendsVideoUpload(String str, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(100).setFileType(20202).setFilePath(str2).build();
    }

    public static C2CDownloadRequest createGroupNoticeDownload(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        C2CDownloadRequest aeskey = createSNSDownload(str, str2, i, i2, str3).setAeskey(str4);
        if (str5 != null) {
            aeskey.setSnsCipherKey(str5);
        }
        return aeskey;
    }

    public static C2CUploadRequest createGroupNoticeUpload(String str, int i, int i2, String str2, String str3) {
        return createSNSUpload(str, i, i2, str2).setForwardAeskey(str3);
    }

    public static C2CDownloadRequest createHLSVideoDownload(C2CDownloadRequest c2CDownloadRequest, String str, int i) {
        return c2CDownloadRequest.setIsHLSVideo(true).setHlsVideoFlag(str).setVideoflagPolicy(i).build();
    }

    public static C2CDownloadRequest createSNSDownload(String str, String str2, int i, int i2, String str3) {
        return new C2CDownloadRequest().setFileKey(str).setUrl(str2).setBizid(3).setApptype(i).setFileType(i2).setSavePath2(str3).build();
    }

    public static C2CUploadRequest createSNSUpload(String str, int i, int i2, String str2) {
        return new C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(i).setFileType(i2).setFilePath(str2).build();
    }

    public static C2CDownloadRequest createSNSVideoDownload(C2CDownloadRequest c2CDownloadRequest, String str, int i) {
        return c2CDownloadRequest.setRequestVideoFlag(str).setVideoflagPolicy(i).build();
    }

    public static native String createUniqueFilekey(String str, String str2);

    public static int doCertificateVerify(String str, byte[][] bArr) {
        Log.m105925i(TAG, "certifivate verify for %s", str);
        try {
            AndroidCertVerifyResult verifyServerCertificates = X509Util.verifyServerCertificates(bArr, "RSA", str);
            Log.m105925i(TAG, "host %s verify result %d, isknownroots %b", str, Integer.valueOf(verifyServerCertificates.getStatus()), Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()));
            return verifyServerCertificates.getStatus();
        } catch (KeyStoreException e) {
            Log.m105920e(TAG, e.getLocalizedMessage());
            return -1;
        } catch (NoSuchAlgorithmException e2) {
            Log.m105920e(TAG, e2.getLocalizedMessage());
            return -1;
        } catch (IllegalArgumentException e3) {
            Log.m105920e(TAG, e3.getLocalizedMessage());
            return -1;
        } catch (Exception e4) {
            Log.m105920e(TAG, e4.getLocalizedMessage());
            return -1;
        }
    }

    public static CertVerifyResult doCertificateVerifyWithDetail(String str, byte[][] bArr) {
        Log.m105925i(TAG, "certifivate verify for %s", str);
        try {
            AndroidCertVerifyResult verifyServerCertificates = X509Util.verifyServerCertificates(bArr, "RSA", str);
            CertVerifyResult certVerifyResult = new CertVerifyResult();
            certVerifyResult.status = verifyServerCertificates.getStatus();
            certVerifyResult.isIssuedByKnownRoot = verifyServerCertificates.isIssuedByKnownRoot();
            certVerifyResult.certificateChain = verifyServerCertificates.getCertificateChainEncoded();
            verifyServerCertificates.getCertificateChainEncoded();
            Log.m105925i(TAG, "host %s verify result %d, isknownroots %b", str, Integer.valueOf(verifyServerCertificates.getStatus()), Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()));
            return certVerifyResult;
        } catch (KeyStoreException e) {
            Log.m105920e(TAG, e.getLocalizedMessage());
            CertVerifyResult certVerifyResult2 = new CertVerifyResult();
            certVerifyResult2.status = -1;
            return certVerifyResult2;
        } catch (NoSuchAlgorithmException e2) {
            Log.m105920e(TAG, e2.getLocalizedMessage());
            CertVerifyResult certVerifyResult3 = new CertVerifyResult();
            certVerifyResult3.status = -1;
            return certVerifyResult3;
        } catch (IllegalArgumentException e3) {
            Log.m105920e(TAG, e3.getLocalizedMessage());
            CertVerifyResult certVerifyResult4 = new CertVerifyResult();
            certVerifyResult4.status = -1;
            return certVerifyResult4;
        } catch (Exception e4) {
            Log.m105920e(TAG, e4.getLocalizedMessage());
            CertVerifyResult certVerifyResult5 = new CertVerifyResult();
            certVerifyResult5.status = -1;
            return certVerifyResult5;
        }
    }

    private static native ArrayList<String> getLoadLibraries();

    public static native int getRecentAverageSpeed(int i);

    public static native int getRecentAverageSpeed2(int i, int i2);

    public static native DownloadInfo getRecentDownloadInfo(int i, int i2, int i3);

    public static native boolean getSnsImagePrivateProtocolAvalible();

    public static String getSystemProperty(String str) {
        return System.getProperty(str);
    }

    public static native int getTaskRecentAverageSpeed(String str, int i, int i2);

    public static int getUSBState() {
        Intent registerReceiver = MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        try {
            return registerReceiver.getIntExtra("plugged", 0);
        } catch (Exception e) {
            Log.m105921e(TAG, "err:%s", e.getMessage());
            return -1;
        }
    }

    public static native CdnTaskStateInfo httpMultiSocketDownloadTaskState(String str);

    public static int isFileReady(String str) {
        if (!new C86009m1(str).mo119967g()) {
            return -1;
        }
        String c = C88956h.m111062c();
        Log.m105924i(TAG, "checkFileProperty sdcard state " + c);
        int uSBState = getUSBState();
        if (2 == uSBState) {
            Log.m105924i(TAG, "checkFileProperty usb is connecting PC");
        }
        return uSBState;
    }

    public static native boolean isVideoDataAvailable(String str, long j, long j2);

    public static C2CDownloadRequest makeVideoPreload(C2CDownloadRequest c2CDownloadRequest, int i, long j) {
        return c2CDownloadRequest.setPreloadRatio(i).setPreloadMinSize(j).setDownloadMode(2).build();
    }

    public static C2CDownloadRequest makeVideoStreaming(C2CDownloadRequest c2CDownloadRequest) {
        return c2CDownloadRequest.setDownloadMode(1).build();
    }

    public static native void markVideoBufferingStatus(String str, int i);

    private static native void onCreate(String str, boolean z);

    public static native int pauseHttpMultiSocketDownloadTask(String str);

    public static native long[] queryAvailableQuota();

    public static native int queryContinuousSize(String str, long j, long[] jArr);

    public static native int queryDownloadedSize(String str, long[] jArr);

    public static native long queryFilesizeLimit(int i, int i2);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r6 = r6.f348991a.mo119944p(r6.f348992b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long queryFreeSpace(java.lang.String r6) {
        /*
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r6)
            boolean r6 = r0.mo119977o()
            if (r6 != 0) goto L_0x000f
            com.tencent.mm.vfs.m1 r0 = r0.mo119974l()
        L_0x000f:
            com.tencent.mm.vfs.f0$h r6 = r0.mo119989z()
            boolean r1 = r6.mo177810a()
            r2 = 0
            if (r1 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            com.tencent.mm.vfs.FileSystem$c r1 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            com.tencent.mm.vfs.FileSystem$a r6 = r1.mo119944p(r6)
            if (r6 != 0) goto L_0x0028
        L_0x0026:
            r4 = r2
            goto L_0x002a
        L_0x0028:
            long r4 = r6.f348761c
        L_0x002a:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            return r4
        L_0x002f:
            com.tencent.mm.vfs.m1 r0 = r0.mo119974l()
            if (r0 != 0) goto L_0x000f
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.CdnLogic.queryFreeSpace(java.lang.String):long");
    }

    public static native String queryM3U8Data(String str);

    public static native boolean queryVideoMoovInfo(C2CDownloadRequest c2CDownloadRequest, long[] jArr);

    public static native int requestVideoData(String str, long j, long j2, int i);

    public static native int resumeHttpMultiSocketDownloadTask(String str);

    private static native void setAppCallback(AppCallback appCallback);

    public static native void setCdnInfo(byte[] bArr, byte[] bArr2);

    public static native void setCdnInfoParams(CdnInfoParams cdnInfoParams, CdnInfoParams cdnInfoParams2, int i);

    public static native void setConfig(Config config);

    public static native void setDebugIP(String str);

    public static native void setDownloadQuota(long j, long j2);

    public static native void setFlowLimitPerHour(int i);

    public static native void setFlowReportParams(String str, long j, int i);

    public static native void setLegacyCdnInfo(CdnInfo cdnInfo, CdnInfo cdnInfo2, CdnInfo cdnInfo3, CdnInfo cdnInfo4, byte[] bArr, byte[] bArr2);

    private static native void setRSAPublicKeyParams(String str, String str2, String str3);

    public static native void setSnsDistanceData(int i, int i2, int i3, byte[] bArr);

    public static native void setSnsImagePrivateProtocolAvalible(boolean z);

    public static native void setSnsImageStreamProtocolAvalible(boolean z);

    private static native void setToUserCiper(String str);

    public static native void setUseIPv6Cdn(boolean z);

    public static native void setVcodec1Limit(int i);

    public static native int startBatchCheckHitUpload(C2CUploadRequest c2CUploadRequest, UploadCallback uploadCallback);

    public static native int startC2CDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startC2CUpload(C2CUploadRequest c2CUploadRequest, UploadCallback uploadCallback);

    public static native int startCronetFileDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startCronetSimpleRequest(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startFtnUpload(C2CUploadRequest c2CUploadRequest, UploadCallback uploadCallback);

    public static native int startHttpMultiSocketDownloadTask(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startHttpVideoStreamingDownload(C2CDownloadRequest c2CDownloadRequest, VideoStreamingCallback videoStreamingCallback, DownloadCallback downloadCallback, int i);

    public static native int startHttpsDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startSNSDownload(C2CDownloadRequest c2CDownloadRequest, VideoStreamingCallback videoStreamingCallback, DownloadCallback downloadCallback, int i);

    public static native int startSSUpload(C2CUploadRequest c2CUploadRequest, SessionCallback sessionCallback, UploadCallback uploadCallback);

    public static native int startURLDownload(C2CDownloadRequest c2CDownloadRequest, DownloadCallback downloadCallback);

    public static native int startVideoStreamingDownload(C2CDownloadRequest c2CDownloadRequest, VideoStreamingCallback videoStreamingCallback, DownloadCallback downloadCallback, int i);

    public static native boolean taskExist(String str);

    public static native void triggerPreConnect(String str, String[] strArr, boolean z);

    public static native void updateVideoPlaybackTimetick(String str, double d);

    public static C2CDownloadRequest withAesEcbDecrypt(C2CDownloadRequest c2CDownloadRequest, String str) {
        return c2CDownloadRequest.setAeskey(str).build();
    }

    public static C2CUploadRequest withAeskey(C2CUploadRequest c2CUploadRequest, String str) {
        return c2CUploadRequest.setForwardAeskey(str).build();
    }

    public static C2CDownloadRequest withXorDecrypt(C2CDownloadRequest c2CDownloadRequest, String str) {
        return c2CDownloadRequest.setSnsCipherKey(str).build();
    }

    public C2CUploadRequest withDebugIP(C2CUploadRequest c2CUploadRequest, String str) {
        return c2CUploadRequest.setDebugIP(str).build();
    }

    public C2CUploadRequest withTimeout(C2CUploadRequest c2CUploadRequest, int i) {
        return c2CUploadRequest.setTransforTimeoutSeconds(i).build();
    }

    public static class WebPageProfile implements Parcelable {
        public static final Parcelable.Creator<WebPageProfile> CREATOR = new Parcelable.Creator<WebPageProfile>() {
            public WebPageProfile createFromParcel(Parcel parcel) {
                return new WebPageProfile(parcel);
            }

            public WebPageProfile[] newArray(int i) {
                return new WebPageProfile[i];
            }
        };
        public long SSLconnectionEnd;
        public long SSLconnectionStart;
        public long connectEnd;
        public long connectStart;
        public long domainLookUpEnd;
        public long domainLookUpStart;
        public int downstreamThroughputKbpsEstimate;
        public long fetchStart;
        public int httpRttEstimate;
        public int networkTypeEstimate;
        public String peerIP = "";
        public int port;
        public String protocol = "";
        public long receivedBytedCount;
        public long redirectEnd;
        public long redirectStart;
        public long requestEnd;
        public long requestStart;
        public long responseEnd;
        public long responseStart;
        public int rtt;
        public long sendBytesCount;
        public boolean socketReused;
        public int statusCode;
        public int throughputKbps;
        public int transportRttEstimate;

        public WebPageProfile() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "WebPageProfile{redirectStart=" + this.redirectStart + ", redirectEnd=" + this.redirectEnd + ", fetchStart=" + this.fetchStart + ", domainLookUpStart=" + this.domainLookUpStart + ", domainLookUpEnd=" + this.domainLookUpEnd + ", connectStart=" + this.connectStart + ", connectEnd=" + this.connectEnd + ", SSLconnectionStart=" + this.SSLconnectionStart + ", SSLconnectionEnd=" + this.SSLconnectionEnd + ", requestStart=" + this.requestStart + ", requestEnd=" + this.requestEnd + ", responseStart=" + this.responseStart + ", responseEnd=" + this.responseEnd + ", protocol='" + this.protocol + '\'' + ", rtt=" + this.rtt + ", statusCode=" + this.statusCode + ", networkTypeEstimate=" + this.networkTypeEstimate + ", httpRttEstimate=" + this.httpRttEstimate + ", transportRttEstimate=" + this.transportRttEstimate + ", downstreamThroughputKbpsEstimate=" + this.downstreamThroughputKbpsEstimate + ", throughputKbps=" + this.throughputKbps + ", peerIP='" + this.peerIP + '\'' + ", port=" + this.port + ", socketReused=" + this.socketReused + ", sendBytesCount=" + this.sendBytesCount + ", receivedBytedCount=" + this.receivedBytedCount + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.redirectStart);
            parcel.writeLong(this.redirectEnd);
            parcel.writeLong(this.fetchStart);
            parcel.writeLong(this.domainLookUpStart);
            parcel.writeLong(this.domainLookUpEnd);
            parcel.writeLong(this.connectStart);
            parcel.writeLong(this.connectEnd);
            parcel.writeLong(this.SSLconnectionStart);
            parcel.writeLong(this.SSLconnectionEnd);
            parcel.writeLong(this.requestStart);
            parcel.writeLong(this.requestEnd);
            parcel.writeLong(this.responseStart);
            parcel.writeLong(this.responseEnd);
            parcel.writeString(this.protocol);
            parcel.writeInt(this.rtt);
            parcel.writeInt(this.statusCode);
            parcel.writeInt(this.networkTypeEstimate);
            parcel.writeInt(this.httpRttEstimate);
            parcel.writeInt(this.transportRttEstimate);
            parcel.writeInt(this.downstreamThroughputKbpsEstimate);
            parcel.writeInt(this.throughputKbps);
            parcel.writeString(this.peerIP);
            parcel.writeInt(this.port);
            parcel.writeByte(this.socketReused ? (byte) 1 : 0);
            parcel.writeLong(this.sendBytesCount);
            parcel.writeLong(this.receivedBytedCount);
        }

        public WebPageProfile(Parcel parcel) {
            this.redirectStart = parcel.readLong();
            this.redirectEnd = parcel.readLong();
            this.fetchStart = parcel.readLong();
            this.domainLookUpStart = parcel.readLong();
            this.domainLookUpEnd = parcel.readLong();
            this.connectStart = parcel.readLong();
            this.connectEnd = parcel.readLong();
            this.SSLconnectionStart = parcel.readLong();
            this.SSLconnectionEnd = parcel.readLong();
            this.requestStart = parcel.readLong();
            this.requestEnd = parcel.readLong();
            this.responseStart = parcel.readLong();
            this.responseEnd = parcel.readLong();
            this.protocol = parcel.readString();
            this.rtt = parcel.readInt();
            this.statusCode = parcel.readInt();
            this.networkTypeEstimate = parcel.readInt();
            this.httpRttEstimate = parcel.readInt();
            this.transportRttEstimate = parcel.readInt();
            this.downstreamThroughputKbpsEstimate = parcel.readInt();
            this.throughputKbps = parcel.readInt();
            this.peerIP = parcel.readString();
            this.port = parcel.readInt();
            this.socketReused = parcel.readByte() != 0;
            this.sendBytesCount = parcel.readLong();
            this.receivedBytedCount = parcel.readLong();
        }
    }

    public static class VideoInfo implements Parcelable {
        public static final Parcelable.Creator<VideoInfo> CREATOR = new Parcelable.Creator<VideoInfo>() {
            public VideoInfo createFromParcel(Parcel parcel) {
                return new VideoInfo(parcel);
            }

            public VideoInfo[] newArray(int i) {
                return new VideoInfo[i];
            }
        };
        public int oriVideoFormat = 0;
        public String requestFlag = "";
        public String svrFlag = "";
        public int videoFormat = 0;
        public String videoPath = "";

        public VideoInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void readFromParcel(Parcel parcel) {
            this.requestFlag = parcel.readString();
            this.svrFlag = parcel.readString();
            this.videoFormat = parcel.readInt();
            this.oriVideoFormat = parcel.readInt();
            this.videoPath = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.requestFlag);
            parcel.writeString(this.svrFlag);
            parcel.writeInt(this.videoFormat);
            parcel.writeInt(this.oriVideoFormat);
            parcel.writeString(this.videoPath);
        }

        public VideoInfo(Parcel parcel) {
            this.requestFlag = parcel.readString();
            this.svrFlag = parcel.readString();
            this.videoFormat = parcel.readInt();
            this.oriVideoFormat = parcel.readInt();
            this.videoPath = parcel.readString();
        }
    }

    public static C2CUploadRequest createC2CUpload(String str, int i, String str2, String str3) {
        return new C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i).setFilePath(str2).setThumbfilePath(str3).build();
    }

    public static C2CUploadRequest createC2CUpload(String str, int i, String str2, String str3, String str4) {
        return new C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i).setFilePath(str2).setMidimgPath(str3).setThumbfilePath(str4).build();
    }

    public static C2CUploadRequest createC2CUpload(C2CUploadRequest c2CUploadRequest, String str, String str2) {
        return c2CUploadRequest.setForwardFileid(str).setForwardAeskey(str2).setEnableHitCheck(true).build();
    }
}
