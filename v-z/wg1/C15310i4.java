package wg1;

import android.webkit.ValueCallback;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: wg1.i4 */
public final class C15310i4<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f41620a;

    public C15310i4(C32226l<? super Boolean, C13598b0> lVar) {
        this.f41620a = lVar;
    }

    public void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        C32226l<Boolean, C13598b0> lVar = this.f41620a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(num != null && num.intValue() == 0));
        }
    }
}
