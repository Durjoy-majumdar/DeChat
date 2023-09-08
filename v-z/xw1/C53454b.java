package xw1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import vw1.C53023n;
import vw1.C53024o;

/* renamed from: xw1.b */
public final class C53454b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150355d;

    /* renamed from: e */
    public final C13601g f150356e = C36568h.m40986b(C13602i.NONE, new C53455a(this));

    /* renamed from: xw1.b$a */
    public static final class C53455a extends C87413o implements C32224a<C47350c> {

        /* renamed from: d */
        public final /* synthetic */ C53454b f150357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53455a(C53454b bVar) {
            super(0);
            this.f150357d = bVar;
        }

        public Object invoke() {
            C47350c.C47352b bVar = new C47350c.C47352b();
            C53454b bVar2 = this.f150357d;
            bVar.f127066a = new C53023n();
            bVar.f127067b = new C53024o();
            bVar.f127068c = "/cgi-bin/mmgame-bin/getrecommendvideolist";
            bVar2.getClass();
            bVar.f127069d = 9911;
            return bVar.mo72403a();
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150355d = nVar;
        Object value = this.f150356e.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        return dispatch(gVar, (C47350c) value, this);
    }

    public int getType() {
        return 9911;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiGetRecommendVideoList", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f150355d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
