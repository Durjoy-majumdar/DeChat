package t51;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import gy3.C87412m;
import kg3.C76577a;
import p206nj.C47264o;
import yl0.C91485g;

/* renamed from: t51.m */
public final class C110923m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331740d;

    public C110923m(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331740d = springLuckyEggActivity;
    }

    public void onGlobalLayout() {
        C110928q qVar = this.f331740d.f312423f;
        if (qVar != null) {
            qVar.f331745a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int a = C47264o.m52556a(this.f331740d.getContext(), 0);
            AppCompatActivity context = this.f331740d.getContext();
            C110928q qVar2 = this.f331740d.f312423f;
            if (qVar2 != null) {
                int c = C76577a.m92152c(context, qVar2.f331745a.getMeasuredHeight() + a);
                if (c > 812) {
                    C110928q qVar3 = this.f331740d.f312423f;
                    if (qVar3 != null) {
                        ViewGroup.LayoutParams layoutParams = qVar3.f331755k.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C76577a.m92151b(this.f331740d.getContext(), ((c - C91485g.CTRL_INDEX) / 2) + 128) - a;
                        C110928q qVar4 = this.f331740d.f312423f;
                        if (qVar4 != null) {
                            qVar4.f331755k.requestLayout();
                        } else {
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewBinding");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            C87412m.m108603p("viewBinding");
            throw null;
        }
    }
}
