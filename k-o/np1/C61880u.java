package np1;

import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPanel;
import gy3.C87412m;

/* renamed from: np1.u */
public final class C61880u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175960d;

    public C61880u(C61817a aVar) {
        this.f175960d = aVar;
    }

    public final void run() {
        FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175960d.f175780p;
        if (finderLiveShoppingPanel != null) {
            finderLiveShoppingPanel.mo78804d();
        } else {
            C87412m.m108603p("contentGroup");
            throw null;
        }
    }
}
