package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mm3 */
public class C50423mm3 extends C49335eu3 {

    /* renamed from: d */
    public String f138107d;

    /* renamed from: e */
    public int f138108e;

    /* renamed from: f */
    public int f138109f;

    /* renamed from: g */
    public LinkedList<C64496km3> f138110g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50423mm3)) {
            return false;
        }
        C50423mm3 mm32 = (C50423mm3) aVar;
        return C46238a.m51546a(this.BaseResponse, mm32.BaseResponse) && C46238a.m51546a(this.f138107d, mm32.f138107d) && C46238a.m51546a(Integer.valueOf(this.f138108e), Integer.valueOf(mm32.f138108e)) && C46238a.m51546a(Integer.valueOf(this.f138109f), Integer.valueOf(mm32.f138109f)) && C46238a.m51546a(this.f138110g, mm32.f138110g);
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
                String str = this.f138107d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f138108e);
                aVar.mo74318e(4, this.f138109f);
                aVar.mo74320g(5, 8, this.f138110g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f138107d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f138108e) + C52418a.m58678e(4, this.f138109f) + C52418a.m58680g(5, 8, this.f138110g);
        } else if (i == 2) {
            this.f138110g.clear();
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
            C50423mm3 mm32 = objArr[1];
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
                    mm32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mm32.f138107d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mm32.f138108e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mm32.f138109f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64496km3 km32 = new C64496km3();
                    if (bArr2 != null && bArr2.length > 0) {
                        km32.parseFrom(bArr2);
                    }
                    mm32.f138110g.add(km32);
                }
                return 0;
            }
        }
    }
}
