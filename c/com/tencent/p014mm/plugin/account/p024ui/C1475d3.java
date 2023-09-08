package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.account.ui.d3 */
public class C1475d3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SetPwdUI f10819d;

    public C1475d3(SetPwdUI setPwdUI) {
        this.f10819d = setPwdUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SetPwdUI setPwdUI = this.f10819d;
        setPwdUI.getClass();
        if ((setPwdUI instanceof RegByMobileSetPwdUI) && setPwdUI.f10772h) {
            Log.m105918d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
            C115669n.INSTANCE.mo160131h(11868, 1);
        }
        setPwdUI.hideVKB();
        setPwdUI.setResult(0);
        setPwdUI.finish();
        return true;
    }
}
