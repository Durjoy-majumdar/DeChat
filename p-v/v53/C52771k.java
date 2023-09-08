package v53;

import ae2.C39550b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48672a62;
import te3.C48815b62;

/* renamed from: v53.k */
public class C52771k extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f147443d;

    /* renamed from: e */
    public C11385n f147444e;

    /* renamed from: f */
    public String f147445f = "";

    /* renamed from: g */
    public String f147446g = "";

    /* renamed from: h */
    public boolean f147447h = false;

    public C52771k() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48672a62();
        bVar.f127067b = new C48815b62();
        bVar.f127068c = "/cgi-bin/mmpay-bin/getpayuserduty";
        bVar.f127069d = 2541;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f147443d = a;
        C48672a62 a622 = (C48672a62) a.f127055a.f127080a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147444e = nVar;
        C39550b.m42181a().mo62165pk(this.f147443d, false);
        return dispatch(gVar, this.f147443d, this);
    }

    public int getType() {
        return 2541;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MircoMsg.NetSceneGetPayUserDuty", "errType = " + i2 + ", errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C48815b62 b622 = (C48815b62) ((C47350c) uVar).f127056b.f127083a;
            String str2 = b622.f130983f;
            this.f147445f = str2;
            String str3 = b622.f130985h;
            this.f147446g = str3;
            boolean z = b622.f130984g;
            this.f147447h = z;
            Log.m105925i("MircoMsg.NetSceneGetPayUserDuty", "duty_info %s ,duty_info_darkmode %s need_agree_duty %s", str2, str3, Boolean.valueOf(z));
            this.f147444e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f147444e.onSceneEnd(i2, i3, str, this);
    }
}
