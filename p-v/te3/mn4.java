package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mn4 extends C101820nt3 {

    /* renamed from: d */
    public String f138116d;

    /* renamed from: e */
    public int f138117e;

    /* renamed from: f */
    public boolean f138118f;

    /* renamed from: g */
    public int f138119g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mn4)) {
            return false;
        }
        mn4 mn4 = (mn4) aVar;
        return C46238a.m51546a(this.BaseRequest, mn4.BaseRequest) && C46238a.m51546a(this.f138116d, mn4.f138116d) && C46238a.m51546a(Integer.valueOf(this.f138117e), Integer.valueOf(mn4.f138117e)) && C46238a.m51546a(Boolean.valueOf(this.f138118f), Boolean.valueOf(mn4.f138118f)) && C46238a.m51546a(Integer.valueOf(this.f138119g), Integer.valueOf(mn4.f138119g));
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
            String str = this.f138116d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138117e);
            aVar.mo74314a(4, this.f138118f);
            aVar.mo74318e(5, this.f138119g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f138116d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f138117e) + C52418a.m58674a(4, this.f138118f) + C52418a.m58678e(5, this.f138119g);
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
            mn4 mn4 = objArr[1];
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
                    mn4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mn4.f138116d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mn4.f138117e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mn4.f138118f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mn4.f138119g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
