package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lj */
public class C50270lj extends C47465a {

    /* renamed from: d */
    public int f137448d;

    /* renamed from: e */
    public int f137449e;

    /* renamed from: f */
    public int f137450f;

    /* renamed from: g */
    public LinkedList<C50136kj> f137451g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C50136kj> f137452h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50270lj)) {
            return false;
        }
        C50270lj ljVar = (C50270lj) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137448d), Integer.valueOf(ljVar.f137448d)) && C46238a.m51546a(Integer.valueOf(this.f137449e), Integer.valueOf(ljVar.f137449e)) && C46238a.m51546a(Integer.valueOf(this.f137450f), Integer.valueOf(ljVar.f137450f)) && C46238a.m51546a(this.f137451g, ljVar.f137451g) && C46238a.m51546a(this.f137452h, ljVar.f137452h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137448d);
            aVar.mo74318e(2, this.f137449e);
            aVar.mo74318e(5, this.f137450f);
            aVar.mo74320g(3, 8, this.f137451g);
            aVar.mo74320g(4, 8, this.f137452h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f137448d) + 0 + C52418a.m58678e(2, this.f137449e) + C52418a.m58678e(5, this.f137450f) + C52418a.m58680g(3, 8, this.f137451g) + C52418a.m58680g(4, 8, this.f137452h);
        } else {
            if (i == 2) {
                this.f137451g.clear();
                this.f137452h.clear();
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
                C50270lj ljVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ljVar.f137448d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ljVar.f137449e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50136kj kjVar = new C50136kj();
                        if (bArr != null && bArr.length > 0) {
                            kjVar.parseFrom(bArr);
                        }
                        ljVar.f137451g.add(kjVar);
                    }
                    return 0;
                } else if (intValue == 4) {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C50136kj kjVar2 = new C50136kj();
                        if (bArr2 != null && bArr2.length > 0) {
                            kjVar2.parseFrom(bArr2);
                        }
                        ljVar.f137452h.add(kjVar2);
                    }
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    ljVar.f137450f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
