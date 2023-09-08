package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.y */
public class C52863y extends C101820nt3 {

    /* renamed from: d */
    public int f147654d;

    /* renamed from: e */
    public String f147655e;

    /* renamed from: f */
    public int f147656f;

    /* renamed from: g */
    public int f147657g;

    /* renamed from: h */
    public C52838k0 f147658h;

    /* renamed from: i */
    public String f147659i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52863y)) {
            return false;
        }
        C52863y yVar = (C52863y) aVar;
        return C46238a.m51546a(this.BaseRequest, yVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f147654d), Integer.valueOf(yVar.f147654d)) && C46238a.m51546a(this.f147655e, yVar.f147655e) && C46238a.m51546a(Integer.valueOf(this.f147656f), Integer.valueOf(yVar.f147656f)) && C46238a.m51546a(Integer.valueOf(this.f147657g), Integer.valueOf(yVar.f147657g)) && C46238a.m51546a(this.f147658h, yVar.f147658h) && C46238a.m51546a(this.f147659i, yVar.f147659i);
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
            aVar.mo74318e(2, this.f147654d);
            String str = this.f147655e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f147656f);
            aVar.mo74318e(5, this.f147657g);
            C52838k0 k0Var = this.f147658h;
            if (k0Var != null) {
                aVar.mo74322i(6, k0Var.computeSize());
                this.f147658h.writeFields(aVar);
            }
            String str2 = this.f147659i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f147654d);
            String str3 = this.f147655e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f147656f) + C52418a.m58678e(5, this.f147657g);
            C52838k0 k0Var2 = this.f147658h;
            if (k0Var2 != null) {
                e2 += C52418a.m58682i(6, k0Var2.computeSize());
            }
            String str4 = this.f147659i;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
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
            C52863y yVar = objArr[1];
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
                        yVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    yVar.f147654d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yVar.f147655e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yVar.f147656f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yVar.f147657g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52838k0 k0Var3 = new C52838k0();
                        if (bArr2 != null && bArr2.length > 0) {
                            k0Var3.parseFrom(bArr2);
                        }
                        yVar.f147658h = k0Var3;
                    }
                    return 0;
                case 7:
                    yVar.f147659i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
