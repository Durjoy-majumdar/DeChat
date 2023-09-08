package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xf */
public class C51964xf extends C49335eu3 {

    /* renamed from: d */
    public String f144629d;

    /* renamed from: e */
    public LinkedList<String> f144630e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51964xf)) {
            return false;
        }
        C51964xf xfVar = (C51964xf) aVar;
        return C46238a.m51546a(this.BaseResponse, xfVar.BaseResponse) && C46238a.m51546a(this.f144629d, xfVar.f144629d) && C46238a.m51546a(this.f144630e, xfVar.f144630e);
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
                String str = this.f144629d;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 1, this.f144630e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f144629d;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58680g(4, 1, this.f144630e);
        } else if (i == 2) {
            this.f144630e.clear();
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
            C51964xf xfVar = objArr[1];
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
                    xfVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 3) {
                xfVar.f144629d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xfVar.f144630e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
