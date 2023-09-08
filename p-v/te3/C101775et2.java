package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.et2 */
public class C101775et2 extends C47465a {

    /* renamed from: d */
    public float f298203d;

    /* renamed from: e */
    public float f298204e;

    /* renamed from: f */
    public float f298205f;

    /* renamed from: g */
    public String f298206g;

    /* renamed from: h */
    public String f298207h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101775et2)) {
            return false;
        }
        C101775et2 et22 = (C101775et2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f298203d), Float.valueOf(et22.f298203d)) && C46238a.m51546a(Float.valueOf(this.f298204e), Float.valueOf(et22.f298204e)) && C46238a.m51546a(Float.valueOf(this.f298205f), Float.valueOf(et22.f298205f)) && C46238a.m51546a(this.f298206g, et22.f298206g) && C46238a.m51546a(this.f298207h, et22.f298207h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f298203d);
            aVar.mo74317d(2, this.f298204e);
            aVar.mo74317d(3, this.f298205f);
            String str = this.f298206g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f298207h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f298203d) + 0 + C52418a.m58677d(2, this.f298204e) + C52418a.m58677d(3, this.f298205f);
            String str3 = this.f298206g;
            if (str3 != null) {
                d += C52418a.m58683j(4, str3);
            }
            String str4 = this.f298207h;
            return str4 != null ? d + C52418a.m58683j(5, str4) : d;
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
            C101775et2 et22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                et22.f298203d = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 2) {
                et22.f298204e = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 3) {
                et22.f298205f = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 4) {
                et22.f298206g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                et22.f298207h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
