package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r10 */
public class C51043r10 extends C47465a {

    /* renamed from: d */
    public int f140656d;

    /* renamed from: e */
    public String f140657e;

    /* renamed from: f */
    public String f140658f;

    /* renamed from: g */
    public String f140659g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51043r10)) {
            return false;
        }
        C51043r10 r102 = (C51043r10) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140656d), Integer.valueOf(r102.f140656d)) && C46238a.m51546a(this.f140657e, r102.f140657e) && C46238a.m51546a(this.f140658f, r102.f140658f) && C46238a.m51546a(this.f140659g, r102.f140659g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140656d);
            String str = this.f140657e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140658f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f140659g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140656d) + 0;
            String str4 = this.f140657e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f140658f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f140659g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C51043r10 r102 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r102.f140656d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                r102.f140657e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                r102.f140658f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r102.f140659g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
