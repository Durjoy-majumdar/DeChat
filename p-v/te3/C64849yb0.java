package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yb0 */
public class C64849yb0 extends C47465a {

    /* renamed from: d */
    public int f186459d;

    /* renamed from: e */
    public String f186460e;

    /* renamed from: f */
    public long f186461f;

    /* renamed from: g */
    public long f186462g;

    /* renamed from: h */
    public long f186463h;

    /* renamed from: i */
    public int f186464i;

    /* renamed from: j */
    public long f186465j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64849yb0)) {
            return false;
        }
        C64849yb0 yb02 = (C64849yb0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186459d), Integer.valueOf(yb02.f186459d)) && C46238a.m51546a(this.f186460e, yb02.f186460e) && C46238a.m51546a(Long.valueOf(this.f186461f), Long.valueOf(yb02.f186461f)) && C46238a.m51546a(Long.valueOf(this.f186462g), Long.valueOf(yb02.f186462g)) && C46238a.m51546a(Long.valueOf(this.f186463h), Long.valueOf(yb02.f186463h)) && C46238a.m51546a(Integer.valueOf(this.f186464i), Integer.valueOf(yb02.f186464i)) && C46238a.m51546a(Long.valueOf(this.f186465j), Long.valueOf(yb02.f186465j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186459d);
            String str = this.f186460e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f186461f);
            aVar.mo74321h(4, this.f186462g);
            aVar.mo74321h(5, this.f186463h);
            aVar.mo74318e(6, this.f186464i);
            aVar.mo74321h(7, this.f186465j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186459d) + 0;
            String str2 = this.f186460e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58681h(3, this.f186461f) + C52418a.m58681h(4, this.f186462g) + C52418a.m58681h(5, this.f186463h) + C52418a.m58678e(6, this.f186464i) + C52418a.m58681h(7, this.f186465j);
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
            C64849yb0 yb02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yb02.f186459d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    yb02.f186460e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yb02.f186461f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    yb02.f186462g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    yb02.f186463h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    yb02.f186464i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    yb02.f186465j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
