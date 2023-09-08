package ve1;

import android.animation.Animator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderEnhanceActionEvent;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60898l;
import jq3.C60905o;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: ve1.q2 */
public final class C14608q2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14592p2 f40442d;

    /* renamed from: e */
    public final /* synthetic */ FinderEnhanceActionEvent f40443e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14608q2(C14592p2 p2Var, FinderEnhanceActionEvent finderEnhanceActionEvent) {
        super(0);
        this.f40442d = p2Var;
        this.f40443e = finderEnhanceActionEvent;
    }

    public Object invoke() {
        TextView textView;
        RecyclerView recyclerView = this.f40442d.f12554A;
        RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
        C60905o oVar = wxRecyclerAdapter != null ? (C60905o) C60898l.m71330b6(wxRecyclerAdapter, this.f40443e.f9193d.f9194a, false, 2, (Object) null) : null;
        if (oVar != null) {
            C14592p2 p2Var = this.f40442d;
            FinderEnhanceActionEvent finderEnhanceActionEvent = this.f40443e;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "it.getAssociatedObject()");
            C55018j0 j0Var = (C55018j0) obj;
            p2Var.getClass();
            C37521f.f99374d.getClass();
            if (C37521f.f99275R5.mo60266n().intValue() == 1 && (textView = (TextView) oVar.mo85812D(C0966R.C0970id.khe)) != null) {
                int i = finderEnhanceActionEvent.f9193d.f9195b;
                if (i == -100) {
                    textView.setText("disable");
                    textView.setBackgroundResource(C0966R.C0969drawable.f357383ax3);
                } else if (i == 4) {
                    textView.setText("preload...");
                } else if (i == 6) {
                    textView.setText("all" + finderEnhanceActionEvent.f9193d.f9196c + "ms\ncgi" + finderEnhanceActionEvent.f9193d.f9197d + "ms\npld" + finderEnhanceActionEvent.f9193d.f9198e + "ms\ncnt" + finderEnhanceActionEvent.f9193d.f9199f);
                } else if (i == -3 || i == -2 || i == -1) {
                    textView.setText(String.valueOf(i));
                    textView.setBackgroundResource(C0966R.C0969drawable.ax4);
                } else if (i == 1) {
                    textView.setBackgroundResource(C0966R.C0969drawable.f357382ax2);
                    textView.animate().cancel();
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    textView.animate().setDuration(500).setListener((Animator.AnimatorListener) null).alpha(1.0f).start();
                    textView.setText("...");
                } else if (i == 2) {
                    textView.setText("cgi...");
                }
            }
        }
        return C13598b0.f38549a;
    }
}
