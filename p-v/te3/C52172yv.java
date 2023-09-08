package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yv */
public class C52172yv extends C47465a {

    /* renamed from: d */
    public int f145527d;

    /* renamed from: e */
    public String f145528e;

    /* renamed from: f */
    public int f145529f;

    /* renamed from: g */
    public int f145530g;

    /* renamed from: h */
    public String f145531h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52172yv)) {
            return false;
        }
        C52172yv yvVar = (C52172yv) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145527d), Integer.valueOf(yvVar.f145527d)) && C46238a.m51546a(this.f145528e, yvVar.f145528e) && C46238a.m51546a(Integer.valueOf(this.f145529f), Integer.valueOf(yvVar.f145529f)) && C46238a.m51546a(Integer.valueOf(this.f145530g), Integer.valueOf(yvVar.f145530g)) && C46238a.m51546a(this.f145531h, yvVar.f145531h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145527d);
            String str = this.f145528e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145529f);
            aVar.mo74318e(4, this.f145530g);
            String str2 = this.f145531h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145527d) + 0;
            String str3 = this.f145528e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f145529f) + C52418a.m58678e(4, this.f145530g);
            String str4 = this.f145531h;
            return str4 != null ? e2 + C52418a.m58683j(5, str4) : e2;
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
            C52172yv yvVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yvVar.f145527d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                yvVar.f145528e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                yvVar.f145529f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                yvVar.f145530g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                yvVar.f145531h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
