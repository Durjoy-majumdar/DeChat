package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yp */
public class C52148yp extends C49335eu3 {

    /* renamed from: d */
    public String f145443d;

    /* renamed from: e */
    public int f145444e;

    /* renamed from: f */
    public int f145445f;

    /* renamed from: g */
    public long f145446g;

    /* renamed from: h */
    public String f145447h;

    /* renamed from: i */
    public boolean f145448i;

    /* renamed from: j */
    public String f145449j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52148yp)) {
            return false;
        }
        C52148yp ypVar = (C52148yp) aVar;
        return C46238a.m51546a(this.BaseResponse, ypVar.BaseResponse) && C46238a.m51546a(this.f145443d, ypVar.f145443d) && C46238a.m51546a(Integer.valueOf(this.f145444e), Integer.valueOf(ypVar.f145444e)) && C46238a.m51546a(Integer.valueOf(this.f145445f), Integer.valueOf(ypVar.f145445f)) && C46238a.m51546a(Long.valueOf(this.f145446g), Long.valueOf(ypVar.f145446g)) && C46238a.m51546a(this.f145447h, ypVar.f145447h) && C46238a.m51546a(Boolean.valueOf(this.f145448i), Boolean.valueOf(ypVar.f145448i)) && C46238a.m51546a(this.f145449j, ypVar.f145449j);
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
                String str = this.f145443d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f145444e);
                aVar.mo74318e(4, this.f145445f);
                aVar.mo74321h(5, this.f145446g);
                String str2 = this.f145447h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74314a(7, this.f145448i);
                String str3 = this.f145449j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f145443d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f145444e) + C52418a.m58678e(4, this.f145445f) + C52418a.m58681h(5, this.f145446g);
            String str5 = this.f145447h;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            int a = e + C52418a.m58674a(7, this.f145448i);
            String str6 = this.f145449j;
            return str6 != null ? a + C52418a.m58683j(8, str6) : a;
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
            C52148yp ypVar = objArr[1];
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
                        ypVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ypVar.f145443d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ypVar.f145444e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ypVar.f145445f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ypVar.f145446g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ypVar.f145447h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ypVar.f145448i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    ypVar.f145449j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
