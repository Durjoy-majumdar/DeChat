package androidx.activity;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f337833a;

    /* renamed from: b */
    public final ArrayDeque<C112842b> f337834b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C103764p, C112841a {

        /* renamed from: d */
        public final C39623j f337835d;

        /* renamed from: e */
        public final C112842b f337836e;

        /* renamed from: f */
        public C112841a f337837f;

        public LifecycleOnBackPressedCancellable(C39623j jVar, C112842b bVar) {
            this.f337835d = jVar;
            this.f337836e = bVar;
            jVar.addObserver(this);
        }

        public void cancel() {
            this.f337835d.removeObserver(this);
            this.f337836e.removeCancellable(this);
            C112841a aVar = this.f337837f;
            if (aVar != null) {
                aVar.cancel();
                this.f337837f = null;
            }
        }

        /* renamed from: k4 */
        public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
            if (bVar == C39623j.C39625b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C112842b bVar2 = this.f337836e;
                onBackPressedDispatcher.f337834b.add(bVar2);
                C112840a aVar = new C112840a(bVar2);
                bVar2.addCancellable(aVar);
                this.f337837f = aVar;
            } else if (bVar == C39623j.C39625b.ON_STOP) {
                C112841a aVar2 = this.f337837f;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == C39623j.C39625b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C112840a implements C112841a {

        /* renamed from: d */
        public final C112842b f337839d;

        public C112840a(C112842b bVar) {
            this.f337839d = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f337834b.remove(this.f337839d);
            this.f337839d.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f337833a = runnable;
    }

    /* renamed from: a */
    public void mo164666a(C0125s sVar, C112842b bVar) {
        C39623j lifecycle = sVar.getLifecycle();
        if (lifecycle.getCurrentState() != C39623j.C39626c.DESTROYED) {
            bVar.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* renamed from: b */
    public void mo164667b() {
        Iterator<C112842b> descendingIterator = this.f337834b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C112842b next = descendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.f337833a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
