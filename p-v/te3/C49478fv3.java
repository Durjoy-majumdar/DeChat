package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fv3 */
public class C49478fv3 extends C101820nt3 {

    /* renamed from: d */
    public String f133711d;

    /* renamed from: e */
    public C49054cv3 f133712e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49478fv3)) {
            return false;
        }
        C49478fv3 fv32 = (C49478fv3) aVar;
        return C46238a.m51546a(this.BaseRequest, fv32.BaseRequest) && C46238a.m51546a(this.f133711d, fv32.f133711d) && C46238a.m51546a(this.f133712e, fv32.f133712e);
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
            String str = this.f133711d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C49054cv3 cv32 = this.f133712e;
            if (cv32 != null) {
                aVar.mo74322i(3, cv32.computeSize());
                this.f133712e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f133711d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C49054cv3 cv33 = this.f133712e;
            return cv33 != null ? i2 + C52418a.m58682i(3, cv33.computeSize()) : i2;
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
            C49478fv3 fv32 = objArr[1];
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
                    fv32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fv32.f133711d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49054cv3 cv34 = new C49054cv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        cv34.parseFrom(bArr2);
                    }
                    fv32.f133712e = cv34;
                }
                return 0;
            }
        }
    }
}
