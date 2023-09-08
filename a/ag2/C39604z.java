package ag2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: ag2.z */
public class C39604z extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106327d;

    /* renamed from: e */
    public C47350c f106328e;

    /* renamed from: f */
    public final boolean f106329f;

    /* renamed from: g */
    public String f106330g = "";

    public C39604z(boolean z, String str) {
        this.f106329f = z;
        this.f106330g = Util.nullAsNil(str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C39587j0();
        bVar.f127067b = new C39589k0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/switchpushmail";
        bVar.f127069d = 129;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106328e = a;
        C39587j0 j0Var = (C39587j0) a.f127055a.f127080a;
        j0Var.f106265d = this.f106329f ? 1 : 2;
        j0Var.f106266e = this.f106330g;
        this.f106327d = nVar;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 129;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C86709a0.m107535s().mo121142i().mo119676J(17, Integer.valueOf(((C39589k0) this.f106328e.f127056b.f127083a).f106270d));
        }
        updateDispatchId(i);
        this.f106327d.onSceneEnd(i2, i3, str, this);
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
