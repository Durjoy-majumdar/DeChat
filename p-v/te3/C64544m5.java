package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m5 */
public class C64544m5 extends C47465a {

    /* renamed from: d */
    public String f184202d;

    /* renamed from: e */
    public String f184203e;

    /* renamed from: f */
    public String f184204f;

    /* renamed from: g */
    public String f184205g;

    /* renamed from: h */
    public String f184206h;

    /* renamed from: i */
    public int f184207i;

    /* renamed from: j */
    public int f184208j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64544m5)) {
            return false;
        }
        C64544m5 m5Var = (C64544m5) aVar;
        return C46238a.m51546a(this.f184202d, m5Var.f184202d) && C46238a.m51546a(this.f184203e, m5Var.f184203e) && C46238a.m51546a(this.f184204f, m5Var.f184204f) && C46238a.m51546a(this.f184205g, m5Var.f184205g) && C46238a.m51546a(this.f184206h, m5Var.f184206h) && C46238a.m51546a(Integer.valueOf(this.f184207i), Integer.valueOf(m5Var.f184207i)) && C46238a.m51546a(Integer.valueOf(this.f184208j), Integer.valueOf(m5Var.f184208j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184202d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184203e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184204f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f184205g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f184206h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f184207i);
            aVar.mo74318e(7, this.f184208j);
            return 0;
        } else if (i == 1) {
            String str6 = this.f184202d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f184203e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184204f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f184205g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f184206h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f184207i) + C52418a.m58678e(7, this.f184208j);
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
            C64544m5 m5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m5Var.f184202d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m5Var.f184203e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m5Var.f184204f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m5Var.f184205g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m5Var.f184206h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m5Var.f184207i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    m5Var.f184208j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
