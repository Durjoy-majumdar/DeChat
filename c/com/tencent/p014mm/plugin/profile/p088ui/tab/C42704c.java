package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C8797q5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kf2.C46723f;
import sf0.C48374j0;
import te3.C48809b51;
import te3.C49001ch;
import te3.C49098d51;
import te3.C49236e51;
import te3.C50404mi;
import te3.C51098rf;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.c */
public final class C42704c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42713g f115643d;

    /* renamed from: e */
    public final /* synthetic */ String f115644e;

    public C42704c(C42713g gVar, String str) {
        this.f115643d = gVar;
        this.f115644e = str;
    }

    public final void onClick(View view) {
        C50404mi miVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initMore$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C49001ch chVar = this.f115643d.f115668b;
        C87412m.m108594g(chVar, "v2resp");
        C49236e51 e512 = new C49236e51();
        if (!(chVar.f131724x == null || chVar.f131721u.size() == 0 || (miVar = chVar.f131719s) == null)) {
            String b = C48374j0.m53713b(miVar.f138039d);
            LinkedList<C51098rf> linkedList = chVar.f131721u;
            C87412m.m108593f(linkedList, "v2resp.LiveInfo");
            for (C51098rf rfVar : linkedList) {
                C49098d51 d512 = new C49098d51();
                d512.f132118d = rfVar.f140871d;
                d512.f132121g = rfVar.f140873f;
                d512.f132122h = rfVar.f140874g;
                C2816v vVar = C2816v.f14072a;
                C87412m.m108593f(b, "finderUserName");
                String str = d512.f132122h;
                if (str == null) {
                    str = "";
                }
                C49098d51 d = vVar.mo2915d(b, str);
                d512.f132119e = d != null ? d.f132119e : 1;
                e512.f132697d.add(d512);
            }
            C48809b51 b512 = chVar.f131724x;
            e512.f132698e = b512.f130947f;
            e512.f132699f = b512.f130945d;
            e512.f132700g = b512.f130946e;
        }
        Log.m105924i("ContactBizHeaderLiveNoticeLogic", "click show more, finderusername = " + this.f115644e + ", initCount = " + e512.f132697d.size() + ", totalNotice = " + e512.f132699f + ", totalReserve = " + e512.f132700g);
        C42713g gVar = this.f115643d;
        C46723f.m52020b(gVar.f115668b.f131707d.f140834d, 1704, gVar.f115670d, gVar.f115667a.getIntent());
        C8797q5 q5Var = this.f115643d.f115682p;
        C87412m.m108591d(q5Var);
        C8797q5.C8798a.m8619a(q5Var, e512, (String) null, 2, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initMore$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
