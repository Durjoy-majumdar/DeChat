package qj1;

import ak1.C54067f0;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C60557z1;
import rx3.C13598b0;
import zj1.C16217b;

/* renamed from: qj1.y0 */
public final class C63115y0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62889n0 f179107d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63115y0(C62889n0 n0Var) {
        super(0);
        this.f179107d = n0Var;
    }

    public Object invoke() {
        C62889n0 n0Var = this.f179107d;
        Context context = n0Var.f166287d.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        C16217b bVar = C16217b.f43438a;
        C16217b bVar2 = bVar;
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87830f(), n0Var.f178449H, n0Var.f178450I, (TextView) null, 16, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87823a(), n0Var.f178447F, n0Var.f178448G, (TextView) null, 16, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87826c(), n0Var.f178443B, n0Var.f178444C, (TextView) null, 16, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87828d1(), n0Var.f178453L, n0Var.f178452K, (TextView) null, 16, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87834i(), n0Var.f178481y, n0Var.f178483z, (TextView) null, 16, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87837q(), n0Var.f178475t, n0Var.f178476u, (TextView) null, 16, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity2, n0Var.mo87835n(), n0Var.f178463U, n0Var.f178464V, (TextView) null, 16, (Object) null);
        C62889n0.m74012Z0(this.f179107d, true);
        C62889n0 n0Var2 = this.f179107d;
        n0Var2.f178458Q0 = 1;
        n0Var2.f166287d.setVisibility(0);
        this.f179107d.f166287d.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
        C62889n0 n0Var3 = this.f179107d;
        ViewGroup viewGroup = n0Var3.f178446E;
        C87412m.m108593f(viewGroup, "menuBeauty");
        n0Var3.mo87832g1(viewGroup, C54067f0.C0066n.BEAUTY, this.f179107d.mo87823a());
        C62889n0 n0Var4 = this.f179107d;
        ViewGroup viewGroup2 = n0Var4.f178442A;
        C87412m.m108593f(viewGroup2, "menuFilter");
        n0Var4.mo87832g1(viewGroup2, C54067f0.C0066n.FILTER, this.f179107d.mo87826c());
        C62889n0 n0Var5 = this.f179107d;
        ViewGroup viewGroup3 = n0Var5.f178477v;
        C87412m.m108593f(viewGroup3, "menuMirror");
        n0Var5.mo87832g1(viewGroup3, C54067f0.C0066n.IMAGE, this.f179107d.mo87834i());
        C62889n0 n0Var6 = this.f179107d;
        ViewGroup viewGroup4 = n0Var6.f178474s;
        C87412m.m108593f(viewGroup4, "menuSwitchCamera");
        n0Var6.mo87832g1(viewGroup4, C54067f0.C0066n.FLIP, this.f179107d.mo87837q());
        C62889n0 n0Var7 = this.f179107d;
        View view = n0Var7.f178456P;
        C87412m.m108593f(view, "changeModeView");
        n0Var7.mo87832g1(view, C54067f0.C0066n.SWITCH, (String) null);
        bVar.mo14751g(this.f179107d.mo87830f());
        C60557z1.m70748b(this.f179107d.f178469Z, 1, (String) null, (String) null, 0, 14, (Object) null);
        if (this.f179107d.f178462T.getVisibility() == 0) {
            bVar.mo14751g(this.f179107d.mo87835n());
        }
        if (this.f179107d.f178451J.isShown()) {
            bVar.mo14751g(this.f179107d.mo87828d1());
        }
        return C13598b0.f38549a;
    }
}
