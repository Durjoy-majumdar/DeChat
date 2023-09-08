package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u6 */
public class C51497u6 extends C47465a {

    /* renamed from: d */
    public int f142610d;

    /* renamed from: e */
    public String f142611e;

    /* renamed from: f */
    public int f142612f;

    /* renamed from: g */
    public int f142613g;

    /* renamed from: h */
    public C52222z6 f142614h;

    /* renamed from: i */
    public C51348t6 f142615i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51497u6)) {
            return false;
        }
        C51497u6 u6Var = (C51497u6) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142610d), Integer.valueOf(u6Var.f142610d)) && C46238a.m51546a(this.f142611e, u6Var.f142611e) && C46238a.m51546a(Integer.valueOf(this.f142612f), Integer.valueOf(u6Var.f142612f)) && C46238a.m51546a(Integer.valueOf(this.f142613g), Integer.valueOf(u6Var.f142613g)) && C46238a.m51546a(this.f142614h, u6Var.f142614h) && C46238a.m51546a(this.f142615i, u6Var.f142615i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142611e != null) {
                aVar.mo74318e(1, this.f142610d);
                String str = this.f142611e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f142612f);
                aVar.mo74318e(4, this.f142613g);
                C52222z6 z6Var = this.f142614h;
                if (z6Var != null) {
                    aVar.mo74322i(5, z6Var.computeSize());
                    this.f142614h.writeFields(aVar);
                }
                C51348t6 t6Var = this.f142615i;
                if (t6Var != null) {
                    aVar.mo74322i(6, t6Var.computeSize());
                    this.f142615i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppId");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142610d) + 0;
            String str2 = this.f142611e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            int e2 = e + C52418a.m58678e(3, this.f142612f) + C52418a.m58678e(4, this.f142613g);
            C52222z6 z6Var2 = this.f142614h;
            if (z6Var2 != null) {
                e2 += C52418a.m58682i(5, z6Var2.computeSize());
            }
            C51348t6 t6Var2 = this.f142615i;
            return t6Var2 != null ? e2 + C52418a.m58682i(6, t6Var2.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142611e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51497u6 u6Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u6Var.f142610d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    u6Var.f142611e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u6Var.f142612f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    u6Var.f142613g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52222z6 z6Var3 = new C52222z6();
                        if (bArr != null && bArr.length > 0) {
                            z6Var3.parseFrom(bArr);
                        }
                        u6Var.f142614h = z6Var3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51348t6 t6Var3 = new C51348t6();
                        if (bArr2 != null && bArr2.length > 0) {
                            t6Var3.parseFrom(bArr2);
                        }
                        u6Var.f142615i = t6Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
