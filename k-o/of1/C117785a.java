package of1;

import android.graphics.Point;
import android.util.SparseArray;

/* renamed from: of1.a */
public class C117785a {

    /* renamed from: a */
    public final int f352313a;

    /* renamed from: b */
    public int f352314b;

    /* renamed from: c */
    public SparseArray<Point> f352315c;

    /* renamed from: d */
    public SparseArray<C117786b> f352316d;

    /* renamed from: e */
    public boolean f352317e = false;

    public C117785a(int i, int i2) {
        this.f352313a = i;
        this.f352314b = i2;
        this.f352315c = new SparseArray<>();
        this.f352316d = new SparseArray<>();
    }

    /* renamed from: a */
    public final void mo182545a(C117786b bVar, Point point, int i) {
        bVar.f352318a++;
        bVar.f352319b += point.x;
        int i2 = point.y;
        int i3 = bVar.f352320c;
        if (i2 > i3) {
            i3 = i2;
        }
        bVar.f352320c = i3;
        if (i2 == i3) {
            bVar.f352321d = i;
        }
    }

    /* renamed from: b */
    public void mo182546b(int i, int i2) {
        if (mo182551g()) {
            mo182547c(i);
            if (i + i2 > this.f352315c.size()) {
                i2 = this.f352315c.size() - i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                this.f352315c.remove(i + i3);
            }
            mo182549e();
        }
    }

    /* renamed from: c */
    public final void mo182547c(int i) {
        if (!this.f352317e) {
            int d = mo182548d(i);
            C117786b bVar = this.f352316d.get(d, (Object) null);
            if (bVar == null && this.f352316d.size() > 0) {
                SparseArray<C117786b> sparseArray = this.f352316d;
                sparseArray.remove(sparseArray.size() - 1);
            }
            while (bVar != null) {
                this.f352316d.remove(d);
                d++;
                bVar = this.f352316d.get(d, (Object) null);
            }
        }
    }

    /* renamed from: d */
    public int mo182548d(int i) {
        if (!mo182551g()) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f352316d.size(); i3++) {
            i2 += this.f352316d.get(i3).f352318a;
            if (i2 >= i + 1) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182549e() {
        /*
            r9 = this;
            boolean r0 = r9.mo182551g()
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r9.f352317e
            if (r0 == 0) goto L_0x000c
            goto L_0x00b9
        L_0x000c:
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x000f:
            android.util.SparseArray<of1.b> r3 = r9.f352316d
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0025
            android.util.SparseArray<of1.b> r3 = r9.f352316d
            java.lang.Object r3 = r3.get(r1)
            of1.b r3 = (of1.C117786b) r3
            int r3 = r3.f352318a
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0025:
            android.util.SparseArray<android.graphics.Point> r1 = r9.f352315c
            int r1 = r1.size()
            if (r2 < r1) goto L_0x002e
            r2 = -1
        L_0x002e:
            android.util.SparseArray<android.graphics.Point> r1 = r9.f352315c
            r3 = 0
            java.lang.Object r1 = r1.get(r2, r3)
            android.graphics.Point r1 = (android.graphics.Point) r1
            android.util.SparseArray<of1.b> r4 = r9.f352316d
            int r4 = r4.size()
            boolean r5 = r9.mo182551g()
            if (r5 != 0) goto L_0x0045
        L_0x0043:
            r5 = r3
            goto L_0x0058
        L_0x0045:
            int r5 = r9.mo182548d(r2)
            boolean r6 = r9.mo182551g()
            if (r6 != 0) goto L_0x0050
            goto L_0x0043
        L_0x0050:
            android.util.SparseArray<of1.b> r6 = r9.f352316d
            java.lang.Object r5 = r6.get(r5, r3)
            of1.b r5 = (of1.C117786b) r5
        L_0x0058:
            if (r5 != 0) goto L_0x0060
            of1.b r5 = new of1.b
            r5.<init>()
            goto L_0x0064
        L_0x0060:
            int r4 = r9.mo182548d(r2)
        L_0x0064:
            int r6 = r5.f352319b
        L_0x0066:
            if (r1 == 0) goto L_0x00b0
            int r7 = r1.x
            int r6 = r6 + r7
            r7 = 1
            int r0 = r0 + r7
            int r8 = r9.f352314b
            if (r6 > r8) goto L_0x0091
            int r8 = r9.f352313a
            if (r8 <= 0) goto L_0x008d
            if (r0 <= r8) goto L_0x0089
            android.util.SparseArray<of1.b> r0 = r9.f352316d
            r0.put(r4, r5)
            of1.b r0 = new of1.b
            r0.<init>()
            r9.mo182545a(r0, r1, r2)
            int r4 = r4 + 1
            int r1 = r1.x
            goto L_0x00a2
        L_0x0089:
            r9.mo182545a(r5, r1, r2)
            goto L_0x00a5
        L_0x008d:
            r9.mo182545a(r5, r1, r2)
            goto L_0x00a5
        L_0x0091:
            android.util.SparseArray<of1.b> r0 = r9.f352316d
            r0.put(r4, r5)
            of1.b r0 = new of1.b
            r0.<init>()
            r9.mo182545a(r0, r1, r2)
            int r4 = r4 + 1
            int r1 = r1.x
        L_0x00a2:
            r5 = r0
            r6 = r1
            r0 = 1
        L_0x00a5:
            int r2 = r2 + 1
            android.util.SparseArray<android.graphics.Point> r1 = r9.f352315c
            java.lang.Object r1 = r1.get(r2, r3)
            android.graphics.Point r1 = (android.graphics.Point) r1
            goto L_0x0066
        L_0x00b0:
            int r0 = r5.f352318a
            if (r0 <= 0) goto L_0x00b9
            android.util.SparseArray<of1.b> r0 = r9.f352316d
            r0.append(r4, r5)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.C117785a.mo182549e():void");
    }

    /* renamed from: f */
    public void mo182550f(int i, Point point) {
        if (mo182551g()) {
            if (this.f352315c.get(i, (Object) null) == null) {
                mo182547c(i);
                this.f352315c.put(i, point);
                mo182549e();
            } else if (!this.f352315c.get(i).equals(point)) {
                mo182547c(i);
                this.f352315c.put(i, point);
                mo182549e();
            }
        }
    }

    /* renamed from: g */
    public boolean mo182551g() {
        return this.f352314b > 0;
    }
}
