package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bv3 */
public class C48913bv3 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f131335d;

    /* renamed from: e */
    public C51163rv3 f131336e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48913bv3)) {
            return false;
        }
        C48913bv3 bv32 = (C48913bv3) aVar;
        return C46238a.m51546a(this.f131335d, bv32.f131335d) && C46238a.m51546a(this.f131336e, bv32.f131336e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f131335d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f131336e != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f131335d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f131336e;
                if (rv33 != null) {
                    aVar.mo74322i(2, rv33.computeSize());
                    this.f131336e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i == 1) {
            C51163rv3 rv34 = this.f131335d;
            if (rv34 != null) {
                i2 = 0 + C52418a.m58682i(1, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f131336e;
            return rv35 != null ? i2 + C52418a.m58682i(2, rv35.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131335d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f131336e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48913bv3 bv32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51163rv3 rv36 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv36.mo73356d(bArr);
                    }
                    bv32.f131335d = rv36;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv37 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv37.mo73356d(bArr2);
                    }
                    bv32.f131336e = rv37;
                }
                return 0;
            }
        }
    }
}
