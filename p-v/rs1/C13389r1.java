package rs1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: rs1.r1 */
public final class C13389r1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63599o1 f37928d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13389r1(C63599o1 o1Var) {
        super(0);
        this.f37928d = o1Var;
    }

    public Object invoke() {
        View findViewById;
        TextView textView;
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f37928d.f180345e;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setHasBottomMore(false);
            C63599o1 o1Var = this.f37928d;
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = o1Var.f180345e;
            if (refreshLoadMoreLayout2 != null) {
                View loadMoreFooter = refreshLoadMoreLayout2.getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = o1Var.f180345e;
                if (refreshLoadMoreLayout3 != null) {
                    View loadMoreFooter2 = refreshLoadMoreLayout3.getLoadMoreFooter();
                    TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = o1Var.f180345e;
                    if (refreshLoadMoreLayout4 != null) {
                        View loadMoreFooter3 = refreshLoadMoreLayout4.getLoadMoreFooter();
                        View findViewById2 = loadMoreFooter3 != null ? loadMoreFooter3.findViewById(C0966R.C0970id.g2s) : null;
                        if (findViewById2 != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view = findViewById2;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderEmojiListUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderEmojiListUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout5 = o1Var.f180345e;
                        if (refreshLoadMoreLayout5 != null) {
                            View loadMoreFooter4 = refreshLoadMoreLayout5.getLoadMoreFooter();
                            if (!(loadMoreFooter4 == null || (findViewById = loadMoreFooter4.findViewById(C0966R.C0970id.g2s)) == null)) {
                                findViewById.setBackgroundColor(o1Var.getResources().getColor(C0966R.color.al6));
                            }
                            return C13598b0.f38549a;
                        }
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }
}
