package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ig4 extends C49335eu3 {

    /* renamed from: d */
    public long f135330d;

    /* renamed from: e */
    public int f135331e;

    /* renamed from: f */
    public int f135332f;

    /* renamed from: g */
    public String f135333g;

    /* renamed from: h */
    public String f135334h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ig4)) {
            return false;
        }
        ig4 ig4 = (ig4) aVar;
        return C46238a.m51546a(this.BaseResponse, ig4.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f135330d), Long.valueOf(ig4.f135330d)) && C46238a.m51546a(Integer.valueOf(this.f135331e), Integer.valueOf(ig4.f135331e)) && C46238a.m51546a(Integer.valueOf(this.f135332f), Integer.valueOf(ig4.f135332f)) && C46238a.m51546a(this.f135333g, ig4.f135333g) && C46238a.m51546a(this.f135334h, ig4.f135334h);
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
                aVar.mo74321h(2, this.f135330d);
                aVar.mo74318e(3, this.f135331e);
                aVar.mo74318e(4, this.f135332f);
                String str = this.f135333g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                String str2 = this.f135334h;
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
            int h = i2 + C52418a.m58681h(2, this.f135330d) + C52418a.m58678e(3, this.f135331e) + C52418a.m58678e(4, this.f135332f);
            String str3 = this.f135333g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            String str4 = this.f135334h;
            return str4 != null ? h + C52418a.m58683j(6, str4) : h;
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
            ig4 ig4 = objArr[1];
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
                        ig4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ig4.f135330d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ig4.f135331e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ig4.f135332f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ig4.f135333g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ig4.f135334h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
