package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o0 */
public class C50616o0 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C51854wn> f138867d = new LinkedList<>();

    /* renamed from: e */
    public int f138868e;

    /* renamed from: f */
    public String f138869f;

    /* renamed from: g */
    public String f138870g;

    /* renamed from: h */
    public int f138871h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50616o0)) {
            return false;
        }
        C50616o0 o0Var = (C50616o0) aVar;
        return C46238a.m51546a(this.BaseRequest, o0Var.BaseRequest) && C46238a.m51546a(this.f138867d, o0Var.f138867d) && C46238a.m51546a(Integer.valueOf(this.f138868e), Integer.valueOf(o0Var.f138868e)) && C46238a.m51546a(this.f138869f, o0Var.f138869f) && C46238a.m51546a(this.f138870g, o0Var.f138870g) && C46238a.m51546a(Integer.valueOf(this.f138871h), Integer.valueOf(o0Var.f138871h));
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
            aVar.mo74320g(2, 8, this.f138867d);
            aVar.mo74318e(3, this.f138868e);
            String str = this.f138869f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f138870g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f138871h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138867d) + C52418a.m58678e(3, this.f138868e);
            String str3 = this.f138869f;
            if (str3 != null) {
                g += C52418a.m58683j(4, str3);
            }
            String str4 = this.f138870g;
            if (str4 != null) {
                g += C52418a.m58683j(5, str4);
            }
            return g + C52418a.m58678e(6, this.f138871h);
        } else if (i == 2) {
            this.f138867d.clear();
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
            C50616o0 o0Var = objArr[1];
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
                        o0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51854wn wnVar = new C51854wn();
                        if (bArr2 != null && bArr2.length > 0) {
                            wnVar.parseFrom(bArr2);
                        }
                        o0Var.f138867d.add(wnVar);
                    }
                    return 0;
                case 3:
                    o0Var.f138868e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o0Var.f138869f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o0Var.f138870g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o0Var.f138871h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
