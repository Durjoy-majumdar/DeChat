package p411n0;

import gy3.C87412m;
import java.util.Arrays;
import my3.C61593h;
import my3.C61595o;
import p414p0.C110093d;
import p414p0.C35348a;
import sx3.C110821n;

/* renamed from: n0.t */
public final class C25093t<K, V> {

    /* renamed from: e */
    public static final C25093t f71522e = new C25093t(0, 0, new Object[0]);

    /* renamed from: a */
    public int f71523a;

    /* renamed from: b */
    public int f71524b;

    /* renamed from: c */
    public final C110093d f71525c;

    /* renamed from: d */
    public Object[] f71526d;

    /* renamed from: n0.t$a */
    public static final class C25094a<K, V> {

        /* renamed from: a */
        public C25093t<K, V> f71527a;

        /* renamed from: b */
        public final int f71528b;

        public C25094a(C25093t<K, V> tVar, int i) {
            C87412m.m108594g(tVar, "node");
            this.f71527a = tVar;
            this.f71528b = i;
        }
    }

    public C25093t(int i, int i2, Object[] objArr, C110093d dVar) {
        C87412m.m108594g(objArr, "buffer");
        this.f71523a = i;
        this.f71524b = i2;
        this.f71525c = dVar;
        this.f71526d = objArr;
    }

    /* renamed from: a */
    public final Object[] mo52193a(int i, int i2, int i3, K k, V v, int i4, C110093d dVar) {
        int i5 = i;
        Object obj = this.f71526d[i5];
        C25093t j = mo52202j(obj != null ? obj.hashCode() : 0, obj, mo52216x(i), i3, k, v, i4 + 5, dVar);
        int t = mo52212t(i2) + 1;
        Object[] objArr = this.f71526d;
        int i6 = t - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        C110821n.m150966m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C110821n.m150963j(objArr, objArr2, i, i5 + 2, t);
        objArr2[i6] = j;
        C110821n.m150963j(objArr, objArr2, i6 + 1, t, objArr.length);
        return objArr2;
    }

