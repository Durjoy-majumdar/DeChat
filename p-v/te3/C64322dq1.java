package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dq1 */
public class C64322dq1 extends C101820nt3 {

    /* renamed from: d */
    public String f182797d;

    /* renamed from: e */
    public int f182798e;

    /* renamed from: f */
    public int f182799f;

    /* renamed from: g */
    public String f182800g;

    /* renamed from: h */
    public int f182801h;

    /* renamed from: i */
    public int f182802i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64322dq1)) {
            return false;
        }
        C64322dq1 dq12 = (C64322dq1) aVar;
        return C46238a.m51546a(this.BaseRequest, dq12.BaseRequest) && C46238a.m51546a(this.f182797d, dq12.f182797d) && C46238a.m51546a(Integer.valueOf(this.f182798e), Integer.valueOf(dq12.f182798e)) && C46238a.m51546a(Integer.valueOf(this.f182799f), Integer.valueOf(dq12.f182799f)) && C46238a.m51546a(this.f182800g, dq12.f182800g) && C46238a.m51546a(Integer.valueOf(this.f182801h), Integer.valueOf(dq12.f182801h)) && C46238a.m51546a(Integer.valueOf(this.f182802i), Integer.valueOf(dq12.f182802i));
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
            String str = this.f182797d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f182798e);
            aVar.mo74318e(4, this.f182799f);
            String str2 = this.f182800g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f182801h);
            aVar.mo74318e(7, this.f182802i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f182797d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f182798e) + C52418a.m58678e(4, this.f182799f);
            String str4 = this.f182800g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f182801h) + C52418a.m58678e(7, this.f182802i);
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
            C64322dq1 dq12 = objArr[1];
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
                        dq12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dq12.f182797d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dq12.f182798e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dq12.f182799f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dq12.f182800g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dq12.f182801h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dq12.f182802i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
