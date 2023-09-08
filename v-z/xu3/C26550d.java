package xu3;

import java.lang.reflect.Array;
import pu3.C25469d;
import pu3.C25478i;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.d */
public class C26550d extends C26555i<C25469d> {

    /* renamed from: d */
    public C25499u.C25500a f73885d = null;

    /* renamed from: e */
    public C25478i.C25484f f73886e = null;

    public C26550d(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72171r;
            this.f73885d = aVar2;
            this.f73886e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25469d dVar = (C25469d) comparable;
        eVar.getClass();
        int a = eVar.mo53707a(dVar.f72086e);
        int length = dVar.f72087f.length;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i][0] = eVar.mo53708b(dVar.f72087f[i][0]);
            iArr2[i][1] = eVar.mo53707a(dVar.f72087f[i][1]);
        }
        int length2 = dVar.f72088g.length;
        int[] iArr3 = new int[2];
        iArr3[1] = 2;
        iArr3[0] = length2;
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, iArr3);
        for (int i2 = 0; i2 < iArr4.length; i2++) {
            iArr4[i2][0] = eVar.mo53709c(dVar.f72088g[i2][0]);
            iArr4[i2][1] = eVar.mo53707a(dVar.f72088g[i2][1]);
        }
        int length3 = dVar.f72089h.length;
        int[] iArr5 = new int[2];
        iArr5[1] = 2;
        iArr5[0] = length3;
        int[][] iArr6 = (int[][]) Array.newInstance(Integer.TYPE, iArr5);
        for (int i3 = 0; i3 < iArr6.length; i3++) {
            iArr6[i3][0] = eVar.mo53709c(dVar.f72089h[i3][0]);
            int[] iArr7 = iArr6[i3];
            int i4 = dVar.f72089h[i3][1];
            C26722g gVar = (C26722g) eVar;
            int d = gVar.f74284i.mo162978d(i4);
            if (d >= 0) {
                i4 = gVar.f74284i.f333062e[d];
            } else if (i4 >= 0 && gVar.f74298w.mo183354a(i4)) {
                i4 = -1;
            }
            iArr7[1] = i4;
        }
        return new C25469d(dVar.f72185d, a, iArr2, iArr4, iArr6);
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72171r;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74299x.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52729e();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74285j.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25469d dVar = (C25469d) comparable;
        this.f73885d.f72182f++;
        C25478i.C25484f fVar = this.f73886e;
        fVar.mo52740z(C25478i.this.f72125a.f72171r, true);
        int position = fVar.f72245a.position();
        fVar.mo52793v(dVar.f72086e);
        fVar.mo52793v(dVar.f72087f.length);
        fVar.mo52793v(dVar.f72088g.length);
        fVar.mo52793v(dVar.f72089h.length);
        for (int[] iArr : dVar.f72087f) {
            fVar.mo52793v(iArr[0]);
            fVar.mo52793v(iArr[1]);
        }
        for (int[] iArr2 : dVar.f72088g) {
            fVar.mo52793v(iArr2[0]);
            fVar.mo52793v(iArr2[1]);
        }
        for (int[] iArr3 : dVar.f72089h) {
            fVar.mo52793v(iArr3[0]);
            fVar.mo52793v(iArr3[1]);
        }
        return position;
    }
}
