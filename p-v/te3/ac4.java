package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ac4 extends C47465a {

    /* renamed from: d */
    public long f130433d;

    /* renamed from: e */
    public int f130434e;

    /* renamed from: f */
    public int f130435f;

    /* renamed from: g */
    public boolean f130436g;

    /* renamed from: h */
    public LinkedList<String> f130437h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<String> f130438i = new LinkedList<>();

    /* renamed from: j */
    public String f130439j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ac4)) {
            return false;
        }
        ac4 ac4 = (ac4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f130433d), Long.valueOf(ac4.f130433d)) && C46238a.m51546a(Integer.valueOf(this.f130434e), Integer.valueOf(ac4.f130434e)) && C46238a.m51546a(Integer.valueOf(this.f130435f), Integer.valueOf(ac4.f130435f)) && C46238a.m51546a(Boolean.valueOf(this.f130436g), Boolean.valueOf(ac4.f130436g)) && C46238a.m51546a(this.f130437h, ac4.f130437h) && C46238a.m51546a(this.f130438i, ac4.f130438i) && C46238a.m51546a(this.f130439j, ac4.f130439j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f130433d);
            aVar.mo74318e(2, this.f130434e);
            aVar.mo74318e(3, this.f130435f);
            aVar.mo74314a(4, this.f130436g);
            aVar.mo74320g(5, 1, this.f130437h);
            aVar.mo74320g(6, 1, this.f130438i);
            String str = this.f130439j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f130433d) + 0 + C52418a.m58678e(2, this.f130434e) + C52418a.m58678e(3, this.f130435f) + C52418a.m58674a(4, this.f130436g) + C52418a.m58680g(5, 1, this.f130437h) + C52418a.m58680g(6, 1, this.f130438i);
            String str2 = this.f130439j;
            return str2 != null ? h + C52418a.m58683j(7, str2) : h;
        } else if (i == 2) {
            this.f130437h.clear();
            this.f130438i.clear();
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
            ac4 ac4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ac4.f130433d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ac4.f130434e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ac4.f130435f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ac4.f130436g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    ac4.f130437h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    ac4.f130438i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    ac4.f130439j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
