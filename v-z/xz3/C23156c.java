package xz3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import xz3.C23166s;

/* renamed from: xz3.c */
public abstract class C23156c implements Iterable<Byte> {

    /* renamed from: d */
    public static final C23156c f66530d = new C23163o(new byte[0]);

    /* renamed from: xz3.c$a */
    public interface C23157a extends Iterator<Byte> {
        byte nextByte();
    }

    static {
        Class<C23156c> cls = C23156c.class;
    }

    /* renamed from: f */
    public static C23156c m27502f(Iterator<C23156c> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m27502f(it, i2).mo36541h(m27502f(it, i - i2));
    }

    /* renamed from: p */
    public static C23158b m27503p() {
        return new C23158b(128);
    }

    /* renamed from: h */
    public C23156c mo36541h(C23156c cVar) {
        int size = size();
        int size2 = cVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            int[] iArr = C23166s.f66545n;
            C23166s sVar = this instanceof C23166s ? (C23166s) this : null;
            if (cVar.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return cVar;
            }
            int size3 = size() + cVar.size();
            if (size3 < 128) {
                int size4 = size();
                int size5 = cVar.size();
                byte[] bArr = new byte[(size4 + size5)];
                mo36542i(bArr, 0, 0, size4);
                cVar.mo36542i(bArr, 0, size4, size5);
                return new C23163o(bArr);
            } else if (sVar != null && sVar.f66548g.size() + cVar.size() < 128) {
                C23156c cVar2 = sVar.f66548g;
                int size6 = cVar2.size();
                int size7 = cVar.size();
                byte[] bArr2 = new byte[(size6 + size7)];
                cVar2.mo36542i(bArr2, 0, 0, size6);
                cVar.mo36542i(bArr2, 0, size6, size7);
                return new C23166s(sVar.f66547f, new C23163o(bArr2));
            } else if (sVar == null || sVar.f66547f.mo36545l() <= sVar.f66548g.mo36545l() || sVar.f66550i <= cVar.mo36545l()) {
                if (size3 >= C23166s.f66545n[Math.max(mo36545l(), cVar.mo36545l()) + 1]) {
                    return new C23166s(this, cVar);
                }
                C23166s.C23168b bVar = new C23166s.C23168b((C23166s.C23167a) null);
                bVar.mo36586a(this);
                bVar.mo36586a(cVar);
                C23156c pop = bVar.f66552a.pop();
                while (!bVar.f66552a.isEmpty()) {
                    pop = new C23166s(bVar.f66552a.pop(), pop);
                }
                return pop;
            } else {
                return new C23166s(sVar.f66547f, new C23166s(sVar.f66548g, cVar));
            }
        } else {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: i */
    public void mo36542i(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Target offset < 0: ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb5 = new StringBuilder(34);
                    sb5.append("Target end offset < 0: ");
                    sb5.append(i5);
                    throw new IndexOutOfBoundsException(sb5.toString());
                } else if (i3 > 0) {
                    mo36544k(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb6 = new StringBuilder(34);
                sb6.append("Source end offset < 0: ");
                sb6.append(i4);
                throw new IndexOutOfBoundsException(sb6.toString());
            }
        } else {
            StringBuilder sb7 = new StringBuilder(23);
            sb7.append("Length < 0: ");
            sb7.append(i3);
            throw new IndexOutOfBoundsException(sb7.toString());
        }
    }

    /* renamed from: k */
    public abstract void mo36544k(byte[] bArr, int i, int i2, int i3);

    /* renamed from: l */
    public abstract int mo36545l();

    /* renamed from: m */
    public abstract boolean mo36546m();

    /* renamed from: n */
    public abstract boolean mo36547n();

    /* renamed from: o */
    public abstract C23157a iterator();

    /* renamed from: r */
    public abstract int mo36549r(int i, int i2, int i3);

    /* renamed from: s */
    public abstract int mo36550s(int i, int i2, int i3);

    public abstract int size();

    /* renamed from: t */
    public abstract int mo36552t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: u */
    public abstract String mo36554u(String str);

    /* renamed from: v */
    public abstract void mo36555v(OutputStream outputStream, int i, int i2);

    /* renamed from: xz3.c$b */
    public static final class C23158b extends OutputStream {

        /* renamed from: i */
        public static final byte[] f66531i = new byte[0];

        /* renamed from: d */
        public final int f66532d;

        /* renamed from: e */
        public final ArrayList<C23156c> f66533e;

        /* renamed from: f */
        public int f66534f;

        /* renamed from: g */
        public byte[] f66535g;

        /* renamed from: h */
        public int f66536h;

        public C23158b(int i) {
            if (i >= 0) {
                this.f66532d = i;
                this.f66533e = new ArrayList<>();
                this.f66535g = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final void mo36557a(int i) {
            this.f66533e.add(new C23163o(this.f66535g));
            int length = this.f66534f + this.f66535g.length;
            this.f66534f = length;
            this.f66535g = new byte[Math.max(this.f66532d, Math.max(i, length >>> 1))];
            this.f66536h = 0;
        }

        /* renamed from: b */
        public final void mo36558b() {
            int i = this.f66536h;
            byte[] bArr = this.f66535g;
            if (i >= bArr.length) {
                this.f66533e.add(new C23163o(this.f66535g));
                this.f66535g = f66531i;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                this.f66533e.add(new C23163o(bArr2));
            }
            this.f66534f += this.f66536h;
            this.f66536h = 0;
        }

        /* renamed from: c */
        public synchronized C23156c mo36559c() {
            ArrayList<C23156c> arrayList;
            mo36558b();
            arrayList = this.f66533e;
            if (!(arrayList instanceof Collection)) {
                ArrayList<C23156c> arrayList2 = new ArrayList<>();
                Iterator<C23156c> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? C23156c.f66530d : C23156c.m27502f(arrayList.iterator(), arrayList.size());
        }

        public String toString() {
            int i;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.f66534f + this.f66536h;
            }
            objArr[1] = Integer.valueOf(i);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        public synchronized void write(int i) {
            if (this.f66536h == this.f66535g.length) {
                mo36557a(1);
            }
            byte[] bArr = this.f66535g;
            int i2 = this.f66536h;
            this.f66536h = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f66535g;
            int length = bArr2.length;
            int i3 = this.f66536h;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f66536h += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo36557a(i4);
                System.arraycopy(bArr, i + length2, this.f66535g, 0, i4);
                this.f66536h = i4;
            }
        }
    }
}
