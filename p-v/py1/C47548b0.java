package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.b0 */
public class C47548b0 extends C47465a {

    /* renamed from: d */
    public String f127584d;

    /* renamed from: e */
    public String f127585e;

    /* renamed from: f */
    public String f127586f;

    /* renamed from: g */
    public C47679t5 f127587g;

    /* renamed from: h */
    public int f127588h;

    /* renamed from: i */
    public int f127589i;

    /* renamed from: j */
    public String f127590j;

    /* renamed from: n */
    public int f127591n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47548b0)) {
            return false;
        }
        C47548b0 b0Var = (C47548b0) aVar;
        return C46238a.m51546a(this.f127584d, b0Var.f127584d) && C46238a.m51546a(this.f127585e, b0Var.f127585e) && C46238a.m51546a(this.f127586f, b0Var.f127586f) && C46238a.m51546a(this.f127587g, b0Var.f127587g) && C46238a.m51546a(Integer.valueOf(this.f127588h), Integer.valueOf(b0Var.f127588h)) && C46238a.m51546a(Integer.valueOf(this.f127589i), Integer.valueOf(b0Var.f127589i)) && C46238a.m51546a(this.f127590j, b0Var.f127590j) && C46238a.m51546a(Integer.valueOf(this.f127591n), Integer.valueOf(b0Var.f127591n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127584d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127585e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127586f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                C47679t5 t5Var = this.f127587g;
                if (t5Var != null) {
                    aVar.mo74322i(5, t5Var.computeSize());
                    this.f127587g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f127588h);
                aVar.mo74318e(7, this.f127589i);
                String str4 = this.f127590j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74318e(9, this.f127591n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: DownloadURL");
        } else if (i == 1) {
            String str5 = this.f127584d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f127585e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f127586f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            C47679t5 t5Var2 = this.f127587g;
            if (t5Var2 != null) {
                i2 += C52418a.m58682i(5, t5Var2.computeSize());
            }
            int e = i2 + C52418a.m58678e(6, this.f127588h) + C52418a.m58678e(7, this.f127589i);
            String str8 = this.f127590j;
            if (str8 != null) {
                e += C52418a.m58683j(8, str8);
            }
            return e + C52418a.m58678e(9, this.f127591n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127584d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DownloadURL");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47548b0 b0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b0Var.f127584d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    b0Var.f127585e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b0Var.f127586f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47679t5 t5Var3 = new C47679t5();
                        if (bArr != null && bArr.length > 0) {
                            t5Var3.parseFrom(bArr);
                        }
                        b0Var.f127587g = t5Var3;
                    }
                    return 0;
                case 6:
                    b0Var.f127588h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    b0Var.f127589i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    b0Var.f127590j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    b0Var.f127591n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
