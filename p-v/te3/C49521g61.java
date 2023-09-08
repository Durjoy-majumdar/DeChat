package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g61 */
public class C49521g61 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49386f61> f133888d = new LinkedList<>();

    /* renamed from: e */
    public boolean f133889e;

    /* renamed from: f */
    public int f133890f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49521g61)) {
            return false;
        }
        C49521g61 g612 = (C49521g61) aVar;
        return C46238a.m51546a(this.f133888d, g612.f133888d) && C46238a.m51546a(Boolean.valueOf(this.f133889e), Boolean.valueOf(g612.f133889e)) && C46238a.m51546a(Integer.valueOf(this.f133890f), Integer.valueOf(g612.f133890f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f133888d);
            aVar.mo74314a(2, this.f133889e);
            aVar.mo74318e(3, this.f133890f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133888d) + 0 + C52418a.m58674a(2, this.f133889e) + C52418a.m58678e(3, this.f133890f);
        } else {
            if (i == 2) {
                this.f133888d.clear();
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
                C49521g61 g612 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49386f61 f612 = new C49386f61();
                        if (bArr != null && bArr.length > 0) {
                            f612.parseFrom(bArr);
                        }
                        g612.f133888d.add(f612);
                    }
                    return 0;
                } else if (intValue == 2) {
                    g612.f133889e = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    g612.f133890f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
