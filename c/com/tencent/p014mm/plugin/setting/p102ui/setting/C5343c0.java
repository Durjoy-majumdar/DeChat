package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11184p0;
import p159gw.C98250h;
import p182kk.C61104a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.c0 */
public class C5343c0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SelfQRCodeUI f20977d;

    public C5343c0(SelfQRCodeUI selfQRCodeUI) {
        this.f20977d = selfQRCodeUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            SelfQRCodeUI selfQRCodeUI = this.f20977d;
            String str = SelfQRCodeUI.f20752D;
            selfQRCodeUI.getClass();
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(selfQRCodeUI, new C5361i0(selfQRCodeUI), new C5335a0(selfQRCodeUI));
        } else if (itemId == 2) {
            SelfQRCodeUI selfQRCodeUI2 = this.f20977d;
            String str2 = SelfQRCodeUI.f20752D;
            selfQRCodeUI2.mo6205I7(0);
        } else if (itemId != 3) {
            if (itemId == 4) {
                SelfQRCodeUI.m5238H7(this.f20977d);
            }
        } else if (!C61104a.m71651g(this.f20977d.getContext()) && !C61104a.m71667w(this.f20977d.getContext()) && !C61104a.m71647c(this.f20977d.getContext(), true)) {
            Intent intent = new Intent();
            intent.putExtra("key_scan_report_enter_scene", 4);
            C88144b.m109791i(this.f20977d.getContext(), "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
        }
    }
}
