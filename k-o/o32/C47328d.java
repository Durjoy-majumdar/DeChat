package o32;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import pe3.C89349b;
import te3.C52287zn3;

/* renamed from: o32.d */
public class C47328d implements C87581a<Void, C89132b.C89134c<C52287zn3>> {

    /* renamed from: a */
    public final /* synthetic */ C76990f f127012a;

    public C47328d(C76990f fVar) {
        this.f127012a = fVar;
    }

    public Object call(Object obj) {
        C89349b bVar;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed, wxahb_status = [%d],receive_status = [%d],sendId = [%s]", Integer.valueOf(((C52287zn3) cVar.f256796d).f146130d), Integer.valueOf(((C52287zn3) cVar.f256796d).f146136j), this.f127012a.f224980c);
            C52287zn3 zn32 = (C52287zn3) cVar.f256796d;
            if (!(zn32.f146130d == 1 || (bVar = zn32.f146134h) == null)) {
                this.f127012a.f224981d = bVar.mo123703f();
            }
            C76990f fVar = this.f127012a;
            C52287zn3 zn33 = (C52287zn3) cVar.f256796d;
            int i2 = zn33.f146130d;
            fVar.f224984g = i2;
            C47327b bVar2 = fVar.f224978a;
            if (bVar2 == null) {
                Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed but ui == null");
                return null;
            }
            int i3 = zn33.f146137n;
            if ((i3 == 1 && zn33.f146138o == 0) || zn33.f146136j == 2) {
                Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onLuckyMoneyReceived shouldSkipToDetailUI");
                fVar.mo107310b();
                return null;
            } else if (i2 == 1) {
                bVar2.mo72380r6(zn33.f146132f, zn33.f146133g, 1, i2, zn33.f146140q, i3 == 1, zn33.f146138o == 1);
                return null;
            } else if (i2 == 0) {
                bVar2.mo72379Y2(zn33.f146132f, zn33.f146133g, zn33.f146139p, zn33.f146131e, i3 == 1, zn33.f146138o == 1);
                return null;
            } else {
                Log.m105925i("MicroMsg.WxaReceiveLuckyMoneyLogic", "back.resp.wxahb_status is invalid.resp. wxahb_status = [%d] receive_status = [%d] hb_type = [%d]", Integer.valueOf(i2), Integer.valueOf(zn33.f146136j), Integer.valueOf(zn33.f146138o));
                return null;
            }
        } else {
            Log.m105921e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB failed [%d, %d, %s]", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            C76990f fVar2 = this.f127012a;
            Intent putExtra = new Intent().putExtra("result_error_code", -1);
            fVar2.mo107309a(putExtra.putExtra("result_error_msg", "fail:system error {{service error Receive errType = " + cVar.f256793a + ",errCode" + cVar.f256794b + "}}"));
            return null;
        }
    }
}
