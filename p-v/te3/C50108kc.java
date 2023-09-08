package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kc */
public class C50108kc extends C47465a {

    /* renamed from: d */
    public long f136650d;

    /* renamed from: e */
    public long f136651e;

    /* renamed from: f */
    public long f136652f;

    /* renamed from: g */
    public LinkedList<C110965ic> f136653g = new LinkedList<>();

    /* renamed from: h */
    public boolean f136654h = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50108kc)) {
            return false;
        }
        C50108kc kcVar = (C50108kc) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136650d), Long.valueOf(kcVar.f136650d)) && C46238a.m51546a(Long.valueOf(this.f136651e), Long.valueOf(kcVar.f136651e)) && C46238a.m51546a(Long.valueOf(this.f136652f), Long.valueOf(kcVar.f136652f)) && C46238a.m51546a(this.f136653g, kcVar.f136653g) && C46238a.m51546a(Boolean.valueOf(this.f136654h), Boolean.valueOf(kcVar.f136654h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136650d);
            aVar.mo74321h(2, this.f136651e);
            aVar.mo74321h(3, this.f136652f);
            aVar.mo74320g(4, 8, this.f136653g);
            aVar.mo74314a(5, this.f136654h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f136650d) + 0 + C52418a.m58681h(2, this.f136651e) + C52418a.m58681h(3, this.f136652f) + C52418a.m58680g(4, 8, this.f136653g) + C52418a.m58674a(5, this.f136654h);
        } else {
            if (i == 2) {
                this.f136653g.clear();
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
                C50108kc kcVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    kcVar.f136650d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    kcVar.f136651e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    kcVar.f136652f = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 4) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C110965ic icVar = new C110965ic();
                        if (bArr != null && bArr.length > 0) {
                            icVar.parseFrom(bArr);
                        }
                        kcVar.f136653g.add(icVar);
                    }
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    kcVar.f136654h = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
