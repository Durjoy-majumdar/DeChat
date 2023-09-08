package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xq4 extends C47465a {

    /* renamed from: d */
    public boolean f144882d;

    /* renamed from: e */
    public String f144883e;

    /* renamed from: f */
    public String f144884f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xq4)) {
            return false;
        }
        xq4 xq4 = (xq4) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f144882d), Boolean.valueOf(xq4.f144882d)) && C46238a.m51546a(this.f144883e, xq4.f144883e) && C46238a.m51546a(this.f144884f, xq4.f144884f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f144882d);
            String str = this.f144883e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144884f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f144882d) + 0;
            String str3 = this.f144883e;
            if (str3 != null) {
                a += C52418a.m58683j(2, str3);
            }
            String str4 = this.f144884f;
            return str4 != null ? a + C52418a.m58683j(3, str4) : a;
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
            xq4 xq4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xq4.f144882d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                xq4.f144883e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xq4.f144884f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
