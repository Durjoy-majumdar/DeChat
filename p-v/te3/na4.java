package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class na4 extends C47465a {

    /* renamed from: d */
    public String f138516d;

    /* renamed from: e */
    public String f138517e;

    /* renamed from: f */
    public int f138518f;

    /* renamed from: g */
    public boolean f138519g;

    /* renamed from: h */
    public boolean f138520h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof na4)) {
            return false;
        }
        na4 na4 = (na4) aVar;
        return C46238a.m51546a(this.f138516d, na4.f138516d) && C46238a.m51546a(this.f138517e, na4.f138517e) && C46238a.m51546a(Integer.valueOf(this.f138518f), Integer.valueOf(na4.f138518f)) && C46238a.m51546a(Boolean.valueOf(this.f138519g), Boolean.valueOf(na4.f138519g)) && C46238a.m51546a(Boolean.valueOf(this.f138520h), Boolean.valueOf(na4.f138520h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138516d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138517e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f138518f);
            aVar.mo74314a(4, this.f138519g);
            aVar.mo74314a(5, this.f138520h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f138516d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138517e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f138518f) + C52418a.m58674a(4, this.f138519g) + C52418a.m58674a(5, this.f138520h);
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
            na4 na4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                na4.f138516d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                na4.f138517e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                na4.f138518f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                na4.f138519g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                na4.f138520h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
