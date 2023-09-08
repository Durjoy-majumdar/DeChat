package p410k0;

import gy3.C8480h;
import gy3.C87412m;
import sx3.C110821n;

/* renamed from: k0.b */
public final class C24853b<Key, Value> {

    /* renamed from: a */
    public Object[] f70838a;

    /* renamed from: b */
    public Object[] f70839b;

    /* renamed from: c */
    public int f70840c;

    public C24853b(int i, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 16 : i;
        this.f70838a = new Object[i];
        this.f70839b = new Object[i];
    }

    /* renamed from: a */
    public final int mo51857a(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.f70840c - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.f70838a[i3];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = this.f70838a[i4];
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.f70840c;
                while (true) {
                    if (i5 >= i6) {
                        i5 = this.f70840c;
                        break;
                    }
                    Object obj4 = this.f70838a[i5];
                    if (obj4 == obj) {
                        return i5;
                    }
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        break;
                    }
                    i5++;
                }
                return -(i5 + 1);
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public final void mo51858b(Key key, Value value) {
        C87412m.m108594g(key, "key");
        int a = mo51857a(key);
        if (a >= 0) {
            this.f70839b[a] = value;
            return;
        }
        int i = -(a + 1);
        int i2 = this.f70840c;
        Object[] objArr = this.f70838a;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[(i2 * 2)] : objArr;
        int i3 = i + 1;
        C110821n.m150963j(objArr, objArr2, i3, i, i2);
        if (z) {
            C110821n.m150966m(this.f70838a, objArr2, 0, 0, i, 6, (Object) null);
        }
        objArr2[i] = key;
        this.f70838a = objArr2;
        Object[] objArr3 = z ? new Object[(this.f70840c * 2)] : this.f70839b;
        C110821n.m150963j(this.f70839b, objArr3, i3, i, this.f70840c);
        if (z) {
            C110821n.m150966m(this.f70839b, objArr3, 0, 0, i, 6, (Object) null);
        }
        objArr3[i] = value;
        this.f70839b = objArr3;
        this.f70840c++;
    }
}
