package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pp4 extends C47465a {

    /* renamed from: d */
    public int f184870d;

    /* renamed from: e */
    public String f184871e;

    /* renamed from: f */
    public String f184872f;

    /* renamed from: g */
    public String f184873g;

    /* renamed from: h */
    public int f184874h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pp4)) {
            return false;
        }
        pp4 pp4 = (pp4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184870d), Integer.valueOf(pp4.f184870d)) && C46238a.m51546a(this.f184871e, pp4.f184871e) && C46238a.m51546a(this.f184872f, pp4.f184872f) && C46238a.m51546a(this.f184873g, pp4.f184873g) && C46238a.m51546a(Integer.valueOf(this.f184874h), Integer.valueOf(pp4.f184874h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184870d);
            String str = this.f184871e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184872f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f184873g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f184874h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184870d) + 0;
            String str4 = this.f184871e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f184872f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f184873g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f184874h);
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
            pp4 pp4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pp4.f184870d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pp4.f184871e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pp4.f184872f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                pp4.f184873g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                pp4.f184874h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
