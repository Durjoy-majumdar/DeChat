package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.fragment.app.b0 */
public class C112917b0 {

    /* renamed from: a */
    public final ArrayList<Fragment> f338018a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C112970z> f338019b = new HashMap<>();

    /* renamed from: c */
    public C112965v f338020c;

    /* renamed from: a */
    public void mo165189a(Fragment fragment) {
        if (!this.f338018a.contains(fragment)) {
            synchronized (this.f338018a) {
                this.f338018a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public Fragment mo165190b(String str) {
        C112970z zVar = this.f338019b.get(str);
        if (zVar != null) {
            return zVar.f338187c;
        }
        return null;
    }

    /* renamed from: c */
    public Fragment mo165191c(String str) {
        Fragment findFragmentByWho;
        for (C112970z next : this.f338019b.values()) {
            if (next != null && (findFragmentByWho = next.f338187c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: d */
    public List<C112970z> mo165192d() {
        ArrayList arrayList = new ArrayList();
        for (C112970z next : this.f338019b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<Fragment> mo165193e() {
        ArrayList arrayList = new ArrayList();
        for (C112970z next : this.f338019b.values()) {
            if (next != null) {
                arrayList.add(next.f338187c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<Fragment> mo165194f() {
        ArrayList arrayList;
        if (this.f338018a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f338018a) {
            arrayList = new ArrayList(this.f338018a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public void mo165195g(C112970z zVar) {
        Fragment fragment = zVar.f338187c;
        if (!(this.f338019b.get(fragment.mWho) != null)) {
            this.f338019b.put(fragment.mWho, zVar);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.f338020c.mo165267c3(fragment);
                } else {
                    this.f338020c.mo165269e3(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                fragment.toString();
            }
        }
    }

    /* renamed from: h */
    public void mo165196h(C112970z zVar) {
        Fragment fragment = zVar.f338187c;
        if (fragment.mRetainInstance) {
            this.f338020c.mo165269e3(fragment);
        }
        if (this.f338019b.put(fragment.mWho, (Object) null) != null && FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }
}
