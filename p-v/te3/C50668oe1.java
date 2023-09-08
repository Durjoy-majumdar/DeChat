package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oe1 */
public class C50668oe1 extends C47465a {

    /* renamed from: d */
    public long f139110d;

    /* renamed from: e */
    public String f139111e;

    /* renamed from: f */
    public int f139112f;

    /* renamed from: g */
    public int f139113g;

    /* renamed from: h */
    public boolean f139114h;

    /* renamed from: i */
    public int f139115i;

    /* renamed from: j */
    public long f139116j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50668oe1)) {
            return false;
        }
        C50668oe1 oe12 = (C50668oe1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139110d), Long.valueOf(oe12.f139110d)) && C46238a.m51546a(this.f139111e, oe12.f139111e) && C46238a.m51546a(Integer.valueOf(this.f139112f), Integer.valueOf(oe12.f139112f)) && C46238a.m51546a(Integer.valueOf(this.f139113g), Integer.valueOf(oe12.f139113g)) && C46238a.m51546a(Boolean.valueOf(this.f139114h), Boolean.valueOf(oe12.f139114h)) && C46238a.m51546a(Integer.valueOf(this.f139115i), Integer.valueOf(oe12.f139115i)) && C46238a.m51546a(Long.valueOf(this.f139116j), Long.valueOf(oe12.f139116j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139110d);
            String str = this.f139111e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f139112f);
            aVar.mo74318e(4, this.f139113g);
            aVar.mo74314a(5, this.f139114h);
            aVar.mo74318e(6, this.f139115i);
            aVar.mo74321h(7, this.f139116j);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139110d) + 0;
            String str2 = this.f139111e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58678e(3, this.f139112f) + C52418a.m58678e(4, this.f139113g) + C52418a.m58674a(5, this.f139114h) + C52418a.m58678e(6, this.f139115i) + C52418a.m58681h(7, this.f139116j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50668oe1 oe12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oe12.f139110d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    oe12.f139111e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    oe12.f139112f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    oe12.f139113g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    oe12.f139114h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    oe12.f139115i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    oe12.f139116j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
