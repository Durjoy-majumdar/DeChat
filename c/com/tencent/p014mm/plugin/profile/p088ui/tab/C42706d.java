package com.tencent.p014mm.plugin.profile.p088ui.tab;

import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import gy3.C87412m;
import ht1.C8797q5;
import java.util.Iterator;
import java.util.List;
import te3.C48809b51;
import te3.C49098d51;
import te3.C51098rf;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.d */
public final class C42706d implements C8797q5.C8799b {

    /* renamed from: a */
    public final /* synthetic */ C42713g f115646a;

    /* renamed from: b */
    public final /* synthetic */ String f115647b;

    public C42706d(C42713g gVar, String str) {
        this.f115646a = gVar;
        this.f115647b = str;
    }

    /* renamed from: a */
    public void mo9630a(List<C49098d51> list, int i) {
        String str;
        C87412m.m108594g(list, "noticeList");
        String str2 = this.f115647b;
        Iterator<T> it = list.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C49098d51 d512 = (C49098d51) it.next();
            C2816v vVar = C2816v.f14072a;
            C87412m.m108593f(str2, "finderUserName");
            String str3 = d512.f132122h;
            if (str3 != null) {
                str = str3;
            }
            C49098d51 d = vVar.mo2915d(str2, str);
            if (d != null) {
                d.f132119e = d512.f132119e;
            }
        }
        C42713g gVar = this.f115646a;
        C48809b51 b512 = gVar.f115668b.f131724x;
        boolean z = false;
        int i2 = b512 != null ? b512.f130945d : 0;
        if (i >= i2) {
            if (b512 != null) {
                b512.f130946e = i2;
            }
        } else if (b512 != null) {
            b512.f130946e = i;
        }
        C51098rf rfVar = gVar.f115680n;
        String str4 = rfVar != null ? rfVar.f140874g : null;
        C2816v vVar2 = C2816v.f14072a;
        String str5 = this.f115647b;
        C87412m.m108593f(str5, "finderUserName");
        if (str4 != null) {
            str = str4;
        }
        C49098d51 d2 = vVar2.mo2915d(str5, str);
        C42713g gVar2 = this.f115646a;
        if (d2 != null && d2.f132119e == 0) {
            z = true;
        }
        gVar2.mo66867c(z);
    }
}
