package p411n0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n0.e */
public abstract class C25078e<K, V, T> implements Iterator<T>, C33145a {

    /* renamed from: d */
    public final C25095u<K, V, T>[] f71502d;

    /* renamed from: e */
    public int f71503e;

    /* renamed from: f */
    public boolean f71504f = true;

    public C25078e(C25093t<K, V> tVar, C25095u<K, V, T>[] uVarArr) {
        C87412m.m108594g(tVar, "node");
        C87412m.m108594g(uVarArr, "path");
        this.f71502d = uVarArr;
        C25095u<K, V, T> uVar = uVarArr[0];
        Object[] objArr = tVar.f71526d;
        uVar.getClass();
        C87412m.m108594g(objArr, "buffer");
        uVar.f71529d = objArr;
        uVar.f71530e = Integer.bitCount(tVar.f71523a) * 2;
        uVar.f71531f = 0;
        this.f71503e = 0;
        mo52156a();
    }

    /* renamed from: a */
    public final void mo52156a() {
        C25095u<K, V, T>[] uVarArr = this.f71502d;
        int i = this.f71503e;
        C25095u<K, V, T> uVar = uVarArr[i];
        if (!(uVar.f71531f < uVar.f71530e)) {
            while (-1 < i) {
                int c = mo52157c(i);
                if (c == -1) {
                    C25095u<K, V, T> uVar2 = this.f71502d[i];
                    int i2 = uVar2.f71531f;
                    Object[] objArr = uVar2.f71529d;
                    if (i2 < objArr.length) {
                        int length = objArr.length;
                        uVar2.f71531f = i2 + 1;
                        c = mo52157c(i);
                    }
                }
                if (c != -1) {
                    this.f71503e = c;
                    return;
                }
                if (i > 0) {
                    C25095u<K, V, T> uVar3 = this.f71502d[i - 1];
                    int i3 = uVar3.f71531f;
                    int length2 = uVar3.f71529d.length;
                    uVar3.f71531f = i3 + 1;
                }
                C25095u<K, V, T> uVar4 = this.f71502d[i];
                Object[] objArr2 = C25093t.f71522e.f71526d;
                uVar4.getClass();
                C87412m.m108594g(objArr2, "buffer");
                uVar4.f71529d = objArr2;
                uVar4.f71530e = 0;
                uVar4.f71531f = 0;
                i--;
            }
            this.f71504f = false;
        }
    }

    /* renamed from: c */
    public final int mo52157c(int i) {
        C25095u<K, V, T>[] uVarArr = this.f71502d;
        C25095u<K, V, T> uVar = uVarArr[i];
        int i2 = uVar.f71531f;
        if (i2 < uVar.f71530e) {
            return i;
        }
        Object[] objArr = uVar.f71529d;
        if (!(i2 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj != null) {
            C25093t tVar = (C25093t) obj;
            if (i == 6) {
                C25095u<K, V, T> uVar2 = uVarArr[i + 1];
                Object[] objArr2 = tVar.f71526d;
                int length2 = objArr2.length;
                uVar2.getClass();
                uVar2.f71529d = objArr2;
                uVar2.f71530e = length2;
                uVar2.f71531f = 0;
            } else {
                C25095u<K, V, T> uVar3 = uVarArr[i + 1];
                Object[] objArr3 = tVar.f71526d;
                uVar3.getClass();
                C87412m.m108594g(objArr3, "buffer");
                uVar3.f71529d = objArr3;
                uVar3.f71530e = Integer.bitCount(tVar.f71523a) * 2;
                uVar3.f71531f = 0;
            }
            return mo52157c(i + 1);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
    }

    public boolean hasNext() {
        return this.f71504f;
    }

    public T next() {
        if (this.f71504f) {
            T next = this.f71502d[this.f71503e].next();
            mo52156a();
            return next;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
