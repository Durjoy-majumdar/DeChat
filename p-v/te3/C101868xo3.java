package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xo3 */
public class C101868xo3 extends C47465a {

    /* renamed from: d */
    public String f299893d;

    /* renamed from: e */
    public String f299894e;

    /* renamed from: f */
    public String f299895f;

    /* renamed from: g */
    public C89349b f299896g;

    /* renamed from: h */
    public C89349b f299897h;

    /* renamed from: i */
    public int f299898i;

    /* renamed from: j */
    public C89349b f299899j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101868xo3)) {
            return false;
        }
        C101868xo3 xo32 = (C101868xo3) aVar;
        return C46238a.m51546a(this.f299893d, xo32.f299893d) && C46238a.m51546a(this.f299894e, xo32.f299894e) && C46238a.m51546a(this.f299895f, xo32.f299895f) && C46238a.m51546a(this.f299896g, xo32.f299896g) && C46238a.m51546a(this.f299897h, xo32.f299897h) && C46238a.m51546a(Integer.valueOf(this.f299898i), Integer.valueOf(xo32.f299898i)) && C46238a.m51546a(this.f299899j, xo32.f299899j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299893d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299894e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299895f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C89349b bVar = this.f299896g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            C89349b bVar2 = this.f299897h;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            aVar.mo74318e(6, this.f299898i);
            C89349b bVar3 = this.f299899j;
            if (bVar3 != null) {
                aVar.mo74315b(7, bVar3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f299893d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f299894e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f299895f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C89349b bVar4 = this.f299896g;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(4, bVar4);
            }
            C89349b bVar5 = this.f299897h;
            if (bVar5 != null) {
                i2 += C52418a.m58675b(5, bVar5);
            }
            int e = i2 + C52418a.m58678e(6, this.f299898i);
            C89349b bVar6 = this.f299899j;
            return bVar6 != null ? e + C52418a.m58675b(7, bVar6) : e;
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
            C101868xo3 xo32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xo32.f299893d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xo32.f299894e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xo32.f299895f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xo32.f299896g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    xo32.f299897h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    xo32.f299898i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xo32.f299899j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
