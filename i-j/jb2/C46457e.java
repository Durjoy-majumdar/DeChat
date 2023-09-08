package jb2;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import ue3.C52549b;
import ue3.C52550c;
import ue3.C52551d;

/* renamed from: jb2.e */
public final class C46457e extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f125144d;

    /* renamed from: e */
    public C11385n f125145e;

    /* renamed from: f */
    public final C47350c f125146f;

    /* renamed from: g */
    public final C52550c f125147g;

    public C46457e(LinkedList<String> linkedList, int i, String str, String str2) {
        C87412m.m108594g(linkedList, "listenIds");
        C87412m.m108594g(str2, "cacheKey");
        this.f125144d = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5950;
        bVar.f127068c = "/cgi-bin/mmlistenappsvr/listengetlyric";
        bVar.f127066a = new C52550c();
        bVar.f127067b = new C52551d();
        C47350c a = bVar.mo72403a();
        this.f125146f = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricRequest");
        this.f125147g = (C52550c) aVar;
        LinkedList<C52549b> linkedList2 = new LinkedList<>();
        for (String str3 : linkedList) {
            C52549b bVar2 = new C52549b();
            bVar2.f146767h = true;
            bVar2.f146763d = str3;
            bVar2.f146768i = TextUtils.isEmpty(str);
            linkedList2.add(bVar2);
        }
        C52550c cVar = this.f125147g;
        cVar.f146769d = linkedList2;
        cVar.f146770e = i;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append("listen_ids:" + linkedList);
        Log.m105925i("MicroMsg.Mv.NetSceneMMListenGetLyric", "request music info:%s, mid:" + str, stringBuffer.substring(0, stringBuffer.length() - 1) + ']');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125145e = nVar;
        return dispatch(gVar, this.f125146f, this);
    }

    public int getType() {
        return 5950;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Mv.NetSceneMMListenGetLyric", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125146f.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricResponse");
            C52551d dVar = (C52551d) aVar;
            C11385n nVar = this.f125145e;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125145e;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
