package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cc2 */
public class C48984cc2 extends C49335eu3 {

    /* renamed from: d */
    public int f131637d;

    /* renamed from: e */
    public LinkedList<mx4> f131638e = new LinkedList<>();

    /* renamed from: f */
    public String f131639f;

    /* renamed from: g */
    public String f131640g;

    /* renamed from: h */
    public int f131641h;

    /* renamed from: i */
    public String f131642i;

    /* renamed from: j */
    public String f131643j;

    /* renamed from: n */
    public String f131644n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48984cc2)) {
            return false;
        }
        C48984cc2 cc22 = (C48984cc2) aVar;
        return C46238a.m51546a(this.BaseResponse, cc22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131637d), Integer.valueOf(cc22.f131637d)) && C46238a.m51546a(this.f131638e, cc22.f131638e) && C46238a.m51546a(this.f131639f, cc22.f131639f) && C46238a.m51546a(this.f131640g, cc22.f131640g) && C46238a.m51546a(Integer.valueOf(this.f131641h), Integer.valueOf(cc22.f131641h)) && C46238a.m51546a(this.f131642i, cc22.f131642i) && C46238a.m51546a(this.f131643j, cc22.f131643j) && C46238a.m51546a(this.f131644n, cc22.f131644n);
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
                aVar.mo74318e(2, this.f131637d);
                aVar.mo74320g(3, 8, this.f131638e);
                String str = this.f131639f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f131640g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f131641h);
                String str3 = this.f131642i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f131643j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f131644n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131637d) + C52418a.m58680g(3, 8, this.f131638e);
            String str6 = this.f131639f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f131640g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f131641h);
            String str8 = this.f131642i;
            if (str8 != null) {
                e2 += C52418a.m58683j(7, str8);
            }
            String str9 = this.f131643j;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            String str10 = this.f131644n;
            return str10 != null ? e2 + C52418a.m58683j(9, str10) : e2;
        } else if (i == 2) {
            this.f131638e.clear();
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
            C48984cc2 cc22 = objArr[1];
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
                        cc22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    cc22.f131637d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        mx4 mx4 = new mx4();
                        if (bArr2 != null && bArr2.length > 0) {
                            mx4.parseFrom(bArr2);
                        }
                        cc22.f131638e.add(mx4);
                    }
                    return 0;
                case 4:
                    cc22.f131639f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cc22.f131640g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cc22.f131641h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cc22.f131642i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cc22.f131643j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cc22.f131644n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
