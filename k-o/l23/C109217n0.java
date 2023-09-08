package l23;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import lh2.C99417a;
import qh2.C101198e;

/* renamed from: l23.n0 */
public final class C109217n0 extends C99417a {

    /* renamed from: f */
    public ViewGroup f327003f;

    /* renamed from: g */
    public final InsectRelativeLayout f327004g;

    /* renamed from: h */
    public final TabLayout f327005h;

    /* renamed from: l23.n0$a */
    public static final class C109218a implements TabLayout.C104470c {

        /* renamed from: a */
        public final /* synthetic */ C101198e f327006a;

        public C109218a(C101198e eVar) {
            this.f327006a = eVar;
        }

        /* renamed from: a */
        public void mo9213a(TabLayout.C55061f fVar) {
        }

        /* renamed from: b */
        public void mo9214b(TabLayout.C55061f fVar) {
            if (fVar != null) {
                C101198e eVar = this.f327006a;
                int i = fVar.f154604e;
                if (i == 1) {
                    Log.m105924i("MicroMsg.TemplateNormalModeSelectPlugin", "onSelect template mode");
                    C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_SELECT_TEMPLATE_MODE, (Bundle) null, 2, (Object) null);
                } else if (i == 0) {
                    Log.m105924i("MicroMsg.TemplateNormalModeSelectPlugin", "onSelect normal mode");
                    C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_SELECT_NORMAL_MODE, (Bundle) null, 2, (Object) null);
                }
            }
        }

        /* renamed from: c */
        public void mo9215c(TabLayout.C55061f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109217n0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f327003f = viewGroup;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.kgt);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id…al_mode_switch_container)");
        InsectRelativeLayout insectRelativeLayout = (InsectRelativeLayout) findViewById;
        this.f327004g = insectRelativeLayout;
        View findViewById2 = this.f327003f.findViewById(C0966R.C0970id.kgu);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id…ate_normal_mode_switcher)");
        TabLayout tabLayout = (TabLayout) findViewById2;
        this.f327005h = tabLayout;
        Log.m105924i("MicroMsg.TemplateNormalModeSelectPlugin", "init tabLayout.tabCount:" + tabLayout.getTabCount());
        insectRelativeLayout.setDiscardKeyboard(true);
        int tabCount = tabLayout.getTabCount() - 1;
        for (int i = 0; i < tabCount; i++) {
            View childAt = this.f327005h.getChildAt(0);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(C76577a.m92157h(this.f327003f.getContext(), C0966R.dimen.f3749d0));
            childAt2.setLayoutParams(marginLayoutParams);
        }
        this.f327005h.mo146882a(new C109218a(eVar));
        mo160469x(false);
    }

    public void setVisibility(int i) {
        this.f327005h.setVisibility(i);
    }

    /* renamed from: x */
    public final void mo160469x(boolean z) {
        this.f327004g.setVisibility(z ? 0 : 8);
    }
}
