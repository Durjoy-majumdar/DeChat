package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44093w;
import gy3.C87412m;
import nj3.C76879j;
import s90.C48300n;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.r */
public final class C44083r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f119430d;

    /* renamed from: e */
    public final /* synthetic */ C44085t f119431e;

    public C44083r(Activity activity, C44085t tVar) {
        this.f119430d = activity;
        this.f119431e = tVar;
    }

    public final void run() {
        C48590l lVar;
        Activity activity = this.f119430d;
        C76879j.m92726T(activity, activity.getString(C0966R.string.ar5));
        Activity activity2 = this.f119430d;
        if ((activity2 instanceof WebViewUI) && (lVar = ((WebViewUI) activity2).f118508Z) != null) {
            C48300n nVar = this.f119431e.f119434a;
            C87412m.m108591d(nVar);
            lVar.mo73208E(nVar.f133368f, "success");
        }
        C44093w.C44094a aVar = C44093w.f119445k;
        C48300n nVar2 = this.f119431e.f119434a;
        C87412m.m108591d(nVar2);
        String str = nVar2.f133368f;
        C87412m.m108593f(str, "mpShareVideoInfo!!.videoVid");
        C48300n nVar3 = this.f119431e.f119434a;
        C87412m.m108591d(nVar3);
        String str2 = nVar3.f133366d;
        C87412m.m108593f(str2, "mpShareVideoInfo!!.mpUrl");
        C48300n nVar4 = this.f119431e.f119434a;
        C87412m.m108591d(nVar4);
        aVar.mo68725d(1, 101, str, str2, 0, nVar4.f129348y);
    }
}
