package com.tencent.p014mm.plugin.finder.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.webview.modeltools.C43754j;
import com.tencent.p014mm.plugin.webview.modeltools.C43758q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d93.C45310h;
import di3.C86312j;
import e00.C45517q0;
import e00.C45518r0;
import e00.C45520t;
import e00.C45529v;
import eb0.C75592q0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p170ic.C46213g;
import rs1.C48079eb;
import z04.C66723k;

/* renamed from: com.tencent.mm.plugin.finder.webview.k */
public final class C41635k extends WebChromeClient {

    /* renamed from: a */
    public final WeakReference<Activity> f112074a;

    /* renamed from: b */
    public final WeakReference<C45520t> f112075b;

    /* renamed from: c */
    public final C45517q0 f112076c;

    public C41635k(WeakReference<Activity> weakReference, WeakReference<C45520t> weakReference2) {
        C48079eb ebVar;
        Class cls = C45518r0.class;
        C87412m.m108594g(weakReference, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(weakReference2, "control");
        this.f112074a = weakReference;
        this.f112075b = weakReference2;
        this.f112076c = ((C45518r0) C86312j.m106911c(cls)).mo70762t3();
        Activity activity = weakReference.get();
        if (activity != null && (ebVar = (C48079eb) C39818r.f106831a.mo62443b(activity).mo62449e(C48079eb.class)) != null && ebVar.f128929d == null) {
            Log.m105924i("Finder.FinderWebClientUIC", "create chooser");
            ebVar.f128929d = ((C45518r0) C86312j.m106911c(cls)).mo70753Mi();
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C87412m.m108594g(consoleMessage, StateEvent.Name.MESSAGE);
        C46213g.m51505a(consoleMessage, "Finder.FinderWebChromeClient", false);
        return super.onConsoleMessage(consoleMessage);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C45520t tVar;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(callback, "callback");
        Activity activity = this.f112074a.get();
        if (activity != null && (tVar = this.f112075b.get()) != null) {
            ((C43758q) this.f112076c).mo68071h(activity, tVar.getCurrentUrl(), tVar.mo63683n0(), tVar.mo67758z(), C75592q0.m90789s(), str, callback);
        }
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        Activity activity = this.f112074a.get();
        if (activity != null) {
            C45517q0 q0Var = this.f112076c;
            C45520t tVar = this.f112075b.get();
            ((C43758q) q0Var).mo68072i(permissionRequest, activity, tVar != null ? tVar.getCurrentUrl() : null);
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C48079eb ebVar;
        C45529v vVar;
        super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        Log.m105924i("Finder.FinderWebChromeClient", "showChooser");
        C87412m.m108591d(fileChooserParams);
        if (fileChooserParams.getMode() != 0 && fileChooserParams.getMode() != 1) {
            return false;
        }
        if (fileChooserParams.getAcceptTypes() != null) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            C87412m.m108593f(acceptTypes, "fileChooserParams.acceptTypes");
            if (!(acceptTypes.length == 0)) {
                String[] acceptTypes2 = fileChooserParams.getAcceptTypes();
                String str = fileChooserParams.isCaptureEnabled() ? "true" : "false";
                Log.m105925i("Finder.FinderWebChromeClient", "onShowFileChooser mode: %d, catpure: %s", Integer.valueOf(fileChooserParams.getMode()), Boolean.valueOf(fileChooserParams.isCaptureEnabled()));
                Activity activity = this.f112074a.get();
                if (!(activity == null || (ebVar = (C48079eb) C39818r.f106831a.mo62443b(activity).mo62449e(C48079eb.class)) == null || (vVar = ebVar.f128929d) == null)) {
                    C45520t tVar = this.f112075b.get();
                    ((C43754j) vVar).mo68060c(activity, tVar != null ? tVar.mo67669E() : null, (ValueCallback<Uri>) null, valueCallback, acceptTypes2, str, fileChooserParams.createIntent());
                }
                return true;
            }
        }
        Log.m105924i("Finder.FinderWebChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C48079eb ebVar;
        C45529v vVar;
        String[] strArr;
        super.openFileChooser(valueCallback, str, str2);
        Log.m105924i("Finder.FinderWebChromeClient", "openChooser");
        Activity activity = this.f112074a.get();
        if (activity != null && (ebVar = (C48079eb) C39818r.f106831a.mo62443b(activity).mo62449e(C48079eb.class)) != null && (vVar = ebVar.f128929d) != null) {
            C45520t tVar = this.f112075b.get();
            C45310h E = tVar != null ? tVar.mo67669E() : null;
            if (str != null) {
                Object[] array = new C66723k(",").mo90760e(str, 0).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                strArr = (String[]) array;
            } else {
                strArr = null;
            }
            ((C43754j) vVar).mo68060c(activity, E, valueCallback, (ValueCallback<Uri[]>) null, strArr, str2, (Intent) null);
        }
    }
}
