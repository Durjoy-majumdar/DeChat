package t22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115568o;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C118450o52;
import te3.C118452o93;
import te3.C118456p52;
import te3.C51018qv3;

/* renamed from: t22.n */
public class C118350n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f353706d;

    /* renamed from: e */
    public final C47350c f353707e;

    /* renamed from: f */
    public boolean f353708f;

    /* renamed from: g */
    public String f353709g;

    /* renamed from: h */
    public List<C115568o> f353710h = new ArrayList();

    /* renamed from: i */
    public byte[] f353711i = null;

    /* renamed from: j */
    public boolean f353712j = false;

    /* renamed from: n */
    public String f353713n = "";

    /* renamed from: o */
    public int f353714o;

    public C118350n(C118450o52 o522, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = o522;
        bVar.f127067b = new C118456p52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpoilist";
        bVar.f127069d = 457;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f353707e = a;
        C118450o52 o523 = (C118450o52) a.f127055a.f127080a;
        int i = o523.f354173e;
        this.f353713n = str;
        this.f353708f = o523.f354175g.f140572d == 0;
        Log.m105925i("MicroMsg.NetSceneGetPoiList", "lat: %f lng: %f scene: %d opcode: %d oriLat： %f oriLng: %f isAutoQuery: %s isFirst:%s, indoorSwitch:%s, buildingId:%s, poiFloor: %s", Double.valueOf(o523.f354177i), Double.valueOf(o523.f354176h), Integer.valueOf(o523.f354172d), Integer.valueOf(o523.f354173e), Double.valueOf(o523.f354179n), Double.valueOf(o523.f354178j), Integer.valueOf(o523.f354180o), Boolean.valueOf(this.f353708f), Integer.valueOf(o523.f354183r), o523.f354184s, o523.f354185t);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetPoiList", "NetSceneGetPoiList done.");
        this.f353706d = nVar;
        return dispatch(gVar, this.f353707e, this);
    }

    public int getType() {
        return 457;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetPoiList", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + "errMsg:" + str);
        C118456p52 p522 = (C118456p52) this.f353707e.f127056b.f127083a;
        ((ArrayList) this.f353710h).clear();
        Log.m105918d("MicroMsg.NetSceneGetPoiList", "url " + p522.f354224j + " " + p522.f354225n + " " + p522.f354223i + " " + p522.f354228q);
        boolean z = true;
        Log.m105919d("MicroMsg.NetSceneGetPoiList", "autoInterval: %d", Integer.valueOf(p522.f354227p));
        this.f353709g = p522.f354228q;
        this.f353714o = p522.f354227p;
        LinkedList<C118452o93> linkedList = p522.f354219e;
        if (linkedList != null) {
            Log.m105919d("MicroMsg.NetSceneGetPoiList", "poi result %d ", Integer.valueOf(linkedList.size()));
            if (p522.f354219e.size() > 0) {
                Log.m105919d("MicroMsg.NetSceneGetPoiList", "addr %s, province %s, street %s, city %s", p522.f354219e.get(0).f354192e, p522.f354219e.get(0).f354198n, p522.f354219e.get(0).f354201q, p522.f354219e.get(0).f354199o);
            }
            Iterator<C118452o93> it = p522.f354219e.iterator();
            while (it.hasNext()) {
                C115568o oVar = new C115568o(it.next(), this.f353709g);
                Log.m105919d("MicroMsg.NetSceneGetPoiList", "lat %s lng %s", Double.valueOf(oVar.f346611d), Double.valueOf(oVar.f346610c));
                ((ArrayList) this.f353710h).add(oVar);
            }
        }
        C51018qv3 qv32 = p522.f354222h;
        if (qv32 != null) {
            this.f353711i = C48374j0.m53715d(qv32);
        }
        if (p522.f354221g != 1) {
            z = false;
        }
        this.f353712j = z;
        this.f353706d.onSceneEnd(i2, i3, str, this);
    }
}
