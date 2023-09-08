package mo1;

import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: mo1.i1 */
public final class C11007i1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileMusicUIC f32723d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11007i1(FinderProfileMusicUIC finderProfileMusicUIC) {
        super(0);
        this.f32723d = finderProfileMusicUIC;
    }

    public Object invoke() {
        View findViewById;
        View findViewById2;
        TextView textView;
        this.f32723d.mo78515e3().setHasBottomMore(false);
        FinderProfileMusicUIC finderProfileMusicUIC = this.f32723d;
        View loadMoreFooter = finderProfileMusicUIC.mo78515e3().getLoadMoreFooter();
        if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
            textView.setText(C0966R.string.eat);
        }
        View loadMoreFooter2 = finderProfileMusicUIC.mo78515e3().getLoadMoreFooter();
        View view = null;
        TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        View loadMoreFooter3 = finderProfileMusicUIC.mo78515e3().getLoadMoreFooter();
        if (loadMoreFooter3 != null) {
            view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
        }
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileMusicUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileMusicUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((FinderProfileUiStyleUIC) C39818r.f106831a.mo62443b(finderProfileMusicUIC.getContext()).mo75002a(FinderProfileUiStyleUIC.class)).mo3861i0()) {
            View loadMoreFooter4 = finderProfileMusicUIC.mo78515e3().getLoadMoreFooter();
            if (!(loadMoreFooter4 == null || (findViewById2 = loadMoreFooter4.findViewById(C0966R.C0970id.g2s)) == null)) {
                findViewById2.setBackgroundColor(finderProfileMusicUIC.getResources().getColor(C0966R.color.ahf));
            }
        } else {
            View loadMoreFooter5 = finderProfileMusicUIC.mo78515e3().getLoadMoreFooter();
            if (!(loadMoreFooter5 == null || (findViewById = loadMoreFooter5.findViewById(C0966R.C0970id.g2s)) == null)) {
                findViewById.setBackgroundColor(finderProfileMusicUIC.getResources().getColor(C0966R.color.al6));
            }
        }
        return C13598b0.f38549a;
    }
}
