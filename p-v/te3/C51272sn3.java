package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sn3 */
public class C51272sn3 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C51132rn3> f141637d = new LinkedList<>();

    /* renamed from: e */
    public int f141638e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51272sn3)) {
            return false;
        }
        C51272sn3 sn32 = (C51272sn3) aVar;
        return C46238a.m51546a(this.BaseRequest, sn32.BaseRequest) && C46238a.m51546a(this.f141637d, sn32.f141637d) && C46238a.m51546a(Integer.valueOf(this.f141638e), Integer.valueOf(sn32.f141638e));
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
            aVar.mo74320g(2, 8, this.f141637d);
            aVar.mo74318e(3, this.f141638e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f141637d) + C52418a.m58678e(3, this.f141638e);
        } else if (i == 2) {
            this.f141637d.clear();
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
            C51272sn3 sn32 = objArr[1];
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
                    sn32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51132rn3 rn32 = new C51132rn3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rn32.parseFrom(bArr2);
                    }
                    sn32.f141637d.add(rn32);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sn32.f141638e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
