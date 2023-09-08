package dw2;

import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import ew2.C97757a;
import gy3.C87412m;
import jw2.C99069d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.ob4;
import te3.qb4;
import te3.rb4;

/* renamed from: dw2.b */
public final class C58447b extends C117747y implements C1311n {

    /* renamed from: d */
    public ob4 f167429d;

    /* renamed from: e */
    public final C97757a f167430e;

    /* renamed from: f */
    public final C47350c f167431f;

    /* renamed from: g */
    public C11385n f167432g;

    public C58447b(String str, ob4 ob4, String str2, C97757a aVar) {
        C87412m.m108594g(str, ClientInfoTable.Columns.CLIENTID);
        C87412m.m108594g(ob4, "commentDetail");
        this.f167429d = ob4;
        this.f167430e = aVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new qb4();
        bVar.f127067b = new rb4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmstorycomment";
        bVar.f127069d = C82855e.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f167431f = a;
        C47465a aVar2 = a.f127055a.f127080a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentRequest");
        qb4 qb4 = (qb4) aVar2;
        qb4.f184988d = str;
        qb4.f184989e = this.f167429d;
        C99069d dVar = C99069d.f290418a;
        StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
        qb4.f184991g = (int) storyPreviewReportStruct.f266265e;
        qb4.f184992h = (int) storyPreviewReportStruct.f266266f;
        qb4.f184993i = str2;
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryComment", "ClientId " + qb4.f184988d + " PreviewEnterScene " + qb4.f184991g + " sessionID: " + qb4.f184993i + ' ');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f167432g = nVar;
        return dispatch(gVar, this.f167431f, this);
    }

    public int getType() {
        return C82855e.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryComment", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str2);
        boolean z = false;
        if (i4 == 0 && i5 == 0) {
            String str3 = this.f167429d.f299020j;
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (z) {
                C115669n.INSTANCE.mo175913w(994, 6, 1);
            } else {
                C115669n.INSTANCE.mo175913w(994, 5, 1);
            }
        } else {
            String str4 = this.f167429d.f299020j;
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (z) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(994, 8, 1);
                if (i4 == 4) {
                    nVar.mo175913w(994, 10, 1);
                }
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175913w(994, 7, 1);
                if (i4 == 4) {
                    nVar2.mo175913w(994, 9, 1);
                }
            }
        }
        C11385n nVar3 = this.f167432g;
        if (nVar3 != null) {
            nVar3.onSceneEnd(i4, i5, str2, this);
        } else {
            C87412m.m108603p("callback");
            throw null;
        }
    }
}
