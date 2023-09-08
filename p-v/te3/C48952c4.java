package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c4 */
public class C48952c4 extends C47465a {

    /* renamed from: d */
    public h64 f131489d;

    /* renamed from: e */
    public C51163rv3 f131490e;

    /* renamed from: f */
    public int f131491f;

    /* renamed from: g */
    public C52156yq3 f131492g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48952c4)) {
            return false;
        }
        C48952c4 c4Var = (C48952c4) aVar;
        return C46238a.m51546a(this.f131489d, c4Var.f131489d) && C46238a.m51546a(this.f131490e, c4Var.f131490e) && C46238a.m51546a(Integer.valueOf(this.f131491f), Integer.valueOf(c4Var.f131491f)) && C46238a.m51546a(this.f131492g, c4Var.f131492g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            h64 h64 = this.f131489d;
            if (h64 != null) {
                if (h64 != null) {
                    aVar.mo74322i(1, h64.computeSize());
                    this.f131489d.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f131490e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f131490e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f131491f);
                C52156yq3 yq32 = this.f131492g;
                if (yq32 != null) {
                    aVar.mo74322i(4, yq32.computeSize());
                    this.f131492g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsADObject");
        } else if (i == 1) {
            h64 h642 = this.f131489d;
            if (h642 != null) {
                i2 = 0 + C52418a.m58682i(1, h642.computeSize());
            }
            C51163rv3 rv33 = this.f131490e;
            if (rv33 != null) {
                i2 += C52418a.m58682i(2, rv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f131491f);
            C52156yq3 yq33 = this.f131492g;
            return yq33 != null ? e + C52418a.m58682i(4, yq33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131489d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsADObject");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48952c4 c4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    h64 h643 = new h64();
                    if (bArr != null && bArr.length > 0) {
                        h643.parseFrom(bArr);
                    }
                    c4Var.f131489d = h643;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv34.mo73356d(bArr2);
                    }
                    c4Var.f131490e = rv34;
                }
                return 0;
            } else if (intValue == 3) {
                c4Var.f131491f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52156yq3 yq34 = new C52156yq3();
                    if (bArr3 != null && bArr3.length > 0) {
                        yq34.parseFrom(bArr3);
                    }
                    c4Var.f131492g = yq34;
                }
                return 0;
            }
        }
    }
}
