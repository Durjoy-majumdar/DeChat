package p534gl;

import jp3.C9486a;
import jp3.C9487b;

/* renamed from: gl.a */
public abstract class C32468a implements C9486a {

    /* renamed from: d */
    public final C9487b<C9486a> f86265d;

    /* renamed from: e */
    public boolean f86266e = true;

    public C32468a(C9487b<C9486a> bVar) {
        this.f86265d = bVar;
        if (bVar != null) {
            bVar.keep(this);
        }
    }

    public void dead() {
        this.f86266e = false;
    }
}
