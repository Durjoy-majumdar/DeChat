package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cg4 extends C47465a {

    /* renamed from: d */
    public String f182476d;

    /* renamed from: e */
    public String f182477e;

    /* renamed from: f */
    public int f182478f;

    /* renamed from: g */
    public String f182479g;

    /* renamed from: h */
    public String f182480h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cg4)) {
            return false;
        }
        cg4 cg4 = (cg4) aVar;
        return C46238a.m51546a(this.f182476d, cg4.f182476d) && C46238a.m51546a(this.f182477e, cg4.f182477e) && C46238a.m51546a(Integer.valueOf(this.f182478f), Integer.valueOf(cg4.f182478f)) && C46238a.m51546a(this.f182479g, cg4.f182479g) && C46238a.m51546a(this.f182480h, cg4.f182480h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182476d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182477e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f182478f);
            String str3 = this.f182479g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f182480h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182476d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f182477e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f182478f);
            String str7 = this.f182479g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f182480h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            cg4 cg4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cg4.f182476d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cg4.f182477e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cg4.f182478f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                cg4.f182479g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cg4.f182480h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
