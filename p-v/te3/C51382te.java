package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.te */
public class C51382te extends C47465a {

    /* renamed from: d */
    public int f142141d;

    /* renamed from: e */
    public int f142142e;

    /* renamed from: f */
    public int f142143f;

    /* renamed from: g */
    public String f142144g;

    /* renamed from: h */
    public String f142145h;

    /* renamed from: i */
    public String f142146i;

    /* renamed from: j */
    public String f142147j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51382te)) {
            return false;
        }
        C51382te teVar = (C51382te) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142141d), Integer.valueOf(teVar.f142141d)) && C46238a.m51546a(Integer.valueOf(this.f142142e), Integer.valueOf(teVar.f142142e)) && C46238a.m51546a(Integer.valueOf(this.f142143f), Integer.valueOf(teVar.f142143f)) && C46238a.m51546a(this.f142144g, teVar.f142144g) && C46238a.m51546a(this.f142145h, teVar.f142145h) && C46238a.m51546a(this.f142146i, teVar.f142146i) && C46238a.m51546a(this.f142147j, teVar.f142147j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142141d);
            aVar.mo74318e(2, this.f142142e);
            aVar.mo74318e(3, this.f142143f);
            String str = this.f142144g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f142145h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f142146i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f142147j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142141d) + 0 + C52418a.m58678e(2, this.f142142e) + C52418a.m58678e(3, this.f142143f);
            String str5 = this.f142144g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f142145h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            String str7 = this.f142146i;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f142147j;
            return str8 != null ? e + C52418a.m58683j(7, str8) : e;
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
            C51382te teVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    teVar.f142141d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    teVar.f142142e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    teVar.f142143f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    teVar.f142144g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    teVar.f142145h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    teVar.f142146i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    teVar.f142147j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
