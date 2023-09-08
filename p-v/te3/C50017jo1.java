package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jo1 */
public class C50017jo1 extends C49335eu3 {

    /* renamed from: d */
    public int f136227d;

    /* renamed from: e */
    public int f136228e;

    /* renamed from: f */
    public String f136229f;

    /* renamed from: g */
    public boolean f136230g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50017jo1)) {
            return false;
        }
        C50017jo1 jo12 = (C50017jo1) aVar;
        return C46238a.m51546a(this.BaseResponse, jo12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136227d), Integer.valueOf(jo12.f136227d)) && C46238a.m51546a(Integer.valueOf(this.f136228e), Integer.valueOf(jo12.f136228e)) && C46238a.m51546a(this.f136229f, jo12.f136229f) && C46238a.m51546a(Boolean.valueOf(this.f136230g), Boolean.valueOf(jo12.f136230g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136227d);
            aVar.mo74318e(3, this.f136228e);
            String str = this.f136229f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74314a(5, this.f136230g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136227d) + C52418a.m58678e(3, this.f136228e);
            String str2 = this.f136229f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58674a(5, this.f136230g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50017jo1 jo12 = objArr[1];
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
                    jo12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                jo12.f136227d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                jo12.f136228e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                jo12.f136229f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                jo12.f136230g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
