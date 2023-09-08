package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class da4 extends C47465a {

    /* renamed from: d */
    public String f227147d;

    /* renamed from: e */
    public String f227148e;

    /* renamed from: f */
    public String f227149f;

    /* renamed from: g */
    public String f227150g;

    /* renamed from: h */
    public String f227151h;

    /* renamed from: i */
    public String f227152i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof da4)) {
            return false;
        }
        da4 da4 = (da4) aVar;
        return C46238a.m51546a(this.f227147d, da4.f227147d) && C46238a.m51546a(this.f227148e, da4.f227148e) && C46238a.m51546a(this.f227149f, da4.f227149f) && C46238a.m51546a(this.f227150g, da4.f227150g) && C46238a.m51546a(this.f227151h, da4.f227151h) && C46238a.m51546a(this.f227152i, da4.f227152i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227147d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227148e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227149f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227150g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f227151h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f227152i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f227147d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f227148e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f227149f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f227150g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f227151h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f227152i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            da4 da4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    da4.f227147d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    da4.f227148e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    da4.f227149f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    da4.f227150g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    da4.f227151h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    da4.f227152i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
