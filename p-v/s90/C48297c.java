package s90;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s90.c */
public class C48297c extends C47465a {

    /* renamed from: d */
    public int f129327d;

    /* renamed from: e */
    public int f129328e;

    /* renamed from: f */
    public String f129329f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48297c)) {
            return false;
        }
        C48297c cVar = (C48297c) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f129327d), Integer.valueOf(cVar.f129327d)) && C46238a.m51546a(Integer.valueOf(this.f129328e), Integer.valueOf(cVar.f129328e)) && C46238a.m51546a(this.f129329f, cVar.f129329f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f129327d);
            aVar.mo74318e(2, this.f129328e);
            String str = this.f129329f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f129327d) + 0 + C52418a.m58678e(2, this.f129328e);
            String str2 = this.f129329f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C48297c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cVar.f129327d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                cVar.f129328e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                cVar.f129329f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
