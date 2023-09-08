package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u83 */
public class C51509u83 extends C47465a {

    /* renamed from: d */
    public String f142679d;

    /* renamed from: e */
    public String f142680e;

    /* renamed from: f */
    public int f142681f;

    /* renamed from: g */
    public int f142682g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51509u83)) {
            return false;
        }
        C51509u83 u832 = (C51509u83) aVar;
        return C46238a.m51546a(this.f142679d, u832.f142679d) && C46238a.m51546a(this.f142680e, u832.f142680e) && C46238a.m51546a(Integer.valueOf(this.f142681f), Integer.valueOf(u832.f142681f)) && C46238a.m51546a(Integer.valueOf(this.f142682g), Integer.valueOf(u832.f142682g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142679d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f142680e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f142681f);
            aVar.mo74318e(4, this.f142682g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f142679d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f142680e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f142681f) + C52418a.m58678e(4, this.f142682g);
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
            C51509u83 u832 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u832.f142679d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                u832.f142680e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                u832.f142681f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                u832.f142682g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