    /* renamed from: b */
    public final int mo52194b() {
        if (this.f71524b == 0) {
            return this.f71526d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f71523a);
        int length = this.f71526d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += mo52211s(i).mo52194b();
        }
        return bitCount;
    }

    /* renamed from: c */
    public final boolean mo52195c(K k) {
        C61593h h = C61595o.m72300h(C61595o.m72301i(0, this.f71526d.length), 2);
        int i = h.f175174d;
        int i2 = h.f175175e;
        int i3 = h.f175176f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!C87412m.m108589b(k, this.f71526d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo52196d(int i, K k, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (mo52200h(i3)) {
            return C87412m.m108589b(k, this.f71526d[mo52198f(i3)]);
        } else if (!mo52201i(i3)) {
            return false;
        } else {
            C25093t s = mo52211s(mo52212t(i3));
            return i2 == 30 ? s.mo52195c(k) : s.mo52196d(i, k, i2 + 5);
        }
    }

    /* renamed from: e */
    public final boolean mo52197e(C25093t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f71524b != tVar.f71524b || this.f71523a != tVar.f71523a) {
            return false;
        }
        int length = this.f71526d.length;
        for (int i = 0; i < length; i++) {
            if (this.f71526d[i] != tVar.f71526d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo52198f(int i) {
        return Integer.bitCount((i - 1) & this.f71523a) * 2;
    }

    /* renamed from: g */
    public final V mo52199g(int i, K k, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (mo52200h(i3)) {
            int f = mo52198f(i3);
            if (C87412m.m108589b(k, this.f71526d[f])) {
                return mo52216x(f);
            }
            return null;
        } else if (!mo52201i(i3)) {
            return null;
        } else {
            C25093t s = mo52211s(mo52212t(i3));
            if (i2 != 30) {
                return s.mo52199g(i, k, i2 + 5);
            }
            C61593h h = C61595o.m72300h(C61595o.m72301i(0, s.f71526d.length), 2);
            int i4 = h.f175174d;
            int i5 = h.f175175e;
            int i6 = h.f175176f;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                return null;
            }
            while (!C87412m.m108589b(k, s.f71526d[i4])) {
                if (i4 == i5) {
                    return null;
                }
                i4 += i6;
            }
            return s.mo52216x(i4);
        }
    }

    /* renamed from: h */
    public final boolean mo52200h(int i) {
        return (i & this.f71523a) != 0;
    }

    /* renamed from: i */
    public final boolean mo52201i(int i) {
        return (i & this.f71524b) != 0;
    }

    /* renamed from: j */
    public final C25093t<K, V> mo52202j(int i, K k, V v, int i2, K k2, V v2, int i3, C110093d dVar) {
        int i4 = i3;
        C110093d dVar2 = dVar;
        if (i4 > 30) {
            return new C25093t<>(0, 0, new Object[]{k, v, k2, v2}, dVar2);
        }
        int i5 = (i >> i4) & 31;
        int i6 = (i2 >> i4) & 31;
        if (i5 != i6) {
            return new C25093t<>((1 << i5) | (1 << i6), 0, i5 < i6 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, dVar2);
        }
        return new C25093t<>(0, 1 << i5, new Object[]{mo52202j(i, k, v, i2, k2, v2, i4 + 5, dVar)}, dVar2);
    }

    /* renamed from: k */
    public final C25093t<K, V> mo52203k(int i, C25079f<K, V> fVar) {
        fVar.getClass();
        fVar.mo52163c(fVar.f71510i - 1);
        fVar.f71508g = mo52216x(i);
        Object[] objArr = this.f71526d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f71525c != fVar.f71506e) {
            return new C25093t<>(0, 0, C25098x.m31804b(objArr, i), fVar.f71506e);
        }
        this.f71526d = C25098x.m31804b(objArr, i);
        return this;
    }

    /* renamed from: l */
    public final C25093t<K, V> mo52204l(int i, K k, V v, int i2, C25079f<K, V> fVar) {
        C25093t<K, V> tVar;
        C87412m.m108594g(fVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (mo52200h(i3)) {
            int f = mo52198f(i3);
            if (C87412m.m108589b(k, this.f71526d[f])) {
                fVar.f71508g = mo52216x(f);
                if (mo52216x(f) == v) {
                    return this;
                }
                if (this.f71525c == fVar.f71506e) {
                    this.f71526d[f + 1] = v;
                    return this;
                }
                fVar.f71509h++;
                Object[] objArr = this.f71526d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                C87412m.m108593f(copyOf, "copyOf(this, size)");
                copyOf[f + 1] = v;
                return new C25093t<>(this.f71523a, this.f71524b, copyOf, fVar.f71506e);
            }
            fVar.mo52163c(fVar.f71510i + 1);
            C110093d dVar = fVar.f71506e;
            if (this.f71525c == dVar) {
                this.f71526d = mo52193a(f, i3, i, k, v, i2, dVar);
                this.f71523a ^= i3;
                this.f71524b |= i3;
                return this;
            }
            return new C25093t<>(this.f71523a ^ i3, this.f71524b | i3, mo52193a(f, i3, i, k, v, i2, dVar), dVar);
        } else if (mo52201i(i3)) {
            int t = mo52212t(i3);
            C25093t<K, V> s = mo52211s(t);
            if (i2 == 30) {
                C61593h h = C61595o.m72300h(C61595o.m72301i(0, s.f71526d.length), 2);
                int i4 = h.f175174d;
                int i5 = h.f175175e;
                int i6 = h.f175176f;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C87412m.m108589b(k, s.f71526d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            fVar.f71508g = s.mo52216x(i4);
                            if (s.f71525c == fVar.f71506e) {
                                s.f71526d[i4 + 1] = v;
                                tVar = s;
                            } else {
                                fVar.f71509h++;
                                Object[] objArr2 = s.f71526d;
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                C87412m.m108593f(copyOf2, "copyOf(this, size)");
                                copyOf2[i4 + 1] = v;
                                tVar = new C25093t<>(0, 0, copyOf2, fVar.f71506e);
                            }
                        }
                    }
                }
                fVar.mo52163c(fVar.f71510i + 1);
                tVar = new C25093t<>(0, 0, C25098x.m31803a(s.f71526d, 0, k, v), fVar.f71506e);
            } else {
                tVar = s.mo52204l(i, k, v, i2 + 5, fVar);
            }
            return s == tVar ? this : mo52210r(t, tVar, fVar.f71506e);
        } else {
            fVar.mo52163c(fVar.f71510i + 1);
            C110093d dVar2 = fVar.f71506e;
            int f2 = mo52198f(i3);
            if (this.f71525c == dVar2) {
                this.f71526d = C25098x.m31803a(this.f71526d, f2, k, v);
                this.f71523a |= i3;
                return this;
            }
            return new C25093t<>(this.f71523a | i3, this.f71524b, C25098x.m31803a(this.f71526d, f2, k, v), dVar2);
        }
    }

    /* renamed from: m */
    public final C25093t<K, V> mo52205m(C25093t<K, V> tVar, int i, C35348a aVar, C25079f<K, V> fVar) {
        int i2;
        int i3;
        Object[] objArr;
        C25093t tVar2;
        C25093t<K, V> tVar3;
        C25093t<K, V> tVar4 = tVar;
        int i4 = i;
        C35348a aVar2 = aVar;
        C25079f<K, V> fVar2 = fVar;
        C87412m.m108594g(tVar4, "otherNode");
        C87412m.m108594g(aVar2, "intersectionCounter");
        C87412m.m108594g(fVar2, "mutator");
        if (this == tVar4) {
            aVar2.f94665a += mo52194b();
            return this;
        } else if (i4 > 30) {
            C110093d dVar = fVar2.f71506e;
            Object[] objArr2 = this.f71526d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + tVar4.f71526d.length);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            int length = this.f71526d.length;
            C61593h h = C61595o.m72300h(C61595o.m72301i(0, tVar4.f71526d.length), 2);
            int i5 = h.f175174d;
            int i6 = h.f175175e;
            int i7 = h.f175176f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (!mo52195c(tVar4.f71526d[i5])) {
                        Object[] objArr3 = tVar4.f71526d;
                        copyOf[length] = objArr3[i5];
                        copyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    } else {
                        aVar2.f94665a++;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length == this.f71526d.length) {
                return this;
            }
            if (length == tVar4.f71526d.length) {
                return tVar4;
            }
            if (length == copyOf.length) {
                return new C25093t<>(0, 0, copyOf, dVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            C87412m.m108593f(copyOf2, "copyOf(this, newSize)");
            return new C25093t<>(0, 0, copyOf2, dVar);
        } else {
            int i8 = this.f71524b | tVar4.f71524b;
            int i9 = this.f71523a;
            int i15 = tVar4.f71523a;
            int i16 = i9 & i15;
            int i17 = (i9 ^ i15) & (~i8);
            while (i16 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i16);
                if (C87412m.m108589b(this.f71526d[mo52198f(lowestOneBit)], tVar4.f71526d[tVar4.mo52198f(lowestOneBit)])) {
                    i17 |= lowestOneBit;
                } else {
                    i8 |= lowestOneBit;
                }
                i16 ^= lowestOneBit;
            }
            if ((i8 & i17) == 0) {
                C25093t tVar5 = (C87412m.m108589b(this.f71525c, fVar2.f71506e) && this.f71523a == i17 && this.f71524b == i8) ? this : new C25093t(i17, i8, new Object[((Integer.bitCount(i17) * 2) + Integer.bitCount(i8))]);
                int i18 = i8;
                int i19 = 0;
                while (i18 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i18);
                    Object[] objArr4 = tVar5.f71526d;
                    int length2 = (objArr4.length - 1) - i19;
                    if (mo52201i(lowestOneBit2)) {
                        tVar3 = mo52211s(mo52212t(lowestOneBit2));
                        if (tVar4.mo52201i(lowestOneBit2)) {
                            tVar3 = tVar3.mo52205m(tVar4.mo52211s(tVar4.mo52212t(lowestOneBit2)), i4 + 5, aVar2, fVar2);
                        } else if (tVar4.mo52200h(lowestOneBit2)) {
                            int f = tVar4.mo52198f(lowestOneBit2);
                            Object obj = tVar4.f71526d[f];
                            V x = tVar4.mo52216x(f);
                            int i25 = fVar2.f71510i;
                            objArr = objArr4;
                            tVar3 = tVar3.mo52204l(obj != null ? obj.hashCode() : 0, obj, x, i4 + 5, fVar);
                            if (fVar2.f71510i == i25) {
                                aVar2.f94665a++;
                            }
                        }
                        objArr = objArr4;
                    } else {
                        objArr = objArr4;
                        if (tVar4.mo52201i(lowestOneBit2)) {
                            tVar3 = tVar4.mo52211s(tVar4.mo52212t(lowestOneBit2));
                            if (mo52200h(lowestOneBit2)) {
                                int f2 = mo52198f(lowestOneBit2);
                                Object obj2 = this.f71526d[f2];
                                int i26 = i4 + 5;
                                if (tVar3.mo52196d(obj2 != null ? obj2.hashCode() : 0, obj2, i26)) {
                                    aVar2.f94665a++;
                                } else {
                                    tVar3 = tVar3.mo52204l(obj2 != null ? obj2.hashCode() : 0, obj2, mo52216x(f2), i26, fVar);
                                }
                            }
                        } else {
                            int f3 = mo52198f(lowestOneBit2);
                            Object obj3 = this.f71526d[f3];
                            Object x2 = mo52216x(f3);
                            int f4 = tVar4.mo52198f(lowestOneBit2);
                            Object obj4 = tVar4.f71526d[f4];
                            i2 = lowestOneBit2;
                            tVar2 = tVar5;
                            i3 = i17;
                            tVar3 = mo52202j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, tVar4.mo52216x(f4), i4 + 5, fVar2.f71506e);
                            objArr[length2] = tVar3;
                            i19++;
                            i18 ^= i2;
                            tVar5 = tVar2;
                            i17 = i3;
                        }
                    }
                    i2 = lowestOneBit2;
                    tVar2 = tVar5;
                    i3 = i17;
                    objArr[length2] = tVar3;
                    i19++;
                    i18 ^= i2;
                    tVar5 = tVar2;
                    i17 = i3;
                }
                C25093t tVar6 = tVar5;
                int i27 = i17;
                int i28 = 0;
                while (i17 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i17);
                    int i29 = i28 * 2;
                    if (!tVar4.mo52200h(lowestOneBit3)) {
                        int f5 = mo52198f(lowestOneBit3);
                        Object[] objArr5 = tVar6.f71526d;
                        objArr5[i29] = this.f71526d[f5];
                        objArr5[i29 + 1] = mo52216x(f5);
                    } else {
                        int f6 = tVar4.mo52198f(lowestOneBit3);
                        Object[] objArr6 = tVar6.f71526d;
                        objArr6[i29] = tVar4.f71526d[f6];
                        objArr6[i29 + 1] = tVar4.mo52216x(f6);
                        if (mo52200h(lowestOneBit3)) {
                            aVar2.f94665a++;
                        }
                    }
                    i28++;
                    i17 ^= lowestOneBit3;
                }
                return mo52197e(tVar6) ? this : tVar4.mo52197e(tVar6) ? tVar4 : tVar6;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: n */
    public final C25093t<K, V> mo52206n(int i, K k, int i2, C25079f<K, V> fVar) {
        C25093t<K, V> tVar;
        C87412m.m108594g(fVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (mo52200h(i3)) {
            int f = mo52198f(i3);
            return C87412m.m108589b(k, this.f71526d[f]) ? mo52208p(f, i3, fVar) : this;
        } else if (!mo52201i(i3)) {
            return this;
        } else {
            int t = mo52212t(i3);
            C25093t<K, V> s = mo52211s(t);
            if (i2 == 30) {
                C61593h h = C61595o.m72300h(C61595o.m72301i(0, s.f71526d.length), 2);
                int i4 = h.f175174d;
                int i5 = h.f175175e;
                int i6 = h.f175176f;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C87412m.m108589b(k, s.f71526d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            tVar = s.mo52203k(i4, fVar);
                            break;
                        }
                    }
                }
                tVar = s;
            } else {
                tVar = s.mo52206n(i, k, i2 + 5, fVar);
            }
            return mo52209q(s, tVar, t, i3, fVar.f71506e);
        }
    }

    /* renamed from: o */
    public final C25093t<K, V> mo52207o(int i, K k, V v, int i2, C25079f<K, V> fVar) {
        C25093t<K, V> tVar;
        K k2 = k;
        V v2 = v;
        int i3 = i2;
        C25079f<K, V> fVar2 = fVar;
        C87412m.m108594g(fVar2, "mutator");
        int i4 = 1 << ((i >> i3) & 31);
        if (mo52200h(i4)) {
            int f = mo52198f(i4);
            return (!C87412m.m108589b(k, this.f71526d[f]) || !C87412m.m108589b(v, mo52216x(f))) ? this : mo52208p(f, i4, fVar2);
        } else if (!mo52201i(i4)) {
            return this;
        } else {
            int t = mo52212t(i4);
            C25093t<K, V> s = mo52211s(t);
            if (i3 == 30) {
                C61593h h = C61595o.m72300h(C61595o.m72301i(0, s.f71526d.length), 2);
                int i5 = h.f175174d;
                int i6 = h.f175175e;
                int i7 = h.f175176f;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        if (!C87412m.m108589b(k, s.f71526d[i5]) || !C87412m.m108589b(v, s.mo52216x(i5))) {
                            if (i5 == i6) {
                                break;
                            }
                            i5 += i7;
                        } else {
                            tVar = s.mo52203k(i5, fVar2);
                            break;
                        }
                    }
                }
                tVar = s;
            } else {
                tVar = s.mo52207o(i, k, v, i3 + 5, fVar);
            }
            return mo52209q(s, tVar, t, i4, fVar2.f71506e);
        }
    }

    /* renamed from: p */
    public final C25093t<K, V> mo52208p(int i, int i2, C25079f<K, V> fVar) {
        fVar.getClass();
        fVar.mo52163c(fVar.f71510i - 1);
        fVar.f71508g = mo52216x(i);
        Object[] objArr = this.f71526d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f71525c == fVar.f71506e) {
            this.f71526d = C25098x.m31804b(objArr, i);
            this.f71523a ^= i2;
            return this;
        }
        return new C25093t<>(i2 ^ this.f71523a, this.f71524b, C25098x.m31804b(objArr, i), fVar.f71506e);
    }

    /* renamed from: q */
    public final C25093t<K, V> mo52209q(C25093t<K, V> tVar, C25093t<K, V> tVar2, int i, int i2, C110093d dVar) {
        if (tVar2 == null) {
            Object[] objArr = this.f71526d;
            if (objArr.length == 1) {
                return null;
            }
            if (this.f71525c == dVar) {
                this.f71526d = C25098x.m31805c(objArr, i);
                this.f71524b ^= i2;
            } else {
                return new C25093t<>(this.f71523a, i2 ^ this.f71524b, C25098x.m31805c(objArr, i), dVar);
            }
        } else if (this.f71525c == dVar || tVar != tVar2) {
            return mo52210r(i, tVar2, dVar);
        }
        return this;
    }

    /* renamed from: r */
    public final C25093t<K, V> mo52210r(int i, C25093t<K, V> tVar, C110093d dVar) {
        Object[] objArr = this.f71526d;
        if (objArr.length == 1 && tVar.f71526d.length == 2 && tVar.f71524b == 0) {
            tVar.f71523a = this.f71524b;
            return tVar;
        } else if (this.f71525c == dVar) {
            objArr[i] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C87412m.m108593f(copyOf, "copyOf(this, size)");
            copyOf[i] = tVar;
            return new C25093t<>(this.f71523a, this.f71524b, copyOf, dVar);
        }
    }

    /* renamed from: s */
    public final C25093t<K, V> mo52211s(int i) {
        Object obj = this.f71526d[i];
        if (obj != null) {
            return (C25093t) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    /* renamed from: t */
    public final int mo52212t(int i) {
        return (this.f71526d.length - 1) - Integer.bitCount((i - 1) & this.f71524b);
    }

    /* renamed from: u */
    public final C25094a<K, V> mo52213u(int i, K k, V v, int i2) {
        C25094a<K, V> aVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (mo52200h(i3)) {
            int f = mo52198f(i3);
            if (!C87412m.m108589b(k, this.f71526d[f])) {
                return new C25094a<>(new C25093t(this.f71523a ^ i3, this.f71524b | i3, mo52193a(f, i3, i, k, v, i2, (C110093d) null)), 1);
            } else if (mo52216x(f) == v) {
                return null;
            } else {
                Object[] objArr = this.f71526d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                C87412m.m108593f(copyOf, "copyOf(this, size)");
                copyOf[f + 1] = v;
                return new C25094a<>(new C25093t(this.f71523a, this.f71524b, copyOf), 0);
            }
        } else if (mo52201i(i3)) {
            int t = mo52212t(i3);
            C25093t s = mo52211s(t);
            if (i2 == 30) {
                C61593h h = C61595o.m72300h(C61595o.m72301i(0, s.f71526d.length), 2);
                int i4 = h.f175174d;
                int i5 = h.f175175e;
                int i6 = h.f175176f;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C87412m.m108589b(k, s.f71526d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else if (v == s.mo52216x(i4)) {
                            aVar = null;
                        } else {
                            Object[] objArr2 = s.f71526d;
                            Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            C87412m.m108593f(copyOf2, "copyOf(this, size)");
                            copyOf2[i4 + 1] = v;
                            aVar = new C25094a<>(new C25093t(0, 0, copyOf2), 0);
                        }
                    }
                }
                aVar = new C25094a<>(new C25093t(0, 0, C25098x.m31803a(s.f71526d, 0, k, v)), 1);
                if (aVar == null) {
                    return null;
                }
            } else {
                aVar = s.mo52213u(i, k, v, i2 + 5);
                if (aVar == null) {
                    return null;
                }
            }
            aVar.f71527a = mo52215w(t, i3, aVar.f71527a);
            return aVar;
        } else {
            return new C25094a<>(new C25093t(this.f71523a | i3, this.f71524b, C25098x.m31803a(this.f71526d, mo52198f(i3), k, v)), 1);
        }
    }

    /* renamed from: v */
    public final C25093t<K, V> mo52214v(int i, K k, int i2) {
        C25093t tVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (mo52200h(i3)) {
            int f = mo52198f(i3);
            if (!C87412m.m108589b(k, this.f71526d[f])) {
                return this;
            }
            Object[] objArr = this.f71526d;
            if (objArr.length == 2) {
                return null;
            }
            return new C25093t<>(this.f71523a ^ i3, this.f71524b, C25098x.m31804b(objArr, f));
        } else if (!mo52201i(i3)) {
            return this;
        } else {
            int t = mo52212t(i3);
            C25093t s = mo52211s(t);
            if (i2 == 30) {
                C61593h h = C61595o.m72300h(C61595o.m72301i(0, s.f71526d.length), 2);
                int i4 = h.f175174d;
                int i5 = h.f175175e;
                int i6 = h.f175176f;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C87412m.m108589b(k, s.f71526d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            Object[] objArr2 = s.f71526d;
                            tVar = objArr2.length == 2 ? null : new C25093t(0, 0, C25098x.m31804b(objArr2, i4));
                        }
                    }
                }
                tVar = s;
            } else {
                tVar = s.mo52214v(i, k, i2 + 5);
            }
            if (tVar != null) {
                return s != tVar ? mo52215w(t, i3, tVar) : this;
            }
            Object[] objArr3 = this.f71526d;
            if (objArr3.length == 1) {
                return null;
            }
            return new C25093t<>(this.f71523a, this.f71524b ^ i3, C25098x.m31805c(objArr3, t));
        }
    }

    /* renamed from: w */
    public final C25093t<K, V> mo52215w(int i, int i2, C25093t<K, V> tVar) {
        Object[] objArr = tVar.f71526d;
        if (objArr.length != 2 || tVar.f71524b != 0) {
            Object[] objArr2 = this.f71526d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            copyOf[i] = tVar;
            return new C25093t<>(this.f71523a, this.f71524b, copyOf);
        } else if (this.f71526d.length == 1) {
            tVar.f71523a = this.f71524b;
            return tVar;
        } else {
            int f = mo52198f(i2);
            Object[] objArr3 = this.f71526d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
            C87412m.m108593f(copyOf2, "copyOf(this, newSize)");
            C110821n.m150963j(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
            C110821n.m150963j(copyOf2, copyOf2, f + 2, f, i);
            copyOf2[f] = obj;
            copyOf2[f + 1] = obj2;
            return new C25093t<>(this.f71523a ^ i2, i2 ^ this.f71524b, copyOf2);
        }
    }

    /* renamed from: x */
    public final V mo52216x(int i) {
        return this.f71526d[i + 1];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C25093t(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, (C110093d) null);
        C87412m.m108594g(objArr, "buffer");
    }
}
