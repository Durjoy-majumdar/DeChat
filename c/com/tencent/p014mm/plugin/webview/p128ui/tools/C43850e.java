package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C30584q;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.modeltools.C43755k;
import com.tencent.p014mm.plugin.webview.modeltools.C43756l;
import com.tencent.p014mm.plugin.webview.modeltools.C6085v;
import com.tencent.p014mm.plugin.webview.modeltools.WebViewClipBoardHelper;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import di3.C86312j;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import lg3.C88496e;
import ob0.C47350c;
import p248ug.C52570c0;
import pe3.C89349b;
import te3.x54;
import te3.y54;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.e */
public class C43850e extends ProxyWebViewClientExtension {

    /* renamed from: a */
    public final WeakReference<WebViewUI> f118762a;

    /* renamed from: b */
    public WebViewClipBoardHelper f118763b;

    public C43850e(WebViewUI webViewUI) {
        this.f118762a = new WeakReference<>(webViewUI);
        this.f118763b = new WebViewClipBoardHelper(webViewUI);
    }

    public Object onMiscCallBack(String str, Bundle bundle) {
        C43791l lVar;
        String str2;
        C43791l lVar2;
        C43791l lVar3;
        C43791l lVar4;
        C43791l lVar5;
        C43791l lVar6;
        C43791l lVar7;
        Class cls = C52570c0.class;
        WebViewUI webViewUI = this.f118762a.get();
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(bundle == null);
        objArr[2] = Boolean.valueOf(webViewUI == null || webViewUI.f118511a1 == null);
        Log.m105925i("MicroMsg.DefaultProxyWebViewClientExtension", "method = %s, bundler == null ? %b, invoker == null ? %b", objArr);
        Bundle bundle2 = null;
        if (!Util.isNullOrNil(str) && bundle != null) {
            if (!(this.f118762a.get() == null || this.f118762a.get().isFinishing()) && webViewUI != null) {
                if (str.equals("getCustomHeaders")) {
                    return C30584q.f82375a.mo57492a(bundle.getString("url", (String) null));
                }
                if (str.equals(JsApiAddDownloadTask.NAME) && (lVar7 = webViewUI.f118511a1) != null) {
                    try {
                        Bundle V5 = lVar7.mo68114V5(14, bundle);
                        if (V5 != null) {
                            return Long.valueOf(V5.getLong("download_id", 0));
                        }
                    } catch (RemoteException unused) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "invoke the add downloadtask failed");
                    }
                }
                if (str.equals(JsApiCancelDownloadTask.NAME) && (lVar6 = webViewUI.f118511a1) != null) {
                    try {
                        Bundle V52 = lVar6.mo68114V5(16, bundle);
                        if (V52 != null) {
                            return Boolean.valueOf(V52.getBoolean("cancel_result", false));
                        }
                    } catch (RemoteException unused2) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "invoke the cancel downloadtask failed");
                    }
                }
                if (str.equals(JsApiQueryDownloadTask.NAME) && (lVar5 = webViewUI.f118511a1) != null) {
                    try {
                        Bundle V53 = lVar5.mo68114V5(15, bundle);
                        if (V53 != null) {
                            return Integer.valueOf(V53.getInt("download_state", 0));
                        }
                    } catch (RemoteException unused3) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "invoke the queryDownloadTask downloadtask failed");
                    }
                }
                if (str.equals(C1574a3.NAME) && (lVar4 = webViewUI.f118511a1) != null) {
                    try {
                        return lVar4.mo68114V5(112, bundle);
                    } catch (RemoteException unused4) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "invoke getOAID failed");
                    }
                }
                if (str.equals(JsApiInstallDownloadTask.NAME) && (lVar3 = webViewUI.f118511a1) != null) {
                    try {
                        Bundle V54 = lVar3.mo68114V5(17, bundle);
                        if (V54 != null) {
                            return Boolean.valueOf(V54.getBoolean("install_result"));
                        }
                    } catch (RemoteException unused5) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "invoke the install downloadtask failed");
                    }
                }
                if (str.equals("getDrawable")) {
                    String string = bundle.getString("packageName");
                    int i = bundle.getInt("resourceId");
                    if (!Util.isNullOrNil(string) && i > 0) {
                        try {
                            return C88496e.m110362f(MMApplicationContext.getContext().getPackageManager().getResourcesForApplication(string), i);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.DefaultProxyWebViewClientExtension", "get resource for package : %s, fail, : %s", string, e.getMessage());
                        }
                    }
                }
                if (str.equals("getShareUrl") && (lVar2 = webViewUI.f118511a1) != null) {
                    try {
                        String cU = lVar2.mo68123cU(webViewUI.f118523f.getUrl());
                        Log.m105925i("MicroMsg.DefaultProxyWebViewClientExtension", "getShareUrl by x5 core, shareurl = %s", cU);
                        return cU;
                    } catch (Exception unused6) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "getShare url failed");
                    }
                }
                if (str.equals("smartPickWord")) {
                    String charSequence = webViewUI.getMMTitle() != null ? webViewUI.getMMTitle().toString() : "";
                    String currentURL = webViewUI.getCurrentURL();
                    C43756l.f118233a = null;
                    C43756l.f118234b = null;
                    C43756l.f118235c = null;
                    try {
                        x54 x54 = new x54();
                        x54.f144466d = bundle.getString("PickedWord");
                        x54.f144467e = bundle.getString("PrefixText");
                        x54.f144468f = bundle.getString("SuffixText");
                        x54.f144469g = bundle.getInt("Scene");
                        x54.f144470h = bundle.getInt("MainIndex", -1);
                        x54.f144471i = currentURL;
                        x54.f144472j = charSequence;
                        x54.f144473n = bundle.getString("SubPickedWord");
                        x54.f144474o = bundle.getString("SubPrefixText");
                        x54.f144475p = bundle.getString("SubSuffixText");
                        x54.f144476q = bundle.getInt("SubIndex", -1);
                        x54.f144477r = bundle.getInt("TagNewLineBefore", -1);
                        x54.f144478s = bundle.getInt("TagNewLineAfter", -1);
                        x54.f144479t = bundle.getInt("TagNewLineBeforeSub", -1);
                        x54.f144480u = bundle.getInt("TagNewLineAfterSub", -1);
                        Log.m105925i("MicroMsg.SmartPickWordHelper", "req: PrefixText: %s, PickedWord: %s, SuffixText: %s", x54.f144467e, x54.f144466d, x54.f144468f);
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        bVar.f127066a = x54;
                        bVar.f127067b = new y54();
                        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchsmartpickword";
                        bVar.f127069d = 2974;
                        bVar.f127070e = 0;
                        bVar.f127071f = 0;
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        Bundle bundle3 = new Bundle();
                        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C43755k(countDownLatch, bundle3));
                        try {
                            countDownLatch.await(1000, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e2) {
                            Log.m105928w("MicroMsg.SmartPickWordHelper", e2.getMessage());
                            Log.printErrStackTrace("MicroMsg.SmartPickWordHelper", e2, "", new Object[0]);
                        }
                        Log.m105924i("MicroMsg.SmartPickWordHelper", "smartPickWord end");
                        return bundle3;
                    } catch (Exception unused7) {
                        Log.m105920e("MicroMsg.SmartPickWordHelper", "smartPickWord url failed");
                        return null;
                    }
                } else if (str.equals("jumpToSos") && webViewUI.f118511a1 != null) {
                    try {
                        String str3 = C43756l.f118234b;
                        if (str3 != null) {
                            bundle.putString("searchId", str3);
                        }
                        C89349b bVar2 = C43756l.f118235c;
                        if (bVar2 != null) {
                            bundle.putString("extQueryInfo", bVar2.mo123705h());
                        }
                        Bundle V55 = webViewUI.f118511a1.mo68114V5(104, bundle);
                        C43756l.m47603a(bundle.getString(SearchIntents.EXTRA_QUERY), webViewUI.getCurrentURL());
                        if (V55 != null) {
                            return Boolean.valueOf(V55.getBoolean("open_result"));
                        }
                    } catch (RemoteException unused8) {
                        Log.m105920e("MicroMsg.DefaultProxyWebViewClientExtension", "jumpToSos failed");
                    }
                    return null;
                } else if (str.equals("supportSmartPickWord")) {
                    return (!C86709a0.m107522a() || !C86709a0.m107523b().mo121115m()) ? Boolean.TRUE : Boolean.valueOf(!((C52570c0) C86709a0.m107533q(cls)).mo58182e());
                } else {
                    if (str.equals("onShowSos")) {
                        String currentURL2 = webViewUI.getCurrentURL();
                        boolean z2 = bundle.getBoolean("IsCursorMove", false);
                        try {
                            str2 = URLEncoder.encode(Util.nullAsNil(currentURL2), "UTF-8");
                        } catch (UnsupportedEncodingException e3) {
                            Log.printErrStackTrace("MicroMsg.SmartPickWordHelper", e3, "", new Object[0]);
                            str2 = "";
                        }
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = Integer.valueOf(z2 ? 3 : 1);
                        objArr2[1] = str2;
                        objArr2[2] = "";
                        objArr2[3] = "";
                        objArr2[4] = Integer.valueOf(z2 ? 1 : 0);
                        objArr2[5] = C43756l.f118234b;
                        nVar.mo160131h(13742, objArr2);
                        return null;
                    } else if (str.equals("onClickCopyBtn") && this.f118763b != null) {
                        this.f118763b.mo68043a(bundle.getString(MimeTypes.BASE_TYPE_TEXT));
                        return null;
                    } else if (str.equals("supportImagePreview")) {
                        return Boolean.TRUE;
                    } else {
                        if (str.equals("shouldInterceptLoadError")) {
                            int i2 = bundle.getInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
                            String string2 = bundle.getString("description");
                            String string3 = bundle.getString("failingUrl");
                            C43522y yVar = webViewUI.f118513b1;
                            if (yVar != null) {
                                yVar.shouldInterceptLoadError(webViewUI.f118523f, i2, string2, string3);
                            }
                            return null;
                        } else if (str.equals("imagePreview")) {
                            try {
                                bundle2 = ((C44132q1) webViewUI.f118492T1).mo7031V5(18, new Bundle());
                            } catch (Exception unused9) {
                            }
                            C6085v.m5951b(bundle, webViewUI.f118523f, bundle2, webViewUI.f118450B);
                            return Boolean.TRUE;
                        } else if (str.equals("closeImagePreview") && (lVar = webViewUI.f118511a1) != null) {
                            int i3 = C6085v.f22418b;
                            try {
                                lVar.mo68114V5(108, new Bundle());
                            } catch (RemoteException unused10) {
                            }
                            return Boolean.TRUE;
                        } else if (str.equals("enableDownload")) {
                            boolean e4 = ((C52570c0) C86709a0.m107533q(cls)).mo58182e();
                            C43522y yVar2 = webViewUI.f118513b1;
                            boolean z3 = yVar2 != null ? yVar2.f117589s : false;
                            Log.m105925i("MicroMsg.DefaultProxyWebViewClientExtension", "onMiscCallback enableDownload isTeenMode: %b, isMarkForbidX5Download: %b", Boolean.valueOf(e4), Boolean.valueOf(z3));
                            if (!e4 && !z3) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                }
            }
        }
        return null;
    }
}
