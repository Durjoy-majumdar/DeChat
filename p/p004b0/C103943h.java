package p004b0;

import java.util.NoSuchElementException;
import p410k0.C108793e;

/* renamed from: b0.h */
public final class C103943h {

    /* renamed from: a */
    public final C108793e<C103944a> f307370a = new C108793e<>(new C103944a[16], 0);

    /* renamed from: b0.h$a */
    public static final class C103944a {

        /* renamed from: a */
        public final int f307371a;

        /* renamed from: b */
        public final int f307372b;

        public C103944a(int i, int i2) {
            this.f307371a = i;
            this.f307372b = i2;
            boolean z = true;
            if (i >= 0) {
                if (!(i2 < i ? false : z)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C103944a)) {
                return false;
            }
            C103944a aVar = (C103944a) obj;
            return this.f307371a == aVar.f307371a && this.f307372b == aVar.f307372b;
        }

        public int hashCode() {
            return (this.f307371a * 31) + this.f307372b;
        }

        public String toString() {
            return "Interval(start=" + this.f307371a + ", end=" + this.f307372b + ')';
        }
    }

    /* renamed from: a */
    public final int mo145561a() {
        C108793e<C103944a> eVar = this.f307370a;
        if (!eVar.mo159867i()) {
            int i = 0;
            int i2 = ((C103944a) eVar.f325784d[0]).f307372b;
            C108793e<C103944a> eVar2 = this.f307370a;
            int i3 = eVar2.f325786f;
            if (i3 > 0) {
                T[] tArr = eVar2.f325784d;
                do {
                    int i4 = ((C103944a) tArr[i]).f307372b;
                    if (i4 > i2) {
                        i2 = i4;
                    }
                    i++;
                } while (i < i3);
            }
            return i2;
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* renamed from: b */
    public final int mo145562b() {
        C108793e<C103944a> eVar = this.f307370a;
        if (!eVar.mo159867i()) {
            boolean z = false;
            int i = ((C103944a) eVar.f325784d[0]).f307371a;
            C108793e<C103944a> eVar2 = this.f307370a;
            int i2 = eVar2.f325786f;
            if (i2 > 0) {
                T[] tArr = eVar2.f325784d;
                int i3 = 0;
                do {
                    int i4 = ((C103944a) tArr[i3]).f307371a;
                    if (i4 < i) {
                        i = i4;
                    }
                    i3++;
                } while (i3 < i2);
            }
            if (i >= 0) {
                z = true;
            }
            if (z) {
                return i;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }
}
