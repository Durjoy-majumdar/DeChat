package p821rk;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: rk.k */
public class C48038k extends C101820nt3 {

    /* renamed from: d */
    public String f128850d;

    /* renamed from: e */
    public String f128851e;

    /* renamed from: f */
    public String f128852f;

    /* renamed from: g */
    public String f128853g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48038k)) {
            return false;
        }
        C48038k kVar = (C48038k) aVar;
        return C46238a.m51546a(this.BaseRequest, kVar.BaseRequest) && C46238a.m51546a(this.f128850d, kVar.f128850d) && C46238a.m51546a(this.f128851e, kVar.f128851e) && C46238a.m51546a(this.f128852f, kVar.f128852f) && C46238a.m51546a(this.f128853g, kVar.f128853g);
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
            String str = this.f128850d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f128851e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f128852f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f128853g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f128850d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f128851e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f128852f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f128853g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            C48038k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    kVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kVar.f128850d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kVar.f128851e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                kVar.f128852f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kVar.f128853g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
