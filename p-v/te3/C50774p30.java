package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p30 */
public class C50774p30 extends C101820nt3 {

    /* renamed from: d */
    public int f139541d;

    /* renamed from: e */
    public String f139542e;

    /* renamed from: f */
    public int f139543f;

    /* renamed from: g */
    public int f139544g;

    /* renamed from: h */
    public int f139545h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50774p30)) {
            return false;
        }
        C50774p30 p302 = (C50774p30) aVar;
        return C46238a.m51546a(this.BaseRequest, p302.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139541d), Integer.valueOf(p302.f139541d)) && C46238a.m51546a(this.f139542e, p302.f139542e) && C46238a.m51546a(Integer.valueOf(this.f139543f), Integer.valueOf(p302.f139543f)) && C46238a.m51546a(Integer.valueOf(this.f139544g), Integer.valueOf(p302.f139544g)) && C46238a.m51546a(Integer.valueOf(this.f139545h), Integer.valueOf(p302.f139545h));
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
            aVar.mo74318e(2, this.f139541d);
            String str = this.f139542e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f139543f);
            aVar.mo74318e(5, this.f139544g);
            aVar.mo74318e(6, this.f139545h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139541d);
            String str2 = this.f139542e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f139543f) + C52418a.m58678e(5, this.f139544g) + C52418a.m58678e(6, this.f139545h);
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
            C50774p30 p302 = objArr[1];
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
                        p302.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    p302.f139541d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    p302.f139542e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p302.f139543f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    p302.f139544g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    p302.f139545h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
