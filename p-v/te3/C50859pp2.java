package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pp2 */
public class C50859pp2 extends C47465a {

    /* renamed from: d */
    public int f139894d;

    /* renamed from: e */
    public long f139895e;

    /* renamed from: f */
    public String f139896f;

    /* renamed from: g */
    public String f139897g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50859pp2)) {
            return false;
        }
        C50859pp2 pp22 = (C50859pp2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139894d), Integer.valueOf(pp22.f139894d)) && C46238a.m51546a(Long.valueOf(this.f139895e), Long.valueOf(pp22.f139895e)) && C46238a.m51546a(this.f139896f, pp22.f139896f) && C46238a.m51546a(this.f139897g, pp22.f139897g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139894d);
            aVar.mo74321h(2, this.f139895e);
            String str = this.f139896f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139897g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139894d) + 0 + C52418a.m58681h(2, this.f139895e);
            String str3 = this.f139896f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f139897g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C50859pp2 pp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pp22.f139894d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pp22.f139895e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                pp22.f139896f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pp22.f139897g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
