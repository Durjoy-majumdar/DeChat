package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h61 */
public class C64412h61 extends C47465a {

    /* renamed from: d */
    public int f183407d;

    /* renamed from: e */
    public int f183408e;

    /* renamed from: f */
    public int f183409f;

    /* renamed from: g */
    public int f183410g;

    /* renamed from: h */
    public int f183411h;

    /* renamed from: i */
    public int f183412i;

    /* renamed from: j */
    public int f183413j;

    /* renamed from: n */
    public int f183414n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64412h61)) {
            return false;
        }
        C64412h61 h612 = (C64412h61) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183407d), Integer.valueOf(h612.f183407d)) && C46238a.m51546a(Integer.valueOf(this.f183408e), Integer.valueOf(h612.f183408e)) && C46238a.m51546a(Integer.valueOf(this.f183409f), Integer.valueOf(h612.f183409f)) && C46238a.m51546a(Integer.valueOf(this.f183410g), Integer.valueOf(h612.f183410g)) && C46238a.m51546a(Integer.valueOf(this.f183411h), Integer.valueOf(h612.f183411h)) && C46238a.m51546a(Integer.valueOf(this.f183412i), Integer.valueOf(h612.f183412i)) && C46238a.m51546a(Integer.valueOf(this.f183413j), Integer.valueOf(h612.f183413j)) && C46238a.m51546a(Integer.valueOf(this.f183414n), Integer.valueOf(h612.f183414n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183407d);
            aVar.mo74318e(2, this.f183408e);
            aVar.mo74318e(3, this.f183409f);
            aVar.mo74318e(4, this.f183410g);
            aVar.mo74318e(5, this.f183411h);
            aVar.mo74318e(6, this.f183412i);
            aVar.mo74318e(7, this.f183413j);
            aVar.mo74318e(8, this.f183414n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f183407d) + 0 + C52418a.m58678e(2, this.f183408e) + C52418a.m58678e(3, this.f183409f) + C52418a.m58678e(4, this.f183410g) + C52418a.m58678e(5, this.f183411h) + C52418a.m58678e(6, this.f183412i) + C52418a.m58678e(7, this.f183413j) + C52418a.m58678e(8, this.f183414n);
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
                C64412h61 h612 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        h612.f183407d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        h612.f183408e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        h612.f183409f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        h612.f183410g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        h612.f183411h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        h612.f183412i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        h612.f183413j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        h612.f183414n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
