package rs1;

import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.i4 */
public final class C13271i4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MegaVideoBulletView f37660d;

    /* renamed from: e */
    public final /* synthetic */ long f37661e;

    /* renamed from: f */
    public final /* synthetic */ boolean f37662f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13271i4(MegaVideoBulletView megaVideoBulletView, long j, boolean z) {
        super(0);
        this.f37660d = megaVideoBulletView;
        this.f37661e = j;
        this.f37662f = z;
    }

    public Object invoke() {
        this.f37660d.getBulletManager().mo84820g(this.f37661e, this.f37662f);
        this.f37660d.setReuse(false);
        return C13598b0.f38549a;
    }
}
