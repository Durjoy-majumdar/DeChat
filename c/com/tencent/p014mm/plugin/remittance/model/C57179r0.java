package com.tencent.p014mm.plugin.remittance.model;

import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64715sr;
import te3.C64737tr;

/* renamed from: com.tencent.mm.plugin.remittance.model.r0 */
public class C57179r0 extends C75113f0 {

    /* renamed from: r */
    public C64737tr f163881r;

    /* renamed from: s */
    public double f163882s = 0.0d;

    public C57179r0(String str, String str2, double d, String str3, String str4, String str5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64715sr();
        bVar.f127067b = new C64737tr();
        bVar.f127069d = NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE;
        bVar.f127068c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_placeorder";
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f221041n = a;
        C64715sr srVar = (C64715sr) a.f127055a.f127080a;
        srVar.f185442d = str;
        srVar.f185443e = str2;
        this.f163882s = d;
        srVar.f185444f = Math.round(d * 100.0d);
        srVar.f185445g = str3;
        if (!Util.isNullOrNil(str4) && !Util.isNullOrNil(str5)) {
            int i2 = 0;
            loop0:
            while (true) {
                if (i2 >= str4.length()) {
                    break;
                }
                for (int i3 = 0; i3 < str5.length(); i3++) {
                    if (str4.charAt(i2) == str5.charAt(i3)) {
                        Log.m105925i("MicroMsg.NetSceneUnionTransferPlaceOrder", "find equal char: %s, %s, %s", Character.valueOf(str4.charAt(i2)), Integer.valueOf(i2), Integer.valueOf(i3));
                        i = 1;
                        break loop0;
                    }
                }
                i2++;
            }
        }
        srVar.f185447i = i;
        srVar.f185446h = str4;
        if (C72996z1.m85843n5(str)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            srVar.f185448j = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        }
        srVar.f185449n = C75228t.m90268r(str);
    }

    public int getType() {
        return NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUnionTransferPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C64737tr trVar = (C64737tr) ((C47350c) uVar).f127056b.f127083a;
        this.f163881r = trVar;
        C64737tr trVar2 = this.f163881r;
        Log.m105925i("MicroMsg.NetSceneUnionTransferPlaceOrder", "ret_code: %s, ret_msg: %s prepay_id:%s", Integer.valueOf(trVar.f185663d), trVar2.f185664e, trVar2.f185669j);
        C11385n nVar = this.f221042o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C64737tr trVar = (C64737tr) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = trVar.f185663d;
        this.f221038h = trVar.f185664e;
    }
}
