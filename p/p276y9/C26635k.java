package p276y9;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import p1224z9.C119086a;
import p276y9.C26628c;
import p291aa.C23626e;
import p291aa.C23631j;
import p291aa.C23632k;
import p398x9.C23034a;
import p398x9.C23035c;
import p398x9.C23051e;
import p398x9.C23053f;

/* renamed from: y9.k */
public class C26635k {

    /* renamed from: a */
    public final C119086a f74116a;

    /* renamed from: b */
    public ArrayList<C26630f> f74117b = new ArrayList<>();

    /* renamed from: c */
    public C26630f f74118c;

    /* renamed from: d */
    public C23626e<C26628c> f74119d = new C23626e<>();

    /* renamed from: e */
    public int[] f74120e;

    /* renamed from: f */
    public long f74121f = Util.MAX_32BIT_VALUE;

    static {
        new ArrayList();
    }

    public C26635k(C119086a aVar) {
        this.f74116a = aVar;
        mo53643j(0, "default");
    }

    /* renamed from: a */
    public final void mo53634a(C26633i iVar) {
        C26630f fVar = this.f74118c;
        fVar.f74082d.size();
        iVar.getClass();
        fVar.f74082d.add(iVar);
        iVar.f74095f = this.f74118c;
    }

    /* renamed from: b */
    public final C26628c mo53635b(long j) {
        for (int i = 0; i < this.f74117b.size(); i++) {
            C26628c s = this.f74117b.get(i).f74084f.mo37171s(j);
            if (s != null) {
                return s;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: y9.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p276y9.C26628c mo53636c(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            java.util.ArrayList<y9.f> r1 = r5.f74117b
            int r1 = r1.size()
            r2 = 0
            if (r0 >= r1) goto L_0x0049
            java.util.ArrayList<y9.f> r1 = r5.f74117b
            java.lang.Object r1 = r1.get(r0)
            y9.f r1 = (p276y9.C26630f) r1
            x9.l<java.lang.String, y9.c> r1 = r1.f74085g
            x9.a r1 = (p398x9.C23034a) r1
            java.util.Map<K, java.util.Collection<V>> r3 = r1.f66232g
            java.lang.Object r3 = r3.get(r6)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 != 0) goto L_0x002b
            r3 = r1
            x9.f r3 = (p398x9.C23053f) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = r3.f66268i
            r4.<init>(r3)
            r3 = r4
        L_0x002b:
            java.util.Collection r1 = r1.mo36353c(r6, r3)
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            r4 = 1
            if (r3 != r4) goto L_0x0043
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            r2 = r1
            y9.c r2 = (p276y9.C26628c) r2
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            return r2
        L_0x0046:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p276y9.C26635k.mo53636c(java.lang.String):y9.c");
    }

    /* renamed from: d */
    public final C26632h mo53637d(long j) {
        for (int i = 0; i < this.f74117b.size(); i++) {
            C26632h s = this.f74117b.get(i).f74086h.mo37171s(j);
            if (s != null) {
                return s;
            }
        }
        return mo53635b(j);
    }

    /* renamed from: e */
    public final C26636m mo53638e(int i) {
        return this.f74118c.f74081c.get(i);
    }

    /* renamed from: f */
    public final C26636m mo53639f(int i, int i2) {
        C26636m mVar = this.f74118c.f74081c.get(i);
        if (mVar == null) {
            return mVar;
        }
        C26636m mVar2 = new C26636m();
        C26636m mVar3 = mVar.f74122a;
        if (mVar3 != null) {
            mVar2.f74122a = mVar3;
        } else {
            mVar2.f74122a = mVar;
        }
        return mVar2;
    }

    /* renamed from: g */
    public final C26637n mo53640g(int i) {
        return this.f74118c.f74083e.get(i);
    }

    /* renamed from: h */
    public void mo53641h() {
        C26628c c = mo53636c("java.lang.Class");
        int i = c != null ? c.f74075p : 0;
        Iterator<C26630f> it = this.f74117b.iterator();
        while (it.hasNext()) {
            C26630f next = it.next();
            C23035c cVar = (C23035c) next.f74085g;
            Collection collection = cVar.f66265e;
            if (collection == null) {
                collection = new C23051e.C23052a();
                cVar.f66265e = collection;
            }
            Iterator it4 = ((C23051e.C23052a) collection).iterator();
            while (true) {
                C23035c.C23050b bVar = (C23035c.C23050b) it4;
                if (!bVar.hasNext()) {
                    break;
                }
                C26628c cVar2 = (C26628c) bVar.next();
                C26628c i2 = cVar2.mo53617i();
                if (i2 != null) {
                    ((HashSet) i2.f74077r).add(cVar2);
                }
                int i3 = i;
                for (C23280d dVar : cVar2.f74074o) {
                    i3 += this.f74120e[dVar.f66911a.f66919d];
                }
                cVar2.f74096g = i3;
            }
            ArrayList arrayList = new ArrayList(next.f74086h.f67798d);
            V[] vArr = next.f74086h.f67816i;
            int length = vArr.length;
            while (true) {
                int i4 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (C23631j.m28256v(vArr, i4)) {
                    V v = vArr[i4];
                    if (v == C23632k.f67820o) {
                        v = null;
                    }
                    arrayList.add((C26632h) v);
                }
                length = i4;
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C26632h hVar = (C26632h) it5.next();
                C26628c b = hVar.mo53605b();
                if (b != null) {
                    int i5 = next.f74079a;
                    if (hVar instanceof C26627b) {
                        hVar.f74096g = b.f74075p;
                    }
                    C26628c.C26629a aVar = b.f74076q.get(i5);
                    if (aVar == null) {
                        aVar = new C26628c.C26629a();
                        b.f74076q.mo37166v(i5, aVar);
                    }
                    ((ArrayList) aVar.f74078a).add(hVar);
                    hVar.mo53606c();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo53642i() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f74117b.size(); i++) {
            C23034a aVar = (C23034a) this.f74117b.get(i).f74085g;
            Collection collection = aVar.f66232g.get("java.lang.ref.Reference");
            if (collection == null) {
                collection = new ArrayList(((C23053f) aVar).f66268i);
            }
            arrayList.addAll((List) aVar.mo36353c("java.lang.ref.Reference", collection));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C26628c cVar = (C26628c) it.next();
            cVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            Stack stack = new Stack();
            stack.push(cVar);
            while (!stack.isEmpty()) {
                C26628c cVar2 = (C26628c) stack.pop();
                arrayList3.add(cVar2);
                Iterator it4 = ((HashSet) cVar2.f74077r).iterator();
                while (it4.hasNext()) {
                    stack.push((C26628c) it4.next());
                }
            }
            arrayList2.addAll(arrayList3);
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            C26628c cVar3 = (C26628c) it5.next();
            cVar3.getClass();
            this.f74119d.add(cVar3);
        }
    }

    /* renamed from: j */
    public C26630f mo53643j(int i, String str) {
        C26630f fVar;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f74117b.size()) {
                fVar = null;
                break;
            } else if (this.f74117b.get(i2).f74079a == i) {
                fVar = this.f74117b.get(i2);
                break;
            } else {
                i2++;
            }
        }
        if (fVar == null) {
            fVar = new C26630f(i, str);
            fVar.f74087i = this;
            this.f74117b.add(fVar);
        }
        this.f74118c = fVar;
        return fVar;
    }

    /* renamed from: k */
    public final void mo53644k(int i) {
        int i2 = -1;
        for (C23282o oVar : C23282o.values()) {
            i2 = Math.max(oVar.f66919d, i2);
        }
        int[] iArr = new int[(i2 + 1)];
        this.f74120e = iArr;
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < C23282o.values().length; i3++) {
            this.f74120e[C23282o.values()[i3].f66919d] = C23282o.values()[i3].f66920e;
        }
        int[] iArr2 = this.f74120e;
        C23282o oVar2 = C23282o.OBJECT;
        iArr2[2] = i;
        this.f74121f = -1 >>> ((8 - i) << 3);
    }
}
