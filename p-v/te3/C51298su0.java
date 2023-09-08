package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.su0 */
public class C51298su0 extends C47465a {

    /* renamed from: d */
    public long f141754d;

    /* renamed from: e */
    public int f141755e;

    /* renamed from: f */
    public String f141756f;

    /* renamed from: g */
    public int f141757g;

    /* renamed from: h */
    public String f141758h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51298su0)) {
            return false;
        }
        C51298su0 su02 = (C51298su0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f141754d), Long.valueOf(su02.f141754d)) && C46238a.m51546a(Integer.valueOf(this.f141755e), Integer.valueOf(su02.f141755e)) && C46238a.m51546a(this.f141756f, su02.f141756f) && C46238a.m51546a(Integer.valueOf(this.f141757g), Integer.valueOf(su02.f141757g)) && C46238a.m51546a(this.f141758h, su02.f141758h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f141754d);
            aVar.mo74318e(2, this.f141755e);
            String str = this.f141756f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f141757g);
            String str2 = this.f141758h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f141754d) + 0 + C52418a.m58678e(2, this.f141755e);
            String str3 = this.f141756f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int e = h + C52418a.m58678e(4, this.f141757g);
            String str4 = this.f141758h;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C51298su0 su02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                su02.f141754d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                su02.f141755e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                su02.f141756f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                su02.f141757g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                su02.f141758h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
