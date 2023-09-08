package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xu4 extends C101820nt3 {

    /* renamed from: d */
    public int f144983d;

    /* renamed from: e */
    public long f144984e;

    /* renamed from: f */
    public String f144985f;

    /* renamed from: g */
    public int f144986g;

    /* renamed from: h */
    public long f144987h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xu4)) {
            return false;
        }
        xu4 xu4 = (xu4) aVar;
        return C46238a.m51546a(this.BaseRequest, xu4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f144983d), Integer.valueOf(xu4.f144983d)) && C46238a.m51546a(Long.valueOf(this.f144984e), Long.valueOf(xu4.f144984e)) && C46238a.m51546a(this.f144985f, xu4.f144985f) && C46238a.m51546a(Integer.valueOf(this.f144986g), Integer.valueOf(xu4.f144986g)) && C46238a.m51546a(Long.valueOf(this.f144987h), Long.valueOf(xu4.f144987h));
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
            aVar.mo74318e(2, this.f144983d);
            aVar.mo74321h(3, this.f144984e);
            String str = this.f144985f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f144986g);
            aVar.mo74321h(6, this.f144987h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f144983d) + C52418a.m58681h(3, this.f144984e);
            String str2 = this.f144985f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f144986g) + C52418a.m58681h(6, this.f144987h);
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
            xu4 xu4 = objArr[1];
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
                        xu4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xu4.f144983d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    xu4.f144984e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    xu4.f144985f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xu4.f144986g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xu4.f144987h = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
