package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class u44 extends C47465a {

    /* renamed from: d */
    public boolean f142596d;

    /* renamed from: e */
    public int f142597e;

    /* renamed from: f */
    public int f142598f;

    /* renamed from: g */
    public LinkedList<String> f142599g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u44)) {
            return false;
        }
        u44 u44 = (u44) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f142596d), Boolean.valueOf(u44.f142596d)) && C46238a.m51546a(Integer.valueOf(this.f142597e), Integer.valueOf(u44.f142597e)) && C46238a.m51546a(Integer.valueOf(this.f142598f), Integer.valueOf(u44.f142598f)) && C46238a.m51546a(this.f142599g, u44.f142599g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f142596d);
            aVar.mo74318e(2, this.f142597e);
            aVar.mo74318e(3, this.f142598f);
            aVar.mo74320g(4, 1, this.f142599g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f142596d) + 0 + C52418a.m58678e(2, this.f142597e) + C52418a.m58678e(3, this.f142598f) + C52418a.m58680g(4, 1, this.f142599g);
        } else {
            if (i == 2) {
                this.f142599g.clear();
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
                u44 u44 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    u44.f142596d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    u44.f142597e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    u44.f142598f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    u44.f142599g.add(aVar3.mo141633k(intValue));
                    return 0;
                }
            }
        }
    }
}
