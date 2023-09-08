package di1;

import androidx.lifecycle.C0120a0;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: di1.a */
public final class C7332a<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f25447d;

    public C7332a(C32224a<C13598b0> aVar) {
        this.f25447d = aVar;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25447d.invoke();
    }
}
