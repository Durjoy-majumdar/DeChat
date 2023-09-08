package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48733al3;
import te3.C48875bl3;

/* renamed from: v53.q */
public class C52777q extends C117747y implements C1311n {

    /* renamed from: d */
    public C48875bl3 f147467d;

    /* renamed from: e */
    public C47350c f147468e;

    /* renamed from: f */
    public C11385n f147469f;

    /* renamed from: g */
    public String f147470g;

    public C52777q(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48733al3();
        bVar.f127067b = new C48875bl3();
        bVar.f127069d = 2710;
        bVar.f127068c = "/cgi-bin/mmpay-bin/mktqueryawardstatus";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f147468e = a;
        ((C48733al3) a.f127055a.f127080a).f130620d = str;
        this.f147470g = str2;
        Log.m105925i("MicroMsg.NetSceneMtkQueryAwardStatus", "NetSceneMtkQueryAwardStatus, query_award_status_params: %s, activityId: %s", str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147469f = nVar;
        return dispatch(gVar, this.f147468e, this);
    }

    public int getType() {
        return 2710;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMtkQueryAwardStatus", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C48875bl3 bl32 = (C48875bl3) ((C47350c) uVar).f127056b.f127083a;
        this.f147467d = bl32;
        if (i2 == 0 || i3 == 0) {
            Log.m105925i("MicroMsg.NetSceneMtkQueryAwardStatus", "ret_code: %s, ret_msg: %s", Integer.valueOf(bl32.f131186d), this.f147467d.f131187e);
        }
        C11385n nVar = this.f147469f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
