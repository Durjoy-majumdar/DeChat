package a14;

import f14.C58907y;
import wx3.C15601d;

/* renamed from: a14.a3 */
public final class C53855a3<U, T extends U> extends C58907y<T> implements Runnable {

    /* renamed from: g */
    public final long f151097g;

    public C53855a3(long j, C15601d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f151097g = j;
    }

    /* renamed from: l0 */
    public String mo74468l0() {
        return super.mo74468l0() + "(timeMillis=" + this.f151097g + ')';
    }

    public void run() {
        long j = this.f151097g;
        mo74513C(new C53975z2("Timed out waiting for " + j + " ms", this));
    }
}
