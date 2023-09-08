package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dx2 */
public class C64333dx2 extends C47465a {

    /* renamed from: d */
    public String f182900d;

    /* renamed from: e */
    public String f182901e;

    /* renamed from: f */
    public String f182902f;

    /* renamed from: g */
    public String f182903g;

    /* renamed from: h */
    public C89349b f182904h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64333dx2)) {
            return false;
        }
        C64333dx2 dx22 = (C64333dx2) aVar;
        return C46238a.m51546a(this.f182900d, dx22.f182900d) && C46238a.m51546a(this.f182901e, dx22.f182901e) && C46238a.m51546a(this.f182902f, dx22.f182902f) && C46238a.m51546a(this.f182903g, dx22.f182903g) && C46238a.m51546a(this.f182904h, dx22.f182904h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182900d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182901e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182902f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f182903g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            C89349b bVar = this.f182904h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f182900d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f182901e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f182902f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f182903g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            C89349b bVar2 = this.f182904h;
            return bVar2 != null ? i2 + C52418a.m58675b(5, bVar2) : i2;
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
            C64333dx2 dx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dx22.f182900d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                dx22.f182901e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                dx22.f182902f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                dx22.f182903g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dx22.f182904h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
