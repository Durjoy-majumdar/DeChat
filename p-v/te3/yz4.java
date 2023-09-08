package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yz4 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<wz4> f145598d = new LinkedList<>();

    /* renamed from: e */
    public String f145599e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yz4)) {
            return false;
        }
        yz4 yz4 = (yz4) aVar;
        return C46238a.m51546a(this.BaseResponse, yz4.BaseResponse) && C46238a.m51546a(this.f145598d, yz4.f145598d) && C46238a.m51546a(this.f145599e, yz4.f145599e);
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
            aVar.mo74320g(2, 8, this.f145598d);
            String str = this.f145599e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f145598d);
            String str2 = this.f145599e;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f145598d.clear();
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
            yz4 yz4 = objArr[1];
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
                    yz4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    wz4 wz4 = new wz4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wz4.parseFrom(bArr2);
                    }
                    yz4.f145598d.add(wz4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                yz4.f145599e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
