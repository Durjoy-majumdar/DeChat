package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ih */
public class C49844ih extends C101820nt3 {

    /* renamed from: d */
    public C49559gh f135335d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49844ih)) {
            return false;
        }
        C49844ih ihVar = (C49844ih) aVar;
        return C46238a.m51546a(this.BaseRequest, ihVar.BaseRequest) && C46238a.m51546a(this.f135335d, ihVar.f135335d);
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
            C49559gh ghVar = this.f135335d;
            if (ghVar != null) {
                aVar.mo74322i(2, ghVar.computeSize());
                this.f135335d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49559gh ghVar2 = this.f135335d;
            return ghVar2 != null ? i2 + C52418a.m58682i(2, ghVar2.computeSize()) : i2;
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
            C49844ih ihVar = objArr[1];
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
                    ihVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49559gh ghVar3 = new C49559gh();
                    if (bArr2 != null && bArr2.length > 0) {
                        ghVar3.parseFrom(bArr2);
                    }
                    ihVar.f135335d = ghVar3;
                }
                return 0;
            }
        }
    }
}
