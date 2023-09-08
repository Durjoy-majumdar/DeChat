package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.MenuItem;
import android.widget.EditText;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58417y0;
import gy3.C87412m;
import o40.C61926c;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.ui.l0 */
public final class C3854l0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17393d;

    public C3854l0(FinderCreateContactUI finderCreateContactUI) {
        this.f17393d = finderCreateContactUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.exitPageId = 5;
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
            }
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        FinderCreateContactUI finderCreateContactUI = this.f17393d;
        FinderCreateContactUI.C3648a aVar = FinderCreateContactUI.f16795U0;
        finderCreateContactUI.getClass();
        int i = FinderCreateContactUI.f16801a1;
        int i2 = FinderCreateContactUI.f16800Z0;
        int i3 = FinderCreateContactUI.f16799Y0;
        FinderCreateContactUI finderCreateContactUI2 = this.f17393d;
        int i4 = finderCreateContactUI2.f16833U;
        FinderCreateContactUI.C3648a aVar2 = FinderCreateContactUI.f16795U0;
        boolean z = FinderCreateContactUI.f16805e1;
        String str = FinderCreateContactUI.f16806f1;
        EditText editText = finderCreateContactUI2.f16844s;
        C49712hj1 hj12 = null;
        if (editText != null) {
            boolean z2 = !C87412m.m108589b(str, editText.getText().toString());
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f17393d);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            y0Var.Dx0(0, 0, i, false, i2, i3, i4, z, z2, hj12);
            this.f17393d.setResult(FinderCreateContactUI.f16809i1);
            this.f17393d.mo4024S7(2);
            this.f17393d.finish();
            return true;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }
}
