package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u21 */
public class C51483u21 extends C47465a {

    /* renamed from: d */
    public int f142563d;

    /* renamed from: e */
    public String f142564e;

    /* renamed from: f */
    public String f142565f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51483u21)) {
            return false;
        }
        C51483u21 u212 = (C51483u21) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142563d), Integer.valueOf(u212.f142563d)) && C46238a.m51546a(this.f142564e, u212.f142564e) && C46238a.m51546a(this.f142565f, u212.f142565f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142563d);
            String str = this.f142564e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f142565f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142563d) + 0;
            String str3 = this.f142564e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f142565f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C51483u21 u212 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u212.f142563d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                u212.f142564e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                u212.f142565f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
