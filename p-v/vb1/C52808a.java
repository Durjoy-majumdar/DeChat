package vb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C50524nd0;
import te3.C51442tt;
import te3.C51594ut;
import te3.C51736vt;
import te3.C51953xc0;

/* renamed from: vb1.a */
public class C52808a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f147536d;

    /* renamed from: e */
    public C11385n f147537e = null;

    public C52808a(List<C51953xc0> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51442tt();
        bVar.f127067b = new C51594ut();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkfavitem";
        bVar.f127069d = 405;
        bVar.f127070e = 196;
        bVar.f127071f = 1000000196;
        C47350c a = bVar.mo72403a();
        this.f147536d = a;
        C51442tt ttVar = (C51442tt) a.f127055a.f127080a;
        LinkedList<C51953xc0> linkedList = new LinkedList<>();
        ttVar.f142385d = linkedList;
        linkedList.addAll(list);
        ttVar.f142386e = 1;
        Log.m105925i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_OBJECT %s", Integer.valueOf(list.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147537e = nVar;
        return dispatch(gVar, this.f147536d, this);
    }

    public int getType() {
        return 405;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Fav.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51594ut utVar = (C51594ut) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Iterator<C51736vt> it = utVar.f143113d.iterator();
            while (it.hasNext()) {
                C51736vt next = it.next();
                Log.m105925i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", Integer.valueOf(next.f143684d), Integer.valueOf(next.f143685e));
            }
            this.f147537e.onSceneEnd(i2, i3, str, this);
            return;
        }
        Log.m105925i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", Integer.valueOf(i3), Integer.valueOf(i2));
        this.f147537e.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public C52808a(C50524nd0 nd02) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51442tt();
        bVar.f127067b = new C51594ut();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkfavitem";
        bVar.f127069d = 405;
        bVar.f127070e = 196;
        bVar.f127071f = 1000000196;
        C47350c a = bVar.mo72403a();
        this.f147536d = a;
        C51442tt ttVar = (C51442tt) a.f127055a.f127080a;
        ttVar.f142387f = nd02;
        ttVar.f142386e = 2;
        Log.m105925i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_DATA %s", Integer.valueOf(nd02.f138541d));
    }
}
