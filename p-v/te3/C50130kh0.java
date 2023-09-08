package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kh0 */
public class C50130kh0 extends C101820nt3 {

    /* renamed from: d */
    public long f136785d;

    /* renamed from: e */
    public String f136786e;

    /* renamed from: f */
    public long f136787f;

    /* renamed from: g */
    public String f136788g;

    /* renamed from: h */
    public int f136789h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50130kh0)) {
            return false;
        }
        C50130kh0 kh02 = (C50130kh0) aVar;
        return C46238a.m51546a(this.BaseRequest, kh02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f136785d), Long.valueOf(kh02.f136785d)) && C46238a.m51546a(this.f136786e, kh02.f136786e) && C46238a.m51546a(Long.valueOf(this.f136787f), Long.valueOf(kh02.f136787f)) && C46238a.m51546a(this.f136788g, kh02.f136788g) && C46238a.m51546a(Integer.valueOf(this.f136789h), Integer.valueOf(kh02.f136789h));
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
            aVar.mo74321h(2, this.f136785d);
            String str = this.f136786e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f136787f);
            String str2 = this.f136788g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f136789h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f136785d);
            String str3 = this.f136786e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int h2 = h + C52418a.m58681h(4, this.f136787f);
            String str4 = this.f136788g;
            if (str4 != null) {
                h2 += C52418a.m58683j(5, str4);
            }
            return h2 + C52418a.m58678e(6, this.f136789h);
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
            C50130kh0 kh02 = objArr[1];
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
                        kh02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    kh02.f136785d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    kh02.f136786e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kh02.f136787f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    kh02.f136788g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kh02.f136789h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
