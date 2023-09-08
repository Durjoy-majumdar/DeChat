package zo0;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.C83515w2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import kr0.C76629w0;
import zo0.C91821m;

/* renamed from: zo0.l */
public class C91820l implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C91821m.C91822a f262922a;

    /* renamed from: b */
    public final /* synthetic */ C83515w2 f262923b;

    public C91820l(C91821m.C91822a aVar, C83515w2 w2Var) {
        this.f262922a = aVar;
        this.f262923b = w2Var;
    }

    /* renamed from: a */
    public void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes == null) {
            Log.m105924i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, get contact info fail");
            C91821m.m115337a(this.f262922a);
            return;
        }
        boolean a = wxaAttributes.mo113940m2().mo113970a();
        if ((!this.f262923b.mo115810n2("banJumpGame") || !a) && (!this.f262923b.mo115810n2("banJumpApp") || a)) {
            Log.m105924i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, no need to ban jump");
            C91821m.m115337a(this.f262922a);
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, return should ban jump");
        C91821m.C91822a aVar = this.f262922a;
        if (aVar != null) {
            C91812b bVar = (C91812b) aVar;
            Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "[banjump] should ban, from appid:%s, to username:%s", bVar.f262900a, bVar.f262901b);
            new MMHandler(Looper.getMainLooper()).post(new C91811a(bVar));
        }
    }
}
