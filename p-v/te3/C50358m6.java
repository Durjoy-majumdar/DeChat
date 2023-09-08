package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m6 */
public class C50358m6 extends C47465a {

    /* renamed from: d */
    public String f137858d;

    /* renamed from: e */
    public long f137859e;

    /* renamed from: f */
    public int f137860f;

    /* renamed from: g */
    public int f137861g;

    /* renamed from: h */
    public int f137862h;

    /* renamed from: i */
    public long f137863i;

    /* renamed from: j */
    public int f137864j;

    /* renamed from: n */
    public String f137865n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50358m6)) {
            return false;
        }
        C50358m6 m6Var = (C50358m6) aVar;
        return C46238a.m51546a(this.f137858d, m6Var.f137858d) && C46238a.m51546a(Long.valueOf(this.f137859e), Long.valueOf(m6Var.f137859e)) && C46238a.m51546a(Integer.valueOf(this.f137860f), Integer.valueOf(m6Var.f137860f)) && C46238a.m51546a(Integer.valueOf(this.f137861g), Integer.valueOf(m6Var.f137861g)) && C46238a.m51546a(Integer.valueOf(this.f137862h), Integer.valueOf(m6Var.f137862h)) && C46238a.m51546a(Long.valueOf(this.f137863i), Long.valueOf(m6Var.f137863i)) && C46238a.m51546a(Integer.valueOf(this.f137864j), Integer.valueOf(m6Var.f137864j)) && C46238a.m51546a(this.f137865n, m6Var.f137865n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137858d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f137859e);
            aVar.mo74318e(3, this.f137860f);
            aVar.mo74318e(4, this.f137861g);
            aVar.mo74318e(5, this.f137862h);
            aVar.mo74321h(6, this.f137863i);
            aVar.mo74318e(7, this.f137864j);
            String str2 = this.f137865n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f137858d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f137859e) + C52418a.m58678e(3, this.f137860f) + C52418a.m58678e(4, this.f137861g) + C52418a.m58678e(5, this.f137862h) + C52418a.m58681h(6, this.f137863i) + C52418a.m58678e(7, this.f137864j);
            String str4 = this.f137865n;
            return str4 != null ? h + C52418a.m58683j(8, str4) : h;
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
            C50358m6 m6Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m6Var.f137858d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m6Var.f137859e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    m6Var.f137860f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    m6Var.f137861g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    m6Var.f137862h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    m6Var.f137863i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    m6Var.f137864j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    m6Var.f137865n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
