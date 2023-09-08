package ne1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51954xc1;

/* renamed from: ne1.r0 */
public final class C11154r0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C51954xc1 f32933d;

    /* renamed from: e */
    public final /* synthetic */ FinderItem f32934e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11154r0(C51954xc1 xc12, FinderItem finderItem) {
        super(0);
        this.f32933d = xc12;
        this.f32934e = finderItem;
    }

    public Object invoke() {
        if (this.f32933d.f144588f == 1) {
            this.f32934e.getFeedObject().permissionFlag |= 2048;
        } else {
            this.f32934e.getFeedObject().permissionFlag &= -2049;
        }
        return C13598b0.f38549a;
    }
}
