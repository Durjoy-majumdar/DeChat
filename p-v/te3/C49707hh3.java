package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hh3 */
public class C49707hh3 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C50680oh> f134658d = new LinkedList<>();

    /* renamed from: e */
    public long f134659e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49707hh3)) {
            return false;
        }
        C49707hh3 hh32 = (C49707hh3) aVar;
        return C46238a.m51546a(this.BaseRequest, hh32.BaseRequest) && C46238a.m51546a(this.f134658d, hh32.f134658d) && C46238a.m51546a(Long.valueOf(this.f134659e), Long.valueOf(hh32.f134659e));
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
            aVar.mo74320g(2, 8, this.f134658d);
            aVar.mo74321h(3, this.f134659e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f134658d) + C52418a.m58681h(3, this.f134659e);
        } else if (i == 2) {
            this.f134658d.clear();
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
            C49707hh3 hh32 = objArr[1];
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
                    hh32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50680oh ohVar = new C50680oh();
                    if (bArr2 != null && bArr2.length > 0) {
                        ohVar.parseFrom(bArr2);
                    }
                    hh32.f134658d.add(ohVar);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                hh32.f134659e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
