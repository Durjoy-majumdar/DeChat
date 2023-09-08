package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class fn4 extends C49335eu3 {

    /* renamed from: d */
    public int f133600d;

    /* renamed from: e */
    public int f133601e;

    /* renamed from: f */
    public String f133602f;

    /* renamed from: g */
    public String f133603g;

    /* renamed from: h */
    public String f133604h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fn4)) {
            return false;
        }
        fn4 fn4 = (fn4) aVar;
        return C46238a.m51546a(this.BaseResponse, fn4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133600d), Integer.valueOf(fn4.f133600d)) && C46238a.m51546a(Integer.valueOf(this.f133601e), Integer.valueOf(fn4.f133601e)) && C46238a.m51546a(this.f133602f, fn4.f133602f) && C46238a.m51546a(this.f133603g, fn4.f133603g) && C46238a.m51546a(this.f133604h, fn4.f133604h);
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
                aVar.mo74318e(2, this.f133600d);
                aVar.mo74318e(3, this.f133601e);
                String str = this.f133602f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f133603g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f133604h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133600d) + C52418a.m58678e(3, this.f133601e);
            String str4 = this.f133602f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f133603g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f133604h;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            fn4 fn4 = objArr[1];
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
                        fn4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fn4.f133600d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fn4.f133601e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fn4.f133602f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fn4.f133603g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fn4.f133604h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
