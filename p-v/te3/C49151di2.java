package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.di2 */
public class C49151di2 extends C47465a {

    /* renamed from: d */
    public long f132352d;

    /* renamed from: e */
    public long f132353e;

    /* renamed from: f */
    public String f132354f;

    /* renamed from: g */
    public String f132355g;

    /* renamed from: h */
    public C89349b f132356h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49151di2)) {
            return false;
        }
        C49151di2 di22 = (C49151di2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132352d), Long.valueOf(di22.f132352d)) && C46238a.m51546a(Long.valueOf(this.f132353e), Long.valueOf(di22.f132353e)) && C46238a.m51546a(this.f132354f, di22.f132354f) && C46238a.m51546a(this.f132355g, di22.f132355g) && C46238a.m51546a(this.f132356h, di22.f132356h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132352d);
            aVar.mo74321h(2, this.f132353e);
            String str = this.f132354f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132355g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f132356h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f132352d) + 0 + C52418a.m58681h(2, this.f132353e);
            String str3 = this.f132354f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            String str4 = this.f132355g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            C89349b bVar2 = this.f132356h;
            return bVar2 != null ? h + C52418a.m58675b(5, bVar2) : h;
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
            C49151di2 di22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                di22.f132352d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                di22.f132353e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                di22.f132354f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                di22.f132355g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                di22.f132356h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
