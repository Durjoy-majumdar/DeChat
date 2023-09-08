package oz3;

import com.tencent.xweb.file.XVFSFile;
import e04.C24469d;
import gy3.C87412m;
import j04.C108521t;
import l04.C24893h;
import l04.C34153g;
import pz3.C25505a;
import qz3.C26046l;
import sz3.C26243c;
import sz3.C26245e;
import tz3.C26349a;
import uz3.C111238e;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26524z0;
import xz3.C26593h;
import z04.C112550d0;

/* renamed from: oz3.k */
public final class C25383k implements C24893h {

    /* renamed from: b */
    public final C24469d f71924b;

    /* renamed from: c */
    public final C24469d f71925c;

    /* renamed from: d */
    public final C25395q f71926d;

    public C25383k(C25395q qVar, C26046l lVar, C26243c cVar, C108521t<C111238e> tVar, boolean z, C34153g gVar) {
        C87412m.m108594g(qVar, "kotlinClass");
        C87412m.m108594g(lVar, "packageProto");
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(gVar, "abiStability");
        C24469d b = C24469d.m30612b(qVar.mo37228f());
        C25505a b2 = qVar.mo37224b();
        boolean z2 = true;
        C24469d dVar = null;
        String str = !(b2.f72189a == C25505a.C25506a.MULTIFILE_CLASS_PART) ? null : b2.f72194f;
        if (str != null) {
            if (str.length() <= 0 ? false : z2) {
                dVar = C24469d.m30614d(str);
            }
        }
        this.f71924b = b;
        this.f71925c = dVar;
        this.f71926d = qVar;
        C26593h.C26600f<C26046l, Integer> fVar = C26349a.f73465m;
        C87412m.m108593f(fVar, "packageModuleName");
        Integer num = (Integer) C26245e.m33733a(lVar, fVar);
        if (num != null) {
            cVar.getString(num.intValue());
        }
    }

    /* renamed from: a */
    public C26524z0 mo37215a() {
        return C26524z0.f73810a;
    }

    /* renamed from: b */
    public String mo51905b() {
        return "Class '" + mo52578d().mo53387b().mo35973b() + '\'';
    }

    /* renamed from: d */
    public final C26408b mo52578d() {
        C22826c cVar;
        C24469d dVar = this.f71924b;
        int lastIndexOf = dVar.f69986a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = C22826c.f65627c;
            if (cVar == null) {
                C24469d.m30611a(7);
                throw null;
            }
        } else {
            cVar = new C22826c(dVar.f69986a.substring(0, lastIndexOf).replace(XVFSFile.SEPARATOR_CHAR, '.'));
        }
        String e = this.f71924b.mo51171e();
        C87412m.m108593f(e, "className.internalName");
        return new C26408b(cVar, C22830f.m26794f(C112550d0.m153793c0(e, XVFSFile.SEPARATOR_CHAR, e)));
    }

    public String toString() {
        return C25383k.class.getSimpleName() + ": " + this.f71924b;
    }
}
