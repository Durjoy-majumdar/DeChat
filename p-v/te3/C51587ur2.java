package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ur2 */
public class C51587ur2 extends C47465a {

    /* renamed from: d */
    public String f143042d;

    /* renamed from: e */
    public String f143043e;

    /* renamed from: f */
    public String f143044f;

    /* renamed from: g */
    public long f143045g;

    /* renamed from: h */
    public long f143046h;

    /* renamed from: i */
    public long f143047i;

    /* renamed from: j */
    public boolean f143048j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51587ur2)) {
            return false;
        }
        C51587ur2 ur22 = (C51587ur2) aVar;
        return C46238a.m51546a(this.f143042d, ur22.f143042d) && C46238a.m51546a(this.f143043e, ur22.f143043e) && C46238a.m51546a(this.f143044f, ur22.f143044f) && C46238a.m51546a(Long.valueOf(this.f143045g), Long.valueOf(ur22.f143045g)) && C46238a.m51546a(Long.valueOf(this.f143046h), Long.valueOf(ur22.f143046h)) && C46238a.m51546a(Long.valueOf(this.f143047i), Long.valueOf(ur22.f143047i)) && C46238a.m51546a(Boolean.valueOf(this.f143048j), Boolean.valueOf(ur22.f143048j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143042d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143043e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143044f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f143045g);
            aVar.mo74321h(5, this.f143046h);
            aVar.mo74321h(6, this.f143047i);
            aVar.mo74314a(7, this.f143048j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f143042d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f143043e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143044f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f143045g) + C52418a.m58681h(5, this.f143046h) + C52418a.m58681h(6, this.f143047i) + C52418a.m58674a(7, this.f143048j);
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
            C51587ur2 ur22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ur22.f143042d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ur22.f143043e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ur22.f143044f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ur22.f143045g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ur22.f143046h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ur22.f143047i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ur22.f143048j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
