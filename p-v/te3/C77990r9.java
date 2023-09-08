package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r9 */
public class C77990r9 extends C47465a {

    /* renamed from: d */
    public String f228154d;

    /* renamed from: e */
    public String f228155e;

    /* renamed from: f */
    public String f228156f;

    /* renamed from: g */
    public String f228157g;

    /* renamed from: h */
    public String f228158h;

    /* renamed from: i */
    public String f228159i;

    /* renamed from: j */
    public String f228160j;

    /* renamed from: n */
    public boolean f228161n;

    /* renamed from: o */
    public String f228162o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77990r9)) {
            return false;
        }
        C77990r9 r9Var = (C77990r9) aVar;
        return C46238a.m51546a(this.f228154d, r9Var.f228154d) && C46238a.m51546a(this.f228155e, r9Var.f228155e) && C46238a.m51546a(this.f228156f, r9Var.f228156f) && C46238a.m51546a(this.f228157g, r9Var.f228157g) && C46238a.m51546a(this.f228158h, r9Var.f228158h) && C46238a.m51546a(this.f228159i, r9Var.f228159i) && C46238a.m51546a(this.f228160j, r9Var.f228160j) && C46238a.m51546a(Boolean.valueOf(this.f228161n), Boolean.valueOf(r9Var.f228161n)) && C46238a.m51546a(this.f228162o, r9Var.f228162o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228154d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228155e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f228156f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f228157g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f228158h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f228159i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f228160j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74314a(9, this.f228161n);
            String str8 = this.f228162o;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f228154d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f228155e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f228156f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f228157g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f228158h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f228159i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f228160j;
            if (str15 != null) {
                i2 += C52418a.m58683j(8, str15);
            }
            int a = i2 + C52418a.m58674a(9, this.f228161n);
            String str16 = this.f228162o;
            return str16 != null ? a + C52418a.m58683j(10, str16) : a;
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
            C77990r9 r9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    r9Var.f228154d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    r9Var.f228155e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    r9Var.f228156f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    r9Var.f228157g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r9Var.f228158h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r9Var.f228159i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r9Var.f228160j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r9Var.f228161n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    r9Var.f228162o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
