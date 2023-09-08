package ve1;

import cm1.C0755n0;
import com.tencent.p014mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView;

/* renamed from: ve1.l2 */
public final class C14560l2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C0755n0 f40344d;

    /* renamed from: e */
    public final /* synthetic */ C14576n2 f40345e;

    public C14560l2(C0755n0 n0Var, C14576n2 n2Var) {
        this.f40344d = n0Var;
        this.f40345e = n2Var;
    }

    public final void run() {
        this.f40344d.f1779g.f1759a = -1;
        FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f40345e.f40387p;
        if (finderHomeTabRedDotTipsBubbleView != null) {
            boolean z = FinderHomeTabRedDotTipsBubbleView.f17793h;
            finderHomeTabRedDotTipsBubbleView.mo4563a(true);
        }
    }
}
