package ls1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7865r3;
import rx3.C13598b0;

/* renamed from: ls1.b */
public final class C61385b implements C61396n {

    /* renamed from: a */
    public final int f174593a;

    public C61385b(int i) {
        this.f174593a = i;
    }

    /* renamed from: a */
    public void mo86329a(FinderTabLayout finderTabLayout) {
        int i;
        View l;
        View view;
        if (finderTabLayout != null && finderTabLayout.f312992g.getChildCount() > (i = this.f174593a)) {
            View childAt = finderTabLayout.f312992g.getChildAt(i);
            C13598b0 b0Var = null;
            FinderTabLayout.C105328h hVar = childAt instanceof FinderTabLayout.C105328h ? (FinderTabLayout.C105328h) childAt : null;
            Object tag = (hVar == null || (view = hVar.f313035g) == null) ? null : view.getTag();
            C10646d dVar = tag instanceof C10646d ? (C10646d) tag : null;
            if (dVar != null && (l = dVar.mo10903l()) != null) {
                int c = C7865r3.f26468a.mo8970c();
                int[] iArr = {0, 0};
                l.getLocationOnScreen(iArr);
                int width = (c / 2) - (iArr[0] + (l.getWidth() / 2));
                ViewGroup.LayoutParams layoutParams = finderTabLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    Log.m105924i("Finder.CenterAlignStrategy", "marginStart: " + marginLayoutParams.getMarginStart() + " delta:" + width + ' ');
                    marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + width);
                    finderTabLayout.setLayoutParams(marginLayoutParams);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    Log.m105928w("Finder.CenterAlignStrategy", "tabLayoutParams null!");
                }
            }
        }
    }
}
