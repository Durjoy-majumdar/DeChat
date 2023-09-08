package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import hn0.C20960b;
import jk0.C87978d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a */
public class C17988a extends C87978d {
    public static final int CTRL_INDEX = 6;
    public static final String NAME = "insertVideoPlayer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("videoPlayerId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        int i;
        Context context = hVar.getContext();
        AppBrandVideoViewControlBar appBrandVideoViewControlBar = new AppBrandVideoViewControlBar(context);
        AppBrandVideoWrapper appBrandVideoWrapper = new AppBrandVideoWrapper(context, (AttributeSet) null);
        appBrandVideoWrapper.setVideoFooterView(appBrandVideoViewControlBar);
        String optString = jSONObject.optString("playerHint");
        if (!TextUtils.isEmpty(optString)) {
            i = 0;
            for (String str : optString.split(",")) {
                if ("supportSoftDecode".equals(str.trim())) {
                    i |= 1;
                } else if ("mp4Only".equals(str.trim())) {
                    i |= 2;
                }
            }
        } else {
            i = 0;
        }
        Log.m105925i("MicroMsg.JsApiInsertVideoPlayer", "convertPlayerHint, playerHintStr: %s, playerHint: %d", optString, Integer.valueOf(i));
        appBrandVideoWrapper.setPlayerHint(i);
        AppBrandVideoView appBrandVideoView = new AppBrandVideoView(context, appBrandVideoWrapper);
        appBrandVideoView.mo22230k(appBrandVideoViewControlBar);
        return new CoverViewContainer(context, (View) appBrandVideoView);
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C82520h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        Log.m105925i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView videoPlayerId=%d", Integer.valueOf(i));
        AppBrandVideoView appBrandVideoView = (AppBrandVideoView) ((CoverViewContainer) view).mo114736d(AppBrandVideoView.class);
        if (appBrandVideoView == null) {
            Log.m105920e("MicroMsg.JsApiInsertVideoPlayer", "onInsertView appBrandVideoView null");
            return;
        }
        boolean optBoolean = jSONObject2.optBoolean("independent", false);
        C17989b bVar = new C17989b(this);
        a$$a a__a = new a$$a(appBrandVideoView);
        a$$b a__b = new a$$b(hVar2, appBrandVideoView);
        a$$c a__c = new a$$c(appBrandVideoView, bVar);
        if (optBoolean) {
            String appId = hVar.getAppId();
            C83050c cVar = new C83050c(this, a__b, a__a, a__c);
            bVar.f49592d = new a$$d(appId, cVar);
            C83231l.m102140a(appId, cVar);
        } else {
            bVar.f49592d = new a$$e(hVar2, a__a, a__b, a__c);
            hVar2.mo114868y(a__a);
            hVar2.mo114864j(a__b);
            hVar2.mo114865m(a__c);
        }
        appBrandVideoView.setFullScreenDelegate(new a$$g(this, hVar, optBoolean, i, new a$$f(this, appBrandVideoView)));
        appBrandVideoView.setContentDescription(view.getContext().getString(C0966R.string.f7585kd));
        appBrandVideoView.setMute(jSONObject2.optBoolean("muted", false));
        boolean optBoolean2 = jSONObject2.optBoolean("needEvent", false);
        boolean optBoolean3 = jSONObject2.optBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, false);
        Log.m105925i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView autoPlay=%b needEvent=%b", Boolean.valueOf(optBoolean3), Boolean.valueOf(optBoolean2));
        boolean optBoolean4 = jSONObject2.optBoolean("showDanmuBtn", false);
        boolean optBoolean5 = jSONObject2.optBoolean("enableDanmu", false);
        JSONArray optJSONArray = jSONObject2.optJSONArray("danmuList");
        String optString = jSONObject2.optString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT);
        String optString2 = jSONObject2.optString("poster");
        boolean optBoolean6 = jSONObject2.optBoolean("showBasicControls", true);
        String optString3 = jSONObject2.optString("data");
        int optInt = jSONObject2.optInt(TencentLocation.EXTRA_DIRECTION, -1);
        boolean optBoolean7 = jSONObject2.optBoolean("loop", false);
        boolean z = optBoolean2;
        boolean optBoolean8 = jSONObject2.optBoolean("pageGesture", false);
        JSONArray jSONArray = optJSONArray;
        boolean optBoolean9 = jSONObject2.optBoolean("pageGestureInFullscreen", true);
        boolean z2 = optBoolean5;
        double optDouble = jSONObject2.optDouble("initialTime", 0.0d);
        boolean optBoolean10 = jSONObject2.optBoolean("showProgress", true);
        boolean optBoolean11 = jSONObject2.optBoolean("showProgressInControlMode", true);
        boolean optBoolean12 = jSONObject2.optBoolean("showFullScreenBtn", true);
        boolean optBoolean13 = jSONObject2.optBoolean("showPlayBtn", true);
        boolean optBoolean14 = jSONObject2.optBoolean("showCenterPlayBtn", true);
        boolean optBoolean15 = jSONObject2.optBoolean("enableProgressGesture", true);
        String optString4 = jSONObject2.optString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "default");
        String str = "default";
        boolean optBoolean16 = jSONObject2.optBoolean("showMuteBtn", false);
        String optString5 = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        boolean optBoolean17 = jSONObject2.optBoolean("showControlProgress", true);
        boolean z3 = optBoolean10;
        String optString6 = jSONObject2.optString("playBtnPosition", "bottom");
        boolean optBoolean18 = jSONObject2.optBoolean("enablePlayGesture", false);
        boolean optBoolean19 = jSONObject2.optBoolean("autoPauseIfNavigate", true);
        boolean optBoolean20 = jSONObject2.optBoolean("autoPauseIfOpenNative", true);
        String optString7 = jSONObject2.optString("backgroundColor");
        appBrandVideoView.setComponent(hVar2);
        appBrandVideoView.setCookieData(optString3);
        appBrandVideoView.setIsShowBasicControls(optBoolean6);
        appBrandVideoView.mo22275t(optString2, optString);
        appBrandVideoView.setFullScreenDirection(optInt);
        appBrandVideoView.setObjectFit(optString);
        appBrandVideoView.setLoop(optBoolean7);
        appBrandVideoView.setPageGesture(optBoolean8);
        appBrandVideoView.setPageGestureInFullscreen(optBoolean9);
        try {
            appBrandVideoView.setVideoPlayerId(jSONObject2.getInt("videoPlayerId"));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiInsertVideoPlayer", "inflateView setVideoPlayerId exp=%s", e);
        }
        appBrandVideoView.setAutoPlay(optBoolean3);
        appBrandVideoView.setShowDanmakuBtn(optBoolean4);
        appBrandVideoView.setDanmakuEnable(z2);
        appBrandVideoView.setDanmakuItemList(jSONArray);
        appBrandVideoView.setInitialTime(optDouble);
        appBrandVideoView.setShowControlProgress(optBoolean17);
        appBrandVideoView.setShowProgress(z3);
        appBrandVideoView.setShowProgressBarInControlMode(optBoolean11);
        appBrandVideoView.setShowFullScreenBtn(optBoolean12);
        appBrandVideoView.setShowPlayBtn(optBoolean13);
        appBrandVideoView.setShowCenterPlayBtn(optBoolean14);
        appBrandVideoView.mo22220g(optBoolean15);
        if (optString4.equalsIgnoreCase(str)) {
            appBrandVideoView.setVideoSource(0);
        } else {
            appBrandVideoView.setVideoSource(1);
        }
        appBrandVideoView.setShowMuteBtn(optBoolean16);
        appBrandVideoView.setTitle(optString5);
        appBrandVideoView.setPlayBtnPosition(optString6);
        appBrandVideoView.setEnablePlayGesture(optBoolean18);
        appBrandVideoView.setAutoPauseIfNavigate(optBoolean19);
        appBrandVideoView.setAutoPauseIfOpenNative(optBoolean20);
        if (!TextUtils.isEmpty(optString7)) {
            int i2 = -16777216;
            if ("transparent".equals(optString7)) {
                i2 = 0;
            } else {
                try {
                    i2 = Color.parseColor(optString7);
                } catch (IllegalArgumentException unused) {
                }
            }
            appBrandVideoView.setBackgroundColor(i2);
        }
        if (z) {
            appBrandVideoView.setCallback(new C20960b(appBrandVideoView, hVar2));
        }
        int optInt2 = jSONObject2.optInt("duration", -1);
        String optString8 = jSONObject2.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        boolean optBoolean21 = jSONObject2.optBoolean(WeChatBrands.Business.GROUP_LIVE, false);
        Log.m105925i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView filePath=%s live=%b", optString8, Boolean.valueOf(optBoolean21));
        appBrandVideoView.mo22276v(optString8, optBoolean21, optInt2);
    }
}
