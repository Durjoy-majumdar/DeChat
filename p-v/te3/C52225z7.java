package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z7 */
public class C52225z7 extends C101820nt3 {

    /* renamed from: d */
    public String f145731d;

    /* renamed from: e */
    public LinkedList<String> f145732e = new LinkedList<>();

    /* renamed from: f */
    public boolean f145733f;

    /* renamed from: g */
    public int f145734g;

    /* renamed from: h */
    public int f145735h;

    /* renamed from: i */
    public int f145736i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52225z7)) {
            return false;
        }
        C52225z7 z7Var = (C52225z7) aVar;
        return C46238a.m51546a(this.BaseRequest, z7Var.BaseRequest) && C46238a.m51546a(this.f145731d, z7Var.f145731d) && C46238a.m51546a(this.f145732e, z7Var.f145732e) && C46238a.m51546a(Boolean.valueOf(this.f145733f), Boolean.valueOf(z7Var.f145733f)) && C46238a.m51546a(Integer.valueOf(this.f145734g), Integer.valueOf(z7Var.f145734g)) && C46238a.m51546a(Integer.valueOf(this.f145735h), Integer.valueOf(z7Var.f145735h)) && C46238a.m51546a(Integer.valueOf(this.f145736i), Integer.valueOf(z7Var.f145736i));
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
            String str = this.f145731d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f145732e);
            aVar.mo74314a(4, this.f145733f);
            aVar.mo74318e(5, this.f145734g);
            aVar.mo74318e(6, this.f145735h);
            aVar.mo74318e(7, this.f145736i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f145731d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 1, this.f145732e) + C52418a.m58674a(4, this.f145733f) + C52418a.m58678e(5, this.f145734g) + C52418a.m58678e(6, this.f145735h) + C52418a.m58678e(7, this.f145736i);
        } else if (i == 2) {
            this.f145732e.clear();
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
            C52225z7 z7Var = objArr[1];
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
                        z7Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    z7Var.f145731d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    z7Var.f145732e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    z7Var.f145733f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    z7Var.f145734g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    z7Var.f145735h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    z7Var.f145736i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
