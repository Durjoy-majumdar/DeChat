package o32;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.C64320dn3;
import te3.C64725t83;
import yq3.C79148e;

/* renamed from: o32.e */
public class C76989e implements C87581a<Void, C89132b.C89134c<C64725t83>> {

    /* renamed from: a */
    public final /* synthetic */ C76990f f224977a;

    public C76989e(C76990f fVar) {
        this.f224977a = fVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB success");
            C64725t83 t832 = (C64725t83) cVar.f256796d;
            int i2 = t832.f185514d;
            if (i2 != 0) {
                Log.m105921e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB error wxahb_status = [%d] errorwording = [%s]", Integer.valueOf(i2), ((C64725t83) cVar.f256796d).f185533z);
                C76990f fVar = this.f224977a;
                int i3 = ((C64725t83) cVar.f256796d).f185514d;
                fVar.getClass();
                if (i3 == 1) {
                    fVar.mo107309a(new Intent().putExtra("result_error_code", 20001).putExtra("result_error_msg", "fail:the red packet is expired"));
                } else if (i3 == 2) {
                    fVar.mo107309a(new Intent().putExtra("result_error_code", 20002).putExtra("result_error_msg", "fail:the red packet has been received completly"));
                } else if (i3 != 3) {
                    Intent putExtra = new Intent().putExtra("result_error_code", -1);
                    fVar.mo107309a(putExtra.putExtra("result_error_msg", "fail:system error {{unknow open retun errCode:" + i3 + "}"));
                } else {
                    fVar.mo107309a(new Intent().putExtra("result_error_code", 20003).putExtra("result_error_msg", "fail:risk control"));
                }
            } else {
                C76990f fVar2 = this.f224977a;
                C47327b bVar = fVar2.f224978a;
                if (bVar == null) {
                    Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.CgiOpenWxaHB end. ui == null");
                } else {
                    fVar2.f224982e = t832;
                    bVar.mo72378V2();
                    if (fVar2.f224982e.f185532y != null) {
                        RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                        fVar2.f224983f = realnameGuideHelper;
                        String valueOf = String.valueOf(fVar2.f224982e.f185532y.f182785d);
                        C64320dn3 dn32 = fVar2.f224982e.f185532y;
                        realnameGuideHelper.mo99373d(valueOf, dn32.f182786e, dn32.f182787f, dn32.f182788g, dn32.f182789h, 1003);
                        RealnameGuideHelper realnameGuideHelper2 = fVar2.f224983f;
                        Bundle bundle = new Bundle();
                        bundle.putString("realname_verify_process_jump_activity", ".appbrand.ui.receive.WxaLuckyMoneyReceiveUI");
                        bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                        if (!realnameGuideHelper2.mo99370a(fVar2.f224978a.mo95266t(), bundle, new C47329g(fVar2), (C79148e.C79149a) null)) {
                            fVar2.mo107309a(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{launch realname fail}}"));
                        }
                    } else {
                        fVar2.mo107310b();
                    }
                }
            }
        } else {
            Log.m105921e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB failed [%d, %d, %s]", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            C76990f fVar3 = this.f224977a;
            Intent putExtra2 = new Intent().putExtra("result_error_code", -1);
            fVar3.mo107309a(putExtra2.putExtra("result_error_msg", "fail:system error {{service error open errType = " + cVar.f256793a + ",errCode" + cVar.f256794b + "}}"));
        }
        return null;
    }
}
