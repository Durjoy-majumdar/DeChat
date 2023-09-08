package ea3;

import android.os.Looper;
import android.webkit.ValueCallback;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: ea3.t */
public final class C45603t<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C45604u f123335a;

    /* renamed from: b */
    public final /* synthetic */ C32224a<C13598b0> f123336b;

    public C45603t(C45604u uVar, C32224a<C13598b0> aVar) {
        this.f123335a = uVar;
        this.f123336b = aVar;
    }

    public void onReceiveValue(Object obj) {
        Looper.myQueue().addIdleHandler(new C45602s((String) obj, this.f123335a, this.f123336b));
    }
}
