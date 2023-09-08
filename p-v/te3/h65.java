package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h65 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<j65> f134469d = new LinkedList<>();

    /* renamed from: e */
    public C90422jy f134470e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h65)) {
            return false;
        }
        h65 h65 = (h65) aVar;
        return C46238a.m51546a(this.BaseRequest, h65.BaseRequest) && C46238a.m51546a(this.f134469d, h65.f134469d) && C46238a.m51546a(this.f134470e, h65.f134470e);
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
            aVar.mo74320g(2, 8, this.f134469d);
            C90422jy jyVar = this.f134470e;
            if (jyVar != null) {
                aVar.mo74322i(3, jyVar.computeSize());
                this.f134470e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f134469d);
            C90422jy jyVar2 = this.f134470e;
            return jyVar2 != null ? g + C52418a.m58682i(3, jyVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f134469d.clear();
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
            h65 h65 = objArr[1];
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
                    h65.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    j65 j65 = new j65();
                    if (bArr2 != null && bArr2.length > 0) {
                        j65.parseFrom(bArr2);
                    }
                    h65.f134469d.add(j65);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C90422jy jyVar3 = new C90422jy();
                    if (bArr3 != null && bArr3.length > 0) {
                        jyVar3.parseFrom(bArr3);
                    }
                    h65.f134470e = jyVar3;
                }
                return 0;
            }
        }
    }
}
