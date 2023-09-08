package p735w1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p1166z0.C112541g;
import p146e2.C107159c;
import p146e2.C107160d;
import p436a1.C103257q;
import p436a1.C103262s;
import p436a1.C103264s0;
import p544h2.C108014f;
import p560i2.C108319b;
import p560i2.C108321c;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C64197v;

/* renamed from: w1.d */
public final class C111687d {

    /* renamed from: a */
    public final C111688e f334314a;

    /* renamed from: b */
    public final int f334315b;

    /* renamed from: c */
    public final boolean f334316c;

    /* renamed from: d */
    public final float f334317d;

    /* renamed from: e */
    public final float f334318e;

    /* renamed from: f */
    public final int f334319f;

    /* renamed from: g */
    public final List<C112541g> f334320g;

    /* renamed from: h */
    public final List<C111693h> f334321h;

    public C111687d(C111688e eVar, long j, int i, boolean z, C8480h hVar) {
        boolean z2;
        C111694i iVar;
        int i2;
        C111688e eVar2 = eVar;
        this.f334314a = eVar2;
        this.f334315b = i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) eVar2.f334326e;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            C111694i iVar2 = (C111694i) arrayList2.get(i3);
            C111695j jVar = iVar2.f334336a;
            int h = C108319b.m146697h(j);
            if (C108319b.m146692c(j)) {
                iVar = iVar2;
                i2 = C108319b.m146696g(j) - ((int) ((float) Math.ceil((double) f)));
            } else {
                iVar = iVar2;
                i2 = C108319b.m146696g(j);
            }
            long b = C108321c.m146705b(0, h, 0, i2, 5, (Object) null);
            C87412m.m108594g(jVar, "paragraphIntrinsics");
            C107159c cVar = new C107159c((C107160d) jVar, this.f334315b - i4, z, b, (C8480h) null);
            float height = cVar.getHeight() + f;
            int i5 = i4 + cVar.f320733d.f335298c;
            C111694i iVar3 = iVar;
            ArrayList arrayList3 = arrayList2;
            C111693h hVar2 = r6;
            C111693h hVar3 = new C111693h(cVar, iVar3.f334337b, iVar3.f334338c, i4, i5, f, height);
            arrayList.add(hVar2);
            if (cVar.f320733d.f335296a || (i5 == this.f334315b && i3 != C64197v.m75536e(this.f334314a.f334326e))) {
                z2 = true;
                f = height;
                i4 = i5;
            } else {
                i3++;
                arrayList2 = arrayList3;
                f = height;
                i4 = i5;
            }
        }
        this.f334318e = f;
        this.f334319f = i4;
        this.f334316c = z2;
        this.f334321h = arrayList;
        this.f334317d = (float) C108319b.m146697h(j);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C111693h hVar4 = (C111693h) arrayList.get(i6);
            List<C112541g> v = hVar4.f334329a.mo157583v();
            ArrayList arrayList5 = new ArrayList(v.size());
            int size3 = v.size();
            for (int i7 = 0; i7 < size3; i7++) {
                C112541g gVar = v.get(i7);
                arrayList5.add(gVar != null ? hVar4.mo163346a(gVar) : null);
            }
            C64175a0.m75508p(arrayList4, arrayList5);
        }
        int size4 = arrayList4.size();
        List list = arrayList4;
        if (size4 < this.f334314a.f334323b.size()) {
            int size5 = this.f334314a.f334323b.size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size5);
            for (int i8 = 0; i8 < size5; i8++) {
                arrayList6.add((Object) null);
            }
            list = C110818d0.m150933e0(arrayList4, arrayList6);
        }
        this.f334320g = list;
    }

    /* renamed from: a */
    public final void mo163342a(C103262s sVar, C103257q qVar, C103264s0 s0Var, C108014f fVar) {
        C87412m.m108594g(sVar, "canvas");
        C87412m.m108594g(qVar, "brush");
        sVar.mo142944c();
        ArrayList arrayList = (ArrayList) this.f334321h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C111693h hVar = (C111693h) arrayList.get(i);
            hVar.f334329a.mo157578q(sVar, qVar, s0Var, fVar);
            sVar.mo142945d(0.0f, hVar.f334329a.getHeight());
        }
        sVar.mo142943b();
    }

    /* renamed from: b */
    public final void mo163343b(C103262s sVar, long j, C103264s0 s0Var, C108014f fVar) {
        C87412m.m108594g(sVar, "canvas");
        sVar.mo142944c();
        ArrayList arrayList = (ArrayList) this.f334321h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C111693h hVar = (C111693h) arrayList.get(i);
            hVar.f334329a.mo157577p(sVar, j, s0Var, fVar);
            sVar.mo142945d(0.0f, hVar.f334329a.getHeight());
        }
        sVar.mo142943b();
    }

    /* renamed from: c */
    public final void mo163344c(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f334314a.f334322a.f100413d.length()) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + this.f334314a.f334322a.length() + ']').toString());
        }
    }

    /* renamed from: d */
    public final void mo163345d(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f334319f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
        }
    }
}
