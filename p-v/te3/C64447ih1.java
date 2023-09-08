package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ih1 */
public class C64447ih1 extends C47465a {

    /* renamed from: d */
    public float f183690d;

    /* renamed from: e */
    public float f183691e;

    /* renamed from: f */
    public float f183692f;

    /* renamed from: g */
    public float f183693g;

    /* renamed from: h */
    public int f183694h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64447ih1)) {
            return false;
        }
        C64447ih1 ih12 = (C64447ih1) aVar;
        return C46238a.m51546a(Float.valueOf(this.f183690d), Float.valueOf(ih12.f183690d)) && C46238a.m51546a(Float.valueOf(this.f183691e), Float.valueOf(ih12.f183691e)) && C46238a.m51546a(Float.valueOf(this.f183692f), Float.valueOf(ih12.f183692f)) && C46238a.m51546a(Float.valueOf(this.f183693g), Float.valueOf(ih12.f183693g)) && C46238a.m51546a(Integer.valueOf(this.f183694h), Integer.valueOf(ih12.f183694h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(8, this.f183690d);
            aVar.mo74317d(9, this.f183691e);
            aVar.mo74317d(10, this.f183692f);
            aVar.mo74317d(11, this.f183693g);
            aVar.mo74318e(12, this.f183694h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(8, this.f183690d) + 0 + C52418a.m58677d(9, this.f183691e) + C52418a.m58677d(10, this.f183692f) + C52418a.m58677d(11, this.f183693g) + C52418a.m58678e(12, this.f183694h);
        } else {
            if (i == 2) {
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
                C64447ih1 ih12 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 8:
                        ih12.f183690d = aVar3.mo141628f(intValue);
                        return 0;
                    case 9:
                        ih12.f183691e = aVar3.mo141628f(intValue);
                        return 0;
                    case 10:
                        ih12.f183692f = aVar3.mo141628f(intValue);
                        return 0;
                    case 11:
                        ih12.f183693g = aVar3.mo141628f(intValue);
                        return 0;
                    case 12:
                        ih12.f183694h = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
