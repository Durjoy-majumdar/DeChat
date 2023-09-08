package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.in1 */
public class C49873in1 extends C47465a {

    /* renamed from: d */
    public String f135518d;

    /* renamed from: e */
    public long f135519e;

    /* renamed from: f */
    public int f135520f;

    /* renamed from: g */
    public int f135521g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49873in1)) {
            return false;
        }
        C49873in1 in12 = (C49873in1) aVar;
        return C46238a.m51546a(this.f135518d, in12.f135518d) && C46238a.m51546a(Long.valueOf(this.f135519e), Long.valueOf(in12.f135519e)) && C46238a.m51546a(Integer.valueOf(this.f135520f), Integer.valueOf(in12.f135520f)) && C46238a.m51546a(Integer.valueOf(this.f135521g), Integer.valueOf(in12.f135521g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135518d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f135519e);
            aVar.mo74318e(3, this.f135520f);
            aVar.mo74318e(4, this.f135521g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f135518d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f135519e) + C52418a.m58678e(3, this.f135520f) + C52418a.m58678e(4, this.f135521g);
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
            C49873in1 in12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                in12.f135518d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                in12.f135519e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                in12.f135520f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                in12.f135521g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
