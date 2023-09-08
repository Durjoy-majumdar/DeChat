package kh2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C110975wt2;
import te3.C48764au2;
import te3.C52305zt2;

/* renamed from: kh2.a */
public final class C10093a extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f30887d;

    /* renamed from: e */
    public C11385n f30888e;

    public C10093a(long j, List<? extends C110975wt2> list) {
        C87412m.m108594g(list, "feedbackList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52305zt2();
        bVar.f127067b = new C48764au2();
        bVar.f127068c = "/cgi-bin/spr-bin/mmsprreportrecommendedmusicfeedback";
        bVar.f127069d = 3822;
        C47350c a = bVar.mo72403a();
        this.f30887d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMSPRReportRecommendedMusicFeedbackRequest");
        C52305zt2 zt22 = (C52305zt2) aVar;
        zt22.f146219d = j;
        zt22.f146220e.addAll(list);
        Log.m105924i("MicroMsg.NetSceneStoryAudioReport", "LogStory: report music " + j + ' ' + list.size());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f30888e = nVar;
        return dispatch(gVar, this.f30887d, this);
    }

    public int getType() {
        return 3822;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneStoryAudioReport", "onGYNetEnd " + i + ", " + i2 + ", " + i3 + ", " + str);
        C11385n nVar = this.f30888e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
