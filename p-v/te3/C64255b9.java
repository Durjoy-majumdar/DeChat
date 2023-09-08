package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b9 */
public class C64255b9 extends C101820nt3 {

    /* renamed from: d */
    public int f182233d;

    /* renamed from: e */
    public LinkedList<C64844xz> f182234e = new LinkedList<>();

    /* renamed from: f */
    public String f182235f;

    /* renamed from: g */
    public String f182236g;

    /* renamed from: h */
    public int f182237h;

    /* renamed from: i */
    public long f182238i;

    /* renamed from: j */
    public String f182239j;

    /* renamed from: n */
    public String f182240n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64255b9)) {
            return false;
        }
        C64255b9 b9Var = (C64255b9) aVar;
        return C46238a.m51546a(this.BaseRequest, b9Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f182233d), Integer.valueOf(b9Var.f182233d)) && C46238a.m51546a(this.f182234e, b9Var.f182234e) && C46238a.m51546a(this.f182235f, b9Var.f182235f) && C46238a.m51546a(this.f182236g, b9Var.f182236g) && C46238a.m51546a(Integer.valueOf(this.f182237h), Integer.valueOf(b9Var.f182237h)) && C46238a.m51546a(Long.valueOf(this.f182238i), Long.valueOf(b9Var.f182238i)) && C46238a.m51546a(this.f182239j, b9Var.f182239j) && C46238a.m51546a(this.f182240n, b9Var.f182240n);
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
            aVar.mo74318e(2, this.f182233d);
            aVar.mo74320g(3, 8, this.f182234e);
            String str = this.f182235f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f182236g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f182237h);
            aVar.mo74321h(7, this.f182238i);
            String str3 = this.f182239j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f182240n;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182233d) + C52418a.m58680g(3, 8, this.f182234e);
            String str5 = this.f182235f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f182236g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int e2 = e + C52418a.m58678e(6, this.f182237h) + C52418a.m58681h(7, this.f182238i);
            String str7 = this.f182239j;
            if (str7 != null) {
                e2 += C52418a.m58683j(8, str7);
            }
            String str8 = this.f182240n;
            return str8 != null ? e2 + C52418a.m58683j(9, str8) : e2;
        } else if (i == 2) {
            this.f182234e.clear();
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
            C64255b9 b9Var = objArr[1];
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
                        b9Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    b9Var.f182233d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64844xz xzVar = new C64844xz();
                        if (bArr2 != null && bArr2.length > 0) {
                            xzVar.parseFrom(bArr2);
                        }
                        b9Var.f182234e.add(xzVar);
                    }
                    return 0;
                case 4:
                    b9Var.f182235f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b9Var.f182236g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    b9Var.f182237h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    b9Var.f182238i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    b9Var.f182239j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    b9Var.f182240n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
