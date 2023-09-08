package androidx.lifecycle;

import androidx.lifecycle.C39623j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p1094c4.C104290a;
import p1094c4.C104292c;
import p1094c4.a$$b;

final class SavedStateHandleController implements C103764p {

    /* renamed from: d */
    public final String f306504d;

    /* renamed from: e */
    public boolean f306505e = false;

    /* renamed from: f */
    public final C103759f0 f306506f;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C103753a implements a$$b {
        /* renamed from: a */
        public void mo145126a(C104292c cVar) {
            if (cVar instanceof C0123n0) {
                C39630m0 viewModelStore = ((C0123n0) cVar).getViewModelStore();
                C104290a savedStateRegistry = cVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f106390a.keySet()).iterator();
                while (it.hasNext()) {
                    HashMap<String, C39622i0> hashMap = viewModelStore.f106390a;
                    C39623j lifecycle = cVar.getLifecycle();
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).getTag("androidx.lifecycle.savedstate.vm.tag");
                    if (savedStateHandleController != null && !savedStateHandleController.f306505e) {
                        savedStateHandleController.mo145125a(savedStateRegistry, lifecycle);
                        SavedStateHandleController.m138154b(savedStateRegistry, lifecycle);
                    }
                }
                if (!new HashSet(viewModelStore.f106390a.keySet()).isEmpty()) {
                    savedStateRegistry.mo145971c(C103753a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, C103759f0 f0Var) {
        this.f306504d = str;
        this.f306506f = f0Var;
    }

    /* renamed from: b */
    public static void m138154b(final C104290a aVar, final C39623j jVar) {
        C39623j.C39626c currentState = jVar.getCurrentState();
        if (currentState == C39623j.C39626c.INITIALIZED || currentState.mo62187a(C39623j.C39626c.STARTED)) {
            aVar.mo145971c(C103753a.class);
        } else {
            jVar.addObserver(new C103764p() {
                /* renamed from: k4 */
                public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                    if (bVar == C39623j.C39625b.ON_START) {
                        C39623j.this.removeObserver(this);
                        aVar.mo145971c(C103753a.class);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo145125a(C104290a aVar, C39623j jVar) {
        if (!this.f306505e) {
            this.f306505e = true;
            jVar.addObserver(this);
            aVar.mo145970b(this.f306504d, this.f306506f.f306521d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        if (bVar == C39623j.C39625b.ON_DESTROY) {
            this.f306505e = false;
            sVar.getLifecycle().removeObserver(this);
        }
    }
}
