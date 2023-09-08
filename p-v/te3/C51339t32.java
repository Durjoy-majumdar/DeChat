package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t32 */
public class C51339t32 extends C101820nt3 {

    /* renamed from: d */
    public int f141922d;

    /* renamed from: e */
    public int f141923e;

    /* renamed from: f */
    public double f141924f;

    /* renamed from: g */
    public double f141925g;

    /* renamed from: h */
    public int f141926h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51339t32)) {
            return false;
        }
        C51339t32 t322 = (C51339t32) aVar;
        return C46238a.m51546a(this.BaseRequest, t322.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141922d), Integer.valueOf(t322.f141922d)) && C46238a.m51546a(Integer.valueOf(this.f141923e), Integer.valueOf(t322.f141923e)) && C46238a.m51546a(Double.valueOf(this.f141924f), Double.valueOf(t322.f141924f)) && C46238a.m51546a(Double.valueOf(this.f141925g), Double.valueOf(t322.f141925g)) && C46238a.m51546a(Integer.valueOf(this.f141926h), Integer.valueOf(t322.f141926h));
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
            aVar.mo74318e(2, this.f141922d);
            aVar.mo74318e(3, this.f141923e);
            aVar.mo74316c(4, this.f141924f);
            aVar.mo74316c(5, this.f141925g);
            aVar.mo74318e(6, this.f141926h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141922d) + C52418a.m58678e(3, this.f141923e) + C52418a.m58676c(4, this.f141924f) + C52418a.m58676c(5, this.f141925g) + C52418a.m58678e(6, this.f141926h);
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
            C51339t32 t322 = objArr[1];
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
                        t322.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    t322.f141922d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    t322.f141923e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t322.f141924f = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    t322.f141925g = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    t322.f141926h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
