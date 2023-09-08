package kl2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import hl2.C8596a;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C51237sg;
import te3.C51391tg;

/* renamed from: kl2.k */
public final class C46732k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125810d;

    /* renamed from: e */
    public final C47350c f125811e;

    /* renamed from: f */
    public long f125812f;

    public C46732k(byte[] bArr, long j, int i, int i2, C8596a.C8598b bVar, C8596a.C8597a aVar, ArrayList arrayList, int i3, C8480h hVar) {
        Integer num = null;
        bArr = (i3 & 1) != 0 ? null : bArr;
        bVar = (i3 & 16) != 0 ? null : bVar;
        arrayList = (i3 & 64) != 0 ? null : arrayList;
        this.f125812f = j;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C51237sg();
        bVar2.f127067b = new C51391tg();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/imgretrieval/ocr_chat_image";
        bVar2.f127069d = 5131;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f125811e = a;
        C47465a aVar2 = a.f127055a.f127080a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizOcrChatImageRequest");
        C51237sg sgVar = (C51237sg) aVar2;
        sgVar.f141488p = j;
        sgVar.f141480e = i;
        sgVar.f141489q = i2;
        if (bArr != null) {
            sgVar.f141479d = C89349b.m111674a(bArr);
        }
        if (bVar != null) {
            Log.m105925i("MicroMsg.NetSceneBizImageOCR", "alvinluo NetSceneBizImageOCR decodeResult: %s, %s", Integer.valueOf(bVar.f27691a), Integer.valueOf(bVar.f27692b));
            sgVar.f141485j = bVar.f27691a;
            sgVar.f141486n = bVar.f27692b;
        }
        if (arrayList != null) {
            sgVar.f141487o.addAll(arrayList);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("alvinluo NetSceneBizImageOCR imageSize: ");
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : num);
        sb.append(", sessionId: ");
        sb.append(j);
        sb.append(", source: ");
        sb.append(i);
        sb.append(", seqNum: ");
        sb.append(i2);
        sb.append(", cdn_image_list: ");
        sb.append(sgVar.f141487o);
        Log.m105924i("MicroMsg.NetSceneBizImageOCR", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125810d = nVar;
        return dispatch(gVar, this.f125811e, this);
    }

    public int getType() {
        return 5131;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBizImageOCR", "alvinluo onGYNetEnd errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f125810d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
