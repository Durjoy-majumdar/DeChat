package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mr4 extends C47465a {

    /* renamed from: d */
    public String f184392d;

    /* renamed from: e */
    public int f184393e;

    /* renamed from: f */
    public int f184394f;

    /* renamed from: g */
    public int f184395g;

    /* renamed from: h */
    public String f184396h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mr4)) {
            return false;
        }
        mr4 mr4 = (mr4) aVar;
        return C46238a.m51546a(this.f184392d, mr4.f184392d) && C46238a.m51546a(Integer.valueOf(this.f184393e), Integer.valueOf(mr4.f184393e)) && C46238a.m51546a(Integer.valueOf(this.f184394f), Integer.valueOf(mr4.f184394f)) && C46238a.m51546a(Integer.valueOf(this.f184395g), Integer.valueOf(mr4.f184395g)) && C46238a.m51546a(this.f184396h, mr4.f184396h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184392d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f184393e);
            aVar.mo74318e(3, this.f184394f);
            aVar.mo74318e(4, this.f184395g);
            String str2 = this.f184396h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f184392d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f184393e) + C52418a.m58678e(3, this.f184394f) + C52418a.m58678e(4, this.f184395g);
            String str4 = this.f184396h;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            mr4 mr4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mr4.f184392d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                mr4.f184393e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                mr4.f184394f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mr4.f184395g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mr4.f184396h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
