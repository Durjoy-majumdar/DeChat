package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jg2 */
public class C77952jg2 extends C47465a {

    /* renamed from: d */
    public long f227664d;

    /* renamed from: e */
    public String f227665e;

    /* renamed from: f */
    public boolean f227666f;

    /* renamed from: g */
    public long f227667g;

    /* renamed from: h */
    public String f227668h;

    /* renamed from: i */
    public String f227669i;

    /* renamed from: j */
    public int f227670j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77952jg2)) {
            return false;
        }
        C77952jg2 jg22 = (C77952jg2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f227664d), Long.valueOf(jg22.f227664d)) && C46238a.m51546a(this.f227665e, jg22.f227665e) && C46238a.m51546a(Boolean.valueOf(this.f227666f), Boolean.valueOf(jg22.f227666f)) && C46238a.m51546a(Long.valueOf(this.f227667g), Long.valueOf(jg22.f227667g)) && C46238a.m51546a(this.f227668h, jg22.f227668h) && C46238a.m51546a(this.f227669i, jg22.f227669i) && C46238a.m51546a(Integer.valueOf(this.f227670j), Integer.valueOf(jg22.f227670j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f227664d);
            String str = this.f227665e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f227666f);
            aVar.mo74321h(4, this.f227667g);
            String str2 = this.f227668h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f227669i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f227670j);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f227664d) + 0;
            String str4 = this.f227665e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int a = h + C52418a.m58674a(3, this.f227666f) + C52418a.m58681h(4, this.f227667g);
            String str5 = this.f227668h;
            if (str5 != null) {
                a += C52418a.m58683j(5, str5);
            }
            String str6 = this.f227669i;
            if (str6 != null) {
                a += C52418a.m58683j(6, str6);
            }
            return a + C52418a.m58678e(7, this.f227670j);
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
            C77952jg2 jg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jg22.f227664d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    jg22.f227665e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jg22.f227666f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    jg22.f227667g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    jg22.f227668h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jg22.f227669i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jg22.f227670j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
