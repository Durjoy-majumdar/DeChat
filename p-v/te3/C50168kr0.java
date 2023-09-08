package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kr0 */
public class C50168kr0 extends C47465a {

    /* renamed from: d */
    public long f136997d;

    /* renamed from: e */
    public String f136998e;

    /* renamed from: f */
    public C89349b f136999f;

    /* renamed from: g */
    public String f137000g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50168kr0)) {
            return false;
        }
        C50168kr0 kr02 = (C50168kr0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136997d), Long.valueOf(kr02.f136997d)) && C46238a.m51546a(this.f136998e, kr02.f136998e) && C46238a.m51546a(this.f136999f, kr02.f136999f) && C46238a.m51546a(this.f137000g, kr02.f137000g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136997d);
            String str = this.f136998e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f136999f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f137000g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f136997d) + 0;
            String str3 = this.f136998e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            C89349b bVar2 = this.f136999f;
            if (bVar2 != null) {
                h += C52418a.m58675b(3, bVar2);
            }
            String str4 = this.f137000g;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
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
            C50168kr0 kr02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kr02.f136997d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                kr02.f136998e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kr02.f136999f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                kr02.f137000g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
