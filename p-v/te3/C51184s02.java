package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s02 */
public class C51184s02 extends C49335eu3 {

    /* renamed from: d */
    public long f141248d;

    /* renamed from: e */
    public long f141249e;

    /* renamed from: f */
    public int f141250f;

    /* renamed from: g */
    public int f141251g;

    /* renamed from: h */
    public int f141252h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51184s02)) {
            return false;
        }
        C51184s02 s022 = (C51184s02) aVar;
        return C46238a.m51546a(this.BaseResponse, s022.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f141248d), Long.valueOf(s022.f141248d)) && C46238a.m51546a(Long.valueOf(this.f141249e), Long.valueOf(s022.f141249e)) && C46238a.m51546a(Integer.valueOf(this.f141250f), Integer.valueOf(s022.f141250f)) && C46238a.m51546a(Integer.valueOf(this.f141251g), Integer.valueOf(s022.f141251g)) && C46238a.m51546a(Integer.valueOf(this.f141252h), Integer.valueOf(s022.f141252h));
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
                aVar.mo74321h(2, this.f141248d);
                aVar.mo74321h(3, this.f141249e);
                aVar.mo74318e(4, this.f141250f);
                aVar.mo74318e(5, this.f141251g);
                aVar.mo74318e(6, this.f141252h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f141248d) + C52418a.m58681h(3, this.f141249e) + C52418a.m58678e(4, this.f141250f) + C52418a.m58678e(5, this.f141251g) + C52418a.m58678e(6, this.f141252h);
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
            C51184s02 s022 = objArr[1];
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
                        s022.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    s022.f141248d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    s022.f141249e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    s022.f141250f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    s022.f141251g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s022.f141252h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
