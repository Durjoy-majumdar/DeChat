package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lj3 */
public class C77964lj3 extends C49335eu3 {

    /* renamed from: d */
    public int f227814d;

    /* renamed from: e */
    public String f227815e;

    /* renamed from: f */
    public String f227816f;

    /* renamed from: g */
    public String f227817g;

    /* renamed from: h */
    public int f227818h;

    /* renamed from: i */
    public int f227819i;

    /* renamed from: j */
    public C52159yr2 f227820j;

    /* renamed from: n */
    public String f227821n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77964lj3)) {
            return false;
        }
        C77964lj3 lj32 = (C77964lj3) aVar;
        return C46238a.m51546a(this.BaseResponse, lj32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227814d), Integer.valueOf(lj32.f227814d)) && C46238a.m51546a(this.f227815e, lj32.f227815e) && C46238a.m51546a(this.f227816f, lj32.f227816f) && C46238a.m51546a(this.f227817g, lj32.f227817g) && C46238a.m51546a(Integer.valueOf(this.f227818h), Integer.valueOf(lj32.f227818h)) && C46238a.m51546a(Integer.valueOf(this.f227819i), Integer.valueOf(lj32.f227819i)) && C46238a.m51546a(this.f227820j, lj32.f227820j) && C46238a.m51546a(this.f227821n, lj32.f227821n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f227814d);
                String str = this.f227815e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f227816f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f227817g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f227818h);
                aVar.mo74318e(7, this.f227819i);
                C52159yr2 yr22 = this.f227820j;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f227820j.writeFields(aVar);
                }
                String str4 = this.f227821n;
                if (str4 != null) {
                    aVar.mo74323j(100, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f227814d);
            String str5 = this.f227815e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f227816f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f227817g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f227818h) + C52418a.m58678e(7, this.f227819i);
            C52159yr2 yr23 = this.f227820j;
            if (yr23 != null) {
                e2 += C52418a.m58682i(99, yr23.computeSize());
            }
            String str8 = this.f227821n;
            return str8 != null ? e2 + C52418a.m58683j(100, str8) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77964lj3 lj32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 99) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52159yr2 yr24 = new C52159yr2();
                    if (bArr != null && bArr.length > 0) {
                        yr24.parseFrom(bArr);
                    }
                    lj32.f227820j = yr24;
                }
                return 0;
            } else if (intValue != 100) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C49966ja jaVar3 = new C49966ja();
                            if (bArr2 != null && bArr2.length > 0) {
                                jaVar3.parseFrom(bArr2);
                            }
                            lj32.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        lj32.f227814d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        lj32.f227815e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        lj32.f227816f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        lj32.f227817g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        lj32.f227818h = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        lj32.f227819i = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                lj32.f227821n = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
