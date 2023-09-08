package qh0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: qh0.a */
public class C62619a extends C47465a {

    /* renamed from: d */
    public String f177829d;

    /* renamed from: e */
    public long f177830e;

    /* renamed from: f */
    public long f177831f;

    /* renamed from: g */
    public long f177832g;

    /* renamed from: h */
    public long f177833h;

    /* renamed from: i */
    public long f177834i;

    /* renamed from: j */
    public long f177835j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62619a)) {
            return false;
        }
        C62619a aVar2 = (C62619a) aVar;
        return C46238a.m51546a(this.f177829d, aVar2.f177829d) && C46238a.m51546a(Long.valueOf(this.f177830e), Long.valueOf(aVar2.f177830e)) && C46238a.m51546a(Long.valueOf(this.f177831f), Long.valueOf(aVar2.f177831f)) && C46238a.m51546a(Long.valueOf(this.f177832g), Long.valueOf(aVar2.f177832g)) && C46238a.m51546a(Long.valueOf(this.f177833h), Long.valueOf(aVar2.f177833h)) && C46238a.m51546a(Long.valueOf(this.f177834i), Long.valueOf(aVar2.f177834i)) && C46238a.m51546a(Long.valueOf(this.f177835j), Long.valueOf(aVar2.f177835j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f177829d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(4, this.f177830e);
            aVar.mo74321h(5, this.f177831f);
            aVar.mo74321h(6, this.f177832g);
            aVar.mo74321h(7, this.f177833h);
            aVar.mo74321h(8, this.f177834i);
            aVar.mo74321h(9, this.f177835j);
            return 0;
        } else if (i == 1) {
            String str2 = this.f177829d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(4, this.f177830e) + C52418a.m58681h(5, this.f177831f) + C52418a.m58681h(6, this.f177832g) + C52418a.m58681h(7, this.f177833h) + C52418a.m58681h(8, this.f177834i) + C52418a.m58681h(9, this.f177835j);
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
            C62619a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                switch (intValue) {
                    case 4:
                        aVar4.f177830e = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        aVar4.f177831f = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        aVar4.f177832g = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        aVar4.f177833h = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        aVar4.f177834i = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        aVar4.f177835j = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                aVar4.f177829d = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
