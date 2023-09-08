package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z41 */
public class C52215z41 extends C47465a {

    /* renamed from: d */
    public int f145686d;

    /* renamed from: e */
    public String f145687e;

    /* renamed from: f */
    public String f145688f;

    /* renamed from: g */
    public int f145689g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52215z41)) {
            return false;
        }
        C52215z41 z412 = (C52215z41) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145686d), Integer.valueOf(z412.f145686d)) && C46238a.m51546a(this.f145687e, z412.f145687e) && C46238a.m51546a(this.f145688f, z412.f145688f) && C46238a.m51546a(Integer.valueOf(this.f145689g), Integer.valueOf(z412.f145689g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145686d);
            String str = this.f145687e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145688f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f145689g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145686d) + 0;
            String str3 = this.f145687e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f145688f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f145689g);
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
            C52215z41 z412 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z412.f145686d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                z412.f145687e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                z412.f145688f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                z412.f145689g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
