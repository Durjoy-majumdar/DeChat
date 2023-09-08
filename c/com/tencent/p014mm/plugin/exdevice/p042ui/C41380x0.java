package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import qo3.C77407n;
import tv2.C14096e;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.x0 */
public class C41380x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI.C41303l f111410d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.x0$a */
    public class C41381a implements MenuItem.OnMenuItemClickListener {
        public C41381a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C14096e.m13447a(11);
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i = ExdeviceRankInfoUI.f111217R;
            C77407n nVar = new C77407n((Context) exdeviceRankInfoUI.getContext(), 1, false);
            nVar.f225771i = new C2253e1(exdeviceRankInfoUI);
            nVar.f225782p = new C41328f1(exdeviceRankInfoUI);
            nVar.mo107573q();
            return true;
        }
    }

    public C41380x0(ExdeviceRankInfoUI.C41303l lVar) {
        this.f111410d = lVar;
    }

    public void run() {
        ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
        int i = ExdeviceRankInfoUI.f111217R;
        exdeviceRankInfoUI.mo64378N7();
        if (!Util.isNullOrNil(ExdeviceRankInfoUI.this.f111221D)) {
            ExdeviceRankInfoUI.this.addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C41381a());
        }
        ExdeviceRankInfoUI exdeviceRankInfoUI2 = ExdeviceRankInfoUI.this;
        ExdeviceRankChampionInfoView exdeviceRankChampionInfoView = exdeviceRankInfoUI2.f111238h;
        if (exdeviceRankChampionInfoView != null) {
            exdeviceRankChampionInfoView.mo2146a(exdeviceRankInfoUI2.f111250w);
        }
    }
}
