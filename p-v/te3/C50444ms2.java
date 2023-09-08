package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ms2 */
public class C50444ms2 extends C49335eu3 {

    /* renamed from: d */
    public String f138177d;

    /* renamed from: e */
    public String f138178e;

    /* renamed from: f */
    public String f138179f;

    /* renamed from: g */
    public String f138180g;

    /* renamed from: h */
    public int f138181h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50444ms2)) {
            return false;
        }
        C50444ms2 ms22 = (C50444ms2) aVar;
        return C46238a.m51546a(this.BaseResponse, ms22.BaseResponse) && C46238a.m51546a(this.f138177d, ms22.f138177d) && C46238a.m51546a(this.f138178e, ms22.f138178e) && C46238a.m51546a(this.f138179f, ms22.f138179f) && C46238a.m51546a(this.f138180g, ms22.f138180g) && C46238a.m51546a(Integer.valueOf(this.f138181h), Integer.valueOf(ms22.f138181h));
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
                String str = this.f138177d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f138178e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f138179f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f138180g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74318e(6, this.f138181h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f138177d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f138178e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f138179f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f138180g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58678e(6, this.f138181h);
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
            C50444ms2 ms22 = objArr[1];
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
                        ms22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ms22.f138177d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ms22.f138178e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ms22.f138179f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ms22.f138180g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ms22.f138181h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
