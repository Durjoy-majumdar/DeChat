package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n11 */
public class C50478n11 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138324d;

    /* renamed from: e */
    public C89349b f138325e;

    /* renamed from: f */
    public String f138326f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50478n11)) {
            return false;
        }
        C50478n11 n112 = (C50478n11) aVar;
        return C46238a.m51546a(this.BaseRequest, n112.BaseRequest) && C46238a.m51546a(this.f138324d, n112.f138324d) && C46238a.m51546a(this.f138325e, n112.f138325e) && C46238a.m51546a(this.f138326f, n112.f138326f);
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
            C49842ig0 ig02 = this.f138324d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138324d.writeFields(aVar);
            }
            C89349b bVar = this.f138325e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f138326f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138324d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f138325e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str2 = this.f138326f;
            return str2 != null ? i2 + C52418a.m58683j(4, str2) : i2;
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
            C50478n11 n112 = objArr[1];
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
                    n112.BaseRequest = iaVar3;
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
                    n112.f138324d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                n112.f138325e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n112.f138326f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
