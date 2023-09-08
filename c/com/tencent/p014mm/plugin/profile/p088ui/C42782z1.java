package com.tencent.p014mm.plugin.profile.p088ui;

import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.plugin.profile.C70142g;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: com.tencent.mm.plugin.profile.ui.z1 */
public class C42782z1 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f115828d;

    /* renamed from: e */
    public final /* synthetic */ C72996z1 f115829e;

    /* renamed from: f */
    public final /* synthetic */ NormalProfileHeaderPreference f115830f;

    public C42782z1(NormalProfileHeaderPreference normalProfileHeaderPreference, TextView textView, C72996z1 z1Var) {
        this.f115830f = normalProfileHeaderPreference;
        this.f115828d = textView;
        this.f115829e = z1Var;
    }

    public void onDismiss() {
        NormalProfileHeaderPreference normalProfileHeaderPreference = this.f115830f;
        TextView textView = this.f115828d;
        C72996z1 z1Var = this.f115829e;
        normalProfileHeaderPreference.getClass();
        textView.setVisibility(0);
        if (!Util.isNullOrNil(z1Var.mo62913l2())) {
            textView.setText(C70142g.m82630b(normalProfileHeaderPreference.f121274d, z1Var.getUsername()) + C70142g.m82631c(z1Var.getUsername(), z1Var.mo62913l2()));
        } else if (C72996z1.m85802I4(z1Var.getUsername()) || C72996z1.m85796D5(z1Var.getUsername())) {
            textView.setVisibility(8);
        } else {
            String nullAsNil = Util.nullAsNil(z1Var.mo62911k3());
            textView.setText(C70142g.m82630b(normalProfileHeaderPreference.f121274d, z1Var.getUsername()) + C70142g.m82631c(z1Var.getUsername(), nullAsNil));
        }
    }
}
