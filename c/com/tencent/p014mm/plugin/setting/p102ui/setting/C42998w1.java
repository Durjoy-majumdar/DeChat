package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76879j;
import qo3.C89779i0;
import te3.io4;
import ym2.C53544a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.w1 */
public final class C42998w1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ io4 f116414d;

    /* renamed from: e */
    public final /* synthetic */ SettingsAuthUI f116415e;

    public C42998w1(io4 io4, SettingsAuthUI settingsAuthUI) {
        this.f116414d = io4;
        this.f116415e = settingsAuthUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            C53544a.f150509a.mo74208a(203, this.f116414d);
            SettingsAuthUI settingsAuthUI = this.f116415e;
            io4 io4 = this.f116414d;
            int i2 = SettingsAuthUI.f116233x;
            settingsAuthUI.getClass();
            Log.m105924i("MicroMsg.SettingsAuthUI", "doDealUserAuth appId: " + io4.f135548d + ", appName: " + io4.f135549e);
            C89779i0 i0Var = settingsAuthUI.f116247t;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            settingsAuthUI.f116247t = C76879j.m92723Q(settingsAuthUI.getContext(), "", settingsAuthUI.getContext().getString(C0966R.string.iq_), true, false, (DialogInterface.OnCancelListener) null);
            String str = io4.f135548d;
            if (!(str == null || str.length() == 0)) {
                C39818r rVar = C39818r.f106831a;
                AppCompatActivity context = settingsAuthUI.getContext();
                C87412m.m108593f(context, "context");
                C42993r1 r1Var = (C42993r1) rVar.mo62444c(context).mo75002a(C42993r1.class);
                String str2 = io4.f135548d;
                if (str2 == null) {
                    str2 = "";
                }
                r1Var.mo67197c3(str2, 1);
            }
        }
    }
}
