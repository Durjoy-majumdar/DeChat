package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49460fr;
import te3.C49598gr;

/* renamed from: com.tencent.mm.plugin.remittance.model.c */
public class C42837c extends C75128o0<C49598gr> {
    public C42837c(String str, String str2, String str3) {
        C49460fr frVar = new C49460fr();
        frVar.f133640d = str;
        frVar.f133641e = str2;
        frVar.f133642f = str3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = frVar;
        bVar.f127067b = new C49598gr();
        bVar.f127069d = 4969;
        bVar.f127068c = "/cgi-bin/mmpay-bin/recalltransfer";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiTransferRecall", "recall: %s, %s, %s", str, str2, str3);
    }
}
