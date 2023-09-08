package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ft0 */
public class C64375ft0 extends C47465a {

    /* renamed from: d */
    public int f183223d;

    /* renamed from: e */
    public int f183224e;

    /* renamed from: f */
    public int f183225f;

    /* renamed from: g */
    public String f183226g;

    /* renamed from: h */
    public int f183227h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64375ft0)) {
            return false;
        }
        C64375ft0 ft02 = (C64375ft0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183223d), Integer.valueOf(ft02.f183223d)) && C46238a.m51546a(Integer.valueOf(this.f183224e), Integer.valueOf(ft02.f183224e)) && C46238a.m51546a(Integer.valueOf(this.f183225f), Integer.valueOf(ft02.f183225f)) && C46238a.m51546a(this.f183226g, ft02.f183226g) && C46238a.m51546a(Integer.valueOf(this.f183227h), Integer.valueOf(ft02.f183227h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183223d);
            aVar.mo74318e(2, this.f183224e);
            aVar.mo74318e(102, this.f183225f);
            String str = this.f183226g;
            if (str != null) {
                aVar.mo74323j(103, str);
            }
            aVar.mo74318e(104, this.f183227h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183223d) + 0 + C52418a.m58678e(2, this.f183224e) + C52418a.m58678e(102, this.f183225f);
            String str2 = this.f183226g;
            if (str2 != null) {
                e += C52418a.m58683j(103, str2);
            }
            return e + C52418a.m58678e(104, this.f183227h);
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
            C64375ft0 ft02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ft02.f183223d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                switch (intValue) {
                    case 102:
                        ft02.f183225f = aVar3.mo141629g(intValue);
                        return 0;
                    case 103:
                        ft02.f183226g = aVar3.mo141633k(intValue);
                        return 0;
                    case 104:
                        ft02.f183227h = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                ft02.f183224e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
