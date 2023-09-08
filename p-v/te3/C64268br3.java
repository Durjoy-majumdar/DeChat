package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.br3 */
public class C64268br3 extends C47465a {

    /* renamed from: d */
    public String f182329d;

    /* renamed from: e */
    public String f182330e;

    /* renamed from: f */
    public String f182331f;

    /* renamed from: g */
    public int f182332g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64268br3)) {
            return false;
        }
        C64268br3 br32 = (C64268br3) aVar;
        return C46238a.m51546a(this.f182329d, br32.f182329d) && C46238a.m51546a(this.f182330e, br32.f182330e) && C46238a.m51546a(this.f182331f, br32.f182331f) && C46238a.m51546a(Integer.valueOf(this.f182332g), Integer.valueOf(br32.f182332g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182329d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182330e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182331f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f182332g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f182329d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f182330e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f182331f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f182332g);
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
            C64268br3 br32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                br32.f182329d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                br32.f182330e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                br32.f182331f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                br32.f182332g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
