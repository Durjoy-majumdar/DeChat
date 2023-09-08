package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x */
public class C64820x extends C47465a {

    /* renamed from: d */
    public String f186245d;

    /* renamed from: e */
    public long f186246e;

    /* renamed from: f */
    public long f186247f;

    /* renamed from: g */
    public int f186248g;

    /* renamed from: h */
    public String f186249h;

    /* renamed from: i */
    public String f186250i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64820x)) {
            return false;
        }
        C64820x xVar = (C64820x) aVar;
        return C46238a.m51546a(this.f186245d, xVar.f186245d) && C46238a.m51546a(Long.valueOf(this.f186246e), Long.valueOf(xVar.f186246e)) && C46238a.m51546a(Long.valueOf(this.f186247f), Long.valueOf(xVar.f186247f)) && C46238a.m51546a(Integer.valueOf(this.f186248g), Integer.valueOf(xVar.f186248g)) && C46238a.m51546a(this.f186249h, xVar.f186249h) && C46238a.m51546a(this.f186250i, xVar.f186250i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186245d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f186246e);
            aVar.mo74321h(3, this.f186247f);
            aVar.mo74318e(4, this.f186248g);
            String str2 = this.f186249h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f186250i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f186245d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int h = i2 + C52418a.m58681h(2, this.f186246e) + C52418a.m58681h(3, this.f186247f) + C52418a.m58678e(4, this.f186248g);
            String str5 = this.f186249h;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f186250i;
            return str6 != null ? h + C52418a.m58683j(6, str6) : h;
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
            C64820x xVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xVar.f186245d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xVar.f186246e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    xVar.f186247f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    xVar.f186248g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    xVar.f186249h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xVar.f186250i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
