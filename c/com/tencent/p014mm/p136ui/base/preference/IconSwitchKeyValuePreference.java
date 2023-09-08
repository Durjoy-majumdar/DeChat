package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7018q1;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference */
public class IconSwitchKeyValuePreference extends IconPreference {

    /* renamed from: l1 */
    public TextView f121236l1;

    /* renamed from: m1 */
    public int f121237m1;

    public IconSwitchKeyValuePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b0 */
    public final void mo69911b0() {
        if (this.f121236l1 != null) {
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f121274d, 2.0f);
            this.f121236l1.setTextColor(C7018q1.m7263a(this.f121274d));
            int i = this.f121237m1;
            if (i == 0) {
                this.f121236l1.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.status_accountunkey, 0, 0, 0);
                this.f121236l1.setCompoundDrawablePadding(fromDPToPix);
            } else if (i == 1) {
                this.f121236l1.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.status_accountkey, 0, 0, 0);
                this.f121236l1.setCompoundDrawablePadding(fromDPToPix);
            } else if (i == 2) {
                this.f121236l1.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.status_accountkey_off, 0, 0, 0);
                this.f121236l1.setCompoundDrawablePadding(fromDPToPix);
            } else {
                this.f121236l1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f121236l1 = (TextView) view.findViewById(16908304);
        mo69911b0();
    }

    public IconSwitchKeyValuePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconSwitchKeyValuePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121237m1 = 0;
    }
}
