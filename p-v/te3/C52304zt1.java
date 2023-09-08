package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zt1 */
public class C52304zt1 extends C47465a {

    /* renamed from: d */
    public int f146213d;

    /* renamed from: e */
    public int f146214e;

    /* renamed from: f */
    public int f146215f;

    /* renamed from: g */
    public String f146216g;

    /* renamed from: h */
    public String f146217h;

    /* renamed from: i */
    public int f146218i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52304zt1)) {
            return false;
        }
        C52304zt1 zt12 = (C52304zt1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146213d), Integer.valueOf(zt12.f146213d)) && C46238a.m51546a(Integer.valueOf(this.f146214e), Integer.valueOf(zt12.f146214e)) && C46238a.m51546a(Integer.valueOf(this.f146215f), Integer.valueOf(zt12.f146215f)) && C46238a.m51546a(this.f146216g, zt12.f146216g) && C46238a.m51546a(this.f146217h, zt12.f146217h) && C46238a.m51546a(Integer.valueOf(this.f146218i), Integer.valueOf(zt12.f146218i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146213d);
            aVar.mo74318e(2, this.f146214e);
            aVar.mo74318e(3, this.f146215f);
            String str = this.f146216g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f146217h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(10, this.f146218i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146213d) + 0 + C52418a.m58678e(2, this.f146214e) + C52418a.m58678e(3, this.f146215f);
            String str3 = this.f146216g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f146217h;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(10, this.f146218i);
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
            C52304zt1 zt12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zt12.f146213d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                zt12.f146214e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                zt12.f146215f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                zt12.f146216g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                zt12.f146217h = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 10) {
                return -1;
            } else {
                zt12.f146218i = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
