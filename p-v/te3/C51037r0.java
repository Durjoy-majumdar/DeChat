package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r0 */
public class C51037r0 extends C101820nt3 {

    /* renamed from: d */
    public int f140638d;

    /* renamed from: e */
    public String f140639e;

    /* renamed from: f */
    public String f140640f;

    /* renamed from: g */
    public boolean f140641g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51037r0)) {
            return false;
        }
        C51037r0 r0Var = (C51037r0) aVar;
        return C46238a.m51546a(this.BaseRequest, r0Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f140638d), Integer.valueOf(r0Var.f140638d)) && C46238a.m51546a(this.f140639e, r0Var.f140639e) && C46238a.m51546a(this.f140640f, r0Var.f140640f) && C46238a.m51546a(Boolean.valueOf(this.f140641g), Boolean.valueOf(r0Var.f140641g));
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
            aVar.mo74318e(2, this.f140638d);
            String str = this.f140639e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f140640f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.f140641g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140638d);
            String str3 = this.f140639e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140640f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58674a(5, this.f140641g);
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
            C51037r0 r0Var = objArr[1];
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
                    r0Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                r0Var.f140638d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                r0Var.f140639e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                r0Var.f140640f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                r0Var.f140641g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
