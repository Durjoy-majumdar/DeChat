package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.h */
public class C39583h extends C47465a {

    /* renamed from: d */
    public int f106251d;

    /* renamed from: e */
    public String f106252e;

    /* renamed from: f */
    public int f106253f;

    /* renamed from: g */
    public int f106254g;

    /* renamed from: h */
    public long f106255h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39583h)) {
            return false;
        }
        C39583h hVar = (C39583h) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f106251d), Integer.valueOf(hVar.f106251d)) && C46238a.m51546a(this.f106252e, hVar.f106252e) && C46238a.m51546a(Integer.valueOf(this.f106253f), Integer.valueOf(hVar.f106253f)) && C46238a.m51546a(Integer.valueOf(this.f106254g), Integer.valueOf(hVar.f106254g)) && C46238a.m51546a(Long.valueOf(this.f106255h), Long.valueOf(hVar.f106255h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f106251d);
            String str = this.f106252e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f106253f);
            aVar.mo74318e(4, this.f106254g);
            aVar.mo74321h(5, this.f106255h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f106251d) + 0;
            String str2 = this.f106252e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f106253f) + C52418a.m58678e(4, this.f106254g) + C52418a.m58681h(5, this.f106255h);
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
            C39583h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hVar.f106251d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                hVar.f106252e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hVar.f106253f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                hVar.f106254g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                hVar.f106255h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
