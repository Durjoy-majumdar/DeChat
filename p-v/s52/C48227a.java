package s52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import te3.C51514ua;
import te3.C51668va;
import te3.C51676vb3;

/* renamed from: s52.a */
public class C48227a extends C75128o0<C51668va> {

    /* renamed from: p */
    public List<C51676vb3> f129217p;

    public C48227a(LinkedList<C51676vb3> linkedList, int i, int i2) {
        C51514ua uaVar = new C51514ua();
        uaVar.f142691d = linkedList;
        uaVar.f142692e = i;
        uaVar.f142693f = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = uaVar;
        bVar.f127067b = new C51668va();
        bVar.f127069d = 2938;
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchfunctionoperate";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        this.f129217p = linkedList;
        Log.m105925i("MicroMsg.CgiBatchFunctionOperate", "TpaCountry: %s", Integer.valueOf(i));
    }
}
