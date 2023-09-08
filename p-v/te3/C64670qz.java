package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qz */
public class C64670qz extends C47465a {

    /* renamed from: d */
    public long f185097d;

    /* renamed from: e */
    public long f185098e;

    /* renamed from: f */
    public LinkedList<C64643pz> f185099f = new LinkedList<>();

    /* renamed from: g */
    public int f185100g;

    /* renamed from: h */
    public int f185101h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64670qz)) {
            return false;
        }
        C64670qz qzVar = (C64670qz) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185097d), Long.valueOf(qzVar.f185097d)) && C46238a.m51546a(Long.valueOf(this.f185098e), Long.valueOf(qzVar.f185098e)) && C46238a.m51546a(this.f185099f, qzVar.f185099f) && C46238a.m51546a(Integer.valueOf(this.f185100g), Integer.valueOf(qzVar.f185100g)) && C46238a.m51546a(Integer.valueOf(this.f185101h), Integer.valueOf(qzVar.f185101h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185097d);
            aVar.mo74321h(2, this.f185098e);
            aVar.mo74320g(3, 8, this.f185099f);
            aVar.mo74318e(4, this.f185100g);
            aVar.mo74318e(5, this.f185101h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f185097d) + 0 + C52418a.m58681h(2, this.f185098e) + C52418a.m58680g(3, 8, this.f185099f) + C52418a.m58678e(4, this.f185100g) + C52418a.m58678e(5, this.f185101h);
        } else {
            if (i == 2) {
                this.f185099f.clear();
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
                C64670qz qzVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    qzVar.f185097d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    qzVar.f185098e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64643pz pzVar = new C64643pz();
                        if (bArr != null && bArr.length > 0) {
                            pzVar.parseFrom(bArr);
                        }
                        qzVar.f185099f.add(pzVar);
                    }
                    return 0;
                } else if (intValue == 4) {
                    qzVar.f185100g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    qzVar.f185101h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
