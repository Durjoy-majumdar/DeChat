package je1;

import android.content.Context;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import it1.C60628i;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50581nr0;
import te3.C50963qi0;
import te3.C51111ri0;
import vp1.C14927d;

/* renamed from: je1.w2 */
public final class C9384w2 extends C60628i {

    /* renamed from: g */
    public final String f29311g;

    /* renamed from: h */
    public final int f29312h;

    /* renamed from: i */
    public C47350c f29313i;

    /* renamed from: j */
    public C11385n f29314j;

    /* renamed from: n */
    public C50581nr0 f29315n;

    public C9384w2(String str, int i, int i2) {
        super((C49712hj1) null, 1, (C8480h) null);
        this.f29311g = str;
        this.f29312h = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3638;
        C50963qi0 qi02 = new C50963qi0();
        qi02.f140323e = str == null ? "" : str;
        qi02.f140324f = i;
        C49842ig0 a = C46523h2.f125330a.mo71859a(3638);
        qi02.f140322d = a;
        a.f135313e = i2;
        bVar.f127066a = qi02;
        C51111ri0 ri02 = new C51111ri0();
        ri02.setBaseResponse(new C49966ja());
        bVar.f127067b = ri02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercontacttagoption";
        this.f29313i = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderContactTag", "NetSceneFinderContactTag init " + str + " opType " + i + " scene " + i2 + ' ');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29314j = nVar;
        return dispatch(gVar, this.f29313i, this);
    }

    public int getType() {
        return 3638;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C75700k0.class;
        Log.m105924i("Finder.NetSceneFinderContactTag", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f29311g);
            if (this.f29312h == 1) {
                z1Var.setType(z1Var.getType() | TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            } else {
                z1Var.setType(z1Var.getType() & -33554433);
            }
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
            C14927d.C14929b bVar = C14927d.f40957e;
            bVar.mo13977a().mo13976a();
            bVar.mo13977a().getClass();
            C86709a0.m107524d().mo123460f(new C9370r3(1));
        } else if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            Context context = MMApplicationContext.getContext();
            C76912y0.makeText(context, (CharSequence) "is debug info findercontacttagoption: " + i2 + ' ' + i3, 1).show();
        }
        C11385n nVar = this.f29314j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
