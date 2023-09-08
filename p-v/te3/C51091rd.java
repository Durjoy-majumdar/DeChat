package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rd */
public class C51091rd extends C47465a {

    /* renamed from: d */
    public String f140834d;

    /* renamed from: e */
    public int f140835e;

    /* renamed from: f */
    public String f140836f;

    /* renamed from: g */
    public int f140837g;

    /* renamed from: h */
    public int f140838h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51091rd)) {
            return false;
        }
        C51091rd rdVar = (C51091rd) aVar;
        return C46238a.m51546a(this.f140834d, rdVar.f140834d) && C46238a.m51546a(Integer.valueOf(this.f140835e), Integer.valueOf(rdVar.f140835e)) && C46238a.m51546a(this.f140836f, rdVar.f140836f) && C46238a.m51546a(Integer.valueOf(this.f140837g), Integer.valueOf(rdVar.f140837g)) && C46238a.m51546a(Integer.valueOf(this.f140838h), Integer.valueOf(rdVar.f140838h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140834d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f140835e);
            String str2 = this.f140836f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f140837g);
            aVar.mo74318e(5, this.f140838h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140834d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f140835e);
            String str4 = this.f140836f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f140837g) + C52418a.m58678e(5, this.f140838h);
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
            C51091rd rdVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rdVar.f140834d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rdVar.f140835e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                rdVar.f140836f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                rdVar.f140837g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                rdVar.f140838h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
