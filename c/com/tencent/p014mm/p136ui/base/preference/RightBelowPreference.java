package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.base.preference.RightBelowPreference */
public class RightBelowPreference extends SummaryBelowPreference {

    /* renamed from: K */
    public CharSequence f24287K;

    public RightBelowPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (!Util.isNullOrNil(this.f24287K)) {
            ((TextView) view.findViewById(C0966R.C0970id.itk)).setText(this.f24287K);
        }
        View findViewById = view.findViewById(C0966R.C0970id.isy);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/RightBelowPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/preference/RightBelowPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ((ViewGroup) ((ViewGroup) x.findViewById(C0966R.C0970id.br8)).findViewById(16908312)).addView((ViewGroup) View.inflate(this.f121274d, C0966R.C0971layout.d_q, (ViewGroup) null));
        return x;
    }

    public RightBelowPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightBelowPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
