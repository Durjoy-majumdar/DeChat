package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import d62.C75339i;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAByPersonNameAmountRow */
public class LaunchAAByPersonNameAmountRow extends LinearLayout {

    /* renamed from: d */
    public TextView f10476d;

    /* renamed from: e */
    public TextView f10477e;

    /* renamed from: f */
    public View f10478f;

    public LaunchAAByPersonNameAmountRow(Context context) {
        super(context);
        mo1267a(context);
    }

    /* renamed from: a */
    public final void mo1267a(Context context) {
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.b3t, this, true);
        this.f10476d = (TextView) findViewById(C0966R.C0970id.l2o);
        this.f10477e = (TextView) findViewById(C0966R.C0970id.f5800p3);
        this.f10478f = findViewById(C0966R.C0970id.c7p);
    }

    /* renamed from: b */
    public void mo1268b(String str, String str2, double d) {
        this.f10476d.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), ((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(str, str2), this.f10476d.getTextSize()));
        this.f10477e.setText(getContext().getString(C0966R.string.f7272b5, new Object[]{Double.valueOf(d)}));
    }

    public void setDividerVisible(boolean z) {
        View view = this.f10478f;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow", "setDividerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public LaunchAAByPersonNameAmountRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1267a(context);
    }

    public LaunchAAByPersonNameAmountRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1267a(context);
    }
}
