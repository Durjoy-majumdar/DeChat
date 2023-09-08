package com.tencent.live2.jsplugin.pusher;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C28637q;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.live2.impl.V2TXLivePusherImpl;
import com.tencent.live2.impl.V2TXLiveUtils;
import com.tencent.live2.impl.p312a.C17635b;
import com.tencent.live2.jsplugin.JSAdapterOnlineLog;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.live2.jsplugin.V2TXJSAdapterError;
import com.tencent.live2.jsplugin.player.V2TXLivePlayerJSConfig;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

public class V2TXLivePusherJSAdapter extends C17635b implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int BGM_ID = 1234567;
    private static final int FRAMEWORK_TYPE_LIVEV2_WXAPPLET = 9;
    private static final int FRAMEWORK_TYPE_WXROOM_WXAPPLET = 3;
    private static final int ROOM_PUSHER_MODE = 102;
    private static final int RTMP_PUSHER_MODE = 0;
    private static final String TAG = "V2TXLivePusherJSAdapter";
    private static final int TRTC_PUSHER_MODE = 1;
    private static Constructor<?> mConstructor;
    private TXLivePusher.ITXAudioVolumeEvaluationListener mAudioVolumeListener;
    private TXLivePusher.OnBGMNotify mBGMNotifyListener;
    /* access modifiers changed from: private */
    public V2TXLivePusherJSConfig mConfig;
    private Context mContext;
    private boolean mEnableCamera = true;
    private boolean mIsBGMPlaying;
    private boolean mIsBGMPlayingWhenPausePusher;
    private boolean mIsCameraOpened;
    private boolean mIsFlashLightOpened;
    private boolean mIsInit;
    private boolean mIsMicrophoneOpened;
    /* access modifiers changed from: private */
    public int mLastAngle = 0;
    private ITXLivePushListener mLivePushListener;
    private final List<String> mMainStreamUserIdList;
    private Handler mMainThreadHandler;
    private boolean mNeedCompressSnapshot;
    private int mNetworkQuality;
    private V2TXLivePusher mPusher;
    private V2TXLiveDef.V2TXLiveMode mPusherMode;
    private V2TXLiveProtocolType mRTCProtocolType;
    private TXLivePusher.ITXSnapshotListener mSnapshotListener;
    private final List<String> mSubStreamUserIdList;
    private Surface mSurface;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private TXCloudVideoView mVideoView;

    public enum V2TXLiveProtocolType {
        V2TXLiveProtocolTypeROOM,
        V2TXLiveProtocolTypeTRTC,
        V2TXLiveProtocolTypeRTMP,
        V2TXLiveProtocolTypeWEBRTC
    }

    static {
        C28637q.m38304a();
        Class<V2TXLivePusherImpl> cls = V2TXLivePusherImpl.class;
        try {
            int i = V2TXLivePusherImpl.f47984a;
            Constructor<V2TXLivePusherImpl> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class, Integer.TYPE});
            mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (Exception e) {
            LiteavLog.m16898e(TAG, "constructor pusher failed. ".concat(String.valueOf(e)));
        }
    }

    public V2TXLivePusherJSAdapter(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mContext = context.getApplicationContext();
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mConfig = new V2TXLivePusherJSConfig();
        this.mMainStreamUserIdList = new ArrayList();
        this.mSubStreamUserIdList = new ArrayList();
        this.mNetworkQuality = 2;
    }

    private void apiOnlineError(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (z) {
            JSAdapterOnlineLog instance = JSAdapterOnlineLog.getInstance();
            instance.log("V2TXLivePusherJSAdapter(" + hashCode() + ") " + str, true);
            return;
        }
        LiteavLog.m16898e(TAG, "V2TXLivePusherJSAdapter(" + hashCode() + ")" + str);
    }

    /* access modifiers changed from: private */
    public void apiOnlineLog(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (z) {
            JSAdapterOnlineLog instance = JSAdapterOnlineLog.getInstance();
            instance.log("V2TXLivePusherJSAdapter(" + hashCode() + ") " + str, true);
            return;
        }
        LiteavLog.m16901i(TAG, "V2TXLivePusherJSAdapter(" + hashCode() + ")" + str);
    }

    private void callbackSDKVersion() {
        if (this.mLivePushListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, TXLiveBase.getSDKVersionStr());
            bundle.putLong("EVT_TIME", System.currentTimeMillis());
            this.mLivePushListener.onPushEvent(V2TXJSAdapterConstants.EVT_ID_SDK_VERSION, bundle);
        }
    }

    private void createPusherInstance(int i) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.release();
        }
        try {
            boolean z = false;
            V2TXLivePusher v2TXLivePusher2 = (V2TXLivePusher) mConstructor.newInstance(new Object[]{this.mContext, Integer.valueOf(i)});
            this.mPusher = v2TXLivePusher2;
            if (i == 0) {
                this.mPusherMode = V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP;
            } else {
                this.mPusherMode = V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
                this.mRTCProtocolType = i == 102 ? V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM : V2TXLiveProtocolType.V2TXLiveProtocolTypeTRTC;
            }
            v2TXLivePusher2.setObserver(this);
            V2TXLivePusher v2TXLivePusher3 = this.mPusher;
            if (this.mVideoCustomProcessListener != null) {
                z = true;
            }
            v2TXLivePusher3.enableCustomVideoProcess(z, V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D, V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture);
        } catch (Exception e) {
            LiteavLog.m16898e(TAG, "create pusher failed. ".concat(String.valueOf(e)));
        }
    }

    private void doSetVideoEncParam(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (i3 == 0) {
            i3 = 900;
        }
        if (i4 == 0) {
            i4 = 500;
        }
        if (i4 > i3) {
            int i7 = i4;
            i4 = i3;
            i3 = i7;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, i);
            jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, i2);
            jSONObject.put("videoFps", i5);
            jSONObject.put("videoBitrate", i3);
            jSONObject.put("minVideoBitrate", i4);
            jSONObject.put("videoGop", i6);
            jSONObject.put("resolutionMode", z ? 0 : 1);
        } catch (JSONException unused) {
        }
        this.mPusher.setProperty(V2TXLiveProperty.kV2SetVideoQualityEx, jSONObject.toString());
    }

    private String generateURL(String str, int i) {
        StringBuilder sb = new StringBuilder("room://cloud.tencent.com/rtc?userid=");
        sb.append(str);
        sb.append("&streamtype=");
        sb.append(i == 2 ? "aux" : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
        return sb.toString();
    }

    private JSONObject getAudioAvailableJSONObject(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", str);
            jSONObject.put("playurl", str2);
            jSONObject.put("hasaudio", z);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject getUserJSONObject(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", str);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject getVideoAvailableJSONObject(String str, String str2, int i, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", str);
            jSONObject.put("playurl", str2);
            jSONObject.put("streamtype", i == 2 ? "aux" : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT);
            jSONObject.put("hasvideo", z);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private V2TXJSAdapterError initLivePusherInner(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        JSAdapterOnlineLog.getInstance().updateUrl("");
        if (bundle == null) {
            apiOnlineError("init pusher inner fail. invalid bundle params.", false);
            return new V2TXJSAdapterError(-1, "invalid params");
        } else if (this.mIsInit) {
            apiOnlineError("invalid operation. already init.", false);
            return new V2TXJSAdapterError(-1, "invalid operation. already init.");
        } else {
            this.mIsInit = true;
            apiOnlineLog("init pusher.", true);
            this.mVideoView = tXCloudVideoView;
            this.mConfig.updateFromBundle(bundle);
            if (TextUtils.isEmpty(this.mConfig.url)) {
                apiOnlineLog("can't find url. init default rtmp pusher instance.", false);
                createPusherInstance(0);
            } else {
                createPusherInstance(this.mConfig.url);
            }
            setFullParam(this.mConfig);
            V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
            if (v2TXLivePusherJSConfig.isAutoPush) {
                startPushInner(v2TXLivePusherJSConfig.url);
            }
            return new V2TXJSAdapterError();
        }
    }

    private boolean isRTCProtocolType() {
        return this.mPusherMode == V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
    }

    private boolean isRTCRoomProtocolType() {
        return this.mPusherMode == V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC && this.mRTCProtocolType == V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM;
    }

    private void notifyFullUserList() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("userlist", jSONArray);
            synchronized (this) {
                for (String next : this.mMainStreamUserIdList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("userid", next);
                    jSONObject2.put("playurl", generateURL(next, 0));
                    jSONArray.put(jSONObject2);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONObject.put("userlist_aux", jSONArray2);
            synchronized (this) {
                for (String next2 : this.mSubStreamUserIdList) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("userid", next2);
                    jSONObject3.put("playurl", generateURL(next2, 2));
                    jSONArray2.put(jSONObject3);
                }
            }
            sendEventNotify(1020, jSONObject, false);
        } catch (Exception e) {
            LiteavLog.m16899e(TAG, "notify full user list failed.", (Throwable) e);
        }
    }

    private V2TXJSAdapterError pause(JSONObject jSONObject) {
        apiOnlineLog("pause push. isCameraOpened: " + this.mIsCameraOpened + ", isMicrophoneOpened: " + this.mIsMicrophoneOpened, true);
        if (!TextUtils.isEmpty(this.mConfig.backgroundImagePath)) {
            this.mPusher.startVirtualCamera(BitmapFactory.decodeFile(this.mConfig.backgroundImagePath));
        } else {
            this.mPusher.pauseVideo();
        }
        if (!this.mConfig.isVOIP) {
            this.mPusher.pauseAudio();
        }
        boolean z = this.mIsBGMPlaying;
        this.mIsBGMPlayingWhenPausePusher = z;
        if (z) {
            operateLivePusher("pauseBGM", (JSONObject) null);
        }
        return new V2TXJSAdapterError();
    }

    private V2TXJSAdapterError playBGM(JSONObject jSONObject) {
        long j = -1;
        long j2 = 0;
        String str = "";
        if (jSONObject != null) {
            str = jSONObject.optString("BGMFilePath", str);
            j2 = jSONObject.optLong("startTimeMs", 0);
            j = jSONObject.optLong("endTimeMs", -1);
        }
        if (TextUtils.isEmpty(str)) {
            apiOnlineLog("playBGM failed. bgm url is empty.", false);
            return new V2TXJSAdapterError(-2, "fail");
        }
        this.mIsBGMPlaying = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(BGM_ID, str);
        audioMusicParam.publish = true;
        audioMusicParam.startTimeMS = j2;
        audioMusicParam.endTimeMS = j;
        this.mPusher.getAudioEffectManager().setMusicObserver(BGM_ID, this);
        this.mPusher.getAudioEffectManager().startPlayMusic(audioMusicParam);
        return new V2TXJSAdapterError();
    }

    private void processAudioConfig(V2TXLivePusherJSConfig v2TXLivePusherJSConfig, V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        boolean z = v2TXLivePusherJSConfig.isMuteAudio;
        boolean z2 = v2TXLivePusherJSConfig2.isMuteAudio;
        if (z != z2) {
            if (z2) {
                this.mPusher.pauseAudio();
            } else {
                this.mPusher.resumeAudio();
            }
        }
        boolean z3 = v2TXLivePusherJSConfig.enableANS;
        boolean z4 = v2TXLivePusherJSConfig2.enableANS;
        if (z3 != z4) {
            this.mPusher.setProperty("enableANS", String.format("{\"enable\": %b, \"level\":%d}", new Object[]{Boolean.valueOf(z4), 100}));
        }
        if (v2TXLivePusherJSConfig.enableEarMonitor != v2TXLivePusherJSConfig2.enableEarMonitor) {
            this.mPusher.getAudioEffectManager().enableVoiceEarMonitor(v2TXLivePusherJSConfig2.enableEarMonitor);
        }
        int i = v2TXLivePusherJSConfig.volumeNotifyIntervals;
        int i2 = v2TXLivePusherJSConfig2.volumeNotifyIntervals;
        if (i != i2) {
            this.mPusher.enableVolumeEvaluation(i2);
        }
        if (v2TXLivePusherJSConfig.volumeType != v2TXLivePusherJSConfig2.volumeType) {
            this.mPusher.getDeviceManager().setSystemVolumeType(v2TXLivePusherJSConfig2.volumeType);
        }
        if (v2TXLivePusherJSConfig.reverbType != v2TXLivePusherJSConfig2.reverbType) {
            this.mPusher.getAudioEffectManager().setVoiceReverbType(v2TXLivePusherJSConfig2.reverbType);
        }
        if (v2TXLivePusherJSConfig.voiceChangerType != v2TXLivePusherJSConfig2.voiceChangerType) {
            this.mPusher.getAudioEffectManager().setVoiceChangerType(v2TXLivePusherJSConfig2.voiceChangerType);
        }
        V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality = v2TXLivePusherJSConfig.audioQuality;
        V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality2 = v2TXLivePusherJSConfig2.audioQuality;
        if (v2TXLiveAudioQuality != v2TXLiveAudioQuality2) {
            this.mPusher.setAudioQuality(v2TXLiveAudioQuality2);
        }
        boolean z5 = v2TXLivePusherJSConfig.enableMicrophone;
        boolean z6 = v2TXLivePusherJSConfig2.enableMicrophone;
        if (z5 != z6) {
            if (z6) {
                startMicrophoneInner();
            } else {
                stopMicrophoneInner();
            }
        } else if (z6 && !this.mIsMicrophoneOpened) {
            startMicrophoneInner();
        }
    }

    private void processBeautyConfig(V2TXLivePusherJSConfig v2TXLivePusherJSConfig, V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        if (v2TXLivePusherJSConfig.beautyStyle != v2TXLivePusherJSConfig2.beautyStyle) {
            this.mPusher.getBeautyManager().setBeautyStyle(v2TXLivePusherJSConfig2.beautyStyle);
        }
        if (v2TXLivePusherJSConfig.beautyLevel != v2TXLivePusherJSConfig2.beautyLevel) {
            this.mPusher.getBeautyManager().setBeautyLevel((float) v2TXLivePusherJSConfig2.beautyLevel);
        }
        if (v2TXLivePusherJSConfig.whitenessLevel != v2TXLivePusherJSConfig2.whitenessLevel) {
            this.mPusher.getBeautyManager().setWhitenessLevel((float) v2TXLivePusherJSConfig2.whitenessLevel);
        }
        String str = v2TXLivePusherJSConfig2.filterImagePath;
        if (str != null && !str.equals(v2TXLivePusherJSConfig.filterImagePath)) {
            if (TextUtils.isEmpty(v2TXLivePusherJSConfig2.filterImagePath)) {
                this.mPusher.getBeautyManager().setFilter((Bitmap) null);
                return;
            }
            this.mPusher.getBeautyManager().setFilter(BitmapFactory.decodeFile(v2TXLivePusherJSConfig2.filterImagePath));
        }
    }

    private void processVideoConfig(V2TXLivePusherJSConfig v2TXLivePusherJSConfig, V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        if (v2TXLivePusherJSConfig.isFrontCamera != v2TXLivePusherJSConfig2.isFrontCamera) {
            this.mPusher.getDeviceManager().switchCamera(v2TXLivePusherJSConfig2.isFrontCamera);
        }
        if (v2TXLivePusherJSConfig.enableAutoFocus != v2TXLivePusherJSConfig2.enableAutoFocus) {
            this.mPusher.getDeviceManager().enableCameraAutoFocus(v2TXLivePusherJSConfig2.enableAutoFocus);
        }
        boolean z = v2TXLivePusherJSConfig.enableZoom;
        boolean z2 = v2TXLivePusherJSConfig2.enableZoom;
        if (z != z2) {
            this.mPusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2EnableCameraZoom, Boolean.valueOf(z2));
        }
        boolean z3 = v2TXLivePusherJSConfig.enableRemoteMirror;
        boolean z4 = v2TXLivePusherJSConfig2.enableRemoteMirror;
        if (z3 != z4) {
            this.mPusher.setEncoderMirror(z4);
        }
        V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType = v2TXLivePusherJSConfig.mirrorType;
        V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType2 = v2TXLivePusherJSConfig2.mirrorType;
        if (v2TXLiveMirrorType != v2TXLiveMirrorType2) {
            this.mPusher.setRenderMirror(v2TXLiveMirrorType2);
        }
        if (!(v2TXLivePusherJSConfig.isVerticalOrientation == v2TXLivePusherJSConfig2.isVerticalOrientation && v2TXLivePusherJSConfig.aspect == v2TXLivePusherJSConfig2.aspect && v2TXLivePusherJSConfig.width == v2TXLivePusherJSConfig2.width && v2TXLivePusherJSConfig.height == v2TXLivePusherJSConfig2.height && v2TXLivePusherJSConfig.mode == v2TXLivePusherJSConfig2.mode && v2TXLivePusherJSConfig.minBitrate == v2TXLivePusherJSConfig2.minBitrate && v2TXLivePusherJSConfig.maxBitrate == v2TXLivePusherJSConfig2.maxBitrate && v2TXLivePusherJSConfig.fps == v2TXLivePusherJSConfig2.fps)) {
            setVideoEncParam(v2TXLivePusherJSConfig2);
        }
        boolean z5 = v2TXLivePusherJSConfig2.enableCamera;
        this.mEnableCamera = z5;
        if (v2TXLivePusherJSConfig.enableCamera != z5) {
            if (z5) {
                startCameraInner(v2TXLivePusherJSConfig2.isFrontCamera);
            } else {
                stopCameraInner();
            }
        } else if (z5 && !this.mIsCameraOpened) {
            startCameraInner(v2TXLivePusherJSConfig2.isFrontCamera);
        }
    }

    private void processWatermarkConfig(V2TXLivePusherJSConfig v2TXLivePusherJSConfig, V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        String str = v2TXLivePusherJSConfig2.watermarkImagePath;
        if ((str != null && !str.equals(v2TXLivePusherJSConfig.watermarkImagePath)) || v2TXLivePusherJSConfig.watermarkWidth != v2TXLivePusherJSConfig2.watermarkWidth || v2TXLivePusherJSConfig.watermarkLeft != v2TXLivePusherJSConfig2.watermarkLeft || v2TXLivePusherJSConfig.watermarkTop != v2TXLivePusherJSConfig2.watermarkTop) {
            if (TextUtils.isEmpty(v2TXLivePusherJSConfig2.watermarkImagePath)) {
                this.mPusher.setWatermark((Bitmap) null, 0.0f, 0.0f, 0.0f);
                return;
            }
            this.mPusher.setWatermark(BitmapFactory.decodeFile(v2TXLivePusherJSConfig2.watermarkImagePath), v2TXLivePusherJSConfig2.watermarkLeft, v2TXLivePusherJSConfig2.watermarkTop, v2TXLivePusherJSConfig2.watermarkWidth);
        }
    }

    private V2TXJSAdapterError resume(JSONObject jSONObject) {
        apiOnlineLog("resume push.", true);
        this.mPusher.stopVirtualCamera();
        if (this.mConfig.isMuteAudio) {
            this.mPusher.pauseAudio();
        } else {
            this.mPusher.resumeAudio();
        }
        this.mPusher.resumeVideo();
        if (this.mIsBGMPlayingWhenPausePusher) {
            operateLivePusher("resumeBGM", (JSONObject) null);
        }
        return new V2TXJSAdapterError();
    }

    private void sendEventNotify(int i, String str) {
        apiOnlineLog("sendEventNotify [eventId:" + i + "][message:" + str + "]", false);
        ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
        if (iTXLivePushListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            iTXLivePushListener.onPushEvent(i, bundle);
        }
    }

    private V2TXJSAdapterError sendMessage(JSONObject jSONObject) {
        String optString = jSONObject != null ? jSONObject.optString("msg") : null;
        if (TextUtils.isEmpty(optString)) {
            return new V2TXJSAdapterError(-2, "fail");
        }
        try {
            this.mPusher.sendSeiMessage(isRTCRoomProtocolType() ? 243 : 242, optString.getBytes("UTF-8"));
        } catch (Exception unused) {
            apiOnlineLog("sendSeiMessage:".concat(String.valueOf(optString)), false);
        }
        return new V2TXJSAdapterError(0, "Success");
    }

    private V2TXJSAdapterError setBGMVolume(JSONObject jSONObject) {
        double d = 1.0d;
        if (jSONObject != null) {
            d = jSONObject.optDouble("volume", 1.0d);
        }
        int i = (int) (d * 100.0d);
        this.mPusher.getAudioEffectManager().setMusicPlayoutVolume(BGM_ID, i);
        this.mPusher.getAudioEffectManager().setMusicPublishVolume(BGM_ID, i);
        return new V2TXJSAdapterError();
    }

    private void setDiffParam(V2TXLivePusherJSConfig v2TXLivePusherJSConfig, V2TXLivePusherJSConfig v2TXLivePusherJSConfig2) {
        String diffConfig = v2TXLivePusherJSConfig2.diffConfig(v2TXLivePusherJSConfig);
        if (!TextUtils.isEmpty(diffConfig)) {
            apiOnlineLog("set diff config. diff:".concat(String.valueOf(diffConfig)), true);
        }
        boolean z = v2TXLivePusherJSConfig.enableDebugView;
        boolean z2 = v2TXLivePusherJSConfig2.enableDebugView;
        if (z != z2) {
            this.mPusher.showDebugView(z2);
        }
        processVideoConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        processAudioConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        processBeautyConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        processWatermarkConfig(v2TXLivePusherJSConfig, v2TXLivePusherJSConfig2);
        if (v2TXLivePusherJSConfig2.isAutoPush && !TextUtils.isEmpty(v2TXLivePusherJSConfig2.url) && this.mPusher.isPushing() != 1) {
            JSAdapterOnlineLog.getInstance().updateUrl(v2TXLivePusherJSConfig2.url);
            apiOnlineLog("stat auto push.", false);
            startPushInner(v2TXLivePusherJSConfig2.url);
        }
    }

    private void setFullParam(V2TXLivePusherJSConfig v2TXLivePusherJSConfig) {
        apiOnlineLog("set full config:".concat(String.valueOf(v2TXLivePusherJSConfig)), true);
        this.mPusher.showDebugView(v2TXLivePusherJSConfig.enableDebugView);
        this.mPusher.getDeviceManager().enableCameraAutoFocus(v2TXLivePusherJSConfig.enableAutoFocus);
        this.mPusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2EnableCameraZoom, Boolean.valueOf(v2TXLivePusherJSConfig.enableZoom));
        this.mPusher.setEncoderMirror(v2TXLivePusherJSConfig.enableRemoteMirror);
        this.mPusher.setRenderMirror(v2TXLivePusherJSConfig.mirrorType);
        setVideoEncParam(v2TXLivePusherJSConfig);
        TXCloudVideoView tXCloudVideoView = this.mVideoView;
        if (tXCloudVideoView != null) {
            this.mPusher.setRenderView(tXCloudVideoView);
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            this.mPusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, surface);
            this.mPusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, new V2TXLiveDefInner.SurfaceSize(this.mSurfaceWidth, this.mSurfaceHeight));
        }
        boolean z = v2TXLivePusherJSConfig.enableCamera;
        this.mEnableCamera = z;
        if (z) {
            startCameraInner(v2TXLivePusherJSConfig.isFrontCamera);
        } else {
            stopCameraInner();
        }
        if (v2TXLivePusherJSConfig.isMuteAudio) {
            this.mPusher.pauseAudio();
        } else {
            this.mPusher.resumeAudio();
        }
        this.mPusher.setProperty("enableANS", String.format("{\"enable\": %b, \"level\":%d}", new Object[]{Boolean.valueOf(v2TXLivePusherJSConfig.enableANS), 100}));
        this.mPusher.getAudioEffectManager().enableVoiceEarMonitor(v2TXLivePusherJSConfig.enableEarMonitor);
        this.mPusher.enableVolumeEvaluation(v2TXLivePusherJSConfig.volumeNotifyIntervals);
        this.mPusher.getDeviceManager().setSystemVolumeType(v2TXLivePusherJSConfig.volumeType);
        this.mPusher.getAudioEffectManager().setVoiceReverbType(v2TXLivePusherJSConfig.reverbType);
        this.mPusher.getAudioEffectManager().setVoiceChangerType(v2TXLivePusherJSConfig.voiceChangerType);
        this.mPusher.setAudioQuality(v2TXLivePusherJSConfig.audioQuality);
        if (v2TXLivePusherJSConfig.enableMicrophone) {
            startMicrophoneInner();
        } else {
            stopMicrophoneInner();
        }
        this.mPusher.getBeautyManager().setBeautyStyle(v2TXLivePusherJSConfig.beautyStyle);
        this.mPusher.getBeautyManager().setBeautyLevel((float) v2TXLivePusherJSConfig.beautyLevel);
        this.mPusher.getBeautyManager().setWhitenessLevel((float) v2TXLivePusherJSConfig.whitenessLevel);
        if (TextUtils.isEmpty(v2TXLivePusherJSConfig.filterImagePath)) {
            this.mPusher.getBeautyManager().setFilter((Bitmap) null);
        } else {
            this.mPusher.getBeautyManager().setFilter(BitmapFactory.decodeFile(v2TXLivePusherJSConfig.filterImagePath));
        }
        if (TextUtils.isEmpty(v2TXLivePusherJSConfig.watermarkImagePath)) {
            this.mPusher.setWatermark((Bitmap) null, 0.0f, 0.0f, 0.0f);
            return;
        }
        this.mPusher.setWatermark(BitmapFactory.decodeFile(v2TXLivePusherJSConfig.watermarkImagePath), v2TXLivePusherJSConfig.watermarkLeft, v2TXLivePusherJSConfig.watermarkTop, v2TXLivePusherJSConfig.watermarkWidth);
    }

    private V2TXJSAdapterError setMICVolume(JSONObject jSONObject) {
        double d = 1.0d;
        if (jSONObject != null) {
            d = jSONObject.optDouble("volume", 1.0d);
        }
        this.mPusher.getAudioEffectManager().setVoiceCaptureVolume((int) (d * 100.0d));
        return new V2TXJSAdapterError();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r0 == 2) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setVideoEncParam(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig r18) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            com.tencent.live2.V2TXLivePusher r1 = r8.mPusher
            r2 = 0
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "set video encoder fail. pusher is null."
            r8.apiOnlineError(r0, r2)
            return
        L_0x0010:
            int r1 = r8.mLastAngle
            boolean r3 = r0.isVerticalOrientation
            boolean r7 = r8.userLandscapeResolution(r1, r3)
            int r5 = r0.fps
            com.tencent.live2.V2TXLiveDef$V2TXLiveMode r1 = r8.mPusherMode
            com.tencent.live2.V2TXLiveDef$V2TXLiveMode r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC
            if (r1 != r3) goto L_0x004e
            if (r7 != 0) goto L_0x0033
            int r1 = r0.width
            int r2 = r0.height
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r0.width
            int r3 = r0.height
            int r2 = java.lang.Math.max(r2, r3)
            goto L_0x0043
        L_0x0033:
            int r1 = r0.width
            int r2 = r0.height
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r0.width
            int r3 = r0.height
            int r2 = java.lang.Math.min(r2, r3)
        L_0x0043:
            int r3 = r0.maxBitrate
            int r4 = r0.minBitrate
            r6 = 1
            r0 = r17
            r0.doSetVideoEncParam(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x004e:
            com.tencent.live2.V2TXLiveDef$V2TXLiveMode r3 = com.tencent.live2.V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP
            if (r1 != r3) goto L_0x00f2
            int r1 = r0.minBitrate
            r3 = 1
            if (r1 <= 0) goto L_0x005d
            int r4 = r0.maxBitrate
            if (r4 <= 0) goto L_0x005d
            r4 = 1
            goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            int r6 = r0.maxBitrate
            int r1 = java.lang.Math.min(r1, r6)
            int r6 = r0.minBitrate
            int r9 = r0.maxBitrate
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r0.mode
            r10 = 6
            if (r9 != r10) goto L_0x0073
            r11 = 1
            goto L_0x0074
        L_0x0073:
            r11 = 0
        L_0x0074:
            if (r11 == 0) goto L_0x0078
            r12 = 1
            goto L_0x0079
        L_0x0078:
            r12 = 5
        L_0x0079:
            r13 = 2
            r14 = 368(0x170, float:5.16E-43)
            r15 = 640(0x280, float:8.97E-43)
            if (r9 == r13) goto L_0x00c0
            r2 = 3
            if (r9 == r2) goto L_0x00b5
            if (r9 == r10) goto L_0x009b
            r0 = 7
            if (r9 == r0) goto L_0x0090
            if (r4 != 0) goto L_0x008e
            r1 = 500(0x1f4, float:7.0E-43)
            r6 = 900(0x384, float:1.261E-42)
        L_0x008e:
            r3 = r12
            goto L_0x00aa
        L_0x0090:
            if (r4 != 0) goto L_0x0096
            r1 = 3000(0xbb8, float:4.204E-42)
            r6 = 3500(0xdac, float:4.905E-42)
        L_0x0096:
            r14 = 1088(0x440, float:1.525E-42)
            r15 = 1920(0x780, float:2.69E-42)
            goto L_0x00ca
        L_0x009b:
            if (r4 != 0) goto L_0x00a1
            r1 = 190(0xbe, float:2.66E-43)
            r6 = 810(0x32a, float:1.135E-42)
        L_0x00a1:
            int r0 = r0.aspect
            if (r0 != r3) goto L_0x00a8
            r14 = 480(0x1e0, float:6.73E-43)
            goto L_0x00b1
        L_0x00a8:
            if (r0 != r13) goto L_0x00b1
        L_0x00aa:
            r4 = r1
            r16 = r6
            r6 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00b1:
            r4 = r1
            r3 = r6
            r6 = 1
            goto L_0x00cd
        L_0x00b5:
            if (r4 != 0) goto L_0x00bb
            r1 = 1000(0x3e8, float:1.401E-42)
            r6 = 1800(0x708, float:2.522E-42)
        L_0x00bb:
            r14 = 720(0x2d0, float:1.009E-42)
            r15 = 1280(0x500, float:1.794E-42)
            goto L_0x00ca
        L_0x00c0:
            if (r4 != 0) goto L_0x00c6
            r1 = 800(0x320, float:1.121E-42)
            r6 = 1500(0x5dc, float:2.102E-42)
        L_0x00c6:
            r14 = 544(0x220, float:7.62E-43)
            r15 = 960(0x3c0, float:1.345E-42)
        L_0x00ca:
            r4 = r1
            r3 = r6
            r6 = 5
        L_0x00cd:
            if (r7 != 0) goto L_0x00d8
            int r0 = java.lang.Math.min(r14, r15)
            int r1 = java.lang.Math.max(r14, r15)
            goto L_0x00e0
        L_0x00d8:
            int r0 = java.lang.Math.max(r14, r15)
            int r1 = java.lang.Math.min(r14, r15)
        L_0x00e0:
            r2 = r1
            r1 = r0
            r0 = r17
            r0.doSetVideoEncParam(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.live2.V2TXLivePusher r0 = r8.mPusher
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r2 = "enableRealtimeMode"
            r0.setProperty(r2, r1)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.setVideoEncParam(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig):void");
    }

    private V2TXJSAdapterError snapshot(JSONObject jSONObject) {
        String optString;
        this.mNeedCompressSnapshot = false;
        if (!(jSONObject == null || (optString = jSONObject.optString("quality")) == null || !optString.equalsIgnoreCase("compressed"))) {
            this.mNeedCompressSnapshot = true;
        }
        this.mPusher.snapshot();
        return new V2TXJSAdapterError();
    }

    private V2TXJSAdapterError start(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("start push. url:");
        sb.append(!TextUtils.isEmpty(this.mConfig.url));
        sb.append(", isPushing: ");
        sb.append(this.mPusher.isPushing());
        apiOnlineLog(sb.toString(), true);
        if (this.mPusher.isPushing() == 1 || TextUtils.isEmpty(this.mConfig.url)) {
            apiOnlineLog("start push failed.", false);
            return new V2TXJSAdapterError(-2, "fail");
        }
        startPushInner(this.mConfig.url);
        return new V2TXJSAdapterError();
    }

    private void startCameraInner(boolean z) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("start camera fail. pusher is null.", false);
        } else if (this.mIsCameraOpened) {
            apiOnlineLog("already start camera.", false);
        } else if (this.mEnableCamera) {
            this.mIsCameraOpened = true;
            v2TXLivePusher.startCamera(z);
        }
    }

    private void startMicrophoneInner() {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("start microphone fail. pusher is null.", false);
        } else if (this.mIsMicrophoneOpened) {
            apiOnlineLog("already start microphone.", false);
        } else {
            this.mIsMicrophoneOpened = true;
            v2TXLivePusher.startMicrophone();
            this.mPusher.getDeviceManager().setAudioRoute(V2TXLivePlayerJSConfig.sAudioRoute == 0 ? TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone : TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece);
        }
    }

    private V2TXJSAdapterError startPreview(JSONObject jSONObject) {
        apiOnlineLog("start camera.", true);
        if (this.mPusher.isPushing() == 1) {
            apiOnlineLog("do not support startPreview when pushing", false);
            return new V2TXJSAdapterError(-2, "fail");
        }
        startCameraInner(this.mConfig.isFrontCamera);
        return new V2TXJSAdapterError();
    }

    private void startPushInner(String str) {
        if (this.mPusher == null) {
            apiOnlineError("start push fail. pusher is null.", false);
        } else if (TextUtils.isEmpty(str)) {
            apiOnlineError("start push inner fail.url is empty.", false);
        } else {
            if (this.mConfig.enableMicrophone && !this.mIsMicrophoneOpened) {
                startMicrophoneInner();
            }
            V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
            if (v2TXLivePusherJSConfig.enableCamera && !this.mIsCameraOpened) {
                startCameraInner(v2TXLivePusherJSConfig.isFrontCamera);
            }
            if (this.mPusherMode == V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC) {
                int i = isRTCRoomProtocolType() ? 3 : 9;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("framework", i);
                } catch (JSONException unused) {
                }
                this.mPusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetFramework, jSONObject.toString());
            }
            apiOnlineLog("startPushInner:".concat(String.valueOf(this.mPusher.startPush(str))), false);
        }
    }

    private void stopCameraInner() {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("stop camera fail. pusher is null.", false);
        } else if (!this.mIsCameraOpened) {
            apiOnlineLog("already stop camera.", false);
        } else {
            this.mIsCameraOpened = false;
            v2TXLivePusher.stopCamera();
        }
    }

    private void stopMicrophoneInner() {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            apiOnlineError("stop microphone fail. pusher is null.", false);
        } else if (!this.mIsMicrophoneOpened) {
            apiOnlineLog("already stop microphone.", false);
        } else {
            this.mIsMicrophoneOpened = false;
            v2TXLivePusher.stopMicrophone();
        }
    }

    private V2TXJSAdapterError stopPreview(JSONObject jSONObject) {
        apiOnlineLog("stop camera.", true);
        if (this.mPusher.isPushing() == 1) {
            apiOnlineLog("do not support stopPreview when pushing", false);
            return new V2TXJSAdapterError(-2, "fail");
        }
        stopCameraInner();
        return new V2TXJSAdapterError();
    }

    private void stopPushInner() {
        apiOnlineLog("stopPushInner", false);
        this.mIsBGMPlaying = false;
        this.mIsBGMPlayingWhenPausePusher = false;
        this.mIsFlashLightOpened = false;
        this.mIsMicrophoneOpened = false;
        this.mIsCameraOpened = false;
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.getAudioEffectManager().stopPlayMusic(BGM_ID);
            this.mPusher.getAudioEffectManager().setMusicObserver(BGM_ID, (TXAudioEffectManager.TXMusicPlayObserver) null);
            this.mPusher.stopPush();
        }
    }

    private boolean userLandscapeResolution(int i, boolean z) {
        return i == 1 ? z : i == 3 ? z : i == 0 ? !z : i == 2 && !z;
    }

    public int enableCustomVideoCapture(boolean z) {
        apiOnlineLog("enableCustomVideoCapture enable:".concat(String.valueOf(z)), true);
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            return v2TXLivePusher.enableCustomVideoCapture(z);
        }
        return 0;
    }

    public int getMaxZoom() {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return 0;
        }
        return (int) v2TXLivePusher.getDeviceManager().getCameraZoomMaxRatio();
    }

    public V2TXJSAdapterError initLivePusher(Bundle bundle) {
        callbackSDKVersion();
        return initLivePusherInner((TXCloudVideoView) null, bundle);
    }

    public boolean isPushing() {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        return v2TXLivePusher != null && v2TXLivePusher.isPushing() == 1;
    }

    public void notifyOrientationChanged(final int i) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                if (V2TXLivePusherJSAdapter.this.mLastAngle != i) {
                    V2TXLivePusherJSAdapter v2TXLivePusherJSAdapter = V2TXLivePusherJSAdapter.this;
                    v2TXLivePusherJSAdapter.apiOnlineLog("notify orientation changed. [angle:" + i + "]", true);
                    int unused = V2TXLivePusherJSAdapter.this.mLastAngle = i;
                    V2TXLivePusherJSAdapter v2TXLivePusherJSAdapter2 = V2TXLivePusherJSAdapter.this;
                    v2TXLivePusherJSAdapter2.setVideoEncParam(v2TXLivePusherJSAdapter2.mConfig);
                }
            }
        });
    }

    public void onComplete(int i, int i2) {
        TXLivePusher.OnBGMNotify onBGMNotify;
        V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (BGM_ID == i && v2TXLivePusherJSConfig.enableBGMEventCallback && (onBGMNotify = this.mBGMNotifyListener) != null) {
            onBGMNotify.onBGMComplete(i2);
        }
    }

    public void onEnterRoom(long j) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onEnterRoom: isn't room protocol,ignore", false);
            return;
        }
        this.mMainStreamUserIdList.clear();
        this.mSubStreamUserIdList.clear();
        if (j > 0) {
            sendEventNotify(1018, "onEnterRoom success, time cost[" + j + "]");
            return;
        }
        sendEventNotify(TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, "onEnterRoom failed, error code[" + j + "]");
        sendEventNotify(-3301, "onEnterRoom failed, error code[" + j + "]");
        if (j == -100018) {
            sendEventNotify(-100018, "onEnterRoom failed, user sign invalid.");
        }
    }

    public void onExitRoom(int i) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onExitRoom: isn't room protocol,ignore", false);
            return;
        }
        this.mMainStreamUserIdList.clear();
        this.mSubStreamUserIdList.clear();
        sendEventNotify(TXLiveConstants.PUSH_EVT_ROOM_OUT, "onExitRoom reason[" + i + "]");
    }

    public void onGLContextCreated() {
        super.onGLContextCreated();
    }

    public void onGLContextDestroyed() {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestoryed();
        }
    }

    public void onMicrophoneVolumeUpdate(int i) {
        TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i);
        }
    }

    public void onNetworkQuality(int i) {
        this.mNetworkQuality = i;
    }

    public void onPlayProgress(int i, long j, long j2) {
        TXLivePusher.OnBGMNotify onBGMNotify;
        V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (BGM_ID == i && v2TXLivePusherJSConfig.enableBGMEventCallback && (onBGMNotify = this.mBGMNotifyListener) != null) {
            onBGMNotify.onBGMProgress(j, j2);
        }
    }

    public int onProcessVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener == null) {
            return 0;
        }
        v2TXLiveVideoFrame2.texture.textureId = videoCustomProcessListener.onTextureCustomProcess(v2TXLiveVideoFrame.texture.textureId, v2TXLiveVideoFrame.width, v2TXLiveVideoFrame.height);
        return 0;
    }

    public void onPushEvent(int i, Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onPushEvent(i, bundle);
        }
        if (iTXLivePushListener != null && i == 1003) {
            V2TXLiveProtocolType v2TXLiveProtocolType = this.mRTCProtocolType;
            if (v2TXLiveProtocolType == V2TXLiveProtocolType.V2TXLiveProtocolTypeROOM || v2TXLiveProtocolType == V2TXLiveProtocolType.V2TXLiveProtocolTypeTRTC) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Start encoder success.");
                iTXLivePushListener.onPushEvent(1008, bundle2);
            }
        }
    }

    public void onPushNetStatus(Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_QUALITY_LEVEL, this.mNetworkQuality);
        }
        ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onNetStatus(bundle);
        }
    }

    public void onRemoteUserEnter(String str) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onRemoteUserEnter: isn't room protocol,ignore", false);
        } else {
            sendEventNotify(1031, getUserJSONObject(str), true);
        }
    }

    public void onRemoteUserExit(String str, int i) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onRemoteUserExit: isn't room protocol,ignore", false);
        } else {
            sendEventNotify(1032, getUserJSONObject(str), true);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        TXLivePusher.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
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

    public void onStart(int i, int i2) {
        TXLivePusher.OnBGMNotify onBGMNotify;
        V2TXLivePusherJSConfig v2TXLivePusherJSConfig = this.mConfig;
        if (BGM_ID == i && v2TXLivePusherJSConfig.enableBGMEventCallback && (onBGMNotify = this.mBGMNotifyListener) != null) {
            onBGMNotify.onBGMStart();
        }
    }

    public void onUserAudioAvailable(String str, boolean z) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onUserAudioAvailable: isn't room protocol,ignore", false);
        } else {
            sendEventNotify(1034, getAudioAvailableJSONObject(str, generateURL(str, 0), z), true);
        }
    }

    public void onUserVideoAvailable(String str, int i, boolean z) {
        if (!isRTCRoomProtocolType()) {
            apiOnlineLog("onUserVideoAvailable: isn't room protocol,ignore", false);
            return;
        }
        sendEventNotify(1033, getVideoAvailableJSONObject(str, generateURL(str, i), i, z), true);
        List<String> list = i == 2 ? this.mSubStreamUserIdList : this.mMainStreamUserIdList;
        if (z) {
            list.add(str);
        } else {
            list.remove(str);
        }
        notifyFullUserList();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.live2.jsplugin.V2TXJSAdapterError operateLivePusher(java.lang.String r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x000f
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = new com.tencent.live2.jsplugin.V2TXJSAdapterError
            r11 = -1
            java.lang.String r0 = "invalid params"
            r10.<init>((int) r11, (java.lang.String) r0)
            return r10
        L_0x000f:
            boolean r0 = r9.mIsInit
            java.lang.String r1 = "stopPreview"
            java.lang.String r2 = "startPreview"
            java.lang.String r3 = "pause"
            java.lang.String r4 = "resume"
            java.lang.String r5 = "stop"
            java.lang.String r6 = "start"
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0178
            com.tencent.live2.V2TXLivePusher r0 = r9.mPusher
            if (r0 != 0) goto L_0x002b
            goto L_0x0178
        L_0x002b:
            boolean r0 = r10.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0036
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.start(r11)
            return r10
        L_0x0036:
            boolean r0 = r10.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0047
            java.lang.String r10 = "stop push."
            r9.apiOnlineLog(r10, r8)
            r9.stopPushInner()
            goto L_0x0124
        L_0x0047:
            boolean r0 = r10.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0052
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.pause(r11)
            return r10
        L_0x0052:
            boolean r0 = r10.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x005d
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.resume(r11)
            return r10
        L_0x005d:
            boolean r0 = r10.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0068
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.startPreview(r11)
            return r10
        L_0x0068:
            boolean r0 = r10.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0073
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.stopPreview(r11)
            return r10
        L_0x0073:
            java.lang.String r0 = "switchCamera"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0092
            com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig r10 = r9.mConfig
            boolean r11 = r10.isFrontCamera
            r11 = r11 ^ r8
            r10.isFrontCamera = r11
            com.tencent.live2.V2TXLivePusher r10 = r9.mPusher
            com.tencent.liteav.device.TXDeviceManager r10 = r10.getDeviceManager()
            com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSConfig r11 = r9.mConfig
            boolean r11 = r11.isFrontCamera
            r10.switchCamera(r11)
            goto L_0x0124
        L_0x0092:
            java.lang.String r0 = "snapshot"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00a0
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.snapshot(r11)
            return r10
        L_0x00a0:
            java.lang.String r0 = "toggleTorch"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00ce
            boolean r10 = r9.mIsFlashLightOpened
            r10 = r10 ^ r8
            com.tencent.live2.V2TXLivePusher r11 = r9.mPusher
            com.tencent.liteav.device.TXDeviceManager r11 = r11.getDeviceManager()
            boolean r11 = r11.enableCameraTorch(r10)
            if (r11 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            boolean r10 = r9.mIsFlashLightOpened
        L_0x00bb:
            r9.mIsFlashLightOpened = r10
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = new com.tencent.live2.jsplugin.V2TXJSAdapterError
            if (r11 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r7 = -2
        L_0x00c3:
            if (r11 == 0) goto L_0x00c8
            java.lang.String r11 = "Success"
            goto L_0x00ca
        L_0x00c8:
            java.lang.String r11 = "Failed"
        L_0x00ca:
            r10.<init>((int) r7, (java.lang.String) r11)
            return r10
        L_0x00ce:
            java.lang.String r0 = "playBGM"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00db
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.playBGM(r11)
            return r10
        L_0x00db:
            java.lang.String r0 = "stopBGM"
            boolean r0 = r10.equalsIgnoreCase(r0)
            r1 = 1234567(0x12d687, float:1.729997E-39)
            if (r0 == 0) goto L_0x00fd
            r9.mIsBGMPlaying = r7
            com.tencent.live2.V2TXLivePusher r10 = r9.mPusher
            com.tencent.liteav.audio.TXAudioEffectManager r10 = r10.getAudioEffectManager()
            r11 = 0
            r10.setMusicObserver(r1, r11)
            com.tencent.live2.V2TXLivePusher r10 = r9.mPusher
            com.tencent.liteav.audio.TXAudioEffectManager r10 = r10.getAudioEffectManager()
            r10.stopPlayMusic(r1)
            goto L_0x0124
        L_0x00fd:
            java.lang.String r0 = "pauseBGM"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0111
            r9.mIsBGMPlaying = r7
            com.tencent.live2.V2TXLivePusher r10 = r9.mPusher
            com.tencent.liteav.audio.TXAudioEffectManager r10 = r10.getAudioEffectManager()
            r10.pausePlayMusic(r1)
            goto L_0x0124
        L_0x0111:
            java.lang.String r0 = "resumeBGM"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x012a
            r9.mIsBGMPlaying = r8
            com.tencent.live2.V2TXLivePusher r10 = r9.mPusher
            com.tencent.liteav.audio.TXAudioEffectManager r10 = r10.getAudioEffectManager()
            r10.resumePlayMusic(r1)
        L_0x0124:
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = new com.tencent.live2.jsplugin.V2TXJSAdapterError
            r10.<init>()
            return r10
        L_0x012a:
            java.lang.String r0 = "setBGMVolume"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0138
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.setBGMVolume(r11)
            return r10
        L_0x0138:
            java.lang.String r0 = "setMICVolume"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0146
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.setMICVolume(r11)
            return r10
        L_0x0146:
            java.lang.String r0 = "sendMessage"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0154
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.sendMessage(r11)
            return r10
        L_0x0154:
            java.lang.String r0 = "setZoom"
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0162
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.setZoom((org.json.JSONObject) r11)
            return r10
        L_0x0162:
            java.lang.String r0 = "getMaxZoom"
            boolean r10 = r10.equalsIgnoreCase(r0)
            if (r10 == 0) goto L_0x016f
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = r9.getMaxZoom(r11)
            return r10
        L_0x016f:
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = new com.tencent.live2.jsplugin.V2TXJSAdapterError
            r11 = -4
            java.lang.String r0 = "invalid operate command"
            r10.<init>((int) r11, (java.lang.String) r0)
            return r10
        L_0x0178:
            boolean r11 = r10.equals(r6)
            if (r11 != 0) goto L_0x019f
            boolean r11 = r10.equals(r5)
            if (r11 != 0) goto L_0x019f
            boolean r11 = r10.equals(r4)
            if (r11 != 0) goto L_0x019f
            boolean r11 = r10.equals(r3)
            if (r11 != 0) goto L_0x019f
            boolean r11 = r10.equals(r2)
            if (r11 != 0) goto L_0x019f
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r11 = 0
            goto L_0x01a0
        L_0x019f:
            r11 = 1
        L_0x01a0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "operate live pusher fail. init pusher first.[operateName:"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = "][isInit:"
            r0.append(r10)
            boolean r10 = r9.mIsInit
            r0.append(r10)
            java.lang.String r10 = "][hasPusher:"
            r0.append(r10)
            com.tencent.live2.V2TXLivePusher r10 = r9.mPusher
            if (r10 == 0) goto L_0x01be
            r7 = 1
        L_0x01be:
            r0.append(r7)
            java.lang.String r10 = "]"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.apiOnlineError(r10, r11)
            com.tencent.live2.jsplugin.V2TXJSAdapterError r10 = new com.tencent.live2.jsplugin.V2TXJSAdapterError
            r11 = -3
            java.lang.String r0 = "uninited livePusher"
            r10.<init>((int) r11, (java.lang.String) r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter.operateLivePusher(java.lang.String, org.json.JSONObject):com.tencent.live2.jsplugin.V2TXJSAdapterError");
    }

    public int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            return v2TXLivePusher.sendCustomVideoFrame(v2TXLiveVideoFrame);
        }
        return 0;
    }

    public void setAudioVolumeListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeListener = iTXAudioVolumeEvaluationListener;
    }

    public void setBGMNotifyListener(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.mBGMNotifyListener = onBGMNotify;
    }

    public V2TXJSAdapterError setFocusPosition(float f, float f2) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return new V2TXJSAdapterError(-3, "uninited livePusher");
        }
        v2TXLivePusher.getDeviceManager().setCameraFocusPosition((int) f, (int) f2);
        return new V2TXJSAdapterError();
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.mLivePushListener = iTXLivePushListener;
    }

    public void setSnapshotListener(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.mSnapshotListener = iTXSnapshotListener;
    }

    public V2TXJSAdapterError setSurface(Surface surface) {
        StringBuilder sb = new StringBuilder("set surface:");
        sb.append(surface != null ? Integer.valueOf(surface.hashCode()) : "0");
        apiOnlineLog(sb.toString(), false);
        this.mSurface = surface;
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, surface);
        }
        return new V2TXJSAdapterError();
    }

    public V2TXJSAdapterError setSurfaceSize(int i, int i2) {
        apiOnlineLog("set surface size: [width:" + i + "][height:" + i2 + "]", false);
        this.mSurfaceWidth = i;
        this.mSurfaceHeight = i2;
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.setProperty(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, new V2TXLiveDefInner.SurfaceSize(i, i2));
        }
        return new V2TXJSAdapterError();
    }

    public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        this.mVideoCustomProcessListener = videoCustomProcessListener;
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.enableCustomVideoProcess(videoCustomProcessListener != null, V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D, V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture);
        }
    }

    public V2TXJSAdapterError setZoom(int i) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return new V2TXJSAdapterError(-3, "uninited livePusher");
        }
        v2TXLivePusher.getDeviceManager().setCameraZoomRatio((float) i);
        return new V2TXJSAdapterError();
    }

    public void takePhoto(boolean z, TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher != null) {
            this.mNeedCompressSnapshot = z;
            this.mSnapshotListener = iTXSnapshotListener;
            int snapshot = v2TXLivePusher.snapshot();
            if (this.mLivePushListener != null && snapshot != 0) {
                this.mLivePushListener.onPushEvent(-3, new Bundle());
            }
        }
    }

    public V2TXJSAdapterError unInitLivePusher() {
        if (!this.mIsInit) {
            return new V2TXJSAdapterError(-3, "uninited livePusher");
        }
        apiOnlineLog("un init pusher.", true);
        stopPushInner();
        this.mIsInit = false;
        this.mPusher.release();
        return new V2TXJSAdapterError();
    }

    public V2TXJSAdapterError updateLivePusher(Bundle bundle) {
        if (bundle == null) {
            return new V2TXJSAdapterError(-1, "invalid params");
        }
        if (!this.mIsInit) {
            return new V2TXJSAdapterError(-3, "uninited livePusher");
        }
        apiOnlineLog("update pusher params:" + bundle.toString(), false);
        V2TXLivePusherJSConfig v2TXLivePusherJSConfig = new V2TXLivePusherJSConfig(this.mConfig);
        v2TXLivePusherJSConfig.updateFromBundle(bundle);
        if (TextUtils.isEmpty(v2TXLivePusherJSConfig.url) || v2TXLivePusherJSConfig.url.equals(this.mConfig.url)) {
            if (this.mPusher != null) {
                setDiffParam(this.mConfig, v2TXLivePusherJSConfig);
            } else {
                apiOnlineError("pusher no init yet.ignore set diff param", false);
            }
            this.mConfig = v2TXLivePusherJSConfig;
        } else {
            JSAdapterOnlineLog.getInstance().updateUrl("");
            apiOnlineLog("update url to:" + v2TXLivePusherJSConfig.url, false);
            stopPushInner();
            createPusherInstance(v2TXLivePusherJSConfig.url);
            setFullParam(v2TXLivePusherJSConfig);
            this.mConfig = v2TXLivePusherJSConfig;
            if (v2TXLivePusherJSConfig.isAutoPush) {
                apiOnlineLog("auto push", true);
                startPushInner(v2TXLivePusherJSConfig.url);
            }
        }
        return new V2TXJSAdapterError();
    }

    private V2TXJSAdapterError getMaxZoom(JSONObject jSONObject) {
        V2TXLivePusher v2TXLivePusher = this.mPusher;
        if (v2TXLivePusher == null) {
            return new V2TXJSAdapterError(-3, "uninited livePusher");
        }
        float cameraZoomMaxRatio = v2TXLivePusher.getDeviceManager().getCameraZoomMaxRatio();
        HashMap hashMap = new HashMap();
        hashMap.put("maxZoom", Float.valueOf(cameraZoomMaxRatio));
        return new V2TXJSAdapterError(0, (Map<String, Object>) hashMap);
    }

    public V2TXJSAdapterError initLivePusher(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        if (tXCloudVideoView == null) {
            return new V2TXJSAdapterError(-1, "invalid params");
        }
        return initLivePusherInner(tXCloudVideoView, bundle);
    }

    private V2TXJSAdapterError setZoom(JSONObject jSONObject) {
        double d = 1.0d;
        if (jSONObject != null) {
            d = jSONObject.optDouble(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, 1.0d);
        }
        this.mPusher.getDeviceManager().setCameraZoomRatio((float) d);
        return new V2TXJSAdapterError();
    }

    private void sendEventNotify(int i, JSONObject jSONObject, boolean z) {
        String str;
        String valueOf = String.valueOf(i);
        if (i != 1020) {
            switch (i) {
                case 1031:
                    valueOf = "UserEnter";
                    break;
                case 1032:
                    valueOf = "UserExit";
                    break;
                case 1033:
                    valueOf = "VideoStateUpdate";
                    break;
                case 1034:
                    valueOf = "AudioStateUpdate";
                    break;
            }
        } else {
            valueOf = "UserList";
        }
        StringBuilder sb = new StringBuilder("sendEventNotify [eventName:");
        sb.append(valueOf);
        sb.append("][params:");
        sb.append(jSONObject != null ? jSONObject.toString() : "");
        sb.append("]");
        apiOnlineLog(sb.toString(), false);
        if (jSONObject != null) {
            if (z) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("userlist", jSONArray);
                    str = jSONObject2.toString();
                } catch (Exception unused) {
                    return;
                }
            } else {
                str = jSONObject.toString();
            }
            ITXLivePushListener iTXLivePushListener = this.mLivePushListener;
            if (iTXLivePushListener != null) {
                Bundle bundle = new Bundle();
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
                iTXLivePushListener.onPushEvent(i, bundle);
            }
        }
    }

    private void createPusherInstance(String str) {
        if (!TextUtils.isEmpty(str)) {
            int ordinal = V2TXLiveUtils.parseLiveMode(str).ordinal();
            if (str.startsWith(V2TXLiveUtils.TRTC_ADDRESS1) || str.startsWith(V2TXLiveUtils.TRTC_ADDRESS2)) {
                ordinal = 102;
            }
            JSAdapterOnlineLog.getInstance().updateUrl(str);
            createPusherInstance(ordinal);
        }
    }
}
