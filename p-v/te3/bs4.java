package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bs4 extends C47465a {

    /* renamed from: d */
    public String f131293d;

    /* renamed from: e */
    public long f131294e;

    /* renamed from: f */
    public String f131295f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bs4)) {
            return false;
        }
        bs4 bs4 = (bs4) aVar;
        return C46238a.m51546a(this.f131293d, bs4.f131293d) && C46238a.m51546a(Long.valueOf(this.f131294e), Long.valueOf(bs4.f131294e)) && C46238a.m51546a(this.f131295f, bs4.f131295f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131293d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f131294e);
            String str2 = this.f131295f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f131293d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f131294e);
            String str4 = this.f131295f;
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
            bs4 bs4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bs4.f131293d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                bs4.f131294e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bs4.f131295f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
