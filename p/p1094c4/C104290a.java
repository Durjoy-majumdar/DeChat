package p1094c4;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import gy3.C87412m;
import p1135n.C109660b;

/* renamed from: c4.a */
public final class C104290a {

    /* renamed from: a */
    public final C109660b<String, a$$c> f308644a = new C109660b<>();

    /* renamed from: b */
    public boolean f308645b;

    /* renamed from: c */
    public Bundle f308646c;

    /* renamed from: d */
    public boolean f308647d;

    /* renamed from: e */
    public Recreator.C103780a f308648e;

    /* renamed from: f */
    public boolean f308649f = true;

    /* renamed from: a */
    public final Bundle mo145969a(String str) {
        C87412m.m108594g(str, "key");
        if (this.f308647d) {
            Bundle bundle = this.f308646c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f308646c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f308646c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f308646c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: b */
    public final void mo145970b(String str, a$$c a__c) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(a__c, "provider");
        if (!(this.f308644a.mo160872h(str, a__c) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: c */
    public final void mo145971c(Class<? extends a$$b> cls) {
        C87412m.m108594g(cls, "clazz");
        if (this.f308649f) {
            Recreator.C103780a aVar = this.f308648e;
            if (aVar == null) {
                aVar = new Recreator.C103780a(this);
            }
            this.f308648e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C103780a aVar2 = this.f308648e;
                if (aVar2 != null) {
                    aVar2.f306561a.add(cls.getName());
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
