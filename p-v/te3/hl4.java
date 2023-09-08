package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class hl4 extends C101820nt3 {

    /* renamed from: d */
    public String f134719d;

    /* renamed from: e */
    public C51960xe f134720e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hl4)) {
            return false;
        }
        hl4 hl4 = (hl4) aVar;
        return C46238a.m51546a(this.BaseRequest, hl4.BaseRequest) && C46238a.m51546a(this.f134719d, hl4.f134719d) && C46238a.m51546a(this.f134720e, hl4.f134720e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f134719d == null) {
                throw new C52419b("Not all required fields were included: brand_user_name");
            } else if (this.f134720e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f134719d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51960xe xeVar = this.f134720e;
                if (xeVar != null) {
                    aVar.mo74322i(3, xeVar.computeSize());
                    this.f134720e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: chat");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f134719d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C51960xe xeVar2 = this.f134720e;
            return xeVar2 != null ? i2 + C52418a.m58682i(3, xeVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134719d == null) {
                throw new C52419b("Not all required fields were included: brand_user_name");
            } else if (this.f134720e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: chat");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            hl4 hl4 = objArr[1];
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
                    hl4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hl4.f134719d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51960xe xeVar3 = new C51960xe();
                    if (bArr2 != null && bArr2.length > 0) {
                        xeVar3.parseFrom(bArr2);
                    }
                    hl4.f134720e = xeVar3;
                }
                return 0;
            }
        }
    }
}
