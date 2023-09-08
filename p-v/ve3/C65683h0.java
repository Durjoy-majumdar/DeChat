package ve3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.h0 */
public class C65683h0 extends C47465a {

    /* renamed from: d */
    public String f189011d;

    /* renamed from: e */
    public String f189012e;

    /* renamed from: f */
    public String f189013f;

    /* renamed from: g */
    public String f189014g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65683h0)) {
            return false;
        }
        C65683h0 h0Var = (C65683h0) aVar;
        return C46238a.m51546a(this.f189011d, h0Var.f189011d) && C46238a.m51546a(this.f189012e, h0Var.f189012e) && C46238a.m51546a(this.f189013f, h0Var.f189013f) && C46238a.m51546a(this.f189014g, h0Var.f189014g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f189011d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f189012e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f189013f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f189014g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f189011d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f189012e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f189013f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f189014g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C65683h0 h0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h0Var.f189011d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                h0Var.f189012e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                h0Var.f189013f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                h0Var.f189014g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
