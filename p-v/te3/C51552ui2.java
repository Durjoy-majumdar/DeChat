package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.ui2 */
public class C51552ui2 extends C49335eu3 {

    /* renamed from: d */
    public int f142867d;

    /* renamed from: e */
    public LinkedList<Integer> f142868e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51552ui2)) {
            return false;
        }
        C51552ui2 ui22 = (C51552ui2) aVar;
        return C46238a.m51546a(this.BaseResponse, ui22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142867d), Integer.valueOf(ui22.f142867d)) && C46238a.m51546a(this.f142868e, ui22.f142868e);
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
                aVar.mo74318e(2, this.f142867d);
                aVar.mo74324k(3, 2, this.f142868e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f142867d) + C52418a.m58684k(3, 2, this.f142868e);
        } else if (i == 2) {
            this.f142868e.clear();
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
            C51552ui2 ui22 = objArr[1];
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
                    ui22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ui22.f142867d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                LinkedList<Integer> linkedList = new LinkedList<>();
                while (aVar4.f301908c < aVar4.f301907b) {
                    linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                }
                ui22.f142868e = linkedList;
                return 0;
            }
        }
    }
}
