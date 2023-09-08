package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.t0 */
public class C39598t0 extends C47465a {

    /* renamed from: d */
    public int f106304d;

    /* renamed from: e */
    public C39596r0 f106305e;

    /* renamed from: f */
    public LinkedList<C39596r0> f106306f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C39596r0> f106307g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C39596r0> f106308h = new LinkedList<>();

    /* renamed from: i */
    public String f106309i;

    /* renamed from: j */
    public String f106310j;

    /* renamed from: n */
    public LinkedList<C39595q0> f106311n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C39595q0> f106312o = new LinkedList<>();

    /* renamed from: p */
    public String f106313p;

    /* renamed from: q */
    public boolean f106314q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39598t0)) {
            return false;
        }
        C39598t0 t0Var = (C39598t0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f106304d), Integer.valueOf(t0Var.f106304d)) && C46238a.m51546a(this.f106305e, t0Var.f106305e) && C46238a.m51546a(this.f106306f, t0Var.f106306f) && C46238a.m51546a(this.f106307g, t0Var.f106307g) && C46238a.m51546a(this.f106308h, t0Var.f106308h) && C46238a.m51546a(this.f106309i, t0Var.f106309i) && C46238a.m51546a(this.f106310j, t0Var.f106310j) && C46238a.m51546a(this.f106311n, t0Var.f106311n) && C46238a.m51546a(this.f106312o, t0Var.f106312o) && C46238a.m51546a(this.f106313p, t0Var.f106313p) && C46238a.m51546a(Boolean.valueOf(this.f106314q), Boolean.valueOf(t0Var.f106314q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f106304d);
            C39596r0 r0Var = this.f106305e;
            if (r0Var != null) {
                aVar.mo74322i(2, r0Var.computeSize());
                this.f106305e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f106306f);
            aVar.mo74320g(4, 8, this.f106307g);
            aVar.mo74320g(5, 8, this.f106308h);
            String str = this.f106309i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f106310j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74320g(8, 8, this.f106311n);
            aVar.mo74320g(9, 8, this.f106312o);
            String str3 = this.f106313p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            aVar.mo74314a(11, this.f106314q);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f106304d) + 0;
            C39596r0 r0Var2 = this.f106305e;
            if (r0Var2 != null) {
                e += C52418a.m58682i(2, r0Var2.computeSize());
            }
            int g = e + C52418a.m58680g(3, 8, this.f106306f) + C52418a.m58680g(4, 8, this.f106307g) + C52418a.m58680g(5, 8, this.f106308h);
            String str4 = this.f106309i;
            if (str4 != null) {
                g += C52418a.m58683j(6, str4);
            }
            String str5 = this.f106310j;
            if (str5 != null) {
                g += C52418a.m58683j(7, str5);
            }
            int g2 = g + C52418a.m58680g(8, 8, this.f106311n) + C52418a.m58680g(9, 8, this.f106312o);
            String str6 = this.f106313p;
            if (str6 != null) {
                g2 += C52418a.m58683j(10, str6);
            }
            return g2 + C52418a.m58674a(11, this.f106314q);
        } else if (i == 2) {
            this.f106306f.clear();
            this.f106307g.clear();
            this.f106308h.clear();
            this.f106311n.clear();
            this.f106312o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C39598t0 t0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t0Var.f106304d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C39596r0 r0Var3 = new C39596r0();
                        if (bArr != null && bArr.length > 0) {
                            r0Var3.parseFrom(bArr);
                        }
                        t0Var.f106305e = r0Var3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C39596r0 r0Var4 = new C39596r0();
                        if (bArr2 != null && bArr2.length > 0) {
                            r0Var4.parseFrom(bArr2);
                        }
                        t0Var.f106306f.add(r0Var4);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C39596r0 r0Var5 = new C39596r0();
                        if (bArr3 != null && bArr3.length > 0) {
                            r0Var5.parseFrom(bArr3);
                        }
                        t0Var.f106307g.add(r0Var5);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C39596r0 r0Var6 = new C39596r0();
                        if (bArr4 != null && bArr4.length > 0) {
                            r0Var6.parseFrom(bArr4);
                        }
                        t0Var.f106308h.add(r0Var6);
                    }
                    return 0;
                case 6:
                    t0Var.f106309i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t0Var.f106310j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C39595q0 q0Var = new C39595q0();
                        if (bArr5 != null && bArr5.length > 0) {
                            q0Var.parseFrom(bArr5);
                        }
                        t0Var.f106311n.add(q0Var);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C39595q0 q0Var2 = new C39595q0();
                        if (bArr6 != null && bArr6.length > 0) {
                            q0Var2.parseFrom(bArr6);
                        }
                        t0Var.f106312o.add(q0Var2);
                    }
                    return 0;
                case 10:
                    t0Var.f106313p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    t0Var.f106314q = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
