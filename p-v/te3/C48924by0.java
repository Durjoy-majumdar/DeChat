package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.by0 */
public class C48924by0 extends C47465a {

    /* renamed from: d */
    public int f131380d;

    /* renamed from: e */
    public int f131381e;

    /* renamed from: f */
    public int f131382f;

    /* renamed from: g */
    public int f131383g;

    /* renamed from: h */
    public LinkedList<C50718oq3> f131384h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48924by0)) {
            return false;
        }
        C48924by0 by02 = (C48924by0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131380d), Integer.valueOf(by02.f131380d)) && C46238a.m51546a(Integer.valueOf(this.f131381e), Integer.valueOf(by02.f131381e)) && C46238a.m51546a(Integer.valueOf(this.f131382f), Integer.valueOf(by02.f131382f)) && C46238a.m51546a(Integer.valueOf(this.f131383g), Integer.valueOf(by02.f131383g)) && C46238a.m51546a(this.f131384h, by02.f131384h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131380d);
            aVar.mo74318e(2, this.f131381e);
            aVar.mo74318e(3, this.f131382f);
            aVar.mo74318e(4, this.f131383g);
            aVar.mo74320g(5, 8, this.f131384h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f131380d) + 0 + C52418a.m58678e(2, this.f131381e) + C52418a.m58678e(3, this.f131382f) + C52418a.m58678e(4, this.f131383g) + C52418a.m58680g(5, 8, this.f131384h);
        } else {
            if (i == 2) {
                this.f131384h.clear();
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
                C48924by0 by02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    by02.f131380d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    by02.f131381e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    by02.f131382f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    by02.f131383g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50718oq3 oq32 = new C50718oq3();
                        if (bArr != null && bArr.length > 0) {
                            oq32.parseFrom(bArr);
                        }
                        by02.f131384h.add(oq32);
                    }
                    return 0;
                }
            }
        }
    }
}
