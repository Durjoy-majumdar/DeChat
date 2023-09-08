package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zm4 extends C47465a {

    /* renamed from: d */
    public int f146096d;

    /* renamed from: e */
    public int f146097e;

    /* renamed from: f */
    public int f146098f;

    /* renamed from: g */
    public String f146099g;

    /* renamed from: h */
    public boolean f146100h;

    /* renamed from: i */
    public String f146101i;

    /* renamed from: j */
    public boolean f146102j = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zm4)) {
            return false;
        }
        zm4 zm4 = (zm4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146096d), Integer.valueOf(zm4.f146096d)) && C46238a.m51546a(Integer.valueOf(this.f146097e), Integer.valueOf(zm4.f146097e)) && C46238a.m51546a(Integer.valueOf(this.f146098f), Integer.valueOf(zm4.f146098f)) && C46238a.m51546a(this.f146099g, zm4.f146099g) && C46238a.m51546a(Boolean.valueOf(this.f146100h), Boolean.valueOf(zm4.f146100h)) && C46238a.m51546a(this.f146101i, zm4.f146101i) && C46238a.m51546a(Boolean.valueOf(this.f146102j), Boolean.valueOf(zm4.f146102j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146096d);
            aVar.mo74318e(2, this.f146097e);
            aVar.mo74318e(3, this.f146098f);
            String str = this.f146099g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74314a(5, this.f146100h);
            String str2 = this.f146101i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74314a(7, this.f146102j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146096d) + 0 + C52418a.m58678e(2, this.f146097e) + C52418a.m58678e(3, this.f146098f);
            String str3 = this.f146099g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int a = e + C52418a.m58674a(5, this.f146100h);
            String str4 = this.f146101i;
            if (str4 != null) {
                a += C52418a.m58683j(6, str4);
            }
            return a + C52418a.m58674a(7, this.f146102j);
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
            zm4 zm4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zm4.f146096d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    zm4.f146097e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zm4.f146098f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    zm4.f146099g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zm4.f146100h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    zm4.f146101i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zm4.f146102j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
