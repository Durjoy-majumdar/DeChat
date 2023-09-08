package ve1;

import com.tencent.p014mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView;
import jq3.C60905o;

/* renamed from: ve1.k2 */
public final class C14556k2 implements FinderHomeTabRedDotTipsBubbleView.C3958b {

    /* renamed from: a */
    public final /* synthetic */ FinderHomeTabRedDotTipsBubbleView f40334a;

    /* renamed from: b */
    public final /* synthetic */ C14576n2 f40335b;

    /* renamed from: c */
    public final /* synthetic */ C60905o f40336c;

    /* renamed from: ve1.k2$a */
    public static final class C14557a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f40337d;

        /* renamed from: e */
        public final /* synthetic */ C14576n2 f40338e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f40339f;

        public C14557a(boolean z, C14576n2 n2Var, C60905o oVar) {
            this.f40337d = z;
            this.f40338e = n2Var;
            this.f40339f = oVar;
        }

        public final void run() {
            if (this.f40337d) {
                this.f40338e.mo13819l(this.f40339f, false, true);
            } else {
                this.f40338e.mo13819l(this.f40339f, true, true);
            }
        }
    }

    public C14556k2(FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView, C14576n2 n2Var, C60905o oVar) {
        this.f40334a = finderHomeTabRedDotTipsBubbleView;
        this.f40335b = n2Var;
        this.f40336c = oVar;
    }

    /* renamed from: a */
    public void mo4572a(boolean z) {
        this.f40334a.post(new C14557a(z, this.f40335b, this.f40336c));
    }

    /* renamed from: b */
    public void mo4573b() {
        this.f40335b.getClass();
    }
}
