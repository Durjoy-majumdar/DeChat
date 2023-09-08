package er1;

import android.app.Activity;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: er1.s2 */
public final class C7867s2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f26471d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7867s2(Activity activity) {
        super(0);
        this.f26471d = activity;
    }

    public Object invoke() {
        if (!this.f26471d.isFinishing() && !this.f26471d.isDestroyed()) {
            this.f26471d.finish();
        }
        return C13598b0.f38549a;
    }
}
