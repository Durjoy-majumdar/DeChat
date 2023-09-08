package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h04 */
public class C49637h04 extends C49335eu3 {

    /* renamed from: d */
    public String f134392d;

    /* renamed from: e */
    public String f134393e;

    /* renamed from: f */
    public long f134394f;

    /* renamed from: g */
    public int f134395g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49637h04)) {
            return false;
        }
        C49637h04 h042 = (C49637h04) aVar;
        return C46238a.m51546a(this.BaseResponse, h042.BaseResponse) && C46238a.m51546a(this.f134392d, h042.f134392d) && C46238a.m51546a(this.f134393e, h042.f134393e) && C46238a.m51546a(Long.valueOf(this.f134394f), Long.valueOf(h042.f134394f)) && C46238a.m51546a(Integer.valueOf(this.f134395g), Integer.valueOf(h042.f134395g));
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
            String str = this.f134392d;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f134393e;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f134394f);
            aVar.mo74318e(6, this.f134395g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f134392d;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f134393e;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            return i2 + C52418a.m58681h(5, this.f134394f) + C52418a.m58678e(6, this.f134395g);
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
            C49637h04 h042 = objArr[1];
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
                    h042.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 3) {
                h042.f134392d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                h042.f134393e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                h042.f134394f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                h042.f134395g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
