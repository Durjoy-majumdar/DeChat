package vk2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import bx0.C39846d;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import p910lj.C76701a;
import vk2.C14880b0;
import zt3.C119157j;

/* renamed from: vk2.f0 */
public final class C14885f0 extends C14884f {

    /* renamed from: b */
    public final C39846d f40916b;

    /* renamed from: vk2.f0$a */
    public static final class C14886a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14885f0 f40917d;

        public C14886a(C14885f0 f0Var) {
            this.f40917d = f0Var;
        }

        public final void run() {
            this.f40917d.f40916b.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14885f0(C39846d dVar) {
        super(dVar);
        C87412m.m108594g(dVar, "uiComponent");
        this.f40916b = dVar;
    }

    /* renamed from: b */
    public final boolean mo13948b(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ScanBoxWebViewJSApi", "doOpenProfilePage fail, username is null");
            C76701a.makeText(this.f40916b.mo62488k0(), (CharSequence) this.f40916b.mo62488k0().getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
            return false;
        }
        Log.m105924i("MicroMsg.ScanBoxWebViewJSApi", "doOpenProfilePage success, username is " + str);
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 300);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        C88144b.m109791i(this.f40916b.mo62488k0(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        return true;
    }

    @JavascriptInterface
    public final void closePage(String str) {
        Log.m105925i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi closePage: %s", str);
        ((C119157j) C119157j.f356862d).mo183895z(new C14886a(this));
    }

    @JavascriptInterface
    public final void openAdPage(String str) {
        C87412m.m108594g(str, "params");
        Log.m105919d("MicroMsg.ScanBoxWebViewJSApi", "alvinluo openAdPage %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("adXml", "");
            String optString2 = jSONObject.optString("uxinfo", "");
            Log.m105924i("MicroMsg.ScanBoxWebViewJSApi", "openAdPage, adXml=" + optString);
            Intent intent = new Intent();
            intent.putExtra("sns_landing_pages_xml", optString);
            intent.putExtra("sns_landig_pages_from_source", 14);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent.putExtra("sns_landing_pages_ux_info", optString2);
            if (this.f40916b.mo62488k0() != null) {
                C88144b.m109791i(this.f40916b.mo62488k0(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanBoxWebViewJSApi", e, "alvinluo openAdPage exception", new Object[0]);
        }
    }

    @JavascriptInterface
    public final void openProfilePage(String str) {
        C87412m.m108594g(str, "params");
        Log.m105919d("MicroMsg.ScanBoxWebViewJSApi", "alvinluo openProfilePage %s", str);
        try {
            Log.m105925i("MicroMsg.ScanBoxWebViewJSApi", "alvinluo openProfilePage result: %b", Boolean.valueOf(mo13948b(new JSONObject(str).optString("username", ""))));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanBoxWebViewJSApi", e, "alvinluo openProfilePage exception", new Object[0]);
        }
    }

    @JavascriptInterface
    public final void openVideoPage(String str) {
        C87412m.m108594g(str, "params");
        Log.m105924i("MicroMsg.ScanBoxWebViewJSApi", "openVideoPage param = " + str);
        try {
            String optString = new JSONObject(str).optString("videoUrl", "");
            if (Util.isNullOrNil(optString)) {
                Log.m105924i("MicroMsg.ScanBoxWebViewJSApi", "openVideoPage videoUrl null");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", optString);
            Context k0 = this.f40916b.mo62488k0();
            if (k0 != null) {
                C88144b.m109791i(k0, "brandservice", ".ui.timeline.video.lite.VideoLiteUI", intent, (Bundle) null);
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public final void openWebView(String str) {
        C87412m.m108594g(str, "params");
        Log.m105925i("MicroMsg.ScanBoxWebViewJSApi", "alvinluo openWebView %s", str);
        try {
            String optString = new JSONObject(str).optString("url", "");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", optString);
            intent.putExtra("geta8key_scene", 67);
            Context k0 = this.f40916b.mo62488k0();
            if (k0 != null) {
                C88144b.m109791i(k0, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanBoxWebViewJSApi", e, "alvinluo openWebView exception", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (r9 == null) goto L_0x009d;
     */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showShareMenu(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            java.lang.String r3 = "MicroMsg.ScanBoxWebViewJSApi"
            java.lang.String r4 = "scanBoxJsApi showShareMenu: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            bx0.d r1 = r11.f40916b
            android.content.Context r1 = r1.mo62488k0()
            java.lang.String r3 = "uiComponent.activityContext"
            gy3.C87412m.m108593f(r1, r3)
            vk2.d0 r3 = vk2.C14883d0.f40912d
            vk2.d0 r3 = vk2.C14883d0.f40912d
            java.lang.String r4 = "MicroMsg.ScanBoxShareHelper"
            java.lang.String r5 = "url"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0124 }
            r6.<init>(r12)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r12 = r6.optString(r5)     // Catch:{ Exception -> 0x0124 }
            vk2.b0 r6 = vk2.C14883d0.f40915g     // Catch:{ Exception -> 0x0124 }
            gy3.C87412m.m108593f(r12, r5)     // Catch:{ Exception -> 0x0124 }
            r6.getClass()     // Catch:{ Exception -> 0x0124 }
            java.util.HashMap<java.lang.String, vk2.b0$a> r6 = r6.f40908a     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ Exception -> 0x0124 }
            vk2.b0$a r6 = (vk2.C14880b0.C14881a) r6     // Catch:{ Exception -> 0x0124 }
            vk2.C14883d0.f40914f = r6     // Catch:{ Exception -> 0x0124 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0124 }
            r6.<init>()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = "shareToFriend, imageUrl: "
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            vk2.b0$a r7 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            r8 = 0
            if (r7 == 0) goto L_0x0051
            java.lang.String r7 = r7.f40910b     // Catch:{ Exception -> 0x0124 }
            goto L_0x0052
        L_0x0051:
            r7 = r8
        L_0x0052:
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = ", desc: "
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            vk2.b0$a r7 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            if (r7 == 0) goto L_0x0065
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r7.f40909a     // Catch:{ Exception -> 0x0124 }
            if (r7 == 0) goto L_0x0065
            java.lang.String r7 = r7.description     // Catch:{ Exception -> 0x0124 }
            goto L_0x0066
        L_0x0065:
            r7 = r8
        L_0x0066:
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = ", title: "
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            vk2.b0$a r7 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            if (r7 == 0) goto L_0x0079
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r7.f40909a     // Catch:{ Exception -> 0x0124 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r7 = r7.title     // Catch:{ Exception -> 0x0124 }
            goto L_0x007a
        L_0x0079:
            r7 = r8
        L_0x007a:
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = ", url: "
            r6.append(r7)     // Catch:{ Exception -> 0x0124 }
            r6.append(r12)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)     // Catch:{ Exception -> 0x0124 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0124 }
            r6.<init>()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = "img_url"
            vk2.b0$a r9 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x009d
            java.lang.String r9 = r9.f40910b     // Catch:{ Exception -> 0x0124 }
            if (r9 != 0) goto L_0x009e
        L_0x009d:
            r9 = r10
        L_0x009e:
            r6.put(r7, r9)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = "desc"
            vk2.b0$a r9 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            if (r9 == 0) goto L_0x00ae
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r9.f40909a     // Catch:{ Exception -> 0x0124 }
            if (r9 == 0) goto L_0x00ae
            java.lang.String r9 = r9.description     // Catch:{ Exception -> 0x0124 }
            goto L_0x00af
        L_0x00ae:
            r9 = r8
        L_0x00af:
            if (r9 != 0) goto L_0x00b2
            r9 = r10
        L_0x00b2:
            r6.put(r7, r9)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = "title"
            vk2.b0$a r9 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            if (r9 == 0) goto L_0x00c3
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r9.f40909a     // Catch:{ Exception -> 0x0124 }
            if (r9 == 0) goto L_0x00c3
            java.lang.String r9 = r9.title     // Catch:{ Exception -> 0x0124 }
            goto L_0x00c4
        L_0x00c3:
            r9 = r8
        L_0x00c4:
            if (r9 != 0) goto L_0x00c7
            r9 = r10
        L_0x00c7:
            r6.put(r7, r9)     // Catch:{ Exception -> 0x0124 }
            r6.put(r5, r12)     // Catch:{ Exception -> 0x0124 }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x0124 }
            r12.<init>()     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = "webview_params"
            r12.putExtra(r5, r6)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = "Select_Conv_Type"
            r6 = 3
            r12.putExtra(r5, r6)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = "scene_from"
            r6 = 2
            r12.putExtra(r5, r6)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = "mutil_select_is_ret"
            r12.putExtra(r5, r0)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = "Retr_Msg_Type"
            r12.putExtra(r5, r6)     // Catch:{ Exception -> 0x0124 }
            boolean r5 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity     // Catch:{ Exception -> 0x0124 }
            if (r5 == 0) goto L_0x012d
            vk2.b0$a r5 = vk2.C14883d0.f40914f     // Catch:{ Exception -> 0x0124 }
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = r5.f40910b     // Catch:{ Exception -> 0x0124 }
            if (r5 != 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r10 = r5
        L_0x00fe:
            int r5 = r10.length()     // Catch:{ Exception -> 0x0124 }
            if (r5 != 0) goto L_0x0106
            r5 = 1
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r5 != 0) goto L_0x011c
            java.lang.String r5 = "http"
            boolean r5 = z04.C112551y.m153819s(r10, r5, r2)     // Catch:{ Exception -> 0x0124 }
            if (r5 == 0) goto L_0x011c
            java.lang.Class<gt.i> r5 = p158gt.C8451i.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0124 }
            gt.i r5 = (p158gt.C8451i) r5     // Catch:{ Exception -> 0x0124 }
            r5.mo9375mT(r10, r8)     // Catch:{ Exception -> 0x0124 }
        L_0x011c:
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1     // Catch:{ Exception -> 0x0124 }
            java.lang.String r5 = ".ui.transmit.SelectConversationUI"
            ke3.C88144b.m109803u(r1, r5, r12, r0, r3)     // Catch:{ Exception -> 0x0124 }
            goto L_0x012d
        L_0x0124:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "shareToFriend exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r1, r0)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk2.C14885f0.showShareMenu(java.lang.String):void");
    }

    @JavascriptInterface
    public final void updateShareData(String str) {
        WXMediaMessage wXMediaMessage;
        Log.m105925i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi updateShareData: %s", str);
        C14883d0 d0Var = C14883d0.f40912d;
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ScanBoxShareHelper", "updateShareData params is invalid");
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        int optInt = jSONObject.optInt("action");
        Log.m105925i("MicroMsg.ScanBoxShareHelper", "alvinluo updateShareData action: %d", Integer.valueOf(optInt));
        if (optInt == 1) {
            String optString = jSONObject.optString("url");
            String str2 = "";
            if (optString == null) {
                optString = str2;
            }
            String optString2 = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            String optString3 = jSONObject.optString("desc");
            String optString4 = jSONObject.optString("image_url");
            Log.m105924i("MicroMsg.ScanBoxShareHelper", "shareToFriend, imageUrl: " + optString4 + ", desc: " + optString3 + ", title: " + optString2 + ", url: " + optString);
            String optString5 = jSONObject.optString("url");
            if (optString5 != null) {
                str2 = optString5;
            }
            if (str2.length() == 0) {
                Log.m105920e("MicroMsg.ScanSendAppMsgHelper", "convertToAppMsg fail, url is null");
                wXMediaMessage = null;
            } else {
                Log.m105925i("MicroMsg.ScanSendAppMsgHelper", "convertToAppMsg url: %s", str2);
                wXMediaMessage = new WXMediaMessage();
                WXWebpageObject wXWebpageObject = new WXWebpageObject();
                wXWebpageObject.webpageUrl = str2;
                wXMediaMessage.mediaObject = wXWebpageObject;
                wXMediaMessage.title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                wXMediaMessage.description = jSONObject.optString("desc");
            }
            C14880b0.C14881a aVar = new C14880b0.C14881a(wXMediaMessage, optString4);
            C14880b0 b0Var = C14883d0.f40915g;
            b0Var.getClass();
            b0Var.f40908a.put(optString, aVar);
        }
    }
}
