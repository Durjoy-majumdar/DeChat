package ry1;

import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.game.p061ui.GameIndexWxagView;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import py1.C47672s5;

/* renamed from: ry1.i0 */
public class C48124i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f129006d;

    /* renamed from: e */
    public final /* synthetic */ GameIndexWxagView f129007e;

    public C48124i0(GameIndexWxagView gameIndexWxagView, int i) {
        this.f129007e = gameIndexWxagView;
        this.f129006d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C47672s5)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C47672s5 s5Var = (C47672s5) view.getTag();
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1079;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(this.f129007e.getContext(), s5Var.f128007g, s5Var.f128004d, s5Var.f128009i, 0, s5Var.f128008h, appBrandStatObject);
        C40314g.m43487f(this.f129007e.getContext(), 10, 1025, 999, 30, s5Var.f128004d, this.f129006d, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
