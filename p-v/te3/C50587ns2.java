package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ns2 */
public class C50587ns2 extends C101820nt3 {

    /* renamed from: d */
    public String f138746d;

    /* renamed from: e */
    public C49891is2 f138747e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50587ns2)) {
            return false;
        }
        C50587ns2 ns22 = (C50587ns2) aVar;
        return C46238a.m51546a(this.BaseRequest, ns22.BaseRequest) && C46238a.m51546a(this.f138746d, ns22.f138746d) && C46238a.m51546a(this.f138747e, ns22.f138747e);
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
            String str = this.f138746d;
            if (str != null) {
                aVar.mo74323j(10, str);
            }
            C49891is2 is22 = this.f138747e;
            if (is22 != null) {
                aVar.mo74322i(20, is22.computeSize());
                this.f138747e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f138746d;
            if (str2 != null) {
                i2 += C52418a.m58683j(10, str2);
            }
            C49891is2 is23 = this.f138747e;
            return is23 != null ? i2 + C52418a.m58682i(20, is23.computeSize()) : i2;
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
            C50587ns2 ns22 = objArr[1];
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
                    ns22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 10) {
                ns22.f138746d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 20) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49891is2 is24 = new C49891is2();
                    if (bArr2 != null && bArr2.length > 0) {
                        is24.parseFrom(bArr2);
                    }
                    ns22.f138747e = is24;
                }
                return 0;
            }
        }
    }
}
