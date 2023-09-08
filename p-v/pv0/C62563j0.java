package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.j0 */
public class C62563j0 extends C47465a {

    /* renamed from: d */
    public String f177698d;

    /* renamed from: e */
    public int f177699e;

    /* renamed from: f */
    public int f177700f;

    /* renamed from: g */
    public int f177701g;

    /* renamed from: h */
    public int f177702h;

    /* renamed from: i */
    public int f177703i;

    /* renamed from: j */
    public C89349b f177704j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62563j0)) {
            return false;
        }
        C62563j0 j0Var = (C62563j0) aVar;
        return C46238a.m51546a(this.f177698d, j0Var.f177698d) && C46238a.m51546a(Integer.valueOf(this.f177699e), Integer.valueOf(j0Var.f177699e)) && C46238a.m51546a(Integer.valueOf(this.f177700f), Integer.valueOf(j0Var.f177700f)) && C46238a.m51546a(Integer.valueOf(this.f177701g), Integer.valueOf(j0Var.f177701g)) && C46238a.m51546a(Integer.valueOf(this.f177702h), Integer.valueOf(j0Var.f177702h)) && C46238a.m51546a(Integer.valueOf(this.f177703i), Integer.valueOf(j0Var.f177703i)) && C46238a.m51546a(this.f177704j, j0Var.f177704j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f177698d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f177699e);
                aVar.mo74318e(3, this.f177700f);
                aVar.mo74318e(4, this.f177701g);
                aVar.mo74318e(5, this.f177702h);
                aVar.mo74318e(6, this.f177703i);
                C89349b bVar = this.f177704j;
                if (bVar != null) {
                    aVar.mo74315b(7, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i == 1) {
            String str2 = this.f177698d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f177699e) + C52418a.m58678e(3, this.f177700f) + C52418a.m58678e(4, this.f177701g) + C52418a.m58678e(5, this.f177702h) + C52418a.m58678e(6, this.f177703i);
            C89349b bVar2 = this.f177704j;
            return bVar2 != null ? e + C52418a.m58675b(7, bVar2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f177698d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DataID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C62563j0 j0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j0Var.f177698d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    j0Var.f177699e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    j0Var.f177700f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    j0Var.f177701g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    j0Var.f177702h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    j0Var.f177703i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    j0Var.f177704j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
