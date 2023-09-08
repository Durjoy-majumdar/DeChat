package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yh3 */
public class C64857yh3 extends C47465a {

    /* renamed from: d */
    public long f186532d;

    /* renamed from: e */
    public long f186533e;

    /* renamed from: f */
    public int f186534f;

    /* renamed from: g */
    public int f186535g;

    /* renamed from: h */
    public long f186536h;

    /* renamed from: i */
    public int f186537i;

    /* renamed from: j */
    public int f186538j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64857yh3)) {
            return false;
        }
        C64857yh3 yh32 = (C64857yh3) aVar;
        return C46238a.m51546a(Long.valueOf(this.f186532d), Long.valueOf(yh32.f186532d)) && C46238a.m51546a(Long.valueOf(this.f186533e), Long.valueOf(yh32.f186533e)) && C46238a.m51546a(Integer.valueOf(this.f186534f), Integer.valueOf(yh32.f186534f)) && C46238a.m51546a(Integer.valueOf(this.f186535g), Integer.valueOf(yh32.f186535g)) && C46238a.m51546a(Long.valueOf(this.f186536h), Long.valueOf(yh32.f186536h)) && C46238a.m51546a(Integer.valueOf(this.f186537i), Integer.valueOf(yh32.f186537i)) && C46238a.m51546a(Integer.valueOf(this.f186538j), Integer.valueOf(yh32.f186538j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f186532d);
            aVar.mo74321h(2, this.f186533e);
            aVar.mo74318e(3, this.f186534f);
            aVar.mo74318e(4, this.f186535g);
            aVar.mo74321h(5, this.f186536h);
            aVar.mo74318e(6, this.f186537i);
            aVar.mo74318e(7, this.f186538j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f186532d) + 0 + C52418a.m58681h(2, this.f186533e) + C52418a.m58678e(3, this.f186534f) + C52418a.m58678e(4, this.f186535g) + C52418a.m58681h(5, this.f186536h) + C52418a.m58678e(6, this.f186537i) + C52418a.m58678e(7, this.f186538j);
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
                C64857yh3 yh32 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        yh32.f186532d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        yh32.f186533e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        yh32.f186534f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        yh32.f186535g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        yh32.f186536h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        yh32.f186537i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        yh32.f186538j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
