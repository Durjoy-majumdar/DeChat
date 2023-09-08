package com.tencent.p014mm.plugin.ringtone.uic;

import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dk2.C58318a;
import java.util.List;
import pj2.C62318a;
import qc0.C101093a;
import rc0.C63389c;
import rj2.C63451c;

/* renamed from: com.tencent.mm.plugin.ringtone.uic.a */
public final class C57304a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63451c.C63452a.C63453a f164103d;

    /* renamed from: e */
    public final /* synthetic */ RingtoneExclusiveMainUIC f164104e;

    public C57304a(C63451c.C63452a.C63453a aVar, RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
        this.f164103d = aVar;
        this.f164104e = ringtoneExclusiveMainUIC;
    }

    public final void run() {
        List<C62318a> data;
        List<C62318a> data2;
        WxRecyclerAdapter<C62318a> wxRecyclerAdapter;
        List<C62318a> data3;
        C63451c.C63452a.C63453a aVar = this.f164103d;
        long j = aVar.f179988a;
        int i = aVar.f179989b;
        if (i == 1) {
            WxRecyclerAdapter<C62318a> wxRecyclerAdapter2 = this.f164104e.f164091j;
            if (wxRecyclerAdapter2 != null && (data = wxRecyclerAdapter2.getData()) != null) {
                RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC = this.f164104e;
                for (C62318a aVar2 : data) {
                    if (aVar2.f177145e && aVar2.getItemId() != j) {
                        aVar2.f177145e = false;
                        WxRecyclerAdapter<C62318a> wxRecyclerAdapter3 = ringtoneExclusiveMainUIC.f164091j;
                        if (wxRecyclerAdapter3 != null) {
                            wxRecyclerAdapter3.mo85799f6(aVar2.getItemId(), Boolean.FALSE);
                        }
                    }
                }
            }
        } else if (i == 2) {
            WxRecyclerAdapter<C62318a> wxRecyclerAdapter4 = this.f164104e.f164091j;
            if (wxRecyclerAdapter4 != null && (data2 = wxRecyclerAdapter4.getData()) != null) {
                RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC2 = this.f164104e;
                for (C62318a aVar3 : data2) {
                    if (aVar3.getItemId() == j) {
                        aVar3.f177145e = true;
                        WxRecyclerAdapter<C62318a> wxRecyclerAdapter5 = ringtoneExclusiveMainUIC2.f164091j;
                        if (wxRecyclerAdapter5 != null) {
                            wxRecyclerAdapter5.mo85799f6(aVar3.getItemId(), Boolean.TRUE);
                        }
                    } else if (aVar3.f177145e) {
                        aVar3.f177145e = false;
                        WxRecyclerAdapter<C62318a> wxRecyclerAdapter6 = ringtoneExclusiveMainUIC2.f164091j;
                        if (wxRecyclerAdapter6 != null) {
                            wxRecyclerAdapter6.mo85799f6(aVar3.getItemId(), Boolean.FALSE);
                        }
                    }
                }
            }
        } else if (i == 3 && (wxRecyclerAdapter = this.f164104e.f164091j) != null && (data3 = wxRecyclerAdapter.getData()) != null) {
            RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC3 = this.f164104e;
            for (C62318a aVar4 : data3) {
                if (aVar4.f177145e && aVar4.getItemId() == j) {
                    aVar4.f177145e = false;
                    WxRecyclerAdapter<C62318a> wxRecyclerAdapter7 = ringtoneExclusiveMainUIC3.f164091j;
                    if (wxRecyclerAdapter7 != null) {
                        wxRecyclerAdapter7.mo85799f6(aVar4.getItemId(), Boolean.FALSE);
                    }
                }
                if (C58318a.f166995b) {
                    C101093a.m132486h();
                    ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
                }
                C58318a.f166995b = false;
            }
        }
    }
}
