package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dc3 */
public class C49125dc3 extends C49335eu3 {

    /* renamed from: d */
    public String f132233d;

    /* renamed from: e */
    public String f132234e;

    /* renamed from: f */
    public String f132235f;

    /* renamed from: g */
    public int f132236g;

    /* renamed from: h */
    public String f132237h;

    /* renamed from: i */
    public String f132238i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49125dc3)) {
            return false;
        }
        C49125dc3 dc32 = (C49125dc3) aVar;
        return C46238a.m51546a(this.BaseResponse, dc32.BaseResponse) && C46238a.m51546a(this.f132233d, dc32.f132233d) && C46238a.m51546a(this.f132234e, dc32.f132234e) && C46238a.m51546a(this.f132235f, dc32.f132235f) && C46238a.m51546a(Integer.valueOf(this.f132236g), Integer.valueOf(dc32.f132236g)) && C46238a.m51546a(this.f132237h, dc32.f132237h) && C46238a.m51546a(this.f132238i, dc32.f132238i);
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
                String str = this.f132233d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132234e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f132235f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f132236g);
                String str4 = this.f132237h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f132238i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str6 = this.f132233d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f132234e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f132235f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            int e = i2 + C52418a.m58678e(5, this.f132236g);
            String str9 = this.f132237h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f132238i;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C49125dc3 dc32 = objArr[1];
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
                        dc32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    dc32.f132233d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dc32.f132234e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dc32.f132235f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dc32.f132236g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dc32.f132237h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dc32.f132238i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
