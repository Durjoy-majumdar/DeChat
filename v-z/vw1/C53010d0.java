package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.d0 */
public class C53010d0 extends C47465a {

    /* renamed from: d */
    public String f147926d;

    /* renamed from: e */
    public String f147927e;

    /* renamed from: f */
    public String f147928f;

    /* renamed from: g */
    public String f147929g;

    /* renamed from: h */
    public String f147930h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53010d0)) {
            return false;
        }
        C53010d0 d0Var = (C53010d0) aVar;
        return C46238a.m51546a(this.f147926d, d0Var.f147926d) && C46238a.m51546a(this.f147927e, d0Var.f147927e) && C46238a.m51546a(this.f147928f, d0Var.f147928f) && C46238a.m51546a(this.f147929g, d0Var.f147929g) && C46238a.m51546a(this.f147930h, d0Var.f147930h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147926d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147927e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f147928f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f147929g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f147930h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f147926d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f147927e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f147928f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f147929g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f147930h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C53010d0 d0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d0Var.f147926d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d0Var.f147927e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                d0Var.f147928f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                d0Var.f147929g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                d0Var.f147930h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
