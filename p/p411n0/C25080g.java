package p411n0;

import gy3.C24564k0;
import gy3.C87412m;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: n0.g */
public class C25080g<K, V, T> extends C25078e<K, V, T> {

    /* renamed from: g */
    public final C25079f<K, V> f71511g;

    /* renamed from: h */
    public K f71512h;

    /* renamed from: i */
    public boolean f71513i;

    /* renamed from: j */
    public int f71514j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25080g(C25079f<K, V> fVar, C25095u<K, V, T>[] uVarArr) {
        super(fVar.f71507f, uVarArr);
        C87412m.m108594g(fVar, "builder");
        C87412m.m108594g(uVarArr, "path");
        this.f71511g = fVar;
        this.f71514j = fVar.f71509h;
    }

    /* renamed from: e */
    public final void mo52171e(int i, C25093t<?, ?> tVar, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            C25095u<K, V, T> uVar = this.f71502d[i2];
            Object[] objArr = tVar.f71526d;
            int length = objArr.length;
            uVar.getClass();
            uVar.f71529d = objArr;
            uVar.f71530e = length;
            uVar.f71531f = 0;
            while (true) {
                C25095u<K, V, T> uVar2 = this.f71502d[i2];
                if (!C87412m.m108589b(uVar2.f71529d[uVar2.f71531f], k)) {
                    this.f71502d[i2].f71531f += 2;
                } else {
                    this.f71503e = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (tVar.mo52200h(i4)) {
                int f = tVar.mo52198f(i4);
                C25095u<K, V, T> uVar3 = this.f71502d[i2];
                Object[] objArr2 = tVar.f71526d;
                uVar3.getClass();
                C87412m.m108594g(objArr2, "buffer");
                uVar3.f71529d = objArr2;
                uVar3.f71530e = Integer.bitCount(tVar.f71523a) * 2;
                uVar3.f71531f = f;
                this.f71503e = i2;
                return;
            }
            int t = tVar.mo52212t(i4);
            C25093t<?, ?> s = tVar.mo52211s(t);
            C25095u<K, V, T> uVar4 = this.f71502d[i2];
            Object[] objArr3 = tVar.f71526d;
            uVar4.getClass();
            C87412m.m108594g(objArr3, "buffer");
            uVar4.f71529d = objArr3;
            uVar4.f71530e = Integer.bitCount(tVar.f71523a) * 2;
            uVar4.f71531f = t;
            mo52171e(i, s, k, i2 + 1);
        }
    }

    public T next() {
        if (this.f71511g.f71509h != this.f71514j) {
            throw new ConcurrentModificationException();
        } else if (this.f71504f) {
            C25095u<K, V, T> uVar = this.f71502d[this.f71503e];
            this.f71512h = uVar.f71529d[uVar.f71531f];
            this.f71513i = true;
            return super.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        if (this.f71513i) {
            boolean z = this.f71504f;
            if (!z) {
                C24564k0.m30739c(this.f71511g).remove(this.f71512h);
            } else if (z) {
                C25095u<K, V, T> uVar = this.f71502d[this.f71503e];
                Object obj = uVar.f71529d[uVar.f71531f];
                C24564k0.m30739c(this.f71511g).remove(this.f71512h);
                mo52171e(obj != null ? obj.hashCode() : 0, this.f71511g.f71507f, obj, 0);
            } else {
                throw new NoSuchElementException();
            }
            this.f71512h = null;
            this.f71513i = false;
            this.f71514j = this.f71511g.f71509h;
            return;
        }
        throw new IllegalStateException();
    }
}
