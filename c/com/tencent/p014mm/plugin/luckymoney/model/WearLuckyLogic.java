package com.tencent.p014mm.plugin.luckymoney.model;

import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WearActionEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76706g;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.WearLuckyLogic */
public class WearLuckyLogic implements C11385n {

    /* renamed from: d */
    public boolean f198933d;

    /* renamed from: e */
    public C69237j2 f198934e;

    /* renamed from: f */
    public C69210e2 f198935f;

    /* renamed from: g */
    public C69267u1 f198936g;

    /* renamed from: h */
    public IListener f198937h;

    public WearLuckyLogic() {
        C691571 r0 = new IListener<WearActionEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1141445845;
            }

            public boolean callback(IEvent iEvent) {
                WearActionEvent wearActionEvent = (WearActionEvent) iEvent;
                if (!(wearActionEvent instanceof WearActionEvent)) {
                    return false;
                }
                WearActionEvent.C40182a aVar = wearActionEvent.f107808d;
                if (aVar.f107810a != 1) {
                    return false;
                }
                WearLuckyLogic wearLuckyLogic = WearLuckyLogic.this;
                long j = aVar.f107811b;
                if (wearLuckyLogic.f198933d) {
                    return false;
                }
                wearLuckyLogic.f198933d = true;
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
                String content = b002.getContent();
                C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, b002.mo108775z2()) : null;
                if (u == null) {
                    return false;
                }
                String nullAsNil = Util.nullAsNil(u.f195608o1);
                Uri parse = Uri.parse(nullAsNil);
                String queryParameter = parse.getQueryParameter("sendid");
                int i = Util.getInt(parse.getQueryParameter("channelid"), 1);
                if (wearLuckyLogic.f198934e != null) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(wearLuckyLogic.f198934e);
                    wearLuckyLogic.f198934e = null;
                }
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123455a(1581, wearLuckyLogic);
                C69237j2 j2Var = new C69237j2(1, i, queryParameter, nullAsNil, 3, "v1.0", "");
                wearLuckyLogic.f198934e = j2Var;
                j2Var.f199240S = b002.mo108768t();
                wearLuckyLogic.f198934e.f199241T = j;
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(wearLuckyLogic.f198934e);
                return false;
            }
        };
        this.f198937h = r0;
        r0.alive();
    }

    /* renamed from: a */
    public final void mo95309a(long j) {
        WearActionEvent wearActionEvent = new WearActionEvent();
        wearActionEvent.f107808d.f107810a = 2;
        WearActionEvent.C40183b bVar = wearActionEvent.f107809e;
        bVar.f107815b = j;
        bVar.f107814a = 0;
        bVar.f107816c = "";
        wearActionEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo95310b(C69158a0 a0Var, long j, String str) {
        WearActionEvent wearActionEvent = new WearActionEvent();
        wearActionEvent.f107808d.f107810a = 2;
        WearActionEvent.C40183b bVar = wearActionEvent.f107809e;
        bVar.f107815b = j;
        bVar.f107814a = a0Var.f198974q;
        bVar.f107816c = a0Var.f198983z;
        bVar.f107817d = new ArrayList();
        if (C72996z1.m85820U5(str)) {
            Iterator<C69236j1> it = a0Var.f198951M.iterator();
            while (it.hasNext()) {
                C69236j1 next = it.next();
                wearActionEvent.f107809e.f107817d.add(((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93581h(next.f199213e) + "=" + next.f199212d + "=" + next.f199214f);
            }
        }
        wearActionEvent.asyncPublish(Looper.getMainLooper());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1581, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1685, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1585, this);
        if (yVar2 instanceof C69237j2) {
            C69237j2 j2Var = (C69237j2) yVar2;
            if (i == 0 && i2 == 0) {
                int i3 = j2Var.f199250s;
                if (i3 == 4) {
                    if (this.f198936g != null) {
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123458d(this.f198936g);
                        this.f198936g = null;
                    }
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(1585, this);
                    C69267u1 u1Var = new C69267u1(j2Var.f199244j, 11, 0, j2Var.f199245n, "v1.0");
                    this.f198936g = u1Var;
                    u1Var.f199343q = j2Var.f199240S;
                    u1Var.f199342p = j2Var.f199241T;
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(this.f198936g);
                    Log.m105924i("MicroMsg.Wear.WearLuckyLogic", "start to get detail");
                } else if (j2Var.f199251t == 1 || i3 == 5 || i3 == 1) {
                    this.f198933d = false;
                    Log.m105924i("MicroMsg.Wear.WearLuckyLogic", "receive lucky already");
                    mo95309a(j2Var.f199241T);
                } else {
                    if (this.f198935f != null) {
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123458d(this.f198935f);
                        this.f198935f = null;
                    }
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(1685, this);
                    C69210e2 e2Var = new C69210e2(j2Var.f199242h, j2Var.f199243i, j2Var.f199244j, j2Var.f199245n, C69242l1.m81601g(), C75592q0.m90783m(), j2Var.f199240S, "v1.0", j2Var.f199237P);
                    this.f198935f = e2Var;
                    e2Var.f199148A = j2Var.f199241T;
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(this.f198935f);
                    Log.m105924i("MicroMsg.Wear.WearLuckyLogic", "start to open lucky");
                }
            } else {
                this.f198933d = false;
                mo95309a(j2Var.f199241T);
            }
        } else if (yVar2 instanceof C69210e2) {
            this.f198933d = false;
            C69210e2 e2Var2 = (C69210e2) yVar2;
            if (i == 0 && i2 == 0) {
                C69158a0 a0Var = e2Var2.f199149h;
                if (a0Var.f198939A == 2) {
                    mo95310b(a0Var, e2Var2.f199148A, e2Var2.f199152n);
                } else {
                    mo95309a(e2Var2.f199148A);
                }
            } else {
                mo95309a(e2Var2.f199148A);
            }
        } else if (yVar2 instanceof C69267u1) {
            this.f198933d = false;
            C69267u1 u1Var2 = (C69267u1) yVar2;
            if (i == 0 && i2 == 0) {
                mo95310b(u1Var2.f199337h, u1Var2.f199342p, u1Var2.f199343q);
            } else {
                mo95309a(u1Var2.f199342p);
            }
        }
    }
}
