package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C8883h;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2$$c */
public class MallIndexBaseUIv2$$c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MallIndexBaseUIv2 f201199d;

    public MallIndexBaseUIv2$$c(MallIndexBaseUIv2 mallIndexBaseUIv2) {
        this.f201199d = mallIndexBaseUIv2;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 3);
        C88144b.m109801s(this.f201199d, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
        this.f201199d.finish();
        if (!C8883h.m8692c()) {
            C115669n.INSTANCE.mo160131h(14954, C8883h.f28150a, "open_wcpay_specific_view:ok");
            C8883h.f28150a = null;
        }
        C115669n.INSTANCE.mo160131h(14419, this.f201199d.f201188i, 6);
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "set BackBtn");
        return true;
    }
}
