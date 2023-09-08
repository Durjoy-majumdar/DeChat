package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76879j;
import qo3.C89779i0;
import te3.io4;
import ym2.C53544a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.h2 */
public final class C42989h2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsDelAuthUI f116400d;

    public C42989h2(SettingsDelAuthUI settingsDelAuthUI) {
        this.f116400d = settingsDelAuthUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            io4 io4 = this.f116400d.f116292e;
            if (io4 != null) {
                C53544a.f150509a.mo74208a(206, io4);
            }
            SettingsDelAuthUI settingsDelAuthUI = this.f116400d;
            C89779i0 i0Var = settingsDelAuthUI.f116293f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            settingsDelAuthUI.f116293f = C76879j.m92723Q(settingsDelAuthUI.getContext(), "", settingsDelAuthUI.getContext().getString(C0966R.string.iq_), true, false, (DialogInterface.OnCancelListener) null);
            io4 io42 = settingsDelAuthUI.f116292e;
            String str = null;
            String str2 = io42 != null ? io42.f135548d : null;
            if (!(str2 == null || str2.length() == 0)) {
                C39818r rVar = C39818r.f106831a;
                AppCompatActivity context = settingsDelAuthUI.getContext();
                C87412m.m108593f(context, "context");
                C42993r1 r1Var = (C42993r1) rVar.mo62444c(context).mo75002a(C42993r1.class);
                io4 io43 = settingsDelAuthUI.f116292e;
                if (io43 != null) {
                    str = io43.f135548d;
                }
                if (str == null) {
                    str = "";
                }
                r1Var.mo67197c3(str, 1);
            }
        }
    }
}
