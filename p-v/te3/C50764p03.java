package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p03 */
public class C50764p03 extends C47465a {

    /* renamed from: d */
    public long f139483d;

    /* renamed from: e */
    public String f139484e;

    /* renamed from: f */
    public long f139485f;

    /* renamed from: g */
    public String f139486g;

    /* renamed from: h */
    public String f139487h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50764p03)) {
            return false;
        }
        C50764p03 p032 = (C50764p03) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139483d), Long.valueOf(p032.f139483d)) && C46238a.m51546a(this.f139484e, p032.f139484e) && C46238a.m51546a(Long.valueOf(this.f139485f), Long.valueOf(p032.f139485f)) && C46238a.m51546a(this.f139486g, p032.f139486g) && C46238a.m51546a(this.f139487h, p032.f139487h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139483d);
            String str = this.f139484e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f139485f);
            String str2 = this.f139486g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f139487h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139483d) + 0;
            String str4 = this.f139484e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int h2 = h + C52418a.m58681h(3, this.f139485f);
            String str5 = this.f139486g;
            if (str5 != null) {
                h2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f139487h;
            return str6 != null ? h2 + C52418a.m58683j(5, str6) : h2;
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
            C50764p03 p032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p032.f139483d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                p032.f139484e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                p032.f139485f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                p032.f139486g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                p032.f139487h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
