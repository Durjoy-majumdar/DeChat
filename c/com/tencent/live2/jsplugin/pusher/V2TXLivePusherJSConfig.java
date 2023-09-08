package com.tencent.live2.jsplugin.pusher;

import android.os.Bundle;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.impl.V2TXLiveUtils;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;

public class V2TXLivePusherJSConfig {
    private static final TXAudioEffectManager.TXVoiceReverbType[] REVERB_TYPES = {TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
    private static final TXAudioEffectManager.TXVoiceChangerType[] VOICE_CHANGER_TYPES = {TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
    public int aspect = 2;
    public V2TXLiveDef.V2TXLiveAudioQuality audioQuality = V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
    public String backgroundImagePath = "";
    public int beautyLevel = 5;
    public int beautyStyle = 0;
    public boolean enableAGC = false;
    public boolean enableANS = false;
    public boolean enableAutoFocus = true;
    public boolean enableBGMEventCallback = false;
    public boolean enableCamera = true;
    public boolean enableDebugView = false;
    public boolean enableEarMonitor = false;
    public boolean enableMicrophone = true;
    public boolean enableRemoteMirror = false;
    public boolean enableZoom = false;
    public String filterImagePath;
    public int fps = 15;
    public int height = 640;
    public boolean isAutoPush = false;
    public boolean isFrontCamera = true;
    public boolean isMuteAudio = false;
    public boolean isVOIP = false;
    public boolean isVerticalOrientation = true;
    public int maxBitrate = 0;
    public int minBitrate = 0;
    public V2TXLiveDef.V2TXLiveMirrorType mirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
    public int mode = 1;
    public TXAudioEffectManager.TXVoiceReverbType reverbType = TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
    public String url = "";
    public TXAudioEffectManager.TXVoiceChangerType voiceChangerType = TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
    public int volumeNotifyIntervals = 0;
    public TXDeviceManager.TXSystemVolumeType volumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
    public String watermarkImagePath = "";
    public float watermarkLeft = 0.0f;
    public float watermarkTop = 0.0f;
    public float watermarkWidth = 0.1f;
    public int whitenessLevel = 3;
    public int width = 368;

    public V2TXLivePusherJSConfig() {
    }

    public String diffConfig(V2TXLivePusherJSConfig v2TXLivePusherJSConfig) {
        StringBuilder sb = new StringBuilder();
        if (this.url != v2TXLivePusherJSConfig.url) {
            sb.append("[url:" + V2TXLiveUtils.removeURLSensitiveInfo(this.url) + "]");
        }
        if (this.mode != v2TXLivePusherJSConfig.mode) {
            sb.append("[mode:" + this.mode + "]");
        }
        if (this.isVOIP != v2TXLivePusherJSConfig.isVOIP) {
            sb.append("[isVOIP:" + this.isVOIP + "]");
        }
        if (this.enableCamera != v2TXLivePusherJSConfig.enableCamera) {
            sb.append("[enableCamera:" + this.enableCamera + "]");
        }
        if (this.isFrontCamera != v2TXLivePusherJSConfig.isFrontCamera) {
            sb.append("[isFrontCamera:" + this.isFrontCamera + "]");
        }
        if (this.isVerticalOrientation != v2TXLivePusherJSConfig.isVerticalOrientation) {
            sb.append("[isVerticalOrientation:" + this.isVerticalOrientation + "]");
        }
        if (this.aspect != v2TXLivePusherJSConfig.aspect) {
            sb.append("[aspect:" + this.aspect + "]");
        }
        if (this.width != v2TXLivePusherJSConfig.width) {
            sb.append("[width:" + this.width + "]");
        }
        if (this.height != v2TXLivePusherJSConfig.height) {
            sb.append("[height:" + this.height + "]");
        }
        if (this.minBitrate != v2TXLivePusherJSConfig.minBitrate) {
            sb.append("[minBitrate:" + this.minBitrate + "]");
        }
        if (this.maxBitrate != v2TXLivePusherJSConfig.maxBitrate) {
            sb.append("[maxBitrate:" + this.maxBitrate + "]");
        }
        if (this.fps != v2TXLivePusherJSConfig.fps) {
            sb.append("[fps:" + this.fps + "]");
        }
        if (this.enableMicrophone != v2TXLivePusherJSConfig.enableMicrophone) {
            sb.append("[enableMicrophone:" + this.enableMicrophone + "]");
        }
        if (this.isMuteAudio != v2TXLivePusherJSConfig.isMuteAudio) {
            sb.append("[isMuteAudio:" + this.isMuteAudio + "]");
        }
        if (this.enableAGC != v2TXLivePusherJSConfig.enableAGC) {
            sb.append("[enableAGC:" + this.enableAGC + "]");
        }
        if (this.enableANS != v2TXLivePusherJSConfig.enableANS) {
            sb.append("[enableANS:" + this.enableANS + "]");
        }
        if (this.enableEarMonitor != v2TXLivePusherJSConfig.enableEarMonitor) {
            sb.append("[enableEarMonitor:" + this.enableEarMonitor + "]");
        }
        if (this.volumeType != v2TXLivePusherJSConfig.volumeType) {
            sb.append("[volumeType:" + this.volumeType + "]");
        }
        if (this.reverbType != v2TXLivePusherJSConfig.reverbType) {
            sb.append("[reverbType:" + this.reverbType + "]");
        }
        if (this.voiceChangerType != v2TXLivePusherJSConfig.voiceChangerType) {
            sb.append("[voiceChangerType:" + this.voiceChangerType + "]");
        }
        if (this.audioQuality != v2TXLivePusherJSConfig.audioQuality) {
            sb.append("[audioQuality:" + this.audioQuality + "]");
        }
        return sb.toString();
    }

    public void parseAudioParam(Bundle bundle) {
        int i;
        int i2;
        if (bundle.containsKey("muted")) {
            this.isMuteAudio = bundle.getBoolean("muted");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC)) {
            this.enableMicrophone = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY)) {
            String string = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY, "");
            string.getClass();
            if (!string.equals("low")) {
                this.audioQuality = V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
            } else {
                this.audioQuality = V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualitySpeech;
            }
        }
        if (bundle.containsKey("enableAGC")) {
            this.enableAGC = bundle.getBoolean("enableAGC");
        }
        if (bundle.containsKey("enableANS")) {
            this.enableANS = bundle.getBoolean("enableANS");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR)) {
            this.enableEarMonitor = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE)) {
            String string2 = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE, "");
            string2.getClass();
            if (string2.equals("voicecall")) {
                this.volumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP;
            } else if (!string2.equals("media")) {
                this.volumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
            } else {
                this.volumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia;
            }
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE) && (i2 = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE)) >= 0) {
            TXAudioEffectManager.TXVoiceReverbType[] tXVoiceReverbTypeArr = REVERB_TYPES;
            if (i2 < tXVoiceReverbTypeArr.length) {
                this.reverbType = tXVoiceReverbTypeArr[i2];
            }
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE) && (i = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE)) >= 0) {
            TXAudioEffectManager.TXVoiceChangerType[] tXVoiceChangerTypeArr = VOICE_CHANGER_TYPES;
            if (i < tXVoiceChangerTypeArr.length) {
                this.voiceChangerType = tXVoiceChangerTypeArr[i];
            }
        }
        if (bundle.containsKey("needAudioVolume")) {
            this.volumeNotifyIntervals = bundle.getBoolean("needAudioVolume") ? 300 : 0;
        }
    }

    public void parseBasicParam(Bundle bundle) {
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL)) {
            this.url = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, "");
        }
        if (bundle.containsKey("mode")) {
            this.mode = bundle.getInt("mode");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH)) {
            this.isAutoPush = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT)) {
            this.enableBGMEventCallback = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT);
        }
        if (bundle.containsKey("debug")) {
            this.enableDebugView = bundle.getBoolean("debug");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.IS_VOIP)) {
            this.isVOIP = bundle.getBoolean(V2TXJSAdapterConstants.IS_VOIP);
        }
    }

    public void parseBeautyParam(Bundle bundle) {
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE)) {
            String string = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, "");
            string.getClass();
            if (!string.equals("nature")) {
                this.beautyStyle = 0;
            } else {
                this.beautyStyle = 1;
            }
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY)) {
            this.beautyLevel = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS)) {
            this.whitenessLevel = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
            this.filterImagePath = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, "");
        }
    }

    public void parseGasketParam(Bundle bundle) {
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE)) {
            this.backgroundImagePath = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, "");
        }
    }

    public void parseVideoParam(Bundle bundle) {
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA)) {
            this.enableCamera = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION)) {
            this.isFrontCamera = !"back".equals(bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, ""));
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
            this.enableAutoFocus = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE) == 0;
        }
        if (bundle.containsKey("orientation")) {
            this.isVerticalOrientation = !"horizontal".equals(bundle.getString("orientation", ""));
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
            this.enableZoom = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR)) {
            this.enableRemoteMirror = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR)) {
            this.enableRemoteMirror = bundle.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_ASPECT)) {
            this.aspect = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_ASPECT);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH)) {
            this.width = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT)) {
            this.height = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE)) {
            this.minBitrate = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE)) {
            this.maxBitrate = bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_FPS)) {
            this.fps = Math.min(30, bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS) > 0 ? bundle.getInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS) : 15);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR)) {
            String string = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR, "");
            string.getClass();
            if (string.equals("enable")) {
                this.mirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeEnable;
            } else if (!string.equals("disable")) {
                this.mirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
            } else {
                this.mirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeDisable;
            }
        }
    }

    public void parseWatermarkParam(Bundle bundle) {
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE)) {
            this.watermarkImagePath = bundle.getString(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, "");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT)) {
            this.watermarkLeft = bundle.getFloat(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP)) {
            this.watermarkTop = bundle.getFloat(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH)) {
            this.watermarkWidth = bundle.getFloat(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH);
        }
    }

    public String toString() {
        return "[url:" + V2TXLiveUtils.removeURLSensitiveInfo(this.url) + "][mode:" + this.mode + "][isVOIP:" + this.isVOIP + "][isAutoPush:" + this.isAutoPush + "][enableCamera:" + this.enableCamera + "][isVerticalOrientation:" + this.isVerticalOrientation + "][aspect:" + this.aspect + "][width:" + this.width + "][height:" + this.height + "][minBitrate:" + this.minBitrate + "][maxBitrate:" + this.maxBitrate + "][fps:" + this.fps + "][enableMicrophone:" + this.enableMicrophone + "][isMuteAudio:" + this.isMuteAudio + "][enableAGC:" + this.enableAGC + "][enableANS:" + this.enableANS + "][enableEarMonitor:" + this.enableEarMonitor + "][volumeType:" + this.volumeType + "][audioQuality:" + this.audioQuality + ']';
    }

    public void updateFromBundle(Bundle bundle) {
        parseBasicParam(bundle);
        parseVideoParam(bundle);
        parseAudioParam(bundle);
        parseBeautyParam(bundle);
        parseWatermarkParam(bundle);
        parseGasketParam(bundle);
    }

    public V2TXLivePusherJSConfig(V2TXLivePusherJSConfig v2TXLivePusherJSConfig) {
        this.url = v2TXLivePusherJSConfig.url;
        this.mode = v2TXLivePusherJSConfig.mode;
        this.isAutoPush = v2TXLivePusherJSConfig.isAutoPush;
        this.enableBGMEventCallback = v2TXLivePusherJSConfig.enableBGMEventCallback;
        this.enableDebugView = v2TXLivePusherJSConfig.enableDebugView;
        this.isVOIP = v2TXLivePusherJSConfig.isVOIP;
        this.enableCamera = v2TXLivePusherJSConfig.enableCamera;
        this.isFrontCamera = v2TXLivePusherJSConfig.isFrontCamera;
        this.enableAutoFocus = v2TXLivePusherJSConfig.enableAutoFocus;
        this.isVerticalOrientation = v2TXLivePusherJSConfig.isVerticalOrientation;
        this.enableZoom = v2TXLivePusherJSConfig.enableZoom;
        this.enableRemoteMirror = v2TXLivePusherJSConfig.enableRemoteMirror;
        this.aspect = v2TXLivePusherJSConfig.aspect;
        this.width = v2TXLivePusherJSConfig.width;
        this.height = v2TXLivePusherJSConfig.height;
        this.minBitrate = v2TXLivePusherJSConfig.minBitrate;
        this.maxBitrate = v2TXLivePusherJSConfig.maxBitrate;
        this.fps = v2TXLivePusherJSConfig.fps;
        this.mirrorType = v2TXLivePusherJSConfig.mirrorType;
        this.enableMicrophone = v2TXLivePusherJSConfig.enableMicrophone;
        this.isMuteAudio = v2TXLivePusherJSConfig.isMuteAudio;
        this.enableAGC = v2TXLivePusherJSConfig.enableAGC;
        this.enableANS = v2TXLivePusherJSConfig.enableANS;
        this.enableEarMonitor = v2TXLivePusherJSConfig.enableEarMonitor;
        this.volumeNotifyIntervals = v2TXLivePusherJSConfig.volumeNotifyIntervals;
        this.volumeType = v2TXLivePusherJSConfig.volumeType;
        this.reverbType = v2TXLivePusherJSConfig.reverbType;
        this.voiceChangerType = v2TXLivePusherJSConfig.voiceChangerType;
        this.audioQuality = v2TXLivePusherJSConfig.audioQuality;
        this.beautyStyle = v2TXLivePusherJSConfig.beautyStyle;
        this.beautyLevel = v2TXLivePusherJSConfig.beautyLevel;
        this.whitenessLevel = v2TXLivePusherJSConfig.whitenessLevel;
        this.filterImagePath = v2TXLivePusherJSConfig.filterImagePath;
        this.watermarkImagePath = v2TXLivePusherJSConfig.watermarkImagePath;
        this.watermarkTop = v2TXLivePusherJSConfig.watermarkTop;
        this.watermarkLeft = v2TXLivePusherJSConfig.watermarkLeft;
        this.watermarkWidth = v2TXLivePusherJSConfig.watermarkWidth;
        this.backgroundImagePath = v2TXLivePusherJSConfig.backgroundImagePath;
    }
}
