package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qw */
public class C51019qw extends C47465a {

    /* renamed from: d */
    public long f140576d;

    /* renamed from: e */
    public String f140577e;

    /* renamed from: f */
    public int f140578f;

    /* renamed from: g */
    public long f140579g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51019qw)) {
            return false;
        }
        C51019qw qwVar = (C51019qw) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140576d), Long.valueOf(qwVar.f140576d)) && C46238a.m51546a(this.f140577e, qwVar.f140577e) && C46238a.m51546a(Integer.valueOf(this.f140578f), Integer.valueOf(qwVar.f140578f)) && C46238a.m51546a(Long.valueOf(this.f140579g), Long.valueOf(qwVar.f140579g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140576d);
            String str = this.f140577e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f140578f);
            aVar.mo74321h(4, this.f140579g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140576d) + 0;
            String str2 = this.f140577e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58678e(3, this.f140578f) + C52418a.m58681h(4, this.f140579g);
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
            C51019qw qwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qwVar.f140576d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                qwVar.f140577e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                qwVar.f140578f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qwVar.f140579g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
