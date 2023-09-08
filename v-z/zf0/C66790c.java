package zf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C64219a0;
import te3.C64248b0;

/* renamed from: zf0.c */
public class C66790c extends C75128o0<C64248b0> {
    public C66790c(int i, int i2, int i3, String str, int i4, int i5, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64219a0 a0Var = new C64219a0();
        a0Var.f182003d = i;
        a0Var.f182004e = i2;
        a0Var.f182005f = i3;
        a0Var.f182006g = str;
        a0Var.f182007h = i4;
        a0Var.f182008i = i5;
        a0Var.f182009j = str2;
        bVar.f127066a = a0Var;
        bVar.f127067b = new C64248b0();
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaquerylist";
        bVar.f127069d = 1676;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s, bill_id: %s, trans_id: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2);
    }

    public C66790c(int i, int i2, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64219a0 a0Var = new C64219a0();
        a0Var.f182003d = i;
        a0Var.f182004e = i2;
        a0Var.f182005f = i3;
        bVar.f127066a = a0Var;
        bVar.f127067b = new C64248b0();
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaquerylist";
        bVar.f127069d = 1676;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
