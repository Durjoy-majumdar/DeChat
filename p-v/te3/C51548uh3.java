package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uh3 */
public class C51548uh3 extends C47465a {

    /* renamed from: d */
    public String f142857d;

    /* renamed from: e */
    public long f142858e;

    /* renamed from: f */
    public int f142859f;

    /* renamed from: g */
    public String f142860g;

    /* renamed from: h */
    public boolean f142861h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51548uh3)) {
            return false;
        }
        C51548uh3 uh32 = (C51548uh3) aVar;
        return C46238a.m51546a(this.f142857d, uh32.f142857d) && C46238a.m51546a(Long.valueOf(this.f142858e), Long.valueOf(uh32.f142858e)) && C46238a.m51546a(Integer.valueOf(this.f142859f), Integer.valueOf(uh32.f142859f)) && C46238a.m51546a(this.f142860g, uh32.f142860g) && C46238a.m51546a(Boolean.valueOf(this.f142861h), Boolean.valueOf(uh32.f142861h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142857d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f142858e);
            aVar.mo74318e(3, this.f142859f);
            String str2 = this.f142860g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.f142861h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f142857d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f142858e) + C52418a.m58678e(3, this.f142859f);
            String str4 = this.f142860g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            return h + C52418a.m58674a(5, this.f142861h);
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
            C51548uh3 uh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uh32.f142857d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                uh32.f142858e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                uh32.f142859f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                uh32.f142860g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                uh32.f142861h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
