package v53;

import b63.C113146l;
import com.tencent.p014mm.autogen.events.SaveBankLogoEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import ie3.C8883h;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51017qv1;
import te3.C51161rv1;

/* renamed from: v53.f */
public class C52767f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f147432d;

    /* renamed from: e */
    public C47350c f147433e;

    public C52767f(LinkedList<String> linkedList) {
        Log.m105924i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51017qv1();
        bVar.f127067b = new C51161rv1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/bankresource";
        bVar.f127069d = 1650;
        C47350c a = bVar.mo72403a();
        this.f147433e = a;
        a.setIsUserCmd(true);
        C51017qv1 qv12 = (C51017qv1) this.f147433e.f127055a.f127080a;
        qv12.f140569d = linkedList;
        qv12.f140570e = C113146l.m154805c();
        if (!C8883h.m8692c()) {
            qv12.f140571f = C8883h.f28150a;
        }
        C75228t.m90243e0(42, 1);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147432d = nVar;
        return dispatch(gVar, this.f147433e, this);
    }

    public int getType() {
        return 1650;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + i2 + "errCode=" + i3);
        if (i2 == 0 && i3 == 0) {
            C51161rv1 rv12 = (C51161rv1) ((C47350c) uVar).f127056b.f127083a;
            Log.m105925i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", rv12.f141164g);
            LinkedList<String> linkedList = rv12.f141161d;
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105918d("MicroMsg.NetSceneGetBankcardLogo", "empty bank logo list");
            } else {
                SaveBankLogoEvent saveBankLogoEvent = new SaveBankLogoEvent();
                saveBankLogoEvent.f78963d.f78965a = linkedList;
                saveBankLogoEvent.publish();
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC, Util.nullAs(rv12.f141164g, ""));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BANKCARD_DETAIL_URL_TIMESTAMP_LONG_SYNC, Long.valueOf(System.currentTimeMillis() / 1000));
        } else {
            C75228t.m90243e0(43, 1);
        }
        this.f147432d.onSceneEnd(i2, i3, str, this);
    }
}
