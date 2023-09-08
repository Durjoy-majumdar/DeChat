package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.recharge.ui.v */
public class C70475v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f203670d;

    /* renamed from: e */
    public final /* synthetic */ TextView f203671e;

    /* renamed from: f */
    public final /* synthetic */ int f203672f;

    /* renamed from: g */
    public final /* synthetic */ ListViewInScrollView f203673g;

    /* renamed from: h */
    public final /* synthetic */ View f203674h;

    /* renamed from: i */
    public final /* synthetic */ TextView f203675i;

    /* renamed from: j */
    public final /* synthetic */ int f203676j;

    /* renamed from: n */
    public final /* synthetic */ ListViewInScrollView f203677n;

    /* renamed from: o */
    public final /* synthetic */ TextView f203678o;

    /* renamed from: p */
    public final /* synthetic */ RechargeUI f203679p;

    public C70475v(RechargeUI rechargeUI, View view, TextView textView, int i, ListViewInScrollView listViewInScrollView, View view2, TextView textView2, int i2, ListViewInScrollView listViewInScrollView2, TextView textView3) {
        this.f203679p = rechargeUI;
        this.f203670d = view;
        this.f203671e = textView;
        this.f203672f = i;
        this.f203673g = listViewInScrollView;
        this.f203674h = view2;
        this.f203675i = textView2;
        this.f203676j = i2;
        this.f203677n = listViewInScrollView2;
        this.f203678o = textView3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f203670d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f203671e.setTextColor(this.f203672f);
        this.f203673g.setVisibility(0);
        View view4 = this.f203674h;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f203675i.setTextColor(this.f203676j);
        this.f203677n.setVisibility(8);
        if (this.f203679p.f203580o.getCount() == 0) {
            this.f203678o.setVisibility(0);
        } else {
            this.f203678o.setVisibility(8);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
