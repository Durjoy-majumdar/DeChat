package p368o2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: o2.h */
public class C21741h {

    /* renamed from: a */
    public List<C21738f> f61633a;

    /* renamed from: b */
    public boolean f61634b = false;

    /* renamed from: c */
    public final int[] f61635c = {-1, -1};

    /* renamed from: d */
    public List<C21738f> f61636d = new ArrayList();

    /* renamed from: e */
    public List<C21738f> f61637e = new ArrayList();

    /* renamed from: f */
    public HashSet<C21738f> f61638f = new HashSet<>();

    /* renamed from: g */
    public HashSet<C21738f> f61639g = new HashSet<>();

    /* renamed from: h */
    public List<C21738f> f61640h = new ArrayList();

    /* renamed from: i */
    public List<C21738f> f61641i = new ArrayList();

    public C21741h(List<C21738f> list) {
        this.f61633a = list;
    }

    /* renamed from: a */
    public void mo34063a(C21738f fVar, int i) {
        if (i == 0) {
            this.f61638f.add(fVar);
        } else if (i == 1) {
            this.f61639g.add(fVar);
        }
    }

    /* renamed from: b */
    public final void mo34064b(ArrayList<C21738f> arrayList, C21738f fVar) {
        C21738f fVar2;
        if (!fVar.f61582c0) {
            arrayList.add(fVar);
            fVar.f61582c0 = true;
            if (!fVar.mo34052t()) {
                if (fVar instanceof C21743j) {
                    C21743j jVar = (C21743j) fVar;
                    int i = jVar.f61648j0;
                    for (int i2 = 0; i2 < i; i2++) {
                        mo34064b(arrayList, jVar.f61647i0[i2]);
                    }
                }
                for (C21735e eVar : fVar.f61551A) {
                    C21735e eVar2 = eVar.f61533d;
                    if (!(eVar2 == null || (fVar2 = eVar2.f61531b) == fVar.f61554D)) {
                        mo34064b(arrayList, fVar2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34065c(p368o2.C21738f r7) {
        /*
            r6 = this;
            boolean r0 = r7.f61578a0
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r7.mo34052t()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            o2.e r0 = r7.f61605u
            o2.e r0 = r0.f61533d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            o2.e r0 = r7.f61603s
            o2.e r0 = r0.f61533d
        L_0x001d:
            if (r0 == 0) goto L_0x0041
            o2.f r4 = r0.f61531b
            boolean r5 = r4.f61580b0
            if (r5 != 0) goto L_0x0028
            r6.mo34065c(r4)
        L_0x0028:
            o2.e$b r4 = r0.f61532c
            o2.e$b r5 = p368o2.C21735e.C21737b.RIGHT
            if (r4 != r5) goto L_0x0038
            o2.f r0 = r0.f61531b
            int r4 = r0.f61559I
            int r0 = r0.mo34049q()
            int r4 = r4 + r0
            goto L_0x0042
        L_0x0038:
            o2.e$b r5 = p368o2.C21735e.C21737b.LEFT
            if (r4 != r5) goto L_0x0041
            o2.f r0 = r0.f61531b
            int r4 = r0.f61559I
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x004c
            o2.e r0 = r7.f61605u
            int r0 = r0.mo34025b()
            int r4 = r4 - r0
            goto L_0x0058
        L_0x004c:
            o2.e r0 = r7.f61603s
            int r0 = r0.mo34025b()
            int r3 = r7.mo34049q()
            int r0 = r0 + r3
            int r4 = r4 + r0
        L_0x0058:
            int r0 = r7.mo34049q()
            int r0 = r4 - r0
            r7.f61559I = r0
            int r0 = r4 - r0
            r7.f61555E = r0
            int r3 = r7.f61568R
            if (r0 >= r3) goto L_0x006a
            r7.f61555E = r3
        L_0x006a:
            o2.e r0 = r7.f61607w
            o2.e r0 = r0.f61533d
            if (r0 == 0) goto L_0x0094
            o2.f r2 = r0.f61531b
            boolean r3 = r2.f61580b0
            if (r3 != 0) goto L_0x0079
            r6.mo34065c(r2)
        L_0x0079:
            o2.f r0 = r0.f61531b
            int r2 = r0.f61560J
            int r0 = r0.f61567Q
            int r2 = r2 + r0
            int r0 = r7.f61567Q
            int r2 = r2 - r0
            int r0 = r7.f61556F
            int r0 = r0 + r2
            r7.f61560J = r2
            int r0 = r0 - r2
            r7.f61556F = r0
            int r2 = r7.f61569S
            if (r0 >= r2) goto L_0x0091
            r7.f61556F = r2
        L_0x0091:
            r7.f61580b0 = r1
            return
        L_0x0094:
            o2.e r0 = r7.f61606v
            o2.e r0 = r0.f61533d
            if (r0 == 0) goto L_0x009b
            r2 = 1
        L_0x009b:
            if (r2 == 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            o2.e r0 = r7.f61604t
            o2.e r0 = r0.f61533d
        L_0x00a2:
            if (r0 == 0) goto L_0x00c6
            o2.f r3 = r0.f61531b
            boolean r5 = r3.f61580b0
            if (r5 != 0) goto L_0x00ad
            r6.mo34065c(r3)
        L_0x00ad:
            o2.e$b r3 = r0.f61532c
            o2.e$b r5 = p368o2.C21735e.C21737b.BOTTOM
            if (r3 != r5) goto L_0x00be
            o2.f r0 = r0.f61531b
            int r3 = r0.f61560J
            int r0 = r0.mo34043k()
            int r4 = r3 + r0
            goto L_0x00c6
        L_0x00be:
            o2.e$b r5 = p368o2.C21735e.C21737b.TOP
            if (r3 != r5) goto L_0x00c6
            o2.f r0 = r0.f61531b
            int r4 = r0.f61560J
        L_0x00c6:
            if (r2 == 0) goto L_0x00d0
            o2.e r0 = r7.f61606v
            int r0 = r0.mo34025b()
            int r4 = r4 - r0
            goto L_0x00dc
        L_0x00d0:
            o2.e r0 = r7.f61604t
            int r0 = r0.mo34025b()
            int r2 = r7.mo34043k()
            int r0 = r0 + r2
            int r4 = r4 + r0
        L_0x00dc:
            int r0 = r7.mo34043k()
            int r0 = r4 - r0
            r7.f61560J = r0
            int r4 = r4 - r0
            r7.f61556F = r4
            int r0 = r7.f61569S
            if (r4 >= r0) goto L_0x00ed
            r7.f61556F = r0
        L_0x00ed:
            r7.f61580b0 = r1
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21741h.mo34065c(o2.f):void");
    }

    public C21741h(List<C21738f> list, boolean z) {
        this.f61633a = list;
        this.f61634b = z;
    }
}
