package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x32 */
public class C51919x32 extends C101820nt3 {

    /* renamed from: d */
    public int f144425d;

    /* renamed from: e */
    public int f144426e;

    /* renamed from: f */
    public double f144427f;

    /* renamed from: g */
    public double f144428g;

    /* renamed from: h */
    public int f144429h;

    /* renamed from: i */
    public int f144430i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51919x32)) {
            return false;
        }
        C51919x32 x322 = (C51919x32) aVar;
        return C46238a.m51546a(this.BaseRequest, x322.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f144425d), Integer.valueOf(x322.f144425d)) && C46238a.m51546a(Integer.valueOf(this.f144426e), Integer.valueOf(x322.f144426e)) && C46238a.m51546a(Double.valueOf(this.f144427f), Double.valueOf(x322.f144427f)) && C46238a.m51546a(Double.valueOf(this.f144428g), Double.valueOf(x322.f144428g)) && C46238a.m51546a(Integer.valueOf(this.f144429h), Integer.valueOf(x322.f144429h)) && C46238a.m51546a(Integer.valueOf(this.f144430i), Integer.valueOf(x322.f144430i));
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
            aVar.mo74318e(2, this.f144425d);
            aVar.mo74318e(3, this.f144426e);
            aVar.mo74316c(4, this.f144427f);
            aVar.mo74316c(5, this.f144428g);
            aVar.mo74318e(6, this.f144429h);
            aVar.mo74318e(7, this.f144430i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f144425d) + C52418a.m58678e(3, this.f144426e) + C52418a.m58676c(4, this.f144427f) + C52418a.m58676c(5, this.f144428g) + C52418a.m58678e(6, this.f144429h) + C52418a.m58678e(7, this.f144430i);
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
            C51919x32 x322 = objArr[1];
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
                        x322.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    x322.f144425d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    x322.f144426e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    x322.f144427f = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    x322.f144428g = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    x322.f144429h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    x322.f144430i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
