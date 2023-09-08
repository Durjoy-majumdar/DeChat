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

/* renamed from: py1.y1 */
public class C47706y1 extends C101820nt3 {

    /* renamed from: d */
    public String f128154d;

    /* renamed from: e */
    public LinkedList<String> f128155e = new LinkedList<>();

    /* renamed from: f */
    public String f128156f;

    /* renamed from: g */
    public C47590h0 f128157g;

    /* renamed from: h */
    public int f128158h;

    /* renamed from: i */
    public boolean f128159i;

    /* renamed from: j */
    public int f128160j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47706y1)) {
            return false;
        }
        C47706y1 y1Var = (C47706y1) aVar;
        return C46238a.m51546a(this.BaseRequest, y1Var.BaseRequest) && C46238a.m51546a(this.f128154d, y1Var.f128154d) && C46238a.m51546a(this.f128155e, y1Var.f128155e) && C46238a.m51546a(this.f128156f, y1Var.f128156f) && C46238a.m51546a(this.f128157g, y1Var.f128157g) && C46238a.m51546a(Integer.valueOf(this.f128158h), Integer.valueOf(y1Var.f128158h)) && C46238a.m51546a(Boolean.valueOf(this.f128159i), Boolean.valueOf(y1Var.f128159i)) && C46238a.m51546a(Integer.valueOf(this.f128160j), Integer.valueOf(y1Var.f128160j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f128154d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f128154d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 1, this.f128155e);
                String str2 = this.f128156f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C47590h0 h0Var = this.f128157g;
                if (h0Var != null) {
                    aVar.mo74322i(5, h0Var.computeSize());
                    this.f128157g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f128158h);
                aVar.mo74314a(7, this.f128159i);
                aVar.mo74318e(8, this.f128160j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f128154d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f128155e);
            String str4 = this.f128156f;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            C47590h0 h0Var2 = this.f128157g;
            if (h0Var2 != null) {
                g += C52418a.m58682i(5, h0Var2.computeSize());
            }
            return g + C52418a.m58678e(6, this.f128158h) + C52418a.m58674a(7, this.f128159i) + C52418a.m58678e(8, this.f128160j);
        } else if (i == 2) {
            this.f128155e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128154d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47706y1 y1Var = objArr[1];
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
                        y1Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    y1Var.f128154d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    y1Var.f128155e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    y1Var.f128156f = aVar3.mo141633k(intValue);
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
                        y1Var.f128157g = h0Var3;
                    }
                    return 0;
                case 6:
                    y1Var.f128158h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    y1Var.f128159i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    y1Var.f128160j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
