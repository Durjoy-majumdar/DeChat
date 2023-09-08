package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n20 */
public class C50482n20 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f138337d;

    /* renamed from: e */
    public int f138338e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50482n20)) {
            return false;
        }
        C50482n20 n202 = (C50482n20) aVar;
        return C46238a.m51546a(this.f138337d, n202.f138337d) && C46238a.m51546a(Integer.valueOf(this.f138338e), Integer.valueOf(n202.f138338e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f138337d;
            if (rv32 != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f138337d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f138338e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            C51163rv3 rv33 = this.f138337d;
            if (rv33 != null) {
                i2 = 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f138338e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138337d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50482n20 n202 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    n202.f138337d = rv34;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                n202.f138338e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
