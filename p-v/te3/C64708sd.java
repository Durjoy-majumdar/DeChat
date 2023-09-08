package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sd */
public class C64708sd extends C47465a {

    /* renamed from: d */
    public String f185413d;

    /* renamed from: e */
    public String f185414e;

    /* renamed from: f */
    public String f185415f;

    /* renamed from: g */
    public String f185416g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64708sd)) {
            return false;
        }
        C64708sd sdVar = (C64708sd) aVar;
        return C46238a.m51546a(this.f185413d, sdVar.f185413d) && C46238a.m51546a(this.f185414e, sdVar.f185414e) && C46238a.m51546a(this.f185415f, sdVar.f185415f) && C46238a.m51546a(this.f185416g, sdVar.f185416g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185413d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185414e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185415f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f185416g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f185413d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f185414e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f185415f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f185416g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C64708sd sdVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sdVar.f185413d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                sdVar.f185414e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                sdVar.f185415f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                sdVar.f185416g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
