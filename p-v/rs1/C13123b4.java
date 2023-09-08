package rs1;

import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.b4 */
public final class C13123b4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MegaVideoBulletView f37352d;

    /* renamed from: e */
    public final /* synthetic */ long f37353e;

    /* renamed from: f */
    public final /* synthetic */ FinderThumbPlayerProxy f37354f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13123b4(MegaVideoBulletView megaVideoBulletView, long j, FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f37352d = megaVideoBulletView;
        this.f37353e = j;
        this.f37354f = finderThumbPlayerProxy;
    }

    public Object invoke() {
        this.f37352d.getBulletManager().mo84820g(this.f37353e, this.f37354f.f161745p == 6);
        this.f37352d.setReuse(false);
        return C13598b0.f38549a;
    }
}
