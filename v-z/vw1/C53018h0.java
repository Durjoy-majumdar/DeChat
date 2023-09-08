package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.h0 */
public class C53018h0 extends C47465a {

    /* renamed from: d */
    public int f147987d;

    /* renamed from: e */
    public String f147988e;

    /* renamed from: f */
    public int f147989f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53018h0)) {
            return false;
        }
        C53018h0 h0Var = (C53018h0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147987d), Integer.valueOf(h0Var.f147987d)) && C46238a.m51546a(this.f147988e, h0Var.f147988e) && C46238a.m51546a(Integer.valueOf(this.f147989f), Integer.valueOf(h0Var.f147989f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147987d);
            String str = this.f147988e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f147989f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147987d) + 0;
            String str2 = this.f147988e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f147989f);
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
            C53018h0 h0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h0Var.f147987d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                h0Var.f147988e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                h0Var.f147989f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
