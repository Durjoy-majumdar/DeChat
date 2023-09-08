package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51250si2;
import te3.C51402ti2;
import te3.C51552ui2;

/* renamed from: hg0.q0 */
public class C46060q0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124187d;

    /* renamed from: e */
    public C11385n f124188e;

    /* renamed from: f */
    public LinkedList<C51250si2> f124189f = new LinkedList<>();

    /* renamed from: g */
    public String f124190g;

    public C46060q0(ArrayList<String> arrayList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51402ti2();
        bVar.f127067b = new C51552ui2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/invitegooglecontact";
        bVar.f127069d = 489;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f124187d = bVar.mo72403a();
        if (arrayList != null && arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C51250si2 si22 = new C51250si2();
                si22.f141539d = arrayList.get(i);
                this.f124189f.add(si22);
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
        this.f124188e = nVar;
        C51402ti2 ti22 = (C51402ti2) this.f124187d.f127055a.f127080a;
        ti22.f142240d = this.f124189f.size();
        ti22.f142241e = this.f124189f;
        return dispatch(gVar, this.f124187d, this);
    }

    public int getType() {
        return 489;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f124188e.onSceneEnd(i2, i3, str, this);
        } else {
            this.f124188e.onSceneEnd(i2, i3, str, this);
        }
    }
}
