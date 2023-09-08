package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.du0 */
public class C64327du0 extends C47465a {

    /* renamed from: d */
    public String f182849d;

    /* renamed from: e */
    public int f182850e;

    /* renamed from: f */
    public String f182851f;

    /* renamed from: g */
    public String f182852g;

    /* renamed from: h */
    public int f182853h;

    /* renamed from: i */
    public int f182854i;

    /* renamed from: j */
    public C64892zr1 f182855j;

    /* renamed from: n */
    public int f182856n;

    /* renamed from: o */
    public String f182857o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64327du0)) {
            return false;
        }
        C64327du0 du02 = (C64327du0) aVar;
        return C46238a.m51546a(this.f182849d, du02.f182849d) && C46238a.m51546a(Integer.valueOf(this.f182850e), Integer.valueOf(du02.f182850e)) && C46238a.m51546a(this.f182851f, du02.f182851f) && C46238a.m51546a(this.f182852g, du02.f182852g) && C46238a.m51546a(Integer.valueOf(this.f182853h), Integer.valueOf(du02.f182853h)) && C46238a.m51546a(Integer.valueOf(this.f182854i), Integer.valueOf(du02.f182854i)) && C46238a.m51546a(this.f182855j, du02.f182855j) && C46238a.m51546a(Integer.valueOf(this.f182856n), Integer.valueOf(du02.f182856n)) && C46238a.m51546a(this.f182857o, du02.f182857o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182849d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182850e);
            String str2 = this.f182851f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182852g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f182853h);
            aVar.mo74318e(6, this.f182854i);
            C64892zr1 zr12 = this.f182855j;
            if (zr12 != null) {
                aVar.mo74322i(7, zr12.computeSize());
                this.f182855j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f182856n);
            String str4 = this.f182857o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182849d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f182850e);
            String str6 = this.f182851f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f182852g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f182853h) + C52418a.m58678e(6, this.f182854i);
            C64892zr1 zr13 = this.f182855j;
            if (zr13 != null) {
                e2 += C52418a.m58682i(7, zr13.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(8, this.f182856n);
            String str8 = this.f182857o;
            return str8 != null ? e3 + C52418a.m58683j(9, str8) : e3;
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
            C64327du0 du02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    du02.f182849d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    du02.f182850e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    du02.f182851f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    du02.f182852g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    du02.f182853h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    du02.f182854i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64892zr1 zr14 = new C64892zr1();
                        if (bArr != null && bArr.length > 0) {
                            zr14.parseFrom(bArr);
                        }
                        du02.f182855j = zr14;
                    }
                    return 0;
                case 8:
                    du02.f182856n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    du02.f182857o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
