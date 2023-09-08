package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e75 extends C47465a {

    /* renamed from: d */
    public int f132766d;

    /* renamed from: e */
    public int f132767e;

    /* renamed from: f */
    public int f132768f;

    /* renamed from: g */
    public int f132769g;

    /* renamed from: h */
    public String f132770h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e75)) {
            return false;
        }
        e75 e75 = (e75) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132766d), Integer.valueOf(e75.f132766d)) && C46238a.m51546a(Integer.valueOf(this.f132767e), Integer.valueOf(e75.f132767e)) && C46238a.m51546a(Integer.valueOf(this.f132768f), Integer.valueOf(e75.f132768f)) && C46238a.m51546a(Integer.valueOf(this.f132769g), Integer.valueOf(e75.f132769g)) && C46238a.m51546a(this.f132770h, e75.f132770h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132766d);
            aVar.mo74318e(2, this.f132767e);
            aVar.mo74318e(3, this.f132768f);
            aVar.mo74318e(4, this.f132769g);
            String str = this.f132770h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132766d) + 0 + C52418a.m58678e(2, this.f132767e) + C52418a.m58678e(3, this.f132768f) + C52418a.m58678e(4, this.f132769g);
            String str2 = this.f132770h;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
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
            e75 e75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e75.f132766d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                e75.f132767e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                e75.f132768f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                e75.f132769g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                e75.f132770h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
