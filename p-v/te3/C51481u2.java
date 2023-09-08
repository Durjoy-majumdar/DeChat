package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u2 */
public class C51481u2 extends C101820nt3 {

    /* renamed from: d */
    public String f142556d;

    /* renamed from: e */
    public C89349b f142557e;

    /* renamed from: f */
    public String f142558f;

    /* renamed from: g */
    public int f142559g;

    /* renamed from: h */
    public String f142560h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51481u2)) {
            return false;
        }
        C51481u2 u2Var = (C51481u2) aVar;
        return C46238a.m51546a(this.BaseRequest, u2Var.BaseRequest) && C46238a.m51546a(this.f142556d, u2Var.f142556d) && C46238a.m51546a(this.f142557e, u2Var.f142557e) && C46238a.m51546a(this.f142558f, u2Var.f142558f) && C46238a.m51546a(Integer.valueOf(this.f142559g), Integer.valueOf(u2Var.f142559g)) && C46238a.m51546a(this.f142560h, u2Var.f142560h);
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
            String str = this.f142556d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f142557e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f142558f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f142559g);
            String str3 = this.f142560h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f142556d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C89349b bVar2 = this.f142557e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str5 = this.f142558f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            int e = i2 + C52418a.m58678e(5, this.f142559g);
            String str6 = this.f142560h;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C51481u2 u2Var = objArr[1];
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
                        u2Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    u2Var.f142556d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u2Var.f142557e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    u2Var.f142558f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u2Var.f142559g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    u2Var.f142560h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
