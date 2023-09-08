package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import fk0.C86910b;
import i12.C76255b;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48992ce2;
import te3.C52176yv3;
import te3.C52314zv3;

/* renamed from: zg0.k */
public class C79329k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f232893d;

    /* renamed from: e */
    public C47350c f232894e;

    /* renamed from: f */
    public C52314zv3 f232895f;

    public C79329k(C76255b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C52176yv3();
        bVar2.f127067b = new C52314zv3();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
        bVar2.f127069d = C86910b.CTRL_INDEX;
        C47350c a = bVar2.mo72403a();
        this.f232894e = a;
        C52176yv3 yv32 = (C52176yv3) a.f127055a.f127080a;
        yv32.f145540f = 2;
        StringBuilder sb = new StringBuilder();
        sb.append("{\"user_uin\":" + C97625j3.m125812b().mo105881G() + " ,\"user_data_list\": [");
        if (bVar.f223379e.equals("0")) {
            sb.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + bVar.f223378d + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + bVar.f223379e + "\"},{\"key\": \"title\",\"value\": \"" + bVar.f223380f + "\"},{\"key\": \"tax_number\",\"value\": \"" + bVar.f223382h + "\"},{\"key\": \"bank_number\",\"value\": \"" + bVar.f223383i + "\"},{\"key\": \"phone\",\"value\": \"" + bVar.f223386o + "\"},{\"key\": \"company_address_detail\",\"value\": \"" + bVar.f223389r + "\"},{\"key\": \"bank_name\",\"value\": \"" + bVar.f223384j + "\"}]}}");
        } else {
            sb.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + bVar.f223378d + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + bVar.f223379e + "\"},{\"key\": \"title\",\"value\": \"" + bVar.f223381g + "\"},{\"key\": \"phone\",\"value\": \"" + bVar.f223387p + "\"},{\"key\": \"email\",\"value\": \"" + bVar.f223388q + "\"}]}}");
        }
        sb.append("]}");
        yv32.f145539e = sb.toString();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f232893d = nVar;
        return dispatch(gVar, this.f232894e, this);
    }

    public int getType() {
        return C86910b.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<C48992ce2> linkedList;
        Log.m105918d("MicroMsg.NetSceneSaveUserAutoFillInfo", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C52314zv3 zv32 = (C52314zv3) ((C47350c) uVar).f127056b.f127083a;
            this.f232895f = zv32;
            if (!(zv32 == null || (linkedList = zv32.f146243d) == null || linkedList.size() <= 0 || this.f232895f.f146243d.get(0) == null)) {
                Log.m105924i("MicroMsg.NetSceneSaveUserAutoFillInfo", "resp groupId is.." + this.f232895f.f146243d.get(0).f131678e);
            }
        }
        this.f232893d.onSceneEnd(i2, i3, str, this);
    }
}
