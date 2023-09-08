package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s13 */
public class C51190s13 extends C49335eu3 {

    /* renamed from: d */
    public int f141271d;

    /* renamed from: e */
    public int f141272e;

    /* renamed from: f */
    public int f141273f;

    /* renamed from: g */
    public boolean f141274g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51190s13)) {
            return false;
        }
        C51190s13 s132 = (C51190s13) aVar;
        return C46238a.m51546a(this.BaseResponse, s132.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141271d), Integer.valueOf(s132.f141271d)) && C46238a.m51546a(Integer.valueOf(this.f141272e), Integer.valueOf(s132.f141272e)) && C46238a.m51546a(Integer.valueOf(this.f141273f), Integer.valueOf(s132.f141273f)) && C46238a.m51546a(Boolean.valueOf(this.f141274g), Boolean.valueOf(s132.f141274g));
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
            aVar.mo74318e(2, this.f141271d);
            aVar.mo74318e(3, this.f141272e);
            aVar.mo74318e(4, this.f141273f);
            aVar.mo74314a(5, this.f141274g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141271d) + C52418a.m58678e(3, this.f141272e) + C52418a.m58678e(4, this.f141273f) + C52418a.m58674a(5, this.f141274g);
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
            C51190s13 s132 = objArr[1];
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
                    s132.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                s132.f141271d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                s132.f141272e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                s132.f141273f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                s132.f141274g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
