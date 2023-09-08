package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iq */
public class C90420iq extends C47465a {

    /* renamed from: d */
    public long f259600d;

    /* renamed from: e */
    public long f259601e;

    /* renamed from: f */
    public long f259602f;

    /* renamed from: g */
    public long f259603g;

    /* renamed from: h */
    public long f259604h;

    /* renamed from: i */
    public long f259605i;

    /* renamed from: j */
    public long f259606j;

    /* renamed from: n */
    public long f259607n;

    /* renamed from: o */
    public long f259608o;

    /* renamed from: p */
    public long f259609p;

    /* renamed from: q */
    public long f259610q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90420iq)) {
            return false;
        }
        C90420iq iqVar = (C90420iq) aVar;
        return C46238a.m51546a(Long.valueOf(this.f259600d), Long.valueOf(iqVar.f259600d)) && C46238a.m51546a(Long.valueOf(this.f259601e), Long.valueOf(iqVar.f259601e)) && C46238a.m51546a(Long.valueOf(this.f259602f), Long.valueOf(iqVar.f259602f)) && C46238a.m51546a(Long.valueOf(this.f259603g), Long.valueOf(iqVar.f259603g)) && C46238a.m51546a(Long.valueOf(this.f259604h), Long.valueOf(iqVar.f259604h)) && C46238a.m51546a(Long.valueOf(this.f259605i), Long.valueOf(iqVar.f259605i)) && C46238a.m51546a(Long.valueOf(this.f259606j), Long.valueOf(iqVar.f259606j)) && C46238a.m51546a(Long.valueOf(this.f259607n), Long.valueOf(iqVar.f259607n)) && C46238a.m51546a(Long.valueOf(this.f259608o), Long.valueOf(iqVar.f259608o)) && C46238a.m51546a(Long.valueOf(this.f259609p), Long.valueOf(iqVar.f259609p)) && C46238a.m51546a(Long.valueOf(this.f259610q), Long.valueOf(iqVar.f259610q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f259600d);
            aVar.mo74321h(2, this.f259601e);
            aVar.mo74321h(3, this.f259602f);
            aVar.mo74321h(4, this.f259603g);
            aVar.mo74321h(5, this.f259604h);
            aVar.mo74321h(6, this.f259605i);
            aVar.mo74321h(7, this.f259606j);
            aVar.mo74321h(8, this.f259607n);
            aVar.mo74321h(9, this.f259608o);
            aVar.mo74321h(10, this.f259609p);
            aVar.mo74321h(11, this.f259610q);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58681h(1, this.f259600d) + 0 + C52418a.m58681h(2, this.f259601e) + C52418a.m58681h(3, this.f259602f) + C52418a.m58681h(4, this.f259603g) + C52418a.m58681h(5, this.f259604h) + C52418a.m58681h(6, this.f259605i) + C52418a.m58681h(7, this.f259606j) + C52418a.m58681h(8, this.f259607n) + C52418a.m58681h(9, this.f259608o) + C52418a.m58681h(10, this.f259609p) + C52418a.m58681h(11, this.f259610q);
        } else {
            if (i2 == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            } else if (i2 != 3) {
                return -1;
            } else {
                C102122a aVar3 = objArr[0];
                C90420iq iqVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        iqVar.f259600d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        iqVar.f259601e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        iqVar.f259602f = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        iqVar.f259603g = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        iqVar.f259604h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        iqVar.f259605i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        iqVar.f259606j = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        iqVar.f259607n = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        iqVar.f259608o = aVar3.mo141631i(intValue);
                        return 0;
                    case 10:
                        iqVar.f259609p = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        iqVar.f259610q = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
