package ma2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import java.net.URLDecoder;
import ke3.C88144b;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;
import p640ox.C77049b;
import p763ym.C79138l;
import qc0.C101106m;
import te3.C64488kb1;
import te3.C64793w23;

/* renamed from: ma2.k0 */
public final class C99811k0 {

    /* renamed from: a */
    public static final C99811k0 f292499a = new C99811k0();

    /* renamed from: a */
    public final void mo139167a(Context context, C101106m mVar, C64488kb1 kb12, C44580q1 q1Var) {
        String str;
        String str2;
        Class cls = C79138l.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(mVar, "wrapper");
        C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(mVar.f295972t);
        if (TextUtils.isEmpty(mVar.f295972t) || appInfo == null || TextUtils.isEmpty(appInfo.field_packageName)) {
            Log.m105920e("MusicUIUtil", "doJumpToAppSongPage do nothing");
            return;
        }
        Log.m105925i("MusicUIUtil", "doJumpToAppSongPage launch third party app, package name:%s", appInfo.field_packageName);
        WXMusicVideoObject wXMusicVideoObject = new WXMusicVideoObject();
        wXMusicVideoObject.musicUrl = mVar.f295968p;
        wXMusicVideoObject.musicDataUrl = mVar.f295966n;
        String str3 = "";
        if (kb12 == null || (str = kb12.f183917t) == null) {
            str = str3;
        }
        wXMusicVideoObject.identification = URLDecoder.decode(str);
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXMusicVideoObject);
        wXMediaMessage.sdkVer = Build.SDK_INT;
        if (!(kb12 == null || (str2 = kb12.f183916s) == null)) {
            str3 = str2;
        }
        wXMediaMessage.messageExt = URLDecoder.decode(str3);
        C8479f0 f0Var = new C8479f0();
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        if (w232 != null) {
            T bundle = new Bundle();
            bundle.putString("current_page_biz_info", w232.f186034e);
            bundle.putString("current_page_source_info", "music_operation_webview");
            f0Var.f27484d = bundle;
        }
        ((C79138l) C86312j.m106911c(cls)).mo74010gu(context, mVar.f295972t, wXMediaMessage, 0, q1Var, (Bundle) f0Var.f27484d);
    }

    /* renamed from: b */
    public final void mo139168b(Context context, C101106m mVar) {
        String str = mVar.f295968p;
        if (str == null) {
            str = mVar.f295966n;
        }
        String str2 = mVar.f295972t;
        C87412m.m108593f(str, "url");
        mo139170d(context, str2, str);
    }

    /* renamed from: c */
    public final void mo139169c(Context context, C101106m mVar, C64488kb1 kb12) {
        String str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(mVar, "wrapper");
        String str2 = null;
        if (!Util.isNullOrNil(kb12 != null ? kb12.f183920w : null)) {
            Log.m105924i("MusicUIUtil", "use androdiDownloadUrl");
            String str3 = mVar.f295972t;
            if (kb12 != null) {
                str2 = kb12.f183920w;
            }
            C87412m.m108591d(str2);
            mo139170d(context, str3, str2);
            return;
        }
        String str4 = "";
        if (!TextUtils.isEmpty(mVar.f295972t)) {
            if (C87412m.m108589b("wx5aa333606550dfd5", mVar.f295972t)) {
                str = "https://y.qq.com/m/download/index.html?channelId=2005000732";
            } else if (C87412m.m108589b("wx8dd6ecd81906fd84", mVar.f295972t)) {
                str = "https://a.app.qq.com/o/simple.jsp?pkgname=com.netease.cloudmusic";
            } else if (C87412m.m108589b("wx79f2c4418704b4f8", mVar.f295972t)) {
                str = "https://a.app.qq.com/o/simple.jsp?pkgname=com.kugou.android";
            } else if (C87412m.m108589b("wxc305711a2a7ad71c", mVar.f295972t)) {
                str = "https://a.app.qq.com/o/simple.jsp?pkgname=cn.kuwo.player";
            }
            str4 = str;
        }
        if (!Util.isNullOrNil(str4)) {
            mo139170d(context, mVar.f295972t, str4);
        } else {
            mo139168b(context, mVar);
        }
    }

    /* renamed from: d */
    public final void mo139170d(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str2, "url");
        Log.m105925i("MusicUIUtil", "launch H5 appId: %s, url:%s", str, str2);
        if (C87412m.m108589b(str, "wx5aa333606550dfd5")) {
            C10770c cVar = new C10770c(context);
            cVar.f32244b = "mmdownloadapp_G5AaIuNdPtZyH1oCL8";
            ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str2);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
