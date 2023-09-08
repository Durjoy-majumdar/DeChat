package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x12 */
public class C51910x12 extends C101820nt3 {

    /* renamed from: d */
    public C50830ph2 f144402d;

    /* renamed from: e */
    public C89349b f144403e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51910x12)) {
            return false;
        }
        C51910x12 x122 = (C51910x12) aVar;
        return C46238a.m51546a(this.BaseRequest, x122.BaseRequest) && C46238a.m51546a(this.f144402d, x122.f144402d) && C46238a.m51546a(this.f144403e, x122.f144403e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C50830ph2 ph22 = this.f144402d;
            if (ph22 != null) {
                aVar.mo74322i(2, ph22.computeSize());
                this.f144402d.writeFields(aVar);
            }
            C89349b bVar = this.f144403e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C50830ph2 ph23 = this.f144402d;
            if (ph23 != null) {
                i2 += C52418a.m58682i(2, ph23.computeSize());
            }
            C89349b bVar2 = this.f144403e;
            return bVar2 != null ? i2 + C52418a.m58675b(3, bVar2) : i2;
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
            C51910x12 x122 = objArr[1];
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
                    x122.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50830ph2 ph24 = new C50830ph2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ph24.parseFrom(bArr2);
                    }
                    x122.f144402d = ph24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x122.f144403e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
