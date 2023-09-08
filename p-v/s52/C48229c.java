package s52;

import b63.C113146l;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import java.util.LinkedList;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49966ja;
import te3.C51126rl3;
import te3.C51163rv3;
import te3.C51264sl3;
import te3.C77963l1;
import te3.iy4;
import te3.vy4;
import vt1.C78473a;

/* renamed from: s52.c */
public class C48229c extends C75128o0<C51264sl3> {
    public C48229c(long j, C51264sl3 sl32) {
        C51126rl3 rl32 = new C51126rl3();
        rl32.f141013e = (int) j;
        rl32.f141014f = C89349b.m111675b("all_type");
        C77963l1 c = C113146l.m154805c();
        if (c != null) {
            if (!Util.isNullOrNil(c.f227791d)) {
                rl32.f141015g = C89349b.m111675b(c.f227791d);
            }
            if (!Util.isNullOrNil(c.f227792e)) {
                rl32.f141016h = C89349b.m111675b(c.f227792e);
            }
        }
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (aVar == null || !aVar.isRoot()) {
            rl32.f141018j = 0;
        } else {
            rl32.f141018j = 1;
        }
        if (aVar != null) {
            rl32.f141017i = 1;
        } else {
            rl32.f141017i = 0;
        }
        rl32.f141019n = 1;
        rl32.f141020o = System.currentTimeMillis();
        if (sl32.BaseResponse == null) {
            C49966ja jaVar = new C49966ja();
            sl32.BaseResponse = jaVar;
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = "";
            rv32.f141176e = true;
            jaVar.f135956e = rv32;
            sl32.BaseResponse.f135955d = 0;
        }
        rl32.f141021p = sl32;
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (C72688j0.m85020f(MMApplicationContext.getContext(), "cn.gov.pbc.dcep")) {
            linkedList.add(1);
        }
        rl32.f141023r = linkedList;
        Log.m105924i("MicroMsg.CgiQueryWeChatWallet", "get cached location info");
        vy4 vy4 = new vy4();
        if (C72688j0.m85020f(MMApplicationContext.getContext(), "cn.gov.pbc.dcep") || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_dcep_address_logic_revert, false)) {
            iy4 iy4 = new iy4();
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.CgiQueryWeChatWallet", "no location cache data");
            } else {
                try {
                    iy4.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.CgiQueryWeChatWallet", "parse cacheString exp, " + e.getLocalizedMessage());
                }
                vy4.f143777d = iy4.f135760f;
                vy4.f143778e = iy4.f135761g;
                vy4.f143779f = iy4.f135762h;
            }
            ((C76324c) C86312j.m106911c(C76324c.class)).updateLocationCacheIfNeed(iy4.f135758d, iy4.f135759e);
        } else {
            Log.m105924i("MicroMsg.CgiQueryWeChatWallet", "dcep app is not install, ignore get address data");
        }
        rl32.f141022q = vy4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = rl32;
        bVar.f127067b = new C51264sl3();
        bVar.f127069d = 2672;
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/querywechatwallet";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiQueryWeChatWallet", "balanceVersion: %s, isRoot: %s, openTouch: %s", Long.valueOf(j), Integer.valueOf(rl32.f141018j), Integer.valueOf(rl32.f141017i));
    }
}
