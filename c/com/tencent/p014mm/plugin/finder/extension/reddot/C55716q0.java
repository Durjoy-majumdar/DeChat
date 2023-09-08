package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58413v0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C50705on1;
import te3.C51978xi1;
import te3.C64355f00;
import te3.C64586nn1;
import te3.C64702s7;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.q0 */
public final class C55716q0 {

    /* renamed from: a */
    public static final C55716q0 f158580a = new C55716q0();

    /* renamed from: b */
    public static void m63395b(C55716q0 q0Var, int i, boolean z, int i2, C32226l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            C37521f.f99374d.getClass();
            i2 = C37521f.f99205J4.mo60266n().intValue();
        }
        q0Var.mo77300a(i, z, i2, lVar);
    }

    /* renamed from: a */
    public final void mo77300a(int i, boolean z, int i2, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(lVar, "action");
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        Log.m105924i("FinderRedDotUtil", "dropTimeLineRedDotByExpt targetTab:" + i + " controlValue:" + i2);
        if (i == 1) {
            mo77302d(i2, 4, "TLFollow", lVar);
            mo77302d(i2, 8, "finder_tl_hot_tab", lVar);
        } else if (i == 3) {
            mo77302d(i2, 1, "TLRecommendTab", lVar);
            mo77302d(i2, 2, "finder_tl_hot_tab", lVar);
        } else if (i == 4) {
            mo77302d(i2, 32, "TLRecommendTab", lVar);
            mo77302d(i2, 16, "TLFollow", lVar);
        }
    }

    /* renamed from: c */
    public final void mo77301c(String str) {
        C87412m.m108594g(str, "path");
        Log.m105924i("FinderRedDotUtil", "dropTimelineRedDot 1:" + str);
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        C64586nn1 R5 = Nx0.mo77246R5(str);
        C55718s0 G5 = Nx0.mo77227G5(str);
        Nx0.mo77239M5(str);
        if (R5 != null) {
            C58413v0.m67783l(C58413v0.f167346a, G5, R5, 13, (String) null, 0, 24, (Object) null);
        }
        Log.m105924i("FinderRedDotUtil", "dropTimelineRedDot 2:" + str);
    }

    /* renamed from: d */
    public final void mo77302d(int i, int i2, String str, C32226l<? super String, C13598b0> lVar) {
        if ((i & i2) == i2) {
            lVar.invoke(str);
        }
    }

    /* renamed from: e */
    public final String mo77303e(C51978xi1 xi12) {
        if (xi12 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        LinkedList<C64586nn1> linkedList = xi12.f144672g;
        C87412m.m108593f(linkedList, "info.show_infos");
        boolean z = false;
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(f158580a.mo77304f((C64586nn1) next, i));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("CtrlInfo{tipsId=");
        sb4.append(xi12.f144673h);
        sb4.append(" priority=");
        sb4.append(xi12.f144669d);
        sb4.append(" type=");
        sb4.append(xi12.f144670e);
        sb4.append(" starttime=");
        sb4.append(xi12.f144675j);
        sb4.append(" report_ctrl_info=");
        if (xi12.f144684v != null) {
            z = true;
        }
        sb4.append(z);
        sb4.append(" expired=");
        sb4.append(xi12.f144674i);
        sb4.append(" tipsShowInfo=");
        sb4.append(sb);
        sb4.append('}');
        return sb4.toString();
    }

    /* renamed from: f */
    public final String mo77304f(C64586nn1 nn12, int i) {
        C50705on1 on12;
        String str;
        C64355f00 f002;
        if (nn12 == null) {
            return "[empty]";
        }
        String str2 = null;
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            on12 = new C50705on1();
            C89349b bVar = nn12.f184510o;
            if (bVar != null && nn12.f184509n == 2) {
                on12.parseFrom(bVar.mo123703f());
            }
        } else {
            on12 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        sb.append(i);
        sb.append("{showType=");
        sb.append(nn12.f184502d);
        sb.append(" count=");
        sb.append(nn12.f184503e);
        sb.append(" title=");
        sb.append(nn12.f184504f);
        sb.append(" attributeTitle=");
        C64702s7 s7Var = nn12.f184519x;
        if (!(s7Var == null || (f002 = s7Var.f185355d) == null)) {
            str2 = f002.f183065d;
        }
        sb.append(str2);
        sb.append(" clearType=");
        sb.append(nn12.f184506h);
        sb.append(" iconUrl=");
        sb.append(nn12.f184505g);
        sb.append(" path=");
        sb.append(nn12.f184507i);
        sb.append(" show_ext_info_type=");
        sb.append(nn12.f184509n);
        sb.append(" parent=");
        sb.append(nn12.f184508j);
        sb.append(' ');
        if (on12 != null) {
            str = "jumpPriority=" + on12.f139267d;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" ignore_freq_limit=");
        sb.append(nn12.f184514s);
        sb.append(" username=");
        sb.append(nn12.f184521z);
        sb.append("} ");
        return sb.toString();
    }
}
