package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101800k70;
import te3.C101840sa;
import te3.C51365ta;

/* renamed from: j61.h */
public class C98909h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f289944d;

    /* renamed from: e */
    public final C47350c f289945e;

    public C98909h(LinkedList<String> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C101840sa saVar = new C101840sa();
        saVar.f299393f = linkedList;
        saVar.f299392e = 1;
        bVar.f127066a = saVar;
        bVar.f127067b = new C51365ta();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        bVar.f127069d = 697;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f289945e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f289944d = nVar;
        return dispatch(gVar, this.f289945e, this);
    }

    public int getType() {
        return 697;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.emoji.NetSceneCheckEmoijExistByp", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            LinkedList<C101800k70> linkedList = ((C51365ta) this.f289945e.f127056b.f127083a).f142064g;
            if (linkedList == null || linkedList.size() <= 0) {
                Log.m105924i("MicroMsg.emoji.NetSceneCheckEmoijExistByp", "Change MD5 to URL failed.");
            }
            this.f289944d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f289944d.onSceneEnd(i2, i3, str, this);
    }
}
