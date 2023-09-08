package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s92 */
public class C51214s92 extends C49335eu3 {

    /* renamed from: d */
    public int f141385d;

    /* renamed from: e */
    public int f141386e;

    /* renamed from: f */
    public LinkedList<gf4> f141387f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51214s92)) {
            return false;
        }
        C51214s92 s922 = (C51214s92) aVar;
        return C46238a.m51546a(this.BaseResponse, s922.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141385d), Integer.valueOf(s922.f141385d)) && C46238a.m51546a(Integer.valueOf(this.f141386e), Integer.valueOf(s922.f141386e)) && C46238a.m51546a(this.f141387f, s922.f141387f);
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
                aVar.mo74318e(2, this.f141385d);
                aVar.mo74318e(3, this.f141386e);
                aVar.mo74320g(4, 8, this.f141387f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141385d) + C52418a.m58678e(3, this.f141386e) + C52418a.m58680g(4, 8, this.f141387f);
        } else if (i == 2) {
            this.f141387f.clear();
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
            C51214s92 s922 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    s922.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                s922.f141385d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                s922.f141386e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    gf4 gf4 = new gf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        gf4.parseFrom(bArr2);
                    }
                    s922.f141387f.add(gf4);
                }
                return 0;
            }
        }
    }
}
