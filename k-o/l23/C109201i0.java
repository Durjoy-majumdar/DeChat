package l23;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lh2.C99417a;
import qh2.C101198e;

/* renamed from: l23.i0 */
public final class C109201i0 extends C99417a {

    /* renamed from: f */
    public ViewGroup f326952f;

    /* renamed from: g */
    public final View f326953g;

    /* renamed from: h */
    public final View f326954h;

    /* renamed from: i */
    public View f326955i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109201i0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f326952f = viewGroup;
        this.f326953g = viewGroup.findViewById(C0966R.C0970id.hhh);
        View findViewById = this.f326952f.findViewById(C0966R.C0970id.l_8);
        this.f326954h = findViewById;
        this.f326955i = findViewById;
    }

    public void setVisibility(int i) {
        View view = this.f326955i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: x */
    public final void mo160442x() {
        View view = this.f326953g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setupVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/NormalModeContainerPlugin", "setupVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f326955i = this.f326954h;
    }
}
