package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wr2 */
public class C64813wr2 extends C47465a {

    /* renamed from: d */
    public String f186190d;

    /* renamed from: e */
    public String f186191e;

    /* renamed from: f */
    public String f186192f;

    /* renamed from: g */
    public C89349b f186193g;

    /* renamed from: h */
    public String f186194h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64813wr2)) {
            return false;
        }
        C64813wr2 wr22 = (C64813wr2) aVar;
        return C46238a.m51546a(this.f186190d, wr22.f186190d) && C46238a.m51546a(this.f186191e, wr22.f186191e) && C46238a.m51546a(this.f186192f, wr22.f186192f) && C46238a.m51546a(this.f186193g, wr22.f186193g) && C46238a.m51546a(this.f186194h, wr22.f186194h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186190d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186191e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186192f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            C89349b bVar = this.f186193g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str4 = this.f186194h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f186190d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f186191e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f186192f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            C89349b bVar2 = this.f186193g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            String str8 = this.f186194h;
            return str8 != null ? i2 + C52418a.m58683j(6, str8) : i2;
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
            C64813wr2 wr22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wr22.f186190d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wr22.f186191e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wr22.f186192f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                wr22.f186193g = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                wr22.f186194h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
