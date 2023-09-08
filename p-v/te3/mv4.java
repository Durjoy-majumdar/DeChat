package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mv4 extends C47465a {

    /* renamed from: d */
    public int f332178d;

    /* renamed from: e */
    public int f332179e;

    /* renamed from: f */
    public int f332180f;

    /* renamed from: g */
    public String f332181g;

    /* renamed from: h */
    public String f332182h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mv4)) {
            return false;
        }
        mv4 mv4 = (mv4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f332178d), Integer.valueOf(mv4.f332178d)) && C46238a.m51546a(Integer.valueOf(this.f332179e), Integer.valueOf(mv4.f332179e)) && C46238a.m51546a(Integer.valueOf(this.f332180f), Integer.valueOf(mv4.f332180f)) && C46238a.m51546a(this.f332181g, mv4.f332181g) && C46238a.m51546a(this.f332182h, mv4.f332182h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f332178d);
            aVar.mo74318e(2, this.f332179e);
            aVar.mo74318e(3, this.f332180f);
            String str = this.f332181g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f332182h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f332178d) + 0 + C52418a.m58678e(2, this.f332179e) + C52418a.m58678e(3, this.f332180f);
            String str3 = this.f332181g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f332182h;
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
            mv4 mv4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mv4.f332178d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                mv4.f332179e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                mv4.f332180f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mv4.f332181g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mv4.f332182h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
