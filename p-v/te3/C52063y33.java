package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y33 */
public class C52063y33 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49581gn> f145097d = new LinkedList<>();

    /* renamed from: e */
    public int f145098e;

    /* renamed from: f */
    public int f145099f;

    /* renamed from: g */
    public int f145100g;

    /* renamed from: h */
    public long f145101h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52063y33)) {
            return false;
        }
        C52063y33 y332 = (C52063y33) aVar;
        return C46238a.m51546a(this.f145097d, y332.f145097d) && C46238a.m51546a(Integer.valueOf(this.f145098e), Integer.valueOf(y332.f145098e)) && C46238a.m51546a(Integer.valueOf(this.f145099f), Integer.valueOf(y332.f145099f)) && C46238a.m51546a(Integer.valueOf(this.f145100g), Integer.valueOf(y332.f145100g)) && C46238a.m51546a(Long.valueOf(this.f145101h), Long.valueOf(y332.f145101h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f145097d);
            aVar.mo74318e(2, this.f145098e);
            aVar.mo74318e(3, this.f145099f);
            aVar.mo74318e(4, this.f145100g);
            aVar.mo74321h(5, this.f145101h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f145097d) + 0 + C52418a.m58678e(2, this.f145098e) + C52418a.m58678e(3, this.f145099f) + C52418a.m58678e(4, this.f145100g) + C52418a.m58681h(5, this.f145101h);
        } else {
            if (i == 2) {
                this.f145097d.clear();
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
                C52063y33 y332 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49581gn gnVar = new C49581gn();
                        if (bArr != null && bArr.length > 0) {
                            gnVar.parseFrom(bArr);
                        }
                        y332.f145097d.add(gnVar);
                    }
                    return 0;
                } else if (intValue == 2) {
                    y332.f145098e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    y332.f145099f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    y332.f145100g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    y332.f145101h = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
