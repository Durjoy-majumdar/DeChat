package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vt0 */
public class C22532vt0 extends C47465a {

    /* renamed from: d */
    public int f64664d;

    /* renamed from: e */
    public String f64665e;

    /* renamed from: f */
    public int f64666f;

    /* renamed from: g */
    public int f64667g;

    /* renamed from: h */
    public int f64668h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22532vt0)) {
            return false;
        }
        C22532vt0 vt02 = (C22532vt0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64664d), Integer.valueOf(vt02.f64664d)) && C46238a.m51546a(this.f64665e, vt02.f64665e) && C46238a.m51546a(Integer.valueOf(this.f64666f), Integer.valueOf(vt02.f64666f)) && C46238a.m51546a(Integer.valueOf(this.f64667g), Integer.valueOf(vt02.f64667g)) && C46238a.m51546a(Integer.valueOf(this.f64668h), Integer.valueOf(vt02.f64668h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64664d);
            String str = this.f64665e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f64666f);
            aVar.mo74318e(4, this.f64667g);
            aVar.mo74318e(5, this.f64668h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f64664d) + 0;
            String str2 = this.f64665e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f64666f) + C52418a.m58678e(4, this.f64667g) + C52418a.m58678e(5, this.f64668h);
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
            C22532vt0 vt02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vt02.f64664d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                vt02.f64665e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vt02.f64666f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                vt02.f64667g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vt02.f64668h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
