package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gz1 */
public class C90413gz1 extends C47465a {

    /* renamed from: d */
    public C90424kt3 f259532d;

    /* renamed from: e */
    public C64294cr2 f259533e;

    /* renamed from: f */
    public int f259534f;

    /* renamed from: g */
    public int f259535g;

    /* renamed from: h */
    public boolean f259536h;

    /* renamed from: i */
    public boolean f259537i;

    /* renamed from: j */
    public int f259538j;

    /* renamed from: n */
    public String f259539n;

    /* renamed from: o */
    public String f259540o;

    /* renamed from: p */
    public String f259541p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90413gz1)) {
            return false;
        }
        C90413gz1 gz12 = (C90413gz1) aVar;
        return C46238a.m51546a(this.f259532d, gz12.f259532d) && C46238a.m51546a(this.f259533e, gz12.f259533e) && C46238a.m51546a(Integer.valueOf(this.f259534f), Integer.valueOf(gz12.f259534f)) && C46238a.m51546a(Integer.valueOf(this.f259535g), Integer.valueOf(gz12.f259535g)) && C46238a.m51546a(Boolean.valueOf(this.f259536h), Boolean.valueOf(gz12.f259536h)) && C46238a.m51546a(Boolean.valueOf(this.f259537i), Boolean.valueOf(gz12.f259537i)) && C46238a.m51546a(Integer.valueOf(this.f259538j), Integer.valueOf(gz12.f259538j)) && C46238a.m51546a(this.f259539n, gz12.f259539n) && C46238a.m51546a(this.f259540o, gz12.f259540o) && C46238a.m51546a(this.f259541p, gz12.f259541p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90424kt3 kt32 = this.f259532d;
            if (kt32 != null) {
                aVar.mo74322i(1, kt32.computeSize());
                this.f259532d.writeFields(aVar);
            }
            C64294cr2 cr22 = this.f259533e;
            if (cr22 != null) {
                aVar.mo74322i(2, cr22.computeSize());
                this.f259533e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f259534f);
            aVar.mo74318e(4, this.f259535g);
            aVar.mo74314a(5, this.f259536h);
            aVar.mo74314a(6, this.f259537i);
            aVar.mo74318e(7, this.f259538j);
            String str = this.f259539n;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            String str2 = this.f259540o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            String str3 = this.f259541p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            return 0;
        } else if (i == 1) {
            C90424kt3 kt33 = this.f259532d;
            if (kt33 != null) {
                i2 = 0 + C52418a.m58682i(1, kt33.computeSize());
            }
            C64294cr2 cr23 = this.f259533e;
            if (cr23 != null) {
                i2 += C52418a.m58682i(2, cr23.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f259534f) + C52418a.m58678e(4, this.f259535g) + C52418a.m58674a(5, this.f259536h) + C52418a.m58674a(6, this.f259537i) + C52418a.m58678e(7, this.f259538j);
            String str4 = this.f259539n;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            String str5 = this.f259540o;
            if (str5 != null) {
                e += C52418a.m58683j(9, str5);
            }
            String str6 = this.f259541p;
            return str6 != null ? e + C52418a.m58683j(10, str6) : e;
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
            C90413gz1 gz12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90424kt3 kt34 = new C90424kt3();
                        if (bArr != null && bArr.length > 0) {
                            kt34.parseFrom(bArr);
                        }
                        gz12.f259532d = kt34;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64294cr2 cr24 = new C64294cr2();
                        if (bArr2 != null && bArr2.length > 0) {
                            cr24.parseFrom(bArr2);
                        }
                        gz12.f259533e = cr24;
                    }
                    return 0;
                case 3:
                    gz12.f259534f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gz12.f259535g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gz12.f259536h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    gz12.f259537i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    gz12.f259538j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gz12.f259539n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gz12.f259540o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    gz12.f259541p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
