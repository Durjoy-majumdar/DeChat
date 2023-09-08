package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k0 */
public class C50058k0 extends C47465a {

    /* renamed from: d */
    public int f136480d;

    /* renamed from: e */
    public int f136481e;

    /* renamed from: f */
    public LinkedList<C49776i0> f136482f = new LinkedList<>();

    /* renamed from: g */
    public int f136483g;

    /* renamed from: h */
    public int f136484h;

    /* renamed from: i */
    public LinkedList<C49776i0> f136485i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50058k0)) {
            return false;
        }
        C50058k0 k0Var = (C50058k0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136480d), Integer.valueOf(k0Var.f136480d)) && C46238a.m51546a(Integer.valueOf(this.f136481e), Integer.valueOf(k0Var.f136481e)) && C46238a.m51546a(this.f136482f, k0Var.f136482f) && C46238a.m51546a(Integer.valueOf(this.f136483g), Integer.valueOf(k0Var.f136483g)) && C46238a.m51546a(Integer.valueOf(this.f136484h), Integer.valueOf(k0Var.f136484h)) && C46238a.m51546a(this.f136485i, k0Var.f136485i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136480d);
            aVar.mo74318e(2, this.f136481e);
            aVar.mo74320g(3, 8, this.f136482f);
            aVar.mo74318e(4, this.f136483g);
            aVar.mo74318e(5, this.f136484h);
            aVar.mo74320g(6, 8, this.f136485i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136480d) + 0 + C52418a.m58678e(2, this.f136481e) + C52418a.m58680g(3, 8, this.f136482f) + C52418a.m58678e(4, this.f136483g) + C52418a.m58678e(5, this.f136484h) + C52418a.m58680g(6, 8, this.f136485i);
        } else {
            if (i == 2) {
                this.f136482f.clear();
                this.f136485i.clear();
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
                C50058k0 k0Var = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        k0Var.f136480d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        k0Var.f136481e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C49776i0 i0Var = new C49776i0();
                            if (bArr != null && bArr.length > 0) {
                                i0Var.parseFrom(bArr);
                            }
                            k0Var.f136482f.add(i0Var);
                        }
                        return 0;
                    case 4:
                        k0Var.f136483g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        k0Var.f136484h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            byte[] bArr2 = j2.get(i3);
                            C49776i0 i0Var2 = new C49776i0();
                            if (bArr2 != null && bArr2.length > 0) {
                                i0Var2.parseFrom(bArr2);
                            }
                            k0Var.f136485i.add(i0Var2);
                        }
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
