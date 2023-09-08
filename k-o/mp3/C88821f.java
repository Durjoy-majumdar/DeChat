package mp3;

import hp3.C87581a;
import java.util.Stack;
import kp3.C88253a;
import lp3.C88633e;
import lp3.C88642f;

/* renamed from: mp3.f */
public class C88821f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87581a f256220d;

    /* renamed from: e */
    public final /* synthetic */ Object f256221e;

    /* renamed from: f */
    public final /* synthetic */ RuntimeException f256222f;

    /* renamed from: g */
    public final /* synthetic */ C88822g f256223g;

    public C88821f(C88822g gVar, C87581a aVar, Object obj, RuntimeException runtimeException) {
        this.f256223g = gVar;
        this.f256220d = aVar;
        this.f256221e = obj;
        this.f256222f = runtimeException;
    }

    public void run() {
        if (this.f256223g.f256225b != null) {
            C88633e.C88634a aVar = (C88633e.C88634a) this.f256223g.f256225b;
            aVar.getClass();
            C88642f fVar = C88642f.f255951b;
            C88633e eVar = C88633e.this;
            Stack stack = fVar.f255952a.get();
            if (stack == null) {
                stack = new Stack();
                fVar.f255952a.set(stack);
            }
            stack.push(eVar);
        }
        try {
            Object call = this.f256220d.call(this.f256221e);
            if (this.f256223g.f256225b != null) {
                C88633e.C88634a aVar2 = (C88633e.C88634a) this.f256223g.f256225b;
                aVar2.getClass();
                C88642f.f255951b.f255952a.get().pop();
                synchronized (C88633e.this) {
                    C88633e eVar2 = C88633e.this;
                    C88633e.C88638f fVar2 = eVar2.f255918o;
                    eVar2.f255918o = null;
                    if (!eVar2.f255915i) {
                        C88633e.this.mo123079v(call);
                    }
                    C88633e.this.getClass();
                    if (C88633e.this.f255911e == C88633e.C88641i.Interrupted) {
                        C88253a.m109903b("Vending.Pipeline", "interrupted, just return", new Object[0]);
                    } else if (C88633e.this.f255911e == C88633e.C88641i.Pausing) {
                        C88253a.m109903b("Vending.Pipeline", "pausing, just return.", new Object[0]);
                    } else {
                        C88253a.m109903b("Vending.Pipeline", "last one resolved, dequeue next.", new Object[0]);
                        C88633e.this.f255911e = C88633e.C88641i.Resolved;
                        synchronized (C88633e.this) {
                        }
                        C88633e.this.mo123068h();
                    }
                }
            }
        } catch (ClassCastException e) {
            this.f256222f.initCause(e);
            throw this.f256222f;
        }
    }
}
