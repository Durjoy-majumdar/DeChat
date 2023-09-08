package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sb0 */
public class C51219sb0 extends C101820nt3 {

    /* renamed from: d */
    public int f141414d;

    /* renamed from: e */
    public int f141415e;

    /* renamed from: f */
    public int f141416f;

    /* renamed from: g */
    public int f141417g;

    /* renamed from: h */
    public double f141418h;

    /* renamed from: i */
    public double f141419i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51219sb0)) {
            return false;
        }
        C51219sb0 sb02 = (C51219sb0) aVar;
        return C46238a.m51546a(this.BaseRequest, sb02.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141414d), Integer.valueOf(sb02.f141414d)) && C46238a.m51546a(Integer.valueOf(this.f141415e), Integer.valueOf(sb02.f141415e)) && C46238a.m51546a(Integer.valueOf(this.f141416f), Integer.valueOf(sb02.f141416f)) && C46238a.m51546a(Integer.valueOf(this.f141417g), Integer.valueOf(sb02.f141417g)) && C46238a.m51546a(Double.valueOf(this.f141418h), Double.valueOf(sb02.f141418h)) && C46238a.m51546a(Double.valueOf(this.f141419i), Double.valueOf(sb02.f141419i));
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
            aVar.mo74318e(2, this.f141414d);
            aVar.mo74318e(3, this.f141415e);
            aVar.mo74318e(4, this.f141416f);
            aVar.mo74318e(5, this.f141417g);
            aVar.mo74316c(6, this.f141418h);
            aVar.mo74316c(7, this.f141419i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141414d) + C52418a.m58678e(3, this.f141415e) + C52418a.m58678e(4, this.f141416f) + C52418a.m58678e(5, this.f141417g) + C52418a.m58676c(6, this.f141418h) + C52418a.m58676c(7, this.f141419i);
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
            C51219sb0 sb02 = objArr[1];
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
                        sb02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    sb02.f141414d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sb02.f141415e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sb02.f141416f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sb02.f141417g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sb02.f141418h = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    sb02.f141419i = aVar3.mo141627e(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
