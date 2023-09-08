package p583k2;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p658q1.C110298h0;

/* renamed from: k2.e */
public final class C108857e extends C87413o implements C32224a<SparseArray<Parcelable>> {

    /* renamed from: d */
    public final /* synthetic */ C110298h0<C108858f<View>> f325989d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108857e(C110298h0<C108858f<View>> h0Var) {
        super(0);
        this.f325989d = h0Var;
    }

    public Object invoke() {
        SparseArray sparseArray = new SparseArray();
        T t = this.f325989d.f329878a;
        C87412m.m108591d(t);
        View typedView$ui_release = ((C108858f) t).getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
