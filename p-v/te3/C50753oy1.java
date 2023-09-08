package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oy1 */
public class C50753oy1 extends C101820nt3 {

    /* renamed from: d */
    public int f139444d;

    /* renamed from: e */
    public int f139445e;

    /* renamed from: f */
    public double f139446f;

    /* renamed from: g */
    public double f139447g;

    /* renamed from: h */
    public int f139448h;

    /* renamed from: i */
    public int f139449i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50753oy1)) {
            return false;
        }
        C50753oy1 oy12 = (C50753oy1) aVar;
        return C46238a.m51546a(this.BaseRequest, oy12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139444d), Integer.valueOf(oy12.f139444d)) && C46238a.m51546a(Integer.valueOf(this.f139445e), Integer.valueOf(oy12.f139445e)) && C46238a.m51546a(Double.valueOf(this.f139446f), Double.valueOf(oy12.f139446f)) && C46238a.m51546a(Double.valueOf(this.f139447g), Double.valueOf(oy12.f139447g)) && C46238a.m51546a(Integer.valueOf(this.f139448h), Integer.valueOf(oy12.f139448h)) && C46238a.m51546a(Integer.valueOf(this.f139449i), Integer.valueOf(oy12.f139449i));
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
            aVar.mo74318e(2, this.f139444d);
            aVar.mo74318e(3, this.f139445e);
            aVar.mo74316c(4, this.f139446f);
            aVar.mo74316c(5, this.f139447g);
            aVar.mo74318e(6, this.f139448h);
            aVar.mo74318e(7, this.f139449i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f139444d) + C52418a.m58678e(3, this.f139445e) + C52418a.m58676c(4, this.f139446f) + C52418a.m58676c(5, this.f139447g) + C52418a.m58678e(6, this.f139448h) + C52418a.m58678e(7, this.f139449i);
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
            C50753oy1 oy12 = objArr[1];
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
                        oy12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    oy12.f139444d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oy12.f139445e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    oy12.f139446f = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    oy12.f139447g = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    oy12.f139448h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    oy12.f139449i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
