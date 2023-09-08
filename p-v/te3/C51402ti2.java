package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ti2 */
public class C51402ti2 extends C101820nt3 {

    /* renamed from: d */
    public int f142240d;

    /* renamed from: e */
    public LinkedList<C51250si2> f142241e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51402ti2)) {
            return false;
        }
        C51402ti2 ti22 = (C51402ti2) aVar;
        return C46238a.m51546a(this.BaseRequest, ti22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f142240d), Integer.valueOf(ti22.f142240d)) && C46238a.m51546a(this.f142241e, ti22.f142241e);
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
            aVar.mo74318e(2, this.f142240d);
            aVar.mo74320g(3, 8, this.f142241e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f142240d) + C52418a.m58680g(3, 8, this.f142241e);
        } else if (i == 2) {
            this.f142241e.clear();
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
            C51402ti2 ti22 = objArr[1];
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
                    ti22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ti22.f142240d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51250si2 si22 = new C51250si2();
                    if (bArr2 != null && bArr2.length > 0) {
                        si22.parseFrom(bArr2);
                    }
                    ti22.f142241e.add(si22);
                }
                return 0;
            }
        }
    }
}
