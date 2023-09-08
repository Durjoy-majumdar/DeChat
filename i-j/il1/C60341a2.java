package il1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.view.View;
import gy3.C87412m;
import il1.C60557z1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import te3.C64807wo2;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: il1.a2 */
public final class C60341a2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60557z1 f171997d;

    /* renamed from: e */
    public final /* synthetic */ C64807wo2 f171998e;

    /* renamed from: f */
    public final /* synthetic */ C60557z1.C60562e f171999f;

    public C60341a2(C60557z1 z1Var, C64807wo2 wo22, C60557z1.C60562e eVar) {
        this.f171997d = z1Var;
        this.f171998e = wo22;
        this.f171999f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C60557z1 z1Var = this.f171997d;
        C64807wo2 wo22 = this.f171998e;
        C60557z1.m70748b(z1Var, 4, wo22.f186145d, wo22.f186146e, 0, 8, (Object) null);
        C60557z1.C60562e eVar = this.f171997d.f172611g;
        C53973z1 z1Var2 = null;
        View view2 = eVar != null ? eVar.f172621E : null;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C60557z1 z1Var3 = this.f171997d;
        C60557z1.C60562e eVar2 = this.f171999f;
        z1Var3.f172611g = eVar2;
        View view4 = eVar2 != null ? eVar2.f172621E : null;
        if (view4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C60557z1.C60562e eVar3 = this.f171999f;
        C64807wo2 wo23 = this.f171998e;
        eVar3.getClass();
        C87412m.m108594g(wo23, "elementInfo");
        C53973z1 z1Var4 = eVar3.f172624H;
        if (z1Var4 != null) {
            C53973z1.C53974a.m60623a(z1Var4, (CancellationException) null, 1, (Object) null);
        }
        C60557z1 z1Var5 = eVar3.f172625I;
        C0000n0 n0Var = z1Var5.f172606b;
        if (n0Var != null) {
            z1Var2 = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C60384d2(wo23, z1Var5, eVar3, (C15601d<? super C60384d2>) null), 3, (Object) null);
        }
        eVar3.f172624H = z1Var2;
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
