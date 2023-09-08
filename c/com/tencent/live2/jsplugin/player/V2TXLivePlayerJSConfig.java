package com.tencent.live2.jsplugin.player;

import android.os.Bundle;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.impl.V2TXLiveUtils;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;

public class V2TXLivePlayerJSConfig {
    public static int sAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
    public int audioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal();
    public boolean enableDebugView;
    public boolean enableRecvSEIMessage;
    public V2TXLiveDef.V2TXLiveFillMode fillMode = V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill;
    public boolean isAutoPlay;
    public boolean isCanAutoPlay = true;
    public boolean isMuteAudio;
    public boolean isMuteVideo;
    public float maxCache = 3.0f;
    public float minCache = 1.0f;
    public int mode = 1;
    public V2TXLiveDef.V2TXLiveRotation renderRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
    public String url = "";
    public int volumeNotifyIntervals;

    public V2TXLivePlayerJSConfig() {
    }

    public String diffConfig(V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig) {
        StringBuilder sb = new StringBuilder();
        String str = this.url;
        if (str != null && !str.equals(v2TXLivePlayerJSConfig.url)) {
            sb.append("[url:");
            sb.append(V2TXLiveUtils.removeURLSensitiveInfo(this.url));
            sb.append("]");
        }
        if (this.mode != v2TXLivePlayerJSConfig.mode) {
            sb.append("[mode:");
            sb.append(this.mode);
            sb.append("]");
        }
        if (this.isCanAutoPlay != v2TXLivePlayerJSConfig.isCanAutoPlay) {
            sb.append("[isCanAutoPlay:");
            sb.append(this.isCanAutoPlay);
            sb.append("]");
        }
        if (this.isAutoPlay != v2TXLivePlayerJSConfig.isAutoPlay) {
            sb.append("[isAutoPlay:");
            sb.append(this.isAutoPlay);
            sb.append("]");
        }
        if (this.isMuteVideo != v2TXLivePlayerJSConfig.isMuteVideo) {
            sb.append("[isMuteVideo:");
            sb.append(this.isMuteVideo);
            sb.append("]");
        }
        if (this.isMuteAudio != v2TXLivePlayerJSConfig.isMuteAudio) {
            sb.append("[isMuteAudio:");
            sb.append(this.isMuteAudio);
            sb.append("]");
        }
        if (this.enableRecvSEIMessage != v2TXLivePlayerJSConfig.enableRecvSEIMessage) {
            sb.append("[enableRecvSEIMessage:");
            sb.append(this.enableRecvSEIMessage);
            sb.append("]");
        }
        if (this.minCache != v2TXLivePlayerJSConfig.minCache) {
            sb.append("[minCache:");
            sb.append(this.minCache);
            sb.append("]");
        }
        if (this.maxCache != v2TXLivePlayerJSConfig.maxCache) {
            sb.append("[macCache:");
            sb.append(this.maxCache);
            sb.append("]");
        }
        if (this.audioRoute != v2TXLivePlayerJSConfig.audioRoute) {
            sb.append("[audioRoute:");
            sb.append(this.audioRoute == TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() ? "speaker" : "ear");
            sb.append("]");
        }
        if (this.volumeNotifyIntervals != v2TXLivePlayerJSConfig.volumeNotifyIntervals) {
            sb.append("[volumeNotifyIntervals:");
            sb.append(this.volumeNotifyIntervals);
            sb.append("]");
        }
        if (this.fillMode != v2TXLivePlayerJSConfig.fillMode) {
            sb.append("[fillMode:");
            sb.append(this.fillMode);
            sb.append("]");
        }
        if (this.renderRotation != v2TXLivePlayerJSConfig.renderRotation) {
            sb.append("[renderRotation:");
            sb.append(this.renderRotation);
            sb.append("]");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[url:");
        sb.append(V2TXLiveUtils.removeURLSensitiveInfo(this.url));
        sb.append("][mode:");
        sb.append(this.mode);
        sb.append("][isAutoPlay:");
        sb.append(this.isAutoPlay);
        sb.append("][isCanAutoPlay:");
        sb.append(this.isCanAutoPlay);
        sb.append("][isMuteVideo:");
        sb.append(this.isMuteVideo);
        sb.append("][isMuteAudio:");
        sb.append(this.isMuteAudio);
        sb.append("][enableDebugView:");
        sb.append(this.enableDebugView);
        sb.append("][enableRecvSEIMessage:");
        sb.append(this.enableRecvSEIMessage);
        sb.append("][minCache:");
        sb.append(this.minCache);
        sb.append("][maxCache:");
        sb.append(this.maxCache);
        sb.append("][volumeNotifyIntervals:");
        sb.append(this.volumeNotifyIntervals);
        sb.append("][audioRoute:");
        sb.append(this.audioRoute == TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() ? "speaker" : "ear");
        sb.append("][fillMode:");
        sb.append(this.fillMode);
        sb.append("][renderRotation:");
        sb.append(this.renderRotation);
        sb.append(']');
        return sb.toString();
    }

    public void updateFromBundle(Bundle bundle) {
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL)) {
            this.url = bundle.getString(V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, "");
        }
        if (bundle.containsKey("mode")) {
            this.mode = bundle.getInt("mode");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
            this.isAutoPlay = bundle.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY)) {
            this.isCanAutoPlay = bundle.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO)) {
            this.isMuteVideo = bundle.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO)) {
            this.isMuteAudio = bundle.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO);
        }
        if (bundle.containsKey("muted")) {
            this.isMuteAudio = bundle.getBoolean("muted");
        }
        if (bundle.containsKey("orientation")) {
            this.renderRotation = bundle.getString("orientation", "").equalsIgnoreCase("horizontal") ? V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90 : V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT)) {
            this.fillMode = bundle.getString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "").equalsIgnoreCase("fillCrop") ? V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill : V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit;
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE)) {
            this.minCache = bundle.getFloat(V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE)) {
            this.maxCache = bundle.getFloat(V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE);
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE)) {
            this.enableRecvSEIMessage = bundle.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE);
        }
        if (bundle.containsKey("needAudioVolume")) {
            this.volumeNotifyIntervals = bundle.getBoolean("needAudioVolume") ? 300 : 0;
        }
        if (bundle.containsKey("debug")) {
            this.enableDebugView = bundle.getBoolean("debug");
        }
        if (bundle.containsKey(V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE)) {
            int ordinal = bundle.getString(V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE, "").equalsIgnoreCase("speaker") ? TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal() : TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece.ordinal();
            this.audioRoute = ordinal;
            sAudioRoute = ordinal;
        }
    }

    public V2TXLivePlayerJSConfig(V2TXLivePlayerJSConfig v2TXLivePlayerJSConfig) {
        this.url = v2TXLivePlayerJSConfig.url;
        this.mode = v2TXLivePlayerJSConfig.mode;
        this.isAutoPlay = v2TXLivePlayerJSConfig.isAutoPlay;
        this.isCanAutoPlay = v2TXLivePlayerJSConfig.isCanAutoPlay;
        this.isMuteAudio = v2TXLivePlayerJSConfig.isMuteAudio;
        this.isMuteVideo = v2TXLivePlayerJSConfig.isMuteVideo;
        this.enableDebugView = v2TXLivePlayerJSConfig.enableDebugView;
        this.enableRecvSEIMessage = v2TXLivePlayerJSConfig.enableRecvSEIMessage;
        this.minCache = v2TXLivePlayerJSConfig.minCache;
        this.maxCache = v2TXLivePlayerJSConfig.maxCache;
        this.volumeNotifyIntervals = v2TXLivePlayerJSConfig.volumeNotifyIntervals;
        this.audioRoute = v2TXLivePlayerJSConfig.audioRoute;
        this.fillMode = v2TXLivePlayerJSConfig.fillMode;
        this.renderRotation = v2TXLivePlayerJSConfig.renderRotation;
    }
}
