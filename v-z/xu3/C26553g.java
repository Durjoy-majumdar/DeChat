package xu3;

import pu3.C25474g;
import pu3.C25478i;
import pu3.C25494p;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26722g;

/* renamed from: xu3.g */
public class C26553g extends C26555i<C25474g> {

    /* renamed from: d */
    public C25499u.C25500a f73891d = null;

    /* renamed from: e */
    public C25478i.C25484f f73892e = null;

    public C26553g(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72166m;
            this.f73891d = aVar2;
            this.f73892e = iVar2.mo52716d(aVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Comparable mo53495a(zu3.C26718e r12, java.lang.Comparable r13) {
        /*
            r11 = this;
            pu3.g r13 = (pu3.C25474g) r13
            r12.getClass()
            int r0 = r13.f72110h
            r1 = r12
            zu3.g r1 = (zu3.C26722g) r1
            uu3.b r2 = r1.f74288m
            int r2 = r2.mo162978d(r0)
            if (r2 >= 0) goto L_0x001f
            if (r0 < 0) goto L_0x0025
            uu3.a r1 = r1.f74274A
            boolean r1 = r1.mo183354a(r0)
            if (r1 == 0) goto L_0x0025
            r0 = -1
            r6 = -1
            goto L_0x0026
        L_0x001f:
            uu3.b r0 = r1.f74288m
            int[] r0 = r0.f333062e
            r0 = r0[r2]
        L_0x0025:
            r6 = r0
        L_0x0026:
            short[] r0 = r13.f72111i
            r1 = 0
            if (r0 == 0) goto L_0x0075
            int r2 = r0.length
            if (r2 != 0) goto L_0x002f
            goto L_0x0075
        L_0x002f:
            zu3.f r2 = new zu3.f
            r2.<init>(r12)
            su3.h r3 = new su3.h
            int r4 = r0.length
            r3.<init>(r4)
            su3.c r4 = new su3.c
            r4.<init>()
            su3.f r5 = new su3.f
            r5.<init>(r3, r4)
            su3.d r7 = new su3.d
            su3.g r8 = new su3.g
            r8.<init>(r0)
            r7.<init>(r8)
            zu3.f$a r0 = new zu3.f$a     // Catch:{ EOFException -> 0x006e }
            r0.<init>(r4)     // Catch:{ EOFException -> 0x006e }
            r7.mo53110a(r0)     // Catch:{ EOFException -> 0x006e }
            zu3.f$a r0 = new zu3.f$a     // Catch:{ EOFException -> 0x006e }
            r0.<init>(r5)     // Catch:{ EOFException -> 0x006e }
            r7.mo53110a(r0)     // Catch:{ EOFException -> 0x006e }
            int r0 = r3.f73123b
            short[] r2 = r3.f73132c
            int r3 = r2.length
            if (r0 != r3) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            short[] r3 = new short[r0]
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            r2 = r3
        L_0x006c:
            r7 = r2
            goto L_0x0076
        L_0x006e:
            r12 = move-exception
            pu3.j r13 = new pu3.j
            r13.<init>((java.lang.Throwable) r12)
            throw r13
        L_0x0075:
            r7 = r0
        L_0x0076:
            pu3.g$a[] r0 = r13.f72113n
            if (r0 == 0) goto L_0x00ae
            int r2 = r0.length
            if (r2 != 0) goto L_0x007e
            goto L_0x00ae
        L_0x007e:
            int r2 = r0.length
            pu3.g$a[] r2 = new pu3.C25474g.C25475a[r2]
            r3 = 0
        L_0x0082:
            int r4 = r0.length
            if (r3 >= r4) goto L_0x00ac
            r4 = r0[r3]
            int[] r5 = r4.f72114d
            int r5 = r5.length
            int[] r8 = new int[r5]
            r9 = 0
        L_0x008d:
            if (r9 >= r5) goto L_0x009c
            int[] r10 = r4.f72114d
            r10 = r10[r9]
            int r10 = r12.mo53712f(r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x008d
        L_0x009c:
            pu3.g$a r5 = new pu3.g$a
            int[] r9 = r4.f72115e
            int r10 = r4.f72116f
            int r4 = r4.f72117g
            r5.<init>(r8, r9, r10, r4)
            r2[r3] = r5
            int r3 = r3 + 1
            goto L_0x0082
        L_0x00ac:
            r9 = r2
            goto L_0x00af
        L_0x00ae:
            r9 = r0
        L_0x00af:
            pu3.g r12 = new pu3.g
            int r2 = r13.f72185d
            int r3 = r13.f72107e
            int r4 = r13.f72108f
            int r5 = r13.f72109g
            pu3.g$b[] r8 = r13.f72112j
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xu3.C26553g.mo53495a(zu3.e, java.lang.Comparable):java.lang.Comparable");
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72166m;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74275B.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52732h();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74289n.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25474g gVar = (C25474g) comparable;
        this.f73891d.f72182f++;
        C25478i.C25484f fVar = this.f73892e;
        fVar.mo52740z(C25478i.this.f72125a.f72166m, true);
        int position = fVar.f72245a.position();
        fVar.mo52796y(gVar.f72107e);
        fVar.mo52796y(gVar.f72108f);
        fVar.mo52796y(gVar.f72109g);
        fVar.mo52796y(gVar.f72112j.length);
        fVar.mo52793v(gVar.f72110h);
        fVar.mo52793v(gVar.f72111i.length);
        short[] sArr = gVar.f72111i;
        fVar.mo52786a(sArr.length * 2);
        for (short x : sArr) {
            fVar.mo52795x(x);
        }
        if (fVar.f72245a.position() > fVar.f72246b) {
            fVar.f72246b = fVar.f72245a.position();
        }
        if (gVar.f72112j.length > 0) {
            if ((gVar.f72111i.length & 1) == 1) {
                fVar.mo52795x(0);
            }
            int position2 = fVar.f72245a.position();
            int length = gVar.f72112j.length * 8;
            fVar.mo52786a(length * 1);
            fVar.mo52791t(length);
            C25474g.C25475a[] aVarArr = gVar.f72113n;
            int position3 = fVar.f72245a.position();
            C25494p.m32919d(fVar, aVarArr.length);
            int[] iArr = new int[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                iArr[i] = fVar.f72245a.position() - position3;
                C25474g.C25475a aVar = aVarArr[i];
                int i2 = aVar.f72116f;
                int[] iArr2 = aVar.f72114d;
                int[] iArr3 = aVar.f72115e;
                if (i2 != -1) {
                    C25494p.m32918c(fVar, -iArr2.length);
                } else {
                    C25494p.m32918c(fVar, iArr2.length);
                }
                for (int i3 = 0; i3 < iArr2.length; i3++) {
                    C25494p.m32919d(fVar, iArr2[i3]);
                    C25494p.m32919d(fVar, iArr3[i3]);
                }
                if (i2 != -1) {
                    C25494p.m32919d(fVar, i2);
                }
            }
            int position4 = fVar.f72245a.position();
            fVar.f72245a.position(position2);
            for (C25474g.C25476b bVar : gVar.f72112j) {
                fVar.mo52793v(bVar.f72118d);
                fVar.mo52796y(bVar.f72119e);
                fVar.mo52796y(iArr[bVar.f72120f]);
            }
            fVar.f72245a.position(position4);
        }
        return position;
    }
}
