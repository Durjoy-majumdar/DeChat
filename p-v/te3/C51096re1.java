package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.re1 */
public class C51096re1 extends C47465a {

    /* renamed from: d */
    public long f140853d;

    /* renamed from: e */
    public int f140854e;

    /* renamed from: f */
    public LinkedList<Integer> f140855f = new LinkedList<>();

    /* renamed from: g */
    public int f140856g;

    /* renamed from: h */
    public long f140857h;

    /* renamed from: i */
    public long f140858i;

    /* renamed from: j */
    public int f140859j;

    /* renamed from: n */
    public boolean f140860n;

    /* renamed from: o */
    public float f140861o;

    /* renamed from: p */
    public float f140862p;

    /* renamed from: q */
    public long f140863q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51096re1)) {
            return false;
        }
        C51096re1 re12 = (C51096re1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140853d), Long.valueOf(re12.f140853d)) && C46238a.m51546a(Integer.valueOf(this.f140854e), Integer.valueOf(re12.f140854e)) && C46238a.m51546a(this.f140855f, re12.f140855f) && C46238a.m51546a(Integer.valueOf(this.f140856g), Integer.valueOf(re12.f140856g)) && C46238a.m51546a(Long.valueOf(this.f140857h), Long.valueOf(re12.f140857h)) && C46238a.m51546a(Long.valueOf(this.f140858i), Long.valueOf(re12.f140858i)) && C46238a.m51546a(Integer.valueOf(this.f140859j), Integer.valueOf(re12.f140859j)) && C46238a.m51546a(Boolean.valueOf(this.f140860n), Boolean.valueOf(re12.f140860n)) && C46238a.m51546a(Float.valueOf(this.f140861o), Float.valueOf(re12.f140861o)) && C46238a.m51546a(Float.valueOf(this.f140862p), Float.valueOf(re12.f140862p)) && C46238a.m51546a(Long.valueOf(this.f140863q), Long.valueOf(re12.f140863q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140853d);
            aVar.mo74318e(2, this.f140854e);
            aVar.mo74320g(3, 2, this.f140855f);
            aVar.mo74318e(4, this.f140856g);
            aVar.mo74321h(5, this.f140857h);
            aVar.mo74321h(6, this.f140858i);
            aVar.mo74318e(7, this.f140859j);
            aVar.mo74314a(8, this.f140860n);
            aVar.mo74317d(9, this.f140861o);
            aVar.mo74317d(10, this.f140862p);
            aVar.mo74321h(11, this.f140863q);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58681h(1, this.f140853d) + 0 + C52418a.m58678e(2, this.f140854e) + C52418a.m58680g(3, 2, this.f140855f) + C52418a.m58678e(4, this.f140856g) + C52418a.m58681h(5, this.f140857h) + C52418a.m58681h(6, this.f140858i) + C52418a.m58678e(7, this.f140859j) + C52418a.m58674a(8, this.f140860n) + C52418a.m58677d(9, this.f140861o) + C52418a.m58677d(10, this.f140862p) + C52418a.m58681h(11, this.f140863q);
        } else {
            if (i2 == 2) {
                this.f140855f.clear();
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
                C51096re1 re12 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        re12.f140853d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        re12.f140854e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        re12.f140855f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 4:
                        re12.f140856g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        re12.f140857h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        re12.f140858i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        re12.f140859j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        re12.f140860n = aVar3.mo141625c(intValue);
                        return 0;
                    case 9:
                        re12.f140861o = aVar3.mo141628f(intValue);
                        return 0;
                    case 10:
                        re12.f140862p = aVar3.mo141628f(intValue);
                        return 0;
                    case 11:
                        re12.f140863q = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
