package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qu2 */
public class C64666qu2 extends C47465a {

    /* renamed from: d */
    public C64691ru2 f185080d;

    /* renamed from: e */
    public C118458pu2 f185081e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64666qu2)) {
            return false;
        }
        C64666qu2 qu22 = (C64666qu2) aVar;
        return C46238a.m51546a(this.f185080d, qu22.f185080d) && C46238a.m51546a(this.f185081e, qu22.f185081e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64691ru2 ru22 = this.f185080d;
            if (ru22 == null) {
                throw new C52419b("Not all required fields were included: RsaReqData");
            } else if (this.f185081e != null) {
                if (ru22 != null) {
                    aVar.mo74322i(1, ru22.computeSize());
                    this.f185080d.writeFields(aVar);
                }
                C118458pu2 pu22 = this.f185081e;
                if (pu22 != null) {
                    aVar.mo74322i(2, pu22.computeSize());
                    this.f185081e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesReqData");
            }
        } else if (i == 1) {
            C64691ru2 ru23 = this.f185080d;
            if (ru23 != null) {
                i2 = 0 + C52418a.m58682i(1, ru23.computeSize());
            }
            C118458pu2 pu23 = this.f185081e;
            return pu23 != null ? i2 + C52418a.m58682i(2, pu23.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185080d == null) {
                throw new C52419b("Not all required fields were included: RsaReqData");
            } else if (this.f185081e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesReqData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64666qu2 qu22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64691ru2 ru24 = new C64691ru2();
                    if (bArr != null && bArr.length > 0) {
                        ru24.parseFrom(bArr);
                    }
                    qu22.f185080d = ru24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118458pu2 pu24 = new C118458pu2();
                    if (bArr2 != null && bArr2.length > 0) {
                        pu24.parseFrom(bArr2);
                    }
                    qu22.f185081e = pu24;
                }
                return 0;
            }
        }
    }
}
