package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vd0 */
public class C51681vd0 extends C47465a {

    /* renamed from: d */
    public String f143434d;

    /* renamed from: e */
    public String f143435e;

    /* renamed from: f */
    public int f143436f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51681vd0)) {
            return false;
        }
        C51681vd0 vd02 = (C51681vd0) aVar;
        return C46238a.m51546a(this.f143434d, vd02.f143434d) && C46238a.m51546a(this.f143435e, vd02.f143435e) && C46238a.m51546a(Integer.valueOf(this.f143436f), Integer.valueOf(vd02.f143436f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143434d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: tagName");
            } else if (this.f143435e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f143435e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f143436f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: tagPinYin");
            }
        } else if (i == 1) {
            String str3 = this.f143434d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f143435e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f143436f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143434d == null) {
                throw new C52419b("Not all required fields were included: tagName");
            } else if (this.f143435e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: tagPinYin");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51681vd0 vd02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vd02.f143434d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vd02.f143435e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vd02.f143436f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
