package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c90 */
public class C64279c90 extends C47465a {

    /* renamed from: d */
    public String f182444d;

    /* renamed from: e */
    public String f182445e;

    /* renamed from: f */
    public boolean f182446f;

    /* renamed from: g */
    public int f182447g;

    /* renamed from: h */
    public int f182448h;

    /* renamed from: i */
    public int f182449i;

    /* renamed from: j */
    public C64686ro2 f182450j;

    /* renamed from: n */
    public C64347eq2 f182451n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64279c90)) {
            return false;
        }
        C64279c90 c902 = (C64279c90) aVar;
        return C46238a.m51546a(this.f182444d, c902.f182444d) && C46238a.m51546a(this.f182445e, c902.f182445e) && C46238a.m51546a(Boolean.valueOf(this.f182446f), Boolean.valueOf(c902.f182446f)) && C46238a.m51546a(Integer.valueOf(this.f182447g), Integer.valueOf(c902.f182447g)) && C46238a.m51546a(Integer.valueOf(this.f182448h), Integer.valueOf(c902.f182448h)) && C46238a.m51546a(Integer.valueOf(this.f182449i), Integer.valueOf(c902.f182449i)) && C46238a.m51546a(this.f182450j, c902.f182450j) && C46238a.m51546a(this.f182451n, c902.f182451n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182444d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182445e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f182446f);
            aVar.mo74318e(4, this.f182447g);
            aVar.mo74318e(5, this.f182448h);
            aVar.mo74318e(6, this.f182449i);
            C64686ro2 ro22 = this.f182450j;
            if (ro22 != null) {
                aVar.mo74322i(7, ro22.computeSize());
                this.f182450j.writeFields(aVar);
            }
            C64347eq2 eq22 = this.f182451n;
            if (eq22 != null) {
                aVar.mo74322i(8, eq22.computeSize());
                this.f182451n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f182444d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f182445e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int a = i2 + C52418a.m58674a(3, this.f182446f) + C52418a.m58678e(4, this.f182447g) + C52418a.m58678e(5, this.f182448h) + C52418a.m58678e(6, this.f182449i);
            C64686ro2 ro23 = this.f182450j;
            if (ro23 != null) {
                a += C52418a.m58682i(7, ro23.computeSize());
            }
            C64347eq2 eq23 = this.f182451n;
            return eq23 != null ? a + C52418a.m58682i(8, eq23.computeSize()) : a;
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
            C64279c90 c902 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c902.f182444d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    c902.f182445e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c902.f182446f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    c902.f182447g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    c902.f182448h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    c902.f182449i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64686ro2 ro24 = new C64686ro2();
                        if (bArr != null && bArr.length > 0) {
                            ro24.parseFrom(bArr);
                        }
                        c902.f182450j = ro24;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64347eq2 eq24 = new C64347eq2();
                        if (bArr2 != null && bArr2.length > 0) {
                            eq24.parseFrom(bArr2);
                        }
                        c902.f182451n = eq24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
