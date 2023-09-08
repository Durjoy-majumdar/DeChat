package mo1;

import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import fy3.C32228q;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: mo1.q1 */
public final class C11045q1 extends C87413o implements C32228q<Boolean, Boolean, List<? extends C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61514m1 f32793d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11045q1(C61514m1 m1Var) {
        super(3);
        this.f32793d = m1Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        View findViewById;
        View findViewById2;
        TextView textView;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        List list = (List) obj3;
        if (!booleanValue && !booleanValue2) {
            this.f32793d.mo86478d3().setHasBottomMore(false);
            C61514m1 m1Var = this.f32793d;
            View loadMoreFooter = m1Var.mo86478d3().getLoadMoreFooter();
            if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setText(C0966R.string.eat);
            }
            View loadMoreFooter2 = m1Var.mo86478d3().getLoadMoreFooter();
            TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            View loadMoreFooter3 = m1Var.mo86478d3().getLoadMoreFooter();
            View findViewById3 = loadMoreFooter3 != null ? loadMoreFooter3.findViewById(C0966R.C0970id.g2s) : null;
            if (findViewById3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById3;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileQQMusicUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileQQMusicUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (((FinderProfileUiStyleUIC) C39818r.f106831a.mo62443b(m1Var.getContext()).mo75002a(FinderProfileUiStyleUIC.class)).mo3861i0()) {
                View loadMoreFooter4 = m1Var.mo86478d3().getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (findViewById2 = loadMoreFooter4.findViewById(C0966R.C0970id.g2s)) == null)) {
                    findViewById2.setBackgroundColor(m1Var.getResources().getColor(C0966R.color.ahf));
                }
            } else {
                View loadMoreFooter5 = m1Var.mo86478d3().getLoadMoreFooter();
                if (!(loadMoreFooter5 == null || (findViewById = loadMoreFooter5.findViewById(C0966R.C0970id.g2s)) == null)) {
                    findViewById.setBackgroundColor(m1Var.getResources().getColor(C0966R.color.al6));
                }
            }
        }
        C11013k1 k1Var = (C11013k1) C39818r.f106831a.mo62444c(this.f32793d.getActivity()).mo75002a(C11013k1.class);
        C11024p1 p1Var = new C11024p1(this.f32793d);
        k1Var.getClass();
        C37521f.f99374d.getClass();
        if (C37521f.f99381d7.mo60266n().intValue() == 1) {
            C53895h.m60466d(k1Var.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C11010j1(list, k1Var, p1Var, (C15601d<? super C11010j1>) null), 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
