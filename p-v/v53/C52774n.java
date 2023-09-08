package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49338ev1;
import te3.C49477fv1;

/* renamed from: v53.n */
public class C52774n extends C117747y implements C1311n {

    /* renamed from: d */
    public C49477fv1 f147455d;

    /* renamed from: e */
    public C47350c f147456e;

    /* renamed from: f */
    public C11385n f147457f;

    /* renamed from: g */
    public long f147458g;

    public C52774n(String str, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49338ev1();
        bVar.f127067b = new C49477fv1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/mktgetaward";
        bVar.f127069d = 2948;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f147456e = a;
        ((C49338ev1) a.f127055a.f127080a).f133133d = str;
        this.f147458g = j;
        Log.m105925i("MicroMsg.NetSceneMktGetAward", "NetSceneMktGetAward, get_award_params: %s, activityId: %s", str, Long.valueOf(j));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147457f = nVar;
        return dispatch(gVar, this.f147456e, this);
    }

    public int getType() {
        return 2948;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMktGetAward", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49477fv1 fv12 = (C49477fv1) ((C47350c) uVar).f127056b.f127083a;
        this.f147455d = fv12;
        if (i2 == 0 || i3 == 0) {
            C49477fv1 fv13 = this.f147455d;
            C49477fv1 fv14 = this.f147455d;
            Log.m105925i("MicroMsg.NetSceneMktGetAward", "ret_code: %s, ret_msg: %s, result_code: %s, alert_wording: %s, btn_wording: %s", Integer.valueOf(fv12.f133706d), fv13.f133707e, Integer.valueOf(fv13.f133708f), fv14.f133709g, fv14.f133710h);
        }
        C11385n nVar = this.f147457f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
