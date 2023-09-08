package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rr3 */
public class C51146rr3 extends C47465a {

    /* renamed from: d */
    public String f141101d;

    /* renamed from: e */
    public long f141102e;

    /* renamed from: f */
    public int f141103f;

    /* renamed from: g */
    public boolean f141104g;

    /* renamed from: h */
    public boolean f141105h;

    /* renamed from: i */
    public int f141106i;

    /* renamed from: j */
    public int f141107j;

    /* renamed from: n */
    public boolean f141108n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51146rr3)) {
            return false;
        }
        C51146rr3 rr32 = (C51146rr3) aVar;
        return C46238a.m51546a(this.f141101d, rr32.f141101d) && C46238a.m51546a(Long.valueOf(this.f141102e), Long.valueOf(rr32.f141102e)) && C46238a.m51546a(Integer.valueOf(this.f141103f), Integer.valueOf(rr32.f141103f)) && C46238a.m51546a(Boolean.valueOf(this.f141104g), Boolean.valueOf(rr32.f141104g)) && C46238a.m51546a(Boolean.valueOf(this.f141105h), Boolean.valueOf(rr32.f141105h)) && C46238a.m51546a(Integer.valueOf(this.f141106i), Integer.valueOf(rr32.f141106i)) && C46238a.m51546a(Integer.valueOf(this.f141107j), Integer.valueOf(rr32.f141107j)) && C46238a.m51546a(Boolean.valueOf(this.f141108n), Boolean.valueOf(rr32.f141108n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141101d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f141102e);
            aVar.mo74318e(3, this.f141103f);
            aVar.mo74314a(4, this.f141104g);
            aVar.mo74314a(5, this.f141105h);
            aVar.mo74318e(6, this.f141106i);
            aVar.mo74318e(7, this.f141107j);
            aVar.mo74314a(8, this.f141108n);
            return 0;
        } else if (i == 1) {
            String str2 = this.f141101d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f141102e) + C52418a.m58678e(3, this.f141103f) + C52418a.m58674a(4, this.f141104g) + C52418a.m58674a(5, this.f141105h) + C52418a.m58678e(6, this.f141106i) + C52418a.m58678e(7, this.f141107j) + C52418a.m58674a(8, this.f141108n);
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
            C51146rr3 rr32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rr32.f141101d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rr32.f141102e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    rr32.f141103f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rr32.f141104g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    rr32.f141105h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    rr32.f141106i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rr32.f141107j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rr32.f141108n = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
