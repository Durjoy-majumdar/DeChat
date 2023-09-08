package o40;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.LiveData;

/* renamed from: o40.e */
public final class C61936e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveData<Object> f176059d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f176060e;

    /* renamed from: f */
    public final /* synthetic */ C0120a0<Object> f176061f;

    public C61936e(LiveData<Object> liveData, C0125s sVar, C0120a0<Object> a0Var) {
        this.f176059d = liveData;
        this.f176060e = sVar;
        this.f176061f = a0Var;
    }

    public final void run() {
        Object value = this.f176059d.getValue();
        if (value != null) {
            C0125s sVar = this.f176060e;
            C0120a0<Object> a0Var = this.f176061f;
            if (sVar.getLifecycle().getCurrentState().mo62187a(C39623j.C39626c.STARTED)) {
                a0Var.onChanged(value);
            }
        }
    }
}
