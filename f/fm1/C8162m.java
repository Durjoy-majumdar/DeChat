package fm1;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import fm1.C8139f;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fm1.m */
public final class C8162m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f27037d;

    /* renamed from: e */
    public final /* synthetic */ C8139f f27038e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8162m(String str, C8139f fVar) {
        super(0);
        this.f27037d = str;
        this.f27038e = fVar;
    }

    public Object invoke() {
        C8139f.C8140a aVar;
        TabLayout.C55061f k;
        if (!TextUtils.isEmpty(this.f27037d)) {
            TabLayout f3 = this.f27038e.mo9206f3();
            TextView textView = null;
            if (f3 == null || (k = f3.mo146907k(1)) == null) {
                aVar = null;
            } else {
                Object obj = k.f154600a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                aVar = (C8139f.C8140a) obj;
            }
            if (aVar != null) {
                textView = aVar.f27011c;
            }
            if (textView != null) {
                textView.setText(this.f27037d);
            }
        }
        return C13598b0.f38549a;
    }
}
