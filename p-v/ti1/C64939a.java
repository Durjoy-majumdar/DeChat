package ti1;

import android.content.Context;
import android.view.ViewGroup;
import dl1.C58321a;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: ti1.a */
public final class C64939a extends C64941c {

    /* renamed from: q */
    public final int f186989q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64939a(int i, Context context, int i2, String str) {
        super(context, i2, str, 2);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "coverUrl");
        this.f186989q = i;
    }

    /* renamed from: d */
    public void mo89091d() {
        super.mo89091d();
        C58321a aVar = this.f187002p;
        C58321a aVar2 = C58321a.NORMAL_FOCUS;
        boolean z = true;
        int i = 0;
        if (!(aVar != aVar2) && this.f186989q == 0) {
            ViewGroup.LayoutParams layoutParams = getViewBinding().f175455d.getLayoutParams();
            layoutParams.width = this.f187002p == aVar2 ? C76577a.m92151b(getContext(), 80) : 0;
            if (this.f187002p != aVar2) {
                z = false;
            }
            if (z) {
                i = C76577a.m92151b(getContext(), 80);
            }
            layoutParams.height = i;
        }
    }

    public final int getFinderScene() {
        return this.f186989q;
    }
}
