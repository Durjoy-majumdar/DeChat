package p909ki;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ki.c */
public class C76580c extends C47465a {

    /* renamed from: d */
    public String f224138d;

    /* renamed from: e */
    public String f224139e;

    /* renamed from: f */
    public String f224140f;

    /* renamed from: g */
    public String f224141g;

    /* renamed from: h */
    public String f224142h;

    /* renamed from: i */
    public String f224143i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C76580c)) {
            return false;
        }
        C76580c cVar = (C76580c) aVar;
        return C46238a.m51546a(this.f224138d, cVar.f224138d) && C46238a.m51546a(this.f224139e, cVar.f224139e) && C46238a.m51546a(this.f224140f, cVar.f224140f) && C46238a.m51546a(this.f224141g, cVar.f224141g) && C46238a.m51546a(this.f224142h, cVar.f224142h) && C46238a.m51546a(this.f224143i, cVar.f224143i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f224138d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f224139e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f224140f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f224141g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f224142h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f224143i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f224138d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f224139e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f224140f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f224141g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f224142h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f224143i;
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
            C76580c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f224138d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cVar.f224139e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cVar.f224140f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cVar.f224141g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    cVar.f224142h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cVar.f224143i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
