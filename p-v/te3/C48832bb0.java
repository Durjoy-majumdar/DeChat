package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bb0 */
public class C48832bb0 extends C49335eu3 {

    /* renamed from: d */
    public int f131029d;

    /* renamed from: e */
    public String f131030e;

    /* renamed from: f */
    public int f131031f;

    /* renamed from: g */
    public int f131032g;

    /* renamed from: h */
    public String f131033h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48832bb0)) {
            return false;
        }
        C48832bb0 bb02 = (C48832bb0) aVar;
        return C46238a.m51546a(this.BaseResponse, bb02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131029d), Integer.valueOf(bb02.f131029d)) && C46238a.m51546a(this.f131030e, bb02.f131030e) && C46238a.m51546a(Integer.valueOf(this.f131031f), Integer.valueOf(bb02.f131031f)) && C46238a.m51546a(Integer.valueOf(this.f131032g), Integer.valueOf(bb02.f131032g)) && C46238a.m51546a(this.f131033h, bb02.f131033h);
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
                aVar.mo74318e(2, this.f131029d);
                String str = this.f131030e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f131031f);
                aVar.mo74318e(5, this.f131032g);
                String str2 = this.f131033h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131029d);
            String str3 = this.f131030e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f131031f) + C52418a.m58678e(5, this.f131032g);
            String str4 = this.f131033h;
            return str4 != null ? e2 + C52418a.m58683j(6, str4) : e2;
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
            C48832bb0 bb02 = objArr[1];
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
                        bb02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    bb02.f131029d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bb02.f131030e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bb02.f131031f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bb02.f131032g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bb02.f131033h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
