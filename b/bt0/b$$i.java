package bt0;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import java.lang.ref.WeakReference;

public class b$$i implements IMvvmObserver<Boolean> {

    /* renamed from: d */
    public final WeakReference<C79808b> f233914d;

    public b$$i(C79808b bVar) {
        this.f233914d = new WeakReference<>(bVar);
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        C79808b bVar = this.f233914d.get();
        if (bVar != null) {
            bVar.mo109943l(bool.booleanValue(), bVar.getMainTitle());
        }
    }
}
