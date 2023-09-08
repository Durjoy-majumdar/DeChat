package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rg */
public class C64679rg extends C47465a {

    /* renamed from: d */
    public String f185162d;

    /* renamed from: e */
    public int f185163e;

    /* renamed from: f */
    public String f185164f;

    /* renamed from: g */
    public String f185165g;

    /* renamed from: h */
    public int f185166h;

    /* renamed from: i */
    public String f185167i;

    /* renamed from: j */
    public String f185168j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64679rg)) {
            return false;
        }
        C64679rg rgVar = (C64679rg) aVar;
        return C46238a.m51546a(this.f185162d, rgVar.f185162d) && C46238a.m51546a(Integer.valueOf(this.f185163e), Integer.valueOf(rgVar.f185163e)) && C46238a.m51546a(this.f185164f, rgVar.f185164f) && C46238a.m51546a(this.f185165g, rgVar.f185165g) && C46238a.m51546a(Integer.valueOf(this.f185166h), Integer.valueOf(rgVar.f185166h)) && C46238a.m51546a(this.f185167i, rgVar.f185167i) && C46238a.m51546a(this.f185168j, rgVar.f185168j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185162d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f185163e);
            String str2 = this.f185164f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185165g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f185166h);
            String str4 = this.f185167i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f185168j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f185162d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f185163e);
            String str7 = this.f185164f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f185165g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            int e2 = e + C52418a.m58678e(5, this.f185166h);
            String str9 = this.f185167i;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f185168j;
            return str10 != null ? e2 + C52418a.m58683j(7, str10) : e2;
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
            C64679rg rgVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rgVar.f185162d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rgVar.f185163e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rgVar.f185164f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rgVar.f185165g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rgVar.f185166h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rgVar.f185167i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rgVar.f185168j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
