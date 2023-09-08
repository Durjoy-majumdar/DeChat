package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.x0 */
public class C52862x0 extends C101820nt3 {

    /* renamed from: d */
    public int f147647d;

    /* renamed from: e */
    public C65684l0 f147648e;

    /* renamed from: f */
    public String f147649f;

    /* renamed from: g */
    public int f147650g;

    /* renamed from: h */
    public int f147651h;

    /* renamed from: i */
    public int f147652i;

    /* renamed from: j */
    public String f147653j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52862x0)) {
            return false;
        }
        C52862x0 x0Var = (C52862x0) aVar;
        return C46238a.m51546a(this.BaseRequest, x0Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f147647d), Integer.valueOf(x0Var.f147647d)) && C46238a.m51546a(this.f147648e, x0Var.f147648e) && C46238a.m51546a(this.f147649f, x0Var.f147649f) && C46238a.m51546a(Integer.valueOf(this.f147650g), Integer.valueOf(x0Var.f147650g)) && C46238a.m51546a(Integer.valueOf(this.f147651h), Integer.valueOf(x0Var.f147651h)) && C46238a.m51546a(Integer.valueOf(this.f147652i), Integer.valueOf(x0Var.f147652i)) && C46238a.m51546a(this.f147653j, x0Var.f147653j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f147647d);
            C65684l0 l0Var = this.f147648e;
            if (l0Var != null) {
                aVar.mo74322i(3, l0Var.computeSize());
                this.f147648e.writeFields(aVar);
            }
            String str = this.f147649f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f147650g);
            aVar.mo74318e(6, this.f147651h);
            aVar.mo74318e(7, this.f147652i);
            String str2 = this.f147653j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f147647d);
            C65684l0 l0Var2 = this.f147648e;
            if (l0Var2 != null) {
                e += C52418a.m58682i(3, l0Var2.computeSize());
            }
            String str3 = this.f147649f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f147650g) + C52418a.m58678e(6, this.f147651h) + C52418a.m58678e(7, this.f147652i);
            String str4 = this.f147653j;
            return str4 != null ? e2 + C52418a.m58683j(8, str4) : e2;
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
            C52862x0 x0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        x0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    x0Var.f147647d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C65684l0 l0Var3 = new C65684l0();
                        if (bArr2 != null && bArr2.length > 0) {
                            l0Var3.parseFrom(bArr2);
                        }
                        x0Var.f147648e = l0Var3;
                    }
                    return 0;
                case 4:
                    x0Var.f147649f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x0Var.f147650g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    x0Var.f147651h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    x0Var.f147652i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    x0Var.f147653j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
