package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w21 */
public class C51773w21 extends C47465a {

    /* renamed from: d */
    public String f143824d;

    /* renamed from: e */
    public String f143825e;

    /* renamed from: f */
    public String f143826f;

    /* renamed from: g */
    public String f143827g;

    /* renamed from: h */
    public C89349b f143828h;

    /* renamed from: i */
    public boolean f143829i;

    /* renamed from: j */
    public String f143830j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51773w21)) {
            return false;
        }
        C51773w21 w212 = (C51773w21) aVar;
        return C46238a.m51546a(this.f143824d, w212.f143824d) && C46238a.m51546a(this.f143825e, w212.f143825e) && C46238a.m51546a(this.f143826f, w212.f143826f) && C46238a.m51546a(this.f143827g, w212.f143827g) && C46238a.m51546a(this.f143828h, w212.f143828h) && C46238a.m51546a(Boolean.valueOf(this.f143829i), Boolean.valueOf(w212.f143829i)) && C46238a.m51546a(this.f143830j, w212.f143830j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143824d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143825e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143826f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f143827g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            C89349b bVar = this.f143828h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74314a(6, this.f143829i);
            String str5 = this.f143830j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f143824d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f143825e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f143826f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f143827g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            C89349b bVar2 = this.f143828h;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            int a = i2 + C52418a.m58674a(6, this.f143829i);
            String str10 = this.f143830j;
            return str10 != null ? a + C52418a.m58683j(7, str10) : a;
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
            C51773w21 w212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w212.f143824d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w212.f143825e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w212.f143826f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    w212.f143827g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w212.f143828h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    w212.f143829i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    w212.f143830j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
