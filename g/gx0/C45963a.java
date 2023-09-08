package gx0;

import com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchResultItemContainer;

/* renamed from: gx0.a */
public class C45963a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizSearchResultItemContainer f123974d;

    public C45963a(BizSearchResultItemContainer bizSearchResultItemContainer) {
        this.f123974d = bizSearchResultItemContainer;
    }

    public void run() {
        BizSearchResultItemContainer bizSearchResultItemContainer = this.f123974d;
        bizSearchResultItemContainer.f109053f.setVisibility(bizSearchResultItemContainer.f109052e.isEmpty() ? 0 : 8);
    }
}
