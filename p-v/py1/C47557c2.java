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

/* renamed from: py1.c2 */
public class C47557c2 extends C101820nt3 {

    /* renamed from: d */
    public String f127618d;

    /* renamed from: e */
    public LinkedList<String> f127619e = new LinkedList<>();

    /* renamed from: f */
    public String f127620f;

    /* renamed from: g */
    public C47590h0 f127621g;

    /* renamed from: h */
    public int f127622h;

    /* renamed from: i */
    public boolean f127623i;

    /* renamed from: j */
    public int f127624j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47557c2)) {
            return false;
        }
        C47557c2 c2Var = (C47557c2) aVar;
        return C46238a.m51546a(this.BaseRequest, c2Var.BaseRequest) && C46238a.m51546a(this.f127618d, c2Var.f127618d) && C46238a.m51546a(this.f127619e, c2Var.f127619e) && C46238a.m51546a(this.f127620f, c2Var.f127620f) && C46238a.m51546a(this.f127621g, c2Var.f127621g) && C46238a.m51546a(Integer.valueOf(this.f127622h), Integer.valueOf(c2Var.f127622h)) && C46238a.m51546a(Boolean.valueOf(this.f127623i), Boolean.valueOf(c2Var.f127623i)) && C46238a.m51546a(Integer.valueOf(this.f127624j), Integer.valueOf(c2Var.f127624j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127618d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f127618d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 1, this.f127619e);
                String str2 = this.f127620f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C47590h0 h0Var = this.f127621g;
                if (h0Var != null) {
                    aVar.mo74322i(5, h0Var.computeSize());
                    this.f127621g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f127622h);
                aVar.mo74314a(7, this.f127623i);
                aVar.mo74318e(8, this.f127624j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f127618d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f127619e);
            String str4 = this.f127620f;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            C47590h0 h0Var2 = this.f127621g;
            if (h0Var2 != null) {
                g += C52418a.m58682i(5, h0Var2.computeSize());
            }
            return g + C52418a.m58678e(6, this.f127622h) + C52418a.m58674a(7, this.f127623i) + C52418a.m58678e(8, this.f127624j);
        } else if (i == 2) {
            this.f127619e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127618d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47557c2 c2Var = objArr[1];
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
                        c2Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    c2Var.f127618d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c2Var.f127619e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    c2Var.f127620f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47590h0 h0Var3 = new C47590h0();
                        if (bArr2 != null && bArr2.length > 0) {
                            h0Var3.parseFrom(bArr2);
                        }
                        c2Var.f127621g = h0Var3;
                    }
                    return 0;
                case 6:
                    c2Var.f127622h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    c2Var.f127623i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    c2Var.f127624j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
