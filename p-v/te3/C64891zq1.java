package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zq1 */
public class C64891zq1 extends C47465a {

    /* renamed from: d */
    public py4 f186829d;

    /* renamed from: e */
    public my4 f186830e;

    /* renamed from: f */
    public oy4 f186831f;

    /* renamed from: g */
    public boolean f186832g;

    /* renamed from: h */
    public boolean f186833h;

    /* renamed from: i */
    public String f186834i;

    /* renamed from: j */
    public String f186835j;

    /* renamed from: n */
    public int f186836n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64891zq1)) {
            return false;
        }
        C64891zq1 zq12 = (C64891zq1) aVar;
        return C46238a.m51546a(this.f186829d, zq12.f186829d) && C46238a.m51546a(this.f186830e, zq12.f186830e) && C46238a.m51546a(this.f186831f, zq12.f186831f) && C46238a.m51546a(Boolean.valueOf(this.f186832g), Boolean.valueOf(zq12.f186832g)) && C46238a.m51546a(Boolean.valueOf(this.f186833h), Boolean.valueOf(zq12.f186833h)) && C46238a.m51546a(this.f186834i, zq12.f186834i) && C46238a.m51546a(this.f186835j, zq12.f186835j) && C46238a.m51546a(Integer.valueOf(this.f186836n), Integer.valueOf(zq12.f186836n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            py4 py4 = this.f186829d;
            if (py4 != null) {
                aVar.mo74322i(1, py4.computeSize());
                this.f186829d.writeFields(aVar);
            }
            my4 my4 = this.f186830e;
            if (my4 != null) {
                aVar.mo74322i(2, my4.computeSize());
                this.f186830e.writeFields(aVar);
            }
            oy4 oy4 = this.f186831f;
            if (oy4 != null) {
                aVar.mo74322i(3, oy4.computeSize());
                this.f186831f.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f186832g);
            aVar.mo74314a(5, this.f186833h);
            String str = this.f186834i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f186835j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(99, this.f186836n);
            return 0;
        } else if (i == 1) {
            py4 py42 = this.f186829d;
            if (py42 != null) {
                i2 = 0 + C52418a.m58682i(1, py42.computeSize());
            }
            my4 my42 = this.f186830e;
            if (my42 != null) {
                i2 += C52418a.m58682i(2, my42.computeSize());
            }
            oy4 oy42 = this.f186831f;
            if (oy42 != null) {
                i2 += C52418a.m58682i(3, oy42.computeSize());
            }
            int a = i2 + C52418a.m58674a(4, this.f186832g) + C52418a.m58674a(5, this.f186833h);
            String str3 = this.f186834i;
            if (str3 != null) {
                a += C52418a.m58683j(6, str3);
            }
            String str4 = this.f186835j;
            if (str4 != null) {
                a += C52418a.m58683j(7, str4);
            }
            return a + C52418a.m58678e(99, this.f186836n);
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
            C64891zq1 zq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 99) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            py4 py43 = new py4();
                            if (bArr != null && bArr.length > 0) {
                                py43.parseFrom(bArr);
                            }
                            zq12.f186829d = py43;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            my4 my43 = new my4();
                            if (bArr2 != null && bArr2.length > 0) {
                                my43.parseFrom(bArr2);
                            }
                            zq12.f186830e = my43;
                        }
                        return 0;
                    case 3:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            oy4 oy43 = new oy4();
                            if (bArr3 != null && bArr3.length > 0) {
                                oy43.parseFrom(bArr3);
                            }
                            zq12.f186831f = oy43;
                        }
                        return 0;
                    case 4:
                        zq12.f186832g = aVar3.mo141625c(intValue);
                        return 0;
                    case 5:
                        zq12.f186833h = aVar3.mo141625c(intValue);
                        return 0;
                    case 6:
                        zq12.f186834i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        zq12.f186835j = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                zq12.f186836n = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
