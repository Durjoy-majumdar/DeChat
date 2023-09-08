package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jr2 */
public class C64477jr2 extends C47465a {

    /* renamed from: d */
    public zr4 f183830d;

    /* renamed from: e */
    public C48889bp1 f183831e;

    /* renamed from: f */
    public int f183832f;

    /* renamed from: g */
    public int f183833g;

    /* renamed from: h */
    public int f183834h;

    /* renamed from: i */
    public int f183835i;

    /* renamed from: j */
    public zr4 f183836j;

    /* renamed from: n */
    public int f183837n;

    /* renamed from: o */
    public String f183838o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64477jr2)) {
            return false;
        }
        C64477jr2 jr22 = (C64477jr2) aVar;
        return C46238a.m51546a(this.f183830d, jr22.f183830d) && C46238a.m51546a(this.f183831e, jr22.f183831e) && C46238a.m51546a(Integer.valueOf(this.f183832f), Integer.valueOf(jr22.f183832f)) && C46238a.m51546a(Integer.valueOf(this.f183833g), Integer.valueOf(jr22.f183833g)) && C46238a.m51546a(Integer.valueOf(this.f183834h), Integer.valueOf(jr22.f183834h)) && C46238a.m51546a(Integer.valueOf(this.f183835i), Integer.valueOf(jr22.f183835i)) && C46238a.m51546a(this.f183836j, jr22.f183836j) && C46238a.m51546a(Integer.valueOf(this.f183837n), Integer.valueOf(jr22.f183837n)) && C46238a.m51546a(this.f183838o, jr22.f183838o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zr4 zr4 = this.f183830d;
            if (zr4 != null) {
                aVar.mo74322i(1, zr4.computeSize());
                this.f183830d.writeFields(aVar);
            }
            C48889bp1 bp12 = this.f183831e;
            if (bp12 != null) {
                aVar.mo74322i(2, bp12.computeSize());
                this.f183831e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f183832f);
            aVar.mo74318e(4, this.f183833g);
            aVar.mo74318e(5, this.f183834h);
            aVar.mo74318e(6, this.f183835i);
            zr4 zr42 = this.f183836j;
            if (zr42 != null) {
                aVar.mo74322i(7, zr42.computeSize());
                this.f183836j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f183837n);
            String str = this.f183838o;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            return 0;
        } else if (i == 1) {
            zr4 zr43 = this.f183830d;
            if (zr43 != null) {
                i2 = 0 + C52418a.m58682i(1, zr43.computeSize());
            }
            C48889bp1 bp13 = this.f183831e;
            if (bp13 != null) {
                i2 += C52418a.m58682i(2, bp13.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f183832f) + C52418a.m58678e(4, this.f183833g) + C52418a.m58678e(5, this.f183834h) + C52418a.m58678e(6, this.f183835i);
            zr4 zr44 = this.f183836j;
            if (zr44 != null) {
                e += C52418a.m58682i(7, zr44.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f183837n);
            String str2 = this.f183838o;
            return str2 != null ? e2 + C52418a.m58683j(9, str2) : e2;
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
            C64477jr2 jr22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        zr4 zr45 = new zr4();
                        if (bArr != null && bArr.length > 0) {
                            zr45.parseFrom(bArr);
                        }
                        jr22.f183830d = zr45;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48889bp1 bp14 = new C48889bp1();
                        if (bArr2 != null && bArr2.length > 0) {
                            bp14.parseFrom(bArr2);
                        }
                        jr22.f183831e = bp14;
                    }
                    return 0;
                case 3:
                    jr22.f183832f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jr22.f183833g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jr22.f183834h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    jr22.f183835i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        zr4 zr46 = new zr4();
                        if (bArr3 != null && bArr3.length > 0) {
                            zr46.parseFrom(bArr3);
                        }
                        jr22.f183836j = zr46;
                    }
                    return 0;
                case 8:
                    jr22.f183837n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jr22.f183838o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
