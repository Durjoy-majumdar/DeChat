package hl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vi1.C65750a;
import vk1.C65762c;

/* renamed from: hl1.u1 */
public final class C60036u1 extends C87413o implements C32224a<C65750a> {

    /* renamed from: d */
    public final /* synthetic */ ViewStub f171345d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171346e;

    /* renamed from: f */
    public final /* synthetic */ C59988k f171347f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60036u1(ViewStub viewStub, C65762c cVar, C59988k kVar) {
        super(0);
        this.f171345d = viewStub;
        this.f171346e = cVar;
        this.f171347f = kVar;
    }

    public Object invoke() {
        View inflate = this.f171345d.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        C65762c cVar = this.f171346e;
        ConstraintLayout constraintLayout = this.f171347f.f171232o1;
        C87412m.m108591d(constraintLayout);
        return new C65750a((ViewGroup) inflate, cVar, constraintLayout, (ViewGroup) this.f171346e.findViewById(C0966R.C0970id.kbb));
    }
}
