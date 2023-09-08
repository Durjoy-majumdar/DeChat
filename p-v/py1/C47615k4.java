package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.k4 */
public class C47615k4 extends C101820nt3 {

    /* renamed from: d */
    public String f127838d;

    /* renamed from: e */
    public String f127839e;

    /* renamed from: f */
    public C47582g f127840f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47615k4)) {
            return false;
        }
        C47615k4 k4Var = (C47615k4) aVar;
        return C46238a.m51546a(this.BaseRequest, k4Var.BaseRequest) && C46238a.m51546a(this.f127838d, k4Var.f127838d) && C46238a.m51546a(this.f127839e, k4Var.f127839e) && C46238a.m51546a(this.f127840f, k4Var.f127840f);
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
            String str = this.f127838d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f127839e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C47582g gVar = this.f127840f;
            if (gVar != null) {
                aVar.mo74322i(4, gVar.computeSize());
                this.f127840f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f127838d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f127839e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C47582g gVar2 = this.f127840f;
            return gVar2 != null ? i2 + C52418a.m58682i(4, gVar2.computeSize()) : i2;
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
            C47615k4 k4Var = objArr[1];
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
                    k4Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                k4Var.f127838d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                k4Var.f127839e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47582g gVar3 = new C47582g();
                    if (bArr2 != null && bArr2.length > 0) {
                        gVar3.parseFrom(bArr2);
                    }
                    k4Var.f127840f = gVar3;
                }
                return 0;
            }
        }
    }
}
