package g04;

import ez3.C24473b;
import fy3.C32226l;
import g04.C20770i;
import java.util.Collection;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26469k;

/* renamed from: g04.l */
public interface C20774l {

    /* renamed from: g04.l$a */
    public static final class C20775a {
        /* renamed from: a */
        public static Collection m22732a(C20774l lVar, C24531d dVar, C32226l<C22830f, Boolean> lVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = C24531d.f70104m;
                }
                if ((i & 2) != 0) {
                    C20770i.f58680a.getClass();
                    lVar2 = C20770i.C20771a.f58682b;
                }
                return lVar.mo32460e(dVar, lVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: e */
    Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar);

    /* renamed from: g */
    C22935h mo32462g(C22830f fVar, C24473b bVar);
}
