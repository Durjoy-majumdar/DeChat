package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C64750uh0;

/* renamed from: com.tencent.mm.plugin.finder.view.f0 */
public final class C56606f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f162291d;

    /* renamed from: e */
    public final /* synthetic */ FinderAdFeedbackWindow f162292e;

    /* renamed from: f */
    public final /* synthetic */ C64750uh0 f162293f;

    /* renamed from: g */
    public final /* synthetic */ TextView f162294g;

    public C56606f0(View view, FinderAdFeedbackWindow finderAdFeedbackWindow, C64750uh0 uh02, TextView textView) {
        this.f162291d = view;
        this.f162292e = finderAdFeedbackWindow;
        this.f162293f = uh02;
        this.f162294g = textView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextView textView = (TextView) this.f162291d.findViewById(C0966R.C0970id.ohq);
        WeImageView weImageView = (WeImageView) this.f162291d.findViewById(C0966R.C0970id.oo4);
        if (!((ArrayList) this.f162292e.f162008s).contains(this.f162293f)) {
            textView.setTextColor(this.f162292e.f161998f.getResources().getColor(C0966R.color.f2939n));
            weImageView.setIconColor(this.f162292e.f161998f.getResources().getColor(C0966R.color.f2939n));
            this.f162291d.setBackgroundDrawable(this.f162292e.f161998f.getResources().getDrawable(C0966R.C0969drawable.f5041ux));
            List<C64750uh0> list = this.f162292e.f162008s;
            C64750uh0 uh02 = this.f162293f;
            C87412m.m108593f(uh02, TPReportKeys.PlayerStep.PLAYER_REASON);
            ((ArrayList) list).add(uh02);
        } else {
            textView.setTextColor(this.f162292e.f161998f.getResources().getColor(C0966R.color.FG_0));
            weImageView.setIconColor(this.f162292e.f161998f.getResources().getColor(C0966R.color.FG_0));
            this.f162291d.setBackgroundDrawable(this.f162292e.f161998f.getResources().getDrawable(C0966R.C0969drawable.f5040uw));
            ((ArrayList) this.f162292e.f162008s).remove(this.f162293f);
        }
        FinderAdFeedbackWindow finderAdFeedbackWindow = this.f162292e;
        TextView textView2 = this.f162294g;
        C87412m.m108593f(textView2, "applyBtn");
        finderAdFeedbackWindow.mo79673b(textView2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
