package pb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101836ry2;
import te3.C101845sy2;
import te3.C101854uy2;
import te3.C51464ty2;
import xb1.C102614d;

/* renamed from: pb1.r1 */
public class C100739r1 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f295136d;

    /* renamed from: e */
    public C11385n f295137e = null;

    /* renamed from: f */
    public int f295138f;

    /* renamed from: g */
    public int f295139g;

    /* renamed from: h */
    public C35443x f295140h;

    /* renamed from: i */
    public LinkedList<C101854uy2> f295141i;

    /* renamed from: j */
    public LinkedList<C101836ry2> f295142j;

    /* renamed from: n */
    public String f295143n;

    /* renamed from: o */
    public int f295144o;

    public C100739r1(int i, LinkedList<C101836ry2> linkedList, LinkedList<C101854uy2> linkedList2, int i2) {
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.Fav.NetSceneModFavItem", "NetSceneModFavItem init favId:%s " + Util.getStack(), Integer.valueOf(i));
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101845sy2();
        bVar.f127067b = new C51464ty2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/modfavitem";
        bVar.f127069d = v2helper.EMethodSetAgcRxOn;
        bVar.f127070e = 216;
        bVar.f127071f = 1000000216;
        this.f295136d = bVar.mo72403a();
        this.f295141i = linkedList2;
        this.f295142j = linkedList;
        this.f295138f = i;
        this.f295139g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        LinkedList<C101836ry2> linkedList;
        if (this.f295144o == 0 && ((linkedList = this.f295142j) == null || linkedList.size() == 0)) {
            return -1;
        }
        C101845sy2 sy22 = (C101845sy2) this.f295136d.f127055a.f127080a;
        sy22.f299473e = this.f295142j.size();
        LinkedList<C101854uy2> linkedList2 = this.f295141i;
        if (linkedList2 != null) {
            sy22.f299475g = linkedList2.size();
            sy22.f299476h = this.f295141i;
        } else {
            sy22.f299475g = 0;
            sy22.f299476h = new LinkedList<>();
        }
        if (!Util.isNullOrNil(this.f295143n)) {
            sy22.f299477i = this.f295143n;
        }
        sy22.f299473e = this.f295142j.size();
        sy22.f299474f = this.f295142j;
        sy22.f299472d = this.f295138f;
        sy22.f299478j = this.f295144o;
        this.f295137e = nVar;
        return dispatch(gVar, this.f295136d, this);
    }

    public int getType() {
        return v2helper.EMethodSetAgcRxOn;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.Fav.NetSceneModFavItem", "favId: " + this.f295138f + ", netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 4 && i3 != 0) {
            C100745t.m131894f(10002, i3, str);
        }
        C100745t.m131893e((long) this.f295138f, i2, i3, i3 == 0, 1);
        C100745t.m131890b();
        this.f295137e.onSceneEnd(i2, i3, str, this);
        C100734q.m131846f(((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142273qq((long) this.f295138f));
    }
}
