package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ey0 */
public class C64351ey0 extends C47465a {

    /* renamed from: d */
    public int f183045d;

    /* renamed from: e */
    public long f183046e;

    /* renamed from: f */
    public String f183047f;

    /* renamed from: g */
    public String f183048g;

    /* renamed from: h */
    public String f183049h;

    /* renamed from: i */
    public String f183050i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64351ey0)) {
            return false;
        }
        C64351ey0 ey02 = (C64351ey0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183045d), Integer.valueOf(ey02.f183045d)) && C46238a.m51546a(Long.valueOf(this.f183046e), Long.valueOf(ey02.f183046e)) && C46238a.m51546a(this.f183047f, ey02.f183047f) && C46238a.m51546a(this.f183048g, ey02.f183048g) && C46238a.m51546a(this.f183049h, ey02.f183049h) && C46238a.m51546a(this.f183050i, ey02.f183050i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183045d);
            aVar.mo74321h(2, this.f183046e);
            String str = this.f183047f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f183048g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f183049h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183050i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183045d) + 0 + C52418a.m58681h(2, this.f183046e);
            String str5 = this.f183047f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f183048g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f183049h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f183050i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C64351ey0 ey02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ey02.f183045d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ey02.f183046e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ey02.f183047f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ey02.f183048g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ey02.f183049h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ey02.f183050i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
