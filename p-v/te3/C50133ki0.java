package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ki0 */
public class C50133ki0 extends C47465a {

    /* renamed from: d */
    public long f136801d;

    /* renamed from: e */
    public String f136802e;

    /* renamed from: f */
    public String f136803f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50133ki0)) {
            return false;
        }
        C50133ki0 ki02 = (C50133ki0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136801d), Long.valueOf(ki02.f136801d)) && C46238a.m51546a(this.f136802e, ki02.f136802e) && C46238a.m51546a(this.f136803f, ki02.f136803f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136801d);
            String str = this.f136802e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136803f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f136801d) + 0;
            String str3 = this.f136802e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            String str4 = this.f136803f;
            return str4 != null ? h + C52418a.m58683j(3, str4) : h;
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
            C50133ki0 ki02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ki02.f136801d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                ki02.f136802e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ki02.f136803f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
