package com.tencent.p014mm.plugin.sns.p106ui;

import as2.C28125b;
import bs2.C92301a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.C96783i1;
import os2.C100400e0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$b */
public class SnsBrowseUI$$b implements C96783i1.C96784a {

    /* renamed from: d */
    public final /* synthetic */ SnsBrowseUI f277817d;

    public SnsBrowseUI$$b(SnsBrowseUI snsBrowseUI) {
        this.f277817d = snsBrowseUI;
    }

    /* renamed from: a */
    public void mo132611a(String str) {
        SnsMethodCalculate.markStartTimeMs("onScreenshotTaken", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$1");
        SnsBrowseUI snsBrowseUI = this.f277817d;
        int i = SnsBrowseUI.f277783g1;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        String str2 = snsBrowseUI.f277784P;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (str2.equals("")) {
            SnsMethodCalculate.markEndTimeMs("onScreenshotTaken", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$1");
            return;
        }
        C28125b.m38099a(44);
        C100400e0 Yx0 = C94866e1.Yx0();
        SnsBrowseUI snsBrowseUI2 = this.f277817d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        String str3 = snsBrowseUI2.f277784P;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        C92301a.m116078a(4, Yx0.mo139798DN(str3));
        SnsMethodCalculate.markEndTimeMs("onScreenshotTaken", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$1");
    }
}
