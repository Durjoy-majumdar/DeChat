package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yq4 extends C47465a {

    /* renamed from: d */
    public int f145471d;

    /* renamed from: e */
    public int f145472e;

    /* renamed from: f */
    public int f145473f;

    /* renamed from: g */
    public int f145474g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yq4)) {
            return false;
        }
        yq4 yq4 = (yq4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145471d), Integer.valueOf(yq4.f145471d)) && C46238a.m51546a(Integer.valueOf(this.f145472e), Integer.valueOf(yq4.f145472e)) && C46238a.m51546a(Integer.valueOf(this.f145473f), Integer.valueOf(yq4.f145473f)) && C46238a.m51546a(Integer.valueOf(this.f145474g), Integer.valueOf(yq4.f145474g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145471d);
            aVar.mo74318e(2, this.f145472e);
            aVar.mo74318e(3, this.f145473f);
            aVar.mo74318e(4, this.f145474g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f145471d) + 0 + C52418a.m58678e(2, this.f145472e) + C52418a.m58678e(3, this.f145473f) + C52418a.m58678e(4, this.f145474g);
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
                yq4 yq4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    yq4.f145471d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    yq4.f145472e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    yq4.f145473f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    yq4.f145474g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
