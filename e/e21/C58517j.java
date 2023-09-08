package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C51582uq;
import te3.C64735tq;

/* renamed from: e21.j */
public class C58517j extends C89132b<C51582uq> {
    public C58517j(double d, String str, String str2, String str3, String str4, String str5, C89349b bVar, String str6, boolean z, String str7) {
        String str8 = str6;
        String str9 = str7;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C64735tq tqVar = new C64735tq();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        double d2 = d;
        sb4.append(d);
        sb4.append("");
        sb.append(C75228t.m90231X(sb4.toString(), "100"));
        sb.append("");
        tqVar.f185635d = sb.toString();
        tqVar.f185636e = str;
        tqVar.f185637f = str2;
        tqVar.f185638g = str3;
        tqVar.f185639h = str4;
        tqVar.f185640i = str5;
        tqVar.f185641j = bVar;
        tqVar.f185642n = str8;
        tqVar.f185643o = z;
        tqVar.f185644p = str9;
        Log.m105925i("MicroMsg.CgiSaveQrcode", "fee：%s desc:%s desc_required:%s descPlaceholder:%s ", Double.valueOf(d), str8, Boolean.valueOf(z), str9);
        bVar2.f127066a = tqVar;
        bVar2.f127067b = new C51582uq();
        bVar2.f127068c = "/cgi-bin/mmpay-bin/busif2fsaveqrcode";
        bVar2.f127069d = 4461;
        mo123453j(bVar2.mo72403a());
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51582uq uqVar = (C51582uq) eu32;
    }
}
