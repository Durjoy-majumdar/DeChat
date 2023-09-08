package g13;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49117da2;
import te3.C49256ea2;
import te3.ak4;
import te3.zj4;

/* renamed from: g13.c */
public class C45875c extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f123829d;

    /* renamed from: e */
    public C11385n f123830e = null;

    /* renamed from: f */
    public LinkedList<ak4> f123831f;

    public C45875c(LinkedList<zj4> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49117da2();
        bVar.f127067b = new C49256ea2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/gettranstext";
        bVar.f127069d = 631;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123829d = a;
        C49117da2 da22 = (C49117da2) a.f127055a.f127080a;
        da22.f132209e = linkedList;
        da22.f132208d = linkedList.size();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123830e = nVar;
        return dispatch(gVar, this.f123829d, this);
    }

    public int getType() {
        return 631;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47350c cVar = this.f123829d;
        C49117da2 da22 = (C49117da2) cVar.f127055a.f127080a;
        this.f123831f = ((C49256ea2) cVar.f127056b.f127083a).f132827e;
        this.f123830e.onSceneEnd(i2, i3, str, this);
    }
}
