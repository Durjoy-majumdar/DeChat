package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w00 */
public class C51762w00 extends C101820nt3 {

    /* renamed from: d */
    public String f143792d;

    /* renamed from: e */
    public C51725vq1 f143793e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51762w00)) {
            return false;
        }
        C51762w00 w002 = (C51762w00) aVar;
        return C46238a.m51546a(this.BaseRequest, w002.BaseRequest) && C46238a.m51546a(this.f143792d, w002.f143792d) && C46238a.m51546a(this.f143793e, w002.f143793e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f143793e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f143792d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51725vq1 vq12 = this.f143793e;
                if (vq12 != null) {
                    aVar.mo74322i(3, vq12.computeSize());
                    this.f143793e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: full_chat");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f143792d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C51725vq1 vq13 = this.f143793e;
            return vq13 != null ? i2 + C52418a.m58682i(3, vq13.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143793e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: full_chat");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51762w00 w002 = objArr[1];
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
                    w002.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                w002.f143792d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51725vq1 vq14 = new C51725vq1();
                    if (bArr2 != null && bArr2.length > 0) {
                        vq14.parseFrom(bArr2);
                    }
                    w002.f143793e = vq14;
                }
                return 0;
            }
        }
    }
}
