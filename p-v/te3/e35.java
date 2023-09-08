package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e35 extends C47465a {

    /* renamed from: d */
    public String f132669d;

    /* renamed from: e */
    public int f132670e;

    /* renamed from: f */
    public int f132671f;

    /* renamed from: g */
    public int f132672g;

    /* renamed from: h */
    public boolean f132673h = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e35)) {
            return false;
        }
        e35 e35 = (e35) aVar;
        return C46238a.m51546a(this.f132669d, e35.f132669d) && C46238a.m51546a(Integer.valueOf(this.f132670e), Integer.valueOf(e35.f132670e)) && C46238a.m51546a(Integer.valueOf(this.f132671f), Integer.valueOf(e35.f132671f)) && C46238a.m51546a(Integer.valueOf(this.f132672g), Integer.valueOf(e35.f132672g)) && C46238a.m51546a(Boolean.valueOf(this.f132673h), Boolean.valueOf(e35.f132673h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132669d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132670e);
            aVar.mo74318e(3, this.f132671f);
            aVar.mo74318e(4, this.f132672g);
            aVar.mo74314a(5, this.f132673h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f132669d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f132670e) + C52418a.m58678e(3, this.f132671f) + C52418a.m58678e(4, this.f132672g) + C52418a.m58674a(5, this.f132673h);
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
            e35 e35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e35.f132669d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e35.f132670e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                e35.f132671f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                e35.f132672g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                e35.f132673h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
