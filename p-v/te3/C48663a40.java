package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a40 */
public class C48663a40 extends C101820nt3 {

    /* renamed from: d */
    public String f130300d;

    /* renamed from: e */
    public String f130301e;

    /* renamed from: f */
    public int f130302f;

    /* renamed from: g */
    public int f130303g;

    /* renamed from: h */
    public int f130304h;

    /* renamed from: i */
    public int f130305i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48663a40)) {
            return false;
        }
        C48663a40 a402 = (C48663a40) aVar;
        return C46238a.m51546a(this.BaseRequest, a402.BaseRequest) && C46238a.m51546a(this.f130300d, a402.f130300d) && C46238a.m51546a(this.f130301e, a402.f130301e) && C46238a.m51546a(Integer.valueOf(this.f130302f), Integer.valueOf(a402.f130302f)) && C46238a.m51546a(Integer.valueOf(this.f130303g), Integer.valueOf(a402.f130303g)) && C46238a.m51546a(Integer.valueOf(this.f130304h), Integer.valueOf(a402.f130304h)) && C46238a.m51546a(Integer.valueOf(this.f130305i), Integer.valueOf(a402.f130305i));
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
            String str = this.f130300d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f130301e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f130302f);
            aVar.mo74318e(5, this.f130303g);
            aVar.mo74318e(6, this.f130304h);
            aVar.mo74318e(7, this.f130305i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f130300d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f130301e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f130302f) + C52418a.m58678e(5, this.f130303g) + C52418a.m58678e(6, this.f130304h) + C52418a.m58678e(7, this.f130305i);
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
            C48663a40 a402 = objArr[1];
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
                        a402.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    a402.f130300d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a402.f130301e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a402.f130302f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a402.f130303g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a402.f130304h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a402.f130305i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
