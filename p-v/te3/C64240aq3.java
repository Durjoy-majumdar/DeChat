package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aq3 */
public class C64240aq3 extends C47465a {

    /* renamed from: d */
    public boolean f182135d;

    /* renamed from: e */
    public String f182136e;

    /* renamed from: f */
    public C89349b f182137f;

    /* renamed from: g */
    public String f182138g;

    /* renamed from: h */
    public String f182139h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64240aq3)) {
            return false;
        }
        C64240aq3 aq32 = (C64240aq3) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f182135d), Boolean.valueOf(aq32.f182135d)) && C46238a.m51546a(this.f182136e, aq32.f182136e) && C46238a.m51546a(this.f182137f, aq32.f182137f) && C46238a.m51546a(this.f182138g, aq32.f182138g) && C46238a.m51546a(this.f182139h, aq32.f182139h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f182135d);
            String str = this.f182136e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f182137f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f182138g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f182139h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f182135d) + 0;
            String str4 = this.f182136e;
            if (str4 != null) {
                a += C52418a.m58683j(2, str4);
            }
            C89349b bVar2 = this.f182137f;
            if (bVar2 != null) {
                a += C52418a.m58675b(3, bVar2);
            }
            String str5 = this.f182138g;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.f182139h;
            return str6 != null ? a + C52418a.m58683j(5, str6) : a;
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
            C64240aq3 aq32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aq32.f182135d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                aq32.f182136e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                aq32.f182137f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                aq32.f182138g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                aq32.f182139h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
