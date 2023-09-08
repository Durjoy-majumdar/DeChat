package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xq3 */
public class C52007xq3 extends C47465a {

    /* renamed from: d */
    public String f144877d;

    /* renamed from: e */
    public int f144878e;

    /* renamed from: f */
    public int f144879f;

    /* renamed from: g */
    public int f144880g;

    /* renamed from: h */
    public C89349b f144881h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52007xq3)) {
            return false;
        }
        C52007xq3 xq32 = (C52007xq3) aVar;
        return C46238a.m51546a(this.f144877d, xq32.f144877d) && C46238a.m51546a(Integer.valueOf(this.f144878e), Integer.valueOf(xq32.f144878e)) && C46238a.m51546a(Integer.valueOf(this.f144879f), Integer.valueOf(xq32.f144879f)) && C46238a.m51546a(Integer.valueOf(this.f144880g), Integer.valueOf(xq32.f144880g)) && C46238a.m51546a(this.f144881h, xq32.f144881h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144877d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f144878e);
            aVar.mo74318e(3, this.f144879f);
            aVar.mo74318e(4, this.f144880g);
            C89349b bVar = this.f144881h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f144877d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f144878e) + C52418a.m58678e(3, this.f144879f) + C52418a.m58678e(4, this.f144880g);
            C89349b bVar2 = this.f144881h;
            return bVar2 != null ? e + C52418a.m58675b(5, bVar2) : e;
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
            C52007xq3 xq32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xq32.f144877d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xq32.f144878e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xq32.f144879f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                xq32.f144880g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xq32.f144881h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
