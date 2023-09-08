package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kp1 */
public class C50160kp1 extends C47465a {

    /* renamed from: d */
    public int f136955d;

    /* renamed from: e */
    public int f136956e;

    /* renamed from: f */
    public int f136957f;

    /* renamed from: g */
    public int f136958g;

    /* renamed from: h */
    public String f136959h;

    /* renamed from: i */
    public C51978xi1 f136960i;

    /* renamed from: j */
    public int f136961j;

    /* renamed from: n */
    public int f136962n;

    /* renamed from: o */
    public int f136963o;

    /* renamed from: p */
    public int f136964p;

    /* renamed from: q */
    public int f136965q;

    /* renamed from: r */
    public int f136966r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50160kp1)) {
            return false;
        }
        C50160kp1 kp12 = (C50160kp1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136955d), Integer.valueOf(kp12.f136955d)) && C46238a.m51546a(Integer.valueOf(this.f136956e), Integer.valueOf(kp12.f136956e)) && C46238a.m51546a(Integer.valueOf(this.f136957f), Integer.valueOf(kp12.f136957f)) && C46238a.m51546a(Integer.valueOf(this.f136958g), Integer.valueOf(kp12.f136958g)) && C46238a.m51546a(this.f136959h, kp12.f136959h) && C46238a.m51546a(this.f136960i, kp12.f136960i) && C46238a.m51546a(Integer.valueOf(this.f136961j), Integer.valueOf(kp12.f136961j)) && C46238a.m51546a(Integer.valueOf(this.f136962n), Integer.valueOf(kp12.f136962n)) && C46238a.m51546a(Integer.valueOf(this.f136963o), Integer.valueOf(kp12.f136963o)) && C46238a.m51546a(Integer.valueOf(this.f136964p), Integer.valueOf(kp12.f136964p)) && C46238a.m51546a(Integer.valueOf(this.f136965q), Integer.valueOf(kp12.f136965q)) && C46238a.m51546a(Integer.valueOf(this.f136966r), Integer.valueOf(kp12.f136966r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136955d);
            aVar.mo74318e(2, this.f136956e);
            aVar.mo74318e(3, this.f136957f);
            aVar.mo74318e(4, this.f136958g);
            String str = this.f136959h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C51978xi1 xi12 = this.f136960i;
            if (xi12 != null) {
                aVar.mo74322i(6, xi12.computeSize());
                this.f136960i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f136961j);
            aVar.mo74318e(8, this.f136962n);
            aVar.mo74318e(9, this.f136963o);
            aVar.mo74318e(10, this.f136964p);
            aVar.mo74318e(11, this.f136965q);
            aVar.mo74318e(12, this.f136966r);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136955d) + 0 + C52418a.m58678e(2, this.f136956e) + C52418a.m58678e(3, this.f136957f) + C52418a.m58678e(4, this.f136958g);
            String str2 = this.f136959h;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            C51978xi1 xi13 = this.f136960i;
            if (xi13 != null) {
                e += C52418a.m58682i(6, xi13.computeSize());
            }
            return e + C52418a.m58678e(7, this.f136961j) + C52418a.m58678e(8, this.f136962n) + C52418a.m58678e(9, this.f136963o) + C52418a.m58678e(10, this.f136964p) + C52418a.m58678e(11, this.f136965q) + C52418a.m58678e(12, this.f136966r);
        } else if (i == 2) {
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
            C50160kp1 kp12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kp12.f136955d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    kp12.f136956e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    kp12.f136957f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    kp12.f136958g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kp12.f136959h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51978xi1 xi14 = new C51978xi1();
                        if (bArr != null && bArr.length > 0) {
                            xi14.parseFrom(bArr);
                        }
                        kp12.f136960i = xi14;
                    }
                    return 0;
                case 7:
                    kp12.f136961j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    kp12.f136962n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    kp12.f136963o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    kp12.f136964p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    kp12.f136965q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    kp12.f136966r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
