package v14;

import java.util.LinkedList;
import pe3.C89349b;
import w14.C102302b;
import x14.C102536a;
import x14.C102537b;

/* renamed from: v14.a */
public class C102122a {

    /* renamed from: a */
    public final C102302b f300706a;

    /* renamed from: b */
    public final C102536a f300707b;

    /* renamed from: c */
    public int f300708c = 0;

    public C102122a(byte[] bArr, C102302b bVar) {
        this.f300707b = new C102536a(bArr, 0, bArr.length);
        this.f300706a = bVar;
    }

    /* renamed from: a */
    public int mo141623a() {
        int i;
        C102536a aVar = this.f300707b;
        if (aVar.f301908c == aVar.f301907b) {
            i = 0;
            aVar.mo142156i(false);
        } else {
            i = aVar.mo142153f();
            if (i == 0) {
                throw new C102537b("Protocol message contained an invalid tag (zero).");
            }
        }
        this.f300708c = i;
        return i >>> 3;
    }

    /* renamed from: b */
    public void mo141624b() {
        int i = this.f300708c & 7;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FieldNumber: ");
        stringBuffer.append(this.f300708c >>> 3);
        stringBuffer.append(" - ");
        if (i == 0) {
            stringBuffer.append("varint (long, int or boolean) value: ");
            stringBuffer.append(this.f300707b.mo142154g());
        } else if (i == 1) {
            stringBuffer.append("double value: ");
            stringBuffer.append(Double.toString(this.f300707b.mo142148a()));
        } else if (i == 2) {
            stringBuffer.append("Length delimited (String or ByteString) value: ");
            stringBuffer.append(this.f300707b.mo142155h());
        } else if (i == 5) {
            stringBuffer.append("float value: ");
            stringBuffer.append(Float.toString(this.f300707b.mo142149b()));
        }
        this.f300706a.mo73762a(stringBuffer.toString());
    }

    /* renamed from: c */
    public boolean mo141625c(int i) {
        return this.f300707b.mo142153f() != 0;
    }

    /* renamed from: d */
    public C89349b mo141626d(int i) {
        C102536a aVar = this.f300707b;
        int f = aVar.mo142153f();
        int i2 = aVar.f301907b;
        int i3 = aVar.f301908c;
        if (f >= i2 - i3 || f <= 0) {
            return C89349b.m111674a(aVar.mo142152e(f));
        }
        C89349b bVar = new C89349b(aVar.f301906a, i3, f);
        aVar.f301908c += f;
        return bVar;
    }

    /* renamed from: e */
    public double mo141627e(int i) {
        return this.f300707b.mo142148a();
    }

    /* renamed from: f */
    public float mo141628f(int i) {
        return this.f300707b.mo142149b();
    }

    /* renamed from: g */
    public int mo141629g(int i) {
        return this.f300707b.mo142153f();
    }

    /* renamed from: h */
    public int mo141630h(int i) {
        return mo141629g(i);
    }

    /* renamed from: i */
    public long mo141631i(int i) {
        return this.f300707b.mo142154g();
    }

    /* renamed from: j */
    public LinkedList<byte[]> mo141632j(int i) {
        C102536a aVar = this.f300707b;
        aVar.getClass();
        LinkedList<byte[]> linkedList = new LinkedList<>();
        int f = aVar.mo142153f();
        try {
            byte[] bArr = new byte[f];
            System.arraycopy(aVar.f301906a, aVar.f301908c, bArr, 0, f);
            linkedList.add(bArr);
            int i2 = aVar.f301908c + f;
            aVar.f301908c = i2;
            if (i2 != aVar.f301907b) {
                int[] c = aVar.mo142150c(i2);
                int i3 = c[0];
                while ((i3 >>> 3) == i) {
                    aVar.f301908c = c[1];
                    int f2 = aVar.mo142153f();
                    byte[] bArr2 = new byte[f2];
                    System.arraycopy(aVar.f301906a, aVar.f301908c, bArr2, 0, f2);
                    linkedList.add(bArr2);
                    int i4 = aVar.f301908c + f2;
                    aVar.f301908c = i4;
                    if (i4 == aVar.f301907b) {
                        break;
                    }
                    c = aVar.mo142150c(i4);
                    i3 = c[0];
                }
            }
            return linkedList;
        } catch (OutOfMemoryError unused) {
            throw new OutOfMemoryError("alloc bytes:" + f);
        }
    }

    /* renamed from: k */
    public String mo141633k(int i) {
        return this.f300707b.mo142155h();
    }
}
