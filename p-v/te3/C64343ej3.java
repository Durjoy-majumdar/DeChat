package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ej3 */
public class C64343ej3 extends C49335eu3 {

    /* renamed from: d */
    public int f182983d;

    /* renamed from: e */
    public long f182984e;

    /* renamed from: f */
    public int f182985f;

    /* renamed from: g */
    public int f182986g;

    /* renamed from: h */
    public int f182987h;

    /* renamed from: i */
    public int f182988i;

    /* renamed from: j */
    public int f182989j;

    /* renamed from: n */
    public String f182990n;

    /* renamed from: o */
    public int f182991o;

    /* renamed from: p */
    public String f182992p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64343ej3)) {
            return false;
        }
        C64343ej3 ej32 = (C64343ej3) aVar;
        return C46238a.m51546a(this.BaseResponse, ej32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182983d), Integer.valueOf(ej32.f182983d)) && C46238a.m51546a(Long.valueOf(this.f182984e), Long.valueOf(ej32.f182984e)) && C46238a.m51546a(Integer.valueOf(this.f182985f), Integer.valueOf(ej32.f182985f)) && C46238a.m51546a(Integer.valueOf(this.f182986g), Integer.valueOf(ej32.f182986g)) && C46238a.m51546a(Integer.valueOf(this.f182987h), Integer.valueOf(ej32.f182987h)) && C46238a.m51546a(Integer.valueOf(this.f182988i), Integer.valueOf(ej32.f182988i)) && C46238a.m51546a(Integer.valueOf(this.f182989j), Integer.valueOf(ej32.f182989j)) && C46238a.m51546a(this.f182990n, ej32.f182990n) && C46238a.m51546a(Integer.valueOf(this.f182991o), Integer.valueOf(ej32.f182991o)) && C46238a.m51546a(this.f182992p, ej32.f182992p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f182983d);
                aVar.mo74321h(4, this.f182984e);
                aVar.mo74318e(5, this.f182985f);
                aVar.mo74318e(6, this.f182986g);
                aVar.mo74318e(7, this.f182987h);
                aVar.mo74318e(8, this.f182988i);
                aVar.mo74318e(9, this.f182989j);
                String str = this.f182990n;
                if (str != null) {
                    aVar.mo74323j(10, str);
                }
                aVar.mo74318e(11, this.f182991o);
                String str2 = this.f182992p;
                if (str2 != null) {
                    aVar.mo74323j(12, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f182983d) + C52418a.m58681h(4, this.f182984e) + C52418a.m58678e(5, this.f182985f) + C52418a.m58678e(6, this.f182986g) + C52418a.m58678e(7, this.f182987h) + C52418a.m58678e(8, this.f182988i) + C52418a.m58678e(9, this.f182989j);
            String str3 = this.f182990n;
            if (str3 != null) {
                e += C52418a.m58683j(10, str3);
            }
            int e2 = e + C52418a.m58678e(11, this.f182991o);
            String str4 = this.f182992p;
            return str4 != null ? e2 + C52418a.m58683j(12, str4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64343ej3 ej32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ej32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 3:
                    ej32.f182983d = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ej32.f182984e = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ej32.f182985f = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ej32.f182986g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ej32.f182987h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ej32.f182988i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ej32.f182989j = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ej32.f182990n = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ej32.f182991o = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ej32.f182992p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
