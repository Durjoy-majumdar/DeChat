package ly1;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C47350c;
import pe3.C47465a;
import ww1.C53214d;
import ww1.C53215e;

/* renamed from: ly1.u0 */
public final class C46912u0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C53214d f126137a;

    public C46912u0(C53214d dVar) {
        this.f126137a = dVar;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        if (i == 0 && i2 == 0 && cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.videougc.ReportLocalWxagVideoResponse");
            Log.m105924i("MicroMsg.MiniGameVideoProcessor", "gamelog.report , manage video , reportlocalwxagvideo reso RET = " + ((C53215e) aVar).f148448d);
            return;
        }
        Log.m105920e("MicroMsg.MiniGameVideoProcessor", "gamelog.report , manage video , reportlocalwxagvideo, doReportCgi failed errType = " + i + " errCode = " + i2 + " errMsg = " + str + "  op = " + this.f126137a.f148446d);
    }
}
