package mo1;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import vp1.C14937o;
import zc1.C66785b;

/* renamed from: mo1.j2 */
public final class C11011j2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f32730d;

    /* renamed from: e */
    public final /* synthetic */ boolean f32731e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11011j2(FinderProfileTabUIC finderProfileTabUIC, boolean z) {
        super(0);
        this.f32730d = finderProfileTabUIC;
        this.f32731e = z;
    }

    public Object invoke() {
        FinderTabUIC.m65392W3(this.f32730d, 111, 0, 2, (Object) null);
        if (this.f32731e) {
            C14937o.f40972a.mo13980a(19, TextUtils.isEmpty(this.f32730d.f160650G) ? C66785b.f191882e.mo90662O5() : this.f32730d.f160650G, new LinkedList());
        }
        return C13598b0.f38549a;
    }
}
