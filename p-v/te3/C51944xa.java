package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xa */
public class C51944xa extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48812b6> f144555d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C50885pw3> f144556e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51944xa)) {
            return false;
        }
        C51944xa xaVar = (C51944xa) aVar;
        return C46238a.m51546a(this.BaseResponse, xaVar.BaseResponse) && C46238a.m51546a(this.f144555d, xaVar.f144555d) && C46238a.m51546a(this.f144556e, xaVar.f144556e);
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
                aVar.mo74320g(2, 8, this.f144555d);
                aVar.mo74320g(3, 8, this.f144556e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f144555d) + C52418a.m58680g(3, 8, this.f144556e);
        } else if (i == 2) {
            this.f144555d.clear();
            this.f144556e.clear();
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
            C51944xa xaVar = objArr[1];
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
                    xaVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48812b6 b6Var = new C48812b6();
                    if (bArr2 != null && bArr2.length > 0) {
                        b6Var.parseFrom(bArr2);
                    }
                    xaVar.f144555d.add(b6Var);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50885pw3 pw32 = new C50885pw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        pw32.parseFrom(bArr3);
                    }
                    xaVar.f144556e.add(pw32);
                }
                return 0;
            }
        }
    }
}
