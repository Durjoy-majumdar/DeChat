package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qv4 extends C47465a {

    /* renamed from: d */
    public int f299231d;

    /* renamed from: e */
    public int f299232e;

    /* renamed from: f */
    public int f299233f;

    /* renamed from: g */
    public int f299234g;

    /* renamed from: h */
    public int f299235h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qv4)) {
            return false;
        }
        qv4 qv4 = (qv4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299231d), Integer.valueOf(qv4.f299231d)) && C46238a.m51546a(Integer.valueOf(this.f299232e), Integer.valueOf(qv4.f299232e)) && C46238a.m51546a(Integer.valueOf(this.f299233f), Integer.valueOf(qv4.f299233f)) && C46238a.m51546a(Integer.valueOf(this.f299234g), Integer.valueOf(qv4.f299234g)) && C46238a.m51546a(Integer.valueOf(this.f299235h), Integer.valueOf(qv4.f299235h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299231d);
            aVar.mo74318e(2, this.f299232e);
            aVar.mo74318e(3, this.f299233f);
            aVar.mo74318e(4, this.f299234g);
            aVar.mo74318e(5, this.f299235h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f299231d) + 0 + C52418a.m58678e(2, this.f299232e) + C52418a.m58678e(3, this.f299233f) + C52418a.m58678e(4, this.f299234g) + C52418a.m58678e(5, this.f299235h);
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
                qv4 qv4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    qv4.f299231d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    qv4.f299232e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    qv4.f299233f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    qv4.f299234g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    qv4.f299235h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
