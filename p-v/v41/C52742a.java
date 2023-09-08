package v41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.a */
public class C52742a extends C47465a {

    /* renamed from: d */
    public long f147342d;

    /* renamed from: e */
    public long f147343e;

    /* renamed from: f */
    public String f147344f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52742a)) {
            return false;
        }
        C52742a aVar2 = (C52742a) aVar;
        return C46238a.m51546a(Long.valueOf(this.f147342d), Long.valueOf(aVar2.f147342d)) && C46238a.m51546a(Long.valueOf(this.f147343e), Long.valueOf(aVar2.f147343e)) && C46238a.m51546a(this.f147344f, aVar2.f147344f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f147342d);
            aVar.mo74321h(2, this.f147343e);
            String str = this.f147344f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f147342d) + 0 + C52418a.m58681h(2, this.f147343e);
            String str2 = this.f147344f;
            return str2 != null ? h + C52418a.m58683j(3, str2) : h;
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
            C52742a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aVar4.f147342d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                aVar4.f147343e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                aVar4.f147344f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
