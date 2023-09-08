package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import android.view.View;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import hn0.C20960b;
import jk0.C87981f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g */
public class C17990g extends C87981f {
    private static final int CTRL_INDEX = 87;
    public static final String NAME = "updateVideoPlayer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        String str;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "showPlayBtn";
        String str3 = "showFullScreenBtn";
        String str4 = "showProgressInControlMode";
        String str5 = "showProgress";
        String str6 = "showControlProgress";
        String str7 = "pageGestureInFullscreen";
        String str8 = "pageGesture";
        Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView videoPlayerId=%d", Integer.valueOf(i));
        if (!(view2 instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateVideoPlayer", "view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        AppBrandVideoView appBrandVideoView = (AppBrandVideoView) ((CoverViewContainer) view2).mo114736d(AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            Log.m105920e("MicroMsg.JsApiUpdateVideoPlayer", "view not AppBrandVideoView");
            return false;
        }
        try {
            if (jSONObject2.has("showDanmuBtn")) {
                appBrandVideoView.setShowDanmakuBtn(jSONObject2.getBoolean("showDanmuBtn"));
            }
            str = "data";
        } catch (JSONException e) {
            str = "data";
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showDanmuBtn", e.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("danmuList")) {
                appBrandVideoView.setDanmakuItemList(jSONObject2.getJSONArray("danmuList"));
            }
        } catch (JSONException e2) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "danmuList", e2.getLocalizedMessage());
        }
        String str9 = null;
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT)) {
                str9 = jSONObject2.getString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT);
                appBrandVideoView.setObjectFit(str9);
            }
        } catch (JSONException e3) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, e3.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
                appBrandVideoView.setAutoPlay(jSONObject2.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY));
            }
        } catch (JSONException e4) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, e4.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("showBasicControls")) {
                appBrandVideoView.setIsShowBasicControls(jSONObject2.getBoolean("showBasicControls"));
            }
        } catch (JSONException e5) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showBasicControls", e5.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("poster")) {
                appBrandVideoView.mo22275t(jSONObject2.getString("poster"), str9);
            }
        } catch (JSONException e6) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "poster", e6.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(TencentLocation.EXTRA_DIRECTION)) {
                appBrandVideoView.setFullScreenDirection(jSONObject2.getInt(TencentLocation.EXTRA_DIRECTION));
            }
        } catch (Exception e7) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", TencentLocation.EXTRA_DIRECTION, e7.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("muted")) {
                appBrandVideoView.setMute(jSONObject2.getBoolean("muted"));
            }
        } catch (JSONException e8) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "muted", e8.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("loop")) {
                appBrandVideoView.setLoop(jSONObject2.getBoolean("loop"));
            }
        } catch (JSONException e9) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "loop", e9.getLocalizedMessage());
        }
        String str10 = str;
        try {
            if (jSONObject2.has(str10)) {
                appBrandVideoView.setCookieData(jSONObject2.getString(str10));
            }
        } catch (JSONException e15) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str10, e15.getLocalizedMessage());
        }
        String str11 = str8;
        try {
            if (jSONObject2.has(str11)) {
                appBrandVideoView.setPageGesture(jSONObject2.getBoolean(str11));
            }
        } catch (JSONException e16) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str11, e16.getLocalizedMessage());
        }
        String str12 = str7;
        try {
            if (jSONObject2.has(str12)) {
                appBrandVideoView.setPageGestureInFullscreen(jSONObject2.getBoolean(str12));
            }
        } catch (JSONException e17) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str12, e17.getLocalizedMessage());
        }
        String str13 = str6;
        try {
            if (jSONObject2.has(str13)) {
                appBrandVideoView.setShowControlProgress(jSONObject2.getBoolean(str13));
            }
        } catch (JSONException e18) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str13, e18.getLocalizedMessage());
        }
        String str14 = str5;
        try {
            if (jSONObject2.has(str14)) {
                appBrandVideoView.setShowProgress(jSONObject2.getBoolean(str14));
            }
        } catch (JSONException e19) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str14, e19.getLocalizedMessage());
        }
        String str15 = str4;
        try {
            if (jSONObject2.has(str15)) {
                appBrandVideoView.setShowProgressBarInControlMode(jSONObject2.getBoolean(str15));
            }
        } catch (JSONException e25) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str15, e25.getLocalizedMessage());
        }
        String str16 = str3;
        try {
            if (jSONObject2.has(str16)) {
                appBrandVideoView.setShowFullScreenBtn(jSONObject2.getBoolean(str16));
            }
        } catch (JSONException e26) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str16, e26.getLocalizedMessage());
        }
        String str17 = str2;
        try {
            if (jSONObject2.has(str17)) {
                appBrandVideoView.setShowPlayBtn(jSONObject2.getBoolean(str17));
            }
        } catch (JSONException e27) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", str17, e27.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("showCenterPlayBtn")) {
                appBrandVideoView.setShowCenterPlayBtn(jSONObject2.getBoolean("showCenterPlayBtn"));
            }
        } catch (JSONException e28) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showCenterPlayBtn", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("enableProgressGesture")) {
                appBrandVideoView.mo22220g(jSONObject2.getBoolean("enableProgressGesture"));
            }
        } catch (JSONException e29) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enableProgressGesture", e29.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("duration")) {
                appBrandVideoView.setDuration(jSONObject2.getInt("duration"));
            }
        } catch (JSONException e35) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "disableScroll", e35.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("hide") && jSONObject2.getBoolean("hide")) {
                Log.m105924i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView hide stop");
                appBrandVideoView.mo22278x();
            }
        } catch (JSONException e36) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "hide", e36.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("initialTime")) {
                appBrandVideoView.setInitialTime((double) jSONObject2.getInt("initialTime"));
            }
        } catch (JSONException e37) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "initialTime", e37.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("needEvent")) {
                if (!jSONObject2.getBoolean("needEvent")) {
                    appBrandVideoView.setCallback((C20960b) null);
                } else {
                    if (!(appBrandVideoView.f49491C != null)) {
                        appBrandVideoView.setCallback(new C20960b(appBrandVideoView, hVar));
                    }
                }
            }
        } catch (JSONException e38) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "needEvent", e38.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("showMuteBtn")) {
                appBrandVideoView.setShowMuteBtn(jSONObject2.getBoolean("showMuteBtn"));
            }
        } catch (JSONException e39) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showMuteBtn", e39.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                appBrandVideoView.setTitle(jSONObject2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            }
        } catch (JSONException e44) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", FFmpegMetadataRetriever.METADATA_KEY_TITLE, e44.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("playBtnPosition")) {
                appBrandVideoView.setPlayBtnPosition(jSONObject2.getString("playBtnPosition"));
            }
        } catch (JSONException e45) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "playBtnPosition", e45.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("enablePlayGesture")) {
                appBrandVideoView.setEnablePlayGesture(jSONObject2.getBoolean("enablePlayGesture"));
            }
        } catch (JSONException e46) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enablePlayGesture", e46.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("autoPauseIfOpenNative")) {
                appBrandVideoView.setAutoPauseIfOpenNative(jSONObject2.getBoolean("autoPauseIfOpenNative"));
            }
        } catch (JSONException e47) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfOpenNative", e47.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("autoPauseIfNavigate")) {
                appBrandVideoView.setAutoPauseIfNavigate(jSONObject2.getBoolean("autoPauseIfNavigate"));
            }
        } catch (JSONException e48) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfNavigate", e48.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
                appBrandVideoView.mo22276v(jSONObject2.getString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH), jSONObject2.optBoolean(WeChatBrands.Business.GROUP_LIVE), jSONObject2.optInt("duration"));
            }
            return true;
        } catch (JSONException e49) {
            Log.m105925i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, e49.getLocalizedMessage());
            return true;
        }
    }
}
