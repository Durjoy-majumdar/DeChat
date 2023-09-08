package h60;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import d62.C7240a;
import gy3.C87412m;
import ke3.C88144b;
import wd3.C53155r0;
import y50.C66524m;

/* renamed from: h60.e */
public final class C59754e extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ LiveAnchorPluginLayout f170647e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59754e(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        super(1, (C53155r0) null);
        this.f170647e = liveAnchorPluginLayout;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        C87412m.m108594g(view, "widget");
        Intent intent = new Intent();
        String str = C66524m.f191363a;
        intent.putExtra("rawUrl", C66524m.f191364b);
        intent.putExtra("showShare", false);
        C88144b.m109801s(this.f170647e.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
