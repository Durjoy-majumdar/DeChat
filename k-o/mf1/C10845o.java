package mf1;

import android.graphics.drawable.Drawable;
import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: mf1.o */
public final class C10845o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f32385d;

    /* renamed from: e */
    public final /* synthetic */ View f32386e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10845o(boolean z, View view) {
        super(0);
        this.f32385d = z;
        this.f32386e = view;
    }

    public Object invoke() {
        if (this.f32385d) {
            this.f32386e.setBackground((Drawable) null);
        }
        return C13598b0.f38549a;
    }
}
