package zx1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C47350c;
import ox1.C47403a;
import pe3.C89349b;
import uw1.C52623a;
import uw1.C52624b;

/* renamed from: zx1.a */
public final class C53843a extends C47403a<C52624b> {
    public C53843a(Bundle bundle) {
        C87412m.m108594g(bundle, "atInfo");
        C52623a aVar = new C52623a();
        C52624b bVar = new C52624b();
        aVar.f146930e = new C89349b(bundle.getByteArray("context"));
        aVar.f146929d = bundle.getString("contentId");
        aVar.f146931f = bundle.getInt("limit", 50);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = aVar;
        bVar2.f127067b = bVar;
        bVar2.f127069d = 4712;
        bVar2.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getreminduserlist";
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        mo123453j(bVar2.mo72403a());
        Log.m105925i("MicroMsg.CgiGetAtSomeoneList", "RemindUserList。content_id: %s", aVar.f146929d);
    }
}
