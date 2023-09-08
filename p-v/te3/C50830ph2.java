package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ph2 */
public class C50830ph2 extends C47465a {

    /* renamed from: d */
    public int f139767d;

    /* renamed from: e */
    public String f139768e;

    /* renamed from: f */
    public C89349b f139769f;

    /* renamed from: g */
    public int f139770g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50830ph2)) {
            return false;
        }
        C50830ph2 ph22 = (C50830ph2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139767d), Integer.valueOf(ph22.f139767d)) && C46238a.m51546a(this.f139768e, ph22.f139768e) && C46238a.m51546a(this.f139769f, ph22.f139769f) && C46238a.m51546a(Integer.valueOf(this.f139770g), Integer.valueOf(ph22.f139770g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139767d);
            String str = this.f139768e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f139769f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f139770g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139767d) + 0;
            String str2 = this.f139768e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f139769f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58678e(4, this.f139770g);
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
            C50830ph2 ph22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ph22.f139767d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ph22.f139768e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ph22.f139769f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ph22.f139770g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
