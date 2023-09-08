package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r63 */
public class C51065r63 extends C101820nt3 {

    /* renamed from: d */
    public C50164kq1 f140732d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51065r63)) {
            return false;
        }
        C51065r63 r632 = (C51065r63) aVar;
        return C46238a.m51546a(this.BaseRequest, r632.BaseRequest) && C46238a.m51546a(this.f140732d, r632.f140732d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f140732d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C50164kq1 kq12 = this.f140732d;
                if (kq12 != null) {
                    aVar.mo74322i(2, kq12.computeSize());
                    this.f140732d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: MsgInfo");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C50164kq1 kq13 = this.f140732d;
            return kq13 != null ? i2 + C52418a.m58682i(2, kq13.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140732d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: MsgInfo");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51065r63 r632 = objArr[1];
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
                    r632.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50164kq1 kq14 = new C50164kq1();
                    if (bArr2 != null && bArr2.length > 0) {
                        kq14.parseFrom(bArr2);
                    }
                    r632.f140732d = kq14;
                }
                return 0;
            }
        }
    }
}
