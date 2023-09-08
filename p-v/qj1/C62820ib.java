package qj1;

import androidx.lifecycle.C0120a0;

/* renamed from: qj1.ib */
public final class C62820ib<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62772fb f178303d;

    public C62820ib(C62772fb fbVar) {
        this.f178303d = fbVar;
    }

    public void onChanged(Object obj) {
        Float f = (Float) obj;
        if (f != null) {
            C62772fb fbVar = this.f178303d;
            f.floatValue();
            fbVar.f178183q.setAlpha(f.floatValue());
        }
    }
}
