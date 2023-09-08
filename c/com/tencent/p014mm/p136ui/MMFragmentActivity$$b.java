package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.ui.MMFragmentActivity$$b */
public class MMFragmentActivity$$b implements MMFragmentActivity$$h {
    /* renamed from: d */
    public boolean mo7676d(Context context, String str, Intent intent) {
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(MMFragmentActivity$$j.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            if (((MMFragmentActivity$$j) ((C38174i) bVar.next()).get()).mo7676d(context, str, intent)) {
                return true;
            }
        }
        return false;
    }
}
