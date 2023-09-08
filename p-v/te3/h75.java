package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h75 extends C47465a {

    /* renamed from: d */
    public e75 f134481d;

    /* renamed from: e */
    public int f134482e;

    /* renamed from: f */
    public int f134483f;

    /* renamed from: g */
    public int f134484g;

    /* renamed from: h */
    public boolean f134485h;

    /* renamed from: i */
    public int f134486i;

    /* renamed from: j */
    public String f134487j;

    /* renamed from: n */
    public String f134488n;

    /* renamed from: o */
    public int f134489o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h75)) {
            return false;
        }
        h75 h75 = (h75) aVar;
        return C46238a.m51546a(this.f134481d, h75.f134481d) && C46238a.m51546a(Integer.valueOf(this.f134482e), Integer.valueOf(h75.f134482e)) && C46238a.m51546a(Integer.valueOf(this.f134483f), Integer.valueOf(h75.f134483f)) && C46238a.m51546a(Integer.valueOf(this.f134484g), Integer.valueOf(h75.f134484g)) && C46238a.m51546a(Boolean.valueOf(this.f134485h), Boolean.valueOf(h75.f134485h)) && C46238a.m51546a(Integer.valueOf(this.f134486i), Integer.valueOf(h75.f134486i)) && C46238a.m51546a(this.f134487j, h75.f134487j) && C46238a.m51546a(this.f134488n, h75.f134488n) && C46238a.m51546a(Integer.valueOf(this.f134489o), Integer.valueOf(h75.f134489o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f134481d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f134481d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f134482e);
            aVar.mo74318e(3, this.f134483f);
            aVar.mo74318e(4, this.f134484g);
            aVar.mo74314a(5, this.f134485h);
            aVar.mo74318e(6, this.f134486i);
            String str = this.f134487j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f134488n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74318e(9, this.f134489o);
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f134481d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134482e) + C52418a.m58678e(3, this.f134483f) + C52418a.m58678e(4, this.f134484g) + C52418a.m58674a(5, this.f134485h) + C52418a.m58678e(6, this.f134486i);
            String str3 = this.f134487j;
            if (str3 != null) {
                e += C52418a.m58683j(7, str3);
            }
            String str4 = this.f134488n;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            return e + C52418a.m58678e(9, this.f134489o);
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
            h75 h75 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        e75 e753 = new e75();
                        if (bArr != null && bArr.length > 0) {
                            e753.parseFrom(bArr);
                        }
                        h75.f134481d = e753;
                    }
                    return 0;
                case 2:
                    h75.f134482e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    h75.f134483f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    h75.f134484g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    h75.f134485h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    h75.f134486i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    h75.f134487j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    h75.f134488n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    h75.f134489o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
