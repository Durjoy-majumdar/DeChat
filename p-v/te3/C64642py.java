package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.py */
public class C64642py extends C47465a {

    /* renamed from: d */
    public String f184916d;

    /* renamed from: e */
    public String f184917e;

    /* renamed from: f */
    public String f184918f;

    /* renamed from: g */
    public String f184919g;

    /* renamed from: h */
    public int f184920h;

    /* renamed from: i */
    public int f184921i;

    /* renamed from: j */
    public int f184922j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64642py)) {
            return false;
        }
        C64642py pyVar = (C64642py) aVar;
        return C46238a.m51546a(this.f184916d, pyVar.f184916d) && C46238a.m51546a(this.f184917e, pyVar.f184917e) && C46238a.m51546a(this.f184918f, pyVar.f184918f) && C46238a.m51546a(this.f184919g, pyVar.f184919g) && C46238a.m51546a(Integer.valueOf(this.f184920h), Integer.valueOf(pyVar.f184920h)) && C46238a.m51546a(Integer.valueOf(this.f184921i), Integer.valueOf(pyVar.f184921i)) && C46238a.m51546a(Integer.valueOf(this.f184922j), Integer.valueOf(pyVar.f184922j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184916d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184917e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184918f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f184919g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f184920h);
            aVar.mo74318e(6, this.f184921i);
            aVar.mo74318e(7, this.f184922j);
            return 0;
        } else if (i == 1) {
            String str5 = this.f184916d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f184917e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f184918f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f184919g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f184920h) + C52418a.m58678e(6, this.f184921i) + C52418a.m58678e(7, this.f184922j);
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
            C64642py pyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pyVar.f184916d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pyVar.f184917e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pyVar.f184918f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pyVar.f184919g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pyVar.f184920h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pyVar.f184921i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pyVar.f184922j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
