package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bu1 */
public class C48907bu1 extends C47465a {

    /* renamed from: d */
    public String f131306d;

    /* renamed from: e */
    public int f131307e;

    /* renamed from: f */
    public int f131308f;

    /* renamed from: g */
    public int f131309g;

    /* renamed from: h */
    public int f131310h;

    /* renamed from: i */
    public String f131311i;

    /* renamed from: j */
    public String f131312j;

    /* renamed from: n */
    public String f131313n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48907bu1)) {
            return false;
        }
        C48907bu1 bu12 = (C48907bu1) aVar;
        return C46238a.m51546a(this.f131306d, bu12.f131306d) && C46238a.m51546a(Integer.valueOf(this.f131307e), Integer.valueOf(bu12.f131307e)) && C46238a.m51546a(Integer.valueOf(this.f131308f), Integer.valueOf(bu12.f131308f)) && C46238a.m51546a(Integer.valueOf(this.f131309g), Integer.valueOf(bu12.f131309g)) && C46238a.m51546a(Integer.valueOf(this.f131310h), Integer.valueOf(bu12.f131310h)) && C46238a.m51546a(this.f131311i, bu12.f131311i) && C46238a.m51546a(this.f131312j, bu12.f131312j) && C46238a.m51546a(this.f131313n, bu12.f131313n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131306d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131307e);
            aVar.mo74318e(3, this.f131308f);
            aVar.mo74318e(4, this.f131309g);
            aVar.mo74318e(5, this.f131310h);
            String str2 = this.f131311i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f131312j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f131313n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f131306d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f131307e) + C52418a.m58678e(3, this.f131308f) + C52418a.m58678e(4, this.f131309g) + C52418a.m58678e(5, this.f131310h);
            String str6 = this.f131311i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            String str7 = this.f131312j;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            String str8 = this.f131313n;
            return str8 != null ? e + C52418a.m58683j(8, str8) : e;
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
            C48907bu1 bu12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bu12.f131306d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bu12.f131307e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bu12.f131308f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bu12.f131309g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bu12.f131310h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bu12.f131311i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bu12.f131312j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bu12.f131313n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
