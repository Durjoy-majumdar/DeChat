package androidx.fragment.app;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.fragment.app.v */
public final class C112965v extends C39622i0 {

    /* renamed from: n */
    public static final C54209k0.C54210b f338172n = new C112966a();

    /* renamed from: d */
    public final HashMap<String, Fragment> f338173d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C112965v> f338174e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, C39630m0> f338175f = new HashMap<>();

    /* renamed from: g */
    public final boolean f338176g;

    /* renamed from: h */
    public boolean f338177h = false;

    /* renamed from: i */
    public boolean f338178i = false;

    /* renamed from: j */
    public boolean f338179j = false;

    /* renamed from: androidx.fragment.app.v$a */
    public class C112966a implements C54209k0.C54210b {
        public <T extends C39622i0> T create(Class<T> cls) {
            return new C112965v(true);
        }
    }

    public C112965v(boolean z) {
        this.f338176g = z;
    }

    /* renamed from: c3 */
    public void mo165267c3(Fragment fragment) {
        if (this.f338179j) {
            FragmentManager.isLoggingEnabled(2);
        } else if (!this.f338173d.containsKey(fragment.mWho)) {
            this.f338173d.put(fragment.mWho, fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                fragment.toString();
            }
        }
    }

    @Deprecated
    /* renamed from: d3 */
    public C112964u mo165268d3() {
        if (this.f338173d.isEmpty() && this.f338174e.isEmpty() && this.f338175f.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f338174e.entrySet()) {
            C112964u d3 = ((C112965v) next.getValue()).mo165268d3();
            if (d3 != null) {
                hashMap.put(next.getKey(), d3);
            }
        }
        this.f338178i = true;
        if (!this.f338173d.isEmpty() || !hashMap.isEmpty() || !this.f338175f.isEmpty()) {
            return new C112964u(new ArrayList(this.f338173d.values()), hashMap, new HashMap(this.f338175f));
        }
        return null;
    }

    /* renamed from: e3 */
    public void mo165269e3(Fragment fragment) {
        if (this.f338179j) {
            FragmentManager.isLoggingEnabled(2);
            return;
        }
        if ((this.f338173d.remove(fragment.mWho) != null) && FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C112965v.class != obj.getClass()) {
            return false;
        }
        C112965v vVar = (C112965v) obj;
        return this.f338173d.equals(vVar.f338173d) && this.f338174e.equals(vVar.f338174e) && this.f338175f.equals(vVar.f338175f);
    }

    @Deprecated
    /* renamed from: f3 */
    public void mo165271f3(C112964u uVar) {
        this.f338173d.clear();
        this.f338174e.clear();
        this.f338175f.clear();
        if (uVar != null) {
            Collection<Fragment> collection = uVar.f338169a;
            if (collection != null) {
                for (Fragment next : collection) {
                    if (next != null) {
                        this.f338173d.put(next.mWho, next);
                    }
                }
            }
            Map<String, C112964u> map = uVar.f338170b;
            if (map != null) {
                for (Map.Entry next2 : map.entrySet()) {
                    C112965v vVar = new C112965v(this.f338176g);
                    vVar.mo165271f3((C112964u) next2.getValue());
                    this.f338174e.put(next2.getKey(), vVar);
                }
            }
            Map<String, C39630m0> map2 = uVar.f338171c;
            if (map2 != null) {
                this.f338175f.putAll(map2);
            }
        }
        this.f338178i = false;
    }

    public int hashCode() {
        return (((this.f338173d.hashCode() * 31) + this.f338174e.hashCode()) * 31) + this.f338175f.hashCode();
    }

    public void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        this.f338177h = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f338173d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it4 = this.f338174e.keySet().iterator();
        while (it4.hasNext()) {
            sb.append(it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it5 = this.f338175f.keySet().iterator();
        while (it5.hasNext()) {
            sb.append(it5.next());
            if (it5.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
