package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.el0 */
public class C49299el0 extends C49335eu3 {

    /* renamed from: d */
    public FinderContact f132993d;

    /* renamed from: e */
    public int f132994e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49299el0)) {
            return false;
        }
        C49299el0 el02 = (C49299el0) aVar;
        return C46238a.m51546a(this.BaseResponse, el02.BaseResponse) && C46238a.m51546a(this.f132993d, el02.f132993d) && C46238a.m51546a(Integer.valueOf(this.f132994e), Integer.valueOf(el02.f132994e));
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
            FinderContact finderContact = this.f132993d;
            if (finderContact != null) {
                aVar.mo74322i(2, finderContact.computeSize());
                this.f132993d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f132994e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            FinderContact finderContact2 = this.f132993d;
            if (finderContact2 != null) {
                i2 += C52418a.m58682i(2, finderContact2.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f132994e);
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
            C49299el0 el02 = objArr[1];
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
                    el02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact3.parseFrom(bArr2);
                    }
                    el02.f132993d = finderContact3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                el02.f132994e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
