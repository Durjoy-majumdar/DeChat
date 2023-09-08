package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sl2 */
public class C51263sl2 extends C47465a {

    /* renamed from: d */
    public int f141588d;

    /* renamed from: e */
    public C89349b f141589e;

    /* renamed from: f */
    public int f141590f;

    /* renamed from: g */
    public int f141591g;

    /* renamed from: h */
    public int f141592h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51263sl2)) {
            return false;
        }
        C51263sl2 sl22 = (C51263sl2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141588d), Integer.valueOf(sl22.f141588d)) && C46238a.m51546a(this.f141589e, sl22.f141589e) && C46238a.m51546a(Integer.valueOf(this.f141590f), Integer.valueOf(sl22.f141590f)) && C46238a.m51546a(Integer.valueOf(this.f141591g), Integer.valueOf(sl22.f141591g)) && C46238a.m51546a(Integer.valueOf(this.f141592h), Integer.valueOf(sl22.f141592h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141588d);
            C89349b bVar = this.f141589e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f141590f);
            aVar.mo74318e(4, this.f141591g);
            aVar.mo74318e(5, this.f141592h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141588d) + 0;
            C89349b bVar2 = this.f141589e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58678e(3, this.f141590f) + C52418a.m58678e(4, this.f141591g) + C52418a.m58678e(5, this.f141592h);
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
            C51263sl2 sl22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sl22.f141588d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                sl22.f141589e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                sl22.f141590f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                sl22.f141591g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sl22.f141592h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
