package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.br0 */
public class C48896br0 extends C47465a {

    /* renamed from: d */
    public String f131274d;

    /* renamed from: e */
    public String f131275e;

    /* renamed from: f */
    public String f131276f;

    /* renamed from: g */
    public int f131277g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48896br0)) {
            return false;
        }
        C48896br0 br02 = (C48896br0) aVar;
        return C46238a.m51546a(this.f131274d, br02.f131274d) && C46238a.m51546a(this.f131275e, br02.f131275e) && C46238a.m51546a(this.f131276f, br02.f131276f) && C46238a.m51546a(Integer.valueOf(this.f131277g), Integer.valueOf(br02.f131277g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131274d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131275e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131276f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f131277g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f131274d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f131275e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f131276f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f131277g);
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
            C48896br0 br02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                br02.f131274d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                br02.f131275e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                br02.f131276f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                br02.f131277g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
