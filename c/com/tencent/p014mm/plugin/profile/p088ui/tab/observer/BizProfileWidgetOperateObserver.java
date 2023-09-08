package com.tencent.p014mm.plugin.profile.p088ui.tab.observer;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import hf2.C46051m;
import nj3.C76879j;
import p248ug.C52558c;
import pj3.C47511g;
import rb0.C47984k;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.observer.BizProfileWidgetOperateObserver */
public class BizProfileWidgetOperateObserver extends BaseBizProfileOperateObserver {

    /* renamed from: g */
    public boolean f115783g = true;

    /* renamed from: h */
    public ContactInfoUI f115784h;

    public BizProfileWidgetOperateObserver(ContactInfoUI contactInfoUI) {
        this.f115784h = contactInfoUI;
    }

    /* renamed from: x */
    public boolean mo66899x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        if (this.f115783g) {
            this.f115783g = false;
            C46051m.m51353b(z1Var.getUsername());
            C52558c b = C47984k.m53328b(z1Var.getUsername());
            this.f115782f = null;
            if (b != null) {
                b.mo73500r2(false);
            }
            if (b != null) {
                this.f115781e = b.mo73496n2();
                C52558c.C52560b r2 = b.mo73500r2(false);
                this.f115782f = r2;
                this.f115780d = r2.mo73523p();
                if (this.f115782f.mo73522o() != null && this.f115782f.mo73522o().length() > 0) {
                    this.f115782f.mo73522o();
                }
            }
            String stringExtra = this.f115784h.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
            if (!Util.isNullOrNil(stringExtra)) {
                this.f115784h.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
                ContactInfoUI contactInfoUI = this.f115784h;
                C76879j.m92754y(contactInfoUI, stringExtra, "", contactInfoUI.getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
            }
        }
        return false;
    }
}
