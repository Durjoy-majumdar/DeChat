package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yr */
public class C52157yr extends C49335eu3 {

    /* renamed from: d */
    public C101863wr f145475d;

    /* renamed from: e */
    public String f145476e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52157yr)) {
            return false;
        }
        C52157yr yrVar = (C52157yr) aVar;
        return C46238a.m51546a(this.BaseResponse, yrVar.BaseResponse) && C46238a.m51546a(this.f145475d, yrVar.f145475d) && C46238a.m51546a(this.f145476e, yrVar.f145476e);
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
                C101863wr wrVar = this.f145475d;
                if (wrVar != null) {
                    aVar.mo74322i(2, wrVar.computeSize());
                    this.f145475d.writeFields(aVar);
                }
                String str = this.f145476e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C101863wr wrVar2 = this.f145475d;
            if (wrVar2 != null) {
                i2 += C52418a.m58682i(2, wrVar2.computeSize());
            }
            String str2 = this.f145476e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C52157yr yrVar = objArr[1];
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
                    yrVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101863wr wrVar3 = new C101863wr();
                    if (bArr2 != null && bArr2.length > 0) {
                        wrVar3.parseFrom(bArr2);
                    }
                    yrVar.f145475d = wrVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                yrVar.f145476e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
