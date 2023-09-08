package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.i2 */
public class C47599i2 extends C101820nt3 {

    /* renamed from: d */
    public int f127779d;

    /* renamed from: e */
    public int f127780e;

    /* renamed from: f */
    public String f127781f;

    /* renamed from: g */
    public LinkedList<String> f127782g = new LinkedList<>();

    /* renamed from: h */
    public String f127783h;

    /* renamed from: i */
    public int f127784i;

    /* renamed from: j */
    public boolean f127785j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47599i2)) {
            return false;
        }
        C47599i2 i2Var = (C47599i2) aVar;
        return C46238a.m51546a(this.BaseRequest, i2Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f127779d), Integer.valueOf(i2Var.f127779d)) && C46238a.m51546a(Integer.valueOf(this.f127780e), Integer.valueOf(i2Var.f127780e)) && C46238a.m51546a(this.f127781f, i2Var.f127781f) && C46238a.m51546a(this.f127782g, i2Var.f127782g) && C46238a.m51546a(this.f127783h, i2Var.f127783h) && C46238a.m51546a(Integer.valueOf(this.f127784i), Integer.valueOf(i2Var.f127784i)) && C46238a.m51546a(Boolean.valueOf(this.f127785j), Boolean.valueOf(i2Var.f127785j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127781f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f127779d);
                aVar.mo74318e(3, this.f127780e);
                String str = this.f127781f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74320g(5, 1, this.f127782g);
                String str2 = this.f127783h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74318e(7, this.f127784i);
                aVar.mo74314a(8, this.f127785j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f127779d) + C52418a.m58678e(3, this.f127780e);
            String str3 = this.f127781f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int g = e + C52418a.m58680g(5, 1, this.f127782g);
            String str4 = this.f127783h;
            if (str4 != null) {
                g += C52418a.m58683j(6, str4);
            }
            return g + C52418a.m58678e(7, this.f127784i) + C52418a.m58674a(8, this.f127785j);
        } else if (i == 2) {
            this.f127782g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127781f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47599i2 i2Var = objArr[1];
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
                        i2Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    i2Var.f127779d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    i2Var.f127780e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    i2Var.f127781f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    i2Var.f127782g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    i2Var.f127783h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    i2Var.f127784i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    i2Var.f127785j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
