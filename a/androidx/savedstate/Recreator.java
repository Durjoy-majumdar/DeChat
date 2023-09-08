package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import p1094c4.C104290a;
import p1094c4.C104292c;
import p1094c4.a$$b;
import p1094c4.a$$c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/p;", "Lc4/c;", "owner", "<init>", "(Lc4/c;)V", "a", "savedstate_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class Recreator implements C103764p {

    /* renamed from: d */
    public final C104292c f306560d;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C103780a implements a$$c {

        /* renamed from: a */
        public final Set<String> f306561a = new LinkedHashSet();

        public C103780a(C104290a aVar) {
            C87412m.m108594g(aVar, "registry");
            aVar.mo145970b("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo144852a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f306561a));
            return bundle;
        }
    }

    public Recreator(C104292c cVar) {
        C87412m.m108594g(cVar, "owner");
        this.f306560d = cVar;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (bVar == C39623j.C39625b.ON_CREATE) {
            sVar.getLifecycle().removeObserver(this);
            Bundle a = this.f306560d.getSavedStateRegistry().mo145969a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a$$b.class);
                            C87412m.m108593f(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    C87412m.m108593f(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((a$$b) newInstance).mo145126a(this.f306560d);
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate " + next, e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException("Class " + next + " wasn't found", e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
