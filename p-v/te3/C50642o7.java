package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o7 */
public class C50642o7 extends C47465a {

    /* renamed from: d */
    public String f138990d;

    /* renamed from: e */
    public C50094k80 f138991e;

    /* renamed from: f */
    public String f138992f;

    /* renamed from: g */
    public int f138993g;

    /* renamed from: h */
    public int f138994h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50642o7)) {
            return false;
        }
        C50642o7 o7Var = (C50642o7) aVar;
        return C46238a.m51546a(this.f138990d, o7Var.f138990d) && C46238a.m51546a(this.f138991e, o7Var.f138991e) && C46238a.m51546a(this.f138992f, o7Var.f138992f) && C46238a.m51546a(Integer.valueOf(this.f138993g), Integer.valueOf(o7Var.f138993g)) && C46238a.m51546a(Integer.valueOf(this.f138994h), Integer.valueOf(o7Var.f138994h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138990d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: ProductID");
            } else if (this.f138991e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C50094k80 k802 = this.f138991e;
                if (k802 != null) {
                    aVar.mo74322i(2, k802.computeSize());
                    this.f138991e.writeFields(aVar);
                }
                String str2 = this.f138992f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f138993g);
                aVar.mo74318e(5, this.f138994h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Price");
            }
        } else if (i == 1) {
            String str3 = this.f138990d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C50094k80 k803 = this.f138991e;
            if (k803 != null) {
                i2 += C52418a.m58682i(2, k803.computeSize());
            }
            String str4 = this.f138992f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f138993g) + C52418a.m58678e(5, this.f138994h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138990d == null) {
                throw new C52419b("Not all required fields were included: ProductID");
            } else if (this.f138991e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Price");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50642o7 o7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o7Var.f138990d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50094k80 k804 = new C50094k80();
                    if (bArr != null && bArr.length > 0) {
                        k804.parseFrom(bArr);
                    }
                    o7Var.f138991e = k804;
                }
                return 0;
            } else if (intValue == 3) {
                o7Var.f138992f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                o7Var.f138993g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                o7Var.f138994h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
