package ls1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7865r3;
import gy3.C8480h;
import rx3.C13598b0;

/* renamed from: ls1.a */
public final class C61384a implements C61396n {

    /* renamed from: a */
    public final boolean f174591a;

    /* renamed from: b */
    public final int f174592b;

    public C61384a(boolean z, int i, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? true : z;
        i = (i2 & 2) != 0 ? 0 : i;
        this.f174591a = z;
        this.f174592b = i;
    }

    /* renamed from: a */
    public void mo86329a(FinderTabLayout finderTabLayout) {
        if (finderTabLayout != null) {
            int childCount = finderTabLayout.f312992g.getChildCount();
            if (childCount < 2 || childCount % 2 != 0 || !this.f174591a) {
                int i = this.f174592b;
                int c = C7865r3.f26468a.mo8970c();
                int[] iArr = {0, 0};
                finderTabLayout.getLocationOnScreen(iArr);
                mo86331c(finderTabLayout, ((c / 2) - (iArr[0] + (finderTabLayout.getWidth() / 2))) + i);
                return;
            }
            int i2 = childCount / 2;
            C10646d b = mo86330b(finderTabLayout, i2 - 1);
            C10646d b2 = mo86330b(finderTabLayout, i2);
            View view = null;
            View m = b != null ? b.mo10904m() : null;
            if (b2 != null) {
                view = b2.mo10905o();
            }
            if (m != null && view != null) {
                int[] iArr2 = {0, 0};
                m.getLocationOnScreen(iArr2);
                int[] iArr3 = {0, 0};
                view.getLocationOnScreen(iArr3);
                mo86331c(finderTabLayout, (C7865r3.f26468a.mo8970c() / 2) - (((iArr2[0] + m.getWidth()) + iArr3[0]) / 2));
            }
        }
    }

    /* renamed from: b */
    public final C10646d mo86330b(FinderTabLayout finderTabLayout, int i) {
        View view;
        View childAt = finderTabLayout.f312992g.getChildAt(i);
        FinderTabLayout.C105328h hVar = childAt instanceof FinderTabLayout.C105328h ? (FinderTabLayout.C105328h) childAt : null;
        Object tag = (hVar == null || (view = hVar.f313035g) == null) ? null : view.getTag();
        if (tag instanceof C10646d) {
            return (C10646d) tag;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo86331c(FinderTabLayout finderTabLayout, int i) {
        ViewGroup.LayoutParams layoutParams = finderTabLayout.getLayoutParams();
        C13598b0 b0Var = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Log.m105924i("Finder.CenterAlignStrategy", "marginStart: " + marginLayoutParams.getMarginStart() + " delta:" + i + ' ');
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + i);
            finderTabLayout.setLayoutParams(marginLayoutParams);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105928w("Finder.CenterAlignStrategy", "tabLayoutParams null!");
        }
    }
}
