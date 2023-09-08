package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rf */
public class C51098rf extends C47465a {

    /* renamed from: d */
    public int f140871d;

    /* renamed from: e */
    public int f140872e;

    /* renamed from: f */
    public String f140873f;

    /* renamed from: g */
    public String f140874g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51098rf)) {
            return false;
        }
        C51098rf rfVar = (C51098rf) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140871d), Integer.valueOf(rfVar.f140871d)) && C46238a.m51546a(Integer.valueOf(this.f140872e), Integer.valueOf(rfVar.f140872e)) && C46238a.m51546a(this.f140873f, rfVar.f140873f) && C46238a.m51546a(this.f140874g, rfVar.f140874g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140871d);
            aVar.mo74318e(2, this.f140872e);
            String str = this.f140873f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f140874g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140871d) + 0 + C52418a.m58678e(2, this.f140872e);
            String str3 = this.f140873f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140874g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C51098rf rfVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rfVar.f140871d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                rfVar.f140872e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                rfVar.f140873f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                rfVar.f140874g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
