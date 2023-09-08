package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ya2 */
public class C52093ya2 extends C49335eu3 {

    /* renamed from: d */
    public String f145212d;

    /* renamed from: e */
    public int f145213e;

    /* renamed from: f */
    public String f145214f;

    /* renamed from: g */
    public LinkedList<String> f145215g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52093ya2)) {
            return false;
        }
        C52093ya2 ya22 = (C52093ya2) aVar;
        return C46238a.m51546a(this.BaseResponse, ya22.BaseResponse) && C46238a.m51546a(this.f145212d, ya22.f145212d) && C46238a.m51546a(Integer.valueOf(this.f145213e), Integer.valueOf(ya22.f145213e)) && C46238a.m51546a(this.f145214f, ya22.f145214f) && C46238a.m51546a(this.f145215g, ya22.f145215g);
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
                String str = this.f145212d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f145213e);
                String str2 = this.f145214f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 1, this.f145215g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f145212d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f145213e);
            String str4 = this.f145214f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58680g(5, 1, this.f145215g);
        } else if (i == 2) {
            this.f145215g.clear();
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
            C52093ya2 ya22 = objArr[1];
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
                    ya22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ya22.f145212d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ya22.f145213e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ya22.f145214f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ya22.f145215g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
