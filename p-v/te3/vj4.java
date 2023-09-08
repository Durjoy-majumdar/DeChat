package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vj4 extends C101820nt3 {

    /* renamed from: d */
    public String f143527d;

    /* renamed from: e */
    public int f143528e;

    /* renamed from: f */
    public C51979xi2 f143529f;

    /* renamed from: g */
    public LinkedList<C52064y4> f143530g = new LinkedList<>();

    /* renamed from: h */
    public String f143531h;

    /* renamed from: i */
    public String f143532i;

    /* renamed from: j */
    public C52178yw3 f143533j;

    /* renamed from: n */
    public int f143534n;

    /* renamed from: o */
    public C49388f7 f143535o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vj4)) {
            return false;
        }
        vj4 vj4 = (vj4) aVar;
        return C46238a.m51546a(this.BaseRequest, vj4.BaseRequest) && C46238a.m51546a(this.f143527d, vj4.f143527d) && C46238a.m51546a(Integer.valueOf(this.f143528e), Integer.valueOf(vj4.f143528e)) && C46238a.m51546a(this.f143529f, vj4.f143529f) && C46238a.m51546a(this.f143530g, vj4.f143530g) && C46238a.m51546a(this.f143531h, vj4.f143531h) && C46238a.m51546a(this.f143532i, vj4.f143532i) && C46238a.m51546a(this.f143533j, vj4.f143533j) && C46238a.m51546a(Integer.valueOf(this.f143534n), Integer.valueOf(vj4.f143534n)) && C46238a.m51546a(this.f143535o, vj4.f143535o);
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
            String str = this.f143527d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f143528e);
            C51979xi2 xi22 = this.f143529f;
            if (xi22 != null) {
                aVar.mo74322i(4, xi22.computeSize());
                this.f143529f.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f143530g);
            String str2 = this.f143531h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f143532i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            C52178yw3 yw32 = this.f143533j;
            if (yw32 != null) {
                aVar.mo74322i(10, yw32.computeSize());
                this.f143533j.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f143534n);
            C49388f7 f7Var = this.f143535o;
            if (f7Var != null) {
                aVar.mo74322i(12, f7Var.computeSize());
                this.f143535o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f143527d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f143528e);
            C51979xi2 xi23 = this.f143529f;
            if (xi23 != null) {
                e += C52418a.m58682i(4, xi23.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f143530g);
            String str5 = this.f143531h;
            if (str5 != null) {
                g += C52418a.m58683j(6, str5);
            }
            String str6 = this.f143532i;
            if (str6 != null) {
                g += C52418a.m58683j(7, str6);
            }
            C52178yw3 yw33 = this.f143533j;
            if (yw33 != null) {
                g += C52418a.m58682i(10, yw33.computeSize());
            }
            int e2 = g + C52418a.m58678e(11, this.f143534n);
            C49388f7 f7Var2 = this.f143535o;
            return f7Var2 != null ? e2 + C52418a.m58682i(12, f7Var2.computeSize()) : e2;
        } else if (i == 2) {
            this.f143530g.clear();
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
            vj4 vj4 = objArr[1];
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
                        vj4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    vj4.f143527d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vj4.f143528e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51979xi2 xi24 = new C51979xi2();
                        if (bArr2 != null && bArr2.length > 0) {
                            xi24.parseFrom(bArr2);
                        }
                        vj4.f143529f = xi24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52064y4 y4Var = new C52064y4();
                        if (bArr3 != null && bArr3.length > 0) {
                            y4Var.parseFrom(bArr3);
                        }
                        vj4.f143530g.add(y4Var);
                    }
                    return 0;
                case 6:
                    vj4.f143531h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vj4.f143532i = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C52178yw3 yw34 = new C52178yw3();
                        if (bArr4 != null && bArr4.length > 0) {
                            yw34.parseFrom(bArr4);
                        }
                        vj4.f143533j = yw34;
                    }
                    return 0;
                case 11:
                    vj4.f143534n = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49388f7 f7Var3 = new C49388f7();
                        if (bArr5 != null && bArr5.length > 0) {
                            f7Var3.parseFrom(bArr5);
                        }
                        vj4.f143535o = f7Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
