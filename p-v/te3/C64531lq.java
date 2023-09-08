package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lq */
public class C64531lq extends C101820nt3 {

    /* renamed from: d */
    public int f184143d;

    /* renamed from: e */
    public int f184144e;

    /* renamed from: f */
    public String f184145f;

    /* renamed from: g */
    public String f184146g;

    /* renamed from: h */
    public int f184147h;

    /* renamed from: i */
    public C89349b f184148i;

    /* renamed from: j */
    public boolean f184149j = false;

    /* renamed from: n */
    public String f184150n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64531lq)) {
            return false;
        }
        C64531lq lqVar = (C64531lq) aVar;
        return C46238a.m51546a(this.BaseRequest, lqVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184143d), Integer.valueOf(lqVar.f184143d)) && C46238a.m51546a(Integer.valueOf(this.f184144e), Integer.valueOf(lqVar.f184144e)) && C46238a.m51546a(this.f184145f, lqVar.f184145f) && C46238a.m51546a(this.f184146g, lqVar.f184146g) && C46238a.m51546a(Integer.valueOf(this.f184147h), Integer.valueOf(lqVar.f184147h)) && C46238a.m51546a(this.f184148i, lqVar.f184148i) && C46238a.m51546a(Boolean.valueOf(this.f184149j), Boolean.valueOf(lqVar.f184149j)) && C46238a.m51546a(this.f184150n, lqVar.f184150n);
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
            aVar.mo74318e(2, this.f184143d);
            aVar.mo74318e(3, this.f184144e);
            String str = this.f184145f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f184146g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f184147h);
            C89349b bVar = this.f184148i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74314a(8, this.f184149j);
            String str3 = this.f184150n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184143d) + C52418a.m58678e(3, this.f184144e);
            String str4 = this.f184145f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f184146g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int e2 = e + C52418a.m58678e(6, this.f184147h);
            C89349b bVar2 = this.f184148i;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(7, bVar2);
            }
            int a = e2 + C52418a.m58674a(8, this.f184149j);
            String str6 = this.f184150n;
            return str6 != null ? a + C52418a.m58683j(9, str6) : a;
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
            C64531lq lqVar = objArr[1];
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
                        lqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    lqVar.f184143d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lqVar.f184144e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    lqVar.f184145f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lqVar.f184146g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lqVar.f184147h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    lqVar.f184148i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    lqVar.f184149j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    lqVar.f184150n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
