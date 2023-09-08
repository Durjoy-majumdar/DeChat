package o40;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.LiveData;

/* renamed from: o40.d */
public final class C61935d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveData<Object> f176057d;

    /* renamed from: e */
    public final /* synthetic */ C0120a0<Object> f176058e;

    public C61935d(LiveData<Object> liveData, C0120a0<Object> a0Var) {
        this.f176057d = liveData;
        this.f176058e = a0Var;
    }

    public final void run() {
        Object value = this.f176057d.getValue();
        if (value != null) {
            this.f176058e.onChanged(value);
        }
    }
}
