package uc0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uc0.v */
public class C111157v extends C47465a {

    /* renamed from: d */
    public String f332917d;

    /* renamed from: e */
    public int f332918e;

    /* renamed from: f */
    public int f332919f;

    /* renamed from: g */
    public int f332920g;

    /* renamed from: h */
    public int f332921h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C111157v)) {
            return false;
        }
        C111157v vVar = (C111157v) aVar;
        return C46238a.m51546a(this.f332917d, vVar.f332917d) && C46238a.m51546a(Integer.valueOf(this.f332918e), Integer.valueOf(vVar.f332918e)) && C46238a.m51546a(Integer.valueOf(this.f332919f), Integer.valueOf(vVar.f332919f)) && C46238a.m51546a(Integer.valueOf(this.f332920g), Integer.valueOf(vVar.f332920g)) && C46238a.m51546a(Integer.valueOf(this.f332921h), Integer.valueOf(vVar.f332921h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332917d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f332918e);
            aVar.mo74318e(3, this.f332919f);
            aVar.mo74318e(4, this.f332920g);
            aVar.mo74318e(5, this.f332921h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f332917d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f332918e) + C52418a.m58678e(3, this.f332919f) + C52418a.m58678e(4, this.f332920g) + C52418a.m58678e(5, this.f332921h);
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
            C111157v vVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vVar.f332917d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vVar.f332918e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                vVar.f332919f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                vVar.f332920g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vVar.f332921h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
