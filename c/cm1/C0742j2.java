package cm1;

import a14.C0000n0;
import a14.C53930o0;
import bl3.C0317e;
import ht1.C8794p5;
import te3.C64553md1;

/* renamed from: cm1.j2 */
public final class C0742j2 extends C0317e {

    /* renamed from: d */
    public C8794p5<C64553md1> f1763d;

    /* renamed from: cm1.j2$a */
    public interface C0743a {
        /* renamed from: a */
        void mo704a(String str, int i, int i2, String str2);
    }

    public void onCleared() {
        super.onCleared();
        C0000n0 lifecycleScope = getLifecycleScope();
        C53930o0.m60557d(lifecycleScope, this + " onCleared.", (Throwable) null, 2, (Object) null);
        C0000n0 mainScope = getMainScope();
        C53930o0.m60557d(mainScope, this + " onCleared.", (Throwable) null, 2, (Object) null);
        this.f1763d = null;
    }
}
