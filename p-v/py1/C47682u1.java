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

/* renamed from: py1.u1 */
public class C47682u1 extends C101820nt3 {

    /* renamed from: d */
    public String f128049d;

    /* renamed from: e */
    public String f128050e;

    /* renamed from: f */
    public boolean f128051f;

    /* renamed from: g */
    public String f128052g;

    /* renamed from: h */
    public boolean f128053h;

    /* renamed from: i */
    public boolean f128054i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47682u1)) {
            return false;
        }
        C47682u1 u1Var = (C47682u1) aVar;
        return C46238a.m51546a(this.BaseRequest, u1Var.BaseRequest) && C46238a.m51546a(this.f128049d, u1Var.f128049d) && C46238a.m51546a(this.f128050e, u1Var.f128050e) && C46238a.m51546a(Boolean.valueOf(this.f128051f), Boolean.valueOf(u1Var.f128051f)) && C46238a.m51546a(this.f128052g, u1Var.f128052g) && C46238a.m51546a(Boolean.valueOf(this.f128053h), Boolean.valueOf(u1Var.f128053h)) && C46238a.m51546a(Boolean.valueOf(this.f128054i), Boolean.valueOf(u1Var.f128054i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f128049d == null) {
                throw new C52419b("Not all required fields were included: Lang");
            } else if (this.f128050e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f128049d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f128050e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74314a(4, this.f128051f);
                String str3 = this.f128052g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74314a(6, this.f128053h);
                aVar.mo74314a(7, this.f128054i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AppID");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f128049d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f128050e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int a = i2 + C52418a.m58674a(4, this.f128051f);
            String str6 = this.f128052g;
            if (str6 != null) {
                a += C52418a.m58683j(5, str6);
            }
            return a + C52418a.m58674a(6, this.f128053h) + C52418a.m58674a(7, this.f128054i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128049d == null) {
                throw new C52419b("Not all required fields were included: Lang");
            } else if (this.f128050e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AppID");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47682u1 u1Var = objArr[1];
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
                        u1Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    u1Var.f128049d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u1Var.f128050e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u1Var.f128051f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    u1Var.f128052g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    u1Var.f128053h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    u1Var.f128054i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
