package qj1;

import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView;

/* renamed from: qj1.j7 */
public final class C12472j7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12282d7 f35879d;

    public C12472j7(C12282d7 d7Var) {
        this.f35879d = d7Var;
    }

    public final void run() {
        FinderLiveGiftTagView finderLiveGiftTagView = this.f35879d.f35420u;
        finderLiveGiftTagView.mo3237b(finderLiveGiftTagView.getRv().getChildCount() - 1);
        this.f35879d.f35420u.getRv().getChildAt(this.f35879d.f35420u.getRv().getChildCount() - 1).performClick();
    }
}
