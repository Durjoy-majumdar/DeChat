package p1094c4;

import android.os.Bundle;
import androidx.lifecycle.C39623j;
import androidx.savedstate.Recreator;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import p1135n.C109660b;

/* renamed from: c4.b */
public final class C104291b {

    /* renamed from: a */
    public final C104292c f308651a;

    /* renamed from: b */
    public final C104290a f308652b = new C104290a();

    /* renamed from: c */
    public boolean f308653c;

    public C104291b(C104292c cVar, C8480h hVar) {
        this.f308651a = cVar;
    }

    /* renamed from: a */
    public final void mo145972a(Bundle bundle) {
        if (!this.f308653c) {
            C39623j lifecycle = this.f308651a.getLifecycle();
            C87412m.m108593f(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState() == C39623j.C39626c.INITIALIZED) {
                lifecycle.addObserver(new Recreator(this.f308651a));
                C104290a aVar = this.f308652b;
                aVar.getClass();
                if (!aVar.f308645b) {
                    lifecycle.addObserver(new a$$a(aVar));
                    aVar.f308645b = true;
                    this.f308653c = true;
                } else {
                    throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
                }
            } else {
                throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
            }
        }
        C39623j lifecycle2 = this.f308651a.getLifecycle();
        C87412m.m108593f(lifecycle2, "owner.lifecycle");
        if (!lifecycle2.getCurrentState().mo62187a(C39623j.C39626c.STARTED)) {
            C104290a aVar2 = this.f308652b;
            if (!aVar2.f308645b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!aVar2.f308647d) {
                aVar2.f308646c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                aVar2.f308647d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle2.getCurrentState()).toString());
        }
    }

    /* renamed from: b */
    public final void mo145973b(Bundle bundle) {
        C87412m.m108594g(bundle, "outBundle");
        C104290a aVar = this.f308652b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f308646c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C109660b<String, a$$c> bVar = aVar.f308644a;
        bVar.getClass();
        C109660b.C109664d dVar = new C109660b.C109664d();
        bVar.f328281f.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a$$c) entry.getValue()).mo144852a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
