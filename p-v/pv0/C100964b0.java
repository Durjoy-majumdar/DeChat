package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.b0 */
public class C100964b0 extends C47465a {

    /* renamed from: d */
    public String f295644d;

    /* renamed from: e */
    public int f295645e;

    /* renamed from: f */
    public int f295646f;

    /* renamed from: g */
    public int f295647g;

    /* renamed from: h */
    public int f295648h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C100964b0)) {
            return false;
        }
        C100964b0 b0Var = (C100964b0) aVar;
        return C46238a.m51546a(this.f295644d, b0Var.f295644d) && C46238a.m51546a(Integer.valueOf(this.f295645e), Integer.valueOf(b0Var.f295645e)) && C46238a.m51546a(Integer.valueOf(this.f295646f), Integer.valueOf(b0Var.f295646f)) && C46238a.m51546a(Integer.valueOf(this.f295647g), Integer.valueOf(b0Var.f295647g)) && C46238a.m51546a(Integer.valueOf(this.f295648h), Integer.valueOf(b0Var.f295648h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f295644d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f295645e);
                aVar.mo74318e(3, this.f295646f);
                aVar.mo74318e(4, this.f295647g);
                aVar.mo74318e(5, this.f295648h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i == 1) {
            String str2 = this.f295644d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f295645e) + C52418a.m58678e(3, this.f295646f) + C52418a.m58678e(4, this.f295647g) + C52418a.m58678e(5, this.f295648h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f295644d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C100964b0 b0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b0Var.f295644d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                b0Var.f295645e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b0Var.f295646f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                b0Var.f295647g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b0Var.f295648h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
