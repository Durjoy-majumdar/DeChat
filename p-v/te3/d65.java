package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d65 extends C47465a {

    /* renamed from: d */
    public boolean f182636d;

    /* renamed from: e */
    public String f182637e;

    /* renamed from: f */
    public C89349b f182638f;

    /* renamed from: g */
    public int f182639g;

    /* renamed from: h */
    public int f182640h;

    /* renamed from: i */
    public int f182641i;

    /* renamed from: j */
    public boolean f182642j;

    /* renamed from: n */
    public int f182643n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d65)) {
            return false;
        }
        d65 d65 = (d65) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f182636d), Boolean.valueOf(d65.f182636d)) && C46238a.m51546a(this.f182637e, d65.f182637e) && C46238a.m51546a(this.f182638f, d65.f182638f) && C46238a.m51546a(Integer.valueOf(this.f182639g), Integer.valueOf(d65.f182639g)) && C46238a.m51546a(Integer.valueOf(this.f182640h), Integer.valueOf(d65.f182640h)) && C46238a.m51546a(Integer.valueOf(this.f182641i), Integer.valueOf(d65.f182641i)) && C46238a.m51546a(Boolean.valueOf(this.f182642j), Boolean.valueOf(d65.f182642j)) && C46238a.m51546a(Integer.valueOf(this.f182643n), Integer.valueOf(d65.f182643n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f182636d);
            String str = this.f182637e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f182638f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f182639g);
            aVar.mo74318e(5, this.f182640h);
            aVar.mo74318e(6, this.f182641i);
            aVar.mo74314a(9, this.f182642j);
            aVar.mo74318e(10, this.f182643n);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f182636d) + 0;
            String str2 = this.f182637e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f182638f;
            if (bVar2 != null) {
                a += C52418a.m58675b(3, bVar2);
            }
            return a + C52418a.m58678e(4, this.f182639g) + C52418a.m58678e(5, this.f182640h) + C52418a.m58678e(6, this.f182641i) + C52418a.m58674a(9, this.f182642j) + C52418a.m58678e(10, this.f182643n);
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
            d65 d65 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d65.f182636d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    d65.f182637e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    d65.f182638f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    d65.f182639g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    d65.f182640h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    d65.f182641i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    d65.f182642j = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    d65.f182643n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
