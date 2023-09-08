package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jl0 */
public class C64473jl0 extends C47465a {

    /* renamed from: d */
    public String f183806d;

    /* renamed from: e */
    public String f183807e;

    /* renamed from: f */
    public String f183808f;

    /* renamed from: g */
    public String f183809g;

    /* renamed from: h */
    public long f183810h;

    /* renamed from: i */
    public String f183811i;

    /* renamed from: j */
    public int f183812j;

    /* renamed from: n */
    public String f183813n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64473jl0)) {
            return false;
        }
        C64473jl0 jl02 = (C64473jl0) aVar;
        return C46238a.m51546a(this.f183806d, jl02.f183806d) && C46238a.m51546a(this.f183807e, jl02.f183807e) && C46238a.m51546a(this.f183808f, jl02.f183808f) && C46238a.m51546a(this.f183809g, jl02.f183809g) && C46238a.m51546a(Long.valueOf(this.f183810h), Long.valueOf(jl02.f183810h)) && C46238a.m51546a(this.f183811i, jl02.f183811i) && C46238a.m51546a(Integer.valueOf(this.f183812j), Integer.valueOf(jl02.f183812j)) && C46238a.m51546a(this.f183813n, jl02.f183813n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183806d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183807e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183808f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183809g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f183810h);
            String str5 = this.f183811i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f183812j);
            String str6 = this.f183813n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f183806d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f183807e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f183808f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f183809g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int h = i2 + C52418a.m58681h(5, this.f183810h);
            String str11 = this.f183811i;
            if (str11 != null) {
                h += C52418a.m58683j(6, str11);
            }
            int e = h + C52418a.m58678e(7, this.f183812j);
            String str12 = this.f183813n;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
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
            C64473jl0 jl02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jl02.f183806d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jl02.f183807e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jl02.f183808f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jl02.f183809g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jl02.f183810h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    jl02.f183811i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jl02.f183812j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jl02.f183813n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
