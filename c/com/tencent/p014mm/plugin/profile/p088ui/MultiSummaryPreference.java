package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.MultiSummaryPreference */
public class MultiSummaryPreference extends Preference {

    /* renamed from: J */
    public Context f20210J;

    /* renamed from: K */
    public String f20211K;

    /* renamed from: L */
    public String[] f20212L;

    public MultiSummaryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20210J = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((TextView) view.findViewById(C0966R.C0970id.knx)).setText(this.f20211K);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.f359324ka0);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.f359325ka1);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        String[] strArr = this.f20212L;
        if (strArr == null || strArr.length <= 0) {
            View view2 = (View) view.findViewById(C0966R.C0970id.isy).getParent();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/MultiSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (strArr.length == 1) {
            ((TextView) linearLayout2.findViewById(C0966R.C0970id.ka8)).setText(this.f20212L[0]);
            linearLayout2.setVisibility(0);
        } else if (strArr.length == 2) {
            ((TextView) linearLayout.findViewById(C0966R.C0970id.ka7)).setText(this.f20212L[0]);
            linearLayout.setVisibility(0);
            ((TextView) linearLayout2.findViewById(C0966R.C0970id.ka8)).setText(this.f20212L[1]);
            linearLayout2.setVisibility(0);
        }
        View view4 = (View) view.findViewById(C0966R.C0970id.isy).getParent();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/MultiSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f359898bh1, viewGroup2);
        return x;
    }

    public MultiSummaryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20210J = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }

    public MultiSummaryPreference(Context context) {
        super(context);
        this.f20210J = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
