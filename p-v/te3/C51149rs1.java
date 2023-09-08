package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rs1 */
public class C51149rs1 extends C47465a {

    /* renamed from: d */
    public int f141110d;

    /* renamed from: e */
    public String f141111e;

    /* renamed from: f */
    public boolean f141112f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51149rs1)) {
            return false;
        }
        C51149rs1 rs12 = (C51149rs1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141110d), Integer.valueOf(rs12.f141110d)) && C46238a.m51546a(this.f141111e, rs12.f141111e) && C46238a.m51546a(Boolean.valueOf(this.f141112f), Boolean.valueOf(rs12.f141112f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141110d);
            String str = this.f141111e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f141112f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141110d) + 0;
            String str2 = this.f141111e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58674a(3, this.f141112f);
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
            C51149rs1 rs12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rs12.f141110d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                rs12.f141111e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                rs12.f141112f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
