package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.q0 */
public class C39595q0 extends C47465a {

    /* renamed from: d */
    public String f106280d;

    /* renamed from: e */
    public String f106281e;

    /* renamed from: f */
    public int f106282f;

    /* renamed from: g */
    public String f106283g;

    /* renamed from: h */
    public String f106284h;

    /* renamed from: i */
    public String f106285i;

    /* renamed from: j */
    public String f106286j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39595q0)) {
            return false;
        }
        C39595q0 q0Var = (C39595q0) aVar;
        return C46238a.m51546a(this.f106280d, q0Var.f106280d) && C46238a.m51546a(this.f106281e, q0Var.f106281e) && C46238a.m51546a(Integer.valueOf(this.f106282f), Integer.valueOf(q0Var.f106282f)) && C46238a.m51546a(this.f106283g, q0Var.f106283g) && C46238a.m51546a(this.f106284h, q0Var.f106284h) && C46238a.m51546a(this.f106285i, q0Var.f106285i) && C46238a.m51546a(this.f106286j, q0Var.f106286j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106280d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f106281e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f106282f);
            String str3 = this.f106283g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f106284h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f106285i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f106286j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f106280d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f106281e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int e = i2 + C52418a.m58678e(3, this.f106282f);
            String str9 = this.f106283g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f106284h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f106285i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f106286j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            C39595q0 q0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q0Var.f106280d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    q0Var.f106281e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q0Var.f106282f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    q0Var.f106283g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    q0Var.f106284h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q0Var.f106285i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    q0Var.f106286j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
