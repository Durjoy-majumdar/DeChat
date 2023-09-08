package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zl */
public class C64883zl extends C101820nt3 {

    /* renamed from: d */
    public C64776vl f186707d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64883zl)) {
            return false;
        }
        C64883zl zlVar = (C64883zl) aVar;
        return C46238a.m51546a(this.BaseRequest, zlVar.BaseRequest) && C46238a.m51546a(this.f186707d, zlVar.f186707d);
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
            C64776vl vlVar = this.f186707d;
            if (vlVar != null) {
                aVar.mo74322i(2, vlVar.computeSize());
                this.f186707d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C64776vl vlVar2 = this.f186707d;
            return vlVar2 != null ? i2 + C52418a.m58682i(2, vlVar2.computeSize()) : i2;
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
            C64883zl zlVar = objArr[1];
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
                    zlVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64776vl vlVar3 = new C64776vl();
                    if (bArr2 != null && bArr2.length > 0) {
                        vlVar3.parseFrom(bArr2);
                    }
                    zlVar.f186707d = vlVar3;
                }
                return 0;
            }
        }
    }
}
