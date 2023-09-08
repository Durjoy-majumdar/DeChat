package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e33 */
public class C49227e33 extends C47465a {

    /* renamed from: d */
    public String f132660d;

    /* renamed from: e */
    public String f132661e;

    /* renamed from: f */
    public int f132662f;

    /* renamed from: g */
    public int f132663g;

    /* renamed from: h */
    public int f132664h;

    /* renamed from: i */
    public int f132665i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49227e33)) {
            return false;
        }
        C49227e33 e332 = (C49227e33) aVar;
        return C46238a.m51546a(this.f132660d, e332.f132660d) && C46238a.m51546a(this.f132661e, e332.f132661e) && C46238a.m51546a(Integer.valueOf(this.f132662f), Integer.valueOf(e332.f132662f)) && C46238a.m51546a(Integer.valueOf(this.f132663g), Integer.valueOf(e332.f132663g)) && C46238a.m51546a(Integer.valueOf(this.f132664h), Integer.valueOf(e332.f132664h)) && C46238a.m51546a(Integer.valueOf(this.f132665i), Integer.valueOf(e332.f132665i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132660d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132661e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f132662f);
            aVar.mo74318e(4, this.f132663g);
            aVar.mo74318e(5, this.f132664h);
            aVar.mo74318e(7, this.f132665i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f132660d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f132661e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f132662f) + C52418a.m58678e(4, this.f132663g) + C52418a.m58678e(5, this.f132664h) + C52418a.m58678e(7, this.f132665i);
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
            C49227e33 e332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e332.f132660d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e332.f132661e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e332.f132662f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                e332.f132663g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                e332.f132664h = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                e332.f132665i = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
