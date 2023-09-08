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

/* renamed from: com.tencent.mm.ui.base.preference.NormalIconTipPreference */
public class NormalIconTipPreference extends NormalIconPreference {

    /* renamed from: l1 */
    public TextView f121257l1;

    /* renamed from: m1 */
    public String f121258m1;

    public NormalIconTipPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b0 */
    public final void mo69919b0() {
        if (this.f121257l1 == null) {
            return;
        }
        if (Util.isNullOrNil(this.f121258m1)) {
            this.f121257l1.setVisibility(8);
            this.f121257l1.setText("");
            return;
        }
        this.f121257l1.setVisibility(0);
        this.f121257l1.setText(this.f121258m1);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f121257l1 = (TextView) view.findViewById(C0966R.C0970id.f2r);
        mo69919b0();
        View findViewById = view.findViewById(C0966R.C0970id.ity);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/NormalIconTipPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/preference/NormalIconTipPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        return super.mo1087x(viewGroup);
    }

    public NormalIconTipPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121257l1 = null;
        this.f121258m1 = "";
    }
}
