package hg0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import p586km.C46733b;
import te3.C49174do2;
import te3.C49312eo2;
import te3.C49453fo2;
import te3.C51163rv3;

/* renamed from: hg0.s0 */
public class C46062s0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124200d;

    /* renamed from: e */
    public C11385n f124201e = null;

    /* renamed from: hg0.s0$a */
    public class C46063a implements MMHandlerThread.IWaitWorkThread {

        /* renamed from: a */
        public final /* synthetic */ C49453fo2 f124202a;

        public C46063a(C46062s0 s0Var, C49453fo2 fo22) {
            this.f124202a = fo22;
        }

        public boolean doInBackground() {
            C49453fo2 fo22 = this.f124202a;
            if (fo22 != null && fo22.f133616f.size() > 0) {
                Iterator<C49174do2> it = this.f124202a.f133616f.iterator();
                while (it.hasNext()) {
                    C49174do2 next = it.next();
                    if (next.f132452f == 1) {
                        C68097n nVar = new C68097n();
                        nVar.f195728a = next.f132451e;
                        nVar.f195732e = next.f132453g;
                        nVar.f195731d = next.f132454h;
                        nVar.f195736i = -1;
                        Log.m105919d("MicroMsg.NetSceneListMFriend", "getmlist  %s b[%s] s[%s]", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f());
                        nVar.f195729b = 3;
                        nVar.f195733f = 1;
                        ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
                    }
                }
            }
            return true;
        }

        public boolean onPostExecute() {
            return false;
        }

        public String toString() {
            return super.toString() + "|onGYNetEnd";
        }
    }

    public C46062s0(String str, List<String> list, List<String[]> list2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49312eo2();
        bVar.f127067b = new C49453fo2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/listmfriend";
        bVar.f127069d = 431;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124200d = a;
        C49312eo2 eo22 = (C49312eo2) a.f127055a.f127080a;
        eo22.f133036d = str;
        eo22.f133039g = list == null ? 0 : list.size();
        eo22.f133037e = list2 != null ? list2.size() : i;
        eo22.f133040h = new LinkedList<>();
        eo22.f133038f = new LinkedList<>();
        if (list != null) {
            for (String next : list) {
                if (!Util.isNullOrNil(next)) {
                    LinkedList<C51163rv3> linkedList = eo22.f133040h;
                    C51163rv3 rv32 = new C51163rv3();
                    rv32.f141175d = next;
                    rv32.f141176e = true;
                    linkedList.add(rv32);
                }
            }
        }
        if (list2 != null) {
            for (String[] next2 : list2) {
                if (!Util.isNullOrNil(next2[2])) {
                    LinkedList<C51163rv3> linkedList2 = eo22.f133038f;
                    C51163rv3 rv33 = new C51163rv3();
                    rv33.f141175d = next2[2];
                    rv33.f141176e = true;
                    linkedList2.add(rv33);
                }
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124201e = nVar;
        return dispatch(gVar, this.f124200d, this);
    }

    public int getType() {
        return 431;
    }

    /* renamed from: j1 */
    public LinkedList<C49174do2> mo71476j1() {
        LinkedList<C49174do2> linkedList = ((C49453fo2) this.f124200d.f127056b.f127083a).f133616f;
        if (linkedList != null) {
            Iterator<C49174do2> it = linkedList.iterator();
            while (it.hasNext()) {
                C49174do2 next = it.next();
                ((C46733b) C86312j.m106911c(C46733b.class)).zi0(next.f132451e, 13, next.f132456j);
            }
        }
        return ((C49453fo2) this.f124200d.f127056b.f127083a).f133616f;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C86709a0.m107525e().postAtFrontOfWorker(new C46063a(this, (C49453fo2) this.f124200d.f127056b.f127083a));
        this.f124201e.onSceneEnd(i2, i3, str, this);
    }
}
