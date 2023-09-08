package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c42 */
public class C48955c42 extends C49335eu3 {

    /* renamed from: d */
    public int f131497d;

    /* renamed from: e */
    public String f131498e;

    /* renamed from: f */
    public int f131499f;

    /* renamed from: g */
    public int f131500g;

    /* renamed from: h */
    public C51081ra3 f131501h;

    /* renamed from: i */
    public int f131502i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48955c42)) {
            return false;
        }
        C48955c42 c422 = (C48955c42) aVar;
        return C46238a.m51546a(this.BaseResponse, c422.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131497d), Integer.valueOf(c422.f131497d)) && C46238a.m51546a(this.f131498e, c422.f131498e) && C46238a.m51546a(Integer.valueOf(this.f131499f), Integer.valueOf(c422.f131499f)) && C46238a.m51546a(Integer.valueOf(this.f131500g), Integer.valueOf(c422.f131500g)) && C46238a.m51546a(this.f131501h, c422.f131501h) && C46238a.m51546a(Integer.valueOf(this.f131502i), Integer.valueOf(c422.f131502i));
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
                aVar.mo74318e(2, this.f131497d);
                String str = this.f131498e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f131499f);
                aVar.mo74318e(5, this.f131500g);
                C51081ra3 ra32 = this.f131501h;
                if (ra32 != null) {
                    aVar.mo74322i(6, ra32.computeSize());
                    this.f131501h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f131502i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131497d);
            String str2 = this.f131498e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f131499f) + C52418a.m58678e(5, this.f131500g);
            C51081ra3 ra33 = this.f131501h;
            if (ra33 != null) {
                e2 += C52418a.m58682i(6, ra33.computeSize());
            }
            return e2 + C52418a.m58678e(7, this.f131502i);
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
            C48955c42 c422 = objArr[1];
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
                        c422.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    c422.f131497d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    c422.f131498e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    c422.f131499f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    c422.f131500g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51081ra3 ra34 = new C51081ra3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ra34.parseFrom(bArr2);
                        }
                        c422.f131501h = ra34;
                    }
                    return 0;
                case 7:
                    c422.f131502i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
