package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60165e4;
import ht1.C60200t1;
import java.util.Map;
import q31.C118148a;
import te3.C51327t10;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.ui.FinderIconViewTipPreference$$a */
public final /* synthetic */ class FinderIconViewTipPreference$$a implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderIconViewTipPreference f164965a;

    /* renamed from: b */
    public final /* synthetic */ String f164966b;

    public /* synthetic */ FinderIconViewTipPreference$$a(FinderIconViewTipPreference finderIconViewTipPreference, String str) {
        this.f164965a = finderIconViewTipPreference;
        this.f164966b = str;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map mo37b(String str) {
        C55718s0 s0Var;
        C64586nn1 nn12;
        C51327t10 t102;
        FinderIconViewTipPreference finderIconViewTipPreference = this.f164965a;
        String str2 = this.f164966b;
        finderIconViewTipPreference.getClass();
        Class cls = C60200t1.class;
        if (!str2.equals("FinderMentionEntrance")) {
            nn12 = finderIconViewTipPreference.f55802q2;
            if (nn12 == null || (s0Var = finderIconViewTipPreference.f55803r2) == null) {
                nn12 = finderIconViewTipPreference.f55800o2;
                s0Var = finderIconViewTipPreference.f55801p2;
            }
            finderIconViewTipPreference.f55802q2 = null;
            finderIconViewTipPreference.f55803r2 = null;
        } else {
            nn12 = null;
            s0Var = null;
        }
        if (nn12 == null || s0Var == null) {
            nn12 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5(str2);
            s0Var = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77227G5(str2);
        }
        int i = 0;
        if (nn12 == null) {
            Log.m105921e("FinderIconViewTipPreference", "no showInfo %s", str2);
            return null;
        } else if (s0Var == null) {
            Log.m105921e("FinderIconViewTipPreference", "no ctrInfo %s", str2);
            return null;
        } else {
            if (!(nn12.f184502d != 999 || (t102 = nn12.f184501B) == null || t102.f141896d == null)) {
                i = finderIconViewTipPreference.mo25970p0().f124275a;
            }
            return ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85144E8(s0Var, nn12, i);
        }
    }
}
