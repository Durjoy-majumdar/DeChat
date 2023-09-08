package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class un4 extends C101820nt3 {

    /* renamed from: d */
    public double f142968d;

    /* renamed from: e */
    public double f142969e;

    /* renamed from: f */
    public double f142970f;

    /* renamed from: g */
    public double f142971g;

    /* renamed from: h */
    public double f142972h;

    /* renamed from: i */
    public int f142973i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof un4)) {
            return false;
        }
        un4 un4 = (un4) aVar;
        return C46238a.m51546a(this.BaseRequest, un4.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f142968d), Double.valueOf(un4.f142968d)) && C46238a.m51546a(Double.valueOf(this.f142969e), Double.valueOf(un4.f142969e)) && C46238a.m51546a(Double.valueOf(this.f142970f), Double.valueOf(un4.f142970f)) && C46238a.m51546a(Double.valueOf(this.f142971g), Double.valueOf(un4.f142971g)) && C46238a.m51546a(Double.valueOf(this.f142972h), Double.valueOf(un4.f142972h)) && C46238a.m51546a(Integer.valueOf(this.f142973i), Integer.valueOf(un4.f142973i));
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
            aVar.mo74316c(2, this.f142968d);
            aVar.mo74316c(3, this.f142969e);
            aVar.mo74316c(4, this.f142970f);
            aVar.mo74316c(5, this.f142971g);
            aVar.mo74316c(6, this.f142972h);
            aVar.mo74318e(7, this.f142973i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58676c(2, this.f142968d) + C52418a.m58676c(3, this.f142969e) + C52418a.m58676c(4, this.f142970f) + C52418a.m58676c(5, this.f142971g) + C52418a.m58676c(6, this.f142972h) + C52418a.m58678e(7, this.f142973i);
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
            un4 un4 = objArr[1];
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
                        un4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    un4.f142968d = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    un4.f142969e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    un4.f142970f = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    un4.f142971g = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    un4.f142972h = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    un4.f142973i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
