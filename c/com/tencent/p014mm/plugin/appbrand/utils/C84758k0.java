package com.tencent.p014mm.plugin.appbrand.utils;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82149f;
import com.tencent.p014mm.plugin.appbrand.report.C84111e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statemachine.StateMachine;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.k0 */
public abstract class C84758k0<Task> extends StateMachine {

    /* renamed from: d */
    public final C84758k0<Task>.c f247169d;

    /* renamed from: e */
    public final C84758k0<Task>.b f247170e;

    /* renamed from: f */
    public final String f247171f;

    /* renamed from: g */
    public final Queue<Task> f247172g = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.k0$b */
    public final class C84760b extends C84111e0 {
        public C84760b(C84759a aVar) {
        }

        public String getName() {
            return C84758k0.this.f247171f + "|StateExecuting";
        }

        public boolean processMessage(Message message) {
            if (2 != message.what) {
                return super.processMessage(message);
            }
            C84758k0 k0Var = C84758k0.this;
            k0Var.transitionTo(k0Var.f247169d);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.k0$c */
    public final class C84761c extends C84111e0 {
        public C84761c(C84759a aVar) {
        }

        public void enter() {
            super.enter();
            C84758k0.m104421e(C84758k0.this);
        }

        public String getName() {
            return C84758k0.this.f247171f + "|StateIdle";
        }

        public boolean processMessage(Message message) {
            int i = message.what;
            if (1 != i && 2 != i) {
                return super.processMessage(message);
            }
            C84758k0.m104421e(C84758k0.this);
            return true;
        }
    }

    public C84758k0(String str, Looper looper) {
        super(str, looper);
        C84758k0<Task>.c cVar = new C84761c((C84759a) null);
        this.f247169d = cVar;
        C84758k0<Task>.b bVar = new C84760b((C84759a) null);
        this.f247170e = bVar;
        this.f247171f = str;
        addState(cVar);
        addState(bVar);
        setInitialState(cVar);
        start();
    }

    /* renamed from: e */
    public static void m104421e(C84758k0 k0Var) {
        Object poll;
        synchronized (k0Var.f247172g) {
            poll = ((LinkedList) k0Var.f247172g).poll();
        }
        if (poll != null) {
            k0Var.transitionTo(k0Var.f247170e);
            C82149f.C82153d dVar = (C82149f.C82153d) poll;
            Log.m105919d(((C82149f) k0Var).getName(), "about to executeTask %s", dVar.toString());
            dVar.mo114586a();
        }
    }

    public void onQuitting() {
        super.onQuitting();
        synchronized (this.f247172g) {
            ((LinkedList) this.f247172g).clear();
        }
    }
}
