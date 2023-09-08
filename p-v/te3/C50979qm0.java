package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qm0 */
public class C50979qm0 extends C47465a {

    /* renamed from: d */
    public String f140388d;

    /* renamed from: e */
    public int f140389e;

    /* renamed from: f */
    public String f140390f;

    /* renamed from: g */
    public long f140391g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50979qm0)) {
            return false;
        }
        C50979qm0 qm02 = (C50979qm0) aVar;
        return C46238a.m51546a(this.f140388d, qm02.f140388d) && C46238a.m51546a(Integer.valueOf(this.f140389e), Integer.valueOf(qm02.f140389e)) && C46238a.m51546a(this.f140390f, qm02.f140390f) && C46238a.m51546a(Long.valueOf(this.f140391g), Long.valueOf(qm02.f140391g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140388d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f140389e);
            String str2 = this.f140390f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f140391g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140388d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f140389e);
            String str4 = this.f140390f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58681h(4, this.f140391g);
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
            C50979qm0 qm02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qm02.f140388d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                qm02.f140389e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qm02.f140390f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qm02.f140391g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
