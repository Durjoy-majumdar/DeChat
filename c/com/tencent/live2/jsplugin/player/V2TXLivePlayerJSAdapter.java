package com.tencent.live2.jsplugin.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C28637q;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.live2.impl.V2TXLiveUtils;
import com.tencent.live2.impl.p312a.C17634a;
import com.tencent.live2.jsplugin.JSAdapterOnlineLog;
import com.tencent.live2.jsplugin.LiveURLParser;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.live2.jsplugin.V2TXJSAdapterError;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.IXWebBroadcastListener;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class V2TXLivePlayerJSAdapter extends C17634a {
    private static final int FRAMEWORK_TYPE_LIVEV2_WXAPPLET = 9;
    private static final int FRAMEWORK_TYPE_WXROOM_WXAPPLET = 3;
    private static final String ROOM_PROTOCOL_PREFIX = "room";
    private static final String TAG = "V2TXLivePlayerJSAdapter";
    private TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeListener;
    private V2TXLivePlayerJSConfig mConfig;
    private boolean mIsInit;
    private boolean mNeedCompressSnapshot;
    private int mNetworkQuality;
    private ITXLivePlayListener mPlayListener;
    private V2TXLiveDef.V2TXLiveMode mPlayMode;
    private V2TXLivePlayer mPlayer;
    private String mPlayerId = "";
    private TXLivePlayer.ITXSnapshotListener mSnapshotListener;

    static {
        C28637q.m38304a();
    }

    public V2TXLivePlayerJSAdapter(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        V2TXLivePlayerImpl v2TXLivePlayerImpl = new V2TXLivePlayerImpl(context);
        this.mPlayer = v2TXLivePlayerImpl;
        v2TXLivePlayerImpl.setObserver(this);
        this.mNetworkQuality = 2;
        this.mConfig = new V2TXLivePlayerJSConfig();
    }

    private void apiOnlineError(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        if (!z || !checkIsRoomProtocolByUrl(this.mConfig.url)) {
            LiteavLog.m16898e(TAG, "V2TXLivePlayerJSAdapter(" + hashCode() + "-" + this.mPlayerId + ") " + str);
            return;
        }
        JSAdapterOnlineLog instance = JSAdapterOnlineLog.getInstance();
        instance.log("V2TXLivePlayerJSAdapter(" + hashCode() + "-" + this.mPlayerId + ") " + str, true);
    }

    private void apiOnlineLog(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        if (!z || !checkIsRoomProtocolByUrl(this.mConfig.url)) {
            LiteavLog.m16901i(TAG, "V2TXLivePlayerJSAdapter(" + hashCode() + "-" + this.mPlayerId + ") " + str);
            return;
        }
        JSAdapterOnlineLog instance = JSAdapterOnlineLog.getInstance();
        instance.log("V2TXLivePlayerJSAdapter(" + hashCode() + "-" + this.mPlayerId + ") " + str, true);
    }

    private void callbackSDKVersion() {
        ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, TXLiveBase.getSDKVersionStr());
            bundle.putLong("EVT_TIME", System.currentTimeMillis());
            iTXLivePlayListener.onPlayEvent(V2TXJSAdapterConstants.EVT_ID_SDK_VERSION, bundle);
        }
    }

    private boolean checkIsRoomProtocolByUrl(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(ROOM_PROTOCOL_PREFIX);
    }

    private String getPlayerIdByURL(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.startsWith(V2TXLiveUtils.TRTC_ADDRESS1)) {
                if (!str.startsWith(V2TXLiveUtils.TRTC_ADDRESS2)) {
                    return LiveURLParser.getStreamId(str);
                }
            }
            return LiveURLParser.getURLParams(str, "userid");
        } catch (Exception unused) {
            LiteavLog.m16898e(TAG, "getPlayerIdByURL fail, url:".concat(String.valueOf(str)));
            return "";
        }
    }

    private V2TXJSAdapterError initLivePlayerInner(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        if (bundle == null) {
            apiOnlineError("init player inner fail. invalid bundle params.", false);
            return new V2TXJSAdapterError(-1, "invalid params");
        } else if (this.mIsInit) {
            apiOnlineError("invalid operation. already init.", false);
            return new V2TXJSAdapterError(-1, "invalid operation. already init.");
        } else {
            if (tXCloudVideoView != null) {
                this.mPlayer.setRenderView(tXCloudVideoView);
            }
            apiOnlineLog("init player.", false);
            this.mIsInit = true;
            this.mConfig.updateFromBundle(bundle);
            this.mPlayerId = getPlayerIdByURL(this.mConfig.url);
            setFullParams(this.mConfig);
            return new V2TXJSAdapterError();
        }
    }

    private void setDiffParams(V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig, V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig2) {
        String diffConfig = v2TXLivePlayerJSConfig2.diffConfig(v2TXLivePlayerJSConfig);
        if (!TextUtils.isEmpty(diffConfig)) {
            apiOnlineLog("set diff config:".concat(String.valueOf(diffConfig)), true);
        }
        boolean z = v2TXLivePlayerJSConfig.isMuteVideo;
        boolean z2 = v2TXLivePlayerJSConfig2.isMuteVideo;
        if (z != z2) {
            if (z2) {
                this.mPlayer.pauseVideo();
            } else {
                this.mPlayer.resumeVideo();
            }
        }
        boolean z3 = v2TXLivePlayerJSConfig.isMuteAudio;
        boolean z4 = v2TXLivePlayerJSConfig2.isMuteAudio;
        if (z3 != z4) {
            if (z4) {
                this.mPlayer.pauseAudio();
            } else {
                this.mPlayer.resumeAudio();
            }
        }
        boolean z5 = v2TXLivePlayerJSConfig.enableRecvSEIMessage;
        boolean z6 = v2TXLivePlayerJSConfig2.enableRecvSEIMessage;
        if (z5 != z6) {
            this.mPlayer.enableReceiveSeiMessage(z6, 5);
            this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig2.enableRecvSEIMessage, 100);
            this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig2.enableRecvSEIMessage, 242);
            this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig2.enableRecvSEIMessage, 243);
        }
        boolean z7 = v2TXLivePlayerJSConfig.enableDebugView;
        boolean z8 = v2TXLivePlayerJSConfig2.enableDebugView;
        if (z7 != z8) {
            this.mPlayer.showDebugView(z8);
        }
        float f = v2TXLivePlayerJSConfig.minCache;
        float f2 = v2TXLivePlayerJSConfig2.minCache;
        if (!(f == f2 && v2TXLivePlayerJSConfig.maxCache == v2TXLivePlayerJSConfig2.maxCache)) {
            this.mPlayer.setCacheParams(Math.min(f2, v2TXLivePlayerJSConfig2.maxCache), Math.max(v2TXLivePlayerJSConfig2.minCache, v2TXLivePlayerJSConfig2.maxCache));
        }
        int i = v2TXLivePlayerJSConfig.volumeNotifyIntervals;
        int i2 = v2TXLivePlayerJSConfig2.volumeNotifyIntervals;
        if (i != i2) {
            this.mPlayer.enableVolumeEvaluation(i2);
        }
        V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode = v2TXLivePlayerJSConfig.fillMode;
        V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode2 = v2TXLivePlayerJSConfig2.fillMode;
        if (v2TXLiveFillMode != v2TXLiveFillMode2) {
            this.mPlayer.setRenderFillMode(v2TXLiveFillMode2);
        }
        V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation = v2TXLivePlayerJSConfig.renderRotation;
        V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation2 = v2TXLivePlayerJSConfig2.renderRotation;
        if (v2TXLiveRotation != v2TXLiveRotation2) {
            this.mPlayer.setRenderRotation(v2TXLiveRotation2);
        }
        int i3 = v2TXLivePlayerJSConfig.audioRoute;
        int i4 = v2TXLivePlayerJSConfig2.audioRoute;
        if (i3 != i4) {
            this.mPlayer.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute, Integer.valueOf(i4));
        }
        if (!TextUtils.isEmpty(v2TXLivePlayerJSConfig2.url) && !v2TXLivePlayerJSConfig2.url.equals(v2TXLivePlayerJSConfig.url) && v2TXLivePlayerJSConfig2.isCanAutoPlay && v2TXLivePlayerJSConfig2.isAutoPlay) {
            if (this.mPlayer.isPlaying() == 1) {
                apiOnlineLog("stop play when update url.", false);
                this.mPlayer.stopPlay();
            }
            apiOnlineLog("auto start play when update url.", false);
            startPlayInner(v2TXLivePlayerJSConfig2.url, v2TXLivePlayerJSConfig2.mode);
        }
        if (v2TXLivePlayerJSConfig2.isAutoPlay && v2TXLivePlayerJSConfig2.isCanAutoPlay && !TextUtils.isEmpty(v2TXLivePlayerJSConfig2.url) && this.mPlayer.isPlaying() != 1) {
            apiOnlineLog("start auto play.", false);
            startPlayInner(v2TXLivePlayerJSConfig2.url, v2TXLivePlayerJSConfig2.mode);
        }
    }

    private void setFullParams(V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig) {
        apiOnlineLog("set full config:".concat(String.valueOf(v2TXLivePlayerJSConfig)), true);
        if (v2TXLivePlayerJSConfig.isMuteVideo) {
            this.mPlayer.pauseVideo();
        } else {
            this.mPlayer.resumeVideo();
        }
        if (v2TXLivePlayerJSConfig.isMuteAudio) {
            this.mPlayer.pauseAudio();
        } else {
            this.mPlayer.resumeAudio();
        }
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 5);
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 100);
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 242);
        this.mPlayer.enableReceiveSeiMessage(v2TXLivePlayerJSConfig.enableRecvSEIMessage, 243);
        this.mPlayer.showDebugView(v2TXLivePlayerJSConfig.enableDebugView);
        this.mPlayer.setCacheParams(Math.min(v2TXLivePlayerJSConfig.minCache, v2TXLivePlayerJSConfig.maxCache), Math.max(v2TXLivePlayerJSConfig.minCache, v2TXLivePlayerJSConfig.maxCache));
        this.mPlayer.enableVolumeEvaluation(v2TXLivePlayerJSConfig.volumeNotifyIntervals);
        this.mPlayer.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute, Integer.valueOf(v2TXLivePlayerJSConfig.audioRoute));
        this.mPlayer.setRenderFillMode(v2TXLivePlayerJSConfig.fillMode);
        this.mPlayer.setRenderRotation(v2TXLivePlayerJSConfig.renderRotation);
        V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig2 = this.mConfig;
        if (v2TXLivePlayerJSConfig2.isCanAutoPlay && v2TXLivePlayerJSConfig2.isAutoPlay && !TextUtils.isEmpty(v2TXLivePlayerJSConfig2.url)) {
            if (this.mPlayer.isPlaying() == 1) {
                this.mPlayer.stopPlay();
                apiOnlineError("stop play when set full params.", false);
            }
            apiOnlineLog("auto start play when init player", false);
            V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig3 = this.mConfig;
            startPlayInner(v2TXLivePlayerJSConfig3.url, v2TXLivePlayerJSConfig3.mode);
        }
    }

    private void startPlayInner(String str, int i) {
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            apiOnlineError("start play fail. url is empty.", false);
            return;
        }
        boolean z = true;
        int i3 = i == 1 ? ((str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) && str.contains(".flv")) ? 1 : 0 : 5;
        apiOnlineLog("start play.[url:" + str + "][type:" + i3 + "]", false);
        this.mPlayMode = V2TXLiveUtils.parseLiveMode(str);
        V2TXLivePlayer v2TXLivePlayer = this.mPlayer;
        if (i3 != 5) {
            z = false;
        }
        v2TXLivePlayer.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2EnableRTMPAcc, Boolean.valueOf(z));
        if (str.startsWith(V2TXLiveUtils.TRTC_ADDRESS1) || str.startsWith(V2TXLiveUtils.TRTC_ADDRESS2)) {
            i2 = 3;
        } else if (str.startsWith("trtc://")) {
            i2 = 9;
        }
        if (i2 > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("framework", i2);
            } catch (JSONException unused) {
            }
            this.mPlayer.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework, jSONObject.toString());
        }
        this.mPlayer.startPlay(str);
    }

    public V2TXJSAdapterError initLivePlayer(Bundle bundle) {
        callbackSDKVersion();
        return initLivePlayerInner((TXCloudVideoView) null, bundle);
    }

    public boolean isMuted() {
        return this.mConfig.isMuteAudio;
    }

    public boolean isPlaying() {
        return this.mPlayer.isPlaying() == 1;
    }

    public void onNetworkQuality(int i) {
        this.mNetworkQuality = i;
    }

    public void onPlayEvent(int i, Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(i, bundle);
        }
    }

    public void onPlayNetStatus(Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_QUALITY_LEVEL, this.mNetworkQuality);
        }
        ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    public void onPlayoutVolumeUpdate(V2TXLivePlayer v2TXLivePlayer, int i) {
        TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i);
        }
    }

    public void onReceiveSeiMessage(V2TXLivePlayer v2TXLivePlayer, int i, byte[] bArr) {
        ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null && this.mConfig.enableRecvSEIMessage && bArr.length > 0) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            iTXLivePlayListener.onPlayEvent(2012, bundle);
        }
    }

    public void onSnapshotComplete(V2TXLivePlayer v2TXLivePlayer, Bitmap bitmap) {
        TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            if (bitmap == null) {
                iTXSnapshotListener.onSnapshot(bitmap);
            } else if (this.mNeedCompressSnapshot) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.setScale(0.5f, 0.5f);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
                iTXSnapshotListener.onSnapshot(createBitmap);
                if (createBitmap != null && !createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
            } else {
                iTXSnapshotListener.onSnapshot(bitmap);
            }
        }
    }

    public V2TXJSAdapterError operateLivePlayer(String str, JSONObject jSONObject) {
        String optString;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            apiOnlineError("operate live player fail. operate name is empty.", false);
            return new V2TXJSAdapterError(-1, "invalid params");
        } else if (!this.mIsInit) {
            if (str.equals(IXWebBroadcastListener.STAGE_START) || str.equals("stop") || str.equals("resume") || str.equals("pause") || str.equals("mute")) {
                z = true;
            }
            apiOnlineError("operate live player fail. player isn't init.", z);
            return new V2TXJSAdapterError(-3, "uninited livePlayer");
        } else {
            apiOnlineLog("operate live player.[name:" + str + "][param:" + (jSONObject != null ? jSONObject.toString() : "") + "]", true);
            if (str.equalsIgnoreCase(AssetExtension.SCENE_PLAY)) {
                V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig = this.mConfig;
                startPlayInner(v2TXLivePlayerJSConfig.url, v2TXLivePlayerJSConfig.mode);
            } else if (str.equalsIgnoreCase("stop")) {
                this.mPlayer.stopPlay();
            } else if (str.equalsIgnoreCase("pause")) {
                this.mPlayer.pauseAudio();
                this.mPlayer.pauseVideo();
            } else if (str.equalsIgnoreCase("resume")) {
                this.mPlayer.resumeAudio();
                this.mPlayer.resumeVideo();
            } else if (str.equalsIgnoreCase("mute")) {
                V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig2 = this.mConfig;
                boolean z2 = !v2TXLivePlayerJSConfig2.isMuteAudio;
                v2TXLivePlayerJSConfig2.isMuteAudio = z2;
                if (z2) {
                    this.mPlayer.pauseAudio();
                } else {
                    this.mPlayer.resumeAudio();
                }
            } else if (!str.equalsIgnoreCase(AppBrandFileCleaner.f238098c)) {
                return new V2TXJSAdapterError(-4, "invalid operate command");
            } else {
                if (!(jSONObject == null || (optString = jSONObject.optString("quality")) == null || !optString.equalsIgnoreCase("compressed"))) {
                    z = true;
                }
                takePhoto(z, this.mSnapshotListener);
            }
            return new V2TXJSAdapterError();
        }
    }

    public void setAudioVolumeListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeListener = iTXAudioVolumeEvaluationListener;
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mPlayListener = iTXLivePlayListener;
    }

    public void setSnapshotListener(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
    }

    public V2TXJSAdapterError setSurface(Surface surface) {
        this.mPlayer.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, surface);
        return new V2TXJSAdapterError();
    }

    public V2TXJSAdapterError setSurfaceSize(int i, int i2) {
        this.mPlayer.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, new V2TXLiveDefInner.SurfaceSize(i, i2));
        return new V2TXJSAdapterError();
    }

    public void takePhoto(boolean z, TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mNeedCompressSnapshot = z;
        this.mSnapshotListener = iTXSnapshotListener;
        int snapshot = this.mPlayer.snapshot();
        ITXLivePlayListener iTXLivePlayListener = this.mPlayListener;
        if (iTXLivePlayListener != null && snapshot != 0) {
            iTXLivePlayListener.onPlayEvent(-3, new Bundle());
        }
    }

    public V2TXJSAdapterError uninitLivePlayer() {
        if (!this.mIsInit) {
            apiOnlineError("un init player fail. player isn't init.", false);
            return new V2TXJSAdapterError(-3, "uninited livePlayer");
        }
        apiOnlineLog("un init player.", false);
        this.mIsInit = false;
        this.mPlayer.stopPlay();
        return new V2TXJSAdapterError();
    }

    public V2TXJSAdapterError updateLivePlayer(Bundle bundle) {
        if (bundle == null) {
            apiOnlineError("update player fail. invalid params.", false);
            return new V2TXJSAdapterError(-1, "invalid params.");
        } else if (!this.mIsInit) {
            apiOnlineError("update player fail. player isn't init.", false);
            return new V2TXJSAdapterError(-3, "uninited livePlayer.");
        } else {
            V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig = new V2TXLivePlayerJSConfig(this.mConfig);
            v2TXLivePlayerJSConfig.updateFromBundle(bundle);
            setDiffParams(this.mConfig, v2TXLivePlayerJSConfig);
            if (!TextUtils.isEmpty(v2TXLivePlayerJSConfig.url) && !v2TXLivePlayerJSConfig.url.equals(this.mConfig.url)) {
                this.mPlayerId = getPlayerIdByURL(v2TXLivePlayerJSConfig.url);
            }
            this.mConfig = v2TXLivePlayerJSConfig;
            return new V2TXJSAdapterError();
        }
    }

    public V2TXJSAdapterError initLivePlayer(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        if (tXCloudVideoView == null) {
            return new V2TXJSAdapterError(-1, "invalid params");
        }
        return initLivePlayerInner(tXCloudVideoView, bundle);
    }
}
