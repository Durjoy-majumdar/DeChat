package ve3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.m0 */
public class C52841m0 extends C47465a {

    /* renamed from: d */
    public boolean f147603d;

    /* renamed from: e */
    public String f147604e;

    /* renamed from: f */
    public String f147605f;

    /* renamed from: g */
    public String f147606g;

    /* renamed from: h */
    public String f147607h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52841m0)) {
            return false;
        }
        C52841m0 m0Var = (C52841m0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f147603d), Boolean.valueOf(m0Var.f147603d)) && C46238a.m51546a(this.f147604e, m0Var.f147604e) && C46238a.m51546a(this.f147605f, m0Var.f147605f) && C46238a.m51546a(this.f147606g, m0Var.f147606g) && C46238a.m51546a(this.f147607h, m0Var.f147607h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f147603d);
            String str = this.f147604e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147605f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147606g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f147607h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f147603d) + 0;
            String str5 = this.f147604e;
            if (str5 != null) {
                a += C52418a.m58683j(2, str5);
            }
            String str6 = this.f147605f;
            if (str6 != null) {
                a += C52418a.m58683j(3, str6);
            }
            String str7 = this.f147606g;
            if (str7 != null) {
                a += C52418a.m58683j(4, str7);
            }
            String str8 = this.f147607h;
            return str8 != null ? a + C52418a.m58683j(5, str8) : a;
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
            C52841m0 m0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m0Var.f147603d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                m0Var.f147604e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m0Var.f147605f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                m0Var.f147606g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                m0Var.f147607h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
