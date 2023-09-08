package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cx1 */
public class C49061cx1 extends C101820nt3 {

    /* renamed from: d */
    public String f132009d;

    /* renamed from: e */
    public double f132010e;

    /* renamed from: f */
    public double f132011f;

    /* renamed from: g */
    public long f132012g;

    /* renamed from: h */
    public int f132013h;

    /* renamed from: i */
    public int f132014i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49061cx1)) {
            return false;
        }
        C49061cx1 cx12 = (C49061cx1) aVar;
        return C46238a.m51546a(this.BaseRequest, cx12.BaseRequest) && C46238a.m51546a(this.f132009d, cx12.f132009d) && C46238a.m51546a(Double.valueOf(this.f132010e), Double.valueOf(cx12.f132010e)) && C46238a.m51546a(Double.valueOf(this.f132011f), Double.valueOf(cx12.f132011f)) && C46238a.m51546a(Long.valueOf(this.f132012g), Long.valueOf(cx12.f132012g)) && C46238a.m51546a(Integer.valueOf(this.f132013h), Integer.valueOf(cx12.f132013h)) && C46238a.m51546a(Integer.valueOf(this.f132014i), Integer.valueOf(cx12.f132014i));
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
            String str = this.f132009d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74316c(3, this.f132010e);
            aVar.mo74316c(4, this.f132011f);
            aVar.mo74321h(5, this.f132012g);
            aVar.mo74318e(6, this.f132013h);
            aVar.mo74318e(7, this.f132014i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f132009d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58676c(3, this.f132010e) + C52418a.m58676c(4, this.f132011f) + C52418a.m58681h(5, this.f132012g) + C52418a.m58678e(6, this.f132013h) + C52418a.m58678e(7, this.f132014i);
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
            C49061cx1 cx12 = objArr[1];
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
                        cx12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    cx12.f132009d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cx12.f132010e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    cx12.f132011f = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    cx12.f132012g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    cx12.f132013h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cx12.f132014i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
