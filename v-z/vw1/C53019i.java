package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.i */
public class C53019i extends C47465a {

    /* renamed from: d */
    public String f147990d;

    /* renamed from: e */
    public int f147991e;

    /* renamed from: f */
    public boolean f147992f;

    /* renamed from: g */
    public int f147993g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53019i)) {
            return false;
        }
        C53019i iVar = (C53019i) aVar;
        return C46238a.m51546a(this.f147990d, iVar.f147990d) && C46238a.m51546a(Integer.valueOf(this.f147991e), Integer.valueOf(iVar.f147991e)) && C46238a.m51546a(Boolean.valueOf(this.f147992f), Boolean.valueOf(iVar.f147992f)) && C46238a.m51546a(Integer.valueOf(this.f147993g), Integer.valueOf(iVar.f147993g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147990d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f147991e);
            aVar.mo74314a(3, this.f147992f);
            aVar.mo74318e(4, this.f147993g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f147990d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f147991e) + C52418a.m58674a(3, this.f147992f) + C52418a.m58678e(4, this.f147993g);
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
            C53019i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iVar.f147990d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                iVar.f147991e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                iVar.f147992f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                iVar.f147993g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
