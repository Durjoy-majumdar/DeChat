package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ii4 extends C47465a {

    /* renamed from: d */
    public double f354055d;

    /* renamed from: e */
    public double f354056e;

    /* renamed from: f */
    public String f354057f;

    /* renamed from: g */
    public String f354058g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ii4)) {
            return false;
        }
        ii4 ii4 = (ii4) aVar;
        return C46238a.m51546a(Double.valueOf(this.f354055d), Double.valueOf(ii4.f354055d)) && C46238a.m51546a(Double.valueOf(this.f354056e), Double.valueOf(ii4.f354056e)) && C46238a.m51546a(this.f354057f, ii4.f354057f) && C46238a.m51546a(this.f354058g, ii4.f354058g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f354055d);
            aVar.mo74316c(2, this.f354056e);
            String str = this.f354057f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f354058g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int c = C52418a.m58676c(1, this.f354055d) + 0 + C52418a.m58676c(2, this.f354056e);
            String str3 = this.f354057f;
            if (str3 != null) {
                c += C52418a.m58683j(3, str3);
            }
            String str4 = this.f354058g;
            return str4 != null ? c + C52418a.m58683j(4, str4) : c;
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
            ii4 ii4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ii4.f354055d = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue == 2) {
                ii4.f354056e = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue == 3) {
                ii4.f354057f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ii4.f354058g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
