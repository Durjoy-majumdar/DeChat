package w42;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import e42.C31415g;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import ke3.C88144b;
import zd2.C91667a;

/* renamed from: w42.d */
public final class C15042d<T extends C7594e> extends C86430i<T> {
    /* renamed from: e */
    public String mo16e() {
        return "openUrlWithExtraWebview";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("url");
        if (Util.isNullOrNil(optString)) {
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25865d));
            return;
        }
        Log.m105924i("MicroMsg.MBJsApiOpenUrlWithExtraWebview", "url:" + optString);
        Intent putExtra = new Intent().putExtra("rawUrl", optString);
        C87412m.m108593f(putExtra, "Intent().putExtra(Consta…I.WebViewUI.KRawUrl, url)");
        int optInt = hVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        putExtra.putExtra("geta8key_scene", optInt);
        String optString2 = hVar.optString("adUxInfo", "");
        C91667a.m115207c("MagicBrush", "openUrlWithExtraWebView", optString2, "param");
        String optString3 = hVar.optString("adIsNeedReport");
        if (C87412m.m108589b(Util.nullAsNil(optString3), "1")) {
            Bundle bundle = new Bundle();
            bundle.putString("ad_report_ux_info", optString2);
            bundle.putInt("ad_report_scene", optInt);
            bundle.putBoolean("ad_need_report", true);
            putExtra.putExtra("ad_report_bundle", bundle);
            Log.m105924i("MicroMsg.MBJsApiOpenUrlWithExtraWebview", "adIsNeedReport=" + optString3 + ", adScene=" + optInt + " , adUxInfo:" + optString2);
        }
        putExtra.putExtra(C74928u.C45093i.f122325q, optString2);
        T t = this.f251227a;
        C88144b.m109791i(t != null ? t.mo8720e0() : null, "webview", ".ui.tools.WebViewUI", putExtra, (Bundle) null);
        mo120840p().invoke(mo120844i());
    }
}
