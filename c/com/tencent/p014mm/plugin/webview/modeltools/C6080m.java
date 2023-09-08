package com.tencent.p014mm.plugin.webview.modeltools;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.plugin.webview.emojistore.EmojiStoreWebViewLogic;
import com.tencent.p014mm.plugin.webview.model.C30597q;
import com.tencent.p014mm.plugin.webview.model.C6048m1;
import com.tencent.p014mm.plugin.webview.model.C6053p1;
import com.tencent.p014mm.plugin.webview.model.C96649l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import k83.C9571f;
import org.json.JSONException;
import org.json.JSONObject;
import q62.C101048b;
import u73.C101980n;
import u73.C14130k;
import u73.C14132m;
import z83.C16123a;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.webview.modeltools.m */
public class C6080m extends C86301e {

    /* renamed from: d */
    public C96649l1 f22405d;

    /* renamed from: e */
    public C6048m1 f22406e;

    /* renamed from: f */
    public C6079b0 f22407f;

    /* renamed from: g */
    public C30597q f22408g;

    /* renamed from: h */
    public C6053p1 f22409h;

    /* renamed from: i */
    public C9571f f22410i;

    /* renamed from: j */
    public EmojiStoreWebViewLogic f22411j;

    /* renamed from: n */
    public boolean f22412n = true;

    public static C6048m1 Ax0() {
        if (wx0().f22406e == null) {
            wx0().f22406e = C6048m1.f22342b;
        }
        return wx0().f22406e;
    }

    public static C6053p1 Bx0() {
        if (wx0().f22409h == null) {
            C6080m wx02 = wx0();
            C86709a0.m107528h();
            wx02.f22409h = new C6053p1(C86709a0.m107535s().f251811i);
        }
        return wx0().f22409h;
    }

    public static C96649l1 Cx0() {
        if (wx0().f22405d == null) {
            wx0().f22405d = new C96649l1();
        }
        return wx0().f22405d;
    }

    public static C6079b0 Dx0() {
        if (wx0().f22407f == null) {
            C6080m wx02 = wx0();
            C86709a0.m107528h();
            wx02.f22407f = new C6079b0(C86709a0.m107535s().f251811i, C6081p.f22413p, "WebViewHostsFilter", (String[]) null);
        }
        return wx0().f22407f;
    }

    /* renamed from: g9 */
    public static C14132m m5948g9() {
        return ((C101980n) C86312j.m106911c(C101980n.class)).mo134688g9();
    }

    /* renamed from: lS */
    public static C14130k m5949lS() {
        return ((C101980n) C86312j.m106911c(C101980n.class)).mo134690lS();
    }

    public static void vx0(String str) {
        Class cls = C101048b.class;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DownloadInfo.NETTYPE, str);
            Context context = MMApplicationContext.getContext();
            if (NetStatusUtil.is2G(context)) {
                Log.m105924i("MicroMsg.SubCoreTools", "onNetWorkChange 2g");
                jSONObject.put("networkType", "2g");
            }
            if (NetStatusUtil.is3G(context)) {
                Log.m105924i("MicroMsg.SubCoreTools", "onNetWorkChange 3g");
                jSONObject.put("networkType", "3g");
            }
            if (NetStatusUtil.is4G(context)) {
                Log.m105924i("MicroMsg.SubCoreTools", "onNetWorkChange 4g");
                jSONObject.put("networkType", "4g");
            }
            if (NetStatusUtil.is5G(context)) {
                Log.m105924i("MicroMsg.SubCoreTools", "onNetWorkChange 5g");
                jSONObject.put("networkType", "5g");
            }
            if (NetStatusUtil.isWifi(context)) {
                Log.m105924i("MicroMsg.SubCoreTools", "onNetWorkChange wifi");
                jSONObject.put("networkType", "wifi");
            }
            int i = 0;
            int Os = C86312j.m106911c(cls) != null ? ((C101048b) C86312j.m106911c(cls)).mo60590Os(16) : 0;
            if (Os != 0) {
                i = Os == 1 ? 1 : 2;
            }
            jSONObject.put("simType", i);
            Bundle bundle = new Bundle();
            bundle.putString("name", "onNetWorkChange");
            bundle.putString("data", jSONObject.toString());
            ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C16123a.class, (C1256g) null);
        } catch (JSONException unused) {
        }
    }

    public static C6080m wx0() {
        return (C6080m) C86312j.m106911c(C6080m.class);
    }

    public static EmojiStoreWebViewLogic xx0() {
        if (wx0().f22411j == null) {
            wx0().f22411j = new EmojiStoreWebViewLogic();
        }
        return wx0().f22411j;
    }

    public static C30597q yx0() {
        if (wx0().f22408g == null) {
            C6080m wx02 = wx0();
            C86709a0.m107528h();
            wx02.f22408g = new C30597q(C86709a0.m107535s().f251811i);
        }
        return wx0().f22408g;
    }

    public static C9571f zx0() {
        if (wx0().f22410i == null) {
            C6080m wx02 = wx0();
            C86709a0.m107528h();
            wx02.f22410i = new C9571f(C86709a0.m107535s().f251811i);
        }
        return wx0().f22410i;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105925i("MicroMsg.SubCoreTools", "onAccountRelease hc:%d", Integer.valueOf(hashCode()));
        C30597q qVar = this.f22408g;
        if (qVar != null) {
            qVar.f82406e.appendAll(true);
        }
    }
}
