package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C108455d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p823sg.C90193h;
import py1.C47543a2;
import py1.C47550b2;
import py1.C47570e1;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.o0 */
public class C42080o0 extends C117747y implements C1311n {

    /* renamed from: f */
    public static final String f113376f = (C41872f.m45392b(C41872f.C41873a.PERMANENT) + "tabnav/");

    /* renamed from: g */
    public static C11385n f113377g = new C42081a();

    /* renamed from: d */
    public C11385n f113378d;

    /* renamed from: e */
    public final C47350c f113379e;

    /* renamed from: com.tencent.mm.plugin.game.model.o0$a */
    public class C42081a implements C11385n {

        /* renamed from: com.tencent.mm.plugin.game.model.o0$a$a */
        public class C42082a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C47550b2 f113380d;

            public C42082a(C42081a aVar, C47550b2 b2Var) {
                this.f113380d = b2Var;
            }

            public void run() {
                C42080o0.m45781k1(this.f113380d);
            }
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(2641, this);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data success");
                MMHandlerThread.postToMainThread(new C42082a(this, (C47550b2) ((C42080o0) yVar).f113379e.f127056b.f127083a));
                return;
            }
            Log.m105924i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data fail");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.o0$b */
    public class C42083b implements C42085d {

        /* renamed from: a */
        public final /* synthetic */ C47550b2 f113381a;

        public C42083b(C47550b2 b2Var) {
            this.f113381a = b2Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.o0$c */
    public class C42084c implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ String f113382a;

        /* renamed from: b */
        public final /* synthetic */ List f113383b;

        /* renamed from: c */
        public final /* synthetic */ C42085d f113384c;

        public C42084c(String str, List list, C42085d dVar) {
            this.f113382a = str;
            this.f113383b = list;
            this.f113384c = dVar;
        }

        /* renamed from: a */
        public void mo26263a(boolean z, Object... objArr) {
            Log.m105925i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download %b! thumburl:%s", Boolean.valueOf(z), this.f113382a);
            C42080o0.m45780j1(this.f113383b, this.f113384c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.o0$d */
    public interface C42085d {
    }

    public C42080o0() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47543a2();
        bVar.f127067b = new C47550b2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getgameindex4tabnav";
        bVar.f127069d = 2641;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f113379e = bVar.mo72403a();
    }

    /* renamed from: j1 */
    public static void m45780j1(List<String> list, C42085d dVar) {
        if (!Util.isNullOrNil((List) list)) {
            String remove = list.remove(0);
            if (Util.isNullOrNil(remove)) {
                Log.m105920e("MicroMsg.NetSceneGameIndex4TabNav", "iconUrl is null");
                m45780j1(list, dVar);
                return;
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59350f = f113376f + C90193h.m112878f(remove.getBytes());
            C20828a.m22825b().mo32515d(remove, bVar.mo32666a(), new C42084c(remove, list, dVar));
        } else if (dVar != null) {
            Log.m105924i("MicroMsg.NetSceneGameIndex4TabNav", "nav icon download complete! save nav data");
            ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57119qq("game_index4_tab_nav", ((C42083b) dVar).f113381a);
        }
    }

    /* renamed from: k1 */
    public static void m45781k1(C47550b2 b2Var) {
        if (b2Var != null) {
            if (Util.isNullOrNil((List) b2Var.f127594d)) {
                Log.m105924i("MicroMsg.NetSceneGameIndex4TabNav", "nav list is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C47570e1> it = b2Var.f127594d.iterator();
            while (it.hasNext()) {
                C47570e1 next = it.next();
                if (next != null) {
                    arrayList.add(next.f127657i);
                    arrayList.add(next.f127658j);
                }
            }
            m45780j1(arrayList, new C42083b(b2Var));
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113378d = nVar;
        return dispatch(gVar, this.f113379e, this);
    }

    public int getType() {
        return 2641;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGameIndex4TabNav", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f113378d.onSceneEnd(i2, i3, str, this);
    }
}
