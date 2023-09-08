package uw2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50224l63;
import te3.C50362m63;
import te3.ot4;

/* renamed from: uw2.b */
public class C52630b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146950d;

    /* renamed from: e */
    public C47350c f146951e;

    public C52630b(int i, LinkedList<ot4> linkedList, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50224l63();
        bVar.f127067b = new C50362m63();
        bVar.f127068c = "/cgi-bin/micromsg-bin/opvoicereminder";
        bVar.f127069d = 331;
        bVar.f127070e = 150;
        bVar.f127071f = 1000000150;
        C47350c a = bVar.mo72403a();
        this.f146951e = a;
        C50224l63 l632 = (C50224l63) a.f127055a.f127080a;
        l632.f137229d = i;
        l632.f137231f = linkedList;
        l632.f137230e = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146950d = nVar;
        return dispatch(gVar, this.f146951e, this);
    }

    public int getType() {
        return 331;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f146950d.onSceneEnd(i2, i3, str, this);
    }
}
