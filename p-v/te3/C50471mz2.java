package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mz2 */
public class C50471mz2 extends C101820nt3 {

    /* renamed from: d */
    public String f138293d;

    /* renamed from: e */
    public String f138294e;

    /* renamed from: f */
    public int f138295f;

    /* renamed from: g */
    public int f138296g;

    /* renamed from: h */
    public int f138297h;

    /* renamed from: i */
    public int f138298i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50471mz2)) {
            return false;
        }
        C50471mz2 mz22 = (C50471mz2) aVar;
        return C46238a.m51546a(this.BaseRequest, mz22.BaseRequest) && C46238a.m51546a(this.f138293d, mz22.f138293d) && C46238a.m51546a(this.f138294e, mz22.f138294e) && C46238a.m51546a(Integer.valueOf(this.f138295f), Integer.valueOf(mz22.f138295f)) && C46238a.m51546a(Integer.valueOf(this.f138296g), Integer.valueOf(mz22.f138296g)) && C46238a.m51546a(Integer.valueOf(this.f138297h), Integer.valueOf(mz22.f138297h)) && C46238a.m51546a(Integer.valueOf(this.f138298i), Integer.valueOf(mz22.f138298i));
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
            String str = this.f138293d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138294e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f138295f);
            aVar.mo74318e(5, this.f138296g);
            aVar.mo74318e(6, this.f138297h);
            aVar.mo74318e(7, this.f138298i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f138293d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138294e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f138295f) + C52418a.m58678e(5, this.f138296g) + C52418a.m58678e(6, this.f138297h) + C52418a.m58678e(7, this.f138298i);
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
            C50471mz2 mz22 = objArr[1];
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
                        mz22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    mz22.f138293d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mz22.f138294e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mz22.f138295f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mz22.f138296g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mz22.f138297h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mz22.f138298i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
