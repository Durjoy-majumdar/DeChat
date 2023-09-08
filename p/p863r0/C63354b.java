package p863r0;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.LiveData;
import p175j0.C60647d0;

/* renamed from: r0.b */
public final class C63354b implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ LiveData f179722a;

    /* renamed from: b */
    public final /* synthetic */ C0120a0 f179723b;

    public C63354b(LiveData liveData, C0120a0 a0Var) {
        this.f179722a = liveData;
        this.f179723b = a0Var;
    }

    public void dispose() {
        this.f179722a.removeObserver(this.f179723b);
    }
}
