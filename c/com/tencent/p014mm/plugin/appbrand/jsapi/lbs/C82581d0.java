package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statemachine.State;
import com.tencent.p014mm.sdk.statemachine.StateMachine;
import java.util.HashMap;
import ms0.C88840a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.d0 */
public class C82581d0 extends StateMachine implements C82835n {

    /* renamed from: d */
    public final C82578c f241695d;

    /* renamed from: e */
    public final C82580d f241696e;

    /* renamed from: f */
    public final C88840a.C88842b f241697f = new C82582a();

    /* renamed from: g */
    public Bundle f241698g;

    /* renamed from: h */
    public String f241699h;

    /* renamed from: i */
    public volatile boolean f241700i = false;

    /* renamed from: j */
    public volatile boolean f241701j = false;

    /* renamed from: n */
    public volatile boolean f241702n = false;

    /* renamed from: o */
    public C82586e f241703o;

    /* renamed from: p */
    public final State f241704p;

    /* renamed from: q */
    public final State f241705q;

    /* renamed from: r */
    public final State f241706r;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.d0$a */
    public class C82582a implements C88840a.C88842b {
        public C82582a() {
        }

        /* renamed from: f */
        public void mo114898f(int i, String str, C88840a.C88841a aVar) {
            if (i == 0) {
                C82581d0.this.f241695d.mo114898f(i, str, aVar);
                return;
            }
            C82580d dVar = C82581d0.this.f241696e;
            dVar.getClass();
            HashMap hashMap = new HashMap(2);
            hashMap.put("errCode", Integer.valueOf(i));
            hashMap.put("errStr", str);
            synchronized (dVar) {
                dVar.mo115161k(dVar.f241694i);
                dVar.mo115165o(hashMap);
                dVar.mo115158h();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.d0$b */
    public class C82583b extends State {
        public C82583b() {
        }

        public void enter() {
            super.enter();
            Log.m105924i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateNotListening");
            C82581d0 d0Var = C82581d0.this;
            ((C88840a) C89909e.m112436a(C88840a.class)).mo123225a6(d0Var.f241699h, d0Var.f241697f, d0Var.f241698g);
            C82581d0.this.f241701j = false;
            C82586e eVar = C82581d0.this.f241703o;
            if (eVar != null) {
                eVar.mo114899a("StateNotListening");
            }
        }

        public String getName() {
            return C82581d0.this.getName() + "$" + "StateListening";
        }

        public boolean processMessage(Message message) {
            int i = message.what;
            if (1 == i) {
                C82581d0 d0Var = C82581d0.this;
                d0Var.transitionTo(d0Var.f241705q);
                return true;
            } else if (4 != i) {
                return super.processMessage(message);
            } else {
                C82581d0 d0Var2 = C82581d0.this;
                d0Var2.transitionTo(d0Var2.f241705q);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.d0$c */
    public class C82584c extends State {
        public C82584c() {
        }

        public void enter() {
            super.enter();
            Log.m105924i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateListening");
            C82581d0 d0Var = C82581d0.this;
            ((C88840a) C89909e.m112436a(C88840a.class)).Cb0(d0Var.f241699h, d0Var.f241697f, d0Var.f241698g);
            C82581d0.this.f241701j = true;
            C82586e eVar = C82581d0.this.f241703o;
            if (eVar != null) {
                eVar.mo114899a("StateListening");
            }
        }

        public void exit() {
            super.exit();
            C82581d0 d0Var = C82581d0.this;
            ((C88840a) C89909e.m112436a(C88840a.class)).mo123225a6(d0Var.f241699h, d0Var.f241697f, d0Var.f241698g);
            C82581d0.this.f241701j = false;
            C82586e eVar = C82581d0.this.f241703o;
            if (eVar != null) {
                eVar.mo114899a("StateNotListening");
            }
        }

        public String getName() {
            return C82581d0.this.getName() + "$" + "StateNotListening";
        }

        public boolean processMessage(Message message) {
            int i = message.what;
            if (2 == i) {
                C82581d0 d0Var = C82581d0.this;
                d0Var.transitionTo(d0Var.f241704p);
                return true;
            } else if (3 != i) {
                return super.processMessage(message);
            } else {
                C82581d0 d0Var2 = C82581d0.this;
                d0Var2.transitionTo(d0Var2.f241706r);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.d0$d */
    public class C82585d extends State {
        public C82585d() {
        }

        public void enter() {
            super.enter();
            Log.m105924i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateSuspend");
            C82586e eVar = C82581d0.this.f241703o;
            if (eVar != null) {
                eVar.mo114899a("StateSuspend");
            }
        }

        public String getName() {
            return C82581d0.this.getName() + "$" + "StateSuspend";
        }

        public boolean processMessage(Message message) {
            int i = message.what;
            if (2 == i) {
                C82581d0 d0Var = C82581d0.this;
                d0Var.transitionTo(d0Var.f241704p);
                return true;
            } else if (4 != i) {
                return super.processMessage(message);
            } else {
                C82581d0 d0Var2 = C82581d0.this;
                d0Var2.transitionTo(d0Var2.f241705q);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.d0$e */
    public interface C82586e {
        /* renamed from: a */
        void mo114899a(String str);
    }

    public C82581d0(C82381f fVar) {
        super("RuntimeLocationUpdateStateManager[" + fVar.getAppId() + "]", Looper.getMainLooper());
        C82583b bVar = new C82583b();
        this.f241704p = bVar;
        C82584c cVar = new C82584c();
        this.f241705q = cVar;
        C82585d dVar = new C82585d();
        this.f241706r = dVar;
        this.f241695d = new C82578c(fVar);
        this.f241696e = new C82580d(fVar);
        addState(bVar);
        addState(cVar);
        addState(dVar);
        setInitialState(bVar);
    }
}
