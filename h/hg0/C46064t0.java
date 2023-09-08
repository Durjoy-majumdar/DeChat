package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48645a04;
import te3.C52332zz3;

/* renamed from: hg0.t0 */
public class C46064t0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f124203d;

    /* renamed from: e */
    public final C47350c f124204e;

    public C46064t0(int[] iArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52332zz3();
        bVar.f127067b = new C48645a04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendinviteemail";
        bVar.f127069d = 116;
        bVar.f127070e = 41;
        bVar.f127071f = 1000000041;
        this.f124204e = bVar.mo72403a();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int valueOf : iArr) {
            linkedList.add(Integer.valueOf(valueOf));
        }
        C47465a aVar = this.f124204e.f127055a.f127080a;
        ((C52332zz3) aVar).f146296e = linkedList;
        ((C52332zz3) aVar).f146295d = linkedList.size();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124203d = nVar;
        return dispatch(gVar, this.f124204e, this);
    }

    public int getType() {
        return 116;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f124203d.onSceneEnd(i2, i3, str, this);
    }
}
