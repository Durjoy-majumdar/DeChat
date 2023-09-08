package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent */
public class NearLifeErrorContent extends FrameLayout {

    /* renamed from: d */
    public Context f20073d;

    /* renamed from: e */
    public View f20074e;

    /* renamed from: f */
    public TextView f20075f;

    /* renamed from: g */
    public View f20076g;

    /* renamed from: h */
    public ListView f20077h;

    public NearLifeErrorContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20073d = context;
        mo5873a();
    }

    /* renamed from: a */
    public final void mo5873a() {
        View inflate = View.inflate(this.f20073d, C0966R.C0971layout.bjt, this);
        this.f20074e = inflate;
        this.f20075f = (TextView) inflate.findViewById(C0966R.C0970id.h_o);
        this.f20076g = this.f20074e.findViewById(C0966R.C0970id.ha9);
    }

    /* renamed from: b */
    public void mo5874b(int i) {
        if (i == 0) {
            this.f20075f.setVisibility(8);
            View view = this.f20076g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f20077h.setVisibility(0);
        } else if (i == 1) {
            this.f20075f.setVisibility(0);
            View view3 = this.f20076g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f20077h.setVisibility(8);
        } else if (i == 2) {
            this.f20075f.setVisibility(8);
            View view5 = this.f20076g;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f20077h.setVisibility(8);
        }
    }

    public void setListView(ListView listView) {
        this.f20077h = listView;
    }

    public NearLifeErrorContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20073d = context;
        mo5873a();
    }
}
