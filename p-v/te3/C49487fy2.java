package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fy2 */
public class C49487fy2 extends C47465a {

    /* renamed from: d */
    public String f133742d;

    /* renamed from: e */
    public String f133743e;

    /* renamed from: f */
    public int f133744f;

    /* renamed from: g */
    public int f133745g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49487fy2)) {
            return false;
        }
        C49487fy2 fy22 = (C49487fy2) aVar;
        return C46238a.m51546a(this.f133742d, fy22.f133742d) && C46238a.m51546a(this.f133743e, fy22.f133743e) && C46238a.m51546a(Integer.valueOf(this.f133744f), Integer.valueOf(fy22.f133744f)) && C46238a.m51546a(Integer.valueOf(this.f133745g), Integer.valueOf(fy22.f133745g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133742d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133743e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f133744f);
            aVar.mo74318e(4, this.f133745g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f133742d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f133743e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f133744f) + C52418a.m58678e(4, this.f133745g);
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
            C49487fy2 fy22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fy22.f133742d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                fy22.f133743e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                fy22.f133744f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                fy22.f133745g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
