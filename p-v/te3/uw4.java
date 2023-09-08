package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uw4 extends C47465a {

    /* renamed from: d */
    public String f185803d;

    /* renamed from: e */
    public String f185804e;

    /* renamed from: f */
    public String f185805f;

    /* renamed from: g */
    public long f185806g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uw4)) {
            return false;
        }
        uw4 uw4 = (uw4) aVar;
        return C46238a.m51546a(this.f185803d, uw4.f185803d) && C46238a.m51546a(this.f185804e, uw4.f185804e) && C46238a.m51546a(this.f185805f, uw4.f185805f) && C46238a.m51546a(Long.valueOf(this.f185806g), Long.valueOf(uw4.f185806g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185803d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185804e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185805f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f185806g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f185803d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185804e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f185805f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f185806g);
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
            uw4 uw4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uw4.f185803d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                uw4.f185804e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                uw4.f185805f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                uw4.f185806g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
