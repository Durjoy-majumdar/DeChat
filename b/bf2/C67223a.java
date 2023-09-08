package bf2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.a */
public class C67223a extends C47465a {

    /* renamed from: d */
    public String f193019d;

    /* renamed from: e */
    public String f193020e;

    /* renamed from: f */
    public int f193021f;

    /* renamed from: g */
    public String f193022g;

    /* renamed from: h */
    public String f193023h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67223a)) {
            return false;
        }
        C67223a aVar2 = (C67223a) aVar;
        return C46238a.m51546a(this.f193019d, aVar2.f193019d) && C46238a.m51546a(this.f193020e, aVar2.f193020e) && C46238a.m51546a(Integer.valueOf(this.f193021f), Integer.valueOf(aVar2.f193021f)) && C46238a.m51546a(this.f193022g, aVar2.f193022g) && C46238a.m51546a(this.f193023h, aVar2.f193023h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f193019d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f193020e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f193021f);
            String str3 = this.f193022g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f193023h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f193019d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f193020e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f193021f);
            String str7 = this.f193022g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f193023h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C67223a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aVar4.f193019d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                aVar4.f193020e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                aVar4.f193021f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                aVar4.f193022g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                aVar4.f193023h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
