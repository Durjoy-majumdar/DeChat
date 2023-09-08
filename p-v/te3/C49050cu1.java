package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cu1 */
public class C49050cu1 extends C47465a {

    /* renamed from: d */
    public int f131960d;

    /* renamed from: e */
    public LinkedList<C52234z90> f131961e = new LinkedList<>();

    /* renamed from: f */
    public int f131962f;

    /* renamed from: g */
    public int f131963g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49050cu1)) {
            return false;
        }
        C49050cu1 cu12 = (C49050cu1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131960d), Integer.valueOf(cu12.f131960d)) && C46238a.m51546a(this.f131961e, cu12.f131961e) && C46238a.m51546a(Integer.valueOf(this.f131962f), Integer.valueOf(cu12.f131962f)) && C46238a.m51546a(Integer.valueOf(this.f131963g), Integer.valueOf(cu12.f131963g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131960d);
            aVar.mo74320g(2, 8, this.f131961e);
            aVar.mo74318e(3, this.f131962f);
            aVar.mo74318e(4, this.f131963g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f131960d) + 0 + C52418a.m58680g(2, 8, this.f131961e) + C52418a.m58678e(3, this.f131962f) + C52418a.m58678e(4, this.f131963g);
        } else {
            if (i == 2) {
                this.f131961e.clear();
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
                C49050cu1 cu12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cu12.f131960d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52234z90 z902 = new C52234z90();
                        if (bArr != null && bArr.length > 0) {
                            z902.parseFrom(bArr);
                        }
                        cu12.f131961e.add(z902);
                    }
                    return 0;
                } else if (intValue == 3) {
                    cu12.f131962f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    cu12.f131963g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
