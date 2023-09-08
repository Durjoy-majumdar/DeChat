package nz3;

import fy3.C32226l;
import fz3.C24497b0;
import fz3.C24502e;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import n04.C25143j0;
import o04.C25315b;
import o04.C25335o;
import q04.C25526i;
import q04.C25531o;
import q04.C25532p;

/* renamed from: nz3.a */
public abstract class C25257a<TAnnotation> {

    /* renamed from: nz3.a$a */
    public static final class C25258a {

        /* renamed from: a */
        public final C25526i f71727a;

        /* renamed from: b */
        public final C24497b0 f71728b;

        /* renamed from: c */
        public final C25531o f71729c;

        public C25258a(C25526i iVar, C24497b0 b0Var, C25531o oVar) {
            this.f71727a = iVar;
            this.f71728b = b0Var;
            this.f71729c = oVar;
        }
    }

    /* renamed from: nz3.a$b */
    public static final class C25259b extends C87413o implements C32226l<C25258a, Iterable<? extends C25258a>> {

        /* renamed from: d */
        public final /* synthetic */ C25257a<TAnnotation> f71730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25259b(C25257a<TAnnotation> aVar, C25532p pVar) {
            super(1);
            this.f71730d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r2 = o04.C25335o.f71846a;
            r0 = o04.C25315b.C25316a.m32258g(r2, r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r13) {
            /*
                r12 = this;
                nz3.a$a r13 = (nz3.C25257a.C25258a) r13
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r13, r0)
                nz3.a<TAnnotation> r0 = r12.f71730d
                nz3.u r0 = (nz3.C25308u) r0
                boolean r0 = r0.f71808e
                r1 = 0
                if (r0 == 0) goto L_0x0026
                q04.i r0 = r13.f71727a
                if (r0 == 0) goto L_0x0021
                o04.o r2 = o04.C25335o.f71846a
                q04.g r0 = o04.C25315b.C25316a.m32258g(r2, r0)
                if (r0 == 0) goto L_0x0021
                q04.j r0 = o04.C25315b.C25316a.m32260h(r2, r0)
                goto L_0x0022
            L_0x0021:
                r0 = r1
            L_0x0022:
                if (r0 == 0) goto L_0x0026
                goto L_0x00ac
            L_0x0026:
                q04.i r0 = r13.f71727a
                if (r0 == 0) goto L_0x00ac
                o04.o r2 = o04.C25335o.f71846a
                q04.n r0 = o04.C25315b.C25316a.m32269l0(r2, r0)
                if (r0 == 0) goto L_0x00ac
                java.util.List r0 = o04.C25315b.C25316a.m32281s(r2, r0)
                q04.i r3 = r13.f71727a
                java.util.List r3 = o04.C25315b.C25316a.m32276p(r2, r3)
                nz3.a<TAnnotation> r4 = r12.f71730d
                java.util.Iterator r5 = r0.iterator()
                java.util.Iterator r6 = r3.iterator()
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r0 = sx3.C36907w.m41090l(r0, r8)
                int r3 = sx3.C36907w.m41090l(r3, r8)
                int r0 = java.lang.Math.min(r0, r3)
                r7.<init>(r0)
            L_0x0059:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x00ab
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x00ab
                java.lang.Object r0 = r5.next()
                java.lang.Object r3 = r6.next()
                q04.m r3 = (q04.C25529m) r3
                q04.o r0 = (q04.C25531o) r0
                boolean r8 = o04.C25315b.C25316a.m32241V(r2, r3)
                if (r8 == 0) goto L_0x007f
                nz3.a$a r3 = new nz3.a$a
                fz3.b0 r8 = r13.f71728b
                r3.<init>(r1, r8, r0)
                goto L_0x00a7
            L_0x007f:
                q04.i r3 = o04.C25315b.C25316a.m32285w(r2, r3)
                nz3.a$a r8 = new nz3.a$a
                fz3.b0 r9 = r13.f71728b
                r4.getClass()
                r10 = r4
                nz3.u r10 = (nz3.C25308u) r10
                iz3.h r10 = r10.f71806c
                iz3.c r10 = r10.f70290a
                fz3.e r10 = r10.f70272q
                java.lang.String r11 = "<this>"
                gy3.C87412m.m108594g(r3, r11)
                r11 = r3
                n04.j0 r11 = (n04.C25143j0) r11
                xy3.h r11 = r11.getAnnotations()
                fz3.b0 r9 = r10.mo51182b(r9, r11)
                r8.<init>(r3, r9, r0)
                r3 = r8
            L_0x00a7:
                r7.add(r3)
                goto L_0x0059
            L_0x00ab:
                r1 = r7
            L_0x00ac:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: nz3.C25257a.C25259b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final <T> void mo52374a(T t, List<T> list, C32226l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t);
        Iterable<Object> iterable = (Iterable) lVar.invoke(t);
        if (iterable != null) {
            for (Object a : iterable) {
                mo52374a(a, list, lVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00db  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nz3.C25270k mo52375b(q04.C25531o r8) {
        /*
            r7 = this;
            o04.o r0 = o04.C25335o.f71846a
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r8, r1)
            boolean r2 = r8 instanceof jz3.C24851v
            r3 = 0
            if (r2 != 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.List r8 = o04.C25315b.C25316a.m32220A(r0, r8)
            boolean r2 = r8.isEmpty()
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x001a
            goto L_0x0032
        L_0x001a:
            java.util.Iterator r2 = r8.iterator()
        L_0x001e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0032
            java.lang.Object r6 = r2.next()
            q04.i r6 = (q04.C25526i) r6
            boolean r6 = o04.C25315b.C25316a.m32232M(r0, r6)
            if (r6 != 0) goto L_0x001e
            r2 = 0
            goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            if (r2 == 0) goto L_0x0036
            return r3
        L_0x0036:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            java.util.Iterator r2 = r8.iterator()
        L_0x0041:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x005a
            java.lang.Object r6 = r2.next()
            q04.i r6 = (q04.C25526i) r6
            nz3.j r6 = r7.mo52376c(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            if (r6 == 0) goto L_0x0041
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            if (r2 == 0) goto L_0x005f
            r2 = r8
            goto L_0x00af
        L_0x005f:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0066
            goto L_0x0088
        L_0x0066:
            java.util.Iterator r2 = r8.iterator()
        L_0x006a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r2.next()
            q04.i r6 = (q04.C25526i) r6
            gy3.C87412m.m108594g(r6, r1)
            n04.j0 r6 = (n04.C25143j0) r6
            n04.j0 r6 = n04.C25194x1.m32120a(r6)
            if (r6 == 0) goto L_0x0083
            r6 = 1
            goto L_0x0084
        L_0x0083:
            r6 = 0
        L_0x0084:
            if (r6 == 0) goto L_0x006a
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x00df
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x0094:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00af
            java.lang.Object r6 = r3.next()
            q04.i r6 = (q04.C25526i) r6
            gy3.C87412m.m108594g(r6, r1)
            n04.j0 r6 = (n04.C25143j0) r6
            n04.j0 r6 = n04.C25194x1.m32120a(r6)
            if (r6 == 0) goto L_0x0094
            r2.add(r6)
            goto L_0x0094
        L_0x00af:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00b6
            goto L_0x00ce
        L_0x00b6:
            java.util.Iterator r1 = r2.iterator()
        L_0x00ba:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ce
            java.lang.Object r3 = r1.next()
            q04.i r3 = (q04.C25526i) r3
            boolean r3 = o04.C25315b.C25316a.m32238S(r0, r3)
            if (r3 != 0) goto L_0x00ba
            r0 = 0
            goto L_0x00cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            if (r0 == 0) goto L_0x00d4
            nz3.j r0 = nz3.C25269j.NULLABLE
            goto L_0x00d6
        L_0x00d4:
            nz3.j r0 = nz3.C25269j.NOT_NULL
        L_0x00d6:
            nz3.k r3 = new nz3.k
            if (r2 == r8) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            r3.<init>(r0, r4)
        L_0x00df:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nz3.C25257a.mo52375b(q04.o):nz3.k");
    }

    /* renamed from: c */
    public final C25269j mo52376c(C25526i iVar) {
        C25335o oVar = C25335o.f71846a;
        if (C25315b.C25316a.m32236Q(oVar, C25315b.C25316a.m32247a0(oVar, iVar))) {
            return C25269j.NULLABLE;
        }
        if (!C25315b.C25316a.m32236Q(oVar, C25315b.C25316a.m32275o0(oVar, iVar))) {
            return C25269j.NOT_NULL;
        }
        return null;
    }

    /* renamed from: d */
    public final List<C25258a> mo52377d(C25526i iVar) {
        C25335o oVar = C25335o.f71846a;
        C25308u uVar = (C25308u) this;
        C24502e eVar = uVar.f71806c.f70290a.f70272q;
        C87412m.m108594g(iVar, "<this>");
        C25258a aVar = new C25258a(iVar, eVar.mo51182b((C24497b0) uVar.f71806c.f70293d.getValue(), ((C25143j0) iVar).getAnnotations()), (C25531o) null);
        C25259b bVar = new C25259b(this, oVar);
        ArrayList arrayList = new ArrayList(1);
        mo52374a(aVar, arrayList, bVar);
        return arrayList;
    }
}
