package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t70 */
public class C51353t70 extends C47465a {

    /* renamed from: d */
    public int f142009d;

    /* renamed from: e */
    public int f142010e;

    /* renamed from: f */
    public int f142011f;

    /* renamed from: g */
    public String f142012g;

    /* renamed from: h */
    public int f142013h;

    /* renamed from: i */
    public long f142014i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51353t70)) {
            return false;
        }
        C51353t70 t702 = (C51353t70) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142009d), Integer.valueOf(t702.f142009d)) && C46238a.m51546a(Integer.valueOf(this.f142010e), Integer.valueOf(t702.f142010e)) && C46238a.m51546a(Integer.valueOf(this.f142011f), Integer.valueOf(t702.f142011f)) && C46238a.m51546a(this.f142012g, t702.f142012g) && C46238a.m51546a(Integer.valueOf(this.f142013h), Integer.valueOf(t702.f142013h)) && C46238a.m51546a(Long.valueOf(this.f142014i), Long.valueOf(t702.f142014i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142009d);
            aVar.mo74318e(2, this.f142010e);
            aVar.mo74318e(3, this.f142011f);
            String str = this.f142012g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f142013h);
            aVar.mo74321h(6, this.f142014i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142009d) + 0 + C52418a.m58678e(2, this.f142010e) + C52418a.m58678e(3, this.f142011f);
            String str2 = this.f142012g;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f142013h) + C52418a.m58681h(6, this.f142014i);
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
            C51353t70 t702 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t702.f142009d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    t702.f142010e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    t702.f142011f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t702.f142012g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t702.f142013h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    t702.f142014i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
