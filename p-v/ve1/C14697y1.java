package ve1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import de1.C7290r;
import jq3.C60905o;

/* renamed from: ve1.y1 */
public final class C14697y1 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40644d;

    /* renamed from: e */
    public final /* synthetic */ LinearLayout f40645e;

    public C14697y1(C60905o oVar, LinearLayout linearLayout) {
        this.f40644d = oVar;
        this.f40645e = linearLayout;
    }

    public void onAnimationEnd(Animator animator) {
        View D = this.f40644d.mo85812D(C0966R.C0970id.f358728gq1);
        ViewGroup viewGroup = D instanceof ViewGroup ? (ViewGroup) D : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f40645e);
        }
    }
}
