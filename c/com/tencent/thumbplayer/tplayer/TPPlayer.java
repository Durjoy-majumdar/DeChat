package com.tencent.thumbplayer.tplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.ITPPlayerAdapter;
import com.tencent.thumbplayer.adapter.TPPlaybackInfo;
import com.tencent.thumbplayer.adapter.TPPlayerAdapterFactory;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.api.TPSurface;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.common.TPPlayerInfoGetterImpl;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.datatransport.ITPPlayManager;
import com.tencent.thumbplayer.datatransport.TPDataTransportManagerFactory;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader;
import com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.log.TPBaseLogger;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons;
import com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager;
import com.tencent.thumbplayer.tplayer.plugins.TPPluginManager;
import com.tencent.thumbplayer.tplayer.plugins.report.TPLogPlugin;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportNonImplPlugin;
import com.tencent.thumbplayer.tplayer.reportv2.TPReportController;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPHashMapBuilder;
import com.tencent.thumbplayer.utils.TPOptionalParamObjectChecker;
import com.tencent.thumbplayer.utils.TPThreadAnnotations;
import com.tencent.thumbplayer.utils.TPThreadPool;
import com.tencent.thumbplayer.utils.TPUrlAnalyzer;
import com.tencent.xweb.IXWebBroadcastListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class TPPlayer implements ITPPlayer {
    private static String LOG_API_CALL_PREFIX = "api call:";
    private static final int MSG_INDEX = 256;
    private static final int MSG_ON_AUDIOPCMOUT = 267;
    private static final int MSG_ON_COMPLETION = 260;
    private static final int MSG_ON_ERROR = 262;
    private static final int MSG_ON_INFO = 261;
    private static final int MSG_ON_PLAYER_STATE_CHANGE = 277;
    private static final int MSG_ON_PLAY_FLOW_EVENT = 1256;
    private static final int MSG_ON_PREPARED = 257;
    private static final int MSG_ON_PROXY_ABTEST_INFO = 281;
    private static final int MSG_ON_PROXY_ALL_DOWNLOAD_FINISH = 271;
    private static final int MSG_ON_PROXY_CDN_URL_EXPIRED = 275;
    private static final int MSG_ON_PROXY_DOWN_LOAD_STATUS_UPDATE = 272;
    private static final int MSG_ON_PROXY_NO_MORE_DATA = 276;
    private static final int MSG_ON_PROXY_PLAYERROR = 268;
    private static final int MSG_ON_PROXY_PLAY_CDN_INFO_UPDATE = 270;
    private static final int MSG_ON_PROXY_PLAY_CDN_URL_UPDATE = 269;
    private static final int MSG_ON_PROXY_PROGRESS_UPDATE = 274;
    private static final int MSG_ON_PROXY_PROTOCOL_UPDATE = 273;
    private static final int MSG_ON_PROXY_SWITCH_DEFINITION = 278;
    private static final int MSG_ON_RPOXY_DETECTED_MULTI_NETWORK_CARD_AND_LOW_SPEED = 283;
    private static final int MSG_ON_RPOXY_M3U8_REFRESH = 282;
    private static final int MSG_ON_RPOXY_MULTI_NETWORK_CARD_STATUS_CHANGE = 284;
    private static final int MSG_ON_SEEK_COMPLETE = 263;
    private static final int MSG_ON_STOP_ASYNC_COMPLETE = 280;
    private static final int MSG_ON_SUBTITLE_DATA = 265;
    private static final int MSG_ON_SUBTITLE_FRAME_BUFFER = 279;
    private static final int MSG_ON_VIDEOFRAMEOUT = 266;
    private static final int MSG_ON_VIDEO_SIZE_CHANGE = 264;
    private static final String TAG = "TPPlayer";
    private static final SparseIntArray mOnInfoMsgTypeToOnDetailMsgType;
    private static AtomicInteger sLifeCycleId = new AtomicInteger(1000);
    /* access modifiers changed from: private */
    public ITPAssetResourceLoader mAssetResourceLoader;
    /* access modifiers changed from: private */
    public long mCurrentDownloadSizeByte;
    /* access modifiers changed from: private */
    public long mDownloadPlayableDurationMs;
    /* access modifiers changed from: private */
    public boolean mEnableSuggestedBitrateCallback;
    private HandlerThread mHandlerThread;
    /* access modifiers changed from: private */
    public TPBaseLogger mLogger;
    /* access modifiers changed from: private */
    public final ITPPlayManager mPlayProxyManager;
    private AtomicInteger mPlayTaskId;
    /* access modifiers changed from: private */
    public final ITPPlayerAdapter mPlayerAdapter;
    /* access modifiers changed from: private */
    public TPPlayerListeners mPlayerListeners;
    /* access modifiers changed from: private */
    public int mProxyStatus;
    private TPReportController mReportController;
    private TPReportManager mReportManager;
    private TPReportNonImplPlugin mReportNonImplPlugin;
    private int mSkipEndTimeMs;
    private int mStartTimeMs;
    private TPContext mTPContext;
    private ITPPluginManager mTPPluginManager;
    private Looper mThreadLooper;
    /* access modifiers changed from: private */
    public long mTotalFileSizeByte;
    private EventHandler mTransformCallbackHandler;
    private long mUniqueIdCounter;
    private Map<Long, Long> mUniqueIdToOpaqueMap;
    private String mUrl;
    private volatile boolean mUseProxy;
    private boolean mUsingDefaultLogContext;
    private ArrayList<String> proxyTrackUrls;

    public class InnerPlayerListener implements ITPPlayerBaseListener.IOnPreparedListener, ITPPlayerBaseListener.IOnCompletionListener, ITPPlayerBaseListener.IOnInfoListener, ITPPlayerBaseListener.IOnErrorListener, ITPPlayerBaseListener.IOnSeekCompleteListener, ITPPlayerBaseListener.IOnVideoSizeChangedListener, ITPPlayerBaseListener.IOnVideoFrameOutListener, ITPPlayerBaseListener.IOnAudioPcmOutListener, ITPPlayerBaseListener.IOnSubtitleDataListener, ITPPlayerBaseListener.IOnSubtitleFrameOutListener, ITPPlayerBaseListener.IOnVideoProcessOutListener, ITPPlayerBaseListener.IOnAudioProcessOutListener, ITPPlayerBaseListener.IOnStateChangeListener, ITPPlayerBaseListener.IOnDetailInfoListener, ITPPlayerBaseListener.IOnDemuxerListener, ITPPlayListener {
        public InnerPlayerListener() {
        }

        public long getAdvRemainTime() {
            ITPPlayerProxyListener tPPlayerProxyListener = TPPlayer.this.mPlayProxyManager.getTPPlayerProxyListener();
            if (tPPlayerProxyListener != null) {
                return tPPlayerProxyListener.getAdvRemainTimeMs();
            }
            return -1;
        }

        public String getContentType(int i, String str) {
            if (TPPlayer.this.mAssetResourceLoader != null) {
                return TPPlayer.this.mAssetResourceLoader.getContentType(i, str);
            }
            TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return "";
        }

        public int getCurrentPlayClipNo() {
            ITPPlayerAdapter access$100 = TPPlayer.this.mPlayerAdapter;
            if (access$100 != null) {
                return access$100.getCurrentPlayClipNo();
            }
            return 0;
        }

        public long getCurrentPlayOffset() {
            return TPPlayer.this.mPlayerAdapter.getDemuxerOffsetInFile();
        }

        public long getCurrentPosition() {
            return TPPlayer.this.getCurrentPositionMs();
        }

        public String getDataFilePath(int i, String str) {
            if (TPPlayer.this.mAssetResourceLoader != null) {
                return TPPlayer.this.mAssetResourceLoader.getDataFilePath(i, str);
            }
            TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return "";
        }

        public long getDataTotalSize(int i, String str) {
            if (TPPlayer.this.mAssetResourceLoader != null) {
                return TPPlayer.this.mAssetResourceLoader.getDataTotalSize(i, str);
            }
            TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        public Object getPlayInfo(long j) {
            return null;
        }

        public Object getPlayInfo(String str) {
            return null;
        }

        public long getPlayerBufferLength() {
            ITPPlayerAdapter access$100 = TPPlayer.this.mPlayerAdapter;
            if (access$100 != null) {
                return Math.max(access$100.getPlayableDurationMs() - TPPlayer.this.mPlayerAdapter.getCurrentPositionMs(), 0);
            }
            return 0;
        }

        public void onAudioPcmOut(TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                access$1100.onAudioFrameOut(TPPlayer.this, tPAudioFrameBuffer);
            }
        }

        public TPPostProcessFrameBuffer onAudioProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                return access$1100.onAudioProcessFrameOut(TPPlayer.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        public void onCompletion() {
            TPPlayer.this.pushEvent(111, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_REASON, 0).build());
            TPPlayer.this.handlePlayerCallback(260, 0, 0, (Object) null);
        }

        public void onDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo) {
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                access$1100.onDetailInfo(TPPlayer.this, tPPlayerDetailInfo);
            }
        }

        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            TPPlayer.this.mLogger.info("onDownloadCdnUrlExpired");
            TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_PROXY_CDN_URL_EXPIRED, 0, 0, map);
        }

        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            TPBaseLogger access$800 = TPPlayer.this.mLogger;
            access$800.info("onDownloadCdnUrlInfoUpdate, url:" + str + ", cdnIp:" + str2 + ", uip:" + str3 + ", errorCodeStr:" + str4);
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            TPPlayer.this.pushEvent(201, 0, 0, (String) null, new TPHashMapBuilder().put("url", str).put(TPReportKeys.Common.COMMON_CDN_IP, str2).put(TPReportKeys.Common.COMMON_CDN_UIP, str3).build());
            TPPlayer.this.handlePlayerCallback(270, 0, 0, tPCDNURLInfo);
        }

        public void onDownloadCdnUrlUpdate(String str) {
            TPBaseLogger access$800 = TPPlayer.this.mLogger;
            access$800.info("onDownloadCdnUrlUpdate, url:" + str);
            TPPlayer.this.handlePlayerCallback(269, 0, 0, str);
        }

        public void onDownloadError(int i, int i2, String str) {
            TPBaseLogger access$800 = TPPlayer.this.mLogger;
            access$800.info("onDownloadError, moduleID:" + i + ", errorCode:" + i2 + ", extInfo:" + str);
            TPPlayer.this.handleOnError(i, i2);
            TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_PROXY_PLAYERROR, i, i2, str);
        }

        public void onDownloadFinish() {
            TPPlayer.this.mLogger.info("onDownloadFinish");
            TPPlayer.this.handlePlayerCallback(271, 0, 0, 0);
        }

        public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
            TPPlayer.this.mLogger.info("onDownloadProgressUpdate");
            long j3 = (long) i;
            long unused = TPPlayer.this.mDownloadPlayableDurationMs = j3;
            long unused2 = TPPlayer.this.mCurrentDownloadSizeByte = j;
            long unused3 = TPPlayer.this.mTotalFileSizeByte = j2;
            TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = j3;
            tPDownLoadProgressInfo.downloadSpeedKBps = i2;
            tPDownLoadProgressInfo.currentDownloadSize = j;
            tPDownLoadProgressInfo.totalFileSize = j2;
            tPDownLoadProgressInfo.extraInfo = str;
            TPPlayer.this.pushEvent(200, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.Common.COMMON_NETWORK_SPEED, Integer.valueOf(i2)).put(TPReportKeys.LiveExKeys.LIVE_FX_SPANID, str).build());
            TPPlayer.this.handlePlayerCallback(274, 0, 0, tPDownLoadProgressInfo);
        }

        public void onDownloadProtocolUpdate(String str, String str2) {
            TPBaseLogger access$800 = TPPlayer.this.mLogger;
            access$800.info("onDownloadProtocolUpdate, protocol:" + str + ", protocolVer:" + str2);
            TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            TPPlayer.this.pushEvent(202, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.Common.COMMON_PROTO, str).put(TPReportKeys.Common.COMMON_PROTOVER, str2).build());
            TPPlayer.this.handlePlayerCallback(273, 0, 0, tPProtocolInfo);
        }

        public void onDownloadStatusUpdate(int i) {
            if (i != TPPlayer.this.mProxyStatus) {
                TPBaseLogger access$800 = TPPlayer.this.mLogger;
                access$800.info("onDownloadStatusUpdate, status:" + i);
                int unused = TPPlayer.this.mProxyStatus = i;
            }
            TPPlayer.this.handlePlayerCallback(272, i, 0, (Object) null);
        }

        public void onError(int i, int i2, long j, long j2) {
            String playErrorCodeStr = TPPlayer.this.mPlayProxyManager.getPlayErrorCodeStr();
            TPBaseLogger access$800 = TPPlayer.this.mLogger;
            access$800.info("onError playerErrorCodeStr=" + playErrorCodeStr);
            if (!TextUtils.isEmpty(playErrorCodeStr)) {
                try {
                    i2 = Integer.parseInt(playErrorCodeStr);
                    i = 4000;
                } catch (Exception e) {
                    TPPlayer.this.mLogger.printException(e);
                }
            }
            TPPlayer.this.handleOnError(i, i2);
            TPBaseLogger access$8002 = TPPlayer.this.mLogger;
            access$8002.info("onError errorTypeReal=" + i + ", errorCodeReal=" + i2);
            TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new TPThreadSwitchCommons.TPSwitchCommonParams();
            tPSwitchCommonParams.arg1 = j;
            tPSwitchCommonParams.arg2 = j2;
            TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_ERROR, i, i2, tPSwitchCommonParams);
        }

        public void onInfo(int i, long j, long j2, Object obj) {
            TPPlayer.this.handleOnInfo(i, j, j2, obj);
            if (i == 1011) {
                TPPlayer.this.handleSelectAudioTrack(obj);
            } else if (i == 1012) {
                TPPlayer.this.handleAudioTrackProxy(obj);
            } else {
                if (i == 4) {
                    obj = Long.valueOf(TPPlayer.this.getOpaqueFromUniqueId(((Long) obj).longValue(), "async call select track"));
                }
                TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new TPThreadSwitchCommons.TPSwitchCommonParams();
                tPSwitchCommonParams.arg1 = j;
                tPSwitchCommonParams.arg2 = j2;
                tPSwitchCommonParams.extraObject = obj;
                TPPlayer.this.handlePlayerCallback(261, i, 0, tPSwitchCommonParams);
            }
        }

        public Object onPlayCallback(int i, Object obj, Object obj2, Object obj3, Object obj4) {
            if (i == 1) {
                TPPlayer.this.mLogger.info("onDownloadNoMoreData");
                TPPlayer.this.handlePlayerCallback(276, 0, 0, obj);
            } else if (i != 2) {
                switch (i) {
                    case 8:
                        TPBaseLogger access$800 = TPPlayer.this.mLogger;
                        access$800.info("AB test info from download proxy received, key: " + obj + ", value: " + obj2);
                        HashMap hashMap = new HashMap();
                        hashMap.put((String) obj, Integer.valueOf((String) obj2));
                        TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_PROXY_ABTEST_INFO, 0, 0, hashMap);
                        break;
                    case 9:
                        TPPlayer.this.mLogger.info("onDownload Refresh M3U8");
                        TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_RPOXY_M3U8_REFRESH, 0, 0, (Object) null);
                        break;
                    case 10:
                        TPPlayer.this.mLogger.info("onDownload multi network card not open, current low speed");
                        TPPlayer.this.handlePlayerCallback(283, 0, 0, (Object) null);
                        break;
                    case 11:
                        String str = (String) obj;
                        TPBaseLogger access$8002 = TPPlayer.this.mLogger;
                        access$8002.info("onDownload multi network use status change" + str);
                        TPPlayer.this.handlePlayerCallback(284, 0, 0, str);
                        break;
                }
            } else if (!(obj3 instanceof Integer)) {
                TPPlayer.this.mLogger.info("MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION, err ext3.");
            } else {
                Integer num = (Integer) obj3;
                TPBaseLogger access$8003 = TPPlayer.this.mLogger;
                access$8003.info("onDownload suggest bitrate(bps):" + num);
                TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_PROXY_SWITCH_DEFINITION, num.intValue(), 0, (Object) null);
            }
            return null;
        }

        public void onPrepared() {
            int i;
            TPPlayer.this.mPlayProxyManager.setProxyPlayState(0);
            TPPlaybackInfo playbackInfo = TPPlayer.this.mPlayerAdapter.getPlaybackInfo();
            String str = playbackInfo.getWidth() + "*" + playbackInfo.getHeight();
            TPTrackInfo[] trackInfo = TPPlayer.this.mPlayerAdapter.getTrackInfo();
            if (trackInfo != null) {
                i = 0;
                for (TPTrackInfo tPTrackInfo : trackInfo) {
                    if (tPTrackInfo.trackType == 2) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            TPPlayer tPPlayer = TPPlayer.this;
            TPHashMapBuilder put = new TPHashMapBuilder().put(TPReportKeys.Common.COMMON_PLAYER_TYPE, Integer.valueOf(TPPlayer.this.mPlayerAdapter.getPlayerType())).put(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, str).put(TPReportKeys.Common.COMMON_MEDIA_RATE, Long.valueOf(playbackInfo.getVideoBitRate() / 8000)).put("duration", Long.valueOf(playbackInfo.getDurationMs())).put(TPReportKeys.Common.COMMON_MEDIA_FORMAT, playbackInfo.getContainerFormat()).put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis()));
            boolean z = true;
            if (i <= 1) {
                z = false;
            }
            tPPlayer.pushEvent(103, 0, 0, (String) null, put.put(TPReportKeys.VodExKeys.VOD_EX_MULTI_TRACK, Boolean.valueOf(z)).build());
            TPPlayer.this.handlePlayerCallback(257, 0, 0, (Object) null);
        }

        public int onReadData(int i, String str, long j, long j2) {
            if (TPPlayer.this.mAssetResourceLoader != null) {
                return TPPlayer.this.mAssetResourceLoader.onReadData(i, str, j, j2);
            }
            TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        public TPRemoteSdpInfo onSdpExchange(String str, int i) {
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                return access$1100.onSdpExchange(TPPlayer.this, str, i);
            }
            return null;
        }

        public void onSeekComplete() {
            TPPlayer.this.setProxyStatePlayingOrPause();
            TPPlayer.this.pushEvent(110, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, Long.valueOf(TPPlayer.this.getCurrentPositionMs())).build());
            TPPlayer.this.handlePlayerCallback(263, 0, 0, (Object) null);
        }

        public int onStartReadData(int i, String str, long j, long j2) {
            if (TPPlayer.this.mAssetResourceLoader != null) {
                return TPPlayer.this.mAssetResourceLoader.onStartReadData(i, str, j, j2);
            }
            TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        public void onStateChange(int i, int i2) {
            TPPlayer.this.handlePlayerCallback(277, i, i2, (Object) null);
        }

        public int onStopReadData(int i, String str, int i2) {
            if (TPPlayer.this.mAssetResourceLoader != null) {
                return TPPlayer.this.mAssetResourceLoader.onStopReadData(i, str, i2);
            }
            TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        public void onSubtitleData(TPSubtitleData tPSubtitleData) {
            TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_SUBTITLE_DATA, 0, 0, tPSubtitleData);
        }

        public void onSubtitleFrameOut(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            TPPlayer.this.handlePlayerCallback(TPPlayer.MSG_ON_SUBTITLE_FRAME_BUFFER, 0, 0, tPSubtitleFrameBuffer);
        }

        public void onVideoFrameOut(TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                access$1100.onVideoFrameOut(TPPlayer.this, tPVideoFrameBuffer);
            }
        }

        public TPPostProcessFrameBuffer onVideoProcessFrameOut(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                return access$1100.onVideoProcessFrameOut(TPPlayer.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        public void onVideoSizeChanged(long j, long j2) {
            TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new TPThreadSwitchCommons.TPSwitchCommonParams();
            tPSwitchCommonParams.arg1 = j;
            tPSwitchCommonParams.arg2 = j2;
            TPPlayer.this.handlePlayerCallback(264, 0, 0, tPSwitchCommonParams);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        mOnInfoMsgTypeToOnDetailMsgType = sparseIntArray;
        sparseIntArray.put(106, 1005);
        sparseIntArray.put(105, 1006);
    }

    public TPPlayer(Context context) {
        this(context, (Looper) null);
    }

    private long assignUniqueIdForOpaque(long j, String str) {
        this.mUniqueIdToOpaqueMap.put(Long.valueOf(this.mUniqueIdCounter), Long.valueOf(j));
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(str + ", convert opaque(" + j + ") => uniqueId(" + this.mUniqueIdCounter + ")");
        long j2 = this.mUniqueIdCounter;
        this.mUniqueIdCounter = 1 + j2;
        return j2;
    }

    private TPDownloadParamData createDownloadParamData(int i, int i2) {
        TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(0);
        tPDownloadParamData.setStarTimeMS(i);
        tPDownloadParamData.setEndTimeMS(i2);
        return tPDownloadParamData;
    }

    /* access modifiers changed from: private */
    public long getOpaqueFromUniqueId(long j, String str) {
        if (!this.mUniqueIdToOpaqueMap.containsKey(Long.valueOf(j))) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error(str + ", invalid uniqueId");
            return -1;
        }
        long longValue = this.mUniqueIdToOpaqueMap.get(Long.valueOf(j)).longValue();
        TPBaseLogger tPBaseLogger2 = this.mLogger;
        tPBaseLogger2.info(str + ", convert uniqueId(" + j + ") => opaque(" + longValue + ")");
        return longValue;
    }

    private int getUrlProtocolType(String str) {
        if (this.mPlayProxyManager.isUseResourceLoader()) {
            return 5;
        }
        return TPUrlAnalyzer.getUrlProtocolType(str);
    }

    /* access modifiers changed from: private */
    public void handleAudioTrackProxy(Object obj) {
        if (obj instanceof TPPlayerMsg.TPAudioTrackInfo) {
            if (!isUseProxyEnable()) {
                this.mLogger.info("handleAudioTrackProxy, proxy not enable and use orinal url");
                return;
            }
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (TPPlayerMsg.TPAudioTrackInfo) obj;
            TPDownloadParamData tPDownloadParamData = null;
            Iterator<TPOptionalParam> it = tPAudioTrackInfo.paramData.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TPOptionalParam next = it.next();
                if (next.getKey() == 0) {
                    tPDownloadParamData = (TPDownloadParamData) next.getParamObject().objectValue;
                    break;
                }
            }
            String startDownLoadTrackUrl = this.mPlayProxyManager.startDownLoadTrackUrl(2, tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData);
            this.proxyTrackUrls.add(startDownLoadTrackUrl);
            tPAudioTrackInfo.proxyUrl = startDownLoadTrackUrl;
        }
    }

    /* access modifiers changed from: private */
    public void handleOnError(int i, int i2) {
        TPHashMapBuilder put = new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_REASON, 3);
        pushEvent(108, i, i2, "", put.put("code", i + "." + i2).build());
        this.mPlayProxyManager.setProxyPlayState(3);
        this.mPlayProxyManager.pauseDownload();
    }

    /* access modifiers changed from: private */
    public void handleOnInfo(int i, long j, long j2, Object obj) {
        if (i == 200) {
            this.mPlayProxyManager.setProxyPlayState(4);
            pushEvent(114, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_FORMAT, 0).put(TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, Long.valueOf(getCurrentPositionMs())).put("url", this.mUrl).build());
        } else if (i == 201) {
            setProxyStatePlayingOrPause();
            pushEvent(115, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
        } else if (i == 3) {
            long j3 = -1;
            if (obj instanceof Long) {
                j3 = ((Long) obj).longValue();
            }
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("switch definition finish defId:" + j3);
            if (j3 > 0) {
                this.mPlayProxyManager.playerSwitchDefComplete(j3);
            }
            TPHashMapBuilder tPHashMapBuilder = new TPHashMapBuilder();
            pushEvent(121, 0, 0, (String) null, tPHashMapBuilder.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j3 + "").build());
        } else if (i == 106) {
            pushEvent(105, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
        } else if (i == 501) {
            pushEvent(117, 0, 0, (String) null, obj);
        } else if (i == 107) {
            pushEvent(119, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).build());
        } else if (i == 4) {
            pushEvent(123, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, obj).put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put("code", String.valueOf(j2)).build());
        } else if (i == 101) {
            pushEvent(124, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).build());
        } else if (i == 505 && (obj instanceof TPPlayerMsg.TPMediaDrmInfo)) {
            TPPlayerMsg.TPMediaDrmInfo tPMediaDrmInfo = (TPPlayerMsg.TPMediaDrmInfo) obj;
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("TPMediaDrmInfo secureDecoder:" + tPMediaDrmInfo.supportSecureDecoder + " secureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName:" + tPMediaDrmInfo.componentName + " drmType:" + tPMediaDrmInfo.drmType);
        }
    }

    private void handlePlayFlowEvent(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i) {
        EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = MSG_ON_PLAY_FLOW_EVENT;
            obtainMessage.obj = new TPPlayerDetailInfo(i);
            this.mTransformCallbackHandler.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    public void handlePlayerCallback(int i, int i2, int i3, Object obj) {
        EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            obtainMessage.obj = obj;
            this.mTransformCallbackHandler.sendMessage(obtainMessage);
        }
    }

    private void handlePlayerCallbackDelay(int i, int i2, int i3, Object obj, long j) {
        EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            obtainMessage.obj = obj;
            this.mTransformCallbackHandler.removeMessages(i);
            this.mTransformCallbackHandler.sendMessageDelayed(obtainMessage, j);
        }
    }

    /* access modifiers changed from: private */
    public void handleSelectAudioTrack(Object obj) {
        if (obj instanceof TPPlayerMsg.TPAudioTrackInfo) {
            if (!isUseProxyEnable()) {
                this.mLogger.error("handleSelectAudioTrack, proxy is not enable");
                return;
            }
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (TPPlayerMsg.TPAudioTrackInfo) obj;
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("handleSelectAudioTrack, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            if (!TextUtils.isEmpty(tPAudioTrackInfo.audioTrackUrl)) {
                TPDownloadParamData tPDownloadParamData = null;
                Iterator<TPOptionalParam> it = tPAudioTrackInfo.paramData.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TPOptionalParam next = it.next();
                    if (next.getKey() == 0) {
                        tPDownloadParamData = (TPDownloadParamData) next.getParamObject().objectValue;
                        break;
                    }
                }
                this.mPlayProxyManager.startRemuxer(tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData != null ? tPDownloadParamData.getAudioTrackKeyId() : "");
                return;
            }
            try {
                this.mPlayProxyManager.stopRemuxer();
            } catch (Exception e) {
                this.mLogger.printException(e);
            }
        }
    }

    private void internalStop() {
        try {
            this.mPlayerAdapter.stop();
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        pushEvent(107, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_REASON, 1).build());
        this.mPlayProxyManager.setProxyPlayState(5);
        this.mPlayProxyManager.pauseDownload();
        this.mDownloadPlayableDurationMs = -1;
        this.mCurrentDownloadSizeByte = -1;
        this.mTotalFileSizeByte = -1;
    }

    private boolean isUseProxyEnable() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("isUseProxyEnable, mPlayProxyManager.isEnable()=" + this.mPlayProxyManager.isEnable() + " TPPlayerConfig.isUseP2P()=" + TPProxyConfig.isProxyEnable() + " mUseProxy=" + this.mUseProxy);
        return this.mPlayProxyManager.isEnable() && TPProxyConfig.isProxyEnable() && this.mUseProxy;
    }

    private void notifyIsUseProxyInfo() {
        TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new TPThreadSwitchCommons.TPSwitchCommonParams();
        tPSwitchCommonParams.arg1 = isUseProxyEnable() ? 1 : 0;
        handlePlayerCallback(261, 1009, 0, tPSwitchCommonParams);
    }

    private void onDetailInfo(TPPlayerDetailInfo tPPlayerDetailInfo) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.onDetailInfo(this, tPPlayerDetailInfo);
        }
    }

    /* access modifiers changed from: private */
    public void onInfoToOnDetailInfo(int i) {
        int i2 = mOnInfoMsgTypeToOnDetailMsgType.get(i, -1);
        if (i2 != -1) {
            onDetailInfo(i2);
        }
    }

    /* access modifiers changed from: private */
    public void onPlayFlowEvent(Message message) {
        Object obj = message.obj;
        if (obj instanceof TPPlayerDetailInfo) {
            onDetailInfo((TPPlayerDetailInfo) obj);
        }
    }

    private void publishPrepareEvent(String str) {
        TPPlayerEventInfo.PrepareStartEventInfo prepareStartEventInfo = new TPPlayerEventInfo.PrepareStartEventInfo();
        prepareStartEventInfo.setFlowId(str);
        this.mTPContext.getPlayerEventPublisher().publishEvent(prepareStartEventInfo);
    }

    private void publishSetDataSourceEvent(String str, int i, boolean z) {
        TPPlayerEventInfo.SetDataSourceEventInfo setDataSourceEventInfo = new TPPlayerEventInfo.SetDataSourceEventInfo();
        setDataSourceEventInfo.setUrl(str);
        setDataSourceEventInfo.setUrlProtocol(i);
        setDataSourceEventInfo.setIsUseProxy(z);
        this.mTPContext.getPlayerEventPublisher().publishEvent(setDataSourceEventInfo);
    }

    /* access modifiers changed from: private */
    public void pushEvent(int i, int i2, int i3, String str, Object obj) {
        try {
            ITPPluginManager iTPPluginManager = this.mTPPluginManager;
            if (iTPPluginManager != null) {
                iTPPluginManager.onEvent(i, i2, i3, str, obj);
            }
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    private void removePlayerCallback(int i) {
        EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            eventHandler.removeMessages(i);
        }
    }

    /* access modifiers changed from: private */
    public void reopenPlayer() {
        try {
            ITPPlayerAdapter iTPPlayerAdapter = this.mPlayerAdapter;
            if (iTPPlayerAdapter != null) {
                iTPPlayerAdapter.reopenPlayer();
            }
        } catch (Exception e) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("reopenPlayer has exception:" + e.toString());
        }
    }

    /* access modifiers changed from: private */
    public void setProxyStatePlayingOrPause() {
        this.mPlayProxyManager.setProxyPlayState(this.mPlayerAdapter.isPlaying() ? 0 : 5);
    }

    private void setTPPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam != null) {
            if (tPOptionalParam.getKey() == 206) {
                this.mUseProxy = tPOptionalParam.getParamBoolean().value;
                TPBaseLogger tPBaseLogger = this.mLogger;
                tPBaseLogger.info("setPlayerOptionalParam, use p2p proxy, OPTION_ID_BEFORE_BOOLEAN_USE_PROXY=" + this.mUseProxy);
            } else if (tPOptionalParam.getKey() == 508) {
                this.mEnableSuggestedBitrateCallback = tPOptionalParam.getParamBoolean().value;
            } else if (tPOptionalParam.getKey() == 100) {
                this.mStartTimeMs = (int) tPOptionalParam.getParamLong().value;
            } else if (tPOptionalParam.getKey() == 500) {
                this.mSkipEndTimeMs = (int) tPOptionalParam.getParamLong().value;
            }
        }
    }

    private TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam(TPVideoInfo tPVideoInfo, int i, int i2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("updateStartAndSkipEndTimeMsForDownloadParam, startTimeMs:" + i + ", skipEndTimeMs:" + i2);
        if (tPVideoInfo == null) {
            return new TPVideoInfo.Builder().downloadParam(createDownloadParamData(i, i2)).build();
        }
        ArrayList<TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
        if (downloadPraramList == null || downloadPraramList.isEmpty()) {
            tPVideoInfo.getBuilder().downloadParam(createDownloadParamData(i, i2)).build();
            return tPVideoInfo;
        }
        Iterator<TPDownloadParamData> it = downloadPraramList.iterator();
        while (it.hasNext()) {
            TPDownloadParamData next = it.next();
            next.setStarTimeMS(i);
            next.setEndTimeMS(i2);
        }
        return tPVideoInfo;
    }

    private boolean validCallSwitchDef() {
        int currentState = this.mPlayerAdapter.getCurrentState();
        return currentState == 4 || currentState == 5 || currentState == 6 || currentState == 7;
    }

    private boolean validStateCall(int i) {
        int currentState = this.mPlayerAdapter.getCurrentState();
        return i == 2 ? currentState == 1 : i != 17 || currentState == 4 || currentState == 5 || currentState == 6 || currentState == 7;
    }

    @TPThreadAnnotations.ThreadSwitch
    public void addAudioTrackSource(String str, String str2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "addAudioTrackSource, url:" + str + ", name:" + str2);
        addAudioTrackSource(str, str2, (TPDownloadParamData) null);
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void addSubtitleSource(String str, String str2, String str3) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "addSubtitleSource, url:" + str + ", mimeType:" + str2 + ", name:" + str3);
        addSubtitleSource(str, str2, str3, (TPDownloadParamData) null);
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "captureVideo, params:" + tPCaptureParams + ", captureCallBack:" + tPCaptureCallBack);
        try {
            this.mPlayerAdapter.captureVideo(tPCaptureParams, tPCaptureCallBack);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void deselectTrack(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "deselectTrack, trackIndex:" + i + ", opaque:" + j);
        try {
            this.mPlayerAdapter.deselectTrack(i, j);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void enableTPAssetResourceLoader(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, Looper looper) {
        if (iTPAssetResourceLoaderListener != null) {
            this.mPlayProxyManager.setIsUseResourceLoader(true);
            ITPAssetResourceLoader iTPAssetResourceLoader = this.mAssetResourceLoader;
            if (iTPAssetResourceLoader != null) {
                iTPAssetResourceLoader.release();
                this.mAssetResourceLoader = null;
            }
            TPAssetResourceLoader tPAssetResourceLoader = new TPAssetResourceLoader(this.mTPContext.getAppContext(), looper);
            this.mAssetResourceLoader = tPAssetResourceLoader;
            tPAssetResourceLoader.setTPAssetResourceLoaderListener(iTPAssetResourceLoaderListener);
            this.mAssetResourceLoader.fillInContentInformation();
            return;
        }
        this.mPlayProxyManager.setIsUseResourceLoader(false);
    }

    public int getBufferPercent() {
        if (this.mPlayerAdapter.getDurationMs() == 0) {
            return 0;
        }
        return (int) ((((float) (this.mPlayerAdapter.getPlayableDurationMs() - this.mPlayerAdapter.getCurrentPositionMs())) * 100.0f) / ((float) this.mPlayerAdapter.getDurationMs()));
    }

    public long getCurrentPositionMs() {
        return this.mPlayerAdapter.getCurrentPositionMs();
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getCurrentState() {
        return this.mPlayerAdapter.getCurrentState();
    }

    public long getDurationMs() {
        return this.mPlayerAdapter.getDurationMs();
    }

    public ITPExtendReportController getExtendReportController() {
        return this.mReportController;
    }

    public Looper getLooper() {
        return this.mThreadLooper;
    }

    public long getPlayableDurationMs() {
        if (!isUseProxyEnable()) {
            return this.mPlayerAdapter.getPlayableDurationMs();
        }
        long j = this.mCurrentDownloadSizeByte;
        if (j > 0) {
            long j2 = this.mTotalFileSizeByte;
            if (j2 > 0) {
                return (long) (((((double) j) * 1.0d) / ((double) j2)) * ((double) this.mPlayerAdapter.getDurationMs()));
            }
        }
        return this.mDownloadPlayableDurationMs;
    }

    public long getPlayerBufferedDurationMs() {
        return this.mPlayerAdapter.getPlayableDurationMs();
    }

    public ITPPlayerProxy getPlayerProxy() {
        return this.mPlayProxyManager;
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getPlayerType() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getPlayerType");
        return this.mPlayerAdapter.getPlayerType();
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public TPProgramInfo[] getProgramInfo() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getProgramInfo");
        return this.mPlayerAdapter.getProgramInfo();
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public long getPropertyLong(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getPropertyLong, paramId:" + i);
        try {
            return this.mPlayerAdapter.getPropertyLong(i);
        } catch (Exception e) {
            this.mLogger.printException(e);
            return 0;
        }
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public String getPropertyString(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getPropertyString, paramId:" + i);
        try {
            return this.mPlayerAdapter.getPropertyString(i);
        } catch (Exception e) {
            this.mLogger.printException(e);
            return "";
        }
    }

    public ITPBusinessReportManager getReportManager() {
        TPReportManager tPReportManager = this.mReportManager;
        return tPReportManager == null ? this.mReportNonImplPlugin : tPReportManager;
    }

    public String getTag() {
        return this.mLogger.getTag();
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public TPTrackInfo[] getTrackInfo() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getTrackInfo");
        return this.mPlayerAdapter.getTrackInfo();
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getVideoHeight() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getVideoHeight");
        return this.mPlayerAdapter.getVideoHeight();
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getVideoWidth() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "getVideoWidth");
        return this.mPlayerAdapter.getVideoWidth();
    }

    @TPThreadAnnotations.ThreadSwitch
    public void pause() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "pause");
        try {
            this.mPlayerAdapter.pause();
            pushEvent(106, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).build());
            this.mPlayProxyManager.setProxyPlayState(5);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void pauseDownload() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "pauseDownload");
        try {
            this.mPlayerAdapter.setPlayerOptionalParam(new TPOptionalParam().buildLong(502, 0));
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        this.mPlayProxyManager.pauseDownload();
    }

    @TPThreadAnnotations.ThreadSwitch
    public void prepareAsync() {
        String str = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
        handlePlayFlowEvent(1003);
        this.mLogger.info(LOG_API_CALL_PREFIX + "prepareAsync");
        TPReportManager tPReportManager = this.mReportManager;
        boolean doReportSampling = tPReportManager != null ? tPReportManager.doReportSampling() : true;
        TPReportController tPReportController = this.mReportController;
        if (tPReportController != null) {
            tPReportController.setReportToBeaconNeeded(doReportSampling);
        }
        try {
            this.mPlayProxyManager.resumeDownload();
            this.mPlayerAdapter.prepareAsync();
        } catch (RuntimeException e) {
            this.mLogger.printException(e);
        }
        publishPrepareEvent(str);
        try {
            pushEvent(102, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).put("url", this.mUrl).put(TPReportKeys.Common.COMMON_P2P, Boolean.valueOf(isUseProxyEnable())).put(TPReportKeys.Common.COMMON_FLOW_ID, str).build());
            notifyIsUseProxyInfo();
        } catch (Exception e2) {
            this.mLogger.printException(e2);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void release() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "release");
        this.mPlayerAdapter.release();
        pushEvent(112, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_REASON, 1).build());
        this.mPlayerListeners.clear();
        this.mPlayProxyManager.release();
        this.proxyTrackUrls.clear();
        ITPAssetResourceLoader iTPAssetResourceLoader = this.mAssetResourceLoader;
        if (iTPAssetResourceLoader != null) {
            iTPAssetResourceLoader.release();
            this.mAssetResourceLoader = null;
        }
        this.mDownloadPlayableDurationMs = -1;
        this.mCurrentDownloadSizeByte = -1;
        this.mTotalFileSizeByte = -1;
        TPThreadPool.getInstance().recycle(this.mHandlerThread, this.mTransformCallbackHandler);
        this.mHandlerThread = null;
        this.mTransformCallbackHandler = null;
        this.mTPPluginManager.release();
        TPReportController tPReportController = this.mReportController;
        if (tPReportController != null) {
            tPReportController.release();
        }
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void reset() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "reset");
        if (this.mUsingDefaultLogContext) {
            this.mLogger.updateTaskId(String.valueOf(this.mPlayTaskId.incrementAndGet()));
            this.mPlayerAdapter.updateLoggerContext(this.mLogger.getTPLoggerContext());
            TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.updateTag(this.mLogger.getTPLoggerContext().getTag());
            }
        }
        try {
            this.mPlayerAdapter.reset();
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        pushEvent(113, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_REASON, 1).build());
        this.mPlayProxyManager.stopDownload();
        this.mProxyStatus = -1;
        this.proxyTrackUrls.clear();
        ITPAssetResourceLoader iTPAssetResourceLoader = this.mAssetResourceLoader;
        if (iTPAssetResourceLoader != null) {
            iTPAssetResourceLoader.reset();
        }
        EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages((Object) null);
        }
        this.mDownloadPlayableDurationMs = -1;
        this.mCurrentDownloadSizeByte = -1;
        this.mTotalFileSizeByte = -1;
        this.mUseProxy = true;
        this.mEnableSuggestedBitrateCallback = false;
        this.mStartTimeMs = 0;
        this.mSkipEndTimeMs = 0;
        this.mUniqueIdToOpaqueMap.clear();
        this.mUniqueIdCounter = 0;
    }

    @TPThreadAnnotations.ThreadSwitch
    public void resumeDownload() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "resumeDownload");
        this.mPlayProxyManager.resumeDownload();
        try {
            this.mPlayerAdapter.setPlayerOptionalParam(new TPOptionalParam().buildLong(502, 1));
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void seekTo(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "seekTo, positionMs:" + i);
        try {
            this.mPlayerAdapter.seekTo(i);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        this.mPlayProxyManager.setProxyPlayState(1);
        pushEvent(109, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_FORMAT, 0).put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, Long.valueOf(getCurrentPositionMs())).build());
    }

    @TPThreadAnnotations.ThreadSwitch
    public void selectProgram(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "selectProgram, programIndex:" + i + ", opaque:" + j);
        try {
            this.mPlayerAdapter.selectProgram(i, j);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void selectTrack(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "selectTrack, trackIndex:" + i + ", opaque:" + j);
        try {
            long assignUniqueIdForOpaque = assignUniqueIdForOpaque(j, "selectTrack");
            TPTrackInfo[] trackInfo = this.mPlayerAdapter.getTrackInfo();
            if (trackInfo != null && trackInfo.length > i) {
                pushEvent(122, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, Long.valueOf(assignUniqueIdForOpaque)).put(TPReportKeys.PlayerStep.PLAYER_SELECT_TRACK_TYPE, Integer.valueOf(trackInfo[i].getTrackType())).put("name", trackInfo[i].getName()).put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).build());
            }
            this.mPlayerAdapter.selectTrack(i, assignUniqueIdForOpaque);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setAudioGainRatio(float f) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setAudioGainRatio, gainRatio:" + f);
        try {
            this.mPlayerAdapter.setAudioGainRatio(f);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setAudioNormalizeVolumeParams(String str) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setAudioNormalizeVolumeParams, audioNormalizeVolumeParams:" + str);
        try {
            this.mPlayerAdapter.setAudioNormalizeVolumeParams(str);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setDataSource(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("error : setDataSource , param is invalid");
        } else if (this.mPlayerAdapter.getCurrentState() == 1) {
            publishSetDataSourceEvent(str, getUrlProtocolType(str), isUseProxyEnable());
            handlePlayFlowEvent(1000);
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info(LOG_API_CALL_PREFIX + "setDataSource, url:" + str);
            this.mUrl = str;
            TPUrlDataSource tPUrlDataSource = new TPUrlDataSource(str);
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("handleSetDataSource originalUrl=" + str);
            if (isUseProxyEnable()) {
                tPUrlDataSource = this.mPlayProxyManager.startDownloadPlay(str, (Map<String, String>) null);
                TPBaseLogger tPBaseLogger3 = this.mLogger;
                tPBaseLogger3.info("handleSetDataSource selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
                TPBaseLogger tPBaseLogger4 = this.mLogger;
                tPBaseLogger4.info("handleSetDataSource systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
            }
            this.mPlayerAdapter.setDataSource(tPUrlDataSource);
            handlePlayFlowEvent(1001);
        } else {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void setLoopback(boolean z) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setLoopback, isLoopback:" + z);
        try {
            this.mPlayerAdapter.setLoopback(z);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    public void setOnAudioFrameOutputListener(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnAudioPcmOutputListener(iOnAudioFrameOutputListener);
        }
    }

    public void setOnAudioProcessFrameOutputListener(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnAudioProcessOutputListener(iOnAudioProcessFrameOutputListener);
        }
    }

    public void setOnCompletionListener(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnCompletionListener(iOnCompletionListener);
        }
    }

    public void setOnDemuxerListener(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnDemuxerListener(iOnDemuxerListener);
        }
    }

    public void setOnDetailInfoListener(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnDetailInfoListener(iOnDetailInfoListener);
        }
    }

    public void setOnErrorListener(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnErrorListener(iOnErrorListener);
        }
    }

    public void setOnInfoListener(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnInfoListener(iOnInfoListener);
        }
    }

    public void setOnPlayerStateChangeListener(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnPlayerStateChangeListener(iOnStateChangeListener);
        }
    }

    public void setOnPreparedListener(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnPreparedListener(iOnPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnSeekCompleteListener(iOnSeekCompleteListener);
        }
    }

    public void setOnStopAsyncCompleteListener(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnStopAsyncCompleteListener(iOnStopAsyncCompleteListener);
        }
    }

    public void setOnSubtitleDataListener(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnSubtitleDataListener(iOnSubtitleDataListener);
        }
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
        }
    }

    public void setOnVideoFrameOutListener(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
        }
    }

    public void setOnVideoProcessFrameOutputListener(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnVideoProcessOutputListener(iOnVideoProcessFrameOutputListener);
        }
    }

    public void setOnVideoSizeChangedListener(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setOutputMute(boolean z) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setOutputMute, isOutputMute:" + z);
        try {
            this.mPlayerAdapter.setOutputMute(z);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setPlaySharpenSwitch() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setPlaySharpenSwitch");
        this.mPlayerAdapter.setPlaySharpenSwitch();
    }

    @TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setPlaySpeedRatio(float f) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setPlaySpeedRatio, speedRatio:" + f);
        try {
            this.mPlayProxyManager.setPlaySpeedRatio(f);
            this.mPlayerAdapter.setPlaySpeedRatio(f);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        pushEvent(116, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Float.valueOf(f)).build());
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getParamType() != 7 || TPOptionalParamObjectChecker.checkObjectType(tPOptionalParam.getKey(), tPOptionalParam.getParamObject().objectValue)) {
            setTPPlayerOptionalParam(tPOptionalParam);
            this.mPlayProxyManager.setPlayerOptionalParam(tPOptionalParam);
            try {
                this.mPlayerAdapter.setPlayerOptionalParam(tPOptionalParam);
            } catch (Exception e) {
                this.mLogger.printException(e);
            }
        } else {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.warn("set object param failed, optional id:" + tPOptionalParam.getKey());
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setRichMediaSynchronizer(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        this.mPlayerAdapter.setRichMediaSynchronizer(iTPRichMediaSynchronizer);
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setSurface(Surface surface) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setSurface, surface:" + surface);
        try {
            this.mPlayerAdapter.setSurface(surface, 0);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setSurfaceHolder, SurfaceHolder:" + surfaceHolder);
        try {
            this.mPlayerAdapter.setSurfaceHolder(surfaceHolder);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setTPSurface(TPSurface tPSurface) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setTPSurface, tpSurface:" + tPSurface);
        try {
            if (tPSurface instanceof TPSurface) {
                this.mPlayerAdapter.setSurface(tPSurface, 0);
            }
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo != null) {
            try {
                updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, this.mStartTimeMs, this.mSkipEndTimeMs);
                this.mPlayProxyManager.setVideoInfo(tPVideoInfo);
                this.mPlayerAdapter.setVideoInfo(tPVideoInfo);
            } catch (Exception e) {
                this.mLogger.printException(e);
            }
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void start() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + IXWebBroadcastListener.STAGE_START);
        try {
            this.mPlayerAdapter.start();
            pushEvent(104, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).build());
            this.mPlayProxyManager.setProxyPlayState(0);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void stop() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "stop");
        internalStop();
    }

    @TPThreadAnnotations.ThreadSwitch
    public void stopAsync() {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "stopAsync");
        internalStop();
        handlePlayerCallback(MSG_ON_STOP_ASYNC_COMPLETE, 0, 0, (Object) null);
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j);
        switchDefinition(str, j, tPVideoInfo, 0);
    }

    public void updateLoggerContext(TPLoggerContext tPLoggerContext) {
        if (tPLoggerContext != null) {
            this.mUsingDefaultLogContext = false;
            this.mLogger.updateContext(new TPLoggerContext(tPLoggerContext, TAG));
            this.mPlayerAdapter.updateLoggerContext(this.mLogger.getTPLoggerContext());
            TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.updateTag(this.mLogger.getTPLoggerContext().getTag());
            }
        }
    }

    public class EventHandler extends Handler {
        private TPPlayer mPlayer;

        public EventHandler(TPPlayer tPPlayer) {
            this.mPlayer = tPPlayer;
        }

        public void handleMessage(Message message) {
            TPBaseLogger access$800 = TPPlayer.this.mLogger;
            access$800.debug("mTransformHandler msg : " + message.what);
            TPPlayerListeners access$1100 = TPPlayer.this.mPlayerListeners;
            if (access$1100 != null) {
                int i = message.what;
                if (i == 257) {
                    TPPlayer.this.mLogger.info("onPrepared");
                    TPPlayer.this.onDetailInfo(1004);
                    access$1100.onPrepared(this.mPlayer);
                } else if (i != TPPlayer.MSG_ON_PLAY_FLOW_EVENT) {
                    switch (i) {
                        case 260:
                            access$1100.onCompletion(this.mPlayer);
                            return;
                        case 261:
                            TPPlayer.this.onInfoToOnDetailInfo(message.arg1);
                            TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = (TPThreadSwitchCommons.TPSwitchCommonParams) message.obj;
                            if (tPSwitchCommonParams != null) {
                                access$1100.onInfo(this.mPlayer, message.arg1, tPSwitchCommonParams.arg1, tPSwitchCommonParams.arg2, tPSwitchCommonParams.extraObject);
                                return;
                            }
                            return;
                        case TPPlayer.MSG_ON_ERROR /*262*/:
                            TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams2 = (TPThreadSwitchCommons.TPSwitchCommonParams) message.obj;
                            if (tPSwitchCommonParams2 != null) {
                                access$1100.onError(this.mPlayer, message.arg1, message.arg2, tPSwitchCommonParams2.arg1, tPSwitchCommonParams2.arg2);
                                return;
                            }
                            return;
                        case 263:
                            access$1100.onSeekComplete(this.mPlayer);
                            return;
                        case 264:
                            TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams3 = (TPThreadSwitchCommons.TPSwitchCommonParams) message.obj;
                            if (tPSwitchCommonParams3 != null) {
                                access$1100.onVideoSizeChanged(this.mPlayer, tPSwitchCommonParams3.arg1, tPSwitchCommonParams3.arg2);
                                return;
                            }
                            return;
                        case TPPlayer.MSG_ON_SUBTITLE_DATA /*265*/:
                            access$1100.onSubtitleData(this.mPlayer, (TPSubtitleData) message.obj);
                            return;
                        case TPPlayer.MSG_ON_VIDEOFRAMEOUT /*266*/:
                            access$1100.onVideoFrameOut(this.mPlayer, (TPVideoFrameBuffer) message.obj);
                            return;
                        case TPPlayer.MSG_ON_AUDIOPCMOUT /*267*/:
                            access$1100.onAudioFrameOut(this.mPlayer, (TPAudioFrameBuffer) message.obj);
                            return;
                        case TPPlayer.MSG_ON_PROXY_PLAYERROR /*268*/:
                            access$1100.onError(this.mPlayer, message.arg1, message.arg2, 0, 0);
                            return;
                        case 269:
                            access$1100.onInfo(this.mPlayer, 1002, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 270:
                            access$1100.onInfo(this.mPlayer, 1003, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 271:
                            access$1100.onInfo(this.mPlayer, 1001, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 272:
                            access$1100.onInfo(this.mPlayer, 1004, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 273:
                            access$1100.onInfo(this.mPlayer, 1005, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 274:
                            access$1100.onInfo(this.mPlayer, 1006, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case TPPlayer.MSG_ON_PROXY_CDN_URL_EXPIRED /*275*/:
                            access$1100.onInfo(this.mPlayer, 1007, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 276:
                            access$1100.onInfo(this.mPlayer, 1008, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 277:
                            access$1100.onStateChange(message.arg1, message.arg2);
                            return;
                        case TPPlayer.MSG_ON_PROXY_SWITCH_DEFINITION /*278*/:
                            if (TPPlayer.this.mPlayerAdapter != null) {
                                try {
                                    TPPlayer.this.mPlayerAdapter.setPlayerOptionalParam(new TPOptionalParam().buildLong(8000, (long) message.arg1));
                                } catch (IllegalStateException e) {
                                    TPPlayer.this.mLogger.printException(e);
                                }
                            }
                            if (TPPlayer.this.mEnableSuggestedBitrateCallback) {
                                access$1100.onInfo(this.mPlayer, 1010, (long) message.arg1, (long) message.arg2, message.obj);
                                return;
                            }
                            return;
                        case TPPlayer.MSG_ON_SUBTITLE_FRAME_BUFFER /*279*/:
                            access$1100.onSubtitleFrameOut(this.mPlayer, (TPSubtitleFrameBuffer) message.obj);
                            return;
                        case TPPlayer.MSG_ON_STOP_ASYNC_COMPLETE /*280*/:
                            access$1100.onStopAsyncComplete(this.mPlayer);
                            return;
                        case TPPlayer.MSG_ON_PROXY_ABTEST_INFO /*281*/:
                            access$1100.onInfo(this.mPlayer, 1015, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case TPPlayer.MSG_ON_RPOXY_M3U8_REFRESH /*282*/:
                            TPPlayer.this.reopenPlayer();
                            return;
                        case 283:
                            access$1100.onInfo(this.mPlayer, 1016, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        case 284:
                            access$1100.onInfo(this.mPlayer, 1017, (long) message.arg1, (long) message.arg2, message.obj);
                            return;
                        default:
                            return;
                    }
                } else {
                    TPPlayer.this.onPlayFlowEvent(message);
                }
            }
        }

        public EventHandler(TPPlayer tPPlayer, Looper looper) {
            super(looper);
            this.mPlayer = tPPlayer;
        }
    }

    public TPPlayer(Context context, Looper looper) {
        this(context, looper, (Looper) null);
    }

    public TPPlayer(Context context, Looper looper, Looper looper2) {
        this(context, looper, looper2, (TPLoggerContext) null);
    }

    /* access modifiers changed from: private */
    public void onDetailInfo(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i) {
        onDetailInfo(new TPPlayerDetailInfo(i));
    }

    @TPThreadAnnotations.ThreadSwitch
    public void addAudioTrackSource(String str, String str2, TPDownloadParamData tPDownloadParamData) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "addAudioTrackSource, url:" + str + ", name:" + str2 + ", downloadParamData:" + tPDownloadParamData);
        if (TextUtils.isEmpty(str2) || !TPCommonUtils.isUrl(str)) {
            this.mLogger.error("handleAddAudioSource, illegal argument.");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            TPOptionalParam tPOptionalParam = new TPOptionalParam();
            if (tPDownloadParamData != null) {
                tPOptionalParam.buildObject(0, tPDownloadParamData);
            }
            arrayList.add(tPOptionalParam);
            Map map = null;
            if (!(tPDownloadParamData == null || tPDownloadParamData.getUrlCdnidHttpHeaderList() == null || tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty())) {
                map = tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0);
            }
            this.mPlayerAdapter.addAudioTrackSource(str, map, str2, arrayList);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void addSubtitleSource(String str, String str2, String str3, TPDownloadParamData tPDownloadParamData) {
        String str4;
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "addSubtitleSource, url:" + str + ", name:" + str3 + ", downloadParamData:" + tPDownloadParamData);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!isUseProxyEnable() || !TPCommonUtils.isUrl(str)) {
                str4 = str;
            } else {
                str4 = this.mPlayProxyManager.startDownLoadTrackUrl(3, str, tPDownloadParamData);
                this.proxyTrackUrls.add(str4);
            }
            Map map = null;
            if (!(tPDownloadParamData == null || tPDownloadParamData.getUrlCdnidHttpHeaderList() == null || tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty())) {
                map = tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0);
            }
            this.mPlayerAdapter.addSubtitleSource(str4, map, str2, str3);
            pushEvent(118, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(currentTimeMillis)).put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put("url", str).put("name", str3).build());
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j + ", videoInfo:" + tPVideoInfo + ", httpHeader:" + map);
        try {
            switchDefinition(str, j, tPVideoInfo, map, 0);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    public TPPlayer(Context context, Looper looper, Looper looper2, TPLoggerContext tPLoggerContext) {
        TPLoggerContext tPLoggerContext2;
        this.mUrl = null;
        this.mUseProxy = true;
        this.mEnableSuggestedBitrateCallback = false;
        this.mProxyStatus = -1;
        this.mPlayTaskId = new AtomicInteger(1000);
        this.mUsingDefaultLogContext = false;
        this.mReportController = null;
        this.mUniqueIdToOpaqueMap = new HashMap();
        this.mUniqueIdCounter = 0;
        if (tPLoggerContext != null) {
            tPLoggerContext2 = new TPLoggerContext(tPLoggerContext, TAG);
        } else {
            TPLoggerContext tPLoggerContext3 = new TPLoggerContext(TPLoggerContext.PREFIX_THUMB_PLAYER, String.valueOf(sLifeCycleId.incrementAndGet()), String.valueOf(this.mPlayTaskId.incrementAndGet()), TAG);
            this.mUsingDefaultLogContext = true;
            tPLoggerContext2 = tPLoggerContext3;
        }
        TPBaseLogger tPBaseLogger = new TPBaseLogger(tPLoggerContext2);
        this.mLogger = tPBaseLogger;
        tPBaseLogger.info("create TPPlayer");
        this.mTPContext = new TPContext(context.getApplicationContext());
        this.mTPPluginManager = new TPPluginManager();
        pushEvent(100, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).build());
        InnerPlayerListener innerPlayerListener = new InnerPlayerListener();
        this.mPlayerListeners = new TPPlayerListeners(this.mLogger.getTag());
        ITPPlayerAdapter createTPPlayerAdapter = TPPlayerAdapterFactory.createTPPlayerAdapter(tPLoggerContext2, this.mTPContext);
        this.mPlayerAdapter = createTPPlayerAdapter;
        createTPPlayerAdapter.setOnPreparedListener(innerPlayerListener);
        createTPPlayerAdapter.setOnCompletionListener(innerPlayerListener);
        createTPPlayerAdapter.setOnInfoListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoSizeChangedListener(innerPlayerListener);
        createTPPlayerAdapter.setOnErrorListener(innerPlayerListener);
        createTPPlayerAdapter.setOnSeekCompleteListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoSizeChangedListener(innerPlayerListener);
        createTPPlayerAdapter.setOnSubtitleDataListener(innerPlayerListener);
        createTPPlayerAdapter.setOnSubtitleFrameOutListener(innerPlayerListener);
        createTPPlayerAdapter.setOnAudioPcmOutputListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoFrameOutListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoProcessOutputListener(innerPlayerListener);
        createTPPlayerAdapter.setOnAudioProcessOutputListener(innerPlayerListener);
        createTPPlayerAdapter.setOnPlayerStateChangeListener(innerPlayerListener);
        createTPPlayerAdapter.setOnDetailInfoListener(innerPlayerListener);
        createTPPlayerAdapter.setOnDemuxerListener(innerPlayerListener);
        if (looper == null || looper == Looper.getMainLooper()) {
            HandlerThread obtainHandleThread = TPThreadPool.getInstance().obtainHandleThread("TP-workthread");
            this.mHandlerThread = obtainHandleThread;
            looper = obtainHandleThread.getLooper();
        }
        this.mThreadLooper = looper;
        if (looper2 != null) {
            this.mTransformCallbackHandler = new EventHandler(this, looper2);
        } else if (Looper.myLooper() == null) {
            this.mTransformCallbackHandler = new EventHandler(this, this.mThreadLooper);
        } else {
            this.mTransformCallbackHandler = new EventHandler(this);
        }
        pushEvent(101, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
        ITPPlayManager createDataTransportManager = TPDataTransportManagerFactory.createDataTransportManager(this.mThreadLooper, this.mTPContext);
        this.mPlayProxyManager = createDataTransportManager;
        createDataTransportManager.setPlayListener(innerPlayerListener);
        this.mTPPluginManager.addPlugin(new TPLogPlugin());
        this.proxyTrackUrls = new ArrayList<>();
        if (TPPlayerConfig.getNewReportEnable()) {
            TPReportController tPReportController = new TPReportController(this.mTPContext.getAppContext());
            this.mReportController = tPReportController;
            tPReportController.setPlayerInfoGetter(new TPPlayerInfoGetterImpl(createTPPlayerAdapter));
            this.mReportController.init();
            this.mTPContext.getPlayerEventPublisher().addEventReceiver(this.mReportController);
        }
    }

    private void pushEvent(int i) {
        pushEvent(i, 0, 0, "", (Object) null);
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void setLoopback(boolean z, long j, long j2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setLoopback, isLoopback:" + z + ", loopStartPositionMs:" + j + ", loopEndPositionMs:" + j2);
        try {
            this.mPlayerAdapter.setLoopback(z, j, j2);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setSurface(Surface surface, @TPCommonEnum.TPSurfaceType int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "setSurface, surface:" + surface + ", type:" + i);
        try {
            this.mPlayerAdapter.setSurface(surface, i);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j + ", videoInfo:" + tPVideoInfo);
        try {
            switchDefinition(iTPMediaAsset, j, tPVideoInfo, 0);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
    }

    public void enableTPAssetResourceLoader(ITPAssetResourceLoader iTPAssetResourceLoader) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "enableTPAssetResourceLoader, assetResourceLoader:" + iTPAssetResourceLoader);
        if (iTPAssetResourceLoader != null) {
            this.mPlayProxyManager.setIsUseResourceLoader(true);
            ITPAssetResourceLoader iTPAssetResourceLoader2 = this.mAssetResourceLoader;
            if (iTPAssetResourceLoader2 != null) {
                iTPAssetResourceLoader2.release();
                this.mAssetResourceLoader = null;
            }
            this.mAssetResourceLoader = iTPAssetResourceLoader;
            return;
        }
        this.mPlayProxyManager.setIsUseResourceLoader(false);
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo, int i) {
        if (!validCallSwitchDef()) {
            this.mLogger.error("error : switchDefinition , state invalid");
        }
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j + ", mode:" + i);
        TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam = updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, (int) getCurrentPositionMs(), this.mSkipEndTimeMs);
        TPUrlDataSource tPUrlDataSource = new TPUrlDataSource(str);
        if (isUseProxyEnable()) {
            tPUrlDataSource = this.mPlayProxyManager.startSwitchDefTask(j, str, updateStartAndSkipEndTimeMsForDownloadParam, (Map<String, String>) null);
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("switchDefinition selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
            TPBaseLogger tPBaseLogger3 = this.mLogger;
            tPBaseLogger3.info("switchDefinition systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
        }
        TPBaseLogger tPBaseLogger4 = this.mLogger;
        tPBaseLogger4.info("switchDefinition, proxyUrl:" + str + ", defID:" + j);
        try {
            this.mPlayerAdapter.updateVideoInfo(updateStartAndSkipEndTimeMsForDownloadParam);
            this.mPlayerAdapter.switchDefinition(tPUrlDataSource, i, j);
        } catch (Exception e) {
            this.mLogger.printException(e);
        }
        TPHashMapBuilder tPHashMapBuilder = new TPHashMapBuilder();
        pushEvent(120, 0, 0, (String) null, tPHashMapBuilder.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j + "").build());
    }

    @TPThreadAnnotations.ThreadSwitch
    public void seekTo(int i, int i2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info(LOG_API_CALL_PREFIX + "seekTo, positionMs:" + i + ", mode:" + i2);
        if (i2 > 0) {
            try {
                this.mPlayerAdapter.seekTo(i, i2);
            } catch (Exception e) {
                this.mLogger.printException(e);
            }
        } else {
            this.mPlayerAdapter.seekTo(i);
        }
        this.mPlayProxyManager.setProxyPlayState(1);
        pushEvent(109, 0, 0, (String) null, new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_START_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_FORMAT, 0).put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, Long.valueOf(getCurrentPositionMs())).build());
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setDataSource(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("error : setDataSource , param is invalid");
        } else if (this.mPlayerAdapter.getCurrentState() == 1) {
            publishSetDataSourceEvent(str, getUrlProtocolType(str), isUseProxyEnable());
            handlePlayFlowEvent(1000);
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info(LOG_API_CALL_PREFIX + "setDataSource, url:" + str + ", httpHeader:" + map);
            this.mUrl = str;
            TPUrlDataSource tPUrlDataSource = new TPUrlDataSource(str);
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.info("handleSetDataSource originalUrl=" + str);
            if (isUseProxyEnable()) {
                tPUrlDataSource = this.mPlayProxyManager.startDownloadPlay(str, map);
                TPBaseLogger tPBaseLogger3 = this.mLogger;
                tPBaseLogger3.info("handleSetDataSource selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
                TPBaseLogger tPBaseLogger4 = this.mLogger;
                tPBaseLogger4.info("handleSetDataSource systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
            }
            this.mPlayerAdapter.setDataSource(tPUrlDataSource, map);
            handlePlayFlowEvent(1001);
        } else {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo, Map<String, String> map, int i) {
        String str2 = str;
        long j2 = j;
        Map<String, String> map2 = map;
        if (validCallSwitchDef()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str2 + ", defID:" + j2 + ", httpHeader:" + map2 + ", mode:" + i);
            TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam = updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, (int) getCurrentPositionMs(), this.mSkipEndTimeMs);
            TPUrlDataSource tPUrlDataSource = new TPUrlDataSource(str2);
            if (isUseProxyEnable()) {
                tPUrlDataSource = this.mPlayProxyManager.startSwitchDefTask(j, str, updateStartAndSkipEndTimeMsForDownloadParam, map);
                TPBaseLogger tPBaseLogger2 = this.mLogger;
                tPBaseLogger2.info("switchDefinition selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
                TPBaseLogger tPBaseLogger3 = this.mLogger;
                tPBaseLogger3.info("switchDefinition systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
            }
            TPUrlDataSource tPUrlDataSource2 = tPUrlDataSource;
            TPBaseLogger tPBaseLogger4 = this.mLogger;
            tPBaseLogger4.info("switchDefinition, proxyUrl:" + str2 + ", defID:" + j2 + ", httpHeader:" + map2);
            try {
                this.mPlayerAdapter.updateVideoInfo(updateStartAndSkipEndTimeMsForDownloadParam);
                this.mPlayerAdapter.switchDefinition(tPUrlDataSource2, map, i, j);
            } catch (Exception e) {
                this.mLogger.printException(e);
            }
            TPHashMapBuilder tPHashMapBuilder = new TPHashMapBuilder();
            pushEvent(120, 0, 0, (String) null, tPHashMapBuilder.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j2 + "").build());
            return;
        }
        throw new IllegalStateException("error : switchDefinition , state invalid");
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        } else if (this.mPlayerAdapter.getCurrentState() == 1) {
            publishSetDataSourceEvent("", 4, false);
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info(LOG_API_CALL_PREFIX + "setDataSource, ParcelFileDescriptor");
            try {
                this.mPlayerAdapter.setDataSource(parcelFileDescriptor);
            } catch (IOException e) {
                this.mLogger.printException(e);
            } catch (SecurityException e2) {
                this.mLogger.printException(e2);
            }
        } else {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
    }

    @TPThreadAnnotations.ThreadSwitch
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        } else if (this.mPlayerAdapter.getCurrentState() == 1) {
            publishSetDataSourceEvent("", 4, false);
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info(LOG_API_CALL_PREFIX + "setDataSource, AssetFileDescriptor");
            try {
                this.mPlayerAdapter.setDataSource(assetFileDescriptor);
            } catch (IOException e) {
                this.mLogger.printException(e);
            } catch (SecurityException e2) {
                this.mLogger.printException(e2);
            }
        } else {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
    }

    @TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo, int i) {
        if (validCallSwitchDef()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j + ", videoInfo:" + tPVideoInfo + ", mode:" + i);
            TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam = updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, (int) getCurrentPositionMs(), this.mSkipEndTimeMs);
            if (isUseProxyEnable()) {
                iTPMediaAsset = this.mPlayProxyManager.startSwitchDefTaskByAsset(iTPMediaAsset, j, updateStartAndSkipEndTimeMsForDownloadParam);
            }
            if (iTPMediaAsset != null) {
                TPBaseLogger tPBaseLogger2 = this.mLogger;
                tPBaseLogger2.info("handleSwitchDef, proxyMediaAsset:" + iTPMediaAsset + ", defID:" + j);
                try {
                    this.mPlayerAdapter.updateVideoInfo(updateStartAndSkipEndTimeMsForDownloadParam);
                    this.mPlayerAdapter.switchDefinition(iTPMediaAsset, 0, j);
                } catch (Exception e) {
                    this.mLogger.printException(e);
                }
                TPHashMapBuilder tPHashMapBuilder = new TPHashMapBuilder();
                pushEvent(120, 0, 0, (String) null, tPHashMapBuilder.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j + "").build());
                return;
            }
            return;
        }
        throw new IllegalStateException("error : switchDefinition , state invalid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r0.getDrmAllProperties().isEmpty() == false) goto L_0x002c;
     */
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x00c8
            boolean r0 = r4 instanceof com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r4.getUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0024
            r0 = r4
            com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset r0 = (com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset) r0
            java.util.Map r1 = r0.getDrmAllProperties()
            if (r1 == 0) goto L_0x0024
            java.util.Map r0 = r0.getDrmAllProperties()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0024
            goto L_0x002c
        L_0x0024:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error : setDataSource , drm asset url is null or drm property is null"
            r4.<init>(r0)
            throw r4
        L_0x002c:
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r0 = r3.mPlayerAdapter
            int r0 = r0.getCurrentState()
            r1 = 1
            if (r0 != r1) goto L_0x00ab
            java.lang.String r0 = r4.getUrl()
            java.lang.String r1 = r4.getUrl()
            int r1 = r3.getUrlProtocolType(r1)
            boolean r2 = r3.isUseProxyEnable()
            r3.publishSetDataSourceEvent(r0, r1, r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.handlePlayFlowEvent(r0)
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = LOG_API_CALL_PREFIX
            r1.append(r2)
            java.lang.String r2 = "setDataSource, ITPMediaAsset"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.info(r1)
            java.lang.String r0 = r4.getUrl()
            r3.mUrl = r0
            boolean r0 = r3.isUseProxyEnable()
            if (r0 == 0) goto L_0x0078
            com.tencent.thumbplayer.datatransport.ITPPlayManager r0 = r3.mPlayProxyManager
            com.tencent.thumbplayer.api.composition.ITPMediaAsset r4 = r0.startDownloadPlayByAsset(r4)
        L_0x0078:
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleSetDataSource mediaAsset="
            r1.append(r2)
            java.lang.String r2 = r4.getUrl()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.info(r1)
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r0 = r3.mPlayerAdapter     // Catch:{ IOException -> 0x009f, SecurityException -> 0x0098 }
            r0.setDataSource((com.tencent.thumbplayer.api.composition.ITPMediaAsset) r4)     // Catch:{ IOException -> 0x009f, SecurityException -> 0x0098 }
            goto L_0x00a5
        L_0x0098:
            r4 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            r0.printException(r4)
            goto L_0x00a5
        L_0x009f:
            r4 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            r0.printException(r4)
        L_0x00a5:
            r4 = 1001(0x3e9, float:1.403E-42)
            r3.handlePlayFlowEvent(r4)
            return
        L_0x00ab:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error : setDataSource , state invalid. current state:"
            r0.append(r1)
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r1 = r3.mPlayerAdapter
            int r1 = r1.getCurrentState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x00c8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error : setDataSource , param is null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.TPPlayer.setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset):void");
    }
}
