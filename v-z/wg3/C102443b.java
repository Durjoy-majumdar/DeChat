package wg3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C101868xo3;
import te3.C52147yo3;

/* renamed from: wg3.b */
public final class C102443b extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f301692d;

    /* renamed from: e */
    public C11385n f301693e;

    public C102443b(SimilarEmojiQueryModel similarEmojiQueryModel) {
        C87412m.m108594g(similarEmojiQueryModel, "model");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101868xo3();
        bVar.f127067b = new C52147yo3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmrecommendpanelemoji";
        bVar.f127069d = 3793;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f301692d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecommendPanelEmojiRequest");
        ((C101868xo3) aVar).f299893d = similarEmojiQueryModel.f283911e;
        C47465a aVar2 = a.f127055a.f127080a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecommendPanelEmojiRequest");
        ((C101868xo3) aVar2).f299894e = similarEmojiQueryModel.f283912f;
        C47465a aVar3 = a.f127055a.f127080a;
        C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecommendPanelEmojiRequest");
        ((C101868xo3) aVar3).f299895f = String.valueOf(similarEmojiQueryModel.f283913g);
        C47465a aVar4 = a.f127055a.f127080a;
        C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecommendPanelEmojiRequest");
        ((C101868xo3) aVar4).f299896g = similarEmojiQueryModel.f283916j;
        C47465a aVar5 = a.f127055a.f127080a;
        C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RecommendPanelEmojiRequest");
        ((C101868xo3) aVar5).f299898i = similarEmojiQueryModel.f283914h;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f301693e = nVar;
        return dispatch(gVar, this.f301692d, this);
    }

    public int getType() {
        return 3793;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar = this.f301693e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
