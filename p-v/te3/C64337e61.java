package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e61 */
public class C64337e61 extends C47465a {

    /* renamed from: d */
    public int f182920d;

    /* renamed from: e */
    public boolean f182921e;

    /* renamed from: f */
    public int f182922f;

    /* renamed from: g */
    public long f182923g;

    /* renamed from: h */
    public int f182924h;

    /* renamed from: i */
    public int f182925i;

    /* renamed from: j */
    public C89349b f182926j;

    /* renamed from: n */
    public String f182927n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64337e61)) {
            return false;
        }
        C64337e61 e612 = (C64337e61) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182920d), Integer.valueOf(e612.f182920d)) && C46238a.m51546a(Boolean.valueOf(this.f182921e), Boolean.valueOf(e612.f182921e)) && C46238a.m51546a(Integer.valueOf(this.f182922f), Integer.valueOf(e612.f182922f)) && C46238a.m51546a(Long.valueOf(this.f182923g), Long.valueOf(e612.f182923g)) && C46238a.m51546a(Integer.valueOf(this.f182924h), Integer.valueOf(e612.f182924h)) && C46238a.m51546a(Integer.valueOf(this.f182925i), Integer.valueOf(e612.f182925i)) && C46238a.m51546a(this.f182926j, e612.f182926j) && C46238a.m51546a(this.f182927n, e612.f182927n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182920d);
            aVar.mo74314a(2, this.f182921e);
            aVar.mo74318e(3, this.f182922f);
            aVar.mo74321h(4, this.f182923g);
            aVar.mo74318e(5, this.f182924h);
            aVar.mo74318e(6, this.f182925i);
            C89349b bVar = this.f182926j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            String str = this.f182927n;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182920d) + 0 + C52418a.m58674a(2, this.f182921e) + C52418a.m58678e(3, this.f182922f) + C52418a.m58681h(4, this.f182923g) + C52418a.m58678e(5, this.f182924h) + C52418a.m58678e(6, this.f182925i);
            C89349b bVar2 = this.f182926j;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            String str2 = this.f182927n;
            return str2 != null ? e + C52418a.m58683j(8, str2) : e;
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
            C64337e61 e612 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e612.f182920d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    e612.f182921e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    e612.f182922f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e612.f182923g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    e612.f182924h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    e612.f182925i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    e612.f182926j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    e612.f182927n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
