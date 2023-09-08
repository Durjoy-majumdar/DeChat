package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import di3.C86312j;
import h81.C32735h;
import ob0.C47350c;
import te3.C51616uz;
import te3.C51758vz;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.c */
public class C42513c extends C75128o0<C51758vz> {
    public C42513c(String str) {
        C51616uz uzVar = new C51616uz();
        uzVar.f143196d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = uzVar;
        bVar.f127067b = new C51758vz();
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_envelope_transfer_new_cgi, 1) != 1 ? false : true) {
            bVar.f127069d = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
            bVar.f127068c = "/cgi-bin/micromsg-bin/deleteshowsourcenew";
        } else {
            bVar.f127069d = 2665;
            bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/deleteshowsource";
        }
        mo123453j(bVar.mo72403a());
    }
}
