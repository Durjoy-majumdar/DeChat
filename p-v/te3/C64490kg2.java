package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kg2 */
public class C64490kg2 extends C47465a {

    /* renamed from: d */
    public long f183925d;

    /* renamed from: e */
    public long f183926e;

    /* renamed from: f */
    public String f183927f;

    /* renamed from: g */
    public int f183928g;

    /* renamed from: h */
    public String f183929h;

    /* renamed from: i */
    public String f183930i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64490kg2)) {
            return false;
        }
        C64490kg2 kg22 = (C64490kg2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183925d), Long.valueOf(kg22.f183925d)) && C46238a.m51546a(Long.valueOf(this.f183926e), Long.valueOf(kg22.f183926e)) && C46238a.m51546a(this.f183927f, kg22.f183927f) && C46238a.m51546a(Integer.valueOf(this.f183928g), Integer.valueOf(kg22.f183928g)) && C46238a.m51546a(this.f183929h, kg22.f183929h) && C46238a.m51546a(this.f183930i, kg22.f183930i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183925d);
            aVar.mo74321h(2, this.f183926e);
            String str = this.f183927f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f183928g);
            String str2 = this.f183929h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f183930i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f183925d) + 0 + C52418a.m58681h(2, this.f183926e);
            String str4 = this.f183927f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            int e = h + C52418a.m58678e(4, this.f183928g);
            String str5 = this.f183929h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f183930i;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C64490kg2 kg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kg22.f183925d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    kg22.f183926e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    kg22.f183927f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kg22.f183928g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kg22.f183929h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kg22.f183930i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
