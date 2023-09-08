package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C51947xa2;
import te3.C52093ya2;

/* renamed from: xm2.p */
public class C53385p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150215d;

    /* renamed from: e */
    public C47350c f150216e;

    public C53385p() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51947xa2();
        bVar.f127067b = new C52093ya2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
        bVar.f127069d = C40475h.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f150216e = a;
        C51947xa2 xa22 = (C51947xa2) a.f127055a.f127080a;
        xa22.f144564g = 2;
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("invoice_info.title");
        linkedList.add("invoice_info.tax_number");
        linkedList.add("invoice_info.bank_number");
        linkedList.add("invoice_info.bank_name");
        linkedList.add("invoice_info.type");
        linkedList.add("invoice_info.email");
        linkedList.add("invoice_info.company_address");
        linkedList.add("invoice_info.company_address_detail");
        linkedList.add("invoice_info.company_address_postcode");
        linkedList.add("invoice_info.phone");
        xa22.f144563f = linkedList;
        xa22.f144562e = false;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150215d = nVar;
        return dispatch(gVar, this.f150216e, this);
    }

    public int getType() {
        return C40475h.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we parse the json and resetList..");
            C52093ya2 ya22 = (C52093ya2) ((C47350c) uVar).f127056b.f127083a;
            if (ya22.f145212d != null) {
                try {
                    boolean z = new JSONObject(ya22.f145212d).getBoolean("has_invoice_info");
                    Log.m105924i("MicroMsg.NetSceneGetUserAutoFillInfo", "has_invoice_info is .." + z);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN, Boolean.valueOf(z));
                } catch (JSONException unused) {
                    Log.m105920e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
                }
            }
        }
        this.f150215d.onSceneEnd(i2, i3, str, this);
    }
}
