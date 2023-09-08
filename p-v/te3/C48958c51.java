package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c51 */
public class C48958c51 extends C47465a {

    /* renamed from: d */
    public int f131519d;

    /* renamed from: e */
    public String f131520e;

    /* renamed from: f */
    public float f131521f;

    /* renamed from: g */
    public float f131522g;

    /* renamed from: h */
    public float f131523h;

    /* renamed from: i */
    public float f131524i;

    /* renamed from: j */
    public String f131525j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48958c51)) {
            return false;
        }
        C48958c51 c512 = (C48958c51) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131519d), Integer.valueOf(c512.f131519d)) && C46238a.m51546a(this.f131520e, c512.f131520e) && C46238a.m51546a(Float.valueOf(this.f131521f), Float.valueOf(c512.f131521f)) && C46238a.m51546a(Float.valueOf(this.f131522g), Float.valueOf(c512.f131522g)) && C46238a.m51546a(Float.valueOf(this.f131523h), Float.valueOf(c512.f131523h)) && C46238a.m51546a(Float.valueOf(this.f131524i), Float.valueOf(c512.f131524i)) && C46238a.m51546a(this.f131525j, c512.f131525j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131519d);
            String str = this.f131520e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74317d(3, this.f131521f);
            aVar.mo74317d(4, this.f131522g);
            aVar.mo74317d(5, this.f131523h);
            aVar.mo74317d(6, this.f131524i);
            String str2 = this.f131525j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131519d) + 0;
            String str3 = this.f131520e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int d = e + C52418a.m58677d(3, this.f131521f) + C52418a.m58677d(4, this.f131522g) + C52418a.m58677d(5, this.f131523h) + C52418a.m58677d(6, this.f131524i);
            String str4 = this.f131525j;
            return str4 != null ? d + C52418a.m58683j(7, str4) : d;
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
            C48958c51 c512 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c512.f131519d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    c512.f131520e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c512.f131521f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    c512.f131522g = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    c512.f131523h = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    c512.f131524i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    c512.f131525j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
