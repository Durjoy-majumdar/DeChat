package ca3;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.model.C43720k;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C45518r0;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: ca3.h */
public final class C39936h implements C43720k {

    /* renamed from: a */
    public final /* synthetic */ WebViewVideoEventHandler f107073a;

    public C39936h(WebViewVideoEventHandler webViewVideoEventHandler) {
        this.f107073a = webViewVideoEventHandler;
    }

    /* renamed from: a */
    public void mo62556a(Bundle bundle) {
        C87412m.m108594g(bundle, "data");
        JSONObject c = this.f107073a.mo68859c();
        if (((C45518r0) C86312j.m106911c(C45518r0.class)).gi0() != null) {
            c.put("localFeedId", bundle.getString("localFeedId", ""));
            c.put("isFav", bundle.getBoolean("isFav"));
            c.put("isLike", bundle.getBoolean("isLike"));
            c.put("favCount", bundle.getInt("favCount"));
            c.put("likeCount", bundle.getInt("likeCount"));
        }
        this.f107073a.mo68857a("onFinderFeedInfoUpdated", c);
        String str = this.f107073a.f119752a;
        Log.m105924i(str, "onFinderFeedInfoUpdated data: " + c);
    }
}
