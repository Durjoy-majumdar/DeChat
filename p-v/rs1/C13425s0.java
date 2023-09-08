package rs1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: rs1.s0 */
public final class C13425s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderAtFeedManageUIC f38004d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13425s0(FinderAtFeedManageUIC finderAtFeedManageUIC) {
        super(0);
        this.f38004d = finderAtFeedManageUIC;
    }

    public Object invoke() {
        Log.m105924i("Finder.AtFeedManageUIC", "[fetchEndCallback] totalSize=" + this.f38004d.mo5112e3().getSize());
        this.f38004d.mo5114g3().setHasBottomMore(false);
        View loadMoreFooter = this.f38004d.mo5114g3().getLoadMoreFooter();
        if (loadMoreFooter != null) {
            FinderAtFeedManageUIC finderAtFeedManageUIC = this.f38004d;
            TextView textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
            if (textView != null) {
                textView.setText(C0966R.string.eat);
            }
            TextView textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
            if (textView2 != null) {
                textView2.setTextColor(finderAtFeedManageUIC.getActivity().getResources().getColor(C0966R.color.FG_2));
            }
            TextView textView3 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAtFeedManageUIC$initLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAtFeedManageUIC$initLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return C13598b0.f38549a;
    }
}
