package qy3;

import gy3.C24557d;
import gy3.C24561h0;
import gy3.C24562j;
import gy3.C24563k;
import gy3.C24567p;
import gy3.C24569r;
import gy3.C24572v;
import gy3.C24574x;
import gy3.C87412m;
import gy3.C87413o;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import n04.C25143j0;
import ny3.C109824f;
import ny3.C25235d;
import ny3.C25237g;
import ny3.C25238h;
import ny3.C25241k;
import ny3.C25243l;
import ny3.C89102i;
import py3.C25504b;
import qz3.C26041i;
import qz3.C26079t;
import sx3.C110818d0;
import sz3.C26247g;
import uz3.C111238e;
import uz3.C118638a;
import uz3.C26378f;
import uz3.C26380h;
import wy3.C26463h1;
import wy3.C26516w;
import wy3.C26520x0;
import x04.C26527a;
import x04.C26529b;
import x04.C38441e;
import xz3.C26585b;
import xz3.C26586d;
import xz3.C26589f;
import xz3.C26601j;
import xz3.C26607p;

/* renamed from: qy3.o0 */
public class C25973o0 extends C24561h0 {
    /* renamed from: j */
    public static C22167o m33138j(C24557d dVar) {
        C109824f owner = dVar.getOwner();
        return owner instanceof C22167o ? (C22167o) owner : C22151b.f62670e;
    }

    /* renamed from: a */
    public C25237g mo51267a(C24563k kVar) {
        C22167o j = m33138j(kVar);
        String name = kVar.getName();
        String signature = kVar.getSignature();
        Object boundReceiver = kVar.getBoundReceiver();
        C87412m.m108594g(j, "container");
        C87412m.m108594g(name, "name");
        C87412m.m108594g(signature, "signature");
        return new C25978s(j, name, signature, (C26516w) null, boundReceiver);
    }

    /* renamed from: b */
    public C25235d mo51268b(Class cls) {
        Class<T> cls2;
        V v;
        C26529b<String, Object> bVar = C25941k.f72305a;
        C87412m.m108594g(cls, "jClass");
        String name = cls.getName();
        C26529b<String, Object> bVar2 = C25941k.f72305a;
        bVar2.getClass();
        C26527a aVar = (C26527a) bVar2.f73817a.f73826a.mo53485a((long) name.hashCode());
        if (aVar == null) {
            aVar = C26527a.f73811g;
        }
        while (true) {
            cls2 = null;
            if (aVar == null || aVar.f73814f <= 0) {
                v = null;
            } else {
                C38441e eVar = (C38441e) aVar.f73812d;
                if (eVar.f101397d.equals(name)) {
                    v = eVar.f101398e;
                    break;
                }
                aVar = aVar.f73813e;
            }
        }
        v = null;
        if (v instanceof WeakReference) {
            C25943l lVar = (C25943l) ((WeakReference) v).get();
            if (lVar != null) {
                cls2 = lVar.f72307e;
            }
            if (C87412m.m108589b(cls2, cls)) {
                return lVar;
            }
        } else if (v != null) {
            for (WeakReference weakReference : (WeakReference[]) v) {
                C25943l lVar2 = (C25943l) weakReference.get();
                if (C87412m.m108589b(lVar2 != null ? lVar2.f72307e : null, cls)) {
                    return lVar2;
                }
            }
            int length = ((Object[]) v).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(v, 0, weakReferenceArr, 0, length);
            C25943l lVar3 = new C25943l(cls);
            weakReferenceArr[length] = new WeakReference(lVar3);
            C25941k.f72305a = C25941k.f72305a.mo53484a(name, weakReferenceArr);
            return lVar3;
        }
        C25943l lVar4 = new C25943l(cls);
        C25941k.f72305a = C25941k.f72305a.mo53484a(name, new WeakReference(lVar4));
        return lVar4;
    }

    /* renamed from: c */
    public C109824f mo51269c(Class cls, String str) {
        return new C25991x(cls, str);
    }

    /* renamed from: d */
    public C25238h mo51270d(C24567p pVar) {
        return new C25981t(m33138j(pVar), pVar.getName(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    /* renamed from: e */
    public C89102i mo51271e(C24569r rVar) {
        return new C25984u(m33138j(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    /* renamed from: f */
    public C25241k mo51272f(C24572v vVar) {
        return new C26003z(m33138j(vVar), vVar.getName(), vVar.getSignature(), vVar.getBoundReceiver());
    }

    /* renamed from: g */
    public C25243l mo51273g(C24574x xVar) {
        return new C25906a0(m33138j(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    /* renamed from: h */
    public String mo51274h(C24562j jVar) {
        C25978s a;
        C87412m.m108594g(jVar, "<this>");
        Metadata metadata = (Metadata) jVar.getClass().getAnnotation(Metadata.class);
        C25978s sVar = null;
        if (metadata != null) {
            String[] d1 = metadata.mo182093d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                String[] d2 = metadata.mo182094d2();
                C26380h hVar = C26380h.f73581a;
                C87412m.m108594g(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C118638a.m167311b(d1));
                C26378f g = C26380h.f73581a.mo53367g(byteArrayInputStream, d2);
                C26589f fVar = C26380h.f73582b;
                C26585b bVar = (C26585b) C26041i.f72621B;
                bVar.getClass();
                C26586d dVar = new C26586d(byteArrayInputStream);
                C26607p pVar = (C26607p) bVar.mo52860a(dVar, fVar);
                try {
                    dVar.mo53517a(0);
                    bVar.mo53515b(pVar);
                    C26041i iVar = (C26041i) pVar;
                    int[] mv = metadata.mo182096mv();
                    if ((metadata.mo182098xi() & 8) == 0) {
                        z = false;
                    }
                    C111238e eVar = new C111238e(mv, z);
                    Class<?> cls = jVar.getClass();
                    C26079t tVar = iVar.f72636v;
                    C87412m.m108593f(tVar, "proto.typeTable");
                    sVar = new C25978s(C22151b.f62670e, (C26520x0) C25987u0.m33173d(cls, iVar, g, new C26247g(tVar), eVar, C25504b.f72188d));
                } catch (C26601j e) {
                    e.f74023d = pVar;
                    throw e;
                }
            }
        }
        if (sVar == null || (a = C25987u0.m33170a(sVar)) == null) {
            return super.mo51274h(jVar);
        }
        C25974p0 p0Var = C25974p0.f72353a;
        C26516w r = a.mo52805n();
        StringBuilder sb = new StringBuilder();
        p0Var.mo52837a(sb, r);
        List<C26463h1> h = r.mo52639h();
        C87412m.m108593f(h, "invoke.valueParameters");
        C110818d0.m150920R(h, sb, ", ", "(", ")", 0, (CharSequence) null, C25976q0.f72356d, 48, (Object) null);
        sb.append(" -> ");
        C25143j0 returnType = r.getReturnType();
        C87412m.m108591d(returnType);
        sb.append(p0Var.mo52840d(returnType));
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: i */
    public String mo51275i(C87413o oVar) {
        return mo51274h(oVar);
    }
}
