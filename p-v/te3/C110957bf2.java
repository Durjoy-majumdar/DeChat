package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bf2 */
public class C110957bf2 extends C47465a {

    /* renamed from: d */
    public long f331889d;

    /* renamed from: e */
    public int f331890e;

    /* renamed from: f */
    public long f331891f;

    /* renamed from: g */
    public int f331892g;

    /* renamed from: h */
    public long f331893h;

    /* renamed from: i */
    public int f331894i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110957bf2)) {
            return false;
        }
        C110957bf2 bf22 = (C110957bf2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f331889d), Long.valueOf(bf22.f331889d)) && C46238a.m51546a(Integer.valueOf(this.f331890e), Integer.valueOf(bf22.f331890e)) && C46238a.m51546a(Long.valueOf(this.f331891f), Long.valueOf(bf22.f331891f)) && C46238a.m51546a(Integer.valueOf(this.f331892g), Integer.valueOf(bf22.f331892g)) && C46238a.m51546a(Long.valueOf(this.f331893h), Long.valueOf(bf22.f331893h)) && C46238a.m51546a(Integer.valueOf(this.f331894i), Integer.valueOf(bf22.f331894i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f331889d);
            aVar.mo74318e(2, this.f331890e);
            aVar.mo74321h(3, this.f331891f);
            aVar.mo74318e(4, this.f331892g);
            aVar.mo74321h(5, this.f331893h);
            aVar.mo74318e(6, this.f331894i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f331889d) + 0 + C52418a.m58678e(2, this.f331890e) + C52418a.m58681h(3, this.f331891f) + C52418a.m58678e(4, this.f331892g) + C52418a.m58681h(5, this.f331893h) + C52418a.m58678e(6, this.f331894i);
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
                C110957bf2 bf22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        bf22.f331889d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        bf22.f331890e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        bf22.f331891f = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        bf22.f331892g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        bf22.f331893h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        bf22.f331894i = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
