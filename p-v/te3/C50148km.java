package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.km */
public class C50148km extends C47465a {

    /* renamed from: d */
    public int f136882d;

    /* renamed from: e */
    public LinkedList<Integer> f136883e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50148km)) {
            return false;
        }
        C50148km kmVar = (C50148km) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136882d), Integer.valueOf(kmVar.f136882d)) && C46238a.m51546a(this.f136883e, kmVar.f136883e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136882d);
            aVar.mo74324k(2, 2, this.f136883e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136882d) + 0 + C52418a.m58684k(2, 2, this.f136883e);
        } else {
            if (i == 2) {
                this.f136883e.clear();
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
                C50148km kmVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    kmVar.f136882d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    byte[] bArr = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr, 0, bArr.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    kmVar.f136883e = linkedList;
                    return 0;
                }
            }
        }
    }
}
