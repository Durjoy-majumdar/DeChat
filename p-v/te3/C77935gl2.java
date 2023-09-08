package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gl2 */
public class C77935gl2 extends C47465a {

    /* renamed from: d */
    public String f227478d;

    /* renamed from: e */
    public int f227479e;

    /* renamed from: f */
    public String f227480f;

    /* renamed from: g */
    public String f227481g;

    /* renamed from: h */
    public String f227482h;

    /* renamed from: i */
    public String f227483i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77935gl2)) {
            return false;
        }
        C77935gl2 gl22 = (C77935gl2) aVar;
        return C46238a.m51546a(this.f227478d, gl22.f227478d) && C46238a.m51546a(Integer.valueOf(this.f227479e), Integer.valueOf(gl22.f227479e)) && C46238a.m51546a(this.f227480f, gl22.f227480f) && C46238a.m51546a(this.f227481g, gl22.f227481g) && C46238a.m51546a(this.f227482h, gl22.f227482h) && C46238a.m51546a(this.f227483i, gl22.f227483i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227478d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f227479e);
            String str2 = this.f227480f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227481g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f227482h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f227483i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f227478d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f227479e);
            String str7 = this.f227480f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f227481g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f227482h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f227483i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            C77935gl2 gl22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gl22.f227478d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gl22.f227479e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gl22.f227480f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gl22.f227481g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gl22.f227482h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gl22.f227483i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
