package mo1;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import vp1.C14937o;
import zc1.C66785b;

/* renamed from: mo1.i2 */
public final class C47088i2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTabUIC f126525d;

    /* renamed from: e */
    public final /* synthetic */ int f126526e;

    /* renamed from: f */
    public final /* synthetic */ boolean f126527f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47088i2(FinderProfileTabUIC finderProfileTabUIC, int i, boolean z) {
        super(0);
        this.f126525d = finderProfileTabUIC;
        this.f126526e = i;
        this.f126527f = z;
    }

    public Object invoke() {
        this.f126525d.mo80047V3(108, this.f126526e);
        if (this.f126527f) {
            C14937o.f40972a.mo13980a(17, TextUtils.isEmpty(this.f126525d.f160650G) ? C66785b.f191882e.mo90662O5() : this.f126525d.f160650G, new LinkedList());
        }
        return C13598b0.f38549a;
    }
}
