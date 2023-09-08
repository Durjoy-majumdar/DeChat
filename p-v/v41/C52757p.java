package v41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.p */
public class C52757p extends C47465a {

    /* renamed from: d */
    public int f147425d;

    /* renamed from: e */
    public String f147426e;

    /* renamed from: f */
    public String f147427f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52757p)) {
            return false;
        }
        C52757p pVar = (C52757p) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147425d), Integer.valueOf(pVar.f147425d)) && C46238a.m51546a(this.f147426e, pVar.f147426e) && C46238a.m51546a(this.f147427f, pVar.f147427f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147425d);
            String str = this.f147426e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147427f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147425d) + 0;
            String str3 = this.f147426e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f147427f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C52757p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pVar.f147425d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pVar.f147426e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pVar.f147427f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
