package com.tencent.p014mm.plugin.offline.p085ui;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$c */
public class OfflineAlertView$$c extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ CheckBox f115245g;

    /* renamed from: h */
    public final /* synthetic */ View.OnClickListener f115246h;

    /* renamed from: i */
    public final /* synthetic */ ViewGroup f115247i;

    /* renamed from: j */
    public final /* synthetic */ Button f115248j;

    /* renamed from: n */
    public final /* synthetic */ OfflineAlertView f115249n;

    public OfflineAlertView$$c(OfflineAlertView offlineAlertView, CheckBox checkBox, View.OnClickListener onClickListener, ViewGroup viewGroup, Button button) {
        this.f115249n = offlineAlertView;
        this.f115245g = checkBox;
        this.f115246h = onClickListener;
        this.f115247i = viewGroup;
        this.f115248j = button;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        if (this.f115245g.isChecked()) {
            this.f115246h.onClick(view);
            C115669n.INSTANCE.mo160131h(22805, 2);
            return;
        }
        int dimensionPixelOffset = this.f115249n.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        float f = (float) (-dimensionPixelOffset);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f115247i, "translationX", new float[]{0.0f, f, (float) dimensionPixelOffset, f, 0.0f}).setDuration(300);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        C115669n.INSTANCE.mo160131h(22805, 1);
        this.f115248j.announceForAccessibility(this.f115249n.getContext().getString(C0966R.string.krg));
    }
}
