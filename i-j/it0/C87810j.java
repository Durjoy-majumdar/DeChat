package it0;

import android.animation.ValueAnimator;
import fy3.C32226l;
import gy3.C87413o;
import jt0.C88029d;

/* renamed from: it0.j */
public final class C87810j extends C87413o implements C32226l<Boolean, ValueAnimator> {

    /* renamed from: d */
    public final /* synthetic */ C87805i f254213d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87810j(C87805i iVar) {
        super(1);
        this.f254213d = iVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return this.f254213d.f254180a.f238298z1.mo117795r(100);
        }
        if (this.f254213d.f254180a.f238298z1.mo117793p()) {
            return null;
        }
        C88029d dVar = this.f254213d.f254180a.f238298z1.f247572e;
        return dVar.mo122474e(dVar.mo122472c(), 255, 100);
    }
}
