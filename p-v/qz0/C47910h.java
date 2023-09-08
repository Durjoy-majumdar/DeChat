package qz0;

import cc0.C92411b;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p702ts.C78085c;

/* renamed from: qz0.h */
public class C47910h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShareCardListUI f128541d;

    public C47910h(ShareCardListUI shareCardListUI) {
        this.f128541d = shareCardListUI;
    }

    public void run() {
        Class cls = C78085c.class;
        ShareCardListUI shareCardListUI = this.f128541d;
        int i = ShareCardListUI.f109725T;
        shareCardListUI.getClass();
        shareCardListUI.f109709q = ((C78085c) C86312j.m106911c(cls)).mo108056ms();
        ShareCardListUI shareCardListUI2 = this.f128541d;
        if (shareCardListUI2.f109709q == null) {
            shareCardListUI2.f109709q = ((C78085c) C86312j.m106911c(cls)).mo108056ms();
        }
        C92411b bVar = shareCardListUI2.f109709q;
        if (bVar != null) {
            bVar.mo126407a(shareCardListUI2.f109713u, true);
            C5139t.m5183e(22, 10);
        }
        this.f128541d.f109740P = true;
        Log.m105918d("MicroMsg.ShareCardListUI", "initLocation end");
    }
}
