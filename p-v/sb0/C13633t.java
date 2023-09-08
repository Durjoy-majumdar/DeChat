package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49289ei2;
import te3.C49427fi2;

/* renamed from: sb0.t */
public class C13633t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f38629d;

    /* renamed from: e */
    public C47350c f38630e;

    /* renamed from: f */
    public String f38631f;

    /* renamed from: g */
    public Object f38632g;

    public C13633t(String str, String str2, LinkedList<String> linkedList, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49289ei2();
        bVar.f127067b = new C49427fi2();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/initiatebizchat";
        bVar.f127069d = 1389;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f38630e = a;
        C49289ei2 ei22 = (C49289ei2) a.f127055a.f127080a;
        ei22.f132939d = str;
        ei22.f132940e = str2 == null ? "" : str2;
        ei22.f132941f = linkedList;
        this.f38632g = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f38629d = nVar;
        Log.m105924i("MicroMsg.NetSceneInitiateBizChat", "do scene");
        return dispatch(gVar, this.f38630e, this);
    }

    public int getType() {
        return 1389;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneInitiateBizChat", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f38629d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
