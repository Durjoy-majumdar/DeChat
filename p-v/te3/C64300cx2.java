package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cx2 */
public class C64300cx2 extends C47465a {

    /* renamed from: d */
    public int f182596d;

    /* renamed from: e */
    public int f182597e;

    /* renamed from: f */
    public int f182598f;

    /* renamed from: g */
    public int f182599g;

    /* renamed from: h */
    public int f182600h;

    /* renamed from: i */
    public int f182601i;

    /* renamed from: j */
    public int f182602j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64300cx2)) {
            return false;
        }
        C64300cx2 cx22 = (C64300cx2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182596d), Integer.valueOf(cx22.f182596d)) && C46238a.m51546a(Integer.valueOf(this.f182597e), Integer.valueOf(cx22.f182597e)) && C46238a.m51546a(Integer.valueOf(this.f182598f), Integer.valueOf(cx22.f182598f)) && C46238a.m51546a(Integer.valueOf(this.f182599g), Integer.valueOf(cx22.f182599g)) && C46238a.m51546a(Integer.valueOf(this.f182600h), Integer.valueOf(cx22.f182600h)) && C46238a.m51546a(Integer.valueOf(this.f182601i), Integer.valueOf(cx22.f182601i)) && C46238a.m51546a(Integer.valueOf(this.f182602j), Integer.valueOf(cx22.f182602j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182596d);
            aVar.mo74318e(2, this.f182597e);
            aVar.mo74318e(3, this.f182598f);
            aVar.mo74318e(4, this.f182599g);
            aVar.mo74318e(5, this.f182600h);
            aVar.mo74318e(6, this.f182601i);
            aVar.mo74318e(7, this.f182602j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182596d) + 0 + C52418a.m58678e(2, this.f182597e) + C52418a.m58678e(3, this.f182598f) + C52418a.m58678e(4, this.f182599g) + C52418a.m58678e(5, this.f182600h) + C52418a.m58678e(6, this.f182601i) + C52418a.m58678e(7, this.f182602j);
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
                C64300cx2 cx22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        cx22.f182596d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        cx22.f182597e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        cx22.f182598f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        cx22.f182599g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        cx22.f182600h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        cx22.f182601i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        cx22.f182602j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
