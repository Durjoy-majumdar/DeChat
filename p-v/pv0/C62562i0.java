package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.i0 */
public class C62562i0 extends C47465a {

    /* renamed from: d */
    public String f177693d;

    /* renamed from: e */
    public int f177694e;

    /* renamed from: f */
    public int f177695f;

    /* renamed from: g */
    public int f177696g;

    /* renamed from: h */
    public int f177697h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62562i0)) {
            return false;
        }
        C62562i0 i0Var = (C62562i0) aVar;
        return C46238a.m51546a(this.f177693d, i0Var.f177693d) && C46238a.m51546a(Integer.valueOf(this.f177694e), Integer.valueOf(i0Var.f177694e)) && C46238a.m51546a(Integer.valueOf(this.f177695f), Integer.valueOf(i0Var.f177695f)) && C46238a.m51546a(Integer.valueOf(this.f177696g), Integer.valueOf(i0Var.f177696g)) && C46238a.m51546a(Integer.valueOf(this.f177697h), Integer.valueOf(i0Var.f177697h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f177693d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f177694e);
                aVar.mo74318e(3, this.f177695f);
                aVar.mo74318e(4, this.f177696g);
                aVar.mo74318e(5, this.f177697h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i == 1) {
            String str2 = this.f177693d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f177694e) + C52418a.m58678e(3, this.f177695f) + C52418a.m58678e(4, this.f177696g) + C52418a.m58678e(5, this.f177697h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f177693d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C62562i0 i0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i0Var.f177693d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i0Var.f177694e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                i0Var.f177695f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                i0Var.f177696g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                i0Var.f177697h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
