package hz0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51307sw1;
import te3.C51456tw1;
import wz0.C22945n;

/* renamed from: hz0.x */
public class C33164x extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f90023d;

    /* renamed from: e */
    public C11385n f90024e;

    public C33164x() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51307sw1();
        bVar.f127067b = new C51456tw1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcardcount";
        bVar.f127069d = 1088;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90023d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90024e = nVar;
        return dispatch(gVar, this.f90023d, this);
    }

    public int getType() {
        return 1088;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C51456tw1 tw12 = (C51456tw1) this.f90023d.f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + tw12.f142449e + " has_share_card:" + tw12.f142450f);
            if (tw12.f142449e > 0) {
                C22945n.m26997J();
                if (TextUtils.isEmpty((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, (Object) null))) {
                    C46153l0.vx0().mo58722a(1);
                }
            }
            if (tw12.f142450f > 0) {
                C22945n.m26998K();
                Long l = (Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_REQUENCE_LONG_SYNC, 0L);
                if (l != null && l.longValue() == 0) {
                    C46153l0.Kx0().mo60216a();
                }
            }
        }
        C86709a0.m107535s().mo121142i().mo119676J(282882, Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        this.f90024e.onSceneEnd(i2, i3, str, this);
    }
}
