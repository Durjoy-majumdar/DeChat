package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pe4 extends C47465a {

    /* renamed from: d */
    public long f139733d;

    /* renamed from: e */
    public String f139734e;

    /* renamed from: f */
    public LinkedList<String> f139735f = new LinkedList<>();

    /* renamed from: g */
    public String f139736g;

    /* renamed from: h */
    public String f139737h;

    /* renamed from: i */
    public int f139738i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pe4)) {
            return false;
        }
        pe4 pe4 = (pe4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139733d), Long.valueOf(pe4.f139733d)) && C46238a.m51546a(this.f139734e, pe4.f139734e) && C46238a.m51546a(this.f139735f, pe4.f139735f) && C46238a.m51546a(this.f139736g, pe4.f139736g) && C46238a.m51546a(this.f139737h, pe4.f139737h) && C46238a.m51546a(Integer.valueOf(this.f139738i), Integer.valueOf(pe4.f139738i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139733d);
            String str = this.f139734e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f139735f);
            String str2 = this.f139736g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f139737h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f139738i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139733d) + 0;
            String str4 = this.f139734e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int g = h + C52418a.m58680g(3, 1, this.f139735f);
            String str5 = this.f139736g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f139737h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            return g + C52418a.m58678e(6, this.f139738i);
        } else if (i == 2) {
            this.f139735f.clear();
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
            pe4 pe4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pe4.f139733d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    pe4.f139734e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pe4.f139735f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    pe4.f139736g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pe4.f139737h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pe4.f139738i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
