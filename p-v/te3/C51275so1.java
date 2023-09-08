package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.so1 */
public class C51275so1 extends C47465a {

    /* renamed from: d */
    public int f141646d;

    /* renamed from: e */
    public int f141647e;

    /* renamed from: f */
    public int f141648f;

    /* renamed from: g */
    public int f141649g;

    /* renamed from: h */
    public String f141650h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51275so1)) {
            return false;
        }
        C51275so1 so12 = (C51275so1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141646d), Integer.valueOf(so12.f141646d)) && C46238a.m51546a(Integer.valueOf(this.f141647e), Integer.valueOf(so12.f141647e)) && C46238a.m51546a(Integer.valueOf(this.f141648f), Integer.valueOf(so12.f141648f)) && C46238a.m51546a(Integer.valueOf(this.f141649g), Integer.valueOf(so12.f141649g)) && C46238a.m51546a(this.f141650h, so12.f141650h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141646d);
            aVar.mo74318e(2, this.f141647e);
            aVar.mo74318e(3, this.f141648f);
            aVar.mo74318e(4, this.f141649g);
            String str = this.f141650h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141646d) + 0 + C52418a.m58678e(2, this.f141647e) + C52418a.m58678e(3, this.f141648f) + C52418a.m58678e(4, this.f141649g);
            String str2 = this.f141650h;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
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
            C51275so1 so12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                so12.f141646d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                so12.f141647e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                so12.f141648f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                so12.f141649g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                so12.f141650h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
