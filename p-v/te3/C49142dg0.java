package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dg0 */
public class C49142dg0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f132302d;

    /* renamed from: e */
    public long f132303e;

    /* renamed from: f */
    public long f132304f;

    /* renamed from: g */
    public String f132305g;

    /* renamed from: h */
    public int f132306h;

    /* renamed from: i */
    public boolean f132307i;

    /* renamed from: j */
    public String f132308j;

    /* renamed from: n */
    public int f132309n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49142dg0)) {
            return false;
        }
        C49142dg0 dg02 = (C49142dg0) aVar;
        return C46238a.m51546a(this.BaseRequest, dg02.BaseRequest) && C46238a.m51546a(this.f132302d, dg02.f132302d) && C46238a.m51546a(Long.valueOf(this.f132303e), Long.valueOf(dg02.f132303e)) && C46238a.m51546a(Long.valueOf(this.f132304f), Long.valueOf(dg02.f132304f)) && C46238a.m51546a(this.f132305g, dg02.f132305g) && C46238a.m51546a(Integer.valueOf(this.f132306h), Integer.valueOf(dg02.f132306h)) && C46238a.m51546a(Boolean.valueOf(this.f132307i), Boolean.valueOf(dg02.f132307i)) && C46238a.m51546a(this.f132308j, dg02.f132308j) && C46238a.m51546a(Integer.valueOf(this.f132309n), Integer.valueOf(dg02.f132309n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f132302d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f132302d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f132303e);
            aVar.mo74321h(4, this.f132304f);
            String str = this.f132305g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f132306h);
            aVar.mo74314a(7, this.f132307i);
            String str2 = this.f132308j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74318e(9, this.f132309n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f132302d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f132303e) + C52418a.m58681h(4, this.f132304f);
            String str3 = this.f132305g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            int e = h + C52418a.m58678e(6, this.f132306h) + C52418a.m58674a(7, this.f132307i);
            String str4 = this.f132308j;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            return e + C52418a.m58678e(9, this.f132309n);
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
            C49142dg0 dg02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        dg02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        dg02.f132302d = ig04;
                    }
                    return 0;
                case 3:
                    dg02.f132303e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    dg02.f132304f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    dg02.f132305g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dg02.f132306h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dg02.f132307i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    dg02.f132308j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dg02.f132309n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
