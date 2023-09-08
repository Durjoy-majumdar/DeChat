package he1;

import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: he1.s */
public final class C8514s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MegaVideoBulletView f27550d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8514s(MegaVideoBulletView megaVideoBulletView) {
        super(0);
        this.f27550d = megaVideoBulletView;
    }

    public Object invoke() {
        if (this.f27550d.getFeed().mo76077q0(this.f27550d.getBulletManager().f170913p)) {
            this.f27550d.getBulletManager().mo84822i();
            C61926c.m72666K(200, new C8513r(this.f27550d));
        }
        return C13598b0.f38549a;
    }
}
