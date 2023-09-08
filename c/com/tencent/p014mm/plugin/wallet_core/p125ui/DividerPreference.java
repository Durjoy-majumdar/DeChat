package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.DividerPreference */
public class DividerPreference extends Preference {

    /* renamed from: J */
    public View f21900J;

    /* renamed from: K */
    public boolean f21901K;

    public DividerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21900J = null;
        this.f21901K = true;
        this.f121271G = C0966R.C0971layout.f7145zp;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f21900J == null) {
            this.f21900J = mo1087x(viewGroup);
        }
        mo1086w(this.f21900J);
        return this.f21900J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        View findViewById = view.findViewById(C0966R.C0970id.c8h);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f121274d, 10.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setLayoutParams(layoutParams);
        if (!this.f21901K) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/DividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/DividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/DividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/DividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public DividerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
