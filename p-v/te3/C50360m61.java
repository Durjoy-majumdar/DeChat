package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m61 */
public class C50360m61 extends C47465a {

    /* renamed from: d */
    public boolean f137874d;

    /* renamed from: e */
    public String f137875e;

    /* renamed from: f */
    public String f137876f;

    /* renamed from: g */
    public int f137877g;

    /* renamed from: h */
    public String f137878h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50360m61)) {
            return false;
        }
        C50360m61 m612 = (C50360m61) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f137874d), Boolean.valueOf(m612.f137874d)) && C46238a.m51546a(this.f137875e, m612.f137875e) && C46238a.m51546a(this.f137876f, m612.f137876f) && C46238a.m51546a(Integer.valueOf(this.f137877g), Integer.valueOf(m612.f137877g)) && C46238a.m51546a(this.f137878h, m612.f137878h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f137874d);
            String str = this.f137875e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f137876f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f137877g);
            String str3 = this.f137878h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f137874d) + 0;
            String str4 = this.f137875e;
            if (str4 != null) {
                a += C52418a.m58683j(2, str4);
            }
            String str5 = this.f137876f;
            if (str5 != null) {
                a += C52418a.m58683j(3, str5);
            }
            int e = a + C52418a.m58678e(4, this.f137877g);
            String str6 = this.f137878h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C50360m61 m612 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m612.f137874d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                m612.f137875e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m612.f137876f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                m612.f137877g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                m612.f137878h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
