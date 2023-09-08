package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.no2 */
public class C64587no2 extends C47465a {

    /* renamed from: d */
    public long f184522d;

    /* renamed from: e */
    public String f184523e;

    /* renamed from: f */
    public int f184524f;

    /* renamed from: g */
    public String f184525g;

    /* renamed from: h */
    public int f184526h;

    /* renamed from: i */
    public String f184527i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64587no2)) {
            return false;
        }
        C64587no2 no22 = (C64587no2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184522d), Long.valueOf(no22.f184522d)) && C46238a.m51546a(this.f184523e, no22.f184523e) && C46238a.m51546a(Integer.valueOf(this.f184524f), Integer.valueOf(no22.f184524f)) && C46238a.m51546a(this.f184525g, no22.f184525g) && C46238a.m51546a(Integer.valueOf(this.f184526h), Integer.valueOf(no22.f184526h)) && C46238a.m51546a(this.f184527i, no22.f184527i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184522d);
            String str = this.f184523e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f184524f);
            String str2 = this.f184525g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f184526h);
            String str3 = this.f184527i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f184522d) + 0;
            String str4 = this.f184523e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int e = h + C52418a.m58678e(3, this.f184524f);
            String str5 = this.f184525g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int e2 = e + C52418a.m58678e(5, this.f184526h);
            String str6 = this.f184527i;
            return str6 != null ? e2 + C52418a.m58683j(6, str6) : e2;
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
            C64587no2 no22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    no22.f184522d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    no22.f184523e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    no22.f184524f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    no22.f184525g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    no22.f184526h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    no22.f184527i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
