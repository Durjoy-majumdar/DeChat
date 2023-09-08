package zb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p008bq.C39832j1;
import sj0.C90210f;
import te3.C49162dl2;
import te3.C49301el2;

/* renamed from: zb0.g */
public class C53768g extends C117747y implements C1311n, C39832j1 {

    /* renamed from: d */
    public C11385n f150917d;

    /* renamed from: e */
    public final C47350c f150918e;

    /* renamed from: f */
    public Object f150919f;

    public C53768g(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49162dl2();
        bVar.f127067b = new C49301el2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/jumpemotiondetail";
        bVar.f127069d = C90210f.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150918e = a;
        ((C49162dl2) a.f127055a.f127080a).f132400d = str;
    }

    /* renamed from: B */
    public C49301el2 mo62461B() {
        return (C49301el2) this.f150918e.f127056b.f127083a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150917d = nVar;
        return dispatch(gVar, this.f150918e, this);
    }

    public Object getTag() {
        return this.f150919f;
    }

    public int getType() {
        return C90210f.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:net end ok");
        }
        this.f150917d.onSceneEnd(i2, i3, str, this);
    }

    public void setTag(Object obj) {
        this.f150919f = obj;
    }
}
