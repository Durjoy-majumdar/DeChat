package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class td4 extends C101820nt3 {

    /* renamed from: d */
    public String f142139d;

    /* renamed from: e */
    public boolean f142140e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof td4)) {
            return false;
        }
        td4 td4 = (td4) aVar;
        return C46238a.m51546a(this.BaseRequest, td4.BaseRequest) && C46238a.m51546a(this.f142139d, td4.f142139d) && C46238a.m51546a(Boolean.valueOf(this.f142140e), Boolean.valueOf(td4.f142140e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142139d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f142139d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74314a(3, this.f142140e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f142139d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f142140e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142139d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            td4 td4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    td4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                td4.f142139d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                td4.f142140e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
