package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.li1 */
public class C50267li1 extends C47465a {

    /* renamed from: d */
    public String f137436d;

    /* renamed from: e */
    public LinkedList<Integer> f137437e = new LinkedList<>();

    /* renamed from: f */
    public String f137438f;

    /* renamed from: g */
    public String f137439g;

    /* renamed from: h */
    public String f137440h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50267li1)) {
            return false;
        }
        C50267li1 li12 = (C50267li1) aVar;
        return C46238a.m51546a(this.f137436d, li12.f137436d) && C46238a.m51546a(this.f137437e, li12.f137437e) && C46238a.m51546a(this.f137438f, li12.f137438f) && C46238a.m51546a(this.f137439g, li12.f137439g) && C46238a.m51546a(this.f137440h, li12.f137440h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137436d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 2, this.f137437e);
            String str2 = this.f137438f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f137439g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f137440h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f137436d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int g = i2 + C52418a.m58680g(2, 2, this.f137437e);
            String str6 = this.f137438f;
            if (str6 != null) {
                g += C52418a.m58683j(3, str6);
            }
            String str7 = this.f137439g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f137440h;
            return str8 != null ? g + C52418a.m58683j(5, str8) : g;
        } else if (i == 2) {
            this.f137437e.clear();
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
            C50267li1 li12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                li12.f137436d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                li12.f137437e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 3) {
                li12.f137438f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                li12.f137439g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                li12.f137440h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
