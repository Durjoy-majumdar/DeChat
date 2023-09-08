package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.al1 */
public class C48731al1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f130615d;

    /* renamed from: e */
    public long f130616e;

    /* renamed from: f */
    public long f130617f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48731al1)) {
            return false;
        }
        C48731al1 al12 = (C48731al1) aVar;
        return C46238a.m51546a(this.BaseRequest, al12.BaseRequest) && C46238a.m51546a(this.f130615d, al12.f130615d) && C46238a.m51546a(Long.valueOf(this.f130616e), Long.valueOf(al12.f130616e)) && C46238a.m51546a(Long.valueOf(this.f130617f), Long.valueOf(al12.f130617f));
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
            C49842ig0 ig02 = this.f130615d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f130615d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f130616e);
            aVar.mo74321h(4, this.f130617f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f130615d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            return i2 + C52418a.m58681h(3, this.f130616e) + C52418a.m58681h(4, this.f130617f);
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
            C48731al1 al12 = objArr[1];
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
                    al12.BaseRequest = iaVar3;
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
                    al12.f130615d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                al12.f130616e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                al12.f130617f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
