package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: bx1.n */
public class C0390n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f993d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f993d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 4596;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiKickOutChatroomMember", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f993d.onSceneEnd(i2, i3, str, this);
    }
}
