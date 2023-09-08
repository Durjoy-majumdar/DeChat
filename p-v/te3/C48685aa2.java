package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aa2 */
public class C48685aa2 extends C49335eu3 {

    /* renamed from: d */
    public boolean f130397d = false;

    /* renamed from: e */
    public String f130398e;

    /* renamed from: f */
    public String f130399f;

    /* renamed from: g */
    public String f130400g;

    /* renamed from: h */
    public String f130401h;

    /* renamed from: i */
    public int f130402i;

    /* renamed from: j */
    public int f130403j;

    /* renamed from: n */
    public C52219z50 f130404n;

    /* renamed from: o */
    public C52219z50 f130405o;

    /* renamed from: p */
    public String f130406p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48685aa2)) {
            return false;
        }
        C48685aa2 aa22 = (C48685aa2) aVar;
        return C46238a.m51546a(this.BaseResponse, aa22.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f130397d), Boolean.valueOf(aa22.f130397d)) && C46238a.m51546a(this.f130398e, aa22.f130398e) && C46238a.m51546a(this.f130399f, aa22.f130399f) && C46238a.m51546a(this.f130400g, aa22.f130400g) && C46238a.m51546a(this.f130401h, aa22.f130401h) && C46238a.m51546a(Integer.valueOf(this.f130402i), Integer.valueOf(aa22.f130402i)) && C46238a.m51546a(Integer.valueOf(this.f130403j), Integer.valueOf(aa22.f130403j)) && C46238a.m51546a(this.f130404n, aa22.f130404n) && C46238a.m51546a(this.f130405o, aa22.f130405o) && C46238a.m51546a(this.f130406p, aa22.f130406p);
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
                aVar.mo74314a(2, this.f130397d);
                String str = this.f130398e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f130399f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f130400g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f130401h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74318e(7, this.f130402i);
                aVar.mo74318e(8, this.f130403j);
                C52219z50 z502 = this.f130404n;
                if (z502 != null) {
                    aVar.mo74322i(9, z502.computeSize());
                    this.f130404n.writeFields(aVar);
                }
                C52219z50 z503 = this.f130405o;
                if (z503 != null) {
                    aVar.mo74322i(10, z503.computeSize());
                    this.f130405o.writeFields(aVar);
                }
                String str5 = this.f130406p;
                if (str5 != null) {
                    aVar.mo74323j(11, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f130397d);
            String str6 = this.f130398e;
            if (str6 != null) {
                a += C52418a.m58683j(3, str6);
            }
            String str7 = this.f130399f;
            if (str7 != null) {
                a += C52418a.m58683j(4, str7);
            }
            String str8 = this.f130400g;
            if (str8 != null) {
                a += C52418a.m58683j(5, str8);
            }
            String str9 = this.f130401h;
            if (str9 != null) {
                a += C52418a.m58683j(6, str9);
            }
            int e = a + C52418a.m58678e(7, this.f130402i) + C52418a.m58678e(8, this.f130403j);
            C52219z50 z504 = this.f130404n;
            if (z504 != null) {
                e += C52418a.m58682i(9, z504.computeSize());
            }
            C52219z50 z505 = this.f130405o;
            if (z505 != null) {
                e += C52418a.m58682i(10, z505.computeSize());
            }
            String str10 = this.f130406p;
            return str10 != null ? e + C52418a.m58683j(11, str10) : e;
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
            C48685aa2 aa22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        aa22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    aa22.f130397d = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    aa22.f130398e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    aa22.f130399f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    aa22.f130400g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    aa22.f130401h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    aa22.f130402i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    aa22.f130403j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52219z50 z506 = new C52219z50();
                        if (bArr2 != null && bArr2.length > 0) {
                            z506.parseFrom(bArr2);
                        }
                        aa22.f130404n = z506;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52219z50 z507 = new C52219z50();
                        if (bArr3 != null && bArr3.length > 0) {
                            z507.parseFrom(bArr3);
                        }
                        aa22.f130405o = z507;
                    }
                    return 0;
                case 11:
                    aa22.f130406p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
