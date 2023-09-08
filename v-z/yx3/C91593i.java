package yx3;

import gy3.C24560g0;
import gy3.C24562j;
import gy3.C87412m;
import wx3.C15601d;

/* renamed from: yx3.i */
public abstract class C91593i extends C66706h implements C24562j<Object> {

    /* renamed from: d */
    public final int f262438d;

    public C91593i(int i, C15601d<Object> dVar) {
        super(dVar);
        this.f262438d = i;
    }

    public int getArity() {
        return this.f262438d;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = C24560g0.f70158a.mo51274h(this);
        C87412m.m108593f(h, "renderLambdaToString(this)");
        return h;
    }
}
