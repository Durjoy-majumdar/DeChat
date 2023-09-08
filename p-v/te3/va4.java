package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class va4 extends C47465a {

    /* renamed from: d */
    public String f185866d;

    /* renamed from: e */
    public String f185867e;

    /* renamed from: f */
    public long f185868f;

    /* renamed from: g */
    public int f185869g;

    /* renamed from: h */
    public C89349b f185870h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof va4)) {
            return false;
        }
        va4 va4 = (va4) aVar;
        return C46238a.m51546a(this.f185866d, va4.f185866d) && C46238a.m51546a(this.f185867e, va4.f185867e) && C46238a.m51546a(Long.valueOf(this.f185868f), Long.valueOf(va4.f185868f)) && C46238a.m51546a(Integer.valueOf(this.f185869g), Integer.valueOf(va4.f185869g)) && C46238a.m51546a(this.f185870h, va4.f185870h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185866d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185867e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f185868f);
            aVar.mo74318e(4, this.f185869g);
            C89349b bVar = this.f185870h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f185866d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185867e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int h = i2 + C52418a.m58681h(3, this.f185868f) + C52418a.m58678e(4, this.f185869g);
            C89349b bVar2 = this.f185870h;
            return bVar2 != null ? h + C52418a.m58675b(5, bVar2) : h;
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
            va4 va4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                va4.f185866d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                va4.f185867e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                va4.f185868f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                va4.f185869g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                va4.f185870h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
