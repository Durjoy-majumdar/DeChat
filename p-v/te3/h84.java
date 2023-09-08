package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h84 extends C47465a {

    /* renamed from: d */
    public int f134504d;

    /* renamed from: e */
    public LinkedList<j74> f134505e = new LinkedList<>();

    /* renamed from: f */
    public int f134506f;

    /* renamed from: g */
    public int f134507g;

    /* renamed from: h */
    public int f134508h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h84)) {
            return false;
        }
        h84 h84 = (h84) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134504d), Integer.valueOf(h84.f134504d)) && C46238a.m51546a(this.f134505e, h84.f134505e) && C46238a.m51546a(Integer.valueOf(this.f134506f), Integer.valueOf(h84.f134506f)) && C46238a.m51546a(Integer.valueOf(this.f134507g), Integer.valueOf(h84.f134507g)) && C46238a.m51546a(Integer.valueOf(this.f134508h), Integer.valueOf(h84.f134508h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134504d);
            aVar.mo74320g(2, 8, this.f134505e);
            aVar.mo74318e(3, this.f134506f);
            aVar.mo74318e(4, this.f134507g);
            aVar.mo74318e(5, this.f134508h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f134504d) + 0 + C52418a.m58680g(2, 8, this.f134505e) + C52418a.m58678e(3, this.f134506f) + C52418a.m58678e(4, this.f134507g) + C52418a.m58678e(5, this.f134508h);
        } else {
            if (i == 2) {
                this.f134505e.clear();
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
                h84 h84 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    h84.f134504d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        j74 j74 = new j74();
                        if (bArr != null && bArr.length > 0) {
                            j74.parseFrom(bArr);
                        }
                        h84.f134505e.add(j74);
                    }
                    return 0;
                } else if (intValue == 3) {
                    h84.f134506f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    h84.f134507g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    h84.f134508h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
