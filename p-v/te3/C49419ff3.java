package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ff3 */
public class C49419ff3 extends C47465a {

    /* renamed from: d */
    public String f133478d;

    /* renamed from: e */
    public String f133479e;

    /* renamed from: f */
    public int f133480f;

    /* renamed from: g */
    public String f133481g;

    /* renamed from: h */
    public String f133482h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49419ff3)) {
            return false;
        }
        C49419ff3 ff32 = (C49419ff3) aVar;
        return C46238a.m51546a(this.f133478d, ff32.f133478d) && C46238a.m51546a(this.f133479e, ff32.f133479e) && C46238a.m51546a(Integer.valueOf(this.f133480f), Integer.valueOf(ff32.f133480f)) && C46238a.m51546a(this.f133481g, ff32.f133481g) && C46238a.m51546a(this.f133482h, ff32.f133482h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133478d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133479e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f133480f);
            String str3 = this.f133481g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f133482h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f133478d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f133479e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f133480f);
            String str7 = this.f133481g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f133482h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C49419ff3 ff32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ff32.f133478d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ff32.f133479e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ff32.f133480f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ff32.f133481g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ff32.f133482h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
