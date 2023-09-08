package qg2;

import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p763ym.C53543s;

public final /* synthetic */ class p$$c implements C55384i {

    /* renamed from: a */
    public final /* synthetic */ C77335p f225489a;

    /* renamed from: b */
    public final /* synthetic */ p$$e f225490b;

    public /* synthetic */ p$$c(C77335p pVar, p$$e p__e) {
        this.f225489a = pVar;
        this.f225490b = p__e;
    }

    /* renamed from: a */
    public final void mo11363a(C92798v vVar) {
        C77335p pVar = this.f225489a;
        p$$e p__e = this.f225490b;
        pVar.getClass();
        Class cls = C53543s.class;
        if (vVar.f267130a == C92798v.C92799a.OnDownloadCancel) {
            Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "onTask cancel mediaId:%s", pVar.f225471o);
            C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(pVar.f225469j);
            pVar.f225466g = Yt;
            if (Yt == null) {
                Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "pause get by msgid  %s null then get by mediaId %s", Long.valueOf(pVar.f225469j), pVar.f225468i);
                pVar.f225466g = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100154qq(pVar.f225468i);
            }
            C72683d dVar = pVar.f225466g;
            if (dVar != null) {
                dVar.field_status = 102;
                if (!pVar.f225476t) {
                    Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "pause done %s", Boolean.valueOf(((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(pVar.f225466g, new String[0])));
                }
                if (p__e != null) {
                    p__e.mo26085D0(pVar);
                }
                pVar.f225482z = null;
            }
        }
    }
}
