package he1;

import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import fy3.C32224a;
import gy3.C87413o;
import he1.C59854m;
import rx3.C13598b0;

/* renamed from: he1.r */
public final class C8513r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MegaVideoBulletView f27549d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8513r(MegaVideoBulletView megaVideoBulletView) {
        super(0);
        this.f27549d = megaVideoBulletView;
    }

    public Object invoke() {
        C59854m bulletManager = this.f27549d.getBulletManager();
        C59854m.C32869b bVar = C59854m.f170903r;
        bulletManager.mo84820g(0, false);
        return C13598b0.f38549a;
    }
}
