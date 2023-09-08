package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44093w;
import gy3.C87412m;
import nj3.C76879j;
import t83.C48590l;
import te3.C49399fa;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.o */
public final class C44079o implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f119425d;

    /* renamed from: e */
    public final /* synthetic */ C49399fa f119426e;

    /* renamed from: f */
    public final /* synthetic */ int f119427f;

    public C44079o(MMActivity mMActivity, C49399fa faVar, int i) {
        this.f119425d = mMActivity;
        this.f119426e = faVar;
        this.f119427f = i;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C48590l lVar;
        C48590l lVar2;
        if (i2 == -1) {
            MMActivity mMActivity = this.f119425d;
            C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f360099a34));
            MMActivity mMActivity2 = this.f119425d;
            if ((mMActivity2 instanceof WebViewUI) && (lVar2 = ((WebViewUI) mMActivity2).f118508Z) != null) {
                C49399fa faVar = this.f119426e;
                C87412m.m108591d(faVar);
                lVar2.mo73208E(faVar.f133368f, "success");
            }
            C44093w.C44094a aVar = C44093w.f119445k;
            C49399fa faVar2 = this.f119426e;
            C87412m.m108591d(faVar2);
            String str = faVar2.f133368f;
            C87412m.m108593f(str, "videoInfo!!.videoVid");
            C49399fa faVar3 = this.f119426e;
            C87412m.m108591d(faVar3);
            String str2 = faVar3.f133366d;
            C87412m.m108593f(str2, "videoInfo!!.mpUrl");
            aVar.mo68725d(2, 101, str, str2, 0, this.f119427f);
            return;
        }
        MMActivity mMActivity3 = this.f119425d;
        C76879j.m92726T(mMActivity3, mMActivity3.getString(C0966R.string.j6h));
        MMActivity mMActivity4 = this.f119425d;
        if ((mMActivity4 instanceof WebViewUI) && (lVar = ((WebViewUI) mMActivity4).f118508Z) != null) {
            C49399fa faVar4 = this.f119426e;
            C87412m.m108591d(faVar4);
            lVar.mo73208E(faVar4.f133368f, "canceled");
        }
    }
}
