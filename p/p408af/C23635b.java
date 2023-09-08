package p408af;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import p276y9.C23281e;
import p276y9.C23282o;
import p276y9.C26626a;
import p276y9.C26627b;
import p276y9.C26632h;
import p425ze.C26698d;
import p425ze.C26702e;
import p425ze.C26704i;
import p425ze.C91672j;

/* renamed from: af.b */
public final class C23635b {

    /* renamed from: a */
    public final C26698d f67824a;

    /* renamed from: b */
    public final Queue<C26704i> f67825b = new LinkedList();

    /* renamed from: c */
    public final Queue<C26704i> f67826c = new LinkedList();

    /* renamed from: d */
    public final Set<C26632h> f67827d = new HashSet();

    /* renamed from: e */
    public final Set<C26632h> f67828e = new HashSet();

    /* renamed from: f */
    public final Set<C26632h> f67829f = new HashSet();

    /* renamed from: g */
    public boolean f67830g;

    /* renamed from: af.b$a */
    public static final class C23636a {

        /* renamed from: a */
        public final C26704i f67831a;

        /* renamed from: b */
        public final boolean f67832b;

        public C23636a(C26704i iVar, boolean z) {
            this.f67831a = iVar;
            this.f67832b = z;
        }
    }

    public C23635b(C26698d dVar) {
        this.f67824a = dVar;
    }

    /* renamed from: a */
    public final void mo37181a(C26702e eVar, C26704i iVar, C26632h hVar, String str, C91672j.C91674b bVar) {
        boolean z;
        if (hVar != null) {
            Set<String> set = C23281e.f66913a;
            boolean z2 = true;
            if (!(hVar instanceof C26626a)) {
                z = false;
            } else {
                C26626a aVar = (C26626a) hVar;
                z = aVar.f74066h != C23282o.OBJECT ? true : ((HashSet) C23281e.f66913a).contains(aVar.mo53605b().f74070h);
            }
            if (!z) {
                if (!(!(hVar instanceof C26627b) ? false : ((HashSet) C23281e.f66913a).contains(((C26627b) hVar).mo53605b().f74070h)) && !((HashSet) this.f67827d).contains(hVar)) {
                    boolean z3 = eVar == null;
                    if (z3 || !((HashSet) this.f67828e).contains(hVar)) {
                        if (this.f67830g) {
                            if (hVar.mo53605b() == null || !hVar.mo53605b().f74070h.equals(String.class.getName())) {
                                z2 = false;
                            }
                            if (z2) {
                                return;
                            }
                        }
                        if (!((HashSet) this.f67829f).contains(hVar)) {
                            C26704i iVar2 = new C26704i(eVar, hVar, iVar, str, bVar);
                            if (z3) {
                                ((HashSet) this.f67827d).add(hVar);
                                ((LinkedList) this.f67825b).add(iVar2);
                                return;
                            }
                            ((HashSet) this.f67828e).add(hVar);
                            ((LinkedList) this.f67826c).add(iVar2);
                        }
                    }
                }
            }
        }
    }
}
