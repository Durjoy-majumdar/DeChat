package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vw3 */
public class C51751vw3 extends C47465a {

    /* renamed from: d */
    public String f143749d;

    /* renamed from: e */
    public String f143750e;

    /* renamed from: f */
    public int f143751f;

    /* renamed from: g */
    public int f143752g;

    /* renamed from: h */
    public int f143753h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51751vw3)) {
            return false;
        }
        C51751vw3 vw32 = (C51751vw3) aVar;
        return C46238a.m51546a(this.f143749d, vw32.f143749d) && C46238a.m51546a(this.f143750e, vw32.f143750e) && C46238a.m51546a(Integer.valueOf(this.f143751f), Integer.valueOf(vw32.f143751f)) && C46238a.m51546a(Integer.valueOf(this.f143752g), Integer.valueOf(vw32.f143752g)) && C46238a.m51546a(Integer.valueOf(this.f143753h), Integer.valueOf(vw32.f143753h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143749d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143750e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f143751f);
            aVar.mo74318e(4, this.f143752g);
            aVar.mo74318e(5, this.f143753h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f143749d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f143750e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f143751f) + C52418a.m58678e(4, this.f143752g) + C52418a.m58678e(5, this.f143753h);
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
            C51751vw3 vw32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vw32.f143749d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vw32.f143750e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vw32.f143751f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                vw32.f143752g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vw32.f143753h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
