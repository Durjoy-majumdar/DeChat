package oz3;

import androidx.exifinterface.media.ExifInterface;
import b04.C23649g;
import b04.C23651i;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import oz3.C25395q;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26521y0;
import z04.C112550d0;

/* renamed from: oz3.b */
public final class C25362b implements C25395q.C25399d {

    /* renamed from: a */
    public final /* synthetic */ C25356a<Object, Object> f71865a;

    /* renamed from: b */
    public final /* synthetic */ HashMap<C21909t, List<Object>> f71866b;

    /* renamed from: c */
    public final /* synthetic */ C25395q f71867c;

    /* renamed from: d */
    public final /* synthetic */ HashMap<C21909t, Object> f71868d;

    /* renamed from: oz3.b$a */
    public final class C25363a extends C25364b implements C25395q.C25400e {

        /* renamed from: d */
        public final /* synthetic */ C25362b f71869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25363a(C25362b bVar, C21909t tVar) {
            super(bVar, tVar);
            C87412m.m108594g(tVar, "signature");
            this.f71869d = bVar;
        }

        /* renamed from: b */
        public C25395q.C25396a mo52551b(int i, C26408b bVar, C26521y0 y0Var) {
            C87412m.m108594g(bVar, "classId");
            C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
            C21909t tVar = this.f71870a;
            C87412m.m108594g(tVar, "signature");
            C21909t tVar2 = new C21909t(tVar.f61966a + '@' + i, (C8480h) null);
            List list = this.f71869d.f71866b.get(tVar2);
            if (list == null) {
                list = new ArrayList();
                this.f71869d.f71866b.put(tVar2, list);
            }
            return this.f71869d.f71865a.mo52558u(bVar, y0Var, list);
        }
    }

    /* renamed from: oz3.b$b */
    public class C25364b implements C25395q.C25398c {

        /* renamed from: a */
        public final C21909t f71870a;

        /* renamed from: b */
        public final ArrayList<Object> f71871b = new ArrayList<>();

        /* renamed from: c */
        public final /* synthetic */ C25362b f71872c;

        public C25364b(C25362b bVar, C21909t tVar) {
            C87412m.m108594g(tVar, "signature");
            this.f71872c = bVar;
            this.f71870a = tVar;
        }

        /* renamed from: a */
        public void mo35570a() {
            if (!this.f71871b.isEmpty()) {
                this.f71872c.f71866b.put(this.f71870a, this.f71871b);
            }
        }

        /* renamed from: c */
        public C25395q.C25396a mo35571c(C26408b bVar, C26521y0 y0Var) {
            C87412m.m108594g(bVar, "classId");
            C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
            return this.f71872c.f71865a.mo52558u(bVar, y0Var, this.f71871b);
        }
    }

    public C25362b(C25356a<Object, Object> aVar, HashMap<C21909t, List<Object>> hashMap, C25395q qVar, HashMap<C21909t, Object> hashMap2, HashMap<C21909t, Object> hashMap3) {
        this.f71865a = aVar;
        this.f71866b = hashMap;
        this.f71867c = qVar;
        this.f71868d = hashMap3;
    }

    /* renamed from: a */
    public C25395q.C25400e mo52549a(C22830f fVar, String str) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(str, "desc");
        String b = fVar.mo35995b();
        C87412m.m108593f(b, "name.asString()");
        return new C25363a(this, new C21909t(b + str, (C8480h) null));
    }

    /* renamed from: b */
    public C25395q.C25398c mo52550b(C22830f fVar, String str, Object obj) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(str, "desc");
        String b = fVar.mo35995b();
        C87412m.m108593f(b, "name.asString()");
        C21909t tVar = new C21909t(b + '#' + str, (C8480h) null);
        if (obj != null) {
            ((C25370d) this.f71865a).getClass();
            boolean z = false;
            if (C112550d0.m153801u("ZBCS", str, false)) {
                int intValue = ((Integer) obj).intValue();
                int hashCode = str.hashCode();
                if (hashCode != 66) {
                    if (hashCode != 67) {
                        if (hashCode != 83) {
                            if (hashCode == 90 && str.equals("Z")) {
                                if (intValue != 0) {
                                    z = true;
                                }
                                obj = Boolean.valueOf(z);
                            }
                        } else if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                            obj = Short.valueOf((short) intValue);
                        }
                    } else if (str.equals("C")) {
                        obj = Character.valueOf((char) intValue);
                    }
                } else if (str.equals("B")) {
                    obj = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(str);
            }
            C23649g<?> b2 = C23651i.f67841a.mo37200b(obj);
            if (b2 != null) {
                this.f71868d.put(tVar, b2);
            }
        }
        return new C25364b(this, tVar);
    }
}
