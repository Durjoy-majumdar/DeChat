package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p93 */
public class C90430p93 extends C47465a {

    /* renamed from: d */
    public String f259737d;

    /* renamed from: e */
    public String f259738e;

    /* renamed from: f */
    public String f259739f;

    /* renamed from: g */
    public LinkedList<String> f259740g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90430p93)) {
            return false;
        }
        C90430p93 p932 = (C90430p93) aVar;
        return C46238a.m51546a(this.f259737d, p932.f259737d) && C46238a.m51546a(this.f259738e, p932.f259738e) && C46238a.m51546a(this.f259739f, p932.f259739f) && C46238a.m51546a(this.f259740g, p932.f259740g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259737d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: key");
            } else if (this.f259738e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f259738e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f259739f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74320g(4, 1, this.f259740g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: value");
            }
        } else if (i == 1) {
            String str4 = this.f259737d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f259738e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f259739f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58680g(4, 1, this.f259740g);
        } else if (i == 2) {
            this.f259740g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f259737d == null) {
                throw new C52419b("Not all required fields were included: key");
            } else if (this.f259738e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: value");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90430p93 p932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p932.f259737d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p932.f259738e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                p932.f259739f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                p932.f259740g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
