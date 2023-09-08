package p357lo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.C116360i;
import com.tencent.pigeon.Link;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import kr0.C76630x0;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* renamed from: lo.f */
public final class C117476f implements Link.LinkHandlerApi, FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public Activity f351565d;

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f351565d = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C116360i.m163996d(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromActivity() {
        this.f351565d = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f351565d = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C116360i.m163996d(flutterPluginBinding.getBinaryMessenger(), (Link.LinkHandlerApi) null);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f351565d = activityPluginBinding.getActivity();
    }

    public void openLink(String str) {
        C87412m.m108594g(str, "url");
        Log.m105925i("MicroMsg.FlutterLinkPlugin", "openLink url:%s", str);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_scene", 56);
        C88144b.m109791i(this.f351565d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    public void openWeAppLink(Link.LinkWeAppJumpInfo linkWeAppJumpInfo) {
        C87412m.m108594g(linkWeAppJumpInfo, "linkWrap");
        String appId = linkWeAppJumpInfo.getAppId();
        String pagePath = linkWeAppJumpInfo.getPagePath();
        int i = 0;
        Log.m105925i("MicroMsg.FlutterLinkPlugin", "openWeAppLink appId:%s, path:%s", appId, pagePath);
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        Long scene = linkWeAppJumpInfo.getScene();
        if (scene != null) {
            i = (int) scene.longValue();
        }
        appBrandStatObject.f245533f = i;
        appBrandStatObject.f245534g = linkWeAppJumpInfo.getSceneNote();
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(this.f351565d, (String) null, appId, 0, 0, pagePath, appBrandStatObject);
    }
}
