package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z21 */
public class C52204z21 extends C47465a {

    /* renamed from: d */
    public String f145640d;

    /* renamed from: e */
    public int f145641e;

    /* renamed from: f */
    public int f145642f;

    /* renamed from: g */
    public int f145643g;

    /* renamed from: h */
    public String f145644h;

    /* renamed from: i */
    public C51483u21 f145645i;

    /* renamed from: j */
    public int f145646j;

    /* renamed from: n */
    public int f145647n;

    /* renamed from: o */
    public int f145648o;

    /* renamed from: p */
    public int f145649p;

    /* renamed from: q */
    public int f145650q;

    /* renamed from: r */
    public C49540gb3 f145651r;

    /* renamed from: s */
    public C48948c31 f145652s;

    /* renamed from: t */
    public C51633v21 f145653t;

    /* renamed from: u */
    public int f145654u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52204z21)) {
            return false;
        }
        C52204z21 z212 = (C52204z21) aVar;
        return C46238a.m51546a(this.f145640d, z212.f145640d) && C46238a.m51546a(Integer.valueOf(this.f145641e), Integer.valueOf(z212.f145641e)) && C46238a.m51546a(Integer.valueOf(this.f145642f), Integer.valueOf(z212.f145642f)) && C46238a.m51546a(Integer.valueOf(this.f145643g), Integer.valueOf(z212.f145643g)) && C46238a.m51546a(this.f145644h, z212.f145644h) && C46238a.m51546a(this.f145645i, z212.f145645i) && C46238a.m51546a(Integer.valueOf(this.f145646j), Integer.valueOf(z212.f145646j)) && C46238a.m51546a(Integer.valueOf(this.f145647n), Integer.valueOf(z212.f145647n)) && C46238a.m51546a(Integer.valueOf(this.f145648o), Integer.valueOf(z212.f145648o)) && C46238a.m51546a(Integer.valueOf(this.f145649p), Integer.valueOf(z212.f145649p)) && C46238a.m51546a(Integer.valueOf(this.f145650q), Integer.valueOf(z212.f145650q)) && C46238a.m51546a(this.f145651r, z212.f145651r) && C46238a.m51546a(this.f145652s, z212.f145652s) && C46238a.m51546a(this.f145653t, z212.f145653t) && C46238a.m51546a(Integer.valueOf(this.f145654u), Integer.valueOf(z212.f145654u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145640d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145641e);
            aVar.mo74318e(3, this.f145642f);
            aVar.mo74318e(4, this.f145643g);
            String str2 = this.f145644h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C51483u21 u212 = this.f145645i;
            if (u212 != null) {
                aVar.mo74322i(6, u212.computeSize());
                this.f145645i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f145646j);
            aVar.mo74318e(8, this.f145647n);
            aVar.mo74318e(9, this.f145648o);
            aVar.mo74318e(10, this.f145649p);
            aVar.mo74318e(11, this.f145650q);
            C49540gb3 gb32 = this.f145651r;
            if (gb32 != null) {
                aVar.mo74322i(12, gb32.computeSize());
                this.f145651r.writeFields(aVar);
            }
            C48948c31 c312 = this.f145652s;
            if (c312 != null) {
                aVar.mo74322i(13, c312.computeSize());
                this.f145652s.writeFields(aVar);
            }
            C51633v21 v212 = this.f145653t;
            if (v212 != null) {
                aVar.mo74322i(14, v212.computeSize());
                this.f145653t.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f145654u);
            return 0;
        } else if (i2 == 1) {
            String str3 = this.f145640d;
            if (str3 != null) {
                i3 = C52418a.m58683j(1, str3) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f145641e) + C52418a.m58678e(3, this.f145642f) + C52418a.m58678e(4, this.f145643g);
            String str4 = this.f145644h;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            C51483u21 u213 = this.f145645i;
            if (u213 != null) {
                e += C52418a.m58682i(6, u213.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f145646j) + C52418a.m58678e(8, this.f145647n) + C52418a.m58678e(9, this.f145648o) + C52418a.m58678e(10, this.f145649p) + C52418a.m58678e(11, this.f145650q);
            C49540gb3 gb33 = this.f145651r;
            if (gb33 != null) {
                e2 += C52418a.m58682i(12, gb33.computeSize());
            }
            C48948c31 c313 = this.f145652s;
            if (c313 != null) {
                e2 += C52418a.m58682i(13, c313.computeSize());
            }
            C51633v21 v213 = this.f145653t;
            if (v213 != null) {
                e2 += C52418a.m58682i(14, v213.computeSize());
            }
            return e2 + C52418a.m58678e(15, this.f145654u);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52204z21 z212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    z212.f145640d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    z212.f145641e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    z212.f145642f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    z212.f145643g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    z212.f145644h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51483u21 u214 = new C51483u21();
                        if (bArr != null && bArr.length > 0) {
                            u214.parseFrom(bArr);
                        }
                        z212.f145645i = u214;
                    }
                    return 0;
                case 7:
                    z212.f145646j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    z212.f145647n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    z212.f145648o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    z212.f145649p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    z212.f145650q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49540gb3 gb34 = new C49540gb3();
                        if (bArr2 != null && bArr2.length > 0) {
                            gb34.parseFrom(bArr2);
                        }
                        z212.f145651r = gb34;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48948c31 c314 = new C48948c31();
                        if (bArr3 != null && bArr3.length > 0) {
                            c314.parseFrom(bArr3);
                        }
                        z212.f145652s = c314;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51633v21 v214 = new C51633v21();
                        if (bArr4 != null && bArr4.length > 0) {
                            v214.parseFrom(bArr4);
                        }
                        z212.f145653t = v214;
                    }
                    return 0;
                case 15:
                    z212.f145654u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
