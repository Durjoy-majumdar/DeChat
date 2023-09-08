package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nm0 */
public class C50564nm0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderContact> f138660d = new LinkedList<>();

    /* renamed from: e */
    public int f138661e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50564nm0)) {
            return false;
        }
        C50564nm0 nm02 = (C50564nm0) aVar;
        return C46238a.m51546a(this.BaseResponse, nm02.BaseResponse) && C46238a.m51546a(this.f138660d, nm02.f138660d) && C46238a.m51546a(Integer.valueOf(this.f138661e), Integer.valueOf(nm02.f138661e));
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
            aVar.mo74320g(2, 8, this.f138660d);
            aVar.mo74318e(3, this.f138661e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f138660d) + C52418a.m58678e(3, this.f138661e);
        } else if (i == 2) {
            this.f138660d.clear();
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
            C50564nm0 nm02 = objArr[1];
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
                    nm02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderContact finderContact = new FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact.parseFrom(bArr2);
                    }
                    nm02.f138660d.add(finderContact);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nm02.f138661e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
