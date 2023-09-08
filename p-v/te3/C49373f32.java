package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f32 */
public class C49373f32 extends C101820nt3 {

    /* renamed from: d */
    public float f133264d;

    /* renamed from: e */
    public float f133265e;

    /* renamed from: f */
    public int f133266f;

    /* renamed from: g */
    public int f133267g;

    /* renamed from: h */
    public String f133268h;

    /* renamed from: i */
    public int f133269i;

    /* renamed from: j */
    public int f133270j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49373f32)) {
            return false;
        }
        C49373f32 f322 = (C49373f32) aVar;
        return C46238a.m51546a(this.BaseRequest, f322.BaseRequest) && C46238a.m51546a(Float.valueOf(this.f133264d), Float.valueOf(f322.f133264d)) && C46238a.m51546a(Float.valueOf(this.f133265e), Float.valueOf(f322.f133265e)) && C46238a.m51546a(Integer.valueOf(this.f133266f), Integer.valueOf(f322.f133266f)) && C46238a.m51546a(Integer.valueOf(this.f133267g), Integer.valueOf(f322.f133267g)) && C46238a.m51546a(this.f133268h, f322.f133268h) && C46238a.m51546a(Integer.valueOf(this.f133269i), Integer.valueOf(f322.f133269i)) && C46238a.m51546a(Integer.valueOf(this.f133270j), Integer.valueOf(f322.f133270j));
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
            aVar.mo74317d(2, this.f133264d);
            aVar.mo74317d(3, this.f133265e);
            aVar.mo74318e(4, this.f133266f);
            aVar.mo74318e(5, this.f133267g);
            String str = this.f133268h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f133269i);
            aVar.mo74318e(8, this.f133270j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int d = i2 + C52418a.m58677d(2, this.f133264d) + C52418a.m58677d(3, this.f133265e) + C52418a.m58678e(4, this.f133266f) + C52418a.m58678e(5, this.f133267g);
            String str2 = this.f133268h;
            if (str2 != null) {
                d += C52418a.m58683j(6, str2);
            }
            return d + C52418a.m58678e(7, this.f133269i) + C52418a.m58678e(8, this.f133270j);
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
            C49373f32 f322 = objArr[1];
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
                        f322.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    f322.f133264d = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    f322.f133265e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    f322.f133266f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    f322.f133267g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    f322.f133268h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    f322.f133269i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    f322.f133270j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
