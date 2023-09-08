package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hi0 */
public class C64423hi0 extends C47465a {

    /* renamed from: d */
    public long f183493d;

    /* renamed from: e */
    public long f183494e;

    /* renamed from: f */
    public long f183495f;

    /* renamed from: g */
    public long f183496g;

    /* renamed from: h */
    public String f183497h;

    /* renamed from: i */
    public String f183498i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64423hi0)) {
            return false;
        }
        C64423hi0 hi02 = (C64423hi0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183493d), Long.valueOf(hi02.f183493d)) && C46238a.m51546a(Long.valueOf(this.f183494e), Long.valueOf(hi02.f183494e)) && C46238a.m51546a(Long.valueOf(this.f183495f), Long.valueOf(hi02.f183495f)) && C46238a.m51546a(Long.valueOf(this.f183496g), Long.valueOf(hi02.f183496g)) && C46238a.m51546a(this.f183497h, hi02.f183497h) && C46238a.m51546a(this.f183498i, hi02.f183498i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183493d);
            aVar.mo74321h(2, this.f183494e);
            aVar.mo74321h(3, this.f183495f);
            aVar.mo74321h(4, this.f183496g);
            String str = this.f183497h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f183498i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f183493d) + 0 + C52418a.m58681h(2, this.f183494e) + C52418a.m58681h(3, this.f183495f) + C52418a.m58681h(4, this.f183496g);
            String str3 = this.f183497h;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            String str4 = this.f183498i;
            return str4 != null ? h + C52418a.m58683j(6, str4) : h;
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
            C64423hi0 hi02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hi02.f183493d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    hi02.f183494e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    hi02.f183495f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    hi02.f183496g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    hi02.f183497h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hi02.f183498i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
