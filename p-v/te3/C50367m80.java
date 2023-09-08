package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m80 */
public class C50367m80 extends C47465a {

    /* renamed from: d */
    public String f137899d;

    /* renamed from: e */
    public String f137900e;

    /* renamed from: f */
    public String f137901f;

    /* renamed from: g */
    public String f137902g;

    /* renamed from: h */
    public String f137903h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50367m80)) {
            return false;
        }
        C50367m80 m802 = (C50367m80) aVar;
        return C46238a.m51546a(this.f137899d, m802.f137899d) && C46238a.m51546a(this.f137900e, m802.f137900e) && C46238a.m51546a(this.f137901f, m802.f137901f) && C46238a.m51546a(this.f137902g, m802.f137902g) && C46238a.m51546a(this.f137903h, m802.f137903h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137899d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137900e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137901f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f137902g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f137903h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f137899d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f137900e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f137901f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f137902g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f137903h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C50367m80 m802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m802.f137899d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                m802.f137900e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m802.f137901f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                m802.f137902g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                m802.f137903h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
