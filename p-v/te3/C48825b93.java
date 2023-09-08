package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.b93 */
public class C48825b93 extends C47465a {

    /* renamed from: d */
    public int f131019d;

    /* renamed from: e */
    public LinkedList<Integer> f131020e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C52085y83> f131021f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48825b93)) {
            return false;
        }
        C48825b93 b932 = (C48825b93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131019d), Integer.valueOf(b932.f131019d)) && C46238a.m51546a(this.f131020e, b932.f131020e) && C46238a.m51546a(this.f131021f, b932.f131021f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131019d);
            aVar.mo74324k(2, 2, this.f131020e);
            aVar.mo74320g(3, 8, this.f131021f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f131019d) + 0 + C52418a.m58684k(2, 2, this.f131020e) + C52418a.m58680g(3, 8, this.f131021f);
        } else {
            if (i == 2) {
                this.f131020e.clear();
                this.f131021f.clear();
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
                C48825b93 b932 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    b932.f131019d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    byte[] bArr = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr, 0, bArr.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    b932.f131020e = linkedList;
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr2 = j.get(i2);
                        C52085y83 y832 = new C52085y83();
                        if (bArr2 != null && bArr2.length > 0) {
                            y832.parseFrom(bArr2);
                        }
                        b932.f131021f.add(y832);
                    }
                    return 0;
                }
            }
        }
    }
}
