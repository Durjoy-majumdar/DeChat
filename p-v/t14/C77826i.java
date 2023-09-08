package t14;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.i */
public class C77826i extends C47465a {

    /* renamed from: d */
    public String f226752d;

    /* renamed from: e */
    public String f226753e;

    /* renamed from: f */
    public String f226754f;

    /* renamed from: g */
    public String f226755g;

    /* renamed from: h */
    public String f226756h;

    /* renamed from: i */
    public String f226757i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77826i)) {
            return false;
        }
        C77826i iVar = (C77826i) aVar;
        return C46238a.m51546a(this.f226752d, iVar.f226752d) && C46238a.m51546a(this.f226753e, iVar.f226753e) && C46238a.m51546a(this.f226754f, iVar.f226754f) && C46238a.m51546a(this.f226755g, iVar.f226755g) && C46238a.m51546a(this.f226756h, iVar.f226756h) && C46238a.m51546a(this.f226757i, iVar.f226757i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226752d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226753e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f226754f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f226755g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f226756h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f226757i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f226752d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f226753e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f226754f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f226755g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f226756h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f226757i;
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
            C77826i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iVar.f226752d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    iVar.f226753e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    iVar.f226754f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    iVar.f226755g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    iVar.f226756h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    iVar.f226757i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
