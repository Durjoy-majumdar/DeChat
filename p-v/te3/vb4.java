package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vb4 extends C47465a {

    /* renamed from: d */
    public int f228306d;

    /* renamed from: e */
    public String f228307e;

    /* renamed from: f */
    public String f228308f;

    /* renamed from: g */
    public int f228309g;

    /* renamed from: h */
    public int f228310h;

    /* renamed from: i */
    public String f228311i;

    /* renamed from: j */
    public String f228312j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vb4)) {
            return false;
        }
        vb4 vb4 = (vb4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f228306d), Integer.valueOf(vb4.f228306d)) && C46238a.m51546a(this.f228307e, vb4.f228307e) && C46238a.m51546a(this.f228308f, vb4.f228308f) && C46238a.m51546a(Integer.valueOf(this.f228309g), Integer.valueOf(vb4.f228309g)) && C46238a.m51546a(Integer.valueOf(this.f228310h), Integer.valueOf(vb4.f228310h)) && C46238a.m51546a(this.f228311i, vb4.f228311i) && C46238a.m51546a(this.f228312j, vb4.f228312j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f228306d);
            String str = this.f228307e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f228308f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f228309g);
            aVar.mo74318e(5, this.f228310h);
            String str3 = this.f228311i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f228312j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f228306d) + 0;
            String str5 = this.f228307e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f228308f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            int e2 = e + C52418a.m58678e(4, this.f228309g) + C52418a.m58678e(5, this.f228310h);
            String str7 = this.f228311i;
            if (str7 != null) {
                e2 += C52418a.m58683j(6, str7);
            }
            String str8 = this.f228312j;
            return str8 != null ? e2 + C52418a.m58683j(7, str8) : e2;
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
            vb4 vb4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vb4.f228306d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    vb4.f228307e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vb4.f228308f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vb4.f228309g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vb4.f228310h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vb4.f228311i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vb4.f228312j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
