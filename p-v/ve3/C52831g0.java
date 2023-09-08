package ve3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.g0 */
public class C52831g0 extends C47465a {

    /* renamed from: d */
    public String f147582d;

    /* renamed from: e */
    public String f147583e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52831g0)) {
            return false;
        }
        C52831g0 g0Var = (C52831g0) aVar;
        return C46238a.m51546a(this.f147582d, g0Var.f147582d) && C46238a.m51546a(this.f147583e, g0Var.f147583e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147582d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147583e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f147582d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f147583e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
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
            C52831g0 g0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g0Var.f147582d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                g0Var.f147583e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
