package v41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.m */
public class C52754m extends C47465a {

    /* renamed from: d */
    public long f147411d;

    /* renamed from: e */
    public long f147412e;

    /* renamed from: f */
    public long f147413f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52754m)) {
            return false;
        }
        C52754m mVar = (C52754m) aVar;
        return C46238a.m51546a(Long.valueOf(this.f147411d), Long.valueOf(mVar.f147411d)) && C46238a.m51546a(Long.valueOf(this.f147412e), Long.valueOf(mVar.f147412e)) && C46238a.m51546a(Long.valueOf(this.f147413f), Long.valueOf(mVar.f147413f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f147411d);
            aVar.mo74321h(2, this.f147412e);
            aVar.mo74321h(3, this.f147413f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f147411d) + 0 + C52418a.m58681h(2, this.f147412e) + C52418a.m58681h(3, this.f147413f);
        } else {
            if (i == 2) {
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
                C52754m mVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mVar.f147411d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    mVar.f147412e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    mVar.f147413f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
