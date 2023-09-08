package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s50 */
public class C51200s50 extends C101820nt3 {

    /* renamed from: d */
    public int f141329d;

    /* renamed from: e */
    public int f141330e;

    /* renamed from: f */
    public int f141331f;

    /* renamed from: g */
    public int f141332g;

    /* renamed from: h */
    public int f141333h;

    /* renamed from: i */
    public long f141334i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51200s50)) {
            return false;
        }
        C51200s50 s502 = (C51200s50) aVar;
        return C46238a.m51546a(this.BaseRequest, s502.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141329d), Integer.valueOf(s502.f141329d)) && C46238a.m51546a(Integer.valueOf(this.f141330e), Integer.valueOf(s502.f141330e)) && C46238a.m51546a(Integer.valueOf(this.f141331f), Integer.valueOf(s502.f141331f)) && C46238a.m51546a(Integer.valueOf(this.f141332g), Integer.valueOf(s502.f141332g)) && C46238a.m51546a(Integer.valueOf(this.f141333h), Integer.valueOf(s502.f141333h)) && C46238a.m51546a(Long.valueOf(this.f141334i), Long.valueOf(s502.f141334i));
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
            aVar.mo74318e(2, this.f141329d);
            aVar.mo74318e(3, this.f141330e);
            aVar.mo74318e(4, this.f141331f);
            aVar.mo74318e(5, this.f141332g);
            aVar.mo74318e(6, this.f141333h);
            aVar.mo74321h(7, this.f141334i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141329d) + C52418a.m58678e(3, this.f141330e) + C52418a.m58678e(4, this.f141331f) + C52418a.m58678e(5, this.f141332g) + C52418a.m58678e(6, this.f141333h) + C52418a.m58681h(7, this.f141334i);
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
            C51200s50 s502 = objArr[1];
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
                        s502.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    s502.f141329d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    s502.f141330e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    s502.f141331f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    s502.f141332g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s502.f141333h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    s502.f141334i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
