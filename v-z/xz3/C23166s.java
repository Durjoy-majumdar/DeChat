package xz3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import xz3.C23156c;

/* renamed from: xz3.s */
public class C23166s extends C23156c {

    /* renamed from: n */
    public static final int[] f66545n;

    /* renamed from: e */
    public final int f66546e;

    /* renamed from: f */
    public final C23156c f66547f;

    /* renamed from: g */
    public final C23156c f66548g;

    /* renamed from: h */
    public final int f66549h;

    /* renamed from: i */
    public final int f66550i;

    /* renamed from: j */
    public int f66551j = 0;

    /* renamed from: xz3.s$b */
    public static class C23168b {

        /* renamed from: a */
        public final Stack<C23156c> f66552a = new Stack<>();

        public C23168b(C23167a aVar) {
        }

        /* renamed from: a */
        public final void mo36586a(C23156c cVar) {
            if (cVar.mo36546m()) {
                int size = cVar.size();
                int[] iArr = C23166s.f66545n;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = iArr[binarySearch + 1];
                if (this.f66552a.isEmpty() || this.f66552a.peek().size() >= i) {
                    this.f66552a.push(cVar);
                    return;
                }
                int i2 = iArr[binarySearch];
                C23156c pop = this.f66552a.pop();
                while (!this.f66552a.isEmpty() && this.f66552a.peek().size() < i2) {
                    pop = new C23166s(this.f66552a.pop(), pop);
                }
                C23166s sVar = new C23166s(pop, cVar);
                while (!this.f66552a.isEmpty()) {
                    int i3 = sVar.f66546e;
                    int[] iArr2 = C23166s.f66545n;
                    int binarySearch2 = Arrays.binarySearch(iArr2, i3);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.f66552a.peek().size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    }
                    sVar = new C23166s(this.f66552a.pop(), sVar);
                }
                this.f66552a.push(sVar);
            } else if (cVar instanceof C23166s) {
                C23166s sVar2 = (C23166s) cVar;
                mo36586a(sVar2.f66547f);
                mo36586a(sVar2.f66548g);
            } else {
                String valueOf = String.valueOf(cVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: xz3.s$c */
    public static class C23169c implements Iterator<C23163o> {

        /* renamed from: d */
        public final Stack<C23166s> f66553d = new Stack<>();

        /* renamed from: e */
        public C23163o f66554e;

        public C23169c(C23156c cVar, C23167a aVar) {
            while (cVar instanceof C23166s) {
                C23166s sVar = (C23166s) cVar;
                this.f66553d.push(sVar);
                cVar = sVar.f66547f;
            }
            this.f66554e = (C23163o) cVar;
        }

        /* renamed from: a */
        public C23163o next() {
            C23163o oVar;
            boolean z;
            C23163o oVar2 = this.f66554e;
            if (oVar2 != null) {
                while (true) {
                    if (!this.f66553d.isEmpty()) {
                        C23156c cVar = this.f66553d.pop().f66548g;
                        while (cVar instanceof C23166s) {
                            C23166s sVar = (C23166s) cVar;
                            this.f66553d.push(sVar);
                            cVar = sVar.f66547f;
                        }
                        oVar = (C23163o) cVar;
                        if (oVar.f66540e.length == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        oVar = null;
                        break;
                    }
                }
                this.f66554e = oVar;
                return oVar2;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f66554e != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: xz3.s$d */
    public class C23170d implements C23156c.C23157a {

        /* renamed from: d */
        public final C23169c f66555d;

        /* renamed from: e */
        public C23156c.C23157a f66556e;

        /* renamed from: f */
        public int f66557f;

        public C23170d(C23166s sVar, C23167a aVar) {
            C23169c cVar = new C23169c(sVar, (C23167a) null);
            this.f66555d = cVar;
            this.f66556e = cVar.next().iterator();
            this.f66557f = sVar.f66546e;
        }

        public boolean hasNext() {
            return this.f66557f > 0;
        }

        public Object next() {
            return Byte.valueOf(nextByte());
        }

        public byte nextByte() {
            if (!this.f66556e.hasNext()) {
                this.f66556e = this.f66555d.next().iterator();
            }
            this.f66557f--;
            return this.f66556e.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f66545n = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f66545n;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    public C23166s(C23156c cVar, C23156c cVar2) {
        this.f66547f = cVar;
        this.f66548g = cVar2;
        int size = cVar.size();
        this.f66549h = size;
        this.f66546e = size + cVar2.size();
        this.f66550i = Math.max(cVar.mo36545l(), cVar2.mo36545l()) + 1;
    }

    public boolean equals(Object obj) {
        int t;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23156c)) {
            return false;
        }
        C23156c cVar = (C23156c) obj;
        if (this.f66546e != cVar.size()) {
            return false;
        }
        if (this.f66546e == 0) {
            return true;
        }
        if (this.f66551j != 0 && (t = cVar.mo36552t()) != 0 && this.f66551j != t) {
            return false;
        }
        C23169c cVar2 = new C23169c(this, (C23167a) null);
        C23163o oVar = (C23163o) cVar2.next();
        C23169c cVar3 = new C23169c(cVar, (C23167a) null);
        C23163o oVar2 = (C23163o) cVar3.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = oVar.f66540e.length - i;
            int length2 = oVar2.f66540e.length - i2;
            int min = Math.min(length, length2);
            if (!(i == 0 ? oVar.mo36579w(oVar2, i2, min) : oVar2.mo36579w(oVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f66546e;
            if (i3 < i4) {
                if (min == length) {
                    oVar = (C23163o) cVar2.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == length2) {
                    oVar2 = (C23163o) cVar3.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int i = this.f66551j;
        if (i == 0) {
            int i2 = this.f66546e;
            i = mo36549r(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f66551j = i;
        }
        return i;
    }

    /* renamed from: k */
    public void mo36544k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f66549h;
        if (i4 <= i5) {
            this.f66547f.mo36544k(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f66548g.mo36544k(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f66547f.mo36544k(bArr, i, i2, i6);
            this.f66548g.mo36544k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* renamed from: l */
    public int mo36545l() {
        return this.f66550i;
    }

    /* renamed from: m */
    public boolean mo36546m() {
        return this.f66546e >= f66545n[this.f66550i];
    }

    /* renamed from: n */
    public boolean mo36547n() {
        int s = this.f66547f.mo36550s(0, 0, this.f66549h);
        C23156c cVar = this.f66548g;
        return cVar.mo36550s(s, 0, cVar.size()) == 0;
    }

    /* renamed from: o */
    public C23156c.C23157a iterator() {
        return new C23170d(this, (C23167a) null);
    }

    /* renamed from: r */
    public int mo36549r(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f66549h;
        if (i4 <= i5) {
            return this.f66547f.mo36549r(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f66548g.mo36549r(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f66548g.mo36549r(this.f66547f.mo36549r(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: s */
    public int mo36550s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f66549h;
        if (i4 <= i5) {
            return this.f66547f.mo36550s(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f66548g.mo36550s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f66548g.mo36550s(this.f66547f.mo36550s(i, i2, i6), 0, i3 - i6);
    }

    public int size() {
        return this.f66546e;
    }

    /* renamed from: t */
    public int mo36552t() {
        return this.f66551j;
    }

    /* renamed from: u */
    public String mo36554u(String str) {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = C23159i.f66537a;
        } else {
            byte[] bArr2 = new byte[size];
            mo36544k(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        return new String(bArr, str);
    }

    /* renamed from: v */
    public void mo36555v(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f66549h;
        if (i3 <= i4) {
            this.f66547f.mo36555v(outputStream, i, i2);
        } else if (i >= i4) {
            this.f66548g.mo36555v(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f66547f.mo36555v(outputStream, i, i5);
            this.f66548g.mo36555v(outputStream, 0, i2 - i5);
        }
    }
}
