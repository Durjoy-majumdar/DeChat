package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i0 */
public class C49776i0 extends C47465a {

    /* renamed from: d */
    public String f134989d;

    /* renamed from: e */
    public int f134990e;

    /* renamed from: f */
    public int f134991f;

    /* renamed from: g */
    public int f134992g;

    /* renamed from: h */
    public int f134993h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49776i0)) {
            return false;
        }
        C49776i0 i0Var = (C49776i0) aVar;
        return C46238a.m51546a(this.f134989d, i0Var.f134989d) && C46238a.m51546a(Integer.valueOf(this.f134990e), Integer.valueOf(i0Var.f134990e)) && C46238a.m51546a(Integer.valueOf(this.f134991f), Integer.valueOf(i0Var.f134991f)) && C46238a.m51546a(Integer.valueOf(this.f134992g), Integer.valueOf(i0Var.f134992g)) && C46238a.m51546a(Integer.valueOf(this.f134993h), Integer.valueOf(i0Var.f134993h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134989d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f134990e);
            aVar.mo74318e(3, this.f134991f);
            aVar.mo74318e(4, this.f134992g);
            aVar.mo74318e(5, this.f134993h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f134989d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f134990e) + C52418a.m58678e(3, this.f134991f) + C52418a.m58678e(4, this.f134992g) + C52418a.m58678e(5, this.f134993h);
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
            C49776i0 i0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i0Var.f134989d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i0Var.f134990e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                i0Var.f134991f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                i0Var.f134992g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                i0Var.f134993h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
