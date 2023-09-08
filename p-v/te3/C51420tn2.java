package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tn2 */
public class C51420tn2 extends C47465a {

    /* renamed from: d */
    public int f142298d;

    /* renamed from: e */
    public LinkedList<C51857wn2> f142299e = new LinkedList<>();

    /* renamed from: f */
    public int f142300f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51420tn2)) {
            return false;
        }
        C51420tn2 tn22 = (C51420tn2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142298d), Integer.valueOf(tn22.f142298d)) && C46238a.m51546a(this.f142299e, tn22.f142299e) && C46238a.m51546a(Integer.valueOf(this.f142300f), Integer.valueOf(tn22.f142300f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142298d);
            aVar.mo74320g(2, 8, this.f142299e);
            aVar.mo74318e(3, this.f142300f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142298d) + 0 + C52418a.m58680g(2, 8, this.f142299e) + C52418a.m58678e(3, this.f142300f);
        } else {
            if (i == 2) {
                this.f142299e.clear();
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
                C51420tn2 tn22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tn22.f142298d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51857wn2 wn22 = new C51857wn2();
                        if (bArr != null && bArr.length > 0) {
                            wn22.parseFrom(bArr);
                        }
                        tn22.f142299e.add(wn22);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    tn22.f142300f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
