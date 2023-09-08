package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ra1 */
public class C51079ra1 extends C47465a {

    /* renamed from: d */
    public int f140784d;

    /* renamed from: e */
    public String f140785e;

    /* renamed from: f */
    public LinkedList<C52311zv> f140786f = new LinkedList<>();

    /* renamed from: g */
    public int f140787g;

    /* renamed from: h */
    public String f140788h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51079ra1)) {
            return false;
        }
        C51079ra1 ra12 = (C51079ra1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140784d), Integer.valueOf(ra12.f140784d)) && C46238a.m51546a(this.f140785e, ra12.f140785e) && C46238a.m51546a(this.f140786f, ra12.f140786f) && C46238a.m51546a(Integer.valueOf(this.f140787g), Integer.valueOf(ra12.f140787g)) && C46238a.m51546a(this.f140788h, ra12.f140788h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140784d);
            String str = this.f140785e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f140786f);
            aVar.mo74318e(4, this.f140787g);
            String str2 = this.f140788h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140784d) + 0;
            String str3 = this.f140785e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int g = e + C52418a.m58680g(3, 8, this.f140786f) + C52418a.m58678e(4, this.f140787g);
            String str4 = this.f140788h;
            return str4 != null ? g + C52418a.m58683j(5, str4) : g;
        } else if (i == 2) {
            this.f140786f.clear();
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
            C51079ra1 ra12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ra12.f140784d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ra12.f140785e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52311zv zvVar = new C52311zv();
                    if (bArr != null && bArr.length > 0) {
                        zvVar.parseFrom(bArr);
                    }
                    ra12.f140786f.add(zvVar);
                }
                return 0;
            } else if (intValue == 4) {
                ra12.f140787g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ra12.f140788h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
