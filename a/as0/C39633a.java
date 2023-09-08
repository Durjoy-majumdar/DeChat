package as0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: as0.a */
public final class C39633a {

    /* renamed from: a */
    public final View f106391a;

    /* renamed from: b */
    public final ThreeDotsLoadingView f106392b;

    /* renamed from: c */
    public final View f106393c;

    /* renamed from: d */
    public final View f106394d;

    /* renamed from: e */
    public boolean f106395e;

    public C39633a(ViewGroup viewGroup, int i) {
        TextView textView;
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cjr, viewGroup, false);
        this.f106391a = inflate;
        View view = null;
        this.f106392b = inflate != null ? (ThreeDotsLoadingView) inflate.findViewById(C0966R.C0970id.g3t) : null;
        this.f106393c = inflate != null ? inflate.findViewById(C0966R.C0970id.edp) : view;
        this.f106394d = inflate;
        this.f106395e = true;
        if (!(inflate == null || (textView = (TextView) inflate.findViewById(C0966R.C0970id.lw6)) == null)) {
            textView.setText(i);
        }
        mo62189a(true);
    }

    /* renamed from: a */
    public final void mo62189a(boolean z) {
        this.f106395e = z;
        if (z) {
            ThreeDotsLoadingView threeDotsLoadingView = this.f106392b;
            if (threeDotsLoadingView != null) {
                threeDotsLoadingView.setVisibility(0);
                threeDotsLoadingView.mo119903e();
            }
            View view = this.f106393c;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        ThreeDotsLoadingView threeDotsLoadingView2 = this.f106392b;
        if (threeDotsLoadingView2 != null) {
            threeDotsLoadingView2.mo119904f();
            threeDotsLoadingView2.setVisibility(8);
        }
        View view3 = this.f106393c;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
