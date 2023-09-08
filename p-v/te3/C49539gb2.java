package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gb2 */
public class C49539gb2 extends C101820nt3 {

    /* renamed from: d */
    public String f133949d;

    /* renamed from: e */
    public String f133950e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49539gb2)) {
            return false;
        }
        C49539gb2 gb22 = (C49539gb2) aVar;
        return C46238a.m51546a(this.BaseRequest, gb22.BaseRequest) && C46238a.m51546a(this.f133949d, gb22.f133949d) && C46238a.m51546a(this.f133950e, gb22.f133950e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133949d == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f133950e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f133949d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133950e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: appusername");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f133949d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f133950e;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133949d == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f133950e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: appusername");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49539gb2 gb22 = objArr[1];
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
                    gb22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gb22.f133949d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                gb22.f133950e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
