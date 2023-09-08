package a42;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C51069r72;
import te3.C51206s72;

/* renamed from: a42.a */
public class C39486a extends C75128o0<C51206s72> {

    /* renamed from: p */
    public String f106032p;

    public C39486a(String str, boolean z, String str2) {
        C51069r72 r722 = new C51069r72();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = r722;
        bVar.f127067b = new C51206s72();
        bVar.f127069d = 3634;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getredpacketstory";
        r722.f140745d = str;
        r722.f140746e = str2;
        if (!z) {
            bVar.f127074i = 5000;
        }
        C47350c a = bVar.mo72403a();
        a.setIsUserCmd(z);
        mo123453j(a);
        this.f106032p = str;
        Log.m105925i("MicroMsg.CgiRedPacketStoryInfo", "packet id: %s", str);
    }
}
