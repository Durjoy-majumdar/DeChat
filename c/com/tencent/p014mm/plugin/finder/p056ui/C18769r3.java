package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.DialogInterface;
import bd1.C39758f;
import bd1.C39759i;
import di3.C86312j;
import ht1.C8788n3;
import te3.C50295lp1;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.ui.r3 */
public final class C18769r3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSettingPersonalizedUI f52534d;

    public C18769r3(FinderSettingPersonalizedUI finderSettingPersonalizedUI) {
        this.f52534d = finderSettingPersonalizedUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((C8788n3) C86312j.m106911c(C8788n3.class)).Xu0(false, 1);
        C66785b bVar = C66785b.f191882e;
        C39758f fVar = new C39758f();
        if (fVar.mo62397b().f140479w == null) {
            fVar.mo62397b().f140479w = new C50295lp1();
        }
        C50295lp1 lp12 = fVar.mo62397b().f140479w;
        if (lp12 != null) {
            lp12.f137574d = false;
        }
        bVar.mo90665S0(fVar, C39759i.FINDER_SETTING_PERSONALIZED);
        FinderSettingPersonalizedUI finderSettingPersonalizedUI = this.f52534d;
        int i2 = FinderSettingPersonalizedUI.f52528f;
        finderSettingPersonalizedUI.mo23647H7("0", "channel");
    }
}
