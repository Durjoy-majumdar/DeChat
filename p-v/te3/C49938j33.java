package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j33 */
public class C49938j33 extends C47465a {

    /* renamed from: d */
    public String f135845d;

    /* renamed from: e */
    public String f135846e;

    /* renamed from: f */
    public int f135847f;

    /* renamed from: g */
    public int f135848g;

    /* renamed from: h */
    public long f135849h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49938j33)) {
            return false;
        }
        C49938j33 j332 = (C49938j33) aVar;
        return C46238a.m51546a(this.f135845d, j332.f135845d) && C46238a.m51546a(this.f135846e, j332.f135846e) && C46238a.m51546a(Integer.valueOf(this.f135847f), Integer.valueOf(j332.f135847f)) && C46238a.m51546a(Integer.valueOf(this.f135848g), Integer.valueOf(j332.f135848g)) && C46238a.m51546a(Long.valueOf(this.f135849h), Long.valueOf(j332.f135849h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135845d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135846e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f135847f);
            aVar.mo74318e(4, this.f135848g);
            aVar.mo74321h(5, this.f135849h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f135845d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f135846e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f135847f) + C52418a.m58678e(4, this.f135848g) + C52418a.m58681h(5, this.f135849h);
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
            C49938j33 j332 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j332.f135845d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                j332.f135846e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                j332.f135847f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                j332.f135848g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                j332.f135849h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
