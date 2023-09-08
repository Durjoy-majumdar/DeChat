package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import de3.C45331f0;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import kr0.C76630x0;
import or0.C47398l;
import or0.C47399m;
import rx3.C13598b0;
import sm0.C90241f;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.y */
public final class C40560y extends AbsWxaShortLinkLauncher {

    /* renamed from: b */
    public final /* synthetic */ WxaShortLinkInfo f108951b;

    /* renamed from: c */
    public final /* synthetic */ AppBrandCheckWxaShortLinkUI f108952c;

    /* renamed from: d */
    public final /* synthetic */ String f108953d;

    /* renamed from: e */
    public final /* synthetic */ int f108954e;

    public C40560y(WxaShortLinkInfo wxaShortLinkInfo, String str, AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI, String str2, int i, C45331f0.C45333b bVar) {
        this.f108951b = wxaShortLinkInfo;
        this.f108952c = appBrandCheckWxaShortLinkUI;
        this.f108953d = str2;
        this.f108954e = i;
        if (wxaShortLinkInfo != null) {
            C47399m.f127176a.mo72420a(str, wxaShortLinkInfo);
        }
    }

    /* renamed from: a */
    public C47398l mo63355a() {
        return C47399m.f127176a;
    }

    /* renamed from: b */
    public void mo63356b(Context context, AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams wxaShortLinkLaunchParams, C32226l<? super Boolean, C13598b0> lVar) {
        int i;
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(wxaShortLinkLaunchParams, "params");
        C87412m.m108594g(lVar, "launchResultCallback");
        String stringExtra = this.f108952c.getIntent().getStringExtra("prescene_for_report");
        String stringExtra2 = this.f108952c.getIntent().getStringExtra(StateEvent.Name.MESSAGE);
        String stringExtra3 = this.f108952c.getIntent().getStringExtra("presceneNote_for_report");
        try {
            i = Integer.parseInt(stringExtra);
        } catch (Exception unused) {
            i = 0;
        }
        C86299o oVar = new C86299o();
        String str = this.f108953d;
        int i2 = this.f108954e;
        oVar.f250930b = wxaShortLinkLaunchParams.f108856d;
        oVar.f250929a = wxaShortLinkLaunchParams.f108861i;
        oVar.f250934f = wxaShortLinkLaunchParams.f108857e;
        oVar.f250932d = wxaShortLinkLaunchParams.f108858f;
        oVar.f250931c = wxaShortLinkLaunchParams.f108859g;
        oVar.f250920I = wxaShortLinkLaunchParams.f108860h;
        oVar.f250939k = C90241f.CTRL_INDEX;
        oVar.f250941m = i;
        oVar.f250940l = stringExtra2 + XVFSFile.PATH_SEPARATOR_CHAR + str;
        oVar.f250942n = stringExtra3;
        oVar.f250921J = i2;
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f108952c;
        Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "launchWxa  appId=" + oVar.f250930b + " \nenterPath=" + oVar.f250934f + " \nversion=" + oVar.f250932d + " \nversionType=" + oVar.f250931c + " \nshortLink=" + oVar.f250920I + " \nscene=" + oVar.f250939k + " \nsceneNote=" + oVar.f250940l + " \npresceneNote=" + oVar.f250942n + " \nprescene=" + i + 10);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        lVar.invoke(Boolean.TRUE);
        int i3 = AppBrandCheckWxaShortLinkUI.f108873g;
        appBrandCheckWxaShortLinkUI.getClass();
        String str2 = wxaShortLinkLaunchParams.f108861i;
        if (!(str2.length() > 0)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = wxaShortLinkLaunchParams.f108856d;
        }
        String stringExtra4 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        C45331f0.C45333b valueOf = C45331f0.C45333b.valueOf(stringExtra4);
        String stringExtra5 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("talkerUsername");
        String stringExtra6 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("senderUsername");
        if (valueOf == C45331f0.C45333b.TIME_LINE) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(str2, new WCPaySessionInfoRecorder.JsApiPayInfo(stringExtra6, (String) null));
        } else if (valueOf == C45331f0.C45333b.SINGLE_CHATTING || valueOf == C45331f0.C45333b.GROUP_CHATTING) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(str2, new WCPaySessionInfoRecorder.JsApiPayInfo(stringExtra5, stringExtra6, 0, (String) null));
        }
    }

    /* renamed from: c */
    public void mo63357c(Activity activity, String str, boolean z) {
        C87412m.m108594g(activity, "ctx");
        C87412m.m108594g(str, "url");
        super.mo63357c(activity, str, z);
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f108952c;
        WxaShortLinkInfo wxaShortLinkInfo = this.f108951b;
        C87412m.m108591d(wxaShortLinkInfo);
        appBrandCheckWxaShortLinkUI.mo63377H7(1, wxaShortLinkInfo);
    }

    /* renamed from: d */
    public boolean mo63358d(Activity activity, boolean z) {
        C87412m.m108594g(activity, "ctx");
        return true;
    }

    /* renamed from: e */
    public void mo63359e(Activity activity, String str) {
        C87412m.m108594g(activity, "ctx");
        C87412m.m108594g(str, "url");
        super.mo63359e(activity, str);
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f108952c;
        WxaShortLinkInfo wxaShortLinkInfo = this.f108951b;
        C87412m.m108591d(wxaShortLinkInfo);
        appBrandCheckWxaShortLinkUI.mo63377H7(2, wxaShortLinkInfo);
    }
}
