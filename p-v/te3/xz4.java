package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xz4 extends C101820nt3 {

    /* renamed from: d */
    public int f145044d;

    /* renamed from: e */
    public String f145045e;

    /* renamed from: f */
    public int f145046f;

    /* renamed from: g */
    public int f145047g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xz4)) {
            return false;
        }
        xz4 xz4 = (xz4) aVar;
        return C46238a.m51546a(this.BaseRequest, xz4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f145044d), Integer.valueOf(xz4.f145044d)) && C46238a.m51546a(this.f145045e, xz4.f145045e) && C46238a.m51546a(Integer.valueOf(this.f145046f), Integer.valueOf(xz4.f145046f)) && C46238a.m51546a(Integer.valueOf(this.f145047g), Integer.valueOf(xz4.f145047g));
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
            aVar.mo74318e(2, this.f145044d);
            String str = this.f145045e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f145046f);
            aVar.mo74318e(5, this.f145047g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145044d);
            String str2 = this.f145045e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f145046f) + C52418a.m58678e(5, this.f145047g);
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
            xz4 xz4 = objArr[1];
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
                    xz4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xz4.f145044d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xz4.f145045e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                xz4.f145046f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xz4.f145047g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
