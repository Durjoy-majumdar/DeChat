package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.k */
public abstract class C16994k implements Iterable<Byte>, Serializable {

    /* renamed from: e */
    public static final C16994k f46000e = new C17000f(C23908o0.f68507c);

    /* renamed from: f */
    public static final C16998d f46001f = (C16987e.m16777a() ? new C17001g((C16993j) null) : new C16996b((C16993j) null));

    /* renamed from: d */
    public int f46002d = 0;

    /* renamed from: com.google.protobuf.k$a */
    public static abstract class C16995a implements Iterator {
        public Object next() {
            C16993j jVar = (C16993j) this;
            int i = jVar.f45997d;
            if (i < jVar.f45998e) {
                jVar.f45997d = i + 1;
                return Byte.valueOf(jVar.f45999f.mo18743m(i));
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.k$b */
    public static final class C16996b implements C16998d {
        public C16996b(C16993j jVar) {
        }

        /* renamed from: a */
        public byte[] mo18756a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.google.protobuf.k$c */
    public static final class C16997c extends C17000f {

        /* renamed from: h */
        public final int f46003h;

        /* renamed from: i */
        public final int f46004i;

        public C16997c(byte[] bArr, int i, int i2) {
            super(bArr);
            C16994k.m16789h(i, i + i2, bArr.length);
            this.f46003h = i;
            this.f46004i = i2;
        }

        /* renamed from: f */
        public byte mo18738f(int i) {
            int i2 = this.f46004i;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f46005g[this.f46003h + i];
            }
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb4 = new StringBuilder(40);
            sb4.append("Index > length: ");
            sb4.append(i);
            sb4.append(", ");
            sb4.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb4.toString());
        }

        /* renamed from: l */
        public void mo18742l(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f46005g, this.f46003h + i, bArr, i2, i3);
        }

        /* renamed from: m */
        public byte mo18743m(int i) {
            return this.f46005g[this.f46003h + i];
        }

        public int size() {
            return this.f46004i;
        }

        /* renamed from: w */
        public int mo18757w() {
            return this.f46003h;
        }
    }

    /* renamed from: com.google.protobuf.k$d */
    public interface C16998d {
        /* renamed from: a */
        byte[] mo18756a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.k$e */
    public static abstract class C16999e extends C16994k {
        public Iterator iterator() {
            return new C16993j(this);
        }
    }

    /* renamed from: com.google.protobuf.k$f */
    public static class C17000f extends C16999e {

        /* renamed from: g */
        public final byte[] f46005g;

        public C17000f(byte[] bArr) {
            bArr.getClass();
            this.f46005g = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C16994k) || size() != ((C16994k) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C17000f)) {
                return obj.equals(this);
            }
            C17000f fVar = (C17000f) obj;
            int i = this.f46002d;
            int i2 = fVar.f46002d;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                int size2 = size();
                StringBuilder sb = new StringBuilder(40);
                sb.append("Length too large: ");
                sb.append(size);
                sb.append(size2);
                throw new IllegalArgumentException(sb.toString());
            } else if (0 + size <= fVar.size()) {
                byte[] bArr = this.f46005g;
                byte[] bArr2 = fVar.f46005g;
                int w = mo18757w() + size;
                int w2 = mo18757w();
                int w3 = fVar.mo18757w() + 0;
                while (w2 < w) {
                    if (bArr[w2] != bArr2[w3]) {
                        return false;
                    }
                    w2++;
                    w3++;
                }
                return true;
            } else {
                int size3 = fVar.size();
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("Ran off end of other: ");
                sb4.append(0);
                sb4.append(", ");
                sb4.append(size);
                sb4.append(", ");
                sb4.append(size3);
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: f */
        public byte mo18738f(int i) {
            return this.f46005g[i];
        }

        /* renamed from: l */
        public void mo18742l(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f46005g, i, bArr, i2, i3);
        }

        /* renamed from: m */
        public byte mo18743m(int i) {
            return this.f46005g[i];
        }

        /* renamed from: n */
        public final boolean mo18744n() {
            int w = mo18757w();
            return C24079y2.m30063e(this.f46005g, w, size() + w);
        }

        /* renamed from: o */
        public final C23856l mo18745o() {
            return C23856l.m28959i(this.f46005g, mo18757w(), size(), true);
        }

        /* renamed from: p */
        public final int mo18746p(int i, int i2, int i3) {
            byte[] bArr = this.f46005g;
            int w = mo18757w() + i2;
            Charset charset = C23908o0.f68505a;
            for (int i4 = w; i4 < w + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }

        /* renamed from: r */
        public final C16994k mo18747r(int i, int i2) {
            int h = C16994k.m16789h(i, i2, size());
            return h == 0 ? C16994k.f46000e : new C16997c(this.f46005g, mo18757w() + i, h);
        }

        public int size() {
            return this.f46005g.length;
        }

        /* renamed from: t */
        public final String mo18750t(Charset charset) {
            return new String(this.f46005g, mo18757w(), size(), charset);
        }

        /* renamed from: v */
        public final void mo18753v(C16991i iVar) {
            iVar.mo18733a(this.f46005g, mo18757w(), size());
        }

        /* renamed from: w */
        public int mo18757w() {
            return 0;
        }
    }

    /* renamed from: com.google.protobuf.k$g */
    public static final class C17001g implements C16998d {
        public C17001g(C16993j jVar) {
        }

        /* renamed from: a */
        public byte[] mo18756a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* renamed from: h */
    public static int m16789h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb4 = new StringBuilder(66);
            sb4.append("Beginning index larger than ending index: ");
            sb4.append(i);
            sb4.append(", ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        } else {
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("End index: ");
            sb5.append(i2);
            sb5.append(" >= ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* renamed from: i */
    public static C16994k m16790i(byte[] bArr, int i, int i2) {
        m16789h(i, i + i2, bArr.length);
        return new C17000f(f46001f.mo18756a(bArr, i, i2));
    }

    /* renamed from: k */
    public static C16994k m16791k(String str) {
        return new C17000f(str.getBytes(C23908o0.f68505a));
    }

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract byte mo18738f(int i);

    public final int hashCode() {
        int i = this.f46002d;
        if (i == 0) {
            int size = size();
            i = mo18746p(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f46002d = i;
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new C16993j(this);
    }

    /* renamed from: l */
    public abstract void mo18742l(byte[] bArr, int i, int i2, int i3);

    /* renamed from: m */
    public abstract byte mo18743m(int i);

    /* renamed from: n */
    public abstract boolean mo18744n();

    /* renamed from: o */
    public abstract C23856l mo18745o();

    /* renamed from: p */
    public abstract int mo18746p(int i, int i2, int i3);

    /* renamed from: r */
    public abstract C16994k mo18747r(int i, int i2);

    /* renamed from: s */
    public final byte[] mo18748s() {
        int size = size();
        if (size == 0) {
            return C23908o0.f68507c;
        }
        byte[] bArr = new byte[size];
        mo18742l(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    /* renamed from: t */
    public abstract String mo18750t(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? C113385n2.m155239a(this) : String.valueOf(C113385n2.m155239a(mo18747r(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final String mo18752u() {
        return size() == 0 ? "" : mo18750t(C23908o0.f68505a);
    }

    /* renamed from: v */
    public abstract void mo18753v(C16991i iVar);
}
