package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bj1 */
public class C48864bj1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f131149d;

    /* renamed from: e */
    public C49704hh0 f131150e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48864bj1)) {
            return false;
        }
        C48864bj1 bj12 = (C48864bj1) aVar;
        return C46238a.m51546a(this.BaseRequest, bj12.BaseRequest) && C46238a.m51546a(this.f131149d, bj12.f131149d) && C46238a.m51546a(this.f131150e, bj12.f131150e);
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
            C49842ig0 ig02 = this.f131149d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f131149d.writeFields(aVar);
            }
            C49704hh0 hh02 = this.f131150e;
            if (hh02 != null) {
                aVar.mo74322i(3, hh02.computeSize());
                this.f131150e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f131149d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C49704hh0 hh03 = this.f131150e;
            return hh03 != null ? i2 + C52418a.m58682i(3, hh03.computeSize()) : i2;
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
            C48864bj1 bj12 = objArr[1];
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
                    bj12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    bj12.f131149d = ig04;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49704hh0 hh04 = new C49704hh0();
                    if (bArr3 != null && bArr3.length > 0) {
                        hh04.parseFrom(bArr3);
                    }
                    bj12.f131150e = hh04;
                }
                return 0;
            }
        }
    }
}
