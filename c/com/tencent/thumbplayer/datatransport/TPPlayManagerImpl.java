package com.tencent.thumbplayer.datatransport;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.adapter.player.TPUrlDataSource;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.composition.TPMediaComposition;
import com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip;
import com.tencent.thumbplayer.composition.TPMediaDRMAsset;
import com.tencent.thumbplayer.composition.TPMediaUrlAsset;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPFutureResult;
import com.tencent.thumbplayer.utils.TPGlobalEventNofication;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPNetworkChangeMonitor;
import com.tencent.thumbplayer.utils.TPReadWriteLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TPPlayManagerImpl implements ITPPlayManager, TPNetworkChangeMonitor.OnNetStatusChangeListener, TPGlobalEventNofication.OnGlobalEventChangeListener {
    private static final int API_CALL_TIME_OUT_MS = 500;
    private static final int MSG_DOWN_LOAD_CDN_INFO_UPDATE = 4100;
    private static final int MSG_DOWN_LOAD_CDN_URL_EXPERIED = 4103;
    private static final int MSG_DOWN_LOAD_CDN_URL_UPDATE = 4099;
    private static final int MSG_DOWN_LOAD_ERROR = 4098;
    private static final int MSG_DOWN_LOAD_FINISH = 4097;
    private static final int MSG_DOWN_LOAD_LONG_GET_PLAY_INFO = 4105;
    private static final int MSG_DOWN_LOAD_PLAY_BACK = 4104;
    private static final int MSG_DOWN_LOAD_PROGRESS_UPDARE = 4106;
    private static final int MSG_DOWN_LOAD_PROTOCOL_UPDATE = 4102;
    private static final int MSG_DOWN_LOAD_STATUS_UPDATE = 4101;
    private static final int MSG_DOWN_LOAD_STRING_GET_PLAY_INFO = 4107;
    private static final int MSG_GLOBAL_EVENT = 4196;
    private static final int MSG_INDEX = 4096;
    private static final int MSG_NETWORK_STATUS_EVENT = 4197;
    private static final int MSG_PROXY_CANCEL_READ_DATA = 4109;
    private static final int MSG_PROXY_GET_CONTENT_TYPE = 4112;
    private static final int MSG_PROXY_GET_DATA_FILE_PATH = 4111;
    private static final int MSG_PROXY_GET_DATA_TOTAL_SIZE = 4110;
    private static final int MSG_PROXY_START_READ_DATA = 4108;
    private static final String TAG = "TPThumbPlayer[TPPlayManagerImpl.java]";
    private static final int TYPE_NOT_INIT = -1;
    private final Context mContext;
    private ArrayList<TPDownloadParamData> mDownloadPramList;
    private ITPDownloadProxy mDownloadProxy;
    private final ReentrantReadWriteLock mDownloadProxyRWLock = new ReentrantReadWriteLock();
    private boolean mEnableAdaptiveSwitch = false;
    private boolean mEnableMultiNetworkCard = false;
    private boolean mEnableSuggestedBitrateCallback = false;
    private String mFileID;
    private EventHandler mHandler;
    private final TPReadWriteLock mHandlerLock;
    private InnerProxyListener mInnerProxyListener;
    private boolean mIsActive = true;
    private boolean mIsRemuxer = false;
    private boolean mIsUseResourceLoader = false;
    private volatile int mLoadProxyState = 0;
    private long mMaxBitrateBps = 100000000;
    private String mOriginUrl;
    private final Deque<TPDefTaskModel> mPendingDefTaskQueue = new LinkedList();
    private int mPlayID;
    /* access modifiers changed from: private */
    public ITPPlayListener mPlayListener;
    private ITPPlayerProxyListener mPlayerProxyListener = null;
    private volatile int mServiceType = -1;
    private long mSkipEndTimeMs;
    private long mStartTimeMs;
    private HashMap<String, Integer> mTrackProxyUrlPlayIdMap;
    private TPVideoInfo mVideoInfo;

    public static final class DownloadProxyState {
        private static final int STATE_LOAD_FAILED = 1;
        private static final int STATE_LOAD_RELEASE = 3;
        private static final int STATE_LOAD_SUCCEEDED = 2;
        private static final int STATE_NO_LOADED = 0;

        private DownloadProxyState() {
        }
    }

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (TPPlayManagerImpl.this.mPlayListener == null) {
                TPLogUtil.m21894e(TPPlayManagerImpl.TAG, "handleMessage failed, mPlayListener is null and return");
                return;
            }
            int i = message.what;
            if (i == TPPlayManagerImpl.MSG_GLOBAL_EVENT) {
                TPPlayManagerImpl.this.handleGlobalEvent(message.arg1);
            } else if (i != TPPlayManagerImpl.MSG_NETWORK_STATUS_EVENT) {
                switch (i) {
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_FINISH /*4097*/:
                        TPPlayManagerImpl.this.mPlayListener.onDownloadFinish();
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_ERROR /*4098*/:
                        TPPlayManagerImpl.this.mPlayListener.onDownloadError(message.arg1, message.arg2, (String) message.obj);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_UPDATE /*4099*/:
                        TPPlayManagerImpl.this.mPlayListener.onDownloadCdnUrlUpdate((String) message.obj);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_INFO_UPDATE /*4100*/:
                        TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (TPPlayerMsg.TPCDNURLInfo) message.obj;
                        TPPlayManagerImpl.this.mPlayListener.onDownloadCdnUrlInfoUpdate(tPCDNURLInfo.url, tPCDNURLInfo.cdnIp, tPCDNURLInfo.uIp, tPCDNURLInfo.errorStr);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_STATUS_UPDATE /*4101*/:
                        TPPlayManagerImpl.this.mPlayListener.onDownloadStatusUpdate(message.arg1);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_PROTOCOL_UPDATE /*4102*/:
                        TPPlayerMsg.TPProtocolInfo tPProtocolInfo = (TPPlayerMsg.TPProtocolInfo) message.obj;
                        TPPlayManagerImpl.this.mPlayListener.onDownloadProtocolUpdate(tPProtocolInfo.protocolName, tPProtocolInfo.protocolVersion);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_EXPERIED /*4103*/:
                        TPPlayManagerImpl.this.mPlayListener.onDownloadCdnUrlExpired((Map) message.obj);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_PLAY_BACK /*4104*/:
                        TPMessageParams tPMessageParams = (TPMessageParams) message.obj;
                        TPOnPlayCallBackParams tPOnPlayCallBackParams = (TPOnPlayCallBackParams) tPMessageParams.params;
                        tPMessageParams.result.setResult(TPPlayManagerImpl.this.mPlayListener.onPlayCallback(tPOnPlayCallBackParams.messageType, tPOnPlayCallBackParams.ext1, tPOnPlayCallBackParams.ext2, tPOnPlayCallBackParams.ext3, tPOnPlayCallBackParams.ext4));
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_LONG_GET_PLAY_INFO /*4105*/:
                        TPMessageParams tPMessageParams2 = (TPMessageParams) message.obj;
                        tPMessageParams2.result.setResult(TPPlayManagerImpl.this.mPlayListener.getPlayInfo(((Long) tPMessageParams2.params).longValue()));
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_PROGRESS_UPDARE /*4106*/:
                        TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (TPPlayerMsg.TPDownLoadProgressInfo) message.obj;
                        TPPlayManagerImpl.this.mPlayListener.onDownloadProgressUpdate((int) tPDownLoadProgressInfo.playableDurationMS, tPDownLoadProgressInfo.downloadSpeedKBps, tPDownLoadProgressInfo.currentDownloadSize, tPDownLoadProgressInfo.totalFileSize, tPDownLoadProgressInfo.extraInfo);
                        return;
                    case TPPlayManagerImpl.MSG_DOWN_LOAD_STRING_GET_PLAY_INFO /*4107*/:
                        TPMessageParams tPMessageParams3 = (TPMessageParams) message.obj;
                        tPMessageParams3.result.setResult(TPPlayManagerImpl.this.mPlayListener.getPlayInfo((String) tPMessageParams3.params));
                        return;
                    default:
                        return;
                }
            } else {
                TPPlayManagerImpl.this.handleNetworkStatusEvent(message.arg1);
            }
        }
    }

    public static class TPDefTaskModel {
        public long definitionID;
        public int proxyTaskID;

        public TPDefTaskModel(long j, int i) {
            this.definitionID = j;
            this.proxyTaskID = i;
        }
    }

    public static class TPDownloadSeqAndClipIndexMapping {
        public int clipIndex;
        public int downloadSeq;

        public TPDownloadSeqAndClipIndexMapping(int i, int i2) {
            this.downloadSeq = i;
            this.clipIndex = i2;
        }
    }

    public static class TPMessageParams {
        public Object params;
        public TPFutureResult result;

        private TPMessageParams() {
        }
    }

    public static class TPOnPlayCallBackParams {
        public Object ext1;
        public Object ext2;
        public Object ext3;
        public Object ext4;
        public int messageType;

        private TPOnPlayCallBackParams() {
        }
    }

    public TPPlayManagerImpl(Context context, Looper looper) {
        this.mContext = context;
        this.mHandler = new EventHandler(looper);
        TPGlobalEventNofication.addEventListener(this);
        TPNetworkChangeMonitor.getInstance().addOnNetStatusChangeListener(this);
        this.mInnerProxyListener = new InnerProxyListener();
        this.mPlayListener = new TPPlayProxyListenerEmptyImpl(TAG);
        this.mTrackProxyUrlPlayIdMap = new HashMap<>();
        this.mDownloadPramList = new ArrayList<>();
        this.mHandlerLock = new TPReadWriteLock();
    }

    private boolean addAudioTrack(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap hashMap = new HashMap();
        hashMap.put(TPDownloadProxyEnum.DLPARAM_DATA_TRANSFER_MODE, 1);
        return this.mDownloadProxy.setClipInfo(this.mPlayID, 2, str2, new TPDownloadParam(arrayList, 3, hashMap));
    }

    private Map<String, Object> buildTPProxyConfig() {
        HashMap hashMap = new HashMap();
        hashMap.put(TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE, Integer.valueOf((this.mEnableAdaptiveSwitch || this.mEnableSuggestedBitrateCallback) ? 1 : 0));
        hashMap.put(TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, Integer.valueOf(this.mEnableMultiNetworkCard ? 1 : 0));
        return hashMap;
    }

    private TPDownloadParam convertDownloadParam(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map, Map<String, Object> map2) {
        return TPProxyUtils.convertProxyDownloadParams(str, tPDownloadParamData, map, map2);
    }

    private List<ITPMediaTrackClip> getAssetClips(ITPMediaAsset iTPMediaAsset) {
        ITPMediaTrack iTPMediaTrack;
        if (iTPMediaAsset instanceof TPMediaComposition) {
            List<ITPMediaTrack> allAVTracks = ((TPMediaComposition) iTPMediaAsset).getAllAVTracks();
            if (TPCommonUtils.isEmpty((Collection<? extends Object>) allAVTracks) || (iTPMediaTrack = allAVTracks.get(0)) == null || TPCommonUtils.isEmpty((Collection<? extends Object>) iTPMediaTrack.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack.getAllTrackClips();
        } else if (iTPMediaAsset instanceof ITPMediaTrack) {
            ITPMediaTrack iTPMediaTrack2 = (ITPMediaTrack) iTPMediaAsset;
            if (!TPCommonUtils.isEmpty((Collection<? extends Object>) iTPMediaTrack2.getAllTrackClips())) {
                return iTPMediaTrack2.getAllTrackClips();
            }
            return null;
        } else if (!(iTPMediaAsset instanceof ITPMediaTrackClip)) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add((ITPMediaTrackClip) iTPMediaAsset);
            return arrayList;
        }
    }

    private TPDownloadParamData getDownloadParamDataWithIndex(ArrayList<TPDownloadParamData> arrayList, int i) {
        if (TPCommonUtils.isEmpty((Collection<? extends Object>) arrayList) || i >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i);
    }

    private String getFileId() {
        return this.mFileID;
    }

    /* access modifiers changed from: private */
    public Object getFutureResult(TPFutureResult tPFutureResult) {
        try {
            return tPFutureResult.getResult(500);
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, "onPlayCallback getResult has exception:" + th.toString());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void handleGlobalEvent(int i) {
        switch (i) {
            case 100001:
                pushEventByInner(13);
                return;
            case 100002:
                pushEventByInner(14);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public void handleIsActive() {
        try {
            this.mDownloadProxy.setPlayState(this.mPlayID, this.mIsActive ? 101 : 100);
        } catch (Throwable th) {
            TPLogUtil.m21895e(TAG, th);
        }
    }

    /* access modifiers changed from: private */
    public void handleNetworkStatusEvent(int i) {
        if (i == 1) {
            pushEventByInner(1);
            pushEventByInner(10);
        } else if (i == 2) {
            pushEventByInner(2);
            pushEventByInner(9);
        } else if (i == 3) {
            pushEventByInner(2);
            pushEventByInner(10);
        }
    }

    private boolean initProxy() {
        if (this.mServiceType == -1) {
            this.mServiceType = TPProxyConfig.getDefaultServiceType();
        }
        ITPProxyManagerAdapter playerProxy = TPProxyGlobalManager.getInstance().getPlayerProxy(this.mServiceType);
        if (playerProxy == null || playerProxy.getDownloadProxy() == null) {
            TPLogUtil.m21894e(TAG, "initProxy failed, serviceType:" + this.mServiceType + ", playProxyManager:" + playerProxy);
            return false;
        }
        ITPDownloadProxy downloadProxy = playerProxy.getDownloadProxy();
        this.mDownloadProxy = downloadProxy;
        downloadProxy.setUserData(TPDownloadProxyEnum.USER_IS_VIP, Boolean.valueOf(TPPlayerConfig.isUserIsVip()));
        if (!TextUtils.isEmpty(TPPlayerConfig.getUserUin())) {
            this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UIN, TPPlayerConfig.getUserUin());
        }
        if (!TextUtils.isEmpty(TPPlayerConfig.getAppVersionName(this.mContext))) {
            this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_APP_VERSION, TPPlayerConfig.getAppVersionName(this.mContext));
        }
        if (TPPlayerConfig.getBuildNumber(this.mContext) != -1) {
            this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_APP_VERSION_CODE, String.valueOf(TPPlayerConfig.getBuildNumber(this.mContext)));
        }
        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, TPPlayerConfig.getUserUpc());
        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(TPPlayerConfig.getUserUpcState()));
        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, TPPlayerConfig.getOutNetIp());
        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.TAB_ABUSERID, TPPlayerConfig.getAbUserId());
        return true;
    }

    /* access modifiers changed from: private */
    public void internalMessage(int i, Object obj) {
        internalMessage(i, 0, 0, obj, false, false, 0);
    }

    /* access modifiers changed from: private */
    public boolean isInitDownloadProxyFailed() {
        boolean z = true;
        if (!TPProxyConfig.isProxyEnable()) {
            TPLogUtil.m21894e(TAG, "config set don't use p2p proxy!");
            return true;
        }
        try {
            this.mDownloadProxyRWLock.readLock().lock();
            if (this.mLoadProxyState == 1 || this.mLoadProxyState == 3) {
                this.mDownloadProxyRWLock.readLock().unlock();
                return true;
            }
            try {
                this.mDownloadProxyRWLock.writeLock().lock();
                if (this.mLoadProxyState == 0) {
                    this.mLoadProxyState = initProxy() ? 2 : 1;
                }
                if (this.mLoadProxyState != 1) {
                    z = false;
                }
                return z;
            } finally {
                this.mDownloadProxyRWLock.writeLock().unlock();
            }
        } finally {
            this.mDownloadProxyRWLock.readLock().unlock();
        }
    }

    private String messageToCommand(int i) {
        switch (i) {
            case MSG_DOWN_LOAD_FINISH /*4097*/:
                return "onDownloadFinish";
            case MSG_DOWN_LOAD_ERROR /*4098*/:
                return "onDownloadError";
            case MSG_DOWN_LOAD_CDN_URL_UPDATE /*4099*/:
                return "onDownloadCdnUrlUpdate";
            case MSG_DOWN_LOAD_CDN_INFO_UPDATE /*4100*/:
                return "onDownloadCdnUrlInfoUpdate";
            case MSG_DOWN_LOAD_STATUS_UPDATE /*4101*/:
                return "onDownloadStatusUpdate";
            case MSG_DOWN_LOAD_PROTOCOL_UPDATE /*4102*/:
                return "onDownloadProtocolUpdate";
            case MSG_DOWN_LOAD_CDN_URL_EXPERIED /*4103*/:
                return "onDownloadCdnUrlExpired";
            case MSG_DOWN_LOAD_PLAY_BACK /*4104*/:
                return "onPlayCallback";
            case MSG_DOWN_LOAD_LONG_GET_PLAY_INFO /*4105*/:
            case MSG_DOWN_LOAD_STRING_GET_PLAY_INFO /*4107*/:
                return "getPlayInfo";
            case MSG_DOWN_LOAD_PROGRESS_UPDARE /*4106*/:
                return "onDownloadProgressUpdate";
            default:
                return "unknown";
        }
    }

    private void releaseHandler() {
        TPLogUtil.m21897i(TAG, "inner event : release handler");
        this.mHandlerLock.writeLock().lock();
        EventHandler eventHandler = this.mHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages((Object) null);
            this.mHandler = null;
        }
        this.mHandlerLock.writeLock().unlock();
    }

    private void reset() {
        TPLogUtil.m21897i(TAG, "reset");
        this.mFileID = "";
        this.mOriginUrl = "";
        this.mVideoInfo = null;
        this.mStartTimeMs = 0;
        this.mSkipEndTimeMs = 0;
        this.mIsRemuxer = false;
        this.mIsActive = true;
        this.mEnableSuggestedBitrateCallback = false;
        this.mEnableAdaptiveSwitch = false;
        this.mEnableMultiNetworkCard = false;
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mDownloadPramList)) {
            this.mDownloadPramList.clear();
        }
        this.mDownloadProxyRWLock.writeLock().lock();
        this.mLoadProxyState = 0;
        this.mServiceType = -1;
        this.mDownloadProxy = null;
        this.mDownloadProxyRWLock.writeLock().unlock();
        this.mMaxBitrateBps = 100000000;
    }

    private void setPlayUserData() {
        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, Long.valueOf(this.mStartTimeMs));
        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Long.valueOf(this.mSkipEndTimeMs));
    }

    private int startClipPlay(List<ITPMediaTrackClip> list, String str, ArrayList<TPDownloadParamData> arrayList) {
        if (TPCommonUtils.isEmpty((Collection<? extends Object>) list)) {
            TPLogUtil.m21899w(TAG, "clipList is empty, return");
            return -1;
        }
        int size = list.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            ITPMediaTrackClip iTPMediaTrackClip = list.get(i2);
            if ((iTPMediaTrackClip instanceof TPMediaCompositionTrackClip) && TPCommonUtils.isUrl(((TPMediaCompositionTrackClip) iTPMediaTrackClip).getFilePath())) {
                linkedHashMap.put(iTPMediaTrackClip, new TPDownloadSeqAndClipIndexMapping(i, i2));
                i++;
            }
        }
        if (TPCommonUtils.isEmpty((Map<? extends Object, ? extends Object>) linkedHashMap)) {
            TPLogUtil.m21897i(TAG, "all urls is local file url, return");
            return -1;
        }
        int startClipPlay = this.mDownloadProxy.startClipPlay(str, linkedHashMap.size(), this.mInnerProxyListener);
        if (startClipPlay > 0) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                ITPMediaTrackClip iTPMediaTrackClip2 = (ITPMediaTrackClip) entry.getKey();
                TPDownloadSeqAndClipIndexMapping tPDownloadSeqAndClipIndexMapping = (TPDownloadSeqAndClipIndexMapping) entry.getValue();
                if (iTPMediaTrackClip2 instanceof TPMediaCompositionTrackClip) {
                    TPMediaCompositionTrackClip tPMediaCompositionTrackClip = (TPMediaCompositionTrackClip) iTPMediaTrackClip2;
                    TPDownloadParamData downloadParamDataWithIndex = getDownloadParamDataWithIndex(arrayList, tPDownloadSeqAndClipIndexMapping.clipIndex);
                    if (downloadParamDataWithIndex == null) {
                        TPLogUtil.m21894e(TAG, "fatal err, paramData is null.");
                        return -1;
                    }
                    TPLogUtil.m21894e(TAG, "multi trackClipIndex:" + tPDownloadSeqAndClipIndexMapping.clipIndex + ", download seq:" + tPDownloadSeqAndClipIndexMapping.downloadSeq + ", clip.url:" + tPMediaCompositionTrackClip.getUrl() + ", clip.getFilePath:" + tPMediaCompositionTrackClip.getFilePath() + ", paramData.savePath:" + downloadParamDataWithIndex.getSavePath() + ", paramData.DownloadFileID:" + downloadParamDataWithIndex.getDownloadFileID());
                    if (this.mDownloadProxy.setClipInfo(startClipPlay, tPDownloadSeqAndClipIndexMapping.downloadSeq, downloadParamDataWithIndex.getDownloadFileID(), convertDownloadParam(tPMediaCompositionTrackClip.getFilePath(), downloadParamDataWithIndex, tPMediaCompositionTrackClip.getHttpHeader(), buildTPProxyConfig()))) {
                        tPMediaCompositionTrackClip.setFilePath(this.mDownloadProxy.getClipPlayUrl(startClipPlay, tPDownloadSeqAndClipIndexMapping.downloadSeq, 1));
                    }
                }
            }
        } else {
            TPLogUtil.m21894e(TAG, "p2p proxy start clip play failed, cause : playId < 0");
        }
        return startClipPlay;
    }

    private ITPMediaAsset startDownloadPlayByClipAsset(ITPMediaAsset iTPMediaAsset) {
        List<ITPMediaTrackClip> assetClips = getAssetClips(iTPMediaAsset);
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) assetClips)) {
            this.mPlayID = startClipPlay(assetClips, getFileId(), this.mDownloadPramList);
            handleIsActive();
            updateProxyTaskInfo();
        }
        return iTPMediaAsset;
    }

    private ITPMediaAsset startDownloadPlayByDRMAsset(TPMediaDRMAsset tPMediaDRMAsset) {
        tPMediaDRMAsset.setDrmPlayUrl(startDownloadPlay(tPMediaDRMAsset.getDrmPlayUrl(), tPMediaDRMAsset.getHttpHeader()).getSelfPlayerUrl());
        return tPMediaDRMAsset;
    }

    private ITPMediaAsset startDownloadPlayByUrlAsset(TPMediaUrlAsset tPMediaUrlAsset) {
        tPMediaUrlAsset.setStreamUrl(startDownloadPlay(tPMediaUrlAsset.getStreamUrl(), tPMediaUrlAsset.getHttpHeader()).getSelfPlayerUrl());
        return tPMediaUrlAsset;
    }

    private ITPMediaAsset startSwitchDefTaskByClipAsset(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo) {
        List<ITPMediaTrackClip> assetClips = getAssetClips(iTPMediaAsset);
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) assetClips) && tPVideoInfo != null) {
            int startClipPlay = startClipPlay(assetClips, tPVideoInfo.getProxyFileID(), tPVideoInfo.getDownloadPraramList());
            if (startClipPlay > 0) {
                this.mPendingDefTaskQueue.offer(new TPDefTaskModel(j, startClipPlay));
                TPLogUtil.m21897i(TAG, "p2p proxy switch def sucess, defId:" + j + ",playId:" + startClipPlay);
                return iTPMediaAsset;
            }
            TPLogUtil.m21894e(TAG, "p2p proxy switch clip def failed, cause : playId < 0");
        }
        return iTPMediaAsset;
    }

    private ITPMediaAsset startSwitchDefTaskByDRMAsset(ITPMediaDRMAsset iTPMediaDRMAsset, long j, TPVideoInfo tPVideoInfo) {
        iTPMediaDRMAsset.setDrmPlayUrl(startSwitchDefTask(j, iTPMediaDRMAsset.getDrmPlayUrl(), (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) ? null : tPVideoInfo.getDownloadPraramList().get(0), iTPMediaDRMAsset.getHttpHeader()).getSelfPlayerUrl());
        return iTPMediaDRMAsset;
    }

    private ITPMediaAsset startSwitchDefTaskByUrlAsset(TPMediaUrlAsset tPMediaUrlAsset, long j, TPVideoInfo tPVideoInfo) {
        tPMediaUrlAsset.setStreamUrl(startSwitchDefTask(j, tPMediaUrlAsset.getStreamUrl(), tPVideoInfo, tPMediaUrlAsset.getHttpHeader()).getSelfPlayerUrl());
        return tPMediaUrlAsset;
    }

    private void updateProxyTaskInfo() {
        int i = this.mPlayID;
        if (i > 0) {
            this.mDownloadProxy.updateTaskInfo(i, TPDownloadProxyEnum.TASKINFO_ADAPTIVE_DYNAMIC_SWITCH, Integer.valueOf((this.mEnableSuggestedBitrateCallback || this.mEnableAdaptiveSwitch) ? 1 : 0));
            this.mDownloadProxy.updateTaskInfo(this.mPlayID, TPDownloadProxyEnum.TASKINFO_MAX_BITRATE, Long.valueOf(this.mMaxBitrateBps));
            this.mDownloadProxy.updateTaskInfo(this.mPlayID, TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, Integer.valueOf(this.mEnableMultiNetworkCard ? 1 : 0));
        }
    }

    private void updateVideoInfo(TPVideoInfo tPVideoInfo) {
        if (!isInitDownloadProxyFailed()) {
            this.mVideoInfo = tPVideoInfo;
            if (tPVideoInfo == null || tPVideoInfo.getDownloadPraramList() == null) {
                TPLogUtil.m21899w(TAG, "video or downloadParamList is null, return");
            } else if (this.mPlayID <= 0) {
                TPLogUtil.m21899w(TAG, "p2p proxy not start, return");
            } else {
                ArrayList<TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
                for (int i = 0; i < downloadPraramList.size(); i++) {
                    TPDownloadParamData tPDownloadParamData = downloadPraramList.get(i);
                    if (!this.mDownloadProxy.setClipInfo(this.mPlayID, tPDownloadParamData.getClipNo(), tPDownloadParamData.getDownloadFileID(), convertDownloadParam(tPDownloadParamData.getUrl(), tPDownloadParamData, (Map<String, String>) null, buildTPProxyConfig()))) {
                        TPLogUtil.m21899w(TAG, "setClipInfo failed, playID:" + this.mPlayID + ", clipNo:" + tPDownloadParamData.getClipNo() + ", downloadFileID:" + tPDownloadParamData.getDownloadFileID());
                    }
                }
            }
        }
    }

    public String getPlayErrorCodeStr() {
        if (isInitDownloadProxyFailed()) {
            return null;
        }
        try {
            return this.mDownloadProxy.getPlayErrorCodeStr(this.mPlayID);
        } catch (Throwable th) {
            TPLogUtil.m21895e(TAG, th);
            return null;
        }
    }

    public ITPPlayerProxyListener getTPPlayerProxyListener() {
        return this.mPlayerProxyListener;
    }

    public boolean hasWaitDefTask() {
        if (isInitDownloadProxyFailed()) {
            return false;
        }
        return !this.mPendingDefTaskQueue.isEmpty();
    }

    public boolean isEnable() {
        return !isInitDownloadProxyFailed();
    }

    public boolean isUseResourceLoader() {
        return this.mIsUseResourceLoader;
    }

    public void onEvent(int i, int i2, int i3, Object obj) {
        TPLogUtil.m21897i(TAG, "onEvent eventId: " + i + ", arg1: " + i2 + ", arg2: " + i3 + ", object" + obj);
        internalMessage(MSG_GLOBAL_EVENT, i, 0, (Object) null, false, false, 0);
    }

    public void onStatusChanged(int i, int i2, int i3, int i4) {
        TPLogUtil.m21893d(TAG, "onNetworkStatusChanged oldNetStatus: " + i + ", netStatus: " + i2);
        internalMessage(MSG_NETWORK_STATUS_EVENT, i2, 0, (Object) null, false, false, 0);
    }

    public void pauseDownload() {
        if (!isInitDownloadProxyFailed()) {
            pauseDownload(this.mPlayID);
            if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mPendingDefTaskQueue)) {
                for (TPDefTaskModel next : this.mPendingDefTaskQueue) {
                    if (next != null) {
                        pauseDownload(next.proxyTaskID);
                    }
                }
            }
            if (!TPCommonUtils.isEmpty((Map<? extends Object, ? extends Object>) this.mTrackProxyUrlPlayIdMap)) {
                for (Integer intValue : this.mTrackProxyUrlPlayIdMap.values()) {
                    pauseDownload(intValue.intValue());
                }
            }
        }
    }

    public void playerSwitchDefComplete(long j) {
        if (!isInitDownloadProxyFailed()) {
            try {
                if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mPendingDefTaskQueue)) {
                    TPDefTaskModel peek = this.mPendingDefTaskQueue.peek();
                    while (peek != null && peek.definitionID != j) {
                        TPLogUtil.m21897i(TAG, "stop proxy definitionID:" + peek.definitionID + ", taskID:" + peek.proxyTaskID);
                        stopDownload(peek.proxyTaskID);
                        this.mPendingDefTaskQueue.removeFirst();
                        peek = this.mPendingDefTaskQueue.peek();
                    }
                    if (peek != null) {
                        TPLogUtil.m21897i(TAG, "stop proxy task id:" + peek.proxyTaskID);
                        stopDownload(this.mPlayID);
                        this.mPlayID = peek.proxyTaskID;
                        handleIsActive();
                        updateProxyTaskInfo();
                        this.mPendingDefTaskQueue.remove(peek);
                    }
                }
            } catch (Exception e) {
                TPLogUtil.m21896e(TAG, e, "playerSwitchDefComplete exception");
            }
        }
    }

    public void pushEvent(final int i) {
        this.mHandlerLock.readLock().lock();
        EventHandler eventHandler = this.mHandler;
        if (eventHandler == null) {
            TPLogUtil.m21894e(TAG, "pushEvent event=" + i + " already release");
            return;
        }
        eventHandler.post(new Runnable() {
            public void run() {
                if (!TPPlayManagerImpl.this.isInitDownloadProxyFailed()) {
                    try {
                        TPPlayManagerImpl.this.pushEventByInner(TPProxyEnumUtils.eventID2Inner(i));
                    } catch (IllegalArgumentException e) {
                        TPLogUtil.m21895e(TPPlayManagerImpl.TAG, (Throwable) e);
                    }
                }
            }
        });
        this.mHandlerLock.readLock().unlock();
    }

    public void pushEventByInner(int i) {
        if (!isInitDownloadProxyFailed()) {
            try {
                this.mDownloadProxy.pushEvent(i);
            } catch (Throwable th) {
                TPLogUtil.m21896e(TAG, th, "p2p proxy pushEvent failed, event:" + i);
            }
        }
    }

    public void release() {
        stopDownload();
        TPNetworkChangeMonitor.getInstance().removeOnNetStatusChangeListener(this);
        TPGlobalEventNofication.removeEventListener(this);
        releaseHandler();
        this.mPlayerProxyListener = null;
        this.mPlayListener = new TPPlayProxyListenerEmptyImpl(TAG);
        this.mInnerProxyListener = null;
        this.mDownloadProxyRWLock.writeLock().lock();
        this.mLoadProxyState = 3;
        this.mServiceType = -1;
        this.mDownloadProxy = null;
        this.mDownloadProxyRWLock.writeLock().unlock();
    }

    public void resumeDownload() {
        if (!isInitDownloadProxyFailed()) {
            resumeDownload(this.mPlayID);
            if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mPendingDefTaskQueue)) {
                for (TPDefTaskModel next : this.mPendingDefTaskQueue) {
                    if (next != null) {
                        resumeDownload(next.proxyTaskID);
                    }
                }
            }
            if (!TPCommonUtils.isEmpty((Map<? extends Object, ? extends Object>) this.mTrackProxyUrlPlayIdMap)) {
                for (Integer intValue : this.mTrackProxyUrlPlayIdMap.values()) {
                    resumeDownload(intValue.intValue());
                }
            }
        }
    }

    public void setIsActive(boolean z) {
        this.mHandlerLock.readLock().lock();
        if (this.mHandler == null) {
            TPLogUtil.m21894e(TAG, "setIsActive isActive=" + z);
            return;
        }
        TPLogUtil.m21893d(TAG, "setIsActive: " + z);
        this.mIsActive = z;
        this.mHandler.post(new Runnable() {
            public void run() {
                if (!TPPlayManagerImpl.this.isInitDownloadProxyFailed()) {
                    TPPlayManagerImpl.this.handleIsActive();
                }
            }
        });
        this.mHandlerLock.readLock().unlock();
    }

    public void setIsUseResourceLoader(boolean z) {
        this.mIsUseResourceLoader = z;
    }

    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
    }

    public void setPlayListener(ITPPlayListener iTPPlayListener) {
        if (iTPPlayListener == null) {
            this.mPlayListener = new TPPlayProxyListenerEmptyImpl(TAG);
        } else {
            this.mPlayListener = iTPPlayListener;
        }
    }

    public void setPlaySpeedRatio(float f) {
        if (!isInitDownloadProxyFailed()) {
            if (f <= 0.0f) {
                TPLogUtil.m21894e(TAG, "set play speed ratio, value invalid:" + f);
                return;
            }
            TPLogUtil.m21897i(TAG, "set play speed value to proxy:" + f);
            this.mDownloadProxy.updateTaskInfo(this.mPlayID, TPDownloadProxyEnum.TASKINFO_SPEED_RATIO, Float.valueOf(f));
        }
    }

    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (isInitDownloadProxyFailed() || tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 100) {
            this.mStartTimeMs = tPOptionalParam.getParamLong().value;
        } else if (tPOptionalParam.getKey() == 500) {
            long j = tPOptionalParam.getParamLong().value;
            this.mSkipEndTimeMs = j;
            if (this.mPlayID > 0) {
                this.mDownloadProxy.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Long.valueOf(j));
            }
        } else if (tPOptionalParam.getKey() == 503) {
            this.mMaxBitrateBps = tPOptionalParam.getParamLong().param1;
            updateProxyTaskInfo();
        } else if (tPOptionalParam.getKey() == 508) {
            this.mEnableSuggestedBitrateCallback = tPOptionalParam.getParamBoolean().value;
            updateProxyTaskInfo();
        } else if (tPOptionalParam.getKey() == 504) {
            this.mEnableAdaptiveSwitch = tPOptionalParam.getParamLong().value != 0;
            updateProxyTaskInfo();
        } else if (tPOptionalParam.getKey() == 509) {
            this.mEnableMultiNetworkCard = tPOptionalParam.getParamBoolean().value;
            updateProxyTaskInfo();
        }
    }

    public void setProxyPlayState(int i) {
        TPLogUtil.m21893d(TAG, "setProxyPlayState: " + i);
        if (!isInitDownloadProxyFailed()) {
            try {
                this.mDownloadProxy.setPlayState(this.mPlayID, i);
                if ((i == 5 || i == 0) && !TPCommonUtils.isEmpty((Collection<? extends Object>) this.mPendingDefTaskQueue)) {
                    for (TPDefTaskModel next : this.mPendingDefTaskQueue) {
                        if (next != null) {
                            TPLogUtil.m21897i(TAG, "setProxyPlayState definitionID:" + next.definitionID + ", taskID:" + next.proxyTaskID + ", state:" + i);
                            this.mDownloadProxy.setPlayState(next.proxyTaskID, i);
                        }
                    }
                }
            } catch (Throwable th) {
                TPLogUtil.m21895e(TAG, th);
            }
        }
    }

    public void setProxyServiceType(int i) {
        this.mServiceType = i;
    }

    public void setTPPlayerProxyListener(ITPPlayerProxyListener iTPPlayerProxyListener) {
        this.mPlayerProxyListener = iTPPlayerProxyListener;
    }

    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo == null) {
            TPLogUtil.m21894e(TAG, "setVideoInfo, param is null ");
            return;
        }
        if (this.mVideoInfo != null) {
            updateVideoInfo(tPVideoInfo);
        }
        this.mVideoInfo = tPVideoInfo;
        TPLogUtil.m21897i(TAG, "setVideoInfo, enter");
        this.mFileID = tPVideoInfo.getProxyFileID();
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mDownloadPramList)) {
            this.mDownloadPramList.clear();
        }
        if (tPVideoInfo.getDownloadPraramList() != null && tPVideoInfo.getDownloadPraramList().size() > 0) {
            this.mDownloadPramList.addAll(tPVideoInfo.getDownloadPraramList());
        }
    }

    public String startDownLoadTrackUrl(int i, String str, TPDownloadParamData tPDownloadParamData) {
        String str2;
        TPDownloadParam tPDownloadParam;
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.m21899w(TAG, "return coz url is empty");
            return str;
        } else if (!TPCommonUtils.isUrl(str)) {
            TPLogUtil.m21899w(TAG, "return coz url is locol url, not need use proxy");
            return str;
        } else if (isInitDownloadProxyFailed()) {
            TPLogUtil.m21899w(TAG, "return coz download proxy init failed");
            return str;
        } else {
            int i2 = 2;
            int i3 = 1;
            if (tPDownloadParamData != null) {
                try {
                    tPDownloadParam = TPProxyUtils.convertProxyDownloadParams(str, tPDownloadParamData, (Map<String, String>) null, (Map<String, Object>) null);
                    if (tPDownloadParamData.getTaskType() != 1) {
                        i2 = 1;
                    }
                    str2 = tPDownloadParamData.getDownloadFileID();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = TPCommonUtils.getMd5(str);
                    }
                    i3 = i2;
                } catch (Throwable th) {
                    TPLogUtil.m21894e(TAG, "p2p proxy start play failed:" + th);
                    return str;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                int i4 = 0;
                if (i == 2) {
                    i4 = 3;
                }
                tPDownloadParam = new TPDownloadParam(arrayList, i4, (Map<String, Object>) null);
                str2 = TPCommonUtils.getMd5(str);
            }
            int startPlay = this.mDownloadProxy.startPlay(str2, tPDownloadParam, this.mInnerProxyListener);
            if (startPlay > 0) {
                TPLogUtil.m21897i(TAG, "p2p proxy start play, url type" + i3);
                String playUrl = this.mDownloadProxy.getPlayUrl(startPlay, i3);
                this.mTrackProxyUrlPlayIdMap.put(playUrl, Integer.valueOf(startPlay));
                return playUrl;
            }
            TPLogUtil.m21894e(TAG, "p2p proxy start play failed, cause : playId <= 0");
            return str;
        }
    }

    public TPUrlDataSource startDownloadPlay(String str, Map<String, String> map) {
        TPUrlDataSource tPUrlDataSource = new TPUrlDataSource(str);
        if (!TPCommonUtils.isUrl(str) || isInitDownloadProxyFailed()) {
            return tPUrlDataSource;
        }
        setPlayUserData();
        this.mOriginUrl = str;
        TPDownloadParamData downloadParamDataWithIndex = getDownloadParamDataWithIndex(this.mDownloadPramList, 0);
        if (this.mIsUseResourceLoader && downloadParamDataWithIndex != null && downloadParamDataWithIndex.getDlType() == 1) {
            downloadParamDataWithIndex = new TPDownloadParamData(11);
        }
        TPDownloadParam convertDownloadParam = downloadParamDataWithIndex != null ? convertDownloadParam(str, downloadParamDataWithIndex, map, buildTPProxyConfig()) : null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("single url:");
            sb.append(str);
            sb.append(", paramData.savePath:");
            String str2 = "null";
            sb.append(downloadParamDataWithIndex != null ? downloadParamDataWithIndex.getSavePath() : str2);
            sb.append(", paramData.DownloadFileID:");
            if (downloadParamDataWithIndex != null) {
                str2 = downloadParamDataWithIndex.getDownloadFileID();
            }
            sb.append(str2);
            TPLogUtil.m21897i(TAG, sb.toString());
            int startPlay = this.mDownloadProxy.startPlay(getFileId(), convertDownloadParam, this.mInnerProxyListener);
            if (startPlay > 0) {
                String playUrl = this.mDownloadProxy.getPlayUrl(startPlay, 0);
                if (TextUtils.isEmpty(playUrl)) {
                    playUrl = str;
                }
                TPLogUtil.m21897i(TAG, "startDownloadPlay, playId:" + startPlay);
                tPUrlDataSource.setSelfPlayerUrl(playUrl);
                String playUrl2 = this.mDownloadProxy.getPlayUrl(startPlay, 1);
                if (!TextUtils.isEmpty(playUrl2)) {
                    str = playUrl2;
                }
                tPUrlDataSource.setSystemPlayerUrl(str);
                this.mPlayID = startPlay;
                handleIsActive();
                updateProxyTaskInfo();
            } else {
                TPLogUtil.m21894e(TAG, "p2p proxy start play failed, cause : playId <= 0");
            }
        } catch (Throwable th) {
            TPLogUtil.m21896e(TAG, th, "p2p proxy start play failed");
        }
        return tPUrlDataSource;
    }

    public ITPMediaAsset startDownloadPlayByAsset(ITPMediaAsset iTPMediaAsset) {
        if (isInitDownloadProxyFailed()) {
            return iTPMediaAsset;
        }
        setPlayUserData();
        return iTPMediaAsset instanceof TPMediaDRMAsset ? startDownloadPlayByDRMAsset((TPMediaDRMAsset) iTPMediaAsset) : iTPMediaAsset instanceof TPMediaUrlAsset ? startDownloadPlayByUrlAsset((TPMediaUrlAsset) iTPMediaAsset) : startDownloadPlayByClipAsset(iTPMediaAsset);
    }

    public void startRemuxer(String str, String str2) {
        if (!TPCommonUtils.isUrl(str) || TextUtils.isEmpty(str2)) {
            TPLogUtil.m21894e(TAG, "startRemuxer, audioTrackUrl:" + str + ", keyId:" + str2);
        } else if (isInitDownloadProxyFailed()) {
            TPLogUtil.m21894e(TAG, "startRemuxer, download proxy init failed.");
        } else {
            if (this.mIsRemuxer) {
                int i = this.mPlayID;
                if (i > 0) {
                    stopDownload(i);
                }
                this.mPlayID = 0;
                startDownloadPlay(this.mOriginUrl, (Map<String, String>) null);
                if (!addAudioTrack(str, str2)) {
                    TPLogUtil.m21894e(TAG, "startRemuxer, addAudioTrack err.");
                    return;
                }
            } else if (!addAudioTrack(str, str2)) {
                TPLogUtil.m21894e(TAG, "startRemuxer, addAudioTrack err.");
                return;
            }
            this.mIsRemuxer = true;
        }
    }

    public TPUrlDataSource startSwitchDefTask(long j, String str, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        if (tPVideoInfo == null) {
            return new TPUrlDataSource(str);
        }
        TPDownloadParamData tPDownloadParamData = null;
        if (tPVideoInfo.getDownloadPraramList() != null && tPVideoInfo.getDownloadPraramList().size() > 0) {
            tPDownloadParamData = tPVideoInfo.getDownloadPraramList().get(0);
        }
        return startSwitchDefTask(j, str, tPDownloadParamData, map);
    }

    public ITPMediaAsset startSwitchDefTaskByAsset(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo) {
        return (isInitDownloadProxyFailed() || iTPMediaAsset == null || tPVideoInfo == null) ? iTPMediaAsset : iTPMediaAsset instanceof ITPMediaDRMAsset ? startSwitchDefTaskByDRMAsset((ITPMediaDRMAsset) iTPMediaAsset, j, tPVideoInfo) : iTPMediaAsset instanceof TPMediaUrlAsset ? startSwitchDefTaskByUrlAsset((TPMediaUrlAsset) iTPMediaAsset, j, tPVideoInfo) : startSwitchDefTaskByClipAsset(iTPMediaAsset, j, tPVideoInfo);
    }

    public void stopDownLoadTrackUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.m21899w(TAG, "return coz url is empty");
        } else if (isInitDownloadProxyFailed()) {
            TPLogUtil.m21899w(TAG, "return coz download proxy init failed");
        } else if (!this.mTrackProxyUrlPlayIdMap.containsKey(str)) {
            TPLogUtil.m21899w(TAG, "return, coz mTrackProxyUrlPlayIdMap not contain current proxy url:" + str + ", or it is not proxy url");
        } else {
            try {
                this.mDownloadProxy.stopPlay(this.mTrackProxyUrlPlayIdMap.get(str).intValue());
            } catch (Exception e) {
                TPLogUtil.m21894e(TAG, "p2p proxy stop play failed:" + e);
            }
        }
    }

    public void stopDownload() {
        TPLogUtil.m21897i(TAG, "stopDownload, playId:" + this.mPlayID);
        int i = this.mPlayID;
        if (i > 0) {
            stopDownload(i);
        }
        this.mPlayID = 0;
        if (!TPCommonUtils.isEmpty((Collection<? extends Object>) this.mPendingDefTaskQueue)) {
            for (TPDefTaskModel next : this.mPendingDefTaskQueue) {
                if (next != null) {
                    stopDownload(next.proxyTaskID);
                }
            }
            this.mPendingDefTaskQueue.clear();
        }
        if (!TPCommonUtils.isEmpty((Map<? extends Object, ? extends Object>) this.mTrackProxyUrlPlayIdMap)) {
            for (Integer intValue : this.mTrackProxyUrlPlayIdMap.values()) {
                stopDownload(intValue.intValue());
            }
            this.mTrackProxyUrlPlayIdMap.clear();
        }
        reset();
    }

    public void stopRemuxer() {
        if (isInitDownloadProxyFailed()) {
            TPLogUtil.m21894e(TAG, "stopRemuxer, download proxy init failed.");
            return;
        }
        if (this.mIsRemuxer) {
            int i = this.mPlayID;
            if (i > 0) {
                stopDownload(i);
            }
            this.mPlayID = 0;
            startDownloadPlay(this.mOriginUrl, (Map<String, String>) null);
        }
        this.mIsRemuxer = false;
    }

    /* access modifiers changed from: private */
    public void internalMessage(int i, int i2, int i3, Object obj, boolean z, boolean z2, long j) {
        this.mHandlerLock.readLock().lock();
        EventHandler eventHandler = this.mHandler;
        if (eventHandler == null) {
            TPLogUtil.m21897i(TAG, messageToCommand(i) + " , send failed , handler null");
            this.mHandlerLock.readLock().unlock();
        } else if (!z || obj != null) {
            if (z2) {
                eventHandler.removeMessages(i);
            }
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            obtainMessage.obj = obj;
            this.mHandler.sendMessageDelayed(obtainMessage, j);
            this.mHandlerLock.readLock().unlock();
        } else {
            TPLogUtil.m21897i(TAG, messageToCommand(i) + ", send failed , params null");
            this.mHandlerLock.readLock().unlock();
        }
    }

    private TPUrlDataSource startSwitchDefTask(long j, String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
        TPUrlDataSource tPUrlDataSource = new TPUrlDataSource(str);
        if (!TPCommonUtils.isUrl(str) || isInitDownloadProxyFailed()) {
            return tPUrlDataSource;
        }
        String str2 = null;
        TPDownloadParam convertDownloadParam = tPDownloadParamData != null ? convertDownloadParam(str, tPDownloadParamData, map, buildTPProxyConfig()) : null;
        if (tPDownloadParamData != null) {
            try {
                str2 = tPDownloadParamData.getDownloadFileID();
            } catch (Throwable th) {
                TPLogUtil.m21896e(TAG, th, "p2p proxy switch def failed");
            }
        }
        int startPlay = this.mDownloadProxy.startPlay(str2, convertDownloadParam, this.mInnerProxyListener);
        if (startPlay > 0) {
            String playUrl = this.mDownloadProxy.getPlayUrl(startPlay, 1);
            if (TextUtils.isEmpty(playUrl)) {
                playUrl = str;
            }
            tPUrlDataSource.setSelfPlayerUrl(playUrl);
            String playUrl2 = this.mDownloadProxy.getPlayUrl(startPlay, 0);
            if (!TextUtils.isEmpty(playUrl2)) {
                str = playUrl2;
            }
            tPUrlDataSource.setSystemPlayerUrl(str);
            this.mPendingDefTaskQueue.offer(new TPDefTaskModel(j, startPlay));
            TPLogUtil.m21897i(TAG, "p2p proxy switch def sucess, defId:" + j + ",playId:" + startPlay);
            return tPUrlDataSource;
        }
        TPLogUtil.m21894e(TAG, "p2p proxy switch def failed, cause : playId <= 0");
        return tPUrlDataSource;
    }

    public class InnerProxyListener implements ITPPlayListener {
        private InnerProxyListener() {
        }

        public long getAdvRemainTime() {
            return TPPlayManagerImpl.this.mPlayListener.getAdvRemainTime();
        }

        public String getContentType(int i, String str) {
            return TPPlayManagerImpl.this.mPlayListener.getContentType(i, str);
        }

        public int getCurrentPlayClipNo() {
            return TPPlayManagerImpl.this.mPlayListener.getCurrentPlayClipNo();
        }

        public long getCurrentPlayOffset() {
            return TPPlayManagerImpl.this.mPlayListener.getCurrentPlayOffset();
        }

        public long getCurrentPosition() {
            return TPPlayManagerImpl.this.mPlayListener.getCurrentPosition();
        }

        public String getDataFilePath(int i, String str) {
            return TPPlayManagerImpl.this.mPlayListener.getDataFilePath(i, str);
        }

        public long getDataTotalSize(int i, String str) {
            return TPPlayManagerImpl.this.mPlayListener.getDataTotalSize(i, str);
        }

        public Object getPlayInfo(long j) {
            TPFutureResult tPFutureResult = new TPFutureResult();
            TPMessageParams tPMessageParams = new TPMessageParams();
            tPMessageParams.params = Long.valueOf(j);
            tPMessageParams.result = tPFutureResult;
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_LONG_GET_PLAY_INFO, tPMessageParams);
            return TPPlayManagerImpl.this.getFutureResult(tPFutureResult);
        }

        public long getPlayerBufferLength() {
            return TPPlayManagerImpl.this.mPlayListener.getPlayerBufferLength();
        }

        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_EXPERIED, map);
        }

        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            tPCDNURLInfo.errorStr = str4;
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_INFO_UPDATE, tPCDNURLInfo);
        }

        public void onDownloadCdnUrlUpdate(String str) {
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_UPDATE, str);
        }

        public void onDownloadError(int i, int i2, String str) {
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_ERROR, i, i2, str, false, false, 0);
        }

        public void onDownloadFinish() {
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_FINISH, (Object) null);
        }

        public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
            TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = (long) i;
            tPDownLoadProgressInfo.downloadSpeedKBps = i2;
            tPDownLoadProgressInfo.currentDownloadSize = j;
            tPDownLoadProgressInfo.totalFileSize = j2;
            tPDownLoadProgressInfo.extraInfo = str;
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_PROGRESS_UPDARE, tPDownLoadProgressInfo);
        }

        public void onDownloadProtocolUpdate(String str, String str2) {
            TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_PROTOCOL_UPDATE, tPProtocolInfo);
        }

        public void onDownloadStatusUpdate(int i) {
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_STATUS_UPDATE, i, 0, (Object) null, false, false, 0);
        }

        public Object onPlayCallback(int i, Object obj, Object obj2, Object obj3, Object obj4) {
            TPOnPlayCallBackParams tPOnPlayCallBackParams = new TPOnPlayCallBackParams();
            tPOnPlayCallBackParams.messageType = i;
            tPOnPlayCallBackParams.ext1 = obj;
            tPOnPlayCallBackParams.ext2 = obj2;
            tPOnPlayCallBackParams.ext3 = obj3;
            tPOnPlayCallBackParams.ext4 = obj4;
            TPFutureResult tPFutureResult = new TPFutureResult();
            TPMessageParams tPMessageParams = new TPMessageParams();
            tPMessageParams.params = tPOnPlayCallBackParams;
            tPMessageParams.result = tPFutureResult;
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_PLAY_BACK, tPMessageParams);
            return TPPlayManagerImpl.this.getFutureResult(tPFutureResult);
        }

        public int onReadData(int i, String str, long j, long j2) {
            return TPPlayManagerImpl.this.mPlayListener.onReadData(i, str, j, j2);
        }

        public int onStartReadData(int i, String str, long j, long j2) {
            return TPPlayManagerImpl.this.mPlayListener.onStartReadData(i, str, j, j2);
        }

        public int onStopReadData(int i, String str, int i2) {
            return TPPlayManagerImpl.this.mPlayListener.onStopReadData(i, str, i2);
        }

        public Object getPlayInfo(String str) {
            TPFutureResult tPFutureResult = new TPFutureResult();
            TPMessageParams tPMessageParams = new TPMessageParams();
            tPMessageParams.params = str;
            tPMessageParams.result = tPFutureResult;
            TPPlayManagerImpl.this.internalMessage(TPPlayManagerImpl.MSG_DOWN_LOAD_STRING_GET_PLAY_INFO, tPMessageParams);
            return TPPlayManagerImpl.this.getFutureResult(tPFutureResult);
        }
    }

    private void pauseDownload(int i) {
        try {
            this.mDownloadProxy.pauseDownload(i);
        } catch (Throwable th) {
            TPLogUtil.m21896e(TAG, th, "p2p proxy pause download failed, taskId:" + i);
        }
    }

    private void resumeDownload(int i) {
        try {
            this.mDownloadProxy.resumeDownload(this.mPlayID);
        } catch (Throwable th) {
            TPLogUtil.m21896e(TAG, th, "p2p proxy resume download failed, taskId:" + i);
        }
    }

    private void stopDownload(int i) {
        if (!isInitDownloadProxyFailed()) {
            try {
                this.mDownloadProxy.stopPlay(i);
            } catch (Throwable th) {
                TPLogUtil.m21896e(TAG, th, "p2p proxy stop play failed, taskID:" + i);
            }
        }
    }
}
