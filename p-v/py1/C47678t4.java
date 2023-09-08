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

/* renamed from: py1.t4 */
public class C47678t4 extends C101820nt3 {

    /* renamed from: d */
    public String f128030d;

    /* renamed from: e */
    public String f128031e;

    /* renamed from: f */
    public String f128032f;

    /* renamed from: g */
    public String f128033g;

    /* renamed from: h */
    public boolean f128034h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47678t4)) {
            return false;
        }
        C47678t4 t4Var = (C47678t4) aVar;
        return C46238a.m51546a(this.BaseRequest, t4Var.BaseRequest) && C46238a.m51546a(this.f128030d, t4Var.f128030d) && C46238a.m51546a(this.f128031e, t4Var.f128031e) && C46238a.m51546a(this.f128032f, t4Var.f128032f) && C46238a.m51546a(this.f128033g, t4Var.f128033g) && C46238a.m51546a(Boolean.valueOf(this.f128034h), Boolean.valueOf(t4Var.f128034h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f128030d == null) {
                throw new C52419b("Not all required fields were included: Lang");
            } else if (this.f128031e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f128030d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f128031e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f128032f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f128033g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74314a(6, this.f128034h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AppID");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f128030d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f128031e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f128032f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f128033g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58674a(6, this.f128034h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128030d == null) {
                throw new C52419b("Not all required fields were included: Lang");
            } else if (this.f128031e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AppID");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47678t4 t4Var = objArr[1];
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
                        t4Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    t4Var.f128030d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t4Var.f128031e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t4Var.f128032f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t4Var.f128033g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t4Var.f128034h = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
