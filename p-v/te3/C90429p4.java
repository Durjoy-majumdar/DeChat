package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p4 */
public class C90429p4 extends C47465a {

    /* renamed from: d */
    public boolean f259729d;

    /* renamed from: e */
    public String f259730e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90429p4)) {
            return false;
        }
        C90429p4 p4Var = (C90429p4) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f259729d), Boolean.valueOf(p4Var.f259729d)) && C46238a.m51546a(this.f259730e, p4Var.f259730e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f259729d);
            String str = this.f259730e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f259729d) + 0;
            String str2 = this.f259730e;
            return str2 != null ? a + C52418a.m58683j(2, str2) : a;
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
            C90429p4 p4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p4Var.f259729d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                p4Var.f259730e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
