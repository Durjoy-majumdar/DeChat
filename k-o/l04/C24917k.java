package l04;

import com.google.firebase.analytics.FirebaseAnalytics;
import dz3.C24465a;
import ez3.C24473b;
import ez3.C24476d;
import fy3.C32226l;
import g04.C24531d;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C64187h0;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26465i0;
import wy3.C26469k;
import yy3.C26642b;

/* renamed from: l04.k */
public class C24917k extends C24895j {

    /* renamed from: g */
    public final C26465i0 f70985g;

    /* renamed from: h */
    public final String f70986h;

    /* renamed from: i */
    public final C22826c f70987i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24917k(wy3.C26465i0 r17, qz3.C26046l r18, sz3.C26243c r19, sz3.C110828a r20, l04.C24893h r21, j04.C24763k r22, java.lang.String r23, fy3.C32224a<? extends java.util.Collection<vz3.C22830f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r0 = r18
            r15 = r23
            java.lang.String r1 = "packageDescriptor"
            gy3.C87412m.m108594g(r14, r1)
            java.lang.String r1 = "proto"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r19
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r20
            gy3.C87412m.m108594g(r3, r1)
            java.lang.String r1 = "components"
            r4 = r22
            gy3.C87412m.m108594g(r4, r1)
            java.lang.String r1 = "debugName"
            gy3.C87412m.m108594g(r15, r1)
            java.lang.String r1 = "classNames"
            r5 = r24
            gy3.C87412m.m108594g(r5, r1)
            sz3.g r10 = new sz3.g
            qz3.t r1 = r0.f72667j
            java.lang.String r7 = "proto.typeTable"
            gy3.C87412m.m108593f(r1, r7)
            r10.<init>(r1)
            sz3.h$a r1 = sz3.C26248h.f73183b
            qz3.w r7 = r0.f72668n
            java.lang.String r8 = "proto.versionRequirementTable"
            gy3.C87412m.m108593f(r7, r8)
            sz3.h r11 = r1.mo53148a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            j04.m r1 = r7.mo51742a(r8, r9, r10, r11, r12, r13)
            java.util.List<qz3.i> r2 = r0.f72664g
            java.lang.String r3 = "proto.functionList"
            gy3.C87412m.m108593f(r2, r3)
            java.util.List<qz3.n> r3 = r0.f72665h
            java.lang.String r4 = "proto.propertyList"
            gy3.C87412m.m108593f(r3, r4)
            java.util.List<qz3.r> r4 = r0.f72666i
            java.lang.String r0 = "proto.typeAliasList"
            gy3.C87412m.m108593f(r4, r0)
            r0 = r16
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f70985g = r14
            r6.f70986h = r15
            vz3.c r0 = r17.mo53444d()
            r6.f70987i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l04.C24917k.<init>(wy3.i0, qz3.l, sz3.c, sz3.a, l04.h, j04.k, java.lang.String, fy3.a):void");
    }

    /* renamed from: e */
    public Collection mo32460e(C24531d dVar, C32226l lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        Collection<C26469k> i = mo51906i(dVar, lVar, C24476d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<C26642b> iterable = this.f70932b.f70643a.f70632k;
        ArrayList arrayList = new ArrayList();
        for (C26642b b : iterable) {
            C64175a0.m75508p(arrayList, b.mo53352b(this.f70987i));
        }
        return C110818d0.m150933e0(i, arrayList);
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C24465a.m30603b(this.f70932b.f70643a.f70630i, bVar, this.f70985g, fVar);
        return super.mo32462g(fVar, bVar);
    }

    /* renamed from: h */
    public void mo51895h(Collection<C26469k> collection, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(collection, "result");
        C87412m.m108594g(lVar, "nameFilter");
    }

    /* renamed from: l */
    public C26408b mo51898l(C22830f fVar) {
        C87412m.m108594g(fVar, "name");
        return new C26408b(this.f70987i, fVar);
    }

    /* renamed from: n */
    public Set<C22830f> mo51899n() {
        return C64187h0.f181908d;
    }

    /* renamed from: o */
    public Set<C22830f> mo51900o() {
        return C64187h0.f181908d;
    }

    /* renamed from: p */
    public Set<C22830f> mo51901p() {
        return C64187h0.f181908d;
    }

    /* renamed from: q */
    public boolean mo51908q(C22830f fVar) {
        boolean z;
        C87412m.m108594g(fVar, "name");
        if (super.mo51908q(fVar)) {
            return true;
        }
        Iterable<C26642b> iterable = this.f70932b.f70643a.f70632k;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator<C26642b> it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo53353c(this.f70987i, fVar)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    public String toString() {
        return this.f70986h;
    }
}
