package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.a0 */
public class C100963a0 extends C47465a {

    /* renamed from: d */
    public String f295636d;

    /* renamed from: e */
    public int f295637e;

    /* renamed from: f */
    public int f295638f;

    /* renamed from: g */
    public int f295639g;

    /* renamed from: h */
    public int f295640h;

    /* renamed from: i */
    public int f295641i;

    /* renamed from: j */
    public C89349b f295642j;

    /* renamed from: n */
    public int f295643n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C100963a0)) {
            return false;
        }
        C100963a0 a0Var = (C100963a0) aVar;
        return C46238a.m51546a(this.f295636d, a0Var.f295636d) && C46238a.m51546a(Integer.valueOf(this.f295637e), Integer.valueOf(a0Var.f295637e)) && C46238a.m51546a(Integer.valueOf(this.f295638f), Integer.valueOf(a0Var.f295638f)) && C46238a.m51546a(Integer.valueOf(this.f295639g), Integer.valueOf(a0Var.f295639g)) && C46238a.m51546a(Integer.valueOf(this.f295640h), Integer.valueOf(a0Var.f295640h)) && C46238a.m51546a(Integer.valueOf(this.f295641i), Integer.valueOf(a0Var.f295641i)) && C46238a.m51546a(this.f295642j, a0Var.f295642j) && C46238a.m51546a(Integer.valueOf(this.f295643n), Integer.valueOf(a0Var.f295643n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f295636d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f295637e);
                aVar.mo74318e(3, this.f295638f);
                aVar.mo74318e(4, this.f295639g);
                aVar.mo74318e(5, this.f295640h);
                aVar.mo74318e(6, this.f295641i);
                C89349b bVar = this.f295642j;
                if (bVar != null) {
                    aVar.mo74315b(7, bVar);
                }
                aVar.mo74318e(8, this.f295643n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i == 1) {
            String str2 = this.f295636d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f295637e) + C52418a.m58678e(3, this.f295638f) + C52418a.m58678e(4, this.f295639g) + C52418a.m58678e(5, this.f295640h) + C52418a.m58678e(6, this.f295641i);
            C89349b bVar2 = this.f295642j;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            return e + C52418a.m58678e(8, this.f295643n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f295636d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C100963a0 a0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a0Var.f295636d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    a0Var.f295637e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    a0Var.f295638f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    a0Var.f295639g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a0Var.f295640h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a0Var.f295641i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a0Var.f295642j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    a0Var.f295643n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
