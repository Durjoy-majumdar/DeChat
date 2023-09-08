package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zi2 */
public class C22538zi2 extends C47465a {

    /* renamed from: d */
    public int f64831d;

    /* renamed from: e */
    public int f64832e;

    /* renamed from: f */
    public int f64833f;

    /* renamed from: g */
    public String f64834g;

    /* renamed from: h */
    public String f64835h;

    /* renamed from: i */
    public String f64836i;

    /* renamed from: j */
    public String f64837j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22538zi2)) {
            return false;
        }
        C22538zi2 zi22 = (C22538zi2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64831d), Integer.valueOf(zi22.f64831d)) && C46238a.m51546a(Integer.valueOf(this.f64832e), Integer.valueOf(zi22.f64832e)) && C46238a.m51546a(Integer.valueOf(this.f64833f), Integer.valueOf(zi22.f64833f)) && C46238a.m51546a(this.f64834g, zi22.f64834g) && C46238a.m51546a(this.f64835h, zi22.f64835h) && C46238a.m51546a(this.f64836i, zi22.f64836i) && C46238a.m51546a(this.f64837j, zi22.f64837j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64831d);
            aVar.mo74318e(2, this.f64832e);
            aVar.mo74318e(3, this.f64833f);
            String str = this.f64834g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f64835h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f64836i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f64837j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f64831d) + 0 + C52418a.m58678e(2, this.f64832e) + C52418a.m58678e(3, this.f64833f);
            String str5 = this.f64834g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f64835h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            String str7 = this.f64836i;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f64837j;
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
            C22538zi2 zi22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zi22.f64831d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    zi22.f64832e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zi22.f64833f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    zi22.f64834g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zi22.f64835h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zi22.f64836i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zi22.f64837j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
