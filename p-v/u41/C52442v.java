package u41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.v */
public class C52442v extends C47465a {

    /* renamed from: d */
    public int f146553d;

    /* renamed from: e */
    public int f146554e;

    /* renamed from: f */
    public long f146555f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52442v)) {
            return false;
        }
        C52442v vVar = (C52442v) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146553d), Integer.valueOf(vVar.f146553d)) && C46238a.m51546a(Integer.valueOf(this.f146554e), Integer.valueOf(vVar.f146554e)) && C46238a.m51546a(Long.valueOf(this.f146555f), Long.valueOf(vVar.f146555f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146553d);
            aVar.mo74318e(2, this.f146554e);
            aVar.mo74321h(3, this.f146555f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f146553d) + 0 + C52418a.m58678e(2, this.f146554e) + C52418a.m58681h(3, this.f146555f);
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
                C52442v vVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vVar.f146553d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    vVar.f146554e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    vVar.f146555f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
