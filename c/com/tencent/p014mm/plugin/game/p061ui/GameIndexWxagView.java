package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import py1.C47672s5;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameIndexWxagView */
public class GameIndexWxagView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public LayoutInflater f113965d = ((LayoutInflater) getContext().getSystemService("layout_inflater"));

    /* renamed from: e */
    public int f113966e;

    /* renamed from: f */
    public ViewGroup f113967f = this;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameIndexWxagView$a */
    public static class C42201a {

        /* renamed from: a */
        public int f113968a;

        /* renamed from: b */
        public C47672s5 f113969b;

        public C42201a(int i, C47672s5 s5Var) {
            this.f113968a = i;
            this.f113969b = s5Var;
        }
    }

    public GameIndexWxagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C42201a)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42201a aVar = (C42201a) view.getTag();
        if (aVar.f113969b == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1079;
        Context context = getContext();
        C47672s5 s5Var = aVar.f113969b;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(context, s5Var.f128007g, s5Var.f128004d, s5Var.f128009i, 0, s5Var.f128008h, appBrandStatObject);
        C40314g.m43487f(getContext(), 10, 1025, aVar.f113968a, 30, aVar.f113969b.f128004d, this.f113966e, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Log.m105924i("MicroMsg.GameIndexWxagView", "initView finished");
    }
}
