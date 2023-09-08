package qg2;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: qg2.u0 */
public class C62617u0 extends C47465a {

    /* renamed from: d */
    public int f177822d;

    /* renamed from: e */
    public int f177823e;

    /* renamed from: f */
    public String f177824f;

    /* renamed from: g */
    public String f177825g;

    /* renamed from: h */
    public C89349b f177826h;

    /* renamed from: i */
    public int f177827i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62617u0)) {
            return false;
        }
        C62617u0 u0Var = (C62617u0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f177822d), Integer.valueOf(u0Var.f177822d)) && C46238a.m51546a(Integer.valueOf(this.f177823e), Integer.valueOf(u0Var.f177823e)) && C46238a.m51546a(this.f177824f, u0Var.f177824f) && C46238a.m51546a(this.f177825g, u0Var.f177825g) && C46238a.m51546a(this.f177826h, u0Var.f177826h) && C46238a.m51546a(Integer.valueOf(this.f177827i), Integer.valueOf(u0Var.f177827i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f177822d);
            aVar.mo74318e(2, this.f177823e);
            String str = this.f177824f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f177825g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f177826h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f177827i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f177822d) + 0 + C52418a.m58678e(2, this.f177823e);
            String str3 = this.f177824f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f177825g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C89349b bVar2 = this.f177826h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            return e + C52418a.m58678e(6, this.f177827i);
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
            C62617u0 u0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u0Var.f177822d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    u0Var.f177823e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    u0Var.f177824f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u0Var.f177825g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u0Var.f177826h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    u0Var.f177827i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
