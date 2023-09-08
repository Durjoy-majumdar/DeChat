package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import di3.C86312j;
import h81.C32735h;
import ob0.C47350c;
import te3.C51616uz;
import te3.C51758vz;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.b */
public class C42512b extends C75128o0<C51758vz> {
    public C42512b(String str) {
        C51616uz uzVar = new C51616uz();
        uzVar.f143196d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = uzVar;
        bVar.f127067b = new C51758vz();
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_envelope_transfer_new_cgi, 1) != 1 ? false : true) {
            bVar.f127069d = 479;
            bVar.f127068c = "/cgi-bin/micromsg-bin/confirmshowsourcenew";
        } else {
            bVar.f127069d = 2968;
            bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/confirmshowsource";
        }
        mo123453j(bVar.mo72403a());
    }
}
