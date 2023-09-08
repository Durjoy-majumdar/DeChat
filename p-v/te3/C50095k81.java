package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k81 */
public class C50095k81 extends C47465a {

    /* renamed from: d */
    public long f136610d;

    /* renamed from: e */
    public String f136611e;

    /* renamed from: f */
    public String f136612f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50095k81)) {
            return false;
        }
        C50095k81 k812 = (C50095k81) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136610d), Long.valueOf(k812.f136610d)) && C46238a.m51546a(this.f136611e, k812.f136611e) && C46238a.m51546a(this.f136612f, k812.f136612f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136610d);
            String str = this.f136611e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136612f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f136610d) + 0;
            String str3 = this.f136611e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            String str4 = this.f136612f;
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
            C50095k81 k812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k812.f136610d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                k812.f136611e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                k812.f136612f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
