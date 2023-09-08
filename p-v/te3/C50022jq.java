package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jq */
public class C50022jq extends C101820nt3 {

    /* renamed from: d */
    public int f136248d;

    /* renamed from: e */
    public int f136249e;

    /* renamed from: f */
    public String f136250f;

    /* renamed from: g */
    public String f136251g;

    /* renamed from: h */
    public long f136252h;

    /* renamed from: i */
    public C89349b f136253i;

    /* renamed from: j */
    public boolean f136254j;

    /* renamed from: n */
    public String f136255n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50022jq)) {
            return false;
        }
        C50022jq jqVar = (C50022jq) aVar;
        return C46238a.m51546a(this.BaseRequest, jqVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f136248d), Integer.valueOf(jqVar.f136248d)) && C46238a.m51546a(Integer.valueOf(this.f136249e), Integer.valueOf(jqVar.f136249e)) && C46238a.m51546a(this.f136250f, jqVar.f136250f) && C46238a.m51546a(this.f136251g, jqVar.f136251g) && C46238a.m51546a(Long.valueOf(this.f136252h), Long.valueOf(jqVar.f136252h)) && C46238a.m51546a(this.f136253i, jqVar.f136253i) && C46238a.m51546a(Boolean.valueOf(this.f136254j), Boolean.valueOf(jqVar.f136254j)) && C46238a.m51546a(this.f136255n, jqVar.f136255n);
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
            aVar.mo74318e(2, this.f136248d);
            aVar.mo74318e(3, this.f136249e);
            String str = this.f136250f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f136251g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(6, this.f136252h);
            C89349b bVar = this.f136253i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74314a(8, this.f136254j);
            String str3 = this.f136255n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136248d) + C52418a.m58678e(3, this.f136249e);
            String str4 = this.f136250f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f136251g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int h = e + C52418a.m58681h(6, this.f136252h);
            C89349b bVar2 = this.f136253i;
            if (bVar2 != null) {
                h += C52418a.m58675b(7, bVar2);
            }
            int a = h + C52418a.m58674a(8, this.f136254j);
            String str6 = this.f136255n;
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
            C50022jq jqVar = objArr[1];
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
                        jqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    jqVar.f136248d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jqVar.f136249e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jqVar.f136250f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jqVar.f136251g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jqVar.f136252h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    jqVar.f136253i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    jqVar.f136254j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    jqVar.f136255n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
