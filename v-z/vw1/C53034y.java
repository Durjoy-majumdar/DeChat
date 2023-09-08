package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.y */
public class C53034y extends C47465a {

    /* renamed from: d */
    public String f148049d;

    /* renamed from: e */
    public int f148050e;

    /* renamed from: f */
    public String f148051f;

    /* renamed from: g */
    public int f148052g;

    /* renamed from: h */
    public int f148053h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53034y)) {
            return false;
        }
        C53034y yVar = (C53034y) aVar;
        return C46238a.m51546a(this.f148049d, yVar.f148049d) && C46238a.m51546a(Integer.valueOf(this.f148050e), Integer.valueOf(yVar.f148050e)) && C46238a.m51546a(this.f148051f, yVar.f148051f) && C46238a.m51546a(Integer.valueOf(this.f148052g), Integer.valueOf(yVar.f148052g)) && C46238a.m51546a(Integer.valueOf(this.f148053h), Integer.valueOf(yVar.f148053h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f148049d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f148050e);
            String str2 = this.f148051f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f148052g);
            aVar.mo74318e(5, this.f148053h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f148049d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f148050e);
            String str4 = this.f148051f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f148052g) + C52418a.m58678e(5, this.f148053h);
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
            C53034y yVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yVar.f148049d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                yVar.f148050e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                yVar.f148051f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                yVar.f148052g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                yVar.f148053h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
