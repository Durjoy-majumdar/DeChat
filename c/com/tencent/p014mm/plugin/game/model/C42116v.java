package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import te3.C51891wx3;
import uy1.C52644e;

/* renamed from: com.tencent.mm.plugin.game.model.v */
public class C42116v implements C11385n {

    /* renamed from: e */
    public static boolean f113431e;

    /* renamed from: f */
    public static LinkedList<C42079o> f113432f = new LinkedList<>();

    /* renamed from: g */
    public static MMHandler f113433g;

    /* renamed from: d */
    public int f113434d = 0;

    /* renamed from: com.tencent.mm.plugin.game.model.v$a */
    public class C42117a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f113435d;

        public C42117a(C117747y yVar) {
            this.f113435d = yVar;
        }

        public void run() {
            String str;
            C42116v vVar = C42116v.this;
            boolean z = C42116v.f113431e;
            vVar.f113434d += 20;
            C51891wx3 wx32 = (C51891wx3) ((C42147y0) this.f113435d).f113598e.f127056b.f127083a;
            if (wx32 == null) {
                Log.m105920e("MicroMsg.NetSceneSearchGameList", "resp == null");
                str = null;
            } else {
                str = wx32.f144342d;
            }
            C42079o oVar = new C42079o(str);
            LinkedList<C42039b> a = C42076m.m45777a(oVar.f113370a.optJSONArray("items"));
            Iterator<C42039b> it = a.iterator();
            while (it.hasNext()) {
                C42039b next = it.next();
                next.f149244L = next.f113249B1;
                next.f149233A = true;
            }
            C52644e.m59022c(a);
            C42116v.f113432f.add(oVar);
            int optInt = oVar.f113370a.optInt("remainingCount");
            Log.m105925i("MicroMsg.GameListUpdater", "remainingCount: %d", Integer.valueOf(optInt));
            if (optInt > 0) {
                C86709a0.m107524d().mo123460f(new C42147y0(C42116v.this.f113434d, 20));
                return;
            }
            C42116v vVar2 = C42116v.this;
            vVar2.getClass();
            C42116v.f113431e = false;
            C42116v.f113433g.quit();
            C86709a0.m107524d().mo123470p(1215, vVar2);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_SEARCH_LIST_UPDATE_TIME_LONG, Long.valueOf(System.currentTimeMillis()));
            LinkedList<C42079o> linkedList = C42116v.f113432f;
            if (!Util.isNullOrNil((List) linkedList)) {
                C86709a0.m107525e().postToWorker(new C42078n(linkedList));
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            f113433g.post(new C42117a(yVar));
            return;
        }
        f113431e = false;
        f113433g.quit();
        C86709a0.m107524d().mo123470p(1215, this);
    }
}
