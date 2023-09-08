package re3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.d */
public class C63393d extends C47465a {

    /* renamed from: d */
    public int f179823d;

    /* renamed from: e */
    public C89349b f179824e;

    /* renamed from: f */
    public int f179825f;

    /* renamed from: g */
    public int f179826g;

    /* renamed from: h */
    public int f179827h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63393d)) {
            return false;
        }
        C63393d dVar = (C63393d) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179823d), Integer.valueOf(dVar.f179823d)) && C46238a.m51546a(this.f179824e, dVar.f179824e) && C46238a.m51546a(Integer.valueOf(this.f179825f), Integer.valueOf(dVar.f179825f)) && C46238a.m51546a(Integer.valueOf(this.f179826g), Integer.valueOf(dVar.f179826g)) && C46238a.m51546a(Integer.valueOf(this.f179827h), Integer.valueOf(dVar.f179827h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f179824e != null) {
                aVar.mo74318e(1, this.f179823d);
                C89349b bVar = this.f179824e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74318e(3, this.f179825f);
                aVar.mo74318e(4, this.f179826g);
                aVar.mo74318e(5, this.f179827h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: value");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179823d) + 0;
            C89349b bVar2 = this.f179824e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58678e(3, this.f179825f) + C52418a.m58678e(4, this.f179826g) + C52418a.m58678e(5, this.f179827h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f179824e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: value");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C63393d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dVar.f179823d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                dVar.f179824e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                dVar.f179825f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                dVar.f179826g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dVar.f179827h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
